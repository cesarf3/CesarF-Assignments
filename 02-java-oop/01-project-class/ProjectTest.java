public class ProjectTest {
    public static void main(String[] args) {
        Project demo = new Project();
        Project noDescriptionProject = new Project("No Description Project");
        Project cleaning = new Project("Cleaning", "How to clean the room");
        Project erasing = new Project("Erasing", "How to erase things on paper", 27.4);
        System.out.println(cleaning.elevatorPitch());
        System.out.println(erasing.elevatorPitch());
        System.out.println(noDescriptionProject.elevatorPitch());
        System.out.println(demo.elevatorPitch());

        Portfolio portfolio = new Portfolio();
        
    }
}