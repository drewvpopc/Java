public class UserInfo {
    private static String password;
    private static String userId;


    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        UserInfo.userId = userId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        UserInfo.password = password;
    }
    public UserInfo(String userId, String password) {
        UserInfo.userId = userId;
        UserInfo.password = password;
    }
    public UserInfo() {
        UserInfo.userId = "Andrew12";
        UserInfo.password = "Andrew13";
    }

    public String toString(){
        return ("\n\tUser Created, Here is the information you provided." +
                "\n\tUsername: "+ (userId) +
                "\n\tPassword: "+ (password)
        );
    }
}
