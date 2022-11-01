public class Main {

    public class SalesManager {
        protected long[] sales;

        public SalesManager(long[] sales) {
            this.sales = sales;
        }

        public long max() {
            long max = -1;
            for (long sale : sales) {
                if (sale > max) {
                    max = sale;
                }
            }
            return max;
        }
        public long max1() {
            long max1 = -1;
            for (long sale : sales) {
                if (sale > max1) {
                    max1 = sale;
                }
            }
            return max1;
        }
    }
}