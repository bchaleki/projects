import java.io.*;
import java.util.*;

public class Person{
public boolean alive;
public Random seed;
public int num;

  public Person(){
    alive = true;
    seed = new Random();
    num = seed.nextInt(10000);
  }

  public boolean isAlive(){
    return this.alive;
  }

  public void kill(){
    this.alive = false;
  }

  public int getSeed(){
    return this.num;
  }

  public void generateNewSeed(){
    this.num = seed.nextInt(1000);
  }
}
