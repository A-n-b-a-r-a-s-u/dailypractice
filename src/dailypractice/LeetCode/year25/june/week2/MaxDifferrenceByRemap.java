package dailypractice.LeetCode.year25.june.week2;

public class MaxDifferrenceByRemap {
    public static int minMaxDifference(int num) {
        int ans =0;
        char forMax = '1', forMin = '1';
        String s = String.valueOf(num);
        boolean maxy = true, miny = true;
        for(int i =0; i< s.length(); i++){
            if ((s.charAt(i) - '0') != 9 && maxy){
                forMax = s.charAt(i);
                maxy = false;
            }
            if ((s.charAt(i) - '0') != 0 && miny){
                forMin = s.charAt(i);
                miny = false;
            }
        }
        ans = Integer.parseInt(s.replace((char)(forMax ), '9')) - Integer.parseInt(s.replace((char) (forMin), '0'));

        return ans;
    }

    public static void main(String[] args) {
        int n = 97;
        System.out.println(minMaxDifference(n));;
    }
}


/*
public static int minMaxDifference(int num) {
        int ans ;
        int min =  Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        String s = String.valueOf(num);

        for (int i =0; i< s.length(); i++){
            if (min > (s.charAt(i) - '0')){
                min = (s.charAt(i) - '0');
            }
            if (max < (s.charAt(i) - '0')){
                max = (s.charAt(i) - '0');
            }
        }


        ans = Integer.parseInt(s.replace((char)(min + '0'), '9')) - Integer.parseInt(s.replace((char)(max + '0'), '0'));

        return ans;
    }
 */