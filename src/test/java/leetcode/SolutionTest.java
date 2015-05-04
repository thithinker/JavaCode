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

//        String s = "twckwuyvbihajbmhmodminftgpdcbquupwflqfiunpuwtigfwjtgzzcfofjpyd" +
//                "jnzqysvgmiyifrrlwpwpyvqadefmvfshsrxsltbxbziiqbvosufqpwsucy" +
//                "jyfbhauesgzvfdwnloojejdkzugsrksakzbrzxwudxpjaoyocpxhycrxwz" +
//                "rpllpwlsnkqlevjwejkfxmuwvsyopxpjmbuexfwksoywkhsqqevqtpoohpd";
//        System.out.println("i = " + 15 + " " + solution.convert(s, 4));

        String s1 = "a";
        assertEquals("a", solution.convert(s1, 2));
        String s2 = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.";
        String expect2 = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.";
        assertEquals(expect2, solution.convert(s2, 1));

//        char[] chs = new char[3];
//        System.out.println(chs[0] + 1);
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
        assertEquals(1, solution.romanToInt2("I"));
        assertEquals(10, solution.romanToInt2("X"));
        assertEquals(18, solution.romanToInt2("XVIII"));
        assertEquals(19, solution.romanToInt2("XIX"));
        assertEquals(45, solution.romanToInt2("XLV"));
        assertEquals(199, solution.romanToInt2("CXCIX"));
        assertEquals(1880, solution.romanToInt2("MDCCCLXXX"));
        assertEquals(3333, solution.romanToInt2("MMMCCCXXXIII"));
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
        int[] num = {-1, 0, 1, 2, -1, -4};
        solution.threeSum(num);
        int[] num2 = {2,13,-2,-5,-1,10,6,-8,5,-5,7,-5,-14,-4,-5,10,-15,-2,-14,-6,10,6,-14,-14,-9,-11,8,-3,-2,12,-9,-14,3,5,-12,-13,-8,1,-14,12,12,0,14,5,4,-14,-8,4,-9,-7,14,-13,6,7,-12,5,12,11,-13,-5,0,-6,-12,-12,6,13,12,13,0,5,2,-11,13,1,9,2,2,-14,13,8,-14,4,2,8,-3,-3,-10,-14,-15,14,-12,1,-15,14,-4,6,12,-6,-4,-3,6,5};
        solution.threeSum(num2);

        int[] num3 = {-5,14,1,-2,11,11,-10,3,-6,0,3,-4,-9,-13,-8,-7,9,8,-7,11,12,-7,4,-7,-1,-5,13,1,-2,8,-13,0,-1,3,13,-13,-1,10,5,1,-13,-15,12,-7,-13,-11,-7,3,13,1,0,2,1,11,10,8,-8,1,-14,-3,-6,-12,12,0,6,2,2,-9,-3,14,-1,-9,14,-4,-1,8,-8,7,-4,12,-14,3,-9,2,0,-13,-13,-1,3,-12,11,4,-9,8,11,5,-5,-10,3,-1,-11,-13,5,-12,-10,11,11,-3,-5,14,-13,-4,-5,-7,6,2,-13,0,8,-3,4,4,-14,2};
        solution.threeSum(num3);

        int[] num4 = {-5,-1,10,-15,10,-11,-8,-14,5,3,9,3,-11,-4,0,5,5,1,14,2,-13,0,-10,-12,-2,4,-9,-7,14,-2,3,-6,13,-10,-14,8,-14,-15,1,7,4,-5,-13,8,-1,-6,-10,-11,10,11,6,13,-4,11,-14,1,1,14,9,-8,-2,-11,1,-12,-14,-6,3,10,-6,-11,-6,5,-9,-4,-10,5,5,-5,1,1,13,-8,-1,-14,-11,-8,2,-3,-9,-12,4,4,14,12,-1,8,-9,-13,3,0,13,12,-9,12,-7,-12,2,5,-1,-11};
        solution.threeSum(num4);

        int[] num5 = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
        solution.threeSum(num5);

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

    public void testIsValid(){
        assertEquals(true, solution.isValid("()"));
        assertEquals(true, solution.isValid("([])"));
        assertEquals(true, solution.isValid("()[]{}"));
        assertEquals(true, solution.isValid("()[{}]"));
        assertEquals(true, solution.isValid("({[][]})"));
        assertEquals(false, solution.isValid("("));
        assertEquals(false, solution.isValid("(]"));
        assertEquals(false, solution.isValid("([]}"));
        assertEquals(false, solution.isValid("({}]]"));
    }

