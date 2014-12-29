package leetcode;

/**
 * Created by yize on 2014/12/29.
 */
public class Solution{
    /**
     * leetcode 171: 将Excel Sheet的表头转换成数字，如A->1, B->2, ..., AA->26, AB->27.
     */
    public int titleToNumber(String s){
        char[] chs = s.toCharArray();
        int result = 0;
        int len = s.length();
        for(char c : chs){
            result += (c - 'A' + 1) * (int) Math.pow(26, --len);
        }
        return result;
    }

    /**
     * leetcode 169: 找出整数数组中的主元素(数组长度为n，则主元素的个数多于⌊n/2⌋)
     */
    public int majorityElement(int[] num){
        int lastNum = num[0];
        int count = 1;
        for (int i = 1; i < num.length; i++){
            if(num[i] == lastNum){
                count++;
            }else{
                count--;
                if (count < 1){
                    lastNum = num[i];
                    count = 1;
                }
            }
        }
        return lastNum;
    }

}
