public class License_Key_Formatting {
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String ans = licenseKeyFormatting(s,k);
        System.out.println(ans);
    }

    public static String licenseKeyFormatting(String s, int k) {
        String res = s.toUpperCase().replaceAll("-", "");
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for (int i = res.length() - 1; i >= 0; i--) {
            sb.append(res.charAt(i));
            if (count == k && i != 0) {
                sb.append("-");
                count = 1;
            } else count++;
        }

        return sb.reverse().toString();
    }
}

/*
 public String licenseKeyFormatting(String S, int K) {

        StringBuilder sb = new StringBuilder();

        for (int i = S.length() - 1, count = 0 ; i >= 0 ; --i) {

            char c = S.charAt(i);
            if (c == '-') continue;

            // put a '-' first if we already append K characters
            if (count == K) {
                sb.append('-');
                count = 0;
            }

            sb.append(Character.toUpperCase(c));
            ++count;
        }

        return sb.reverse().toString();
    }
 */

