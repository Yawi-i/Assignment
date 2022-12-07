import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void TestNamePass(){
        Employee myEmployee = new Employee("Jason","pps","phone","gender",0);
        assertTrue(myEmployee.Name() > 5 || myEmployee.Name() < 22,"Name should be 5 to 22 characters");
    }
    @Test
    void TestNameFail(){
        Employee myEmployee = new Employee("Jazz","pps","phone","gender",0);
        assertThrows(IllegalArgumentException.class,
                () -> {myEmployee.Name();},
                "Name should be 5 to 22 characters"
        );
    }
    @Test
    void TestPPSPass(){
        Employee myEmployee = new Employee("name","ABC123","phone","gender",0);
        assertTrue(myEmployee.Pps() == 6,"PPS ID should be 6 characters");
    }
    @Test
    void TestPPSFail(){
        Employee myEmployee = new Employee("name","AB12","phone","gender",0);
        assertThrows(IllegalArgumentException.class,
                () -> {myEmployee.Pps();},
                "PPS ID should be 6 characters"
        );
    }
    @Test
    void TestAgePass(){
        Employee myEmployee = new Employee("name","pps","phone","gender",18);
        assertTrue(myEmployee.Age() >= 18,"Minimum age required is 18");
    }
    @Test
    void TestAgeFail(){
        Employee myEmployee = new Employee("name","pps","phone","gender",17);
        assertThrows(IllegalArgumentException.class,
                () -> {myEmployee.Age();},
                "Minimum age required is 18"
        );
    }
    @AfterEach
    void tearDown() {
    }
}