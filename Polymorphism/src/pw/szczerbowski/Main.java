package pw.szczerbowski;

import java.rmi.MarshalledObject;

class Movie {
    private String name;

    public Movie(String name){
        this.name=name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A shark eats a lots of people.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth.";
    }
}

class MazeRunner extends Movie {
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe.";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    //No plot() method
}



public class Main {

    public static void main(String[] args) {
	    for(int i=1; i<11; ++i){
	        Movie movie=randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + '\n'
                                + "Plot: " + movie.plot() + '\n');
            //depending of the object upon method .plot() was called
            //proper method is executed
        }
    }

    public static Movie randomMovie(){
        int randomNumber=(int)(Math.random() * 5) + 1; //This method return randomly 0 or 1 (0.0 to 1.0 double)
        System.out.println("Random number generated: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new MazeRunner();

            case 3:
                return new StarWars();

            case 4:
                return new Forgetable();

            case 5:
                return new IndependenceDay();

            default:
                return null;
        }
    }
}
