public class Main {
    public static void main(String args[]) {
        System.out.println("hello JUnit");

        Calculator calculator = new Calculator(new KrwCalculator());
        MarketApi marketApi = new MarketApi();
        DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
        dollarCalculator.init();


        System.out.println(calculator.sum(10,10));
    }
}
