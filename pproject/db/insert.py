import cx_Oracle
con=None
cursor=None
try:
	con=cx_Oracle.connect("system/abc123")
	print("connected")
	cursor=con.cursor()

	sql="insert into student values('%d','%s','%d')"
	sroll=int(input("enter roll number "))
	sname=input("enter name ")
	smarks=int(input("enter marks "))

	args=(sroll,sname,smarks)
	cursor.execute(sql % args)
	con.commit()
	print(cursor.rowcount,"records inserted")

except cx_oracle.DatabaseError as e:
	con.rollback()
	print("issue",e)
finally:
	
	if cursor is not None:
		cursor.close()
	if con is not None:
		con.close()
		print("disconnected")