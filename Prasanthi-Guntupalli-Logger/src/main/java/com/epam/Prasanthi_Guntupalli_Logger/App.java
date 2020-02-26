package com.epam.Prasanthi_Guntupalli_Logger;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        final Logger log=LogManager.getLogger(App.class);
        log.info("Which one of the following do you want to calculate?");
        log.info("\n1.Construction cost\n2.Interest Calculation");
        int n=sc.nextInt();
        if(n==1){
            ConstructionCost constructionCost=new ConstructionCost();
            constructionCost.main(args);
        }
        else if(n==2) {
            InterestCalculation interestCalculation = new InterestCalculation();
            interestCalculation.main(args);
        }
        else {
        	log.info("Invalid Input");
        }
    }
}