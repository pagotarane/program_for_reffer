import cx_Oracle
con=None
try:
	con=cx_Oracle.connect("system/abc123")
	print("connected")
	print(con.version)
except cx_oracle.DatabaseError as e:
	print("issue",e)
finally:
	if con is not None:
		con.close()
		print("disconnected")