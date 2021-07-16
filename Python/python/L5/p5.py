#wapp to read two stes from the user:android and java
#total,common,android lekin java me nahi hain

android=set()
java=set()

ans=input("do u want to enter names for android y/n ")
while ans =='y':
	ele=input("enter names ")
	android.add(ele)
	ans=input("do u want to enter android y/n ")

ans=input("do u want to enter names y/n ")
while ans =='y':
	ele=input("enter names ")
	java.add(ele)
	ans=input("do u want to enter names y/n ")

print("total",java|android)
print("common",java & android)
print("a-j",android-java)



