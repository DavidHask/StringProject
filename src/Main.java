public class Main
{
    public static void main(String[] args)
    {
        boolean tandf = true && false;
        boolean torf = true || false;
        System.out.println("True and false is " + tandf);
        System.out.println("True or false is " + torf);

        boolean complex = (5 > 8) || (3 < 9);
        System.out.println("The output of complex boolean is " + complex);

        char t = 't';
        System.out.println("Character t is " + t);

        String myString = "This is IT1090";
        String titleString = "Computer Programming";

        System.out.println("My string is: " + myString);

        String lower = myString.toLowerCase();

        System.out.println("Lower case string us: " + lower);

        String complexString = "Name: " + myString + "\n" + "Title: " + titleString;
        String complexString2 = "Name: " + myString + "\t" + "Title: " + titleString;

        System.out.println(complexString);
        System.out.println(complexString2);
    }
}