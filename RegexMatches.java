import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

   private static final String REGEX = "(:)(\\s\\d+)(.\\s)";
   private static final String INPUT = "Toi nam nay: 60 Ba nam nay: 102 ";

   public static void main( String args[] ) {
      Pattern p = Pattern.compile(REGEX);
      Matcher m = p.matcher(INPUT);   // get a matcher object
      int count = 0;

      while(m.find()) {
         count++;
         System.out.println("Match number " + count);
         System.out.println("start(): " + m.start());
         System.out.println("end(): " + m.end());
      }
   }
}