import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class RomanToArabic {
    static String romanToArabik(String romanNum) throws Exception {
        switch (romanNum) {
            case "I":
                return "1";
            case "II":
                return "2";
            case "III":
                return "3";
            case "IV":
                return "4";
            case "V":
                return "5";
            case "VI":
                return "6";
            case "VII":
                return "7";
            case "VIII":
                return "8";
            case "IX":
                return "9";
            case "X":
                return "10";
        }
        throw new Exception("Римское число слишком большое");
    }

    static boolean checkArabikValid(String[] operands) {
        if (0 < Integer.parseInt(operands[0]) && 10 >= Integer.parseInt(operands[0])) {
            if (0 < Integer.parseInt(operands[1]) && 10 >= Integer.parseInt(operands[1]))
                return TRUE;
        }
        return false;
    }

    static boolean chekNS(String[] operands) {
        String arabikTersms = "1234567890";
        String romeTerms = "IVXLCDM";
        if ((arabikTersms.indexOf(operands[0].charAt(0)) != -1) && ((arabikTersms.indexOf(operands[1].charAt(0)) != -1)))
            return TRUE;
        else if ((romeTerms.indexOf(operands[0].charAt(0)) != -1) && ((romeTerms.indexOf(operands[1].charAt(0)) != -1)))
            return TRUE;
        else
            return FALSE;
    }

    static int mathOperArabik(String[] operands, char operator) {
        int a = Integer.parseInt(operands[0]);
        int b = Integer.parseInt(operands[1]);

        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;

            case '/':
                return a / b;
        }
        return 0;
    }
}
