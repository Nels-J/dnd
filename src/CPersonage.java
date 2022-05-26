
public class CPersonage {
    public enum PersonageType {
        WARRIOR,
        MAGICIAN,

        UNDEFINED
    }

    // -------------------- ATTRIBUTE(s)
    private String m_name;
    private PersonageType m_type;
    private int m_forceAttack;
    private int m_life;
    private int m_eqAtt;
    private int m_eqDef;


    // ----------------- CONSTRUCTOR(s)
    public CPersonage(String name, PersonageType type, int attack, int life, int eqAtt, int eqDef) {
        this.m_name = name;
        this.m_type = type;
        this.m_forceAttack = attack;
        this.m_life = life;
        this.m_eqAtt = eqAtt;
        this.m_eqDef = eqDef;
    }

    // GETTER(s) & SETTER(s)
    // ********* NAME
    public String get_name() {
        return m_name;
    }

    // ********* TYPE
    public PersonageType get_type() {
        return m_type;
    }

    // ********* ATTACK
    public int get_attack() {
        return this.m_forceAttack + this.m_eqAtt;
    }

    // ********* EQUIPMENT ATTACK
    public void set_eqAtt(int newEqAtt) {
        if (newEqAtt > m_eqAtt) {
            this.m_eqAtt = newEqAtt;
        }
    }

    // ********* EQUIPMENT DEFENSE
    public void set_eqDef(int newEqDef) {
        if (newEqDef > m_eqDef) {
            this.m_eqDef = newEqDef;
        }
    }

    // ********* LIFE
    public int get_life() {
        return m_life;
    }

    public void set_life(int newLife) {
        this.m_life = newLife;
    }


    // METHOD(s)
    @Override
    public String toString() {
        return "CPersonage{" +
                "m_name='" + m_name + '\'' +
                ", m_type=" + m_type +
                ", m_forceAttack=" + m_forceAttack +
                ", m_life=" + m_life +
                ", m_eqAtt=" + m_eqAtt +
                ", m_eqDef=" + m_eqDef +
                '}';
    }
}
