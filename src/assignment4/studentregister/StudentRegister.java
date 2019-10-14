package assignment4.studentregister;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StudentRegister {
    private List<StudentInfo> StudentList;

    public StudentRegister(){
        this.StudentList = new ArrayList<>();

    }

    public List<StudentInfo> GetStudentList(){
        return this.StudentList;
    }

    public void readStudentsFromFile(String path){
        try (FileReader reader = new FileReader(path))
        {
            //Read JSON file
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(reader);

            JSONArray studentList = (JSONArray) obj;

            //Iterate over employee array
            studentList.forEach( student -> parseStudentObject((JSONObject) student ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }

    private void parseStudentObject(JSONObject student)
    {

        //Get student first name
        String firstName = (String) student.get("firstName");

        //Get student last name
        String lastName = (String) student.get("lastName");

        //Get student city name
        String city = (String) student.get("city");
        //Get student IpAddress
        String ipAddress = (String) student.get("ipAddress");

        this.StudentList.add(new StudentInfo(firstName, lastName, city, ipAddress));
    }
}
