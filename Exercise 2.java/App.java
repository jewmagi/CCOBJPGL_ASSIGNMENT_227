public class App {
    
  public static void main(String[] args) throws Exception {
    
            Planet mars = new Mars();
            Planet saturn = new Saturn();
            Planet mercury = new Mercury();
            Planet earth = new Earth();
            Planet venus = new Venus();
    
            Explorer astronaut = new HumanExplorer();
            Explorer rover = new RobotExplorer();
    
            mars.accept(astronaut);
            saturn.accept(astronaut);
            mercury.accept(astronaut);
            earth.accept(astronaut);
            venus.accept(astronaut);
    
            mars.accept(rover);
            saturn.accept(rover);
            mercury.accept(rover);
            earth.accept(rover);
            venus.accept(rover);
        }
    }
