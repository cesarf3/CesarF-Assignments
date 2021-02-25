public class Project {
    //attributes
    private String name;
    private String description;
    private double initialCost;
    //Constructor
    public Project (String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }
    //Overload the constructor method in three different ways: 
    public Project (){
        this.name = "John Doe";
        this.description = "Your description goes here";
        this.initialCost = 0;
    }
    public Project (String name){
        this.name = name;
        this.description = "No description available";
        this.initialCost = 5; 
    }
    public Project (String name, String description){
        this.name = name;
        this.description = description;
        this.initialCost = 5;
    }
    //Create an instance method called elevatorPitch that will return the name and description separated by a colon.
    public String elevatorPitch(){
         return getName() + " (" + getInitialCost() + "): " + getDescription();
    }
    //Getters
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public Double getInitialCost(){
        return initialCost;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setInitialCost(Double initialCost){
        this.initialCost = initialCost;
    }
}