import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import ca.mcgill.ecse321.eventregistration.model.Person;
import javax.persistence.Id;

@Entity
public class RegistrationManager{
   private Set<Event> event;
   
   @ManyToMany
   public Set<Event> getEvent() {
      return this.event;
   }
   
   public void setEvent(Set<Event> events) {
      this.event = events;
   }
   
   private Set<Registration> registration;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Registration> getRegistration() {
      return this.registration;
   }
   
   public void setRegistration(Set<Registration> registrations) {
      this.registration = registrations;
   }
   
   private Set<Event> events;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Event> getEvents() {
      return this.events;
   }
   
   public void setEvents(Set<Event> eventss) {
      this.events = eventss;
   }
   
   private Set<Person> participants;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Person> getParticipants() {
      return this.participants;
   }
   
   public void setParticipants(Set<Person> participantss) {
      this.participants = participantss;
   }
   
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
@Id
public Integer getId() {
    return this.id;
}
}
