package dio.Strategy;

public class Main {
  public static void main(String[] args) {
    RobotBehavior robot1 = new Robot1();
    RobotBehavior robot2 = new Robot2();
    RobotBehavior robot3 = new Robot3();

    Robot robot = new Robot();

    // Move robot 1
    robot.setRobot(robot1);

    // Move robot 2
    robot.setRobot(robot2);

    // Move robot 3
    robot.setRobot(robot3);
  }
}
