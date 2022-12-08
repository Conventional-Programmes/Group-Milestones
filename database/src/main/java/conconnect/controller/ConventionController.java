package conconnect.controller;

import conconnect.models.parse.Convention;
import conconnect.models.serializable.SerializableConvention;
import conconnect.services.ConventionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/Convention")

public class ConventionController {

    private ConventionService conventionService;

    public ConventionController(ConventionService conventionService){
        this.conventionService = conventionService;
    }

    @GetMapping("/")
    public ArrayList<SerializableConvention> getConventions(){
        ArrayList<SerializableConvention> conventions = new ArrayList<>();

        ArrayList<Convention> list = conventionService.retrieveConventions();
        for(Convention c : list)
        {
            conventions.add(c.getSerializable());
        }
        return conventions;
    }

    @GetMapping("/find/{id}")
    public SerializableConvention getConventionById(@PathVariable String id){
        return conventionService.getConventionById(id).getSerializable();
    }
}
