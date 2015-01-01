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
}