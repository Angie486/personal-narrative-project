import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

 // Instance variables
   private ImageFilter[][] dogIm;
  private String[][] dogCap;
  
  // Constructor
 public MyStory(ImageFilter[][] dogIm, String[][] dogCap) {
    this.dogIm = dogIm;
    this.dogCap = dogCap;
  }

  // Main drawScene method
  public void drawScene() {
    drawIntroScene();
    drawDogCallScene();
    drawFavCallScene();
    drawZeroYearScene();
    drawOneYearScene();
    drawTwoYearScene();
    drawThreeYearScene();
    drawFourYearScene();
    drawFiveYearScene();
    drawCurrentYearScene();
    
  }

  // ... other methods ...

  /*
  * This draws my intro, where I got the 4 pictures
  * from my 2d array and applyed a filter to them, 
  * and also outputted a sound of a dog barking.
  */
  public void drawIntroScene() {
  // 1. clear the scene / draw background
  clear("pink");
  // 2. Set any style (text size, font, font style, fill color)
  setTextHeight(30);
  setTextColor("white");
  setTextStyle(Font.MONO, FontStyle.BOLD);
  // 3. Draw text and images, play sounds
    playSound("dogBark.wav");
       drawImage(dogIm[0][0], 0, 0, 200);
    pause(0.5);
    dogIm[0][0].makeNegative();
       drawImage(dogIm[0][0], 0, 0, 200);
    
    drawImage(dogIm[0][1], 200, 0, 200);
    pause(0.5);
    dogIm[0][1].makeNegative();
       drawImage(dogIm[0][1], 200, 0, 200);
    
    drawImage(dogIm[1][0], 0, 200, 200);
    pause(0.5);
    dogIm[1][0].makeNegative();
    drawImage(dogIm[1][0], 0, 200, 200);
    
    drawImage(dogIm[1][1], 200, 200, 200);
    pause(0.5);
   dogIm[1][1].makeNegative();
         drawImage(dogIm[1][1], 200, 200, 200);
     // 2. Set any style (text size, font, font style, fill color)
  setTextHeight(30);
  setTextColor("pink");
  setTextStyle(Font.MONO, FontStyle.BOLD);
      drawText("Chapters of Bella", 50, 200);
    
  // 4. Pause before transitioning
pause(1.0);
  }

  /*
  * This draws the things I call my
  *  dog from the 2d array 
  */
 public void drawDogCallScene() {
   clear("white");
    setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
      drawText("Things I call my dog", 25, 50);
    pause(0.5);
    drawText(dogCap[0][0], 50, 100);
    pause(0.5);
    drawText(dogCap[0][1], 250, 100);
    pause(0.5);
    drawText(dogCap[1][0], 50, 300);
    pause(0.5);
    drawText(dogCap[1][1], 250, 300);
   
    pause(1.0);
 }

  /*
  * This is an algorithm I made that traverses
  * through the 2d array to see if it equals
  * bella, which is what I call my dog the most
  */
  public void drawFavCallScene() {
    for (int row = 0; row < dogCap.length; row++) {
   for (int col = 0; col < dogCap[row].length; col++) {
if (dogCap[row][col].equals("bella!".toUpperCase())) {
  clear("white");
   setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
  drawText("Most used call: bella!", 15, 200);
  pause(1.0);
}
  }
     }
  }

  /*
  * This just draws a pic of my dog at zero
  * and then I applyed the make negative filter
  */
  public void drawZeroYearScene() {
    clear("white");
    setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
      drawText("0 Years Old:".toLowerCase(), 25, 50);
    drawImage("Screenshot-2025-01-31-8.07.08-PM.png", 50, 150, 300);
  pause(0.5);
ImageFilter zero = new ImageFilter("Screenshot-2025-01-31-8.07.08-PM.png");
    zero.makeNegative();
    drawImage(zero, 50, 150, 300);
    pause(1.0);
  }

  /*
  * So this draws my dog at one years old 
  * and then adds a colorize filter to it
  */ 
  public void drawOneYearScene() {
     clear("white");
    setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
      drawText("1 Years Old:".toLowerCase(), 25, 50);
    drawImage("Screenshot-2025-02-01-9.47.07-AM.png", 50, 100, 300);
  pause(0.5);
ImageFilter one = new ImageFilter("Screenshot-2025-02-01-9.47.07-AM.png");
    one.colorize();
    drawImage(one, 50, 150, 300);
    pause(1.0);
  }

  /*
  * This draws my dog at two years old
  * and I applyed the colorize filter to it
  */
public void drawTwoYearScene() {
     clear("white");
    setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
      drawText("2 Years Old:".toLowerCase(), 25, 50);
    drawImage("Screenshot-2025-02-01-9.51.51-AM.png", 50, 150, 300);
  pause(0.5);
ImageFilter two = new ImageFilter("Screenshot-2025-02-01-9.51.51-AM.png");
    two.colorize();
    drawImage(two, 50, 150, 300);
    pause(1.0);
  }

  /*
  * This draws my dog at three years old
  * and then I applyed the mirror vertical
  * filter to it
  */
public void drawThreeYearScene() {
     clear("white");
    setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
      drawText("3 Years Old:".toLowerCase(), 25, 50);
    drawImage("Screenshot-2025-02-01-9.56.33-AM.png", 50, 150, 300);
  pause(0.5);
ImageFilter three = new ImageFilter("Screenshot-2025-02-01-9.56.33-AM.png");
    three.mirrorVertical();
    drawImage(three, 50, 150, 300);
    pause(1.0);
  }

  /*
  * This draws my dog at four years old
  * and then applies the mirror vertical 
  * filter to it
  */
public void drawFourYearScene() {
     clear("white");
    setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
      drawText("4 Years Old:".toLowerCase(), 25, 50);
    drawImage("Screenshot-2025-02-01-10.00.06-AM.png", 50, 100, 300);
  pause(0.5);
ImageFilter four = new ImageFilter("Screenshot-2025-02-01-10.00.06-AM.png");
    four.mirrorVertical();
    drawImage(four, 50, 150, 300);
    pause(1.0);
  }

  /*
  * This draws my dog at five years old
  * and then adds my adjustBrightness filter
  */
public void drawFiveYearScene() {
     clear("white");
    setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
      drawText("5 Years Old:".toLowerCase(), 25, 50);
    drawImage("Screenshot-2025-02-01-10.05.21-AM.png", 50, 150, 300);
  pause(0.5);
ImageFilter five = new ImageFilter("Screenshot-2025-02-01-10.05.21-AM.png");
    five.adjustBrightness(50);
    drawImage(five, 50, 150, 300);
    pause(1.0);
  }

  /*
  * This draws what my dog currently looks
  * like and adds my adjustBrightness filter
  * and then adds a last little ending to finish it off
  */
public void drawCurrentYearScene() {
     clear("white");
    setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
      drawText("Present Day:".toLowerCase(), 25, 50);
    drawImage("Screenshot-2025-02-01-10.08.55-AM.png", 50, 150, 300);
  pause(0.5);
ImageFilter present = new ImageFilter("Screenshot-2025-02-01-10.08.55-AM.png");
    present.adjustBrightness(50);
    drawImage(present, 50, 150, 300);
    pause(1.0);
  clear("white");
     setTextHeight(30);
  setTextColor("pink");
  setTextStyle(Font.MONO, FontStyle.BOLD);
   drawText("To Be Continued...", 50, 200);
  }
  
}