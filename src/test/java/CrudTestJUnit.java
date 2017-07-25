import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.it355.model.Hotel;
import com.it355.model.Soba;
import com.it355.service.HotelService;
import com.it355.service.SobaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/dispatcher-servlet.xml"})
public class CrudTestJUnit {
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private SobaService sobaService;

	@Autowired
	private HotelService hotelService;
	
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	@Before
	public void setUp() {
		sobaService = (SobaService) applicationContext.getBean("sobaService");
	}
	
	@Test
	public void addSobaTest() {
		Soba soba = new Soba();
		soba.setBrojKreveta(5);
		Soba newSoba = sobaService.addSoba(soba);
		sobaService.addSoba(soba);
		sobaService.deleteSoba(newSoba);
		Assert.assertNotNull(newSoba);
	}
	
	@Test
	public void getSobaByIdTest() {
		Soba soba = new Soba();
		soba.setBrojKreveta(5);
		Soba newSoba = sobaService.addSoba(soba);
		Soba get = sobaService.getSobaById(newSoba.getSobaId());
		sobaService.deleteSoba(newSoba);
		
		Assert.assertNotNull(get);
	}
	
	@Test
	public void deleteSobaTest() {
		Soba soba = new Soba();
		soba.setBrojKreveta(5);
		Soba newSoba = sobaService.addSoba(soba);
		sobaService.deleteSoba(newSoba);
		Soba deletedSoba = sobaService.getSobaById(newSoba.getSobaId());
		
		Assert.assertNull(deletedSoba);
	}
	
	@Test
	public void addHotelTest() {
		Hotel hotel = new Hotel();
		hotel.setNaziv("Test Hotel");
		Hotel newhotel = hotelService.addHotel(hotel);
		hotelService.addHotel(hotel);
		hotelService.deleteHotel(newhotel);
		
		Assert.assertNotNull(newhotel);
	}
	
	@Test
	public void getHotelByIdTest() {
		Hotel hotel = new Hotel();
		hotel.setNaziv("Test Hotel");
		Hotel newHotel = hotelService.addHotel(hotel);
		Hotel get = hotelService.getHotelById(newHotel.getHotelId());
		hotelService.deleteHotel(newHotel);
		
		Assert.assertNotNull(get);
	}
	
	@Test
	public void deleteHotelTest() {
		Hotel hotel = new Hotel();
		hotel.setNaziv("Test Hotel");
		Hotel newHotel = hotelService.addHotel(hotel);
		hotelService.deleteHotel(newHotel);
		Hotel deletedHotel = hotelService.getHotelById(newHotel.getHotelId());
		
		Assert.assertNull(deletedHotel);
	}
}
