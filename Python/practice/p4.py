import cx_Oracle
con=None

try:
	con=cx_Oracle.connect('system/abc123@localhost')
	sroll=int(input("enter sroll: "))
	sname=input("enter sname :")
	smarks=int(input("enter smarks :"))

	cursor=con.cursor()
	sql="insert into student values(%d,%s,%d)"
	args=(sroll,sname,smarks)
	cursor.execute(sql % args)
	con.commit()

except cx_Oracle.DatabaseError as e:
	print('issue',e)

finally:
	cursor.close()
	if con is not None:
		con.close()
		
print('Disconnected')	