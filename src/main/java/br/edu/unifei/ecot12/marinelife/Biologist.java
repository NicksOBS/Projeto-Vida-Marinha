package br.edu.unifei.ecot12.marinelife;

import java.util.ArrayList;
import java.util.List;

public class Biologist extends Profession {
    private String studyObjective;
    private List<Organism> studiedOrganisms = new ArrayList<>();

    public String getStudyObjective() {
        return studyObjective;
    }

    public void setStudyObjective(String studyObjective) {
        this.studyObjective = studyObjective;
    }

    public List<Organism> getStudiedOrganisms() {
        return studiedOrganisms;
    }

    public void setStudiedOrganisms(List<Organism> studiedOrganisms) {
        this.studiedOrganisms = studiedOrganisms;
    }
}
