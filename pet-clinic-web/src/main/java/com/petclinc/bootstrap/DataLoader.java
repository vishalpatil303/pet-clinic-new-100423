package com.petclinc.bootstrap;

import com.petclinc.model.Owner;
import com.petclinc.model.PetType;
import com.petclinc.model.Vet;
import com.petclinc.services.OwnerService;
import com.petclinc.services.PetService;
import com.petclinc.services.VetService;
import com.petclinc.services.map.OwnerMapService;
import com.petclinc.services.map.PetMapService;
import com.petclinc.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, PetService petService, VetService vetService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
        System.out.println("Data is loaded in system");
        Set<Owner> owners = ownerService.findAll();

        for (Owner owner: owners) {
            System.out.println(owner.toString());
        }
    }

    public void loadData(){

        //PetType object
        PetType dogType = new PetType();
        dogType.setName("DOG");
        PetType catType = new PetType();
        catType.setName("CAT");

        //Owner object

        Owner yogesh = new Owner();
        yogesh.setId(1l);
        yogesh.setFirstName("YOGESH");
        yogesh.setLastName("JAJAL");

        ownerService.save(yogesh);

        //Vet Object

        Vet shiva = new Vet();

        shiva.setId(1l);
        shiva.setFirstName("SHIVA");
        shiva.setLastName("JAJAL");

        vetService.save(shiva);


    }
}
