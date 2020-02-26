package com.epam.Prasanthi_Guntupalli_Logger;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ConstructionCost {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        final Logger log=LogManager.getLogger(ConstructionCost.class);
        log.info("Enter the Material Standard:");
        log.info("\n1.1200 INR--- Standard Materials\n2.1500 INR--- Above Standard Materials\n3.1800 INR---	High Standard Material\n4.2500 INR--- High Standard Material+Fully Automated Home");
        int material_standard=sc.nextInt();
        log.info("\nEnter the area of home in square feet:");
        double area=sc.nextDouble();
        ConstructionCostImplementation constructionCostImplementation=new ConstructionCostImplementation();
        log.info("\nConstruction Cost is :"+constructionCostImplementation.calculation(material_standard,area));
        }
}