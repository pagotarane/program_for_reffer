import cx_Oracle
con=None
cursor=None
try:
	con=cx_Oracle.connect("system/abc123")
	print("connected")
	cursor=con.cursor()
	sql="select * from employee"
	cursor.execute(sql)
	data=cursor.fetchall()
	for d in data:
		print("eid", d[0],"ename", d[1])
except cx_oracle.DatabaseError as e:
	print("issue",e)
finally:
	if cursor is not None:
		cursor.close()
	if con is not None:
		con.close()
		print("disconnected")