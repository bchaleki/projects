import java.io.*;
import java.util.*;

public class Joseph{

  public static void main(String[] args){
    int n = 16;
    int aliveCount = 0;
    int lastAliveIndex = 0;
    Person temp = new Person();
    //Person[] population = new Person[n];
    ArrayList<Person> population = new ArrayList<Person>(n);
    ArrayList<Integer> seedList = new ArrayList<Integer>(n);


    System.out.println("Seed list: ");

    for(int i = 0; i<n; i++){
      population.add(new Person());
      aliveCount++;
      seedList.add(population.get(i).getSeed());
      System.out.println(population.get(i).getSeed());
    }
    int size = population.size();

    System.out.println("-------------");

  while(aliveCount > 1){

    for(int k = 0; k<population.size()-1; k+=2){
      population.get(k+1).kill();
    }

    for(int l = 0; l<population.size(); l++){
      if(population.get(l).isAlive() == false){
        lastAliveIndex = l+1;
        aliveCount--;
        population.remove(l);
      }

    }
    if(size % 2 != 0){
      temp = population.get(population.size()-1);
      population.remove(population.size()-1);
      population.add(0, temp);
      size = population.size();
    }
    else{
      size = population.size();
    }

    for(int j = 0; j<population.size(); j++){
      System.out.println(population.get(j).getSeed());
    }
    System.out.println("---------");

    if(aliveCount == 1){
      for(int i = 0; i<seedList.size(); i++){
        if(population.get(0).getSeed() == seedList.get(i)){
          int survive = i+1;
          System.out.println("In a group of " + n + ", stand in location " + survive + " to survive");
        }
      }
    }
  }





  }

}
