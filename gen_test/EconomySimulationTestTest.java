package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class EconomySimulationTest {

    private EconomySimulation economySimulation;

    @Before
    public void setUp() {
        economySimulation = new EconomySimulation();
    }

    @Test
    public void testIsGrowthAboveThresholdTrue() {
        assertTrue(economySimulation.isGrowthAboveThreshold(1000, 0.05, 10, 1628.89));
    }

    @Test
    public void testIsGrowthAboveThresholdFalse() {
        assertFalse(economySimulation.isGrowthAboveThreshold(1000, 0.05, 10, 2000));
    }

    @Test
    public void testIsGrowthAboveThresholdBoundary() {
        assertTrue(economySimulation.isGrowthAboveThreshold(1000, 0.07, 10, 1967.15));
    }

    @Test
    public void testIsGrowthAboveThresholdZeroPrincipal() {
        assertFalse(economySimulation.isGrowthAboveThreshold(0, 0.05, 10, 100));
    }

    @Test
    public void testYearsToDoubleInvestment() {
        assertEquals(15, economySimulation.yearsToDoubleInvestment(1000, 0.05));
    }

    @Test
    public void testYearsToDoubleInvestmentHighRate() {
        assertEquals(8, economySimulation.yearsToDoubleInvestment(1000, 0.09));
    }

    @Test
    public void testYearsToDoubleInvestmentZeroRate() {
        assertEquals(Integer.MAX_VALUE, economySimulation.yearsToDoubleInvestment(1000, 0));
    }

    @Test
    public void testTotalInvestmentOverYears() {
        assertEquals(15103.74, economySimulation.totalInvestmentOverYears(1000, 0.05, 10), 0.01);
    }

    @Test
    public void testTotalInvestmentOverYearsZeroPrincipal() {
        assertEquals(0, economySimulation.totalInvestmentOverYears(0, 0.05, 10), 0.01);
    }

    @Test
    public void testCalculateInterestDefaultRate() {
        assertEquals(50, economySimulation.calculateInterest(1000), 0.01);
    }

    @Test
    public void testCalculateInterestSpecificRate() {
        assertEquals(70, economySimulation.calculateInterest(1000, 0.07), 0.01);
    }

    @Test
    public void testAnalyzeCashFlow() {
        double[] cashFlows = {100, 200, 300};
        assertEquals(530.91, economySimulation.analyzeCashFlow(cashFlows, 0.05), 0.01);
    }

    @Test
    public void testAnalyzeCashFlowZeroRate() {
        double[] cashFlows = {100, 200, 300};
        assertEquals(600, economySimulation.analyzeCashFlow(cashFlows, 0), 0.01);
    }

    @Test
    public void testAnalyzeCashFlowNegativeCashFlow() {
        double[] cashFlows = {-100, -200, -300};
        assertEquals(-530.91, economySimulation.analyzeCashFlow(cashFlows, 0.05), 0.01);
    }

    @Test
    public void testAnalyzeCashFlowWithAnnuity() {
        double[] cashFlows = {100, 100, 100};
        assertEquals(272.32, economySimulation.analyzeCashFlow(cashFlows, 0.05, true), 0.01);
    }

    @Test
    public void testAnalyzeCashFlowWithoutAnnuity() {
        double[] cashFlows = {100, 100, 100};
        assertEquals(272.32, economySimulation.analyzeCashFlow(cashFlows, 0.05, false), 0.01);
    }

    @Test
    public void testAnalyzeCashFlowWithZeroAnnuity() {
        double[] cashFlows = {0, 0, 0};
        assertEquals(0, economySimulation.analyzeCashFlow(cashFlows, 0.05, true), 0.01);
    }

    @Test
    public void testToString() {
        assertEquals("EconomySimulation: provides various investment simulations and analyses.", economySimulation.toString());
    }
}