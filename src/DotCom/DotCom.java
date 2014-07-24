package DotCom;


import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String Input) {
        String result = "Мимо";
        int index =  locationCells.indexOf(Input);
        if (index >= 0) {
            locationCells.remove(index);

            if(locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + name);
            } else {
                result = "Попал";
            }
        }

        return  result;
    }
}
