package dailypractice.LeetCode.september.week4;

public class VersionManager {

    public static int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        int len = Math.max(ver1.length, ver2.length);
        for (int i =0; i< len; i++){
            if (i < ver1.length && i < ver2.length){
                if (Integer.parseInt(ver1[i]) < Integer.parseInt(ver2[i])){
                    return -1;
                } else if (Integer.parseInt(ver1[i]) > Integer.parseInt(ver2[i])) {
                    return 1;
                }
            }
            else if (i < ver1.length){
                if (Integer.parseInt(ver1[i]) > 0){
                    return 1;
                }
            }
            else {
                if (Integer.parseInt(ver2[i]) > 0){
                    return -1;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.0", "1.0.0.0"));
    }
}
