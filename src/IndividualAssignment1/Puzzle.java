package IndividualAssignment1;

public class Puzzle {
    private int puzzleId;
    private String puzzleName;
    private String puzzleDescription;
    private String puzzleHint;

    public Puzzle(int puzzleId, String puzzleName, String puzzleDescription, String puzzleHint) {
        this.puzzleId = puzzleId;
        this.puzzleName = puzzleName;
        this.puzzleDescription = puzzleDescription;
        this.puzzleHint = puzzleHint;
    }



    public int getPuzzleId() {
        return puzzleId;
    }

    public void setPuzzleId(int puzzleId) {
        this.puzzleId = puzzleId;
    }

    public String getPuzzleName() {
        return puzzleName;
    }

    public void setPuzzleName(String puzzleName) {
        this.puzzleName = puzzleName;
    }

    public String getPuzzleDescription() {
        return puzzleDescription;
    }

    public void setPuzzleDescription(String puzzleDescription) {
        this.puzzleDescription = puzzleDescription;
    }

    public String getPuzzleHint() {
        return puzzleHint;
    }

    public void setPuzzleHint(String puzzleHint) {
        this.puzzleHint = puzzleHint;
    }



    public void puszzle(String answerToPlay){
        if (answerToPlay.equalsIgnoreCase("Y") || answerToPlay.equalsIgnoreCase("yes")){
            System.out.println("This puzzle is called " + getPuzzleName());
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        return "Puzzle{" +
                "puzzleName='" + getPuzzleName() + '\'' +
                ", puzzleDescription='" + getPuzzleDescription() + '\'' +
                ", puzzleHint='" + getPuzzleHint() + '\'' +
                '}';
    }
}
