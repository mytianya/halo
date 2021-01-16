package run.halo.app.utils;

import java.util.Random;
/**
 * @author dsyslove@163.com
 * @createtime 2020/12/31--10:39
 * @description
 **/
public class NetworkDiskUtil {
    public static final char ARR[] = new char[] {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    public static Random RADMON = new Random();
    public static final String geneteSceretCode(int len) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            sb.append(ARR[RADMON.nextInt(ARR.length)]);
        }
        return sb.toString();
    }
}
