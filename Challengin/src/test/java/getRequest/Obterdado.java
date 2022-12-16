package getRequest;


import org.hamcrest.Matchers;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;;

public class Obterdado {
 @BeforeClass
 public static void setup() {

  RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
 }

 @Test
 public void listaDados() {

  RestAssured.given()
          .when()
          .get("/users")
          .then()
          .statusCode(200)
  ;
 }

 @Test
 public void insereDados() {

  RestAssured.given()
          .body("{\"name\": \"Carine\",\"username\": \"Mota\",\"email\": \"mota@uol.com\"}")
          .contentType(ContentType.JSON)
          .when()
          .post("users")
          .then()
          .statusCode(201)

          .body("name", Matchers.is("Carine"))
          .body("username", Matchers.is("Mota"))
          .body("email", Matchers.is("mota@uol.com"))
  ;

 }

 @Test
 public void atualizaDados() {

  RestAssured.given()
          .body("{\"name\": \"Carine\",\"username\": \"Mota\",\"email\": \"mota@uol.com\"}")
          .contentType(ContentType.JSON)
          .when()
          .put("users/1")
          .then()
          .statusCode(200)

          .body("name", Matchers.is("Carine"))
          .body("username", Matchers.is("Mota"))
          .body("email", Matchers.is("mota@uol.com"))
  ;

 }

 @Test
 public void deletaDados() {

  RestAssured.given()
          .contentType(ContentType.JSON)
          .when()
          .delete("users/11")
          .then()
          .statusCode(200);
 }


}