// 26. Dany dva celyh chisla: D (den') i M (mesjac), opredeljajushhie pravil'nuju 
// datu. Vyvesti znak Zodiaka, sootvetstvujushhij jetoj date: 
// «Vodolej» (20.1–18.2)    => 120  - 131 +     201 -   218
// «Ryby» (19.2–20.3)       => 219  - 229 +     301 -   320
// «Oven» (21.3–19.4)       => 321  - 331 +     401 -   419
// «Telec» (20.4–20.5)      => 420  - 430 +     501 -   520
// «Bliznecy» (21.5–21.6)   => 521  - 531 +     601 -   621
// «Rak» (22.6–22.7)        => 622  - 630 +     701 -   722
// «Lev» (23.7–22.8)        => 723  - 731 +     801 -   822
// «Deva» (23.8–22.9)       => 823  - 831 +     901 -   922
// «Vesy» (23.9–22.10)      => 923  - 930 +     1001 -  1022
// «Skorpion» (23.10–22.11) => 1023 - 1031 +    1101 -  1122
// «Strelec» (23.11–21.12)  => 1123 - 1130 +    1201 -  1221
// «Kozerog» (22.12–19.1)   => 1222 - 1231 +    101 -   119


import java.util.Scanner;

class hw26Zodiac{
    static boolean isInRng(int x, int low, int up) {
        return(low <= x && x <= up);
    }

    static String getZodiac(int month, int day){
        String res="";

        int md = month*100 + day; //Main trick
        if (isInRng(md,120,131) || isInRng(md,201,218)) {
            res="Aquarius";
        } else if (isInRng(md,219,229) || isInRng(md,301,320)) {
            res="Pisces";
        } else if (isInRng(md,321,331) || isInRng(md,401,419)) {
            res="Aries";
        } else if (isInRng(md,420,430) || isInRng(md,501,520)) {
            res="Taurus";
        } else if (isInRng(md,521,531) || isInRng(md,601,621)) {
            res="Gemini";
        } else if (isInRng(md,622,630) || isInRng(md,701,722)) {
            res="Cancer";
        } else if (isInRng(md,723,731) || isInRng(md,801,822)) {
            res="Leo";
        } else if (isInRng(md,823,831) || isInRng(md,901,922)) {
            res="Virgo";
        } else if (isInRng(md,923,930) || isInRng(md,1001,1022)) {
            res="Libra";
        } else if (isInRng(md,1023,1031) || isInRng(md,1101,1122)) {
            res="Scorpio";
        } else if (isInRng(md,1123,1130) || isInRng(md,1201,1221)) {
            res="Sagittarius";
        } else if (isInRng(md,1222,1231) || isInRng(md,101,119)) {
            res="Capricorn";
        } else {
            res="ERROR: OUT OF RANGE";
        }
        return(res);
    }

    public static void main (String[]arg){
        if (arg.length == 2) {
            int m = Integer.parseInt(arg[0]);
            int d = Integer.parseInt(arg[1]);
            
            System.out.println("Month Nr: " + m + "\nDay's Nr: " + d);
            System.out.println("Zodiac sign is: " + getZodiac(m,d));
            
        } else {
            System.out.println("java hw26Zodiac <int MONTH [1..12]> <int DAY [1..31]>");
        }
    }
}
