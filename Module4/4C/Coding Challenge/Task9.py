#Return the number of vowels in a string
#def returnVowel():
count = 0
String = "Majestic"
#to check for less conditions keep string in lowercase
String = String.lower()
for i in String:
    if i == "a" or i == "e" or i == "o" or i == "i" or i == "u":
          count +=1
if count == 0:
 print("No vowels found")
else:
 print("Total vowels are :" + str(count))


