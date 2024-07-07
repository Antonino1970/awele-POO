/*
 * API Awele
 * API pour gérer un jeu d'Awele.
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.RestScore;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * RestTabScore
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-06T18:38:05.873923603Z[GMT]")

public class RestTabScore {
  @SerializedName("score")
  private List<RestScore> score = null;

  public RestTabScore score(List<RestScore> score) {
    this.score = score;
    return this;
  }

  public RestTabScore addScoreItem(RestScore scoreItem) {
    if (this.score == null) {
      this.score = new ArrayList<RestScore>();
    }
    this.score.add(scoreItem);
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @Schema(description = "")
  public List<RestScore> getScore() {
    return score;
  }

  public void setScore(List<RestScore> score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestTabScore restTabScore = (RestTabScore) o;
    return Objects.equals(this.score, restTabScore.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestTabScore {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
