# How my project works
Once the program is executed, the user is prompted to enter in 3 things:
- their name 
- their budget amount 
- a coupon code if they have one

Once the user enters in those 3 things then the program displays the following output:
- The name of the store they just shopped at (I set the store name to be Walmart)
- Their visit ID and receipt code 
- The subtotal, tax, discounts, and total bill amounts
- How much of their budget is remaining or how much the user is short

For the creativity requirement, I made two methods in the receipt class:
- The generateWelcomeMessage method cycles between changing the store name and a welcome message based on a random number generator
- The generateReceiptTagline method cycles between displaying two receipt tagline messages based on a random number generator


# Sample Output

The user enters the following info:
- Name: Bryant Ferguson
- Budget: 333 
- Coupon Code: (the user left it blank as theu didn't have a code to enter)

Here is what the output would look like: 
- Welcome to Walmart
- Visit ID: 2825
-  Receipt Code bf2300
-  Your Item prices are: 58.0, 72.0, 17.0
-  Subtotal: 147.0
-  Tax: 9.0
-  You have a $0.0 discount off your bill
-  Your final total is 156.0
-  You have $177.0 left in your budget
- Have a WONDERFUL day!

# Java Concepts Used
The following concepts were used:
- Math methods such as Math.round
- String methods such as substring, length, trim, and toLowerCase
- Switch and if/else statements
- 


