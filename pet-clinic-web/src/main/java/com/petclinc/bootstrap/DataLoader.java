package com.petclinc.bootstrap;

import com.petclinc.model.Owner;
import com.petclinc.model.PetType;
import com.petclinc.model.Vet;
import com.petclinc.services.OwnerService;
import com.petclinc.services.PetService;
import com.petclinc.services.VetService;
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
        //System.out.println("Data is loaded in system");
        Set<Owner> owners = ownerService.findAll();

        for (Owner owner: owners) {
           // System.out.println(owner.toString());
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
        //yogesh.setId(1l);
        yogesh.setFirstName("YOGESH");
        yogesh.setLastName("JAJAL");

        ownerService.save(yogesh);

        Owner vishal = new Owner();
        vishal.setLastName("Dwarkunde");
        vishal.setFirstName("Vishal");
        ownerService.save(vishal);
        //Vet Object

        Vet shiva = new Vet();

        //shiva.setId(1l);
        shiva.setFirstName("SHIVA");
        shiva.setLastName("JAJAL");

        vetService.save(shiva);
        Vet shivam = new Vet();
        shivam.setFirstName("Shivam");
        shivam.setLastName("Dwarkunde");
        vetService.save(shivam);

    }
}
