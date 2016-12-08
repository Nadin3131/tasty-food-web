package com.zenkevich.nadin.tastyfood.model;

/**
 * Created by nadin on 12/8/16.
 */
public class Recipe {
  private String title;
  private String content;
  private String image;

  public Recipe() {
  }

  public Recipe(String title, String content, String image){
    this.title = title;
    this.content = content;
    this.image = image;
  }

  public String getTitle(){
    return title;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
}
