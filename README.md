# Lab3M
**Julian**
Subtask 1: Create class myStack that implements IStack (writing the codes for all four methods).
You can use only Java LinkedList to keep the data as the internal storage of your stack.
(Important note: you are developing your own stack class, not using Java built-in Stack)
**Mohamed**
Subtask 2: Create class myPostFixCal that implements the IPostFixCal. The input is a
postFixString such as “12+3*”; only with one-digit numbers and operators +-/* and you will
return the final results of the expression, as an integer number.
Hint: You should move from left to right, push items to the stack if they are not an operator and
once there is an operator, pop items and calculate the results and ...
For your internal testing, you can use Java Stack, but when sharing the code with the team, the
input is IStack type.
Your method should raise an exception when the input is not valid. Make sure your teammates
are aware of this feature.
**Ashley**
Subtask 3: Create class postFixCalTesting with only one public method:
double precision(IStack stack, IPostFixCal calculator).
Inside this method, you will check the correctness of PostFix calculator using 5 post-fix strings.
For each string, you will pass it to the calculate method of calculator, and check the expected
results. Your method should return precision as the number of correct results divided by 5.
e.g., “12+3*” → 9
