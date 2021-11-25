List1 = [1,2,3,4,5,6]
List2 = [10,11,12,13,14,15,16]
odd_List=[]
even_List=[]
for i in List1 :
    if((i%2)==0):
            even_List.append(i)
    
for j in List2:
    if((j%2)!=0):
            odd_List.append(j)

print("new Even List",even_List)
print("new Odd List",odd_List)
