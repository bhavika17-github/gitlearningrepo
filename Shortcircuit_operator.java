 class Shortcircuit_operator {
    public static void main(String args[]){
        int a= 42; //convert to binary 
        int b=15;//convert to binary
        //bitwise operator
        System.out.println(a^b); // this is bitwise xor opertor, result is in decimal 37
        System.out.println(a&b); //bitwise and ,it works on bits and then give result 
        System.out.println(a|b); //bitwise or operator 
        //logical,boolean,shortcircuit opertor
        System.out.println(a==42&&b==15); 
    }
}

/*                           IMPORTANT note:
1. bitwise and opertor(&) i.e single ampersand works both on int operands and also on boolean operands 

2. logical operator /shortcircuit operator (&&) i.e double ampersand only works on those operands that result in some boolean
 values , and it is a shortcircuit operator so it will only see the left side if it is suffient to declare the result
 and will save time and memory 

 3. We can use the & operator with boolean or numeric types but && can only be used with boolean operands. Using it with integer operands results in a compilation error:
 The & operator always evaluates both expressions, whereas the && operator evaluates the second expression only if the first one is true
& compares each operand bitwise, whereas && operates only on booleans
*/
