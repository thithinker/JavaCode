package leetcode;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by yize on 2014/12/29 to solve LeetCode OJ.
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

    /**
     * LeetCode 172: 给一个整数，返回该数的阶乘尾数的零的个数。(对数时间复杂度)
     * @param n: 输入整数
     * @return: n!的尾数中零的个数
     */
    public int trailingZeroes(int n){
        int power = 0;
        while(Math.pow(5, power) < n){
            power++;
        }
        int count = 0;
        while(power > 0){
            count += n / (long)Math.pow(5, power--);
        }
        return count;
    }

    /**
     * LeetCode 172: 给一个整数，返回该数的阶乘尾数的零的个数。
     * @param n: 输入整数
     * @return: n!的尾数中零的个数
     */
    public int trailingZeroes_2(int n){
        BigInteger bi = BigInteger.ONE;
        while(n > 0){
            bi = bi.multiply(new BigInteger(n + ""));
            n--;
        }
        String s = bi.toString();
        int len = s.length();
        int count = 0;
        while(s.charAt(len - 1) == '0'){
            count++;
            len--;
        }
        return count;
    }

    /**
     * LeetCode 8: 将字符串转换成整数。(注意空字符，非数字符，溢出等)
     * @param str
     * @return
     */
    public int atoi(String str){
        if(str.equals("")){
            return 0;
        }
        int off = 0;
        while(str.charAt(off) == ' '){
            off++;
        }
        str = str.substring(off);
        String sign = "";
        if(str.charAt(0) == '-' || str.charAt(0) == '+'){
            sign = str.charAt(0) + "";
            str = str.substring(1);
        }
        long number = 0;
        for(int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                break;
            }
            number = number * 10 + (str.charAt(i) - '0');
            if(number > Integer.MAX_VALUE){
                if(sign.equals("-") && number > 2147483648L){
                    return Integer.MIN_VALUE;
                }else if((sign.equals("") || sign.equals("+")) && number > 2147483647){
                    return Integer.MAX_VALUE;
                }
            }
        }
        if(sign.equals("-")){
            return -1 * (int)number;
        }else{
            return (int)number;
        }
    }

    /**
     * Leetcode 1: 找出整数数组中两个数的和等于目标值的索引。(假定输入有且仅有一种结果)
     * @param numbers: 输入数组
     * @param target: 目标值
     * @return: 输入数组中两数和等于目标值的下标
     */
    public int[] twoSum(int[] numbers, int target){
        int len = numbers.length;
        int[] tmp = new int[len];
        System.arraycopy(numbers, 0, tmp, 0, len);

        Arrays.sort(tmp);
        int left = 0;
        int right = len - 1;
        int firstNum = 0;
        int secondNum = 0;
        while(left < right) {
            if (tmp[left] + tmp[right] < target) {
                left++;
                continue;
            }else if(tmp[left] + tmp[right] > target){
                right--;
                continue;
            }
            firstNum = tmp[left];
            secondNum = tmp[right];
            break;
        }
        int firstOffset = -1;
        int secondOffset = -1;
        for (int i = 0; i < len; i++){
            if(numbers[i] == firstNum || numbers[i] == secondNum){
                if(firstOffset == -1){
                    firstOffset = i + 1;
                    continue;
                }
                secondOffset = i + 1;
                break;
            }
        }
        return new int[]{firstOffset, secondOffset};
    }
}
