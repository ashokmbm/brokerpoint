
CREATE DATABASE IF NOT EXISTS  brokerpoint;

USE brokerpoint;

CREATE TABLE IF NOT EXISTS customers (
  customerid int(5) NOT NULL AUTO_INCREMENT,
  fname VARCHAR(30),
  lname VARCHAR(30),
  email  VARCHAR(50),
  contact VARCHAR(15),
  PRIMARY KEY (customerid)
  
);