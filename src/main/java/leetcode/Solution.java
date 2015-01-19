package leetcode;

import java.math.BigInteger;

import java.util.*;
/**
 * yi ze on 2014/12/29 to solve LeetCode OJ.
 */
public class Solution {
    /**
     * Problem 171: 将Excel Sheet的表头转换成数字，如A->1, B->2, ..., AA->26, AB->27.
     *
     * @param s: 代表Excel表头的字符串
     * @return 返回Excel表头对应的整数
     */
    public int titleToNumber(String s) {
        char[] chs = s.toCharArray();
        int result = 0;
        int len = s.length();
        for (char c : chs) {
            result += (c - 'A' + 1) * (int) Math.pow(26, --len);
        }
        return result;
    }

    /**
     * Problem 169: 找出整数数组中的主元素(数组长度为n，则主元素的个数多于⌊n/2⌋)
     *
     * @param num: 输入数组
     * @return 返回输入数组的主元素
     */
    public int majorityElement(int[] num) {
        int lastNum = num[0];
        int count = 1;
        for (int i = 1; i < num.length; i++) {
            if (num[i] == lastNum) {
                count++;
            } else {
                count--;
                if (count < 1) {
                    lastNum = num[i];
                    count = 1;
                }
            }
        }
        return lastNum;
    }

    /**
     * Problem 168: 将给定的正数转换为Excel列表表头的形式，如1->A, 26 -> Z, 28 -> AB.
     *
     * @param n 输入正数
     * @return 返回n对应的Excel表头.
     */
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        int remainder;
        while (n != 0) {
            remainder = n % 26;
            if (remainder == 0) {
                result.insert(0, "Z");
                n = (n - 26) / 26;
            } else {
                result.insert(0, (char) (remainder + 'A' - 1));
                n = (n - remainder) / 26;
            }
        }

