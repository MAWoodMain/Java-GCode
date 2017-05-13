package gcode.movement;

import gcode.GCode;

import java.util.Arrays;

/**
 * Java-Gcode
 * Created by Matthew Wood on 12/05/2017.
 */
public class G0_RapidLinearMove extends G1_LinearMove
{
    public G0_RapidLinearMove(GCode gCode)
    {
        super(gCode);
    }


    @Override
    public String toString()
    {
        return "G0_RapidLinearMove{" +
                "code='" + code + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
