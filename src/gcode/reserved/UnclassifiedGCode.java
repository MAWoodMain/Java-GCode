package gcode.reserved;

import gcode.GCode;
import gcode.InvalidGCodeException;

import java.util.Arrays;

/**
 * Java-Gcode
 * Created by Matthew Wood on 12/05/2017.
 */
public class UnclassifiedGCode extends GCode
{
    protected UnclassifiedGCode(String command, int lineNumber) throws InvalidGCodeException
    {
        super(command, lineNumber);
    }

    public UnclassifiedGCode(String command) throws InvalidGCodeException
    {
        super(command);
    }

    @Override
    public boolean process() throws Exception
    {
        return false;
    }

    @Override
    public String toString()
    {
        return "UnclassifiedGCode{" +
                "code='" + code + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
