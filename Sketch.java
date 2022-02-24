import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
  //ground
	  fill(86, 125, 70);
    rect(0, (float)(height/1.14), width/1, height/8);

	  // red square
    fill(203, 65, 84);
    rect((float)(width/2.28), (float)(height/2.66), width/2, height/2);

    // door
    fill(150, 75, 0);
    rect((float)(width/1.78), (float)(height/1.78), width/8, (float)(height/3.2));

    // door knob
    fill(172, 140, 24);
    ellipse((float)(width/1.54), (float)(height/1.33), width/40, height/40);

    // window
    fill(135, 206, 235);  
    rect((float)(width/1.33), (float)(height/1.78), width/8, height/8);
    line((float)(width/1.23), (float)(height/1.78), (float)(width/1.23), (float)(height/1.45));
    line((float)(width/1.33), (float)(height/1.6), (float)(width/1.14), (float)(height/1.6));

    // roof
    fill(0, 0, 128);
    triangle((float)(width/2.66), (float)(height/2.66), (float)(width/1.45), height/8, width/1, (float)(height/2.66));

  }
  
  // define other methods down here.
}