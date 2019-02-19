CREATE TABLE user (
  username varchar(10) NOT NULL,
  password varchar(30) DEFAULT NULL,
 firstName varchar(10) NOT NULL,
  middleName varchar(10) DEFAULT NULL,
  lastName varchar(10) NOT NULL,
  emailId varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) 


CREATE TABLE  phoneno (
  username varchar(10) NOT NULL,
  phoneNo varchar(10) NOT NULL,
  PRIMARY KEY (`username`)
) 



//Mobline phone tablee


CREATE TABLE mobilephone (
  `modelNo` varchar(20) NOT NULL,
  `noInStock` int(11) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `frontCamera` varchar(10) DEFAULT NULL,
  `rearCamera` varchar(10) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `quantitySold` int(11) NOT NULL,
  `memoryRam` varchar(10) NOT NULL,
  `mainMemory` varchar(10) NOT NULL,
  `osName` varchar(20) NOT NULL,
  `processorId` varchar(10) NOT NULL,
  `batteryId` varchar(10) NOT NULL,
  `mobileName` varchar(50) NOT NULL,
  PRIMARY KEY (`modelNo`)
) 
