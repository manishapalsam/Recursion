package Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
       // ArrayList<String> list = permutations("","abc");
        //System.out.println(permutations("","abc"));
        System.out.println(permutations("","abcd",0));

    }
/*
    static  void  permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i<= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutations(first+ch+second, up.substring(1));
        }
    }*/
    /*static ArrayList<String> permutations(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
          //  System.out.println(p);
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i, p.length());
            ans.addAll(permutations(first+ch+second, up.substring(1)));
        }
        return ans;
    }*/
    /*static int permutations(String p, String up){
       // ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            //  System.out.println(p);

            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        //ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i, p.length());
           count = count + (permutations(first+ch+second, up.substring(1)));
        }
        return count;
    }*/

    static int permutations(String p, String up, int count){
        // ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            //  System.out.println(p);
            //count++;
            count = count + 1;
            return count;
        }
        char ch = up.charAt(0);
        //int count = 0;
        //ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i, p.length());
           count = permutations(first+ch+second, up.substring(1),count);
        }
        return count;
    }

}
