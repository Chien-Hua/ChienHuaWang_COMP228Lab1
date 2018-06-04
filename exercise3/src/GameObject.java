public class GameObject {
    private double x;
    private double y;
    private double velocity;
    private Boolean state;
    private double rotation;

// end variables


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVelocity() {
        return velocity;
    }

    public Boolean getState() {
        return state;
    }

    public double getRotation() {
        return rotation;
    }
// end property

    public GameObject(double x, double y, double velocity, Boolean state, double rotation) {
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.state = state;
        this.rotation = rotation;
    }
    // end constructor

    // to format properties into string
    public String getGameObject() {
        String objectData = "The Center is X: " + x + "\n" + "The center is Y: " + y+ "\n"+ "The Velocity is: " + velocity + "\n" +
                "The State is: " + state + "\n" + "The Rotation is" + rotation;
        return objectData;
    }
}