//    public void testIsValid_2(){
////        assertEquals(true, solution.isValid_2("()"));
//        assertEquals(true, solution.isValid_2("([])"));
//        assertEquals(true, solution.isValid_2("()[]{}"));
//        assertEquals(true, solution.isValid_2("()[{}]"));
//        assertEquals(true, solution.isValid_2("({[][]})"));
//        assertEquals(false, solution.isValid_2("("));
//        assertEquals(false, solution.isValid_2("(]"));
//        assertEquals(false, solution.isValid_2("([]}"));
//        assertEquals(false, solution.isValid_2("({}]]"));
//    }

    public void testRemoveNthNodeFromEnd(){
        int[] arr = {2,3,6,4,1,4,5};
        ListNode head = TestTools.createList(arr);
        TestTools.printList(head);
        solution.removeNthFromEnd(head, 2);
        TestTools.printList(head);

        System.out.println();

        int[] arr2 = {1, 2};
        ListNode head2 = TestTools.createList(arr2);
        TestTools.printList(head2);
        head2 = solution.removeNthFromEnd(head2, 2);
        TestTools.printList(head2);

        System.out.println();

        int[] arr3 = {1};
        ListNode head3 = TestTools.createList(arr3);
        TestTools.printList(head3);
        head3 = solution.removeNthFromEnd(head3, 1);
        TestTools.printList(head3);
        System.out.println();

        int[] arr4 = {1, 2};
        ListNode head4 = TestTools.createList(arr4);
        TestTools.printList(head4);
        head4 = solution.removeNthFromEnd(head4, 1);
        TestTools.printList(head4);

    }

    public void testThreeSumClosest(){
        int[] num1 = {-1, 2, 1, -4};
        assertEquals(2, solution.threeSumClosest(num1, 1));
        int[] num2 = {-8, 2,3,4,8, 0};
        assertEquals(2, solution.threeSumClosest(num2, 1));
        int[] num3 = {43,75,-90,47,-49,72,17,-31,-68,-22,-21,-30,65,88,-75,23,97,-61,53,87,-3,33,20,51,-79,43,80,-9,34,-89,-7,93,43,55,-94,29,-32,-49,25,72,-6,35,53,63,6,-62,-96,-83,-73,66,-11,96,-90,-27,78,-51,79,35,-63,85,-82,-15,100,-82,1,-4,-41,-21,11,12,12,72,-82,-22,37,47,-18,61,60,55,22,-6,26,-60,-42,-92,68,45,-1,-26,5,-56,-1,73,92,-55,-20,-43,-56,-15,7,52,35,-90,63,41,-55,-58,46,-84,-92,17,-66,-23,96,-19,-44,77,67,-47,-48,99,51,-25,19,0,-13,-88,-10,-67,14,7,89,-69,-83,86,-70,-66,-38,-50,66,0,-67,-91,-65,83,42,70,-6,52,-21,-86,-87,-44,8,49,-76,86,-3,87,-32,81,-58,37,-55,19,-26,66,-89,-70,-69,37,0,19,-65,38,7,3,1,-96,96,-65,-52,66,5,-3,-87,-16,-96,57,-74,91,46,-79,0,-69,55,49,-96,80,83,73,56,22,58,-44,-40,-45,95,99,-97,-22,-33,-92,-51,62,20,70,90};
        assertEquals(284, solution.threeSumClosest(num3, 284));
        int[] num4 = {43,75,-90,47,-49,72};
        assertEquals(194, solution.threeSumClosest(num4, 284));

        System.out.println("END");
    }

    public void testSingleNumber(){
        int[] a1 = {1,2,3,4,3,2,1};
        assertEquals(4, solution.singleNumber(a1));
        int[] a2 = {1};
        assertEquals(1, solution.singleNumber(a2));
    }

    public void testSingleNumber2(){
        int[] a1 = {1,2,3,4,3,2,1, 1, 2,3};
        assertEquals(4, solution.singleNumber2(a1));
        int[] a2 = {1};
        assertEquals(1, solution.singleNumber2(a2));
    }

    public void testSingleNumber2_2(){
        int[] a1 = {1,2,3,4,3,2,1, 1, 2,3};
        assertEquals(4, solution.singleNumber2_2(a1));
        int[] a2 = {1};
        assertEquals(1, solution.singleNumber2_2(a2));
    }

    public void testCompareVersion(){
        assertEquals(0, solution.compareVersion("01", "1"));
        assertEquals(0, solution.compareVersion("1.0", "1"));
        assertEquals(0, solution.compareVersion("2.2.0", "2.2"));
        assertEquals(0, solution.compareVersion("1.1", "1.1"));
        assertEquals(-1, solution.compareVersion("1.1", "1.2"));
        assertEquals(-1, solution.compareVersion("1.0", "1.1"));
        assertEquals(1, solution.compareVersion("1.5", "1.1"));
        assertEquals(1, solution.compareVersion("2.1", "1.1"));
        assertEquals(1, solution.compareVersion("1.1.2", "1.1"));
        assertEquals(0, solution.compareVersion("1.1.2.3.5", "1.1.2.3.5"));
        assertEquals(-1, solution.compareVersion("1.1.2.3.5", "1.1.3.3.5"));
    }

    public void testRemoveDuplicates(){
        assertEquals(0, solution.removeDuplicates(new int[]{}));
        assertEquals(1, solution.removeDuplicates(new int[]{0}));

        assertEquals(3, solution.removeDuplicates(new int[]{1, 2, 2, 3}));
        assertEquals(2, solution.removeDuplicates(new int[]{1, 3}));
        assertEquals(5, solution.removeDuplicates(new int[]{1, 2, 2, 2, 2, 2, 4, 4, 5, 5, 5, 7}));
        assertEquals(3, solution.removeDuplicates(new int[]{1, 2, 3, 3, 3, 3, 3}));
        assertEquals(2, solution.removeDuplicates(new int[]{1, 1, 1, 1, 1, 1, 3}));
    }

    public void testRemoveElement(){
        assertEquals(0, solution.removeElement(new int[]{}, 1));
        assertEquals(0, solution.removeElement(new int[]{1}, 1));
        assertEquals(1, solution.removeElement(new int[]{2}, 1));
        assertEquals(0, solution.removeElement(new int[]{1, 1, 1}, 1));
        assertEquals(4, solution.removeElement(new int[]{1, 2, 3, 3, 1, 1, 4}, 1));
        assertEquals(3, solution.removeElement(new int[]{2, 3, 2}, 1));
        assertEquals(1, solution.removeElement(new int[]{2, 3, 2}, 2));
        assertEquals(2, solution.removeElement(new int[]{2, 3, 2}, 3));
        assertEquals(8, solution.removeElement(new int[]{1, 2, 3, 2, 3, 5, 2, 7, 2, 6, 8, 4, 2}, 2));
        assertEquals(7, solution.removeElement(new int[]{2, 2, 3, 2, 3, 5, 2, 7, 2, 6, 8, 4, 2}, 2));
    }

    public void testIsValidSoduku(){
        char[][] chs = {
                {'5', '3', '.',     '.', '7', '.',      '.', '.', '.'},
                {'6', '.', '.',     '1', '9', '5',      '.', '.', '.'},
                {'.', '9', '8',     '.', '.', '.',      '.', '6', '.'},

                {'8', '.', '.',     '.', '6', '.',      '.', '.', '3'},
                {'4', '.', '.',     '8', '.', '3',      '.', '.', '1'},
                {'7', '.', '.',     '.', '2', '.',      '.', '.', '6'},

                {'.', '6', '.',     '.', '.', '.',      '2', '8', '.'},
                {'.', '.', '.',     '4', '1', '9',      '.', '.', '5'},
                {'.', '.', '.',     '.', '8', '.',      '.', '7', '9'},
        };
        assertEquals(true, solution.isValidSudoku(chs));

        char[][] chs2 = {
                {'.', '.', '.',     '.', '5', '.',      '.', '1', '.'},
                {'.', '4', '.',     '3', '.', '.',      '.', '.', '.'},
                {'.', '.', '.',     '.', '.', '3',      '.', '.', '1'},
                {'8', '.', '.',     '.', '.', '.',      '.', '2', '.'},
                {'.', '.', '2',     '.', '7', '.',      '.', '.', '.'},
                {'.', '1', '5',     '.', '.', '.',      '.', '.', '.'},
                {'.', '.', '.',     '.', '.', '2',      '.', '.', '.'},
                {'.', '2', '.',     '9', '.', '.',      '.', '.', '.'},
                {'.', '.', '4',     '.', '.', '.',      '.', '.', '.'}
        };
        assertEquals(false, solution.isValidSudoku(chs2));
    }

    public void testIsValidSoduku_2(){
        char[][] chs = {
                {'5', '3', '.',     '.', '7', '.',      '.', '.', '.'},
                {'6', '.', '.',     '1', '9', '5',      '.', '.', '.'},
                {'.', '9', '8',     '.', '.', '.',      '.', '6', '.'},

                {'8', '.', '.',     '.', '6', '.',      '.', '.', '3'},
                {'4', '.', '.',     '8', '.', '3',      '.', '.', '1'},
                {'7', '.', '.',     '.', '2', '.',      '.', '.', '6'},

                {'.', '6', '.',     '.', '.', '.',      '2', '8', '.'},
                {'.', '.', '.',     '4', '1', '9',      '.', '.', '5'},
                {'.', '.', '.',     '.', '8', '.',      '.', '7', '9'},
        };
        assertEquals(true, solution.isValidSudoku_2(chs));

        char[][] chs2 = {
                {'.', '.', '.',     '.', '5', '.',      '.', '1', '.'},
                {'.', '4', '.',     '3', '.', '.',      '.', '.', '.'},
                {'.', '.', '.',     '.', '.', '3',      '.', '.', '1'},
                {'8', '.', '.',     '.', '.', '.',      '.', '2', '.'},
                {'.', '.', '2',     '.', '7', '.',      '.', '.', '.'},
                {'.', '1', '5',     '.', '.', '.',      '.', '.', '.'},
                {'.', '.', '.',     '.', '.', '2',      '.', '.', '.'},
                {'.', '2', '.',     '9', '.', '.',      '.', '.', '.'},
                {'.', '.', '4',     '.', '.', '.',      '.', '.', '.'}
        };
        assertEquals(false, solution.isValidSudoku_2(chs2));
    }

    public void testCountSay(){
        assertEquals("", solution.countSay(""));
        assertEquals("11", solution.countSay("1"));
        assertEquals("21", solution.countSay("11"));
        assertEquals("1211", solution.countSay("21"));
    }

    public void testCountAndSay(){
        assertEquals("1", solution.countAndSay(1));
        assertEquals("11", solution.countAndSay(2));
        assertEquals("21", solution.countAndSay(3));
        assertEquals("1211", solution.countAndSay(4));
        assertEquals("111221", solution.countAndSay(5));
        assertEquals("312211", solution.countAndSay(6));
        //33的结果已有9898个字符
//        assertEquals("", solution.countAndSay(33));
    }

    public void testLengthOfLastWord(){
        assertEquals(0, solution.lengthOfLastWord(""));
        assertEquals(0, solution.lengthOfLastWord(" "));
        assertEquals(1, solution.lengthOfLastWord("a "));
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
        assertEquals(5, solution.lengthOfLastWord("Hello"));
    }

    public void testLengthOfLastWord_2(){
        assertEquals(0, solution.lengthOfLastWord(""));
        assertEquals(0, solution.lengthOfLastWord(" "));
        assertEquals(1, solution.lengthOfLastWord("a "));
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
        assertEquals(5, solution.lengthOfLastWord("Hello"));
        assertEquals(2, solution.lengthOfLastWord("b af "));
    }

    public void testAddBinary(){
        assertEquals("1", solution.addBinary("1", "0"));
        assertEquals("10", solution.addBinary("1", "1"));
        assertEquals("1001", solution.addBinary("111", "10"));
        assertEquals("11110", solution.addBinary("1111", "1111"));
        assertEquals("10010", solution.addBinary("11", "1111"));
        assertEquals("11100", solution.addBinary("11", "11001"));
    }

    public void testAddBinary_3(){
        assertEquals("1", solution.addBinary_3("1", "0"));
        assertEquals("10", solution.addBinary_3("1", "1"));
        assertEquals("1001", solution.addBinary_3("111", "10"));
        assertEquals("11110", solution.addBinary_3("1111", "1111"));
        assertEquals("10010", solution.addBinary_3("11", "1111"));
        assertEquals("11100", solution.addBinary_3("11", "11001"));
    }

    public void testMergeTwoLists(){
        int[] numbers1_1 = {1,3,7};
        int[] numbers1_2 = {2,4,8,9};
        ListNode list1_1 = TestTools.createList(numbers1_1);
        ListNode list1_2 = TestTools.createList(numbers1_2);
        ListNode result1 = solution.mergeTwoLists(list1_1, list1_2);
        TestTools.printList(result1);

        int[] numbers2_1 = {1,1,3};
        int[] numbers2_2 = {2,4,8,9};
        ListNode list2_1 = TestTools.createList(numbers2_1);
        ListNode list2_2 = TestTools.createList(numbers2_2);
        ListNode result2 = solution.mergeTwoLists(list2_1, list2_2);
        TestTools.printList(result2);

        int[] numbers3_1 = {1,1,3};
        int[] numbers3_2 = {1,1,3};
        ListNode list3_1 = TestTools.createList(numbers3_1);
        ListNode list3_2 = TestTools.createList(numbers3_2);
        ListNode result3 = solution.mergeTwoLists(list3_1, list3_2);
        TestTools.printList(result3);
    }

    public void testPlusOne(){
        int[] r1 = solution.plusOne(new int[]{1,1,1});
        TestTools.printArray(r1);
        int[] r2 = solution.plusOne(new int[]{1, 1, 9});
        TestTools.printArray(r2);
        int[] r3 = solution.plusOne(new int[]{1, 9, 9});
        TestTools.printArray(r3);
        int[] r4 = solution.plusOne(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9});
        TestTools.printArray(r4);

    }

    public void testPlusOne_2(){
        int[] r1 = solution.plusOne_2(new int[]{1, 1, 1});
        TestTools.printArray(r1);
        int[] r2 = solution.plusOne_2(new int[]{1, 1, 9});
        TestTools.printArray(r2);
        int[] r3 = solution.plusOne_2(new int[]{1, 9, 9});
        TestTools.printArray(r3);
        int[] r4 = solution.plusOne_2(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9});
        TestTools.printArray(r4);

    }

    public void testClimbStairs(){
        assertEquals(1, solution.climbStairs(1));
        assertEquals(2, solution.climbStairs(2));
        assertEquals(3, solution.climbStairs(3));
        assertEquals(5, solution.climbStairs(4));
        assertEquals(8, solution.climbStairs(5));
        assertEquals(13, solution.climbStairs(6));
    }

    public void testClimbStairs_2(){
        for(int i = 1; i < 31; i++){
            assertEquals(solution.climbStairs(i), solution.climbStairs_2(i));
        }
    }

    public void testDeleteDuplicates(){
        ListNode h1 = TestTools.createList(new int[]{1,2,3,4,5});
        ListNode r1 = solution.deleteDuplicates(h1);
        TestTools.printList(r1);

        ListNode h2 = TestTools.createList(new int[]{1,1,1,4,5});
        ListNode r2 = solution.deleteDuplicates(h2);
        TestTools.printList(r2);

        ListNode h3 = TestTools.createList(new int[]{1,3,3,4,5, 5});
        ListNode r3 = solution.deleteDuplicates(h3);
        TestTools.printList(r3);

        ListNode h4 = TestTools.createList(new int[]{1,1});
        ListNode r4 = solution.deleteDuplicates(h4);
        TestTools.printList(r4);

        ListNode h5 = TestTools.createList(new int[]{});
        ListNode r5 = solution.deleteDuplicates(h5);
        TestTools.printList(r5);

    }

    public void testMerge(){
        int[] A = {1,3,7, 9, 0,0,0,0,0,0,0,0};
        int[] B = {2,2,3,4,5};
        solution.merge(A, 4, B, 5);
        TestTools.printArray(A);
//        int[] A = {};
//        int[] B = {};
//        solution.merge(A,  , B, );
    }

    public void testAddTwoNumbers(){
        ListNode l1_1 = TestTools.createList(new int[]{2,4,3});
        ListNode l1_2 = TestTools.createList(new int[]{5,6,4});
        TestTools.printList(solution.addTwoNumbers(l1_1, l1_2));

        ListNode l2_1 = TestTools.createList(new int[]{});
        ListNode l2_2 = TestTools.createList(new int[]{5,6,4});
        TestTools.printList(solution.addTwoNumbers(l2_1, l2_2));

        ListNode l3_1 = TestTools.createList(new int[]{0});
        ListNode l3_2 = TestTools.createList(new int[]{1,8});
        TestTools.printList(solution.addTwoNumbers(l3_1, l3_2));

        ListNode l4_1 = TestTools.createList(new int[]{5});
        ListNode l4_2 = TestTools.createList(new int[]{5});
        TestTools.printList(solution.addTwoNumbers(l4_1, l4_2));
    }

    public void testLargestNumber(){
        int[] arr0 = {3, 30, 34, 5, 9};
        System.out.println("Result: " + solution.largestNumber(arr0));


        int[] arr1 = {30, 5, 3, 34, 9};
        System.out.println("Result: " + solution.largestNumber(arr1));

        int[] arr2 = {0, 0};
        System.out.println("Result: " + solution.largestNumber(arr2));
    }

    public void testHammingWright(){
        assertEquals(0, solution.hammingWeight(0));
        assertEquals(1, solution.hammingWeight(1));
        assertEquals(2, solution.hammingWeight(5));
        assertEquals(3, solution.hammingWeight(11));
        assertEquals(1, solution.hammingWeight(64));
        assertEquals(1, solution.hammingWeight(2147483648L));
    }


    public void testReverseBits(){
        assertEquals(964176192, solution.reverseBits(43261596));
    }

    public void testRotate(){
        int[] arr = {1,2,3,4,5,6,7};
        solution.rotate(arr, 3);
        TestTools.printArray(arr);

        int[] arr2 = {1};
        solution.rotate(arr2, 2);
        TestTools.printArray(arr2);

    }

    public void testIsHappy(){
        assertEquals(true, solution.isHappy(19));
        assertEquals(true, solution.isHappy(1));
        assertEquals(false, solution.isHappy(2));
//        assertEquals(false, solution.isHappy(0));
    }

    public void testIsHappy_2(){
        assertEquals(true, solution.isHappy_2(19));
        assertEquals(true, solution.isHappy_2(1));
        assertEquals(false, solution.isHappy_2(2));
        assertEquals(false, solution.isHappy_2(0));
    }

