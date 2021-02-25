import java.util.ArrayList;
public class Portfolio {
    //Create a Portfolio class that will keep an ArrayList of Project in the field projects. Use generics to ensure these are Project objects.
    ArrayList<Project> projects = new ArrayList<Project>();
    //add new project to the array list
    public void addProject(Project X){
        projects.add(X);
    }
    //Add the appropriate getters/setters/constructors for this class to work

    // Add the getPortfolioCost method that calculates and returns the cost to buy the entire portfolio.
    public double getPortfolioCost(){
        double cost = 0;
        for (Project project : projects) {
            cost += project.getInitialCost();
        }
        return cost; 
    }
    // Add the showPortfolio method that will print all the project elevator pitches, followed by the total cost.
    public void showPortfolio(){
        System.out.println("Project Elevator Pitches:");
        for (Project project : projects) {
            System.out.println(project.elevatorPitch());
        }
        System.out.println("Total cost is: $" + getPortfolioCost());
    }
}


 