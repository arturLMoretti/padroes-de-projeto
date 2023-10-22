package dio.Strategy;

public class Robot {
  private RobotBehavior robotBehavior;

  public void setRobot(RobotBehavior behavior) {
    this.robotBehavior = behavior;
  }

  public void move() {
    robotBehavior.mover();
  }
}
