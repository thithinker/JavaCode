package leetcode;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {
    Solution solution;

    @Override
    protected void setUp() throws Exception {
        solution = new Solution();
        super.setUp();

    }

    /**
     * leetcode 171: 将Excel Sheet的表头转换成数字，如A->1, B->2, ..., AA->26, AB->27.
     */
    public void testTitleToNumber() throws Exception {
        System.out.println("testTitleToNumber");
        assertEquals(2, solution.titleToNumber("B"));
        assertEquals(27, solution.titleToNumber("AA"));
    }

    /**
     * leetcode 169: 找出整数数组中的主元素(数组长度为n，则主元素的个数多于⌊n/2⌋)
     */
    public void testMajorityElement() throws Exception {
        System.out.println("testMajorityElement");
        int[] nums1 = {1,2,3,1,1};
        int[] nums2 = {1,1,2,2,2};
        assertEquals(1, solution.majorityElement(nums1));
        assertEquals(2, solution.majorityElement((nums2)));
    }

    public void testConvertToTitle(){
        System.out.println("testConvertToTitle");
        assertEquals("A", solution.convertToTitle(1));
        assertEquals("Z", solution.convertToTitle(26));
        assertEquals("AB", solution.convertToTitle(28));
    }

    public void testTrailingZeroes(){
        System.out.println("testTrailingZeroes");
        assertEquals(0, solution.trailingZeroes(0));
        assertEquals(0, solution.trailingZeroes(-1));
        assertEquals(1, solution.trailingZeroes(5));
        assertEquals(2, solution.trailingZeroes(11));
        assertEquals(4, solution.trailingZeroes(24));
        assertEquals(6, solution.trailingZeroes(25));
        assertEquals(6, solution.trailingZeroes(26));
        assertEquals(7, solution.trailingZeroes(32));
        assertEquals(22, solution.trailingZeroes(99));
        assertEquals(24, solution.trailingZeroes(101));
        assertEquals(74, solution.trailingZeroes(300));


        assertEquals(536870902, solution.trailingZeroes(2147483647));
        /*int MAX = 1002;
        for (int i = 0; i < MAX; i++){
            assertEquals(solution.trailingZeroes_2(i), solution.trailingZeroes(i));
        }*/
    }

    public void testTrailingZeroes_2(){
        System.out.println("testTrailingZeroes_2");
        assertEquals(0, solution.trailingZeroes_2(0));
        assertEquals(0, solution.trailingZeroes_2(-1));
        assertEquals(1, solution.trailingZeroes_2(5));
        assertEquals(2, solution.trailingZeroes_2(11));
        assertEquals(4, solution.trailingZeroes_2(24));
        assertEquals(6, solution.trailingZeroes_2(25));
        assertEquals(6, solution.trailingZeroes_2(26));
        assertEquals(7, solution.trailingZeroes_2(32));
        assertEquals(22, solution.trailingZeroes_2(99));
        assertEquals(24, solution.trailingZeroes_2(101));
        assertEquals(74, solution.trailingZeroes_2(300));

    }

    public void testAtoi(){
        System.out.println("TestAtoi");
        assertEquals(0, solution.atoi("--"));
        assertEquals(0, solution.atoi(""));
        assertEquals(234, solution.atoi("234"));
        assertEquals(123, solution.atoi("   123"));
        assertEquals(123, solution.atoi("   +123"));
        assertEquals(-123, solution.atoi("   -123"));
        assertEquals(-12, solution.atoi("  -0012a42"));
        assertEquals(-2147483648, solution.atoi("-2147483648"));
        assertEquals(-2147483648, solution.atoi("-2147483649"));
        assertEquals(2147483647, solution.atoi("9223372036854775809"));
    }

    public void testTwoSum(){
        int[] m1 = {6,2,3,7,11,17};
        int[] r1 = solution.twoSum(m1, 9);
        System.out.println(r1[0] + " " + r1[1]);

        int[] m2 = {6,2,3,7,11,17};
        int[] r2 = solution.twoSum(m2, 28);
        System.out.println(r2[0] + " " + r2[1]);

        int[] m3 = {6,2,3,7,1,17};
        int[] r3 = solution.twoSum(m3, 14);
        System.out.println(r3[0] + " " + r3[1]);

        int[] m4 = {0, 3, 4, 0};
        int[] r4 = solution.twoSum(m4, 0);
        System.out.println(r4[0] + " " + r4[1]);
    }

    public void testConvert(){
        /*String s = "PAYPALISHIRING";
        for ( int i = 0; i < s.length(); i++){
            System.out.println("i = " + i + " " + solution.convert(s, i));
        }*/
        String s = "twckwuyvbihajbmhmodminftgpdcbquupwflqfiunpuwtigfwjtgzzcfofjpyd" +
                "jnzqysvgmiyifrrlwpwpyvqadefmvfshsrxsltbxbziiqbvosufqpwsucy" +
                "jyfbhauesgzvfdwnloojejdkzugsrksakzbrzxwudxpjaoyocpxhycrxwz" +
                "rpllpwlsnkqlevjwejkfxmuwvsyopxpjmbuexfwksoywkhsqqevqtpoohpd";
        System.out.println("i = " + 15 + " " + solution.convert(s, 4));
    }

    public void testReverse(){
        assertEquals(321, solution.reverse(123));
        assertEquals(-321, solution.reverse(-123));
        assertEquals(0, solution.reverse(0));
        assertEquals(321, solution.reverse(12300));
        assertEquals(-321, solution.reverse(-12300));
        //assertEquals(0, solution.reverse(1000000003));
        assertEquals(0, solution.reverse(Integer.MIN_VALUE));
        assertEquals(0, solution.reverse(Integer.MAX_VALUE));
        assertEquals(0, solution.reverse(1534236469));

        System.out.println("ABS: " + Math.abs(Integer.MIN_VALUE));
    }

    public void testIsPalindrome(){
        assertEquals(true, solution.isPalindrome(12221));
        assertEquals(true, solution.isPalindrome(1221));
        assertEquals(false, solution.isPalindrome(-12221));
        assertEquals(false, solution.isPalindrome(-1221));
        assertEquals(false, solution.isPalindrome(12211));
        assertEquals(true, solution.isPalindrome(1));
        assertEquals(false, solution.isPalindrome(-2147447412));
    }

    public void testRomanToInt(){
        assertEquals(1, solution.romanToInt("I"));
        assertEquals(10, solution.romanToInt("X"));
        assertEquals(18, solution.romanToInt("XVIII"));
        assertEquals(19, solution.romanToInt("XIX"));
        assertEquals(45, solution.romanToInt("XLV"));
        assertEquals(199, solution.romanToInt("CXCIX"));
        assertEquals(1880, solution.romanToInt("MDCCCLXXX"));
        assertEquals(3333, solution.romanToInt("MMMCCCXXXIII"));

    }

    public void testRomanToInt2(){
        assertEquals(1, solution.romanToInt("I"));
        assertEquals(10, solution.romanToInt("X"));
        assertEquals(18, solution.romanToInt("XVIII"));
        assertEquals(19, solution.romanToInt("XIX"));
        assertEquals(45, solution.romanToInt("XLV"));
        assertEquals(199, solution.romanToInt("CXCIX"));
        assertEquals(1880, solution.romanToInt("MDCCCLXXX"));
        assertEquals(3333, solution.romanToInt("MMMCCCXXXIII"));
    }

    public void testLongestCommonPrefix(){
        String[] strs_1 = {"asdfgqwe", "asdfwer", "asdfgexx"};
        assertEquals("asdf", solution.longestCommonPrefix(strs_1));
        String[] strs_2 = {"asdfgqwe", "assdfwer", "asdfgexx"};
        assertEquals("as", solution.longestCommonPrefix(strs_2));
        String[] strs_3 = {"asdfgqwe", "asdfwer", "basdfgexx"};
        assertEquals("", solution.longestCommonPrefix(strs_3));

        String[] strs_4 = {"asdfgqwe", "asdfgqwe", "asdfgqwe"};
        assertEquals("asdfgqwe", solution.longestCommonPrefix(strs_4));

        String[] strs_5 = {};
        assertEquals("", solution.longestCommonPrefix(strs_5));

        String[] strs_6 = {"abca","abc"};
        assertEquals("abc", solution.longestCommonPrefix(strs_6));
    }

    public void testThreeSum(){
//        int[] num = {-1, 0, 1, 2, -1, -4};
//        solution.threeSum(num);
//        int[] num2 = {2,13,-2,-5,-1,10,6,-8,5,-5,7,-5,-14,-4,-5,10,-15,-2,-14,-6,10,6,-14,-14,-9,-11,8,-3,-2,12,-9,-14,3,5,-12,-13,-8,1,-14,12,12,0,14,5,4,-14,-8,4,-9,-7,14,-13,6,7,-12,5,12,11,-13,-5,0,-6,-12,-12,6,13,12,13,0,5,2,-11,13,1,9,2,2,-14,13,8,-14,4,2,8,-3,-3,-10,-14,-15,14,-12,1,-15,14,-4,6,12,-6,-4,-3,6,5};
//        solution.threeSum(num2);
//
//        int[] num3 = {-5,14,1,-2,11,11,-10,3,-6,0,3,-4,-9,-13,-8,-7,9,8,-7,11,12,-7,4,-7,-1,-5,13,1,-2,8,-13,0,-1,3,13,-13,-1,10,5,1,-13,-15,12,-7,-13,-11,-7,3,13,1,0,2,1,11,10,8,-8,1,-14,-3,-6,-12,12,0,6,2,2,-9,-3,14,-1,-9,14,-4,-1,8,-8,7,-4,12,-14,3,-9,2,0,-13,-13,-1,3,-12,11,4,-9,8,11,5,-5,-10,3,-1,-11,-13,5,-12,-10,11,11,-3,-5,14,-13,-4,-5,-7,6,2,-13,0,8,-3,4,4,-14,2};
//        solution.threeSum(num3);
//
//        int[] num4 = {-5,-1,10,-15,10,-11,-8,-14,5,3,9,3,-11,-4,0,5,5,1,14,2,-13,0,-10,-12,-2,4,-9,-7,14,-2,3,-6,13,-10,-14,8,-14,-15,1,7,4,-5,-13,8,-1,-6,-10,-11,10,11,6,13,-4,11,-14,1,1,14,9,-8,-2,-11,1,-12,-14,-6,3,10,-6,-11,-6,5,-9,-4,-10,5,5,-5,1,1,13,-8,-1,-14,-11,-8,2,-3,-9,-12,4,4,14,12,-1,8,-9,-13,3,0,13,12,-9,12,-7,-12,2,5,-1,-11};
//        solution.threeSum(num4);
//
//        int[] num5 = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
//        solution.threeSum(num5);

        int[] num6 = {0,0,0};
        solution.threeSum(num6);
    }
    public void testThreeSum_2(){
        int[] num = {-1, 0, 1, 2, -1, -4};
        solution.threeSum_2(num);
        int[] num2 = {2,13,-2,-5,-1,10,6,-8,5,-5,7,-5,-14,-4,-5,10,-15,-2,-14,-6,10,6,-14,-14,-9,-11,8,-3,-2,12,-9,-14,3,5,-12,-13,-8,1,-14,12,12,0,14,5,4,-14,-8,4,-9,-7,14,-13,6,7,-12,5,12,11,-13,-5,0,-6,-12,-12,6,13,12,13,0,5,2,-11,13,1,9,2,2,-14,13,8,-14,4,2,8,-3,-3,-10,-14,-15,14,-12,1,-15,14,-4,6,12,-6,-4,-3,6,5};
        solution.threeSum_2(num2);

        int[] num3 = {-5,14,1,-2,11,11,-10,3,-6,0,3,-4,-9,-13,-8,-7,9,8,-7,11,12,-7,4,-7,-1,-5,13,1,-2,8,-13,0,-1,3,13,-13,-1,10,5,1,-13,-15,12,-7,-13,-11,-7,3,13,1,0,2,1,11,10,8,-8,1,-14,-3,-6,-12,12,0,6,2,2,-9,-3,14,-1,-9,14,-4,-1,8,-8,7,-4,12,-14,3,-9,2,0,-13,-13,-1,3,-12,11,4,-9,8,11,5,-5,-10,3,-1,-11,-13,5,-12,-10,11,11,-3,-5,14,-13,-4,-5,-7,6,2,-13,0,8,-3,4,4,-14,2};
        solution.threeSum_2(num3);

        int[] num4 = {-5,-1,10,-15,10,-11,-8,-14,5,3,9,3,-11,-4,0,5,5,1,14,2,-13,0,-10,-12,-2,4,-9,-7,14,-2,3,-6,13,-10,-14,8,-14,-15,1,7,4,-5,-13,8,-1,-6,-10,-11,10,11,6,13,-4,11,-14,1,1,14,9,-8,-2,-11,1,-12,-14,-6,3,10,-6,-11,-6,5,-9,-4,-10,5,5,-5,1,1,13,-8,-1,-14,-11,-8,2,-3,-9,-12,4,4,14,12,-1,8,-9,-13,3,0,13,12,-9,12,-7,-12,2,5,-1,-11};
        solution.threeSum_2(num4);

        int[] num5 = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
        solution.threeSum_2(num5);

        int[] num6 = {0,0,0};
        solution.threeSum_2(num6);
    }
}