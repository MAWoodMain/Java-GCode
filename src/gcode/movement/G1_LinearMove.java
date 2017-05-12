package gcode.movement;

import gcode.GCode;
import model.Printer3D;

import java.util.Arrays;

/**
 * Java-GCode
 * Created by Matthew Wood on 12/05/2017.
 */
public class G1_LinearMove extends GCode
{

    public G1_LinearMove(GCode gCode)
    {
        super(gCode);
    }

    @Override
    public boolean process() throws Exception
    {
        Double x = null;
        Double y = null;
        Double z = null;
        Double e = null;
        Double f = null;
        Integer s = null;

        for(String part: arguments)
        {
            if(part.length() < 1) continue;
            try
            {
                switch (part.toUpperCase().charAt(0))
                {
                    case 'X':
                        x = Double.parseDouble(part.substring(1));
                        break;
                    case 'Y':
                        y = Double.parseDouble(part.substring(1));
                        break;
                    case 'Z':
                        z = Double.parseDouble(part.substring(1));
                        break;
                    case 'E':
                        e = Double.parseDouble(part.substring(1));
                        break;
                    case 'F':
                        f = Double.parseDouble(part.substring(1));
                        break;
                    case 'S':
                        s = Integer.parseInt(part.substring(1));
                        break;
                }
            } catch (Exception ex)
            {
                ex.printStackTrace();
                return false;
            }
        }

        if(s != null) Printer3D.MOVEMENT_SYSTEM.setEndstopMode(s);
        if(f != null) Printer3D.MOVEMENT_SYSTEM.setFeedRate(f);
        Printer3D.MOVEMENT_SYSTEM.moveToPos(x,y,z,e);

        return true;
    }

    @Override
    public String toString()
    {
        String argumentPart = arguments.length > 0?(", arguments=" + Arrays.toString(arguments)):"";
        return "G1_LinearMove{" +
                "code='" + code + '\'' +
                argumentPart+
                '}';
    }
}
