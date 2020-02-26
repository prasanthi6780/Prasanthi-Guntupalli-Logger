package com.epam.Prasanthi_Guntupalli_Logger;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class InterestCalculation {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        final Logger log=LogManager.getLogger(InterestCalculation.class);
        log.info("Enter Principle Amount:");
        float principleAmount=sc.nextFloat();
        log.info("\nEnter rate of Interset:");
        float rateOfInterest=sc.nextFloat();
        log.info("\nEnter TimePeriod:");
        float timePeriod=sc.nextFloat();
        log.info("\nchoose one of thethe following:\n1.Simple Interest\n2.Compound Interest");
        int ch=sc.nextInt();
        InterestImplementation si=new InterestImplementation();
        if(ch==1) {
            log.info("\nSimple Interest is :" + (int) si.calculateSimpleInterest(principleAmount, rateOfInterest, timePeriod));
        }
        if(ch==2) {
            log.info("\nCompound Interest is :" + (int) si.calculateCompoundInterest(principleAmount, rateOfInterest, timePeriod));
        }
    }
}