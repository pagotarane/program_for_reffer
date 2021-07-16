delimiter $$
drop trigger if exists t1$$

create trigger t1 before insert on ca for each row
begin
if(new.balance < 3000) then
signal SQLSTATE '88888'
set message_text="ca balance cannot be < 3000";
end if;
end$$

drop trigger if exists t2$$
create trigger t2 before update on ca for each row
begin
if(new.balance<3000) then
signal SQLSTATE '88888'
set message_text="ca balance cannot be < 3000";
end if;
end$$


create trigger t3 before insert on sa for each row
begin
if(new.balance<3000) then
signal SQLSTATE '88888'
set message_text="ca balance cannot be < 3000";
end if;
end$$

drop trigger if exists t4$$
create trigger t4 before update on sa for each row
begin
if(new.balance<3000) then
signal SQLSTATE '88888'
set message_text="ca balance cannot be < 3000";
end if;
end$$
delimiter ;







