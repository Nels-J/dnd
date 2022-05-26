
public class CMagician extends CPersonage
{
    static private int DEF_ATT = 8;
    static private int DEF_LIFE = 3;
    static private int DEF_EQ_ATT = 0;
    static private int DEF_EQ_DEF = 0;

    // -------------------- ATTRIBUTE(s)


    // ----------------- CONSTRUCTOR(s)
    public CMagician(String name)
    {
        super(name, PersonageType.MAGICIAN, DEF_ATT, DEF_LIFE, DEF_EQ_ATT,"", DEF_EQ_DEF);
    }


    // -------------------GETTER(s) & SETTER(s)

    //--------------------- METHOD(s)
    public String toString() {
        return "CMagician{" +
                "m_name='" + m_name + '\'' +
                ", m_type=" + m_type +
                ", m_forceAttack=" + m_forceAttack +
                ", m_life=" + m_life +
                ", m_eqAtt=" + m_eqAtt +
                ", m_eqName='" + m_eqName + '\'' +
                ", m_eqDef=" + m_eqDef +
                '}';
    }

}
