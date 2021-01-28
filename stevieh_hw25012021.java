// https://github.com/qa191120/25.01.2021/blob/main/homework.txt
// class Country

package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class Country
{
    public String name;
    public double size;
    public int numberOfCitizens;
    public String continent;

/*    public Country(String name, double size, int numberOfCitizens, String continent)
    {
        this.name = name;
        this.size = size;
        this.numberOfCitizens = numberOfCitizens;
        this.continent = continent;
    }

    @Override
    public String toString()
    {
         return "Country{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", numberOfCitizens=" + numberOfCitizens +
                ", continent='" + continent + '\'' +
                '}';
    }
*/
    public void printCountrySize()
    {
        System.out.println(String.format("size of country: %d", size));
    }

    public void printSizePerCitizen()
    {
        System.out.println(String.format("size per citizen: %d", size / numberOfCitizens));
    }
   
}