        return result.toString();
    }

    /**
     * Problem 172: 给一个整数，返回该数的阶乘尾数的零的个数。(对数时间复杂度)
     *
     * @param n: 输入整数
     * @return n!的尾数中零的个数
     */
    public int trailingZeroes(int n) {
        int power = 0;
        while (Math.pow(5, power) < n) {
            power++;
        }
        int count = 0;
        while (power > 0) {
            count += n / (long) Math.pow(5, power--);
        }
        return count;
    }

    /**
     * Problem 172: 给一个整数，返回该数的阶乘尾数的零的个数。
     *
     * @param n: 输入整数
     * @return n!的尾数中零的个数
     */
    public int trailingZeroes_2(int n) {
        BigInteger bi = BigInteger.ONE;
        while (n > 0) {
            bi = bi.multiply(new BigInteger(n + ""));
            n--;
        }
        String s = bi.toString();
        int len = s.length();
        int count = 0;
        while (s.charAt(len - 1) == '0') {
            count++;
            len--;
        }
        return count;
    }

    /**
     * Problem 8: 将字符串转换成整数。(注意空字符，非数字符，溢出等)
     *
     * @param str 整数字符串
     * @return 整数
     */
    public int atoi(String str) {
        if (str.equals("")) {
            return 0;
        }
        int off = 0;
        while (str.charAt(off) == ' ') {
            off++;
        }
        str = str.substring(off);
        String sign = "";
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = str.charAt(0) + "";
            str = str.substring(1);
        }
        long number = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                break;
            }
            number = number * 10 + (str.charAt(i) - '0');
            if (number > Integer.MAX_VALUE) {
                if (sign.equals("-") && number > 2147483648L) {
                    return Integer.MIN_VALUE;
                } else if ((sign.equals("") || sign.equals("+")) && number > 2147483647) {
                    return Integer.MAX_VALUE;
                }
            }
        }
        if (sign.equals("-")) {
            return -1 * (int) number;
        } else {
            return (int) number;
        }
    }

    /**
     * Problem 1: 找出整数数组中两个数的和等于目标值的索引。(假定输入有且仅有一种结果)
     *
     * @param numbers: 输入数组
     * @param target:  目标值
     * @return 输入数组中两数和等于目标值的下标
     */
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] tmp = new int[len];
        System.arraycopy(numbers, 0, tmp, 0, len);

        Arrays.sort(tmp);
        int left = 0;
        int right = len - 1;
        int firstNum = 0;
        int secondNum = 0;
        while (left < right) {
            if (tmp[left] + tmp[right] < target) {
                left++;
                continue;
            } else if (tmp[left] + tmp[right] > target) {
                right--;
                continue;
            }
            firstNum = tmp[left];
            secondNum = tmp[right];
            break;
        }
        int firstOffset = -1;
        int secondOffset = -1;
        for (int i = 0; i < len; i++) {
            if (numbers[i] == firstNum || numbers[i] == secondNum) {
                if (firstOffset == -1) {
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
     * Problem 6: 以之字形转换字符串
     *
     * @param s:     待转换的字符串
     * @param nRows: 之字的行数
     * @return 转换后的字符串
     * (超时)
     */
    public String convert(String s, int nRows) {
        if (nRows == 0) {
            return s;
        }
        int sLength = s.length();
        int nCols = nRows * sLength / (2 * nRows - 1);
        char[][] chs = new char[nRows][nCols];
        int currCharOffset = 0;
        boolean directDown = true;
        for (int col = 0; col < nCols; col++) {
            for (int row = 0; row < nRows; row++) {
                if (directDown && currCharOffset < sLength) {
                    chs[row][col] = s.charAt(currCharOffset++);
                    if (row == nRows - 1) {
                        directDown = false;
                    }
                }
                if (!directDown) {
                    while (row > 1 && currCharOffset < sLength) {
                        chs[--row][++col] = s.charAt(currCharOffset++);
                    }
                    directDown = true;
                    break;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int row = 0; row < nRows; row++) {
            for (int col = 0; col < nCols; col++) {
                if (Character.isLetterOrDigit(chs[row][col])) {
                    stringBuilder.append(chs[row][col]);
                }
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Problem 7: 反转整数
     *
     * @param x: 输入的整数
     * @return 反转后的整数
     */
    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }
        int mod;
        long result = 0;
        while (x > 0) {
            mod = x % 10;
            result = result * 10 + mod;
            x = (x - mod) / 10;
        }
        if (result > Integer.MAX_VALUE) {
            return 0;
        }
        if (isNegative) {
            result *= -1;
        }
        return (int) result;
    }

    /**
     * Problem 9: 判断回文数
     *
     * @param x: 输入整数
     * @return 若x是回文数返回true, 否则返回false.
     */
    public boolean isPalindrome(int x) {
        String s = x + "";
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
                continue;
            }
            return false;
        }
        return true;
    }

    /**
     * Problem 13: 将罗马数字的字符串转换成整数
     *
     * @param s 罗马数字的字符串
     * @return s对应的整数
     */
    public int romanToInt(String s) {
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
        while (nextIndex <= strLen) {
            if (charIndexMap.get(s.charAt(currIndex)) < charIndexMap.get(s.charAt(nextIndex))) {
                result += charValueMap.get(s.charAt(nextIndex)) - charValueMap.get(s.charAt(currIndex));
                currIndex += 2;
                nextIndex += 2;
            } else {
                result += charValueMap.get(s.charAt(currIndex));
                currIndex += 1;
                nextIndex += 1;
            }
        }
        if (currIndex <= strLen) {
            result += charValueMap.get(s.charAt(currIndex));
        }
        return result;
    }

    public int romanToInt2(String s) {
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
        while (nextIndex <= strLen) {
            if (charIndexArray[sToChars[currIndex]] < charIndexArray[sToChars[nextIndex]]) {
                result += charValueArray[sToChars[nextIndex]] - charValueArray[sToChars[currIndex]];
                currIndex += 2;
                nextIndex += 2;
            } else {
                result += charValueArray[sToChars[currIndex]];
                currIndex += 1;
                nextIndex += 1;
            }
        }
        if (currIndex <= strLen) {
            result += charValueArray[sToChars[currIndex]];
        }
        return result;
    }

    /**
     * Problem 14: 找出字符串数组中各字符串的最长公共前缀
     *
     * @param strs 字符串数组
     * @return 公共前缀
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int arrLen = strs.length;
        int offset = 1;
        int commonStrOffset = 0;
        boolean finished = false;
        boolean stepAhead = true;
        String tmp;
        while (!finished) {
            if (offset > strs[0].length()) {
                offset = strs[0].length();
            }
            tmp = strs[0].substring(0, offset);
            for (int i = 0; i < arrLen; i++) {
                if (strs[i].startsWith(tmp)) {
                    if (i == arrLen - 1) {
                        if (commonStrOffset < offset) {
                            commonStrOffset = offset;
                        } else {
                            finished = true;
                        }
                    }
                    continue;
                }
                offset -= 1;
                stepAhead = false;
                if (offset <= commonStrOffset || offset == 0) {
                    finished = true;
                }
                break;
            }
            if (stepAhead) {
                offset *= 2;
            }
        }
        return strs[0].substring(0, commonStrOffset);
    }

    public List<List<Integer>> threeSum(int[] num) {
        Set<List<Integer>> resultSet = new HashSet<List<Integer>>();
        List<Integer> positive = new ArrayList<Integer>();
        List<Integer> negative = new ArrayList<Integer>();
        int countZero = 0;
        for (int i : num) {
            if (i < 0) {
                negative.add(i);
            } else {
                positive.add(i);
                if (i == 0) {
                    countZero++;
                }
            }
        }

        int positiveSize = positive.size();
        int negativeSize = negative.size();

        if (countZero >= 3) {
            List<Integer> list = new ArrayList<Integer>(3);
            list.add(0);
            list.add(0);
            list.add(0);
            resultSet.add(list);
        }
        for (int i = 0; i < positiveSize; i++) {
            for (int j = 0; j < positiveSize; j++) {
                for (int z : negative) {
                    if (positive.get(i) + positive.get(j) + z == 0 && i != j) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(z);
                        list.add(positive.get(i));
                        list.add(positive.get(j));
                        Collections.sort(list);
                        resultSet.add(list);
                    }
                }
            }
        }

        for (int i = 0; i < negativeSize; i++) {
            for (int j = 0; j < negativeSize; j++) {
                for (int z : positive) {
                    if (negative.get(i) + negative.get(j) + z == 0 && i != j) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(z);
                        list.add(negative.get(i));
                        list.add(negative.get(j));
                        Collections.sort(list);
                        resultSet.add(list);
                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (List<Integer> l : resultSet) {
            result.add(l);
            //System.out.println("Result: " + Arrays.deepToString(l.toArray()));
        }
        return result;
    }

    public List<List<Integer>> threeSum_2(int[] num) {
        Set<List<Integer>> resultSet = new HashSet<List<Integer>>();
        List<Integer> positive = new ArrayList<Integer>();
        List<Integer> negative = new ArrayList<Integer>();
        int countZero = 0;
        for (int i : num) {
            if (i < 0) {
                negative.add(i);
            } else {
                positive.add(i);
                if (i == 0) {
                    countZero++;
                }
            }
        }

        BitSet positiveBitSet = new BitSet();
        BitSet negativeBitSet = new BitSet();

        for (int i : positive) {
            positiveBitSet.set(i);
        }
        for (int i : negative) {
            negativeBitSet.set(i * -1);
        }

        int positiveSize = positive.size();
        int negativeSize = negative.size();

        int tmp;
        List<Integer> list;

        if (countZero >= 3) {
            list = new ArrayList<Integer>(3);
            list.add(0);
            list.add(0);
            list.add(0);
            resultSet.add(list);
        }
        for (int i = 0; i < positiveSize; i++) {
            for (int j = 0; j < positiveSize; j++) {
                tmp = positive.get(i) + positive.get(j);
                if (negativeBitSet.get(tmp) && i != j) {
                    list = new ArrayList<Integer>();
                    list.add(tmp * -1);
                    if (positive.get(i) < positive.get(j)) {
                        list.add(positive.get(i));
                        list.add(positive.get(j));
                    } else {
                        list.add(positive.get(j));
                        list.add(positive.get(i));
                    }
                    resultSet.add(list);
                }
            }
        }

        for (int i = 0; i < negativeSize; i++) {
            for (int j = 0; j < negativeSize; j++) {
                tmp = (negative.get(i) + negative.get(j)) * -1;
                if (positiveBitSet.get(tmp) && i != j) {
                    list = new ArrayList<Integer>();
                    if (negative.get(i) < negative.get(j)) {
                        list.add(negative.get(i));
                        list.add(negative.get(j));
                    } else {
                        list.add(negative.get(j));
                        list.add(negative.get(i));
                    }
                    list.add(tmp);
                    resultSet.add(list);
                }
            }
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (List<Integer> l : resultSet) {
            result.add(l);
            //System.out.println("Result: " + Arrays.deepToString(l.toArray()));
        }
        return result;
    }

    /**
     * Problem 20: 判断输入括号是否是合法的
     *
     * @param s 输入括号
     * @return 若为合法括号返回true，否则返回false
     */
    public boolean isValid(String s) {
        int[] charToInt = new int[128];
        charToInt['('] = 1;
        charToInt[')'] = -1;
        charToInt['{'] = 2;
        charToInt['}'] = -2;
        charToInt['['] = 3;
        charToInt[']'] = -3;
        Stack<Integer> stack = new Stack<Integer>();
        char[] sToChar = s.toCharArray();
        for (char c : sToChar) {
            if (stack.size() > 0 && stack.peek() + charToInt[c] == 0) {
                stack.pop();
            } else {
                stack.push(charToInt[c]);
            }
        }
        return stack.size() == 0;
    }

    public boolean isValid_2(String s) {
        int[] charToInt = new int[128];
        int[] stack = new int[s.length()];
        int currSize = -1;
        charToInt['('] = 1;
        charToInt[')'] = -1;
        charToInt['{'] = 2;
        charToInt['}'] = -2;
        charToInt['['] = 3;
        charToInt[']'] = -3;
        char[] sToChar = s.toCharArray();
        for (char c : sToChar) {
            if (stack[currSize] + charToInt[c] == 0) {
                currSize--;
            } else {
                stack[currSize++] = charToInt[c];
            }
        }
        System.out.println("currSize: " + currSize);
        return currSize == 0;
    }

    /**
     * Problem 19: 删除列表从尾部数第n个元素（n合法）
     *
     * @param head 列表头节点
     * @param n    倒数第n个数
     * @return 返回删除倒数第n个元素后的列表的头节点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode delNode = head;
        int len = 0;
        while (delNode != null) {
            delNode = delNode.next;
            len++;
        }
        int delIndex = len - n;
        if (delIndex <= 0) {
            head = head.next;
            return head;
        } else {
            ListNode currNode = head;
            delNode = head.next;
            while (delIndex > 1) {
                delNode = delNode.next;
                currNode = currNode.next;
                delIndex--;
            }
            if (delNode.next == null) {
                currNode.next = null;
            } else {
                currNode.next = delNode.next;
            }
            return head;
        }
    }

    /**
     * Problem 16: 对于给定的整数数组，在该数组s中找到三个数，使得这三个数的和最接近目标数
     *
     * @param num    输入数组
     * @param target 目标数
     * @return 找到的三个这样数的和
     */
    public int threeSumClosest(int[] num, int target) {      //超时
        int size = num.length;
//        Set<Integer> set = new TreeSet<Integer>();
        int tmpSize = size * (size - 1) / 2;
        int[] tmp = new int[tmpSize];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < row; col++) {
                tmp[row * (row - 1) / 2 + col] = num[row] + num[col];
            }
        }
        int row, col, bigger, t;
        int min = Math.abs(num[0] + num[1] + num[2] - target);
        int result = num[0] + num[1] + num[2];
        for (int i = 0; i < tmpSize; i++) {
            row = (int) ((1 + Math.sqrt(1 + 8 * i)) / 2);
            col = i - row * (row - 1) / 2;
            bigger = row > col ? row : col;
            for (int j = bigger + 1; j < size; j++) {
                t = Math.abs(tmp[i] + num[j] - target);
                if (t < min) {
                    result = tmp[i] + num[j];
                    min = t;
                }
            }
        }
        return result;
    }

    /**
     * Problem 136: Give an array, every element appears twice except one, find it.
     *
     * @param A Input array
     * @return The number which appears once
     */
    public int singleNumber(int[] A) {
        int result = A[0];
        int len = A.length;
        for (int i = 1; i < len; i++) {
            result = result ^ A[i];
        }
        return result;
    }

    /**
     * Problem 137: Give an array, every element appears three times except one, find it.
     *
     * @param A Input array
     * @return The number which appears once
     */
    public int singleNumber2(int[] A) {
        int len = A.length;
        long sum = 0;
        Set<Integer> set = new HashSet<Integer>(2 * len);
        for (int i : A) {
            sum += i;
            set.add(i);
        }
        long sum2 = 0;
        for (int i : set) {
            sum2 += i;
        }
        return (int) ((sum2 * 3 - sum) / 2);
    }

    public int singleNumber2_2(int[] A) {
        int result = 0;
        int bit;
        for (int i = 0; i < 32; i++) {
            bit = 0;
            for (int j : A){
                bit += (j >> i) & 1;
            }
            bit = bit % 3;
            result |= bit << i;
        }
        return result;
    }

    /**
     * Problem 165: 比较两个版本号的大小
     * @param version1 版本号1
     * @param version2 版本号2
     * @return 若version1>version2则返回1，version1<version2返回-1，否则返回0.
     */
    public int compareVersion(String version1, String version2){
        String[] strs1 = version1.split("\\.");
        String[] strs2 = version2.split("\\.");
        int len1 = strs1.length;
        int len2 = strs2.length;
        int max = len1 > len2 ? len1 : len2;
        int[] v1 = new int[max];
        int[] v2 = new int[max];
        for(int i = 0; i < len1; i++){
            v1[i] = Integer.valueOf(strs1[i]);
        }
        for(int i = 0; i < len2; i++){
            v2[i] = Integer.valueOf(strs2[i]);
        }
        int off = 0;
        while(off < max){
            if(v1[off] == v2[off]){
                off++;
            }else if(v1[off] > v2[off]){
                return 1;
            }else if(v1[off] < v2[off]){
                return -1;
            }
        }
        return 0;
    }

    /**
     * Problem 26: For a sorted array, count its elements number after remove the duplicates.
     * @param A sorted array
     * @return element number
     */
    public int removeDuplicates(int[] A){
        int len = A.length;
        if(len < 1){
            return 0;
        }
        int countedNumber = A[0] == 0 ? -1 : 0;
        int aheadNumber;
        int off = 0;
        int count = 0;
        while(off < len){
            aheadNumber = A[off];
            if(countedNumber != aheadNumber){
                countedNumber = aheadNumber;
                A[count++] = countedNumber;
            }
            off++;
        }
        return count;
    }

    /**
     * Problem 27: 删除给定数组中指定元素，返回剩余元素的个数
     * @param A 输入数组
     * @param elem 指定元素
     * @return 剩余元素个数
     */
    public int removeElement(int[] A, int elem){
        int left = 0;
        int len = A.length;
        int right = len - 1;
        while(left <= right){
            while(left < len && A[left] != elem){
                left++;
            }
            while(right >= 0 && A[right] == elem){
                right--;
            }
            if(left < right){
                A[left++] = A[right];
                A[right--] = elem;
            }
        }
        return left;
    }

    /**
     * Problem 36:判断是否是合法数独
     * @param board 输入二维数组作为数独
     * @return 若board是合法数组返回True，否则返回False
     */
    public boolean isValidSudoku(char[][] board){
        Set<Character> set;
        for(int row = 0; row < 9; row++){
            set = new HashSet<Character>(16);
            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.'){
                    continue;
                }
                if(!set.add(board[row][col])){
                    return false;
                }
            }
        }

        for(int col = 0; col < 9; col++){
            set = new HashSet<Character>(16);
            for(int row = 0; row < 9; row++){
                if(board[row][col] =='.'){
                    continue;
                }
                if(!set.add(board[row][col])){
                    return false;
                }
            }
        }
        int startRow, startCol;
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                startRow = 3 * row;
                startCol = 3 * col;
                set = new HashSet<Character>(16);
                for(int innerRow = 0; innerRow < 3; innerRow++){
                    for(int innerCol = 0; innerCol < 3; innerCol++){
                        if(board[startRow + innerRow][startCol + innerCol] == '.'){
                            continue;
                        }
                        if(!set.add(board[startRow + innerRow][startCol + innerCol])){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku_2(char[][] board){
        int[] nums;
        for(int row = 0; row < 9; row++){
            nums = new int[64];
            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.'){
                    continue;
                }
                nums[board[row][col]]++;
                if(nums[board[row][col]] > 1){
                    return false;
                }
            }
        }

        for(int col = 0; col < 9; col++){
            nums = new int[64];
            for(int row = 0; row < 9; row++){
                if(board[row][col] =='.'){
                    continue;
                }
                nums[board[row][col]]++;
                if(nums[board[row][col]] > 1){
                    return false;
                }
            }
        }
        int startRow, startCol;
        int tmpRow, tmpCol;
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                startRow = 3 * row;
                startCol = 3 * col;
                nums = new int[64];
                for(int innerRow = 0; innerRow < 3; innerRow++){
                    for(int innerCol = 0; innerCol < 3; innerCol++){
                        tmpRow = startRow + innerRow;
                        tmpCol = startCol + innerCol;
                        if(board[tmpRow][tmpCol] == '.'){
                            continue;
                        }
                        nums[board[tmpRow][tmpCol]]++;
                        if(nums[board[tmpRow][tmpCol]] > 1){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    String countSay(String s){
        int len = s.length();
        int[] tmp = new int[len];
        int now = 0;
        for(int i = 0; i < len; i++){
            if(s.charAt(now) == s.charAt(i)){
                tmp[now]++;
            }else{
                now = i;
                tmp[now]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            if(tmp[i] != 0){
                sb.append(tmp[i]).append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    /**
     * Problem 37: 可以如下读取数1的序列：1，11，21，1211，111221，312211，...。对于输入数n, 返回该序列的给定的第n个序列读数.
     * @param n 输入
     * @return 第n个序列，如n为1，则返回1，n为4，则返回1211.
     */
    public String countAndSay(int n){
        String[] results = new String[n + 1];
        results[0] = 1 + "";
        int i = 0;
        String tmp = results[0];
        while(i < n){
            tmp = countSay(tmp);
            results[i + 1] = tmp;
            i++;
        }
//        System.out.println("Result: " + results[n - 1]);
        return results[n - 1];
    }

    /**
     * Problem 58: 计算给定字符串中最后一个单词的长度
     * @param s 输入字符串
     * @return 最后一个单词的长度
     */
    public int lengthOfLastWord(String s){
        s = s.trim();
        int result = 0;
        int len = s.length() - 1;
        for (int i = len; i > -1 ; i--) {
            if(s.charAt(i) == ' '){
                break;
            }
            result++;
        }
        return result;
    }

    public int lengthOfLastWord_2(String s){
        s = s.trim();
        int len = s.length() - 1;
        int i;
        for(i = len; i > -1; i--){
            if(s.charAt(i) == ' '){
                break;
            }
        }
        return len - i;
    }

    /**
     * Problem 67: 求字符串表示的二进制的和
     * @param a 二进制字符串
     * @param b 二进制字符串
     * @return a与b的和
     */
    public String addBinary(String a, String b){
        int carry = 0;
        StringBuilder result = new StringBuilder("");
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int tmp;
        while(lenA > -1 && lenB > -1){
            tmp = (a.charAt(lenA) - '0') + (b.charAt(lenB) - '0') + carry;
            result.insert(0, tmp % 2);
            carry = tmp / 2;
            lenA--;
            lenB--;
        }
        while(lenA > -1){
            tmp = (a.charAt(lenA) - '0') + carry;
            result.insert(0, tmp % 2);
            carry = tmp / 2;
            lenA--;
        }
        while(lenB > -1){
            tmp = (b.charAt(lenB) - '0') + carry;
            result.insert(0, tmp % 2);
            carry = tmp / 2;
            lenB--;
        }
        if(carry == 1){
            result.insert(0, 1);
        }
        return result.toString();
    }

    public String addBinary_2(String a, String b){
        int carry = 0;
        StringBuilder result = new StringBuilder("");
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        String strLong, strShort;
        int lenLong, lenShort;
        if(lenA > lenB){
            strLong = a;
            strShort = b;
            lenLong = lenA;
            lenShort = lenB;
        }else{
            strLong = b;
            strShort = a;
            lenLong = lenB;
            lenShort = lenA;
        }
        int tmp;
        while(lenLong > -1 && lenShort > -1){
            tmp = (strLong.charAt(lenLong) - '0') + (strShort.charAt(lenShort) - '0') + carry;
            result.insert(0, tmp % 2);
            carry = tmp / 2;
            lenLong--;
            lenShort--;
        }
        while(lenLong> -1){
            tmp = (strLong.charAt(lenLong) - '0') + carry;
            result.insert(0, tmp % 2);
            carry = tmp / 2;
            lenLong--;
        }
        if(carry == 1){
            result.insert(0, 1);
        }
        return result.toString();
    }

    public String addBinary_3(String a, String b){
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }













}
