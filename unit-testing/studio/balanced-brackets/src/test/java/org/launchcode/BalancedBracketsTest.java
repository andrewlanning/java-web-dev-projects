package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void testBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"), "Verify [Launchcode] returns True");
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"), "Verify Launch[Code] returns True");
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launchcode"), "Verify []Launchcode returns True");
        assertTrue(BalancedBrackets.hasBalancedBrackets(""), "Verify '' returns True");
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), "Verify [] returns True");
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"), "Verify [[[]]] returns True");
    }

    @Test
    public void testImbalanced() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"), "Verify [Launchcode returns False");
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["), "Verify Launch]code[ returns False");
        assertFalse(BalancedBrackets.hasBalancedBrackets("["), "Verify [ returns False");
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["), "Verify ][ returns False");
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"),"Verify ] returns False");
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"), "Verify [[[]] returns False");
    }
}
