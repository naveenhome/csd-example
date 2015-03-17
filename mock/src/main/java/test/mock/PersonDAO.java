package test.mock;

public interface PersonDAO {
	public Person fetchPerson( Integer personID );
    public void update( Person person );
}
