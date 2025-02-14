package dailypractice.hackerRank.december;

public class SmallestSubString {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String A = "madam", rev ="";
        int subStrLen = s.length() - 2;
        String[] subStrings = new String[subStrLen];

        for(int i = A.length()-1; i >= 0; i--) {
            rev += A.charAt(i);
        }

        if (k > subStrLen) {

        }

        for (int i = 0; i < subStrLen; i++) {
            subStrings[i] = s.substring(i, i + k);
        }
        for(int i =0; i< subStrLen; i++) {
            for(int j =0; j< subStrLen - 1; j++) {
                if(subStrings[j].charAt(0) > subStrings[j+1].charAt(0)) {
                    String stg = subStrings[j];
                    subStrings[j] = subStrings[j + 1];
                    subStrings[j + 1] = stg;
                }
            }
        }

        smallest = subStrings[0];
        largest = subStrings[subStrings.length - 1];


        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH",240));;
    }
}
