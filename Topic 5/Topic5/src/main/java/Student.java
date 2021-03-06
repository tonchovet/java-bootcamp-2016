
import java.sql.Date;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;


@Entity("student")
@Indexes(
    @Index(value = "id", fields = @Field("id"))
)

public class Student {

	 	@Id
	    private ObjectId _id;
	 	private int id;
	    private String first_name;
	    private String last_name;
	    private Date date_of_birth;
	    private int registration_number;
	    	    
	    public Student(){
	    }
	    
	    public Student( final String first_name, final String last_name, final Date date_of_birth, final int registration_number ){
	    	this.first_name = first_name;
	    	this.last_name = last_name;
	    	this.date_of_birth = date_of_birth;
	    	this.registration_number = registration_number;
	    }
	    
	    public ObjectId get_Id(){
	    	return _id;
	    }
	    
	    public void set_Id( ObjectId _id ){
	    	this._id = _id;
	    }
	    
	    public int getId(){
	    	return id;
	    }
	    
	    public void setId( int id ){
	    	this.id = id;
	    }
	    
	    public String getFirst_name(){
	    	return first_name;
	    }
	    
	    public void setFirst_name( String first_name ){
	    	this.first_name = first_name;
	    }
	    
	    public String getLast_name(){
	    	return last_name;
	    }
	    
	    public void setLast_name( String last_name ){
	    	this.last_name = last_name;
	    }
	    
	    public Date getDate_of_birth(){
	    	return date_of_birth;
	    }
	    
	    public void setDate_of_birth( Date date_of_birth ){
	    	this.date_of_birth = date_of_birth;
	    }
	    
	    public int getRegistration_number(){
	    	return registration_number;
	    }
	    
	    public void setRegistration_number( int registration_number ){
	    	this.registration_number = registration_number;
	    }
	    
}

