package com.spring.IoC;

public class UserLogin {
    private User user;
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public boolean userLogin(User user){
        boolean flag=false;
        if(user.getAccount().equals("admin")&&
                user.getPassword().equals("111")){
         flag=true;
        }
        return flag;
    }


}
