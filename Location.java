
public class Location {

    /** instances needed */

    public boolean isStation = false;
    public String stationName;
    private int xValue;
    private int yValue;
    private int pFlow;
    private int[] RGB;

    /** Constructor */
    public Location(int xValue, int yValue, String name) {
        this.xValue = xValue;
        this.yValue = yValue;
        stationName = name;
        RGB = new int[3];

    }

    /** Bunch of getters and setters */
    public String getName() {
        return stationName;
    }

    public void setName(String name) {
        stationName = name;
    }
    
    public int getpFlow() {
        return pFlow;
    }

    public void setpFlow(int flow) {
        pFlow = flow;
    }

    public int[] getRGB() {
        return RGB;
    }

    public void setRGB(int[] RGB) {
        this.RGB = RGB;
    }

    /** check if the current location is a station
     *
     * @param x the x value of station
     * @param y the y value of station
     * @return if the current location is station
     */
    public boolean checker(int x, int y) {
        if (x == xValue && y == yValue) {
            isStation = true;
        }
        return isStation;
    }

    /** return the proper RGB value for current location
     *
     * @param red the red value for RGB
     * @param green the green value for RGB
     * @param blue the blue value for RGB
     * @return the
     */
    public int[] getLocationRGB(int red, int green, int blue) {
        if (isStation) {
            RGB[0] = 255;
        }
        return RGB;
    }

}
