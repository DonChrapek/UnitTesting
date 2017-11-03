package com.teamtreehouse.vending;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditorTest {

    private Creditor creditor;

    @Before
    public void setUp() throws Exception {
        creditor = new Creditor();
    }

    @Test
    public void testAddingFundsIncrementsAvailableFunds() throws Exception {
        creditor.addFunds(25);
        creditor.addFunds(25);

        assertEquals(50, creditor.getAvailableFunds());
    }

    @Test
    public void testRefundingReturnsAllAvailableFunds() throws Exception {
        creditor.addFunds(10);

        int refund = creditor.refund();

        assertEquals(10, refund);
    }

    @Test
    public void refundingResetsAvailableFundsToZero() throws Exception {
        creditor.addFunds(300);
        creditor.refund();

        assertEquals(0, creditor.getAvailableFunds());
    }
}