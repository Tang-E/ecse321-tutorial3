import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;
import java.util.Set;
import javax.persistence.ManyToMany;

@Entity
public class Event{
   private String name;

public void setName(String value) {
    this.name = value;
}
@Id
public String getName() {
    return this.name;
}
private Date eventDate;

public void setEventDate(Date value) {
    this.eventDate = value;
}
public Date getEventDate() {
    return this.eventDate;
}
private Time startTime;

public void setStartTime(Time value) {
    this.startTime = value;
}
public Time getStartTime() {
    return this.startTime;
}
private Time endTime;

public void setEndTime(Time value) {
    this.endTime = value;
}
public Time getEndTime() {
    return this.endTime;
}
   private Set<RegistrationManager> registrationManager;
   
   @ManyToMany(mappedBy="event" )
   public Set<RegistrationManager> getRegistrationManager() {
      return this.registrationManager;
   }
   
   public void setRegistrationManager(Set<RegistrationManager> registrationManagers) {
      this.registrationManager = registrationManagers;
   }
   
   }
