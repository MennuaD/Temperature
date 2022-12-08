public class Temperature
{
    private double highTemp;
    private double lowTemp;
    private String tempScale;

    // Precondition: scale must be: "F" or "C"; anything else will default to "F"
    public Temperature(double high, double low, String scale)
    {
        highTemp = high;
        lowTemp = low;

        if (scale.equals("F") || scale.equals("C"))
        {
            tempScale = scale;
        }
        else
        {
            tempScale = "F";
        }
    }

    // 1. Add your two static methods here:
public static double convertCtoF(double temp){
        double convert = temp * (9.0/5) + 32;
        System.out.println(convert);
        return  convert;
}
public static double convertFtoC(double temp){
        double convert = (temp - 32) * (5.0/9);
        System.out.println(convert);
        return convert;
}


    // 2. Add your two instance methods here:
public void changeToC(){

        if (tempScale.equals("F")) {
            tempScale = "C";
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);
        }
}

public void changeToF(){
    if (tempScale.equals("C")){
        tempScale = "F";
        highTemp = convertCtoF(highTemp);
        lowTemp = convertCtoF(lowTemp);
    }
}


    // 3. Add your private static helper rounding "utility" method here:
private static double roundToNearestTenth(double num){
        double rounded = Math.round(num * 10);
        rounded = rounded / 10;
        return rounded;
}

    // 4. Complete the toString method below (using your static helper method)
    //    so it returns a String that prints like:

    //    High Temperature: 67.4 F (or C)
    //    Low Temperature: 58.3 F (or C)

    public String toString()
    {
        return ("High Temp: " + roundToNearestTenth(highTemp) + " " + tempScale + "\nLow Temp: " + roundToNearestTenth(lowTemp) + " " + tempScale);
    }
}
