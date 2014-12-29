package leetcode;

/**
 * Created by yize on 2014/12/29.
 */
public class Solution{
    /**
     * leetcode 171: 将Excel Sheet的表头转换成数字，如A->1, B->2, ..., AA->26, AB->27.
     * @param s: 代表Excel表头的字符串
     * @return: 返回Excel表头对应的整数
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
     * @param num: 输入数组
     * @return: 返回输入数组的主元素
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

    /**
     * LeetCode 168: 将给定的正数转换为Excel列表表头的形式，如1->A, 26 -> Z, 28 -> AB.
     * @param n: 输入正数
     * @return: 返回n对应的Excel表头
     */
    public String convertToTitle(int n){
        StringBuilder result = new StringBuilder();
        int remainder;
        while(n != 0){
            remainder = n % 26;
            if(remainder == 0){
                result.insert(0, "Z");
                n = (n - 26) / 26;
            }else{
                result.insert(0, (char)(remainder + 'A' - 1));
                n = (n - remainder) / 26;
            }
        }

        return result.toString();
    }

}
