import java.util.*;

public class VnExpress {
    private String newPost;
    private Set<User> users;

    public VnExpress(){
        users = new HashSet<>();
    }

    /**
     * Notify a the User in the list whenever there is a new post
     */
    public void notifyNewPost(){
        for (User user:users){
            user.update();
        }
    }

    /**
     * Add a new User to list
     */
    public void attach(User user){
        users.add(user);
    }

    /**
     * Remove a User from list
     */
    public void detach(User user){
        users.remove(user);
    }

    /**
     * Upload new post
     */
    public void setNewPost(String newPost){
        this.newPost = newPost;
        this.notifyNewPost();
    }

    /**
     * Get the new post
     */
    public String getNewPost(){
        return newPost;
    }
}