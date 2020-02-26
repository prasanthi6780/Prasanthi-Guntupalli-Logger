package com.epam.Prasanthi_Guntupalli_Logger;

public class InterestImplementation {
    public double calculateSimpleInterest(float principleAmount,float rateOfInterest,float timePeriod)
    {
        return (principleAmount*rateOfInterest*timePeriod)/100;
    }
    public double calculateCompoundInterest(float principleAmount,float rateOfInterest,float timePeriod)
    {
        return principleAmount*(Math.pow((1+rateOfInterest/100), timePeriod));
    }
}
