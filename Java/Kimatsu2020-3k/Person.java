public class Person{
    private String firstNmae;
    private String lastName;
    private double oil;


    // setter getterメソッド
    public void setFirstName(String firstName){
        this.firstNmae = firstName;
    }
    public String getFirstName(){
        return this.firstNmae;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setOil(double oil){
        this.oil = oil;
    }
    public double getOil(){
        return this.oil;
    }
}