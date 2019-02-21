package feb;

/**
 * @author lyc1, lyc1@erongdu.com
 * @version 1.0.0
 * Copyright 杭州融都科技股份有限公司 All Rights Reserved
 * 官方网站：www.erongdu.com
 * <p>
 * 未经授权不得进行修改、复制、出售及商业使用
 * @since 2019-02-21
 */
public class BinarySearch {


    public static int binarySearch(int[] array, int target) {
        int head = 0;
        int end = array.length -1;
        while (head <= end) {
            int middle = (end + head) / 2;
            if (array[middle] == target) {
                return middle + 1;
            }
            if (array[middle] < target) {
                head = middle + 1;
            }
            if (array[middle] > target) {
                end = middle - 1;
            }
        }
        return -1;
    }

}
