package twin.Hobby;

import twin.Personality.Personality;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Hobbies")
public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="hobby_name")
    private String hobby;


    //----------Relations---------------//
    @ManyToMany
    private List<Personality> personalities;

    //----------Constructor-------------//

    protected Hobby(){}

    public Hobby(String name)
    {
        this.hobby = name;
    }

    /*@ManyToOne
    private Hobby parentHobby;
    @OneToMany
    private List<Hobby> subHobbies;
    */

    //----------Getter/Setter--------------//


    public List<Personality> getPersonalities() {
        return personalities;
    }

    public void addPersonality(Personality personality) {
        personalities.add(personality);
    }


}
