public class wrapper{
    public static void main(String[] args){

        Integer number1 = new Integer(57); //boxing
        Integer number2 = new Integer(86); 

        Double double1 = new Double(6.74); //formal method for boxing
        Double double2 = new Double(5.8); 

        int year = number2.intValue(); //formal method for unboxing ints
        double average = double1.doubleValue(); //formal method for unboxing doubles
        
        System.out.println(number1.equals(number2)); //can put anything in parenthesis, but can only use a object when using method
        System.out.println(number2.MIN_VALUE);
        System.out.println(number1.MAX_VALUE);
        String s = new String("5"); 
        int v5 = number2.parseInt(s); //converts string into its integer 
        System.out.println(v5);
        System.out.println(number1.valueOf(s)); //converts string into its integer
        System.out.println(number2.decode(s)); //converts string into its integer
        System.out.println(number2.reverse(number1)); //reverses the bits
        System.out.println(number1.hashCode());




        System.out.println(double1.equals(double2));
        System.out.println(double1.MIN_VALUE);
        System.out.println(double2.MAX_VALUE);
        System.out.println(double2.parseDouble(s)); //converts string into its double
        System.out.println(double1.isInfinite()); //checks if the number is infinite
        System.out.println(double2.toString()); //returns the string representation of the double
        System.out.println(double1.hashCode());//returns the hashcode of the double
        System.out.println(double2.isNaN()); //checks if the number is not a number
        
     
        
        int absolute = Math.abs(-7); //returns int
        System.out.println(absolute);

        double absolute2 = Math.abs(-7.5); //returns double
        System.out.println(absolute2);

        double exponent = Math.pow(5, 4); //alyways returns double
        System.out.println(exponent);

        double sqrt = Math.sqrt(64); //returns double
        System.out.println(sqrt);

        double randomNum = Math.random(); //returns 0 to just below but not including 1: 0.0 - 0.999999999999
        System.out.println(randomNum);

        System.out.println(Math.round(5.6)); //rounds to the nearest whole number
        System.out.println(Math.max(5, 8));//returns the larger of the two numbers
        System.out.println(Math.min(5, 8));//returns the smaller of the two numbers
        System.out.println(Math.rint(12.8)); //rounds to the nearest whole number and returns a double
        System.out.println(Math.floor(90.02)); //rounds down to the nearest whole number and returns a double
        System.out.println(Math.ceil(10289.6)); //rounds up to the nearest whole number and returns a double
        
    }
}