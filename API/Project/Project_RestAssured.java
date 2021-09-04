package RestAssuredProject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class Project_RestAssured {
  
	
     RequestSpecification requestSpec;
     String SSHkey="ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQC4u50lCrTea4l3uhu1N0jGLDTxhwKGgkiLLhfYxysdWHiqq7lHg+SSDPISJ5Yi1ASJ0/hwSfpoctZH1uHTN2RHeLjcek632Ha3FS27R7hpde9Y7FhjpdH5KQ3nKpaNNE0Qo0iK0AIck4dzRNJua38eNAcUhfGWtOmGxAHTS163jsA0jb8n5zXE5rWdqvPlmFsdFFEbL4q79Yuh9/UKxjD3M8Snifjuq/HZbsz7NF/nE3V301AX2IY7tTBQlLKpmFHjbUsq5YcoqcwBvAV2c0bWmC4smz0QWZ98xPf8xq+VjjRPS3Dl+v41MX0Gvd+mVRiuCKDSTWzc5W1OWJVXETVG2dRe6kL83Ygt3aUnYAGIPqULcZNYKhCMYGzS83/7NwjChfZ1LFLVvZg08ObCpOp93lhL0w5dAMUOesWQipjQZ2Dj1lP9zt4nApHabWzblc13VxrxXQCJY2Q1sv6BV3sDnfDA6pXwWQuUgcu6S0l4Fq5kLsxbZwWfTJ+1eBn6TFk=";
     int ID;
     final static String ROOT_URI = "https://api.github.com";
     
     @BeforeClass
     public void setUp() {
         // Create request specification
         requestSpec = new RequestSpecBuilder()
             .setContentType(ContentType.JSON)
             .setBaseUri("https://api.github.com")
             .addHeader("Authorization", "token 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")
             .build();
     }
	
     @Test(priority=1)
     public void addSSH(){
    	 
    	 String reqBody = "{\n" +
    	 		 " \"title\": \"TestAPIKey\",\n" +
    	 		 " \"key\":\"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQC4u50lCrTea4l3uhu1N0jGLDTxhwKGgkiLLhfYxysdWHiqq7lHg+SSDPISJ5Yi1ASJ0/hwSfpoctZH1uHTN2RHeLjcek632Ha3FS27R7hpde9Y7FhjpdH5KQ3nKpaNNE0Qo0iK0AIck4dzRNJua38eNAcUhfGWtOmGxAHTS163jsA0jb8n5zXE5rWdqvPlmFsdFFEbL4q79Yuh9/UKxjD3M8Snifjuq/HZbsz7NF/nE3V301AX2IY7tTBQlLKpmFHjbUsq5YcoqcwBvAV2c0bWmC4smz0QWZ98xPf8xq+VjjRPS3Dl+v41MX0Gvd+mVRiuCKDSTWzc5W1OWJVXETVG2dRe6kL83Ygt3aUnYAGIPqULcZNYKhCMYGzS83/7NwjChfZ1LFLVvZg08ObCpOp93lhL0w5dAMUOesWQipjQZ2Dj1lP9zt4nApHabWzblc13VxrxXQCJY2Q1sv6BV3sDnfDA6pXwWQuUgcu6S0l4Fq5kLsxbZwWfTJ+1eBn6TFk=\",\n" +
    	 		
     "}\n";
    	 
    	 Response response = 
    	            given().contentType(ContentType.JSON)// Set headers
    	            .body(reqBody)
    	            .when().pathParam("petId", "77232") // Set path parameter
    	            .get(ROOT_URI + "/user/keys"); // Send GET request
    	 
    	 ID = response.then().extract().path("[0].SSHkey");
    	 
    	 response.then().statusCode(201);
     }
     
     @Test(priority=2)
     public void getKey(){
    	 
    	 Response response = 
    		        given().contentType(ContentType.JSON) // Set headers
    		        .when().get(ROOT_URI + "/user/keys");
    	 
    	 System.out.println(response.asPrettyString());
    	 
    	 response.then().statusCode(200);
     }
    	 
     @Test(priority=3)
     public void deleteKey() {
    	 
    	 Response response = 
    		        given().contentType(ContentType.JSON) // Set headers
    		        .when().pathParam("keyId", ID)
    		        .delete(ROOT_URI + "/user/keys/{keyId}");
    	 System.out.println(response.getBody().asPrettyString());
    	 
    	 response.then().statusCode(204);
     }
    	 		
    	 
 }
	
