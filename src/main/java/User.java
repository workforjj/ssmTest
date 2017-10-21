/**
 * Created by Administrator on 2017/10/21.
 */
public class User {
    private int a = 0 ;
    public  class users {
        private int b = 2;
        public void gets(){
            System.out.println(b);
        }
    }

    public static  void main(String[] args){
        User.users a = new User().new users();
        a.gets();
    }
}
