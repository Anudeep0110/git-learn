from array import *
arr = [['-','-','-'], ['-','-','-'], ['-','-','-']]
c=0
def check(arr,a):
	if a==1:
		if (arr[0][0]==arr[0][1]==arr[0][2]) or (arr[0][0]==arr[1][0]==arr[2][0]) or (arr[0][0]==arr[1][1]==arr[2][2]):
			if c%2==0:
				print("Person 1 won the Game")
			else :
				print("Person 2 won the Game")
			restart()
	elif a==2:
		if(arr[0][1]==arr[1][1]==arr[2][1]) or (arr[0][0]==arr[0][1]==arr[0][2]):
			if c%2==0:
				print("Person 1 won the Game")
			else :
				print("Person 2 won the Game")
			restart()
	elif a==3:
		if(arr[0][0]==arr[0][1]==arr[0][2]) or (arr[0][2]==arr[1][2]==arr[2][2]) or (arr[0][2]==arr[1][1]==arr[2][0]):
			if c%2==0:
				print("Person 1 won the Game")
			else :
				print("Person 2 won the Game")
			restart()
	elif a==4:
		if(arr[1][0]==arr[1][1]==arr[1][2]) or (arr[0][0]==arr[1][0]==arr[2][0]):
			if c%2==0:
				print("Person 1 won the Game")
			else :
				print("Person 2 won the Game")
			restart()
	elif a==5:
		if(arr[0][0]==arr[1][1]==arr[2][2]) or (arr[0][1]==arr[1][1]==arr[2][1]) or (arr[0][2]==arr[1][1]==arr[2][0]) or (arr[1][0]==arr[1][1]==arr[1][2]):
			if c%2==0:
				print("Person 1 won the Game")
			else :
				print("Person 2 won the Game")
			restart()
	elif a==6:
		if(arr[1][0]==arr[1][1]==arr[1][2]) or (arr[2][0]==arr[2][1]==arr[2][2]):
			if c%2==0:
				print("Person 1 won the Game")
			else :
				print("Person 2 won the Game")
			restart()
	elif a==7:
		if(arr[0][0]==arr[1][0]==arr[2][0]) or (arr[0][2]==arr[1][1]==arr[2][0]) or (arr[2][0]==arr[2][1]==arr[2][2]):
			if c%2==0:
				print("Person 1 won the Game")
			else :
				print("Person 2 won the Game")
			restart()
	elif a==8:
		if(arr[2][0]==arr[2][1]==arr[2][2]) or (arr[0][1]==arr[1][1]==arr[2][1]):
			if c%2==0:
				print("Person 1 won the Game")
			else :
				print("Person 2 won the Game")
			restart()
	elif a==9:
		if(arr[0][0]==arr[1][1]==arr[2][2]) or (arr[0][2]==arr[1][2]==arr[2][2]) or (arr[2][0]==arr[2][1]==arr[2][2]):
			if c%2==0:
				print("Person 1 won the Game")
			else :
				print("Person 2 won the Game")
			restart()
def main():
	arr = [['-','-','-'], ['-','-','-'], ['-','-','-']]
	c=0
	while(True):
		print(" 1 | 2 | 3 ")
		print("-----------")
		print(" 4 | 5 | 6 ")
		print("-----------")
		print(" 7 | 8 | 9 ")
		a=int(input("Enter a Number in the Block:"))
		s=str(input("Enter O or X:"))
		if a == 1 :
			arr[0][0]=s
		elif a == 2:
			arr[0][1]=s
		elif a == 3:
			arr[0][2]=s
		elif a == 4:
			arr[1][0]=s
		elif a == 5:
			arr[1][1]=s
		elif a == 6:
			arr[1][2]=s
		elif a == 7:
			arr[2][0]=s
		elif a == 8:
			arr[2][1]=s
		elif a  == 9:
			arr[2][2]=s
		print(" ",arr[0][0]," | ",arr[0][1]," | ",arr[0][2]," ")
		print("-----------------")
		print(" ",arr[1][0]," | ",arr[1][1]," | ",arr[1][2]," ")
		print("-----------------")
		print(" ",arr[2][0]," | ",arr[2][1]," | ",arr[2][2]," ")
		print()
		print()
		c+=1
		check(arr,a)
		if c==9:
			print("Game Over")
			restart()
def restart():
	re=str(input("WANT TO PLAY AGAIN PRESS A OR ELSE PRESS E :"))
	if re == 'A':
		arr = [['-','-','-'], ['-','-','-'], ['-','-','-']]
		c=0
		main()
	elif re == 'E':
		quit()
main()
