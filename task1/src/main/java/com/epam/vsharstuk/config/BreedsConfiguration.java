package com.epam.vsharstuk.config;

import com.epam.vsharstuk.domain.Breed;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:breeds.properties"})
public class BreedsConfiguration {

    @Value("${brA}")
    private String horseBreedA;
    @Value("${brB}")
    private String horseBreedB;
    @Value("${brC}")
    private String horseBreedC;
    @Value("${brD}")
    private String horseBreedD;
    @Value("${brE}")
    private String horseBreedE;
    @Value("${brF}")
    private String horseBreedF;
    @Value("${brG}")
    private String horseBreedG;
    @Value("${brH}")
    private String horseBreedH;
    @Value("${brI}")
    private String horseBreedI;
    @Value("${brJ}")
    private String horseBreedJ;
    @Value("${brK}")
    private String horseBreedK;
    @Value("${brL}")
    private String horseBreedL;
    @Value("${brM}")
    private String horseBreedM;
    @Value("${brN}")
    private String horseBreedN;
    @Value("${brO}")
    private String horseBreedO;

    @Bean(name = "breedA")
    public Breed getBreedA() {
        Breed breedA = new Breed();
        breedA.setHorseBreed(horseBreedA);
        return breedA;
    }

    @Bean(name = "breedB")
    public Breed getBreedB() {
        Breed breedB = new Breed();
        breedB.setHorseBreed(horseBreedB);
        return breedB;
    }

    @Bean(name = "breedC")
    public Breed getBreedC() {
        Breed breedC = new Breed();
        breedC.setHorseBreed(horseBreedC);
        return breedC;
    }

    @Bean(name = "breedD")
    public Breed getBreedD() {
        Breed breedD = new Breed();
        breedD.setHorseBreed(this.horseBreedD);
        return breedD;
    }

    @Bean(name = "breedE")
    public Breed getBreedE() {
        Breed breedE = new Breed();
        breedE.setHorseBreed(horseBreedE);
        return breedE;
    }

    @Bean(name = "breedF")
    public Breed getBreedF() {
        Breed breedF = new Breed();
        breedF.setHorseBreed(horseBreedF);
        return breedF;
    }

    @Bean(name = "breedG")
    public Breed getBreedG() {
        Breed breedG = new Breed();
        breedG.setHorseBreed(horseBreedG);
        return breedG;
    }

    @Bean(name = "breedH")
    public Breed getBreedH() {
        Breed breedH = new Breed();
        breedH.setHorseBreed(horseBreedH);
        return breedH;
    }

    @Bean(name = "breedI")
    public Breed getBreedI() {
        Breed breedI = new Breed();
        breedI.setHorseBreed(horseBreedI);
        return breedI;
    }

    @Bean(name = "breedJ")
    public Breed getBreedJ() {
        Breed breedJ = new Breed();
        breedJ.setHorseBreed(horseBreedJ);
        return breedJ;
    }

    @Bean(name = "breedK")
    public Breed getBreedK() {
        Breed breedK = new Breed();
        breedK.setHorseBreed(horseBreedK);
        return breedK;
    }

    @Bean(name = "breedL")
    public Breed getBreedL() {
        Breed breedL = new Breed();
        breedL.setHorseBreed(horseBreedL);
        return breedL;
    }

    @Bean(name = "breedM")
    public Breed getBreedM() {
        Breed breedM = new Breed();
        breedM.setHorseBreed(horseBreedM);
        return breedM;
    }

    @Bean(name = "breedN")
    public Breed getBreedN() {
        Breed breedN = new Breed();
        breedN.setHorseBreed(horseBreedN);
        return breedN;
    }

    @Bean(name = "breedO")
    public Breed getBreedO() {
        Breed breedO = new Breed();
        breedO.setHorseBreed(horseBreedO);
        return breedO;
    }

}
