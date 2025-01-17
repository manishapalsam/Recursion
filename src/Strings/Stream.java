package Strings;

public class Stream {
    public static void main(String[] args) {
        skip("", "baccdah");
        System.out.println(skip1("baccdah"));
        System.out.println(skipApple("bacappledeh"));
        System.out.println(skipAppWithoutApple("bacapppledeh"));

    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }


    static String skip1(String up) {
        if (up.isEmpty()) {

            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip1(up.substring(1));
        } else {
            return ch + skip1(up.substring(1));
        }
    }


        static String skipApple (String up){
            if (up.isEmpty()) {

                return "";
            }

            if (up.startsWith("apple")) {
                return skipApple(up.substring(5));
            } else {
                return up.charAt(0) + skipApple(up.substring(1));
            }
        }


    static String skipAppWithoutApple (String up){
        if (up.isEmpty()) {

            return "";
        }

        if (up.startsWith("app") && !up.startsWith(("apple"))){
            return skipAppWithoutApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppWithoutApple(up.substring(1));
        }
    }
    }



