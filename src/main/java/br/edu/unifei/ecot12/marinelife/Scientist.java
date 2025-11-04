package br.edu.unifei.ecot12.marinelife;

public class Scientist extends Profession {
    private float studyTime;
    private Environment study;

    public float getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(float studyTime) {
        this.studyTime = studyTime;
    }

    public Environment getStudy() {
        return study;
    }

    public void setStudy(Environment study) {
        this.study = study;
    }
}
