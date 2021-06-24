package Main;

import java.time.ZonedDateTime;
import java.util.*;

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

    public Set<House> getHostHouses(UUID uuid) throws InvalidHostException {
        for(User u: allHosts){
            if(u.getUUID().equals(uuid)){
                return u.getHouses().getKeySet();
            }
        }
        throw new InvalidHostException();
    }
    public Book getLastBook(UUID uuid) throws BookNotFoundException{
        for(User u: allUsers){
            if(u.getUUID().equals(uuid)){
                List<Book> lst = u.getBookings();
                return lst.get(lst.size()-1);
            }
        }
        throw new BookNotFoundException();
    }
    public House getMostBookedThisMonth(){
        House out = null;
        int mostBooked = 0;
        for(Host h: allHosts){
            SortedMap<House, SortedSet<Book>> map = h.getBooks();
            for(House house: map.getKeySet()){
                List<Book> tmp = map.get(house).stream().toList();
                if(mostBooked<map.get(house).size() && tmp.get(tmp.size()-1).getCheckIn().isAfter(ZonedDateTime.now().minusMonths(1))){
                    out = house;
                    mostBooked = map.get(house).size();
                }
            }
        }
        return out;
    }
    public Host getHostOfTheMonth(){
        //TODO implement method stub
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
    public Set<User> getBestUsers(){
        //TODO implement method stub (return only five best users)
    }
    public double getAverageBeds(){
        int bedQuantity = 0, houseQuantity = 0;
        for(Host h: allHosts){
            for(House house: h.getBooks().getKeySet()){
                bedQuantity += house.getNbeds();
                ++houseQuantity;
            }
        }
        return ((double)bedQuantity)/((double)houseQuantity);
    }
    public boolean addUser(User user) throws InvalidUserException{
        if(user == null){
            throw new InvalidUserException();
        }
        allHosts.add((Host) user);
        return allUsers.add(user);
    }
    public boolean deleteUser(User user){
        if(user instanceof Host){
            allHosts.remove(user);
        }
        return allUsers.remove(user);
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
    public boolean deleteHouse(House house, Host host) throws InvalidHostException {
        if(!allHosts.contains(host)){
            throw new InvalidHostException();
        }
        for(Host h: allHosts){
            if(host.equals(h)){
                return h.removeHouse(house);
            }
        }
        return false;
    }
    public User changeUAC(User user, Class<? extends User> Class) throws ImpossibleException{
        if(!user.getClass().equals(Class)){
            try {
                User newUser = Class.getConstructor(UUID.class, String.class, String.class, String.class)
                        .newInstance(user.getUUID(), user.getName(), user.getSurname(), user.getEmail());
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
}
