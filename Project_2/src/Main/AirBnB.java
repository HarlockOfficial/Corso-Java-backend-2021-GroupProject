package Main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import Exception.InvalidHostException;
import Exception.InvalidUserException;
import Exception.ImpossibleException;
import Exception.BookNotFoundException;
import User.User;
import User.Host;

public class AirBnB {
    private final Set<User> allUsers;
    private final Set<Host> allHosts;
    private static AirBnB airBnb = null;
    private AirBnB(){
        allUsers = new HashSet<>();
        allHosts = new HashSet<>();
    }

    public static AirBnB getInstance() {
        if(airBnb==null){
            airBnb = new AirBnB();
        }
        return airBnb;
    }
    public boolean addUser(User user) throws InvalidUserException{
        if(user == null){
            throw new InvalidUserException();
        }
        allHosts.add((Host) user);
        return allUsers.add(user);
    }
    public Set<Host> getSuperHost(){
        Set<Host> out = new HashSet<>();
        for(Host h: allHosts){
            if(h.isSuperhost()){
                out.add(h);
            }
        }
        return out;
    }
    public boolean addHouse(House house, Host host) throws InvalidHostException {
        if(!allHosts.contains(host)){
            throw new InvalidHostException();
        }
        for(Host h: allHosts){
            if(host.equals(h)){
                return h.addHouse(house);
            }
        }
        return false;
    }
    public boolean deleteUser(User user){
        if(user instanceof Host){
            allHosts.remove(user);
        }
        return allUsers.remove(user);
    }
    public User changeUAC(User user, Class<? extends User> Class) throws ImpossibleException{
        if(!user.getClass().equals(Class)){
            try {
                User newUser = Class.getConstructor(UUID.class, String.class, String.class, String.class)
                        .newInstance(user.getUUID(), user.getName(), user.getSurname(), user.getMail());
                deleteUser(user);
                addUser(newUser);
            }catch(NoSuchMethodException ex){
                return user;
            }catch (InvalidUserException ex){
                //impossible
                throw new ImpossibleException();
            }
        }
        return user;
    }
    //
    public Book getLastBook(UUID uuid) throws BookNotFoundException{
        for(User u: allUsers){
            if(u.getUUID().equals(uuid)){
                List<Book> lst = u.getBookings();
                return lst.get(lst.size()-1);
            }
        }
        throw new BookNotFoundException();
    }
    public House getMostBooked(){
        House out = null;
        int mostBooked = 0;
        for(Host h: allHosts){
            SortedMap<House, SortedSet<Books>> map = h.getBooks();
            //TODO finish, get most booked house (should be the first), then check with most booked
        }
    }
}
