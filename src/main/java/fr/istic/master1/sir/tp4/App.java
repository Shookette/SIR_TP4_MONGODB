package fr.istic.master1.sir.tp4;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

import fr.istic.master1.sir.tp4.classes.Address;
import fr.istic.master1.sir.tp4.classes.Person;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws UnknownHostException
	{
		Morphia morphia = new Morphia();	
		Mongo mongo = new Mongo();
		morphia.map(Person.class).map(Address.class);
		Datastore ds = morphia.createDatastore(mongo, "my_database");
		
		Person p1 = new Person("Toto");
		Person p2 = new Person();
		p2.setName("Tintin");
		

		Address address = new Address();
		address.setStreet("123 Some street");
		address.setCity("Some city");
		address.setPostCode("123 456");
		address.setCountry("Some country");
		//set address
		List<Address> ad = new ArrayList<Address>();
		ad.add(address);
		p2.setAddress(ad);
		// Save the POJO
		ds.save(p1);
		ds.save(p2);
		ds.save(address);
		for (Person e : ds.find(Person.class)) {
			System.out.println(e.getName());
			ds.delete(e);
		}
			

	}

}
