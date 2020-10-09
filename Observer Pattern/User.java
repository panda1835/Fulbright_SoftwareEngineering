
public class User{
    private VnExpress vnExpress;
    private String newPost;
    private String name;

    public User(VnExpress vnExpress, String name){
        this.vnExpress = vnExpress;
        this.name = name;
    }

    /**
     * Update new news from VnExpress
     */
    public void update(){
        System.out.println("Notify on "+this.name + ": "+vnExpress.getNewPost());
    }

    /**
     * Register this user to VnExpress list of User
     */
    public void register(VnExpress vnExpress){
        vnExpress.attach(this);
    }

    /**
     * Unregister this user from VnExpress list of User
     */
    public void unregister(VnExpress vnExpress){
        vnExpress.detach(this);
    }
}