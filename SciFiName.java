
/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName   
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main()
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name
        // scifi firstname
        firstName = firstName.substring(0, Math.min(firstName.length(), 3));
        lastName = lastName.substring(0, Math.min(lastName.length(), 2));
        String scifiFirstName = firstName + lastName;
        System.out.println(scifiFirstName);
        
        //scifi lastname
        city = city.substring(0, Math.min(city.length(), 2));
        school = school.substring(0, Math.min(school.length(), 3));
        String scifiLastName = city + school;
        System.out.println(scifiLastName);
        
        //random ##s
        int relativeName1length = relativeName1.length();
        int randInt1 = (int)(Math.random() * (relativeName1length) + 1);
        
        System.out.println("randInt1:" + randInt1);
        String letter = relativeName1.substring(randInt1);
        System.out.println(letter);
        

    }
}
