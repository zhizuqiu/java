/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.18.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.coreos.monitoring.models;

import java.util.Objects;
import java.util.Arrays;
import com.coreos.monitoring.models.V1ThanosRulerSpecDownwardAPIItems;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * information about the downwardAPI data to project
 */
@ApiModel(description = "information about the downwardAPI data to project")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecProjectedDownwardAPI {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1ThanosRulerSpecDownwardAPIItems> items = null;


  public V1ThanosRulerSpecProjectedDownwardAPI items(List<V1ThanosRulerSpecDownwardAPIItems> items) {
    
    this.items = items;
    return this;
  }

  public V1ThanosRulerSpecProjectedDownwardAPI addItemsItem(V1ThanosRulerSpecDownwardAPIItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<V1ThanosRulerSpecDownwardAPIItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items is a list of DownwardAPIVolume file
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Items is a list of DownwardAPIVolume file")

  public List<V1ThanosRulerSpecDownwardAPIItems> getItems() {
    return items;
  }


  public void setItems(List<V1ThanosRulerSpecDownwardAPIItems> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ThanosRulerSpecProjectedDownwardAPI v1ThanosRulerSpecProjectedDownwardAPI = (V1ThanosRulerSpecProjectedDownwardAPI) o;
    return Objects.equals(this.items, v1ThanosRulerSpecProjectedDownwardAPI.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ThanosRulerSpecProjectedDownwardAPI {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

