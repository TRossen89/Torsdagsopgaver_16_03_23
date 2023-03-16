package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room room_1 = new Room(2, 6, 4);
        Room room_2 = new Room(1, 4, 2);
        Room room_3 = new Room(4, 6, 1);

        ArrayList<Room> three_rooms = new ArrayList<>();

        three_rooms.add(room_1);
        three_rooms.add(room_2);
        three_rooms.add(room_3);


        Building building_1 = new Building(three_rooms, 6, 3, false);


        System.out.println(countLampsInBuilding(building_1));
        System.out.println(isNormal(building_1));

    }

    public static int countLampsInBuilding(Building a_building){

        ArrayList<Room> all_rooms_in_building = a_building.getRooms();

        int number_of_lamps_in_building = 0;


        for (Room r: all_rooms_in_building){

            int number_of_lamps_in_room = r.getNumberOfLamps();

            number_of_lamps_in_building += number_of_lamps_in_room;


        }

        return number_of_lamps_in_building;
    }

    public static boolean isNormal(Building a_building){


        ArrayList<Room> all_rooms_in_building = a_building.getRooms();

        int number_of_rooms_in_building = 0;


        for (Room r: all_rooms_in_building) {

            number_of_rooms_in_building ++;

        }

        int number_of_floors_in_building = a_building.getNumberOfFloors();


        if (number_of_floors_in_building > number_of_rooms_in_building) {

            System.out.println("This is an odd building");

            return  false;
        }



        return true;
    }
}
