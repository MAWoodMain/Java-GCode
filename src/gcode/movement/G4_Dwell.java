package gcode.movement;

import gcode.GCode;

import java.util.Arrays;

/**
 * Java-Gcode
 * Created by Matthew Wood on 12/05/2017.
 */
public class G4_Dwell extends GCode
{
    public G4_Dwell(GCode gCode)
    {
        super(gCode);
    }

    @Override
    public boolean process() throws Exception
    {
        if(arguments.length < 2) return false;
        switch (arguments[1].toUpperCase().charAt(0))
        {
            case 'P':
                Thread.sleep(Long.parseLong(arguments[1].substring(1)));
                break;
            case 'S':
                Thread.sleep((long)Math.floor(1000*Double.parseDouble(arguments[1].substring(1))));
                break;
        }
        return true;
    }

    @Override
    public String toString()
    {
        String argumentPart = arguments.length > 0?(", arguments=" + Arrays.toString(arguments)):"";
        return "G4_Dwell{" +
                "code='" + code + '\'' +
                argumentPart+
                '}';
    }
}
