package P1_BookMyTrain;

import com.sun.security.auth.UnixNumericGroupPrincipal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TooManyListenersException;

public class BookingService {
    private List<Train> trainList = new ArrayList<>();
    private List<Ticket> ticketList = new ArrayList<>();
    public BookingService(){
        trainList.add(new Train(101,"Rajdhani Express","Delhi","Kandhla",100));
        trainList.add(new Train(102,"Ikram Express","Bangluru","Shamli",83));
        trainList.add(new Train(103,"Maharani Express","Madhya Pradesh","M.nagar",10));
        trainList.add(new Train(104,"East Express","Rajasthan","TamilNadu",11));
        trainList.add(new Train(105,"Vande Bharat Express","Bihar","Chennai",90));
        trainList.add(new Train(106,"Tejas Express","Kolkata","UttarPradesh",92));
        trainList.add(new Train(107,"Sprite Express","Delhi","Mumbai",40));
    }
    public List<Train> searchTrain(String source, String destination){
        List<Train> res = new ArrayList<>();
        for (Train train: trainList){
            if (train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination)){
                res.add(train);
            }
        }
        return res;
    }

    private Ticket bookTicket(User user, int trainId, int seatcount){
        for (Train train:trainList){
            if (train.getTrainid()==trainId){
                if (train.bookSeats(seatcount)){
                    Ticket ticket = new Ticket(user, train, seatcount);
                    ticketList.add((ticket));
                    return ticket;
                }
            }else {
                System.out.println("No Enough Seats Avaliable");
                return null;
            }
        }
        System.out.println("Train Id Not Found.");
        return null;
    }

    public List<Ticket> getTicketList(User user){
        List<Ticket> res = new ArrayList<>();
        for (Ticket ticket:ticketList){
            if (ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername()));
            res.add(ticket);
        }
        return res;
    }
    public boolean cancelTicket(int ticketId, User user) {
        Iterator<Ticket> iterator = ticketList.listIterator();
        while (iterator.hasNext()){
            Ticket ticket = iterator.next();
            if (ticket.getTicketId()==ticketId  &&
                ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername()){
                Train train= ticket.getTrain();
                train.cancelSeats((ticket.getSeatBooked()));
                iterator.remove();
                System.out.println("Ticket "+ticketId+" cancelled Successfully");
                return true;
            }
        }
        System.out.println("Ticket not found or user does not belong to current user.");
        return false;
    }
    public void ListAllTrains(){
        System.out.println("List of all trains.");
        for (Train train:trainList){
            System.out.println(train);
        }
    }

}
