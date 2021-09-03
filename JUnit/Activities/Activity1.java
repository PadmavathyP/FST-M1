package JUnit_Activities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Activity1 {

static ArrayList<String> list;
	 
    
    @BeforeAll
    static void setUp() throws Exception {
    	
        list = new ArrayList<String>();
        list.add("alpha"); 
        list.add("beta"); 
    }
 
    
    @Test
    @Order(1)
    public void insertTest() {
        
        assertEquals(2, list.size(), "Wrong size");
        list.add(2, "charlie");
       
        assertEquals(3, list.size(), "Wrong size");
 
       
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("charlie", list.get(2), "Wrong element");
    }
 
    
    @Test
    public void replaceTest() {
       
        list.set(1, "charlie");
 
        
        assertEquals(2, list.size(), "Wrong size");
       
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("charlie", list.get(1), "Wrong element");
    }

}