//    public void testCountPrimes(){
//        assertEquals(4, solution.countPrimes(10));
//        assertEquals(4, solution.countPrimes(7));
//        assertEquals(3, solution.countPrimes(6));
//        assertEquals(1, solution.countPrimes(2));
//        assertEquals(348513, solution.countPrimes(5000000));
//    }

    public void testCountPrimes_2(){
        assertEquals(4, solution.countPrimes_2(10));
        assertEquals(3, solution.countPrimes_2(7));
        assertEquals(3, solution.countPrimes_2(6));
        assertEquals(0, solution.countPrimes_2(0));
        assertEquals(348513, solution.countPrimes_2(5000000));
    }

    public void testRemoveElements(){
        ListNode head1 = TestTools.createList(new int[]{1, 2, 6, 3, 4, 5, 6});
        TestTools.printList(head1);
        head1 = solution.removeElements(head1, 6);
        TestTools.printList(head1);

        ListNode head2 = TestTools.createList(new int[]{1, 2, 1, 1, 1, 5, 6});
        TestTools.printList(head2);
        head2 = solution.removeElements(head2, 1);
        TestTools.printList(head2);
    }

    public void testRangeBitwiseAnd(){
        assertEquals(4, solution.rangeBitwiseAnd(5,7));
        System.out.println("-------------------------------------------------");
        assertEquals(0, solution.rangeBitwiseAnd(5, 108));
        assertEquals(0, solution.rangeBitwiseAnd(700000000,2147483641));   //700000000, 2147483641
        assertEquals(2147483647, solution.rangeBitwiseAnd(2147483647, 2147483647));   //2147483647, 2147483647

    }

    public void testRangeBitwiseAnd_2(){
        assertEquals(4, solution.rangeBitwiseAnd_2(5,7));
        assertEquals(4, solution.rangeBitwiseAnd_2(4, 5));
        System.out.println("-------------------------------------------------");
        assertEquals(0, solution.rangeBitwiseAnd_2(5, 108));
        assertEquals(0, solution.rangeBitwiseAnd_2(700000000, 2147483641));   //700000000, 2147483641
        assertEquals(2147483647, solution.rangeBitwiseAnd_2(2147483647, 2147483647));   //2147483647, 2147483647

    }

    public void testIsIsomorphic(){
        assertEquals(true, solution.isIsomorphic("egg", "add"));
        assertEquals(false, solution.isIsomorphic("foo", "bar"));
        assertEquals(true, solution.isIsomorphic("paper", "title"));
        assertEquals(false, solution.isIsomorphic("bee", "aac"));
        assertEquals(true, solution.isIsomorphic("13", "42"));
        String s1 = "\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!a#$%h'()*+,-./:;<=> @[\\]^_`{|}~?\"bcdefg&ijklmnopqrstuvwxyzABCD";
        String s2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCD";

        assertEquals(true, solution.isIsomorphic(s1, s2));
        assertEquals(false, solution.isIsomorphic("ab", "aa"));

    }




}