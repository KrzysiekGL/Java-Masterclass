package pl.krzysiekgl;

public abstract class Team {
    private String name;
    private int score;
    
    public Team(String name, Integer score) {
        this.name = name;
        this.score = score;
    }
    
    public String getName() {
        return name;
    }
    
    public int getScore() {
        return score;
    }
}
