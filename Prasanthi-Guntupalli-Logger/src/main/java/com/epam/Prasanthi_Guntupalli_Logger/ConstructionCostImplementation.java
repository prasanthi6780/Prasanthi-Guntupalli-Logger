package com.epam.Prasanthi_Guntupalli_Logger;

public class ConstructionCostImplementation {
    public int calculation(int material_standard,double area)
    {
        if (material_standard==1)
        {
            return (int) (2500 * area);
        }
        else if (material_standard==2)
        {
            return (int) (1200 * area);
        }
        else if (material_standard==3)
        {
            return (int) (1500 * area);
        }
        else if (material_standard==4)
        {
            return (int) (1800 * area);
        }
        return 0;
    }
}