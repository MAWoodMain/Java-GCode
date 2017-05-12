package model.subSystems;

/**
 * Java-GCode
 * Created by Matthew Wood on 12/05/2017.
 */
public class MovementSystem
{

    public void setFeedRate(double feedRate)
    {

    }

    public void setEndstopMode(int endstopMode)
    {

    }

    public void moveToPos(Double x, Double y, Double z, Double e)
    {
        // Expecting no movement in any axis to be null eg if only moving x and y with no extrusion z = null & e = null
    }
}
