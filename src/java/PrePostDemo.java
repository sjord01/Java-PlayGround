class PrePostDemo {
    public static void main(String[] args){
        /*
        The increment/decrement operators can be applied
        before (prefix) or after (postfix) the operand.
        The code result++; and ++result; will both end in result being incremented by one.
        The only difference is that the prefix version (++result) evaluates to the incremented value,
        whereas the postfix version (result++) evaluates to the original value.
        If you are just performing a simple increment/decrement,
        it doesn't really matter which version you choose.
        But if you use this operator in part of a larger expression,
        the one that you choose may make a significant difference.
         */

        int result = 8;  // Change the initial value to 8
        result++;
        // prints 9
        System.out.println(result);
        ++result;
        // prints 10
        System.out.println(result);
        // prints 11
        System.out.println(++result);
        // prints 11
        System.out.println(result++);
        // prints 12
        System.out.println(result);
    }
}
