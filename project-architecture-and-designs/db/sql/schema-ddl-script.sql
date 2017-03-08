CREATE TABLE Address
(
  Address_Id INT NOT NULL,
  Shope_Number VARCHAR(10),
  Street VARCHAR(40),
  Market VARCHAR(30),
  City VARCHAR(20),
  District VARCHAR(20) NOT NULL,
  State VARCHAR(20) NOT NULL,
  Pincode VARCHAR(6),
  PRIMARY KEY (Address_Id)
);

CREATE TABLE Supplier
(
  Supplier_Id INT NOT NULL,
  Supplier_Name VARCHAR(20) NOT NULL,
  Supplier_contacts VARCHAR(40),
  Bank_1 VARCHAR(20),
  Account_Number_1 VARCHAR(20),
  Bank_2 VARCHAR(20),
  Account_Number_2 VARCHAR(20),
  Address_Id INT NOT NULL,
  PRIMARY KEY (Supplier_Id),
  FOREIGN KEY (Address_Id) REFERENCES Address(Address_Id)
);

CREATE TABLE Transport
(
  Transport_Name VARCHAR(30) NOT NULL,
  Transport_Id INT NOT NULL,
  Transport_Contacts VARCHAR(40) NOT NULL,
  Address_Id INT NOT NULL,
  PRIMARY KEY (Transport_Id),
  FOREIGN KEY (Address_Id) REFERENCES Address(Address_Id)
);

CREATE TABLE Customer
(
  Customer_Id INT NOT NULL,
  Customer_Name VARCHAR(50) NOT NULL,
  Customer_TIN VARCHAR(15),
  Customer_Contacts VARCHAR(40),
  Address_Id INT NOT NULL,
  PRIMARY KEY (Customer_Id),
  FOREIGN KEY (Address_Id) REFERENCES Address(Address_Id)
);

CREATE TABLE Invoice
(
  Invoice_Id INT NOT NULL,
  Invoice_Number VARCHAR NOT NULL,
  Invoice_Amount INT NOT NULL,
  Invoice_Discount FLOAT,
  Invoice_Payment_Status VARCHAR(30) NOT NULL,
  Invoice_Date DATE NOT NULL,
  Transport_Id INT NOT NULL,
  Supplier_Id INT NOT NULL,
  Customer_Id INT NOT NULL,
  PRIMARY KEY (Invoice_Id),
  FOREIGN KEY (Transport_Id) REFERENCES Transport(Transport_Id),
  FOREIGN KEY (Supplier_Id) REFERENCES Supplier(Supplier_Id),
  FOREIGN KEY (Customer_Id) REFERENCES Customer(Customer_Id)
);

CREATE TABLE Payment_Record
(
  Boucher_Id INT NOT NULL,
  Payment_Date DATE NOT NULL,
  BankName VARCHAR NOT NULL,
  Amount VARCHAR NOT NULL,
  Cheque_Number VARCHAR(20),
  Supplier_Id INT NOT NULL,
  Customer_Id INT NOT NULL,
  PRIMARY KEY (Boucher_Id),
  FOREIGN KEY (Supplier_Id) REFERENCES Supplier(Supplier_Id),
  FOREIGN KEY (Customer_Id) REFERENCES Customer(Customer_Id)
);

CREATE TABLE Invoice_Payment_Record
(
  Payment_Status VARCHAR NOT NULL,
  Invoice_Id INT NOT NULL,
  Boucher_Id INT NOT NULL,
  FOREIGN KEY (Invoice_Id) REFERENCES Invoice(Invoice_Id),
  FOREIGN KEY (Boucher_Id) REFERENCES Payment_Record(Boucher_Id)
);

CREATE TABLE Order
(
  Order_Id INT NOT NULL,
  Date DATE NOT NULL,
  Pyament_Rotation_Period INT,
  Discount_Percentage FLOAT,
  Special_Offer VARCHAR(30),
  Order_Remark VARCHAR(30),
  Total_Quantity INT,
  Customer_Id INT NOT NULL,
  Supplier_Id INT NOT NULL,
  Transport_Id INT,
  PRIMARY KEY (Order_Id),
  FOREIGN KEY (Customer_Id) REFERENCES Customer(Customer_Id),
  FOREIGN KEY (Supplier_Id) REFERENCES Supplier(Supplier_Id),
  FOREIGN KEY (Transport_Id) REFERENCES Transport(Transport_Id)
);

CREATE TABLE Item
(
  Item_Id INT NOT NULL,
  Item_Name VARCHAR(20) NOT NULL,
  Item_Rate VARCHAR(20) NOT NULL,
  Item_Cut VARCHAR(10) NOT NULL,
  Item_Quanity INT NOT NULL,
  Item_Offer VARCHAR(30) NOT NULL,
  Item_Scheme VARCHAR(50) NOT NULL,
  Item_Remark VARCHAR NOT NULL,
  Order_Id INT NOT NULL,
  PRIMARY KEY (Item_Id),
  FOREIGN KEY (Order_Id) REFERENCES Order(Order_Id)
);

CREATE TABLE Order_Invoice
(
   INT NOT NULL,
  Order_Id INT NOT NULL,
  Invoice_Id INT NOT NULL,
  FOREIGN KEY (Order_Id) REFERENCES Order(Order_Id),
  FOREIGN KEY (Invoice_Id) REFERENCES Invoice(Invoice_Id)
);
