package dailypractice.LeetCode.october.week5;

public class LaserBeam {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        boolean flag = false;
        int previousCount = 0;
        for (String str : bank){
            int curCount = strCount(str);
            if (previousCount > 0){
                ans += previousCount * curCount;
                flag = false;
            }
            if(curCount == 0){
                flag = true;
            }
            else {
                previousCount = curCount;
            }
        }

        return ans;
    }
    public int strCount(String str){
        int count = 0;
        for (int i = 0; i< str.length(); i++){
            if (str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LaserBeam l = new LaserBeam();
        String[] s = {"011001","000000","010100","001000"};
        System.out.println(l.numberOfBeams(s));
    }
}
