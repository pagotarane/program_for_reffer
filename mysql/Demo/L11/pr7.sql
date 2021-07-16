create table employee_1
(
eid int primary key,
ename varchar(20)
);

create table employee_bkup_2
(
eid int,
ename varchar(20),
operation varchar(20),
operation_time timestamp
);
 
delimiter $$
drop trigger if exists t1$$

create trigger t1 before insert on employee_1 for each row
begin
if (new.eid < 0) then
  signal SQLSTATE '11111'
  set message_text = "id shud not < 0";
end if;
 if (new.ename is null or length(new.ename) < 2) then
   signal SQLSTATE '22222'
   set message_text = "invalid name";
end if;
end $$


drop trigger if exists t2$$
create trigger t2 after insert on employee_1 for each row
begin
insert into employee_bkup_2 values(new.eid, new.ename,  'INSERT',
now());
end $$

delimiter ;