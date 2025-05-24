package interview150.arrayOrString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JumpGameTest {

    private JumpGame jumpGame;

    @BeforeEach
    public void setUp() {
        jumpGame = new JumpGame();
    }

    @Test
    void testNoStepZeroCase() {
        int[] nums = {4,5,7,2,8,1};
        assertTrue(jumpGame.canJump(nums));

    }

    @Test
    void testOneZeroCanJumpCase() {
        int[] nums = {4,5,7,0,2,8,1};
        assertTrue(jumpGame.canJump(nums));
    }

    @Test
    void testOneZeroCannotJumpCase() {
        int[] nums = {1,0,2,8,1};
        assertFalse(jumpGame.canJump(nums));
    }

    @Test
    void testMultipleZeroesCanJumpCases() {
        int[] nums1 = {4,5,0,0,0,0,2,1};
        assertTrue(jumpGame.canJump(nums1));
        int[] nums2 = {6,3,0,0,0,0,2,1};
        assertTrue(jumpGame.canJump(nums2));

    }

    @Test
    void testMultipleZeroesCannotJumpCase() {
        int[] nums = {4,3,0,0,0,2};
        assertFalse(jumpGame.canJump(nums));
    }

}
