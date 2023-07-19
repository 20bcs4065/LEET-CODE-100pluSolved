class Solution {
    public double[] convertTemperature(double celsius) {
        double k=celsius+273.15;
        double f=celsius * 1.80 + 32.00;
        double a1[]=new double[2];
        a1[0]=k;
        a1[1]=f;
        System.gc();
        return a1;}}
