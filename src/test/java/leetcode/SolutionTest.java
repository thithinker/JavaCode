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
}