package com.teamtreehouse.vending;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditorTest {
    @Test
    public void testAddingFundsIncrementsAvailableFunds() throws Exception {
        Creditor creditor = new Creditor();

        creditor.addFunds(25);
        creditor.addFunds(25);

        assertEquals(50, creditor.getAvailableFunds());
    }

    @Test
    public void testRefundingReturnsAllAvailableFunds() throws Exception {
        Creditor creditor = new Creditor();

        creditor.addFunds(10);

        int refund = creditor.refund();

        assertEquals(10, refund);
    }

    @Test
    public void refundingResetsAvailableFundsToZero() throws Exception {
        Creditor creditor = new Creditor();
        creditor.addFunds(300);
        creditor.refund();

        assertEquals(0, creditor.getAvailableFunds());
    }
}