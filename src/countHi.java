public class countHi {

    /*
    Return the number of times that the string "hi" appears anywhere in the given string.*/

    public int countHi(String str){
        int res = 0;
        for (int i=0;i<str.length()-1;i++){
            if (str.substring(i,i+2).equals("hi")){res++;}
        }
        return res;

    }
}
