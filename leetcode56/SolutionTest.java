package leetcode56;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testMerge() {
		ArrayList<Interval> list=new ArrayList<>();
		list.add(new Interval(1,3));
		list.add(new Interval(2,6));
		list.add(new Interval(8,10));
		list.add(new Interval(15,20));
		new Solution().merge(list);
	}

}
