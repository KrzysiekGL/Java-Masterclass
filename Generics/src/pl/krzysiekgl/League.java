package pl.krzysiekgl;

import java.util.LinkedList;
import java.util.ListIterator;

public class League<T extends Team> implements ITeamOperations {
    
    private LinkedList<T> teams;
    
    public League() {
        this.teams = new LinkedList<>();
    }
    
    @Override
    public void listAllTeamsInLeague() {
        int placeInLeague = 1;
        for(T team : teams) System.out.println((placeInLeague++) + ": " + team.getName());
    }
    
    public void addTeamToLeague(T newTeam) {
        if(teams.size() == 0) teams.add(newTeam);
        
        else {
            ListIterator<T> iterator = teams.listIterator();
            
            while(iterator.hasNext()) {
                int comparision = compare(newTeam, iterator.next());
                
                if(comparision == 0) { //both scores of compared teams are equal
                    iterator.add(newTeam);
                    return; //end adding
                }
                
                else if(comparision > 0) { //new team has lower score
                    if(!iterator.hasNext()) iterator.add(newTeam); //if there are no more teams left, add newTeam
                }
                
                else if(comparision < 0) { //new team has greater score
                    iterator.previous();
                    iterator.add(newTeam);
                    return; //end adding
                }
            }
        }
    }
    
    private int compare(T newTeam, T team) {
        if(newTeam.getScore() == team.getScore()) return 0;
        else if(newTeam.getScore() > team.getScore()) return -1;
        else return 1; //newTeam score is < team score
    }
    
    public void test() {
        System.out.println("Current teams list size is: " + teams.size());
    }
}
