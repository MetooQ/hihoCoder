时间限制:10000ms  
单点时限:1000ms  
内存限制:256MB  
描述  
A string s is LUCKY if and only if the number of different characters in s is a fibonacci number. Given a string consisting of only lower case letters, output all its lucky non-empty substrings in lexicographical order. Same substrings should be printed once.  

输入  
A string consisting no more than 100 lower case letters.  

输出  
Output the lucky substrings in lexicographical order, one per line. Same substrings should be printed once.  

样例输入  
aabcd  
样例输出  
a  
aa  
aab  
aabc  
ab  
abc  
b  
bc  
bcd  
c  
cd  
d  



题目2 : Numeric Keypad  
时间限制:10000ms  
单点时限:1000ms  
内存限制:256MB  
描述  
The numberic keypad on your mobile phone looks like below:  
   
1 2 3  
4 5 6  
7 8 9  
  0  
Suppose you are holding your mobile phone with single hand. Your thumb points at digit 1. Each time you can 1) press the digit your thumb pointing at, 2) move your thumb right, 3) move your thumb down. Moving your thumb left or up is not allowed.  

By using the numeric keypad under above constrains, you can produce some numbers like 177 or 480 while producing other numbers like 590 or 52 is impossible.  

Given a number K, find out the maximum number less than or equal to K that can be produced.  

输入  
The first line contains an integer T, the number of testcases.  

Each testcase occupies a single line with an integer K.  



For 50% of the data, 1 <= K <= 999.  

For 100% of the data, 1 <= K <= 10500, t <= 20.  

输出  
For each testcase output one line, the maximum number less than or equal to the corresponding K that can be produced.  

样例输入  
3  
25  
83  
131  
样例输出  
25  
80  
129  