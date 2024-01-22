package models;

public class DataModel {
    String user ,password ,name , last_name ,zip ,successful_process ;

    public DataModel(String user, String password, String name, String last_name, String zip, String successful_process) {
        this.user = user;
        this.password = password;
        this.name = name;
        this.last_name = last_name;
        this.zip = zip;
        this.successful_process = successful_process;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getZip() {
        return zip;
    }

    public String getSuccessful_process() {
        return successful_process;
    }
}
