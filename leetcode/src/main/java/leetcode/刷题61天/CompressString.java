package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-16-12:13
 */
public class CompressString {
    public static void main(String[] args) {
        String xx="ccc";
        Solution solution=new Solution();
        System.out.println(solution.compressString(xx));
    }
    static class Solution {
        public String compressString(String S) {
            StringBuilder stringBuilder = new StringBuilder();
            int tempi=0;
            for (int i = 0; i < S.length(); i++) {
                char temp = ' ';
                int times = 1;
                temp = S.charAt(i);
                for (int j = i + 1; j < S.length(); j++) {
                    if (temp == S.charAt(j)) {
                        times++;
                    } else {
                        stringBuilder.append(temp);
                        stringBuilder.append(times);
                        i+=times-1;
                        tempi=i;
                        break;
                    }
                }

            }
            stringBuilder.append(S.charAt(S.length()-1)).append(S.length()-tempi-1);
            if (stringBuilder.length() < S.length()) {
                return String.valueOf(stringBuilder);
            }
            return S;
        }
    }
}
