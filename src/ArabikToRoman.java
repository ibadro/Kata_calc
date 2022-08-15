public class ArabikToRoman {
    static String arabikToRoman(int resultInt) {
        String str = Integer.toString(resultInt);
        String ans = "";
        int shift = 0;
        char ch;

        if (resultInt == 100)
            return "C";

        if (resultInt > 9)
            shift = 1;

        if (shift == 1) {
            ch = str.charAt(0);
            switch (ch) {
                case '1':
                    ans += "X";
                    break;
                case '2':
                    ans += "XX";
                    break;
                case '3':
                    ans += "XXX";
                    break;
                case '4':
                    ans += "XL";
                    break;
                case '5':
                    ans += "L";
                    break;
                case '6':
                    ans += "LX";
                    break;
                case '7':
                    ans += "LXX";
                    break;
                case '8':
                    ans += "LIII";
                    break;
                case '9':
                    ans += "XC";
                    break;
            }
        }

        ch = str.charAt(0 + shift);
        switch (ch) {
            case '0':
                break;
            case '1':
                ans += "I";
                break;
            case '2':
                ans += "II";
                break;
            case '3':
                ans += "III";
                break;
            case '4':
                ans += "IV";
                break;
            case '5':
                ans += "V";
                break;
            case '6':
                ans += "VI";
                break;
            case '7':
                ans += "VII";
                break;
            case '8':
                ans += "VIII";
                break;
            case '9':
                ans += "IX";
                break;
        }

        return ans;
    }
}
