Java Code for Number Conversion to Kyrgyz

Overview
The given Java program converts a number (from 0 to 99,999) into its equivalent representation in the Kyrgyz language. It takes user input, processes the numerical value, and outputs the corresponding Kyrgyz words.

 Functionality:
1. The program prompts the user to enter a number between 0 and 99,999. It uses Scanner to read the input as a long value.

2. Validation:  
The input number is checked to ensure it falls within the valid range (0–99,999).
If the number is out of range, the program prints "Error" and terminates.

3. Number Breakdown:
The number is decomposed into units, tens, hundreds, and thousands using modular arithmetic.
Separate variables store the digits at each positional value (units, tens, hundreds, thousands, and ten-thousands).
4. Conversion Logic:  
The program uses predefined arrays for Kyrgyz words:
     - a[] – units (1–9)
     -b[] – tens (10, 20, 30, …, 90)
     - h[] – hundred (`Жүз`)
     - t[] – thousand (`Миң`)
The program constructs the output by appending appropriate words in a structured manner.
The special case for zero (`Нөл`) is handled separately.
5. Output:  
The resulting Kyrgyz numeral representation is displayed.

Conclusion:
This Java program effectively converts numbers into their Kyrgyz representation with a structured approach. 
It serves as a useful tool for learning Kyrgyz numeral construction while demonstrating basic Java programming concepts such as input handling, modular arithmetic, and string manipulation.


