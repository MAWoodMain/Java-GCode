package gcode.reserved;

import com.sun.javaws.exceptions.InvalidArgumentException;
import gcode.GCode;

import java.util.Arrays;

/**
 * Java-Gcode
 * Created by Matthew Wood on 12/05/2017.
 */
public class UnclassifiedGCode extends GCode
{
    protected UnclassifiedGCode(String command, int lineNumber) throws InvalidArgumentException
    {
        super(command, lineNumber);
    }

    public UnclassifiedGCode(String command) throws InvalidArgumentException
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
                ", arguments=" + Arrays.toString(arguments) +
                '}';
    }
}
