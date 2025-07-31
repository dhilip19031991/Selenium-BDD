package api;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Serialization_Deserialization1 {

    @Test
    public void testB() {

        // public static void main(String[] args) {

        AddTrainingPOJO aT = new AddTrainingPOJO();
        aT.setemployeeName("Apsara");
        aT.setCourse("Java");
        aT.setStartDate("2025-07-24");
        aT.setEndDate("2025-07-24");
        aT.setStatus("Completed");
        aT.setTrainerName("Pavithra");
        aT.setTrainingType("Udemy");
        aT.setPercentCompleted("100");
        aT.setProjectName("ABC");

        Gson g = new GsonBuilder().setPrettyPrinting().create();
        String jsonFormat = g.toJson(aT);
        System.out.println(jsonFormat);
    }
    // }

}
