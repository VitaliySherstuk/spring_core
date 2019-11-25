package com.epam.vsharstuk.config;

import com.epam.vsharstuk.domain.Horse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:horses.properties"})
public class HorseConfiguration {

    @Autowired
    private BreedsConfiguration breedsConfiguration;
    @Autowired
    private RiderConfiguration riderConfiguration;

    @Bean(name = "horseA")
    public Horse getHorseA(@Value("${nameHorseA}") String nameHorseA, @Value("${ageHorseA}") int ageHorseA, @Value("${speedHorseA}") int speedHorseA) {
        Horse horseA = new Horse();
        horseA.setName(nameHorseA);
        horseA.setAge(ageHorseA);
        horseA.setSpeed(speedHorseA);
        horseA.setBreed(this.breedsConfiguration.getBreedA());
        horseA.setRider(this.riderConfiguration.getRiderA());
        return horseA;
    }

    @Bean(name = "horseB")
    public Horse getHorseB(@Value("${nameHorseB}") String name, @Value("${ageHorseB}") int age, @Value("${speedHorseB}") int speed) {
        Horse horseB = new Horse();
        horseB.setName(name);
        horseB.setAge(age);
        horseB.setSpeed(speed);
        horseB.setBreed(this.breedsConfiguration.getBreedB());
        horseB.setRider(this.riderConfiguration.getRiderB());
        return horseB;
    }

    @Bean(name = "horseC")
    public Horse getHorseC(@Value("${nameHorseC}") String name, @Value("${ageHorseC}") int age, @Value("${speedHorseC}") int speed) {
        Horse horseC = new Horse();
        horseC.setName(name);
        horseC.setAge(age);
        horseC.setSpeed(speed);
        horseC.setBreed(this.breedsConfiguration.getBreedC());
        horseC.setRider(this.riderConfiguration.getRiderC());
        return horseC;
    }

    @Bean(name = "horseD")
    public Horse getHorseD(@Value("${nameHorseD}") String name, @Value("${ageHorseD}") int age, @Value("${speedHorseD}") int speed) {
        Horse horseD = new Horse();
        horseD.setName(name);
        horseD.setAge(age);
        horseD.setSpeed(speed);
        horseD.setBreed(this.breedsConfiguration.getBreedD());
        horseD.setRider(this.riderConfiguration.getRiderD());
        return horseD;
    }

    @Bean(name = "horseE")
    public Horse getHorseE(@Value("${nameHorseE}") String name, @Value("${ageHorseE}") int age, @Value("${speedHorseE}") int speed) {
        Horse horseE = new Horse();
        horseE.setName(name);
        horseE.setAge(age);
        horseE.setSpeed(speed);
        horseE.setBreed(this.breedsConfiguration.getBreedE());
        horseE.setRider(this.riderConfiguration.getRiderE());
        return horseE;
    }

    @Bean(name = "horseF")
    public Horse getHorseF(@Value("${nameHorseF}") String name, @Value("${ageHorseF}") int age, @Value("${speedHorseF}") int speed) {
        Horse horseF = new Horse();
        horseF.setName(name);
        horseF.setAge(age);
        horseF.setSpeed(speed);
        horseF.setBreed(this.breedsConfiguration.getBreedF());
        horseF.setRider(this.riderConfiguration.getRiderF());
        return horseF;
    }

    @Bean(name = "horseG")
    public Horse getHorseG(@Value("${nameHorseG}") String name, @Value("${ageHorseG}") int age, @Value("${speedHorseG}") int speed) {
        Horse horseG = new Horse();
        horseG.setName(name);
        horseG.setAge(age);
        horseG.setSpeed(speed);
        horseG.setBreed(this.breedsConfiguration.getBreedG());
        horseG.setRider(this.riderConfiguration.getRiderG());
        return horseG;
    }

    @Bean(name = "horseH")
    public Horse getHorseH(@Value("${nameHorseH}") String name, @Value("${ageHorseH}") int age, @Value("${speedHorseH}") int speed) {
        Horse horseH = new Horse();
        horseH.setName(name);
        horseH.setAge(age);
        horseH.setSpeed(speed);
        horseH.setBreed(this.breedsConfiguration.getBreedH());
        horseH.setRider(this.riderConfiguration.getRiderH());
        return horseH;
    }

    @Bean(name = "horseI")
    public Horse getHorseI(@Value("${nameHorseI}") String name, @Value("${ageHorseI}") int age, @Value("${speedHorseI}") int speed) {
        Horse horseI = new Horse();
        horseI.setName(name);
        horseI.setAge(age);
        horseI.setSpeed(speed);
        horseI.setBreed(this.breedsConfiguration.getBreedI());
        horseI.setRider(this.riderConfiguration.getRiderI());
        return horseI;
    }

    @Bean(name = "horseJ")
    public Horse getHorseJ(@Value("${nameHorseJ}") String name, @Value("${ageHorseJ}") int age, @Value("${speedHorseJ}") int speed) {
        Horse horseJ = new Horse();
        horseJ.setName(name);
        horseJ.setAge(age);
        horseJ.setSpeed(speed);
        horseJ.setBreed(this.breedsConfiguration.getBreedJ());
        horseJ.setRider(this.riderConfiguration.getRiderJ());
        return horseJ;
    }

    @Bean(name = "horseK")
    public Horse getHorseK(@Value("${nameHorseK}") String name, @Value("${ageHorseK}") int age, @Value("${speedHorseK}") int speed) {
        Horse horseK = new Horse();
        horseK.setName(name);
        horseK.setAge(age);
        horseK.setSpeed(speed);
        horseK.setBreed(this.breedsConfiguration.getBreedK());
        horseK.setRider(this.riderConfiguration.getRiderK());
        return horseK;
    }

    @Bean(name = "horseL")
    public Horse getHorseL(@Value("${nameHorseL}") String name, @Value("${ageHorseL}") int age, @Value("${speedHorseL}") int speed) {
        Horse horseL = new Horse();
        horseL.setName(name);
        horseL.setAge(age);
        horseL.setSpeed(speed);
        horseL.setBreed(this.breedsConfiguration.getBreedL());
        horseL.setRider(this.riderConfiguration.getRiderL());
        return horseL;
    }

    @Bean(name = "horseM")
    public Horse getHorseM(@Value("${nameHorseM}") String name, @Value("${ageHorseM}") int age, @Value("${speedHorseM}") int speed) {
        Horse horseM = new Horse();
        horseM.setName(name);
        horseM.setAge(age);
        horseM.setSpeed(speed);
        horseM.setBreed(this.breedsConfiguration.getBreedM());
        horseM.setRider(this.riderConfiguration.getRiderM());
        return horseM;
    }

    @Bean(name = "horseN")
    public Horse getHorseN(@Value("${nameHorseN}") String name, @Value("${ageHorseN}") int age, @Value("${speedHorseN}") int speed) {
        Horse horseN = new Horse();
        horseN.setName(name);
        horseN.setAge(age);
        horseN.setSpeed(speed);
        horseN.setBreed(this.breedsConfiguration.getBreedN());
        horseN.setRider(this.riderConfiguration.getRiderN());
        return horseN;
    }

    @Bean(name = "horseO")
    public Horse getHorseO(@Value("${nameHorseO}") String name, @Value("${ageHorseO}") int age, @Value("${speedHorseO}") int speed) {
        Horse horseO = new Horse();
        horseO.setName(name);
        horseO.setAge(age);
        horseO.setSpeed(speed);
        horseO.setBreed(this.breedsConfiguration.getBreedO());
        horseO.setRider(this.riderConfiguration.getRiderO());
        return horseO;
    }

}
