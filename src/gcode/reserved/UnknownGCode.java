package gcode.reserved;

import gcode.GCode;

import java.util.Arrays;

/**
 * Java-Gcode
 * Created by Matthew Wood on 12/05/2017.
 */
public class UnknownGCode extends GCode
{

    public UnknownGCode(GCode gCode)
    {
        super(gCode);
    }

    @Override
    public boolean process() throws Exception
    {
        return false;
    }

    @Override
    public String toString()
    {
        return "UnknownGCode{" +
                "code='" + code + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
