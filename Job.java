
/**
 * Write a description of class Job here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Job
{
    private int id, fee;
    private String name, category;

    
    public Job(int id, int fee, String name, String category)
    {
        this.id = id;
        this.fee = fee;
        this.name = name;
        this.category = category;
    }
    
    int getId () {
        return 0;
    }

    int getFee () {
        return 0;
    }
    
    String getName () {
        return "oop";
    }

    String getCategory () {
        return "oop";
    }
}
