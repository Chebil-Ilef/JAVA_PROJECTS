public class OverrCast {

        public OverrCast() {
        }

        public void foo(char var1) {
            System.out.println("foo(char)");
        }

        public void foo(double var1) {
            System.out.println("foo(double)");
        }

        public void foo(Integer var1) {
            System.out.println("foo(Integer)");
        }

        public void foo(int... var1) {
            System.out.println("foo(int...)");
        }

        public static void main(String[] var0) {

            OverrCast var1 = new OverrCast();
            var1.foo(1, 2, 3);
            var1.foo('a');
            var1.foo(3.140000104904175);
            var1.foo(5);
        }
    }
