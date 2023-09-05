package com.syscho;

class Solution {
    final static String oneDigit[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

    final static String twoDigit[] = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
            "ninety" };

    public static String convertCurrency(String numStr) {
        numStr = numStr.replace("$", "");
        if (numStr.length() == 0) {
            return "";
        }

        double value = Double.parseDouble(numStr);

        long dollars = (long) (value);
        long cents = Math.round((value - dollars) * 100);

        String dollarText = "";
        String centsText = "";

        if (dollars == 0 && cents == 0) {
            return "zero dollars";
        }

        if (dollars > 0) {
            dollarText = convertValue(dollars) + " dollar" + (dollars == 1 ? "" : "s");

        }
        if (cents > 0) {

            if (dollarText.length() > 0) {
                centsText = " and ";
            }
            centsText += convertValue(cents) + " cent" + (cents == 1 ? "" : "s");

        }

        return dollarText + centsText;
    }

    static String convertValue(long input) {

        if (input < 20) {
            return oneDigit[(int) input];
        }

        if (input < 100) {
            return twoDigit[(int) input / 10] + ((input % 10 != 0) ? " " : "") + oneDigit[(int) input % 10];
        }

        if (input < 1000) {
            return oneDigit[(int) input / 100] + " hundred" + ((input % 100 != 0) ? " " : "") + convertValue(input % 100);
        }

        if (input < 10000) {
            return convertValue(input / 1000) + " thousand" + ((input % 1000 != 0) ? " " : "") + convertValue(input % 1000);
        }
        return "";

    }

    public static void main(String[] args) {
        // Do not modify the test cases
        System.out.println(new TestCase("$4", "four dollars").validate());
        System.out.println(new TestCase("$0", "zero dollars").validate());
        System.out.println(new TestCase("$1", "one dollar").validate());
        System.out.println(new TestCase("$4", "four dollars").validate());
        System.out.println(new TestCase("$12.01", "twelve dollars and one cent").validate());
        System.out.println(new TestCase("$30", "thirty dollars").validate());
        System.out.println(new TestCase("$71", "seventy one dollars").validate());
        System.out.println(new TestCase("$56", "fifty six dollars").validate());
        System.out.println(new TestCase("$90.00", "ninety dollars").validate());
        System.out.println(new TestCase("$100", "one hundred dollars").validate());
        System.out.println(new TestCase("$217.84", "two hundred seventeen dollars and eighty four cents").validate());
        System.out.println(new TestCase("$320", "three hundred twenty dollars").validate());
        System.out.println(new TestCase("$350.21", "three hundred fifty dollars and twenty one cents").validate());
        System.out.println(new TestCase("$701.82", "seven hundred one dollars and eighty two cents").validate());
    }

    static class TestCase {
        String numStr;
        String expectedString;

        TestCase(String numStr, String expectedString) {
            this.numStr = numStr;
            this.expectedString = expectedString;
        }

        public String validate() {
            String result = Solution.convertCurrency(numStr);
            return expectedString.equals(result)
                    ? "SUCCESS"
                    : String.format("FAILED:\n  Expected: %s\n  Actual:   %s", expectedString, result);
        }
    }
}