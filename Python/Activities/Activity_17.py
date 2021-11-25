import pandas

data = {"Usernames":["admin","charles","Deku"],"Passwords":["password","Charl13","AllMight"]}

dataframe = pandas.DataFrame(data)
print(dataframe["Usernames"][0])
dataframe.to_csv("Password_list.csv")