package feb;

/**
 * @author lyc1, lyc1@erongdu.com
 * @version 1.0.0
 * Copyright 杭州融都科技股份有限公司 All Rights Reserved
 * 官方网站：www.erongdu.com
 * <p>
 * 未经授权不得进行修改、复制、出售及商业使用
 * @since 2019-02-18
 */
public class ReverserInteger {

    public int reverse(int x) {
        int reversed = 0;
        while(x != 0) {
            if (reversed * 10 / 10 != reversed) {
                return 0;
            }
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return reversed;
    }
}
