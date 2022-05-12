package EscapeSequence;

/**Escape Sequence :
 *          \t  :   Insert a tab in the text at this point.
 *          \b  :   Insert a backspace in the text at this point.
 *          \n  :   Insert a new line in the text at this point.
 *          \r  :   Insert a carriage return to the text at this point.
 *          \f  :   Insert a formatted in the text at this point.
 *          \'  :   Insert a single quote character in the text at this point.
 *          \"  :   Insert a double quote character in the text at this point.
 *          \\  :   Insert a backslash character in the text at this point.
 */


public class HWesSQ {

    public static void main(String[] args) {
        // to write & print single or double quote ("Hello" with double quote)
        // \" and \'
        System.out.println("\"Hello\"");
        System.out.println("\'Hello\'");
        System.out.println("Hello");

        String name = "Dalim";

        System.out.println( " \" "  +name + " \"  " );
        System.out.println("\"");
        System.out.println("\" \"");

        System.out.println("My name is \"  "+name + "\"");
        System.out.println("My name is\""+name+"\"");
        System.out.println("My name is \""+name+ "\"");
        System.out.println("----------");
        // \t
        System.out.println("My name is:\tDalim");
        System.out.println("My name is:\t"+name);
        System.out.println("---------");
        // \n
        System.out.println("My name is Gabriel\nDalim");
        System.out.println("------");
        // \b
        System.out.println("My name is Gabriel Dalim\b");
        System.out.println("---------");
        // \r
        System.out.println("Gabriel Dalim \ris a student");
        System.out.println("-----");
        // \ //
        System.out.println("My name is Dalim\\");







    }


}
