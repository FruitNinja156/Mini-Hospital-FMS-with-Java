package sample;

import javafx.scene.control.Button;

public class modelTable {
    String id, name, lname, gname, sex, pat_type, city, subcity;
    int phno, age;
    Button update;

    public Button getUpdate() {
        return update;
    }

    public void setUpdate(Button update) {
        this.update = update;
    }

    public modelTable(Button update) {
        this.update = update;
    }



    public modelTable(String id, String name, String lname, String gname, Button btn) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPat_type() {
        return pat_type;
    }

    public void setPat_type(String pat_type) {
        this.pat_type = pat_type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSubcity() {
        return subcity;
    }

    public void setSubcity(String subcity) {
        this.subcity = subcity;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public modelTable(String id, String name, String lname, String gname, String sex, String pat_type, String city, String subcity, int phno, int age) {
        this.id = id;
        this.name = name;
        this.lname = lname;
        this.gname = gname;
        this.sex = sex;
        this.pat_type = pat_type;
        this.city = city;
        this.subcity = subcity;
        this.phno = phno;
        this.age = age;
//

    }
}
