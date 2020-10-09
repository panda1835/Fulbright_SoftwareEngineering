
public class Test{
    public static void main(String[] args){
        VnExpress vnExpress = new VnExpress();

        User user1 = new User(vnExpress, "user 1");
        user1.register(vnExpress);
        User user2 = new User(vnExpress, "user 2");
        user2.register(vnExpress);
        User user3 = new User(vnExpress, "user 3");
        user3.register(vnExpress);

        vnExpress.setNewPost("This is a new post on VnExpress");
        vnExpress.setNewPost("This is another new post on VnExpress");

    }
}