package fr.hamdi.training1;


// classe modele de joueurs
public class Player_Model {

    int id;
    String age, name, imageURL,date;

    public Player_Model(int id, String name, String age,String imageURL,String date) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.imageURL = imageURL;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}