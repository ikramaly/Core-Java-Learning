package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("We want to start from here..");
        String num = null;
        try {
            int l = num.length();
        } catch (ArithmeticException e) {
            System.out.println("Null pointer exception");
        }catch (RuntimeException e ){
            System.out.println("Me run ho gye");
        }catch (Exception e) {
            System.out.println("Me parent hu");
        }

        finally {
            System.out.println("bhai me to ptint huga hi huga ukhaad le jo ukhaadna hai ");
        }
//        System.out.println("run comp.");
//        m2();

    }
}