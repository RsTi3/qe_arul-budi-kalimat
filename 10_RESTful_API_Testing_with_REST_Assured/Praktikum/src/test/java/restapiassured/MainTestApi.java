package restapiassured;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import static  io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.core.IsEqual.equalTo;


public class MainTestApi {
    @Test //Mendapatkan semua data post
    public void GetAllPost() {
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .log().all() //request dari log
                .get("/posts")
                .then()
                .log().all() //response dari log
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("allpostschema.json"));
    }
    @Test //Membuat data post baru
    public void PostNewData() {
        int userId = 2;
        String title = "POSTINGAN BARU NIH";
        String body = "POSTINGAN ARUL BUDI KALIMAT";
        JSONObject bodyRequest = new JSONObject();
        bodyRequest.put("userId", userId);
        bodyRequest.put("title",title);
        bodyRequest.put("body",body);

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body(bodyRequest)
                .when()
                .log().all() //request dari log
                .post("/posts")
                .then()
                .log().all() //response dari log
                .statusCode(201)
                .body("id",equalTo(101))
                .body("userId",equalTo(userId))
                .body("title",equalTo(title))
                .body("body",equalTo(body))
                .body(matchesJsonSchemaInClasspath("newpostschema.json"));

    }
    @Test //Mendapatkan data post berdasarkan ID
    public void getSpecificPost() {
        int postId = 1 ;
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .log().all() //request dari log
                .get("/posts/"+postId)
                .then()
                .log().all() //response dari log
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("getspecificpostschema.json"));
    }

    @Test //Mengubah data post berdasarkan ID.
    public void editPost() {
        int userId = 2;
        int postId = 1;
        String title = "POSTINGAN BARU NIH";
        String body = "POSTINGAN ARUL BUDI KALIMAT";
        JSONObject bodyRequest = new JSONObject();
        bodyRequest.put("userId", userId);
        bodyRequest.put("title",title);
        bodyRequest.put("body",body);

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body(bodyRequest)
                .when()
                .log().all() //request dari log
                .put("/posts/"+postId)
                .then()
                .log().all() //response dari log
                .statusCode(200)
                .body("id",equalTo(postId))
                .body("userId",equalTo(userId))
                .body("title",equalTo(title))
                .body("body",equalTo(body))
                .body(matchesJsonSchemaInClasspath("editpostschema.json"));
    }
    @Test //Menghapus Data Post berdasarkan ID.
    public void DelletePost() {
        int userId = 1;
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .log().all() //request dari log
                .delete("/posts/"+userId)
                .then()
                .log().all() //response dari log
                .statusCode(200);
//                .body(matchesJsonSchemaInClasspath("editpostschema.json"));
    }
    }
