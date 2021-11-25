import pytest

# Additon test
def test_addition():
	
    # Initialize two numbers
	num1 = 20
	num2 = 55
    
	# Add them
	sum = num1 + num2

	# Assertion
	assert sum == 75

# Subtraction test
def test_subtraction():
  
	# Initialize two numbers
	num1 = 100
	num2 = 30
    
	# Subtract them
	diff = num1 - num2

	# Assertion
	assert diff == 70

# Multiplication test
def test_multiplication():
  
	# Initialize two numbers
	num1 = 8
	num2 = 10
    
	# Multiply them
	prod = num1 * num2

	# Assertion
	assert prod == 80

# Division test
def test_division():
  
	# Initialize two numbers
	num1 = 35
	num2 = 5
    
	# Divide them
	quot = num1 / num2

	# Assertion
	assert quot == 7