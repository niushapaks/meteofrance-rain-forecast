package com.meteofrance;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class MeteoFranceResourceTest {

    @Test
    public void testLocationEndpoint() {
        given()
          .when().get("/hello/location/lille")
          .then()
             .statusCode(200)
             .body(is("[ {\n" +
                     "  \"id\" : \"593500\",\n" +
                     "  \"indicatifInseePP\" : null,\n" +
                     "  \"onTheSnowSkiiId\" : 0,\n" +
                     "  \"nomAffiche\" : \"Lille (59000)\",\n" +
                     "  \"type\" : \"VILLE_FRANCE\",\n" +
                     "  \"slug\" : \"lille\",\n" +
                     "  \"codePostal\" : \"59000\",\n" +
                     "  \"timezone\" : \"Europe/Paris\",\n" +
                     "  \"altitude\" : 20,\n" +
                     "  \"altitudeMin\" : 0,\n" +
                     "  \"altitudeMax\" : 0,\n" +
                     "  \"distance\" : 0.0,\n" +
                     "  \"nbHabitants\" : 233214,\n" +
                     "  \"lat\" : 50.631573,\n" +
                     "  \"lon\" : 3.057161,\n" +
                     "  \"directDisplay\" : false,\n" +
                     "  \"refStationId\" : \"07015\",\n" +
                     "  \"refStationName\" : \"LILLE-LESQUIN\",\n" +
                     "  \"nbView\" : 0,\n" +
                     "  \"lastMareeDate\" : null,\n" +
                     "  \"parent\" : null,\n" +
                     "  \"positionAffichageCarteX\" : 0,\n" +
                     "  \"positionAffichageCarteY\" : 0,\n" +
                     "  \"value\" : \"Lille (59000)\",\n" +
                     "  \"pluieAvalaible\" : true\n" +
                     "}, {\n" +
                     "  \"id\" : \"763840\",\n" +
                     "  \"indicatifInseePP\" : null,\n" +
                     "  \"onTheSnowSkiiId\" : 0,\n" +
                     "  \"nomAffiche\" : \"Lillebonne (76170)\",\n" +
                     "  \"type\" : \"VILLE_FRANCE\",\n" +
                     "  \"slug\" : \"lillebonne\",\n" +
                     "  \"codePostal\" : \"76170\",\n" +
                     "  \"timezone\" : \"Europe/Paris\",\n" +
                     "  \"altitude\" : 15,\n" +
                     "  \"altitudeMin\" : 0,\n" +
                     "  \"altitudeMax\" : 0,\n" +
                     "  \"distance\" : 0.0,\n" +
                     "  \"nbHabitants\" : 9378,\n" +
                     "  \"lat\" : 49.520669,\n" +
                     "  \"lon\" : 0.537235,\n" +
                     "  \"directDisplay\" : false,\n" +
                     "  \"refStationId\" : null,\n" +
                     "  \"refStationName\" : null,\n" +
                     "  \"nbView\" : 0,\n" +
                     "  \"lastMareeDate\" : null,\n" +
                     "  \"parent\" : null,\n" +
                     "  \"positionAffichageCarteX\" : 0,\n" +
                     "  \"positionAffichageCarteY\" : 0,\n" +
                     "  \"value\" : \"Lillebonne (76170)\",\n" +
                     "  \"pluieAvalaible\" : true\n" +
                     "}, {\n" +
                     "  \"id\" : \"625160\",\n" +
                     "  \"indicatifInseePP\" : null,\n" +
                     "  \"onTheSnowSkiiId\" : 0,\n" +
                     "  \"nomAffiche\" : \"Lillers (62190)\",\n" +
                     "  \"type\" : \"VILLE_FRANCE\",\n" +
                     "  \"slug\" : \"lillers\",\n" +
                     "  \"codePostal\" : \"62190\",\n" +
                     "  \"timezone\" : \"Europe/Paris\",\n" +
                     "  \"altitude\" : 27,\n" +
                     "  \"altitudeMin\" : 0,\n" +
                     "  \"altitudeMax\" : 0,\n" +
                     "  \"distance\" : 0.0,\n" +
                     "  \"nbHabitants\" : 10141,\n" +
                     "  \"lat\" : 50.563616,\n" +
                     "  \"lon\" : 2.481545,\n" +
                     "  \"directDisplay\" : false,\n" +
                     "  \"refStationId\" : null,\n" +
                     "  \"refStationName\" : null,\n" +
                     "  \"nbView\" : 0,\n" +
                     "  \"lastMareeDate\" : null,\n" +
                     "  \"parent\" : null,\n" +
                     "  \"positionAffichageCarteX\" : 0,\n" +
                     "  \"positionAffichageCarteY\" : 0,\n" +
                     "  \"value\" : \"Lillers (62190)\",\n" +
                     "  \"pluieAvalaible\" : true\n" +
                     "}, {\n" +
                     "  \"id\" : \"593860\",\n" +
                     "  \"indicatifInseePP\" : null,\n" +
                     "  \"onTheSnowSkiiId\" : 0,\n" +
                     "  \"nomAffiche\" : \"Marquette-lez-Lille (59520)\",\n" +
                     "  \"type\" : \"VILLE_FRANCE\",\n" +
                     "  \"slug\" : \"marquette-lez-lille\",\n" +
                     "  \"codePostal\" : \"59520\",\n" +
                     "  \"timezone\" : \"Europe/Paris\",\n" +
                     "  \"altitude\" : 18,\n" +
                     "  \"altitudeMin\" : 0,\n" +
                     "  \"altitudeMax\" : 0,\n" +
                     "  \"distance\" : 0.0,\n" +
                     "  \"nbHabitants\" : 9826,\n" +
                     "  \"lat\" : 50.675481,\n" +
                     "  \"lon\" : 3.064852,\n" +
                     "  \"directDisplay\" : false,\n" +
                     "  \"refStationId\" : null,\n" +
                     "  \"refStationName\" : null,\n" +
                     "  \"nbView\" : 0,\n" +
                     "  \"lastMareeDate\" : null,\n" +
                     "  \"parent\" : null,\n" +
                     "  \"positionAffichageCarteX\" : 0,\n" +
                     "  \"positionAffichageCarteY\" : 0,\n" +
                     "  \"value\" : \"Marquette-lez-Lille (59520)\",\n" +
                     "  \"pluieAvalaible\" : true\n" +
                     "}, {\n" +
                     "  \"id\" : \"595270\",\n" +
                     "  \"indicatifInseePP\" : null,\n" +
                     "  \"onTheSnowSkiiId\" : 0,\n" +
                     "  \"nomAffiche\" : \"Saint-André-lez-Lille (59350)\",\n" +
                     "  \"type\" : \"VILLE_FRANCE\",\n" +
                     "  \"slug\" : \"saint-andre-lez-lille\",\n" +
                     "  \"codePostal\" : \"59350\",\n" +
                     "  \"timezone\" : \"Europe/Paris\",\n" +
                     "  \"altitude\" : 20,\n" +
                     "  \"altitudeMin\" : 0,\n" +
                     "  \"altitudeMax\" : 0,\n" +
                     "  \"distance\" : 0.0,\n" +
                     "  \"nbHabitants\" : 10983,\n" +
                     "  \"lat\" : 50.659459,\n" +
                     "  \"lon\" : 3.043451,\n" +
                     "  \"directDisplay\" : false,\n" +
                     "  \"refStationId\" : null,\n" +
                     "  \"refStationName\" : null,\n" +
                     "  \"nbView\" : 0,\n" +
                     "  \"lastMareeDate\" : null,\n" +
                     "  \"parent\" : null,\n" +
                     "  \"positionAffichageCarteX\" : 0,\n" +
                     "  \"positionAffichageCarteY\" : 0,\n" +
                     "  \"value\" : \"Saint-André-lez-Lille (59350)\",\n" +
                     "  \"pluieAvalaible\" : true\n" +
                     "} ]"));
    }

    @Test
    public void testRainEndpoint() {
        given()
          .when().get("/hello/rain/593500")
          .then()
             .statusCode(200)
             .body(is("{\n" +
                     "  \"idLieu\" : \"593500\",\n" +
                     "  \"echeance\" : \"202002241715\",\n" +
                     "  \"lastUpdate\" : \"17h00\",\n" +
                     "  \"isAvailable\" : true,\n" +
                     "  \"hasData\" : true,\n" +
                     "  \"niveauPluieText\" : [ \"De17h15 à 17h35 : Pas de précipitations\", \"De17h35 à 17h55 : Précipitations faibles\", \"De17h55 à 18h05 : Précipitations modérées\", \"De18h05 à 18h15 : Précipitations faibles\" ],\n" +
                     "  \"dataCadran\" : [ {\n" +
                     "    \"niveauPluieText\" : \"Pas de précipitations\",\n" +
                     "    \"niveauPluie\" : 1,\n" +
                     "    \"color\" : \"ffffff\"\n" +
                     "  }, {\n" +
                     "    \"niveauPluieText\" : \"Pas de précipitations\",\n" +
                     "    \"niveauPluie\" : 1,\n" +
                     "    \"color\" : \"ffffff\"\n" +
                     "  }, {\n" +
                     "    \"niveauPluieText\" : \"Pas de précipitations\",\n" +
                     "    \"niveauPluie\" : 1,\n" +
                     "    \"color\" : \"ffffff\"\n" +
                     "  }, {\n" +
                     "    \"niveauPluieText\" : \"Pas de précipitations\",\n" +
                     "    \"niveauPluie\" : 1,\n" +
                     "    \"color\" : \"ffffff\"\n" +
                     "  }, {\n" +
                     "    \"niveauPluieText\" : \"Précipitations faibles\",\n" +
                     "    \"niveauPluie\" : 2,\n" +
                     "    \"color\" : \"5ec5ed\"\n" +
                     "  }, {\n" +
                     "    \"niveauPluieText\" : \"Précipitations faibles\",\n" +
                     "    \"niveauPluie\" : 2,\n" +
                     "    \"color\" : \"5ec5ed\"\n" +
                     "  }, {\n" +
                     "    \"niveauPluieText\" : \"Précipitations faibles\",\n" +
                     "    \"niveauPluie\" : 2,\n" +
                     "    \"color\" : \"5ec5ed\"\n" +
                     "  }, {\n" +
                     "    \"niveauPluieText\" : \"Précipitations faibles\",\n" +
                     "    \"niveauPluie\" : 2,\n" +
                     "    \"color\" : \"5ec5ed\"\n" +
                     "  }, {\n" +
                     "    \"niveauPluieText\" : \"Précipitations modérées\",\n" +
                     "    \"niveauPluie\" : 3,\n" +
                     "    \"color\" : \"009ee0\"\n" +
                     "  }, {\n" +
                     "    \"niveauPluieText\" : \"Précipitations modérées\",\n" +
                     "    \"niveauPluie\" : 3,\n" +
                     "    \"color\" : \"009ee0\"\n" +
                     "  }, {\n" +
                     "    \"niveauPluieText\" : \"Précipitations faibles\",\n" +
                     "    \"niveauPluie\" : 2,\n" +
                     "    \"color\" : \"5ec5ed\"\n" +
                     "  }, {\n" +
                     "    \"niveauPluieText\" : \"Précipitations faibles\",\n" +
                     "    \"niveauPluie\" : 2,\n" +
                     "    \"color\" : \"5ec5ed\"\n" +
                     "  } ]\n" +
                     "}"));
    }

}