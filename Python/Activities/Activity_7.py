num = int(input("Enter the list size"))
num_list=[]
sum=0
for x in range(num):
    num_list.append(input("Enter the number to list"))
print(num_list)
for i in range(num):
    sum+=int(num_list[i])
print("Sum of the numbers in entered list is ",sum)