import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    /*
      * My two 2d arrays, one full of dog captions
      * and the other full of things I call my dog
      */
ImageFilter[][] dogImage = {
  {new ImageFilter("test.png"), new ImageFilter("test1.png")},
  {new ImageFilter("test2.png"), new ImageFilter("test3.png")}
};

    String[][] dogCaption = {
  {"cutie".toUpperCase(), "bella!".toUpperCase()},
  {"baby".toUpperCase(), "rat".toUpperCase()}
};

    /*
    * Basic stuff to get the scene to be drawn, 
    * and can't forget to add the 2d arrays to it
      */
MyStory scene = new MyStory(dogImage, dogCaption);

  // main drawScene call
    scene.drawScene();

    // Play the scene in the Theater 
    Theater.playScenes(scene);
    
  }
}