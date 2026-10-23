public class ThrowExample {
    public static void main(String[] args) {
        try {
            CheckAge(2);
        }catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }


    }
    public static void CheckAge(int age) throws Exception{
       if (age<18) {
           throw new Exception("You are not balig balak");
       }else {
           System.out.println("Welcom you are pure 18 years old.");
       }

    }
}
