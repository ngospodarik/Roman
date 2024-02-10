import java.util.Scanner;

public class Roman {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arabic = Integer.parseInt(scanner.next());

        int thousands = arabic / 1000;
        int remainder_from_thousands = arabic % 1000;
        int five_hundreds = remainder_from_thousands / 500;
        int remainder_from_five_hundreds = remainder_from_thousands % 500;
        int hundreds = remainder_from_five_hundreds / 100;
        int remainder_from_hundreds = remainder_from_five_hundreds % 100;
        int fifties = remainder_from_hundreds / 50;
        int remainder_from_fifties = remainder_from_hundreds % 50;
        int tens = remainder_from_fifties / 10;
        int remainder_from_tens = remainder_from_fifties % 10;

        String roman = "";

        roman = "M".repeat(thousands);

        if (remainder_from_thousands / 100 == 9) roman += "CM";
        else if (remainder_from_thousands / 100 == 9 && five_hundreds != 0) roman += "D";

        if (remainder_from_thousands / 100 != 9) {

            if (hundreds == 4) {
                roman += "CD";
            } else roman += "C".repeat(hundreds);
        }

        if (remainder_from_hundreds == 90) {

            roman += "XC";

        } else {

            if (fifties == 4) roman += "XC";

            if (fifties != 4 && fifties != 0) roman += "L";

            if (tens == 4) roman += "XL";

            if (tens != 4 && tens != 0) roman += "X".repeat(tens);
        }

        switch (remainder_from_tens) {
            case 1: roman += "I";
            break;
            case 2: roman += "II";
            break;
            case 3: roman += "III";
            break;
            case 4: roman += "IV";
            break;
            case 5: roman += "V";
            break;
            case 6: roman += "VI";
            break;
            case 7: roman += "VII";
            break;
            case 8: roman += "VIII";
            break;
            case 9: roman += "IX";
            break;
        }
        System.out.println(roman);
    }

}
