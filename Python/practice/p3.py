import cx_Oracle
con=None

try:
	con=cx_Oracle.connect('system/abc123@localhost')
	print('connected')

	cursor=con.cursor()
	sql="create table student(sroll int primary key,sname varchar(101),smarks int)"
	cursor.execute(sql)
	print('table created')

except cx_Oracle.DatabaseError as e:
	print('issue',e)

finally:
	cursor.close()
	if con is not None:
		con.close()
		
print('Disconnected')	