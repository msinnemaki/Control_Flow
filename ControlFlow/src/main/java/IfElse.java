public class IfElse
{
    public IfElse()
    {

    }

    public boolean checkStringLength (String input)
    {
        //the condition here says - if the length of the
        //incoming String 'input' has more than 7 chars
        // it will return true
        if(input.length() > 7)
        {
            return true;
        }
        else
        {
            return false;
        }


        //note: we do not need this return statement any longer
        //this is because all possible conditions have been met

        // return false;

    }

    public String printTStringsOnly(String input)
    {
        //here we made the variable (var) 'firstLetter'
        //equal to the character at(charAt) index 0 of our input
        char firstLetter = input.charAt(0);
        //here we declare the boolean 'check' but we do not give it a value
        boolean check;

        if (String.valueOf(firstLetter).equals("T") || String.valueOf(firstLetter).equals("t"))
        {
            return input + " begins with the letter 't'";
        }
        else
        {
            //here we are giving check a value
            check = false;
        }


        return "Did this word begin with the letter 't'?" + check;
    }




}
