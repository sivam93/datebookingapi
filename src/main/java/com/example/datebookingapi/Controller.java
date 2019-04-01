
package com.example.datebookingapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    HashMap<String, String> sample = new HashMap<>();
    
    List<String> users = new ArrayList<>();

    
    @GetMapping(value = "/experts", produces = "application/json")
    public List<String> Listofs() {
        users.add("sat");
        users.add("satsss");
        return users;
    }
    
    
    public static final Map<String, String> userMap = new HashMap<String, String>() {

        {
            put("AA001", "AA001");
            put("AA002", "AA002");
        }
    };
    
    @PostMapping(value = "/authenticate", consumes = "application/json", produces = "application/json")
    @CrossOrigin(origins = "*")
    public int authenticate(@RequestBody UserNameDTO users) {

        Date date = new Date();
        if (userMap.containsKey(users.getUserName())
                && (userMap.get(users.getUserName()).equals(users.getPassWord()))) {
            int dateHash = date.hashCode();
            UsersAuthentication.addDateHash(dateHash);
            return dateHash;
        }
        else {
            return 0;
        }
    }
    
    
    
//    @PostMapping(value = "/experts/Availabledates", consumes = "application/json", produces = "application/json")
//    public String DateLists(@RequestBody RequestDTo request) throws ParseException {
//         // sample.get(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(request.getSample()));
//          sample.put("gh", "DateBooked");
//          if ( sample.containsKey(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(request.getSample()))) {
//            return sample.get("gh");
//        } else {
//            sample.put(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(request.getSample()), "");
//            return "Booked";
//        }
//      }
    
   @PostMapping(value = "/experts/dates", consumes = "application/json", produces = "application/json")
  public String Lists(@RequestBody RequestDTo request) throws ParseException {
       // sample.get(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(request.getSample()));
        sample.put("gh", "DateBooked");
        if ( sample.containsKey(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(request.getSample()))) {
          return sample.get("gh");
      } else {
          sample.put(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(request.getSample()), "");
          return "Booked";
      }
    }
}

//    @PostMapping(value = "/experts", consumes = "application/json", produces = "application/json")
//    public String Lists(@RequestBody RequestDTo request) throws ParseException {
//
//        sample.put("gh", "Already Booked");
//        System.out.println(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(request.getSample()).toString() +"****" +sample.containsKey(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(request.getSample()).toString()));
//        if ( sample.containsKey(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(request.getSample()).toString())) {
//            return sample.get("gh");
//        } else {
//            sample.put(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(request.getSample()).toString(), request.getName());
//            return "Booked";
//        }
//    }
//    
//    
//    
//    @GetMapping(value = "/expertsList")
//    public HashMap<String, String> getLists() throws ParseException {
//      \
//        return sample;
//    }



