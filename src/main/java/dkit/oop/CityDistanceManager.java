package dkit.oop;

public class CityDistanceManager {

    String cities[] = {"Dublin", "Belfast", "Cork", "Limerick", "Galway"};

    int[][] distances =
            {           // distances between the cities Dublin to Belfast is 167km
                    {0, 167, 257, 198, 219},
                    {167, 0, 424, 323, 306},
                    {257, 424, 0, 105, 209},
                    {198, 323, 105, 0, 105},
                    {219, 306, 209, 105, 0}
            };

    CityDistanceManager(){};    // constructor;

    // Q4.1
    public int findDistanceBetween(String city1, String city2) {
        // write code here
        int index1 = findCityIndex(city1);
        int index2 = findCityIndex(city2);
        if(index1 != -1 && index2 != -1)
        {
            return distances[index1][index2];
        }
        return 0;
    }

    public int findCityIndex(String searchCity)
    {
        for(int i=0; i < cities.length; i++)
        {
            if(cities[i].equalsIgnoreCase(searchCity))
            {
                return i;
            }
        }
        return -1;
    }

    // Q4.2
    public String findClosestCityTo(String searchCity) {
        // Step 1: find index of searchCity
        int index = findCityIndex(searchCity);
        if(index == -1)
        {
            return "City not found";
        }
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i=0; i < distances.length; i++)
        {
            if(distances[index][i] < min && i != index)
            {
                min = distances[index][i];
                minIndex = i;
            }
        }
        return cities[minIndex];
    }

    /////////////// no changes required below this comment ///////////////

    public  void printCitiesData() {
        System.out.printf("%-10s", "");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%10s", cities[i]);
        }
        System.out.println("");

        for (int i = 0; i < distances.length; i++) {
            System.out.printf("%-10s", cities[i]);

            for (int j = 0; j < distances.length; j++) {
                System.out.printf("%10d", distances[i][j]);
            }
            System.out.println("");
        }
    }
}
