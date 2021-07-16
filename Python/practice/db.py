import cx_Oracle
con=None
cursor=None
try:
	con=cx_Oracle.connect("system/abc123")
	print("connected")
#	print(con.version)
	curosr=con.cursor()
	sql="insert into ketan values('%d','%s')"
	id=int(input("Enter Id "))
	name=input("Enter Name ")
	args=(id,name)
	cursor.execute(sql % args)
	con.commit()
	print(cursor.rowcount,"inserted")

except cx_Oracle.DatabaseError as e:
	con.rollback()
	print("Issue",e)

finally:
	if con is not None:
		con.close()
	if cursor is not None:
		cursor.close()
#	print("Disconnected")