import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<String> users = new ArrayList<>();

    public void addUser(String user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    // this is to create and git resolution

    public void removeUser(String user) {
        if (users.remove(user)) {
            System.out.println("User removed: " + user);
        } else {
            System.out.println("User not found: " + user);
        }
    }

    public List<String> getAllUsers() {
        return new ArrayList<>(users);
    }
}
