package leetcode;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yize on 2014/12/29 to solve LeetCode OJ.
 */
public class Solution{
    /**
     * leetcode 171: 将Excel Sheet的表头转换成数字，如A->1, B->2, ..., AA->26, AB->27.
     * @param s: 代表Excel表头的字符串
     * @return 返回Excel表头对应的整数
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
     * @return 返回输入数组的主元素
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
     * @param n 输入正数
     * @return  返回n对应的Excel表头.
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
     * @return n!的尾数中零的个数
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
     * @return n!的尾数中零的个数
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
     * @param str 整数字符串
     * @return 整数
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
     * @return 输入数组中两数和等于目标值的下标
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

    /**
     * Leetcode 6: 以之字形转换字符串
     * @param s: 待转换的字符串
     * @param nRows: 之字的行数
     * @return 转换后的字符串
     * (超时)
     */
    public String convert(String s, int nRows){
        if(nRows == 0){
            return s;
        }
        int sLength = s.length();
        int nCols = nRows * sLength / (2 * nRows - 1);
        char[][] chs = new char[nRows][nCols];
        int currCharOffset = 0;
        boolean directDown = true;
        for(int col = 0; col < nCols; col++){
            for(int row = 0; row < nRows; row++){
                if(directDown && currCharOffset < sLength){
                    chs[row][col] = s.charAt(currCharOffset++);
                    if(row == nRows - 1){
                        directDown = false;
                    }
                }
                if(!directDown){
                    while(row > 1 && currCharOffset < sLength){
                        chs[--row][++col] = s.charAt(currCharOffset++);
                    }
                    directDown = true;
                    break;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int row = 0; row < nRows; row++){
            for(int col = 0; col < nCols; col++){
                if(Character.isLetterOrDigit(chs[row][col])){
                    stringBuilder.append(chs[row][col]);
                }
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Leetcode 7: 反转整数
     * @param x: 输入的整数
     * @return 反转后的整数
     */
    public int reverse(int x){
        boolean isNegative = false;
        if(x < 0){
            isNegative = true;
            x = Math.abs(x);
        }
        int mod;
        long result = 0;
        while(x > 0){
            mod = x % 10;
            result = result * 10 + mod;
            x = (x - mod) / 10;
        }
        if(result > Integer.MAX_VALUE){
            return 0;
        }
        if(isNegative){
            result *= -1;
        }
        return (int)result;
    }

    /**
     * LeetCode 9: 判断回文数
     * @param x: 输入整数
     * @return 若x是回文数返回true, 否则返回false.
     */
    public boolean isPalindrome(int x){
        String s = x + "";
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
                continue;
            }
            return false;
        }
        return true;
    }

    /**
     * LeetCode 13: 将罗马数字的字符串转换成整数
     * @param s 罗马数字的字符串
     * @return s对应的整数
     */
    public int romanToInt(String s){
        //I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000）
        Map<Character, Integer> charValueMap = new HashMap<Character, Integer>(10);
        Map<Character, Integer> charIndexMap = new HashMap<Character, Integer>(10);
        charValueMap.put('I', 1);
        charValueMap.put('V', 5);
        charValueMap.put('X', 10);
        charValueMap.put('L', 50);
        charValueMap.put('C', 100);
        charValueMap.put('D', 500);
        charValueMap.put('M', 1000);

        charIndexMap.put('I', 1);
        charIndexMap.put('V', 2);
        charIndexMap.put('X', 3);
        charIndexMap.put('L', 4);
        charIndexMap.put('C', 5);
        charIndexMap.put('D', 6);
        charIndexMap.put('M', 7);

        int currIndex = 0;
        int nextIndex = 1;
        int strLen = s.length() - 1;
        int result = 0;
        while(nextIndex <= strLen){
            if(charIndexMap.get(s.charAt(currIndex)) < charIndexMap.get(s.charAt(nextIndex))){
                result += charValueMap.get(s.charAt(nextIndex)) - charValueMap.get(s.charAt(currIndex));
                currIndex += 2;
                nextIndex += 2;
            }else{
                result += charValueMap.get(s.charAt(currIndex));
                currIndex += 1;
                nextIndex += 1;
            }
        }
        if(currIndex <= strLen){
            result += charValueMap.get(s.charAt(currIndex));
        }
        return result;
    }

    public int romanToInt2(String s){
        //I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000）
        char[] sToChars = s.toCharArray();
        int[] charValueArray = new int[128];
        int[] charIndexArray = new int[128];
        charValueArray['I'] = 1;
        charValueArray['V'] = 5;
        charValueArray['X'] = 10;
        charValueArray['L'] = 50;
        charValueArray['C'] = 100;
        charValueArray['D'] = 500;
        charValueArray['M'] = 1000;

        charIndexArray['I'] = 1;
        charIndexArray['V'] = 2;
        charIndexArray['X'] = 3;
        charIndexArray['L'] = 4;
        charIndexArray['C'] = 5;
        charIndexArray['D'] = 6;
        charIndexArray['M'] = 7;
        int currIndex = 0;
        int nextIndex = 1;
        int strLen = s.length() - 1;
        int result = 0;
        while(nextIndex <= strLen){
            if(charIndexArray[sToChars[currIndex]] < charIndexArray[sToChars[nextIndex]]){
                result += charValueArray[sToChars[nextIndex]] - charValueArray[sToChars[currIndex]];
                currIndex += 2;
                nextIndex += 2;
            }else{
                result += charValueArray[sToChars[currIndex]];
                currIndex += 1;
                nextIndex += 1;
            }
        }
        if(currIndex <= strLen){
            result += charValueArray[sToChars[currIndex]];
        }
        return result;
    }

}
