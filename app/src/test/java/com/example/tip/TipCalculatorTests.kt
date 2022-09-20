package com.example.tip

import junit.framework.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {

    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val tipPercent = 20.5
        val amount = 100.00
        val expectedTip = "20,50 kr"
        val actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculate_20_percent_tip_roundup() {
        val tipPercent = 20.5
        val amount = 100.00
        val expectedTip = "21,00 kr"
        val actualTip = calculateTip(amount, tipPercent, true)
        assertEquals(expectedTip, actualTip)
    }
}