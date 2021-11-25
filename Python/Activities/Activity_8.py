num = int(input("Enter the list size"))
num_list=[]
for x in range(num):
    num_list.append(input("Enter the number to list"))
print(num_list)
print("whether first and last value in list is same? ",end="")
if(num_list[0]==num_list[num-1]):
    print("True")
else:
    print("False")