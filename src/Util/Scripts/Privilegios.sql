--To list users: 

select user,host from mysql.user;

 
--To show privileges: 

SHOW GRANTS FOR 'root'@'%';

--To change privileges, first revoke. Such as:

revoke all privileges on *.* from 'root'@'%';



--Then grant the appropriate privileges as desired:

grant SELECT,INSERT,UPDATE,DELETE ON `db`.* TO 'root'@'%';



--Or:

GRANT ALL ON *.* TO 'root'@'%' IDENTIFIED BY 'mutkch' WITH GRANT OPTION; 



--Finally, flush:

flush privileges;