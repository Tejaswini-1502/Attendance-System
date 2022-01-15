package com.example.attendancesystem;
public class login {
    String username;
    String pwd;

    public login(String username, String pwd) {

        this.username = username;
        this.pwd = pwd;
    }

    public login() {
    }
    //toString

    @Override
    public String toString() {
        return "login{" +

                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    //setters and getters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
