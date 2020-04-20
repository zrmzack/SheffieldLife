package ZJOffer;

/**
 * @author zack
 * @create 2020-01-26-13:31
 */
public class replaceSpace {

    public static void main(String[] args) {

    }

    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        StringBuilder newstr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newstr.append("%20");
            } else {
                newstr.append(str.charAt(i));
            }

        }
        return newstr.toString();
    }
}
