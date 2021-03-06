package org.braidner.utils.diff;

import org.braidner.utils.diff.test.TestAnotherEntity;
import org.braidner.utils.diff.test.TestEntity;
import org.braidner.utils.diff.test.extended.TestOne;
import org.braidner.utils.diff.test.extended.TestTwo;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Braidner
 */
public class DiffUtilsTest {

    private TestEntity mainEntity;
    private TestEntity mergeEntity;

    @Before
    public void setUp() throws Exception {
        mainEntity = new TestEntity("Test", "Solve", "wowow", "admin", "123");
        mainEntity.setAnotherEntity(new TestAnotherEntity("asdasda", "asdasd"));
        mergeEntity = new TestEntity("Test", "Solve1", "wowow1", "user", "123");
        mergeEntity.setAnotherEntity(new TestAnotherEntity("zxczx", "asdasd"));
    }


    @Test
    public void testMergeRecursive() throws Exception {
        System.out.println(DiffUtils.merge(mainEntity, mergeEntity, true));
    }

    @Test
    public void testMerge() throws Exception {
        System.out.println(DiffUtils.merge(mainEntity, mergeEntity, false));
    }

    @Test
    public void testExtendedMerge() throws Exception {
        TestOne testOne = new TestOne("cascasc", "adasdas", "adasda");
        TestTwo testTwo = new TestTwo("ccaascasc", "adazcxczxsdas", "zxc");
        System.out.println(DiffUtils.extendedMerge(testOne, testTwo, false));
    }
}