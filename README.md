Scala Practical 04
1. You are tasked with developing a simple inventory management system for a small retail store.
The store keeps track of its inventory using two separate arrays: one for item names (as strings) and
one for the corresponding item quantities (as integers).
● Write a function displayInventory that prints each item name along with its quantity in a
user-friendly format.
● Write a function restockItem that takes an item name and a quantity as parameters,
and adds the quantity to the existing quantity of the item. If the item does not exist, the
function should print an appropriate message.
● Write a function sellItem that takes an item name and a quantity as parameters, and
subtracts the quantity from the existing quantity of the item. If the item does not exist or
if there is not enough quantity to sell, the function should print an appropriate message.
2. Write a program in PatternMatching, takes the integer input from the command line. Based on the
input, write a code using match to print Negative/Zero is input when input is less than or equal to
0.Print Even number is given when input is even, and print Odd number is given when input is odd.
3. Write a Scala program which defines a method named "toUpper" and it accepts a String as input
parameter that is then formatted to upper case as output. Define another method named "toLower''
which accepts a String as input parameter and formats the input to lower case as output. Define
another method named "formatNames" which also has an input String called "name". This method
however has a parameter group which accepts a function with an input of type String and also
outputs a String. This particular function will be used to apply the given format to the "name" input.
You can use the test inputs for, say, "Benny", "Niroshan", "Saman" “Kumara”, and make sure that the
output is as shown below.
Output: BENNY
NIroshan
saman
KumarA
