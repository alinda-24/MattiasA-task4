public class EconomySimulation {

    /**
     * Checks if the investment growth surpasses a given threshold.
     *
     * @param principal  the initial amount of money
     * @param rate       the annual interest rate (in decimal form, e.g., 0.05 for 5%)
     * @param years      the number of years the money is invested for
     * @param threshold  the threshold value to compare the future value against
     * @return true if future value exceeds the threshold, otherwise false
     */
    public boolean isGrowthAboveThreshold(double principal, double rate, int years, double threshold) {
        // Calculate future value using the compound interest formula
        double futureValue = principal * Math.pow(1 + rate, years);
        // Return true if future value exceeds the threshold
        return futureValue > threshold;
    }

    /**
     * Calculates the number of years it will take for an investment to double.
     *
     * @param principal  the initial amount of money
     * @param rate       the annual interest rate (in decimal form, e.g., 0.05 for 5%)
     * @return the number of years it will take for the investment to double
     */
    public int yearsToDoubleInvestment(double principal, double rate) {
        double futureValue = principal;
        int years = 0;
        // Use a while loop to increment the year counter until the investment doubles
        while (futureValue < 2 * principal) {
            futureValue *= (1 + rate);
            years++;
        }
        return years;
    }

    /**
     * Calculates the total value of an investment over a series of years.
     *
     * @param principal  the initial amount of money
     * @param rate       the annual interest rate (in decimal form, e.g., 0.05 for 5%)
     * @param years      the number of years the money is invested for
     * @return the total value of the investment over the specified years
     */
    public double totalInvestmentOverYears(double principal, double rate, int years) {
        double totalValue = 0;
        double currentValue = principal;
        // Use a for loop to calculate the investment value at the end of each year
        for (int year = 1; year <= years; year++) {
            currentValue *= (1 + rate);
            totalValue += currentValue;
        }
        return totalValue;
    }

    /**
     * Calculates the interest for a given principal using a default rate.
     *
     * @param principal  the initial amount of money
     * @return the calculated interest using a default rate of 5%
     */
    public double calculateInterest(double principal) {
        double defaultRate = 0.05;
        return principal * defaultRate;
    }

    /**
     * Calculates the interest for a given principal and rate.
     *
     * @param principal  the initial amount of money
     * @param rate       the interest rate to use for calculation
     * @return the calculated interest using the provided rate
     */
    public double calculateInterest(double principal, double rate) {
        return principal * rate;
    }

    /**
     * Analyzes cash flows over a period at a given discount rate without adjusting for annuities.
     *
     * @param cashFlows  an array of cash flows
     * @param rate       the discount rate to use for present value calculations
     * @return the sum of discounted cash flows
     */
    public double analyzeCashFlow(double[] cashFlows, double rate) {
        double totalPresentValue = 0;
        for (int t = 0; t < cashFlows.length; t++) {
            totalPresentValue += cashFlows[t] / Math.pow(1 + rate, t + 1);
        }
        return totalPresentValue;
    }

    /**
     * Analyzes cash flows over a period at a given discount rate, adjusting if the cash flows represent an annuity.
     *
     * @param cashFlows  an array of cash flows
     * @param rate       the discount rate to use for present value calculations
     * @param isAnnuity  indicates if the cash flows represent an annuity
     * @return the present value of the cash flows, considering annuity adjustments if applicable
     */
    public double analyzeCashFlow(double[] cashFlows, double rate, boolean isAnnuity) {
        if (isAnnuity) {
            // Adjust present value calculation for annuity
            double cashFlow = cashFlows[0];
            return cashFlow * (1 - 1 / Math.pow(1 + rate, cashFlows.length)) / rate;
        } else {
            // Use the standard method to calculate present value
            return analyzeCashFlow(cashFlows, rate);
        }
    }

    /**
     * Provides a string representation of the EconomySimulation instance.
     *
     * @return A user-friendly representation of the last used investment parameters
     */
    @Override
    public String toString() {
        return "EconomySimulation: provides various investment simulations and analyses.";
    }
}