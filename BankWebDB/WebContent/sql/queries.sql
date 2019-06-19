use test;
CREATE TABLE `bankdb` (
   `firstname` varchar(60) NOT NULL default '',
  `middlename` varchar(20) NOT NULL default '',
  `lastname` varchar(60) NOT NULL default '',
    `gender` varchar(6) NOT NULL default '',
      `address` varchar(60) NOT NULL default '',
      `city` varchar(20) NOT NULL default '',   
      `state` varchar(20) NOT NULL default '',
        `country` varchar(20) NOT NULL default '',
  `mobileno` varchar(10) NOT NULL default '',
      `bank` varchar(20) NOT NULL default '',
      `accountno` varchar(12) NOT NULL default '',
   `ssn` varchar(12) NOT NULL default '',
  PRIMARY KEY  (`ssn`)
) ;

insert into bankdb (`firstname`, `middlename`, `lastname`, `gender`, `address`, `city`, `state`, `country`, `mobileno`, `bank`, `accountno`, `ssn`) 
values('Rivan','chethan','nagavarapu','male','evelyn avenue','sunnyvale','california','usa','9677615163','Bank of America','12345678912','12345678912');


select `firstname`, `middlename`, `lastname` from bankdb where ssn= '12345678912';

update bankdb set `middlename` ='chethu' where ssn= '12345678912';

select * from  bankdb;

delete from bankdb where ssn ='12345678912';


use test;
CREATE TABLE `bankdb` (
   `firstname` varchar(60) NOT NULL default '',
  `middlename` varchar(20) ,
  `lastname` varchar(60) ,
    `gender` varchar(6) ,
      `address` varchar(60) ,
      `city` varchar(20) ,  
      `state` varchar(20) ,
        `country` varchar(20) ,
  `mobileno` varchar(10),
      `bank` varchar(20) ,
      `accountno` varchar(12),
   `ssn` varchar(12) NOT NULL default '',
  PRIMARY KEY  (`ssn`)
) ;