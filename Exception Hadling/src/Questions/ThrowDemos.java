package Questions;

import org.w3c.dom.ls.LSOutput;

import javax.naming.InsufficientResourcesException;
// this is the second step

public class ThrowDemos {
    public static void main(String[] args) {
        try {
            withdrow(1023,48593);
        }catch (InsufficientBalException e){
            System.out.println("Insufficient Bal : Go Back");
            System.out.println(e.getMessage());
        }
    }
    public static void withdrow(double bal, double amt) throws InsufficientBalException{
        if(amt>bal){
            throw new InsufficientBalException("Insufficient Bal : Avaliable Bal "+
                    bal + " Requested "+amt);
        }
        System.out.println("withdrawal is successfull : "+amt);
    }
    
}