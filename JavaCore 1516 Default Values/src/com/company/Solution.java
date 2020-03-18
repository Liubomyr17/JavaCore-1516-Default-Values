package com.company;

/*

1516. Level 15 Lection 9. Default Values
1. Create 7 public class fields. Make sure that they are initialized with default values.
intVar of type int
doubleVar of type double
DoubleVar type Double
booleanVar type boolean
ObjectVar of type Object
ExceptionVar of type Exception
StringVar of type String
2. In the main method, display their values ​​in the specified order.

Requirements:
1. In the class Solution, an intVar field of type int must be declared.
2. In the class Solution, a doubleVar field of type double must be declared.
3. In the class Solution, a DoubleVar field of type Double shall be declared.
4. In the class Solution, a booleanVar field of type boolean must be declared.
5. In the Solution class, an ObjectVar field of type Object must be declared.
6. In the class Solution, an ExceptionVar field of type Exception must be declared.
7. In the class Solution, a StringVar field of type String must be declared.
8. The main method should display the values ​​of the fields on the screen (each from
a new line or separated by a space) in the specified order. Initializing variables is not necessary.

 */

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.intVar);
        System.out.println(solution.doubleVar);
        System.out.println(solution.DoubleVar);
        System.out.println(solution.booleanVar);
        System.out.println(solution.ObjectVar);
        System.out.println(solution.ExceptionVar);
        System.out.println(solution.StringVar);

    }
}
