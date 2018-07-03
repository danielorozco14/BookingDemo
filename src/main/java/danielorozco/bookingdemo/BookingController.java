package danielorozco.bookingdemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/booking")
public class BookingController {

    private List<HotelBooking> bookings;

    public BookingController() {
        bookings = new ArrayList<>();
        bookings.add(new HotelBooking("Hilton",175.80,3));
        bookings.add(new HotelBooking("Sheraton",300.00,2));
        bookings.add(new HotelBooking("Holiday Inn",95.50,5));

    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return bookings;
    }
    @RequestMapping(value="/affordable/{price}",method = RequestMethod.GET)
    public List<HotelBooking>getAffordable(@PathVariable double price){
        return bookings.stream().filter(x->x.getPrecioPorNoche()<=price).collect(Collectors.toList());
    }
    @RequestMapping(value="/create",method = RequestMethod.POST)
    public List<HotelBooking>create(@RequestBody HotelBooking hotelBooking){
        bookings.add(hotelBooking);
        return bookings;
    }

}
