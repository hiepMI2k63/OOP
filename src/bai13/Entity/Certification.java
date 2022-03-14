package bai13.Entity;

import java.time.LocalDate;

public class Certification {
    private String idCertification;
    private String nameCertification;
    private String rankCertification;
    private LocalDate dateCertification;

    public Certification() {
    }

    @Override
    public String toString() {
        return "Certification [date=" + dateCertification + ", id=" + idCertification + ", name=" + nameCertification + ", rank=" + rankCertification + "]";
    }

    public Certification(String id, String name, String rank, LocalDate date) {
        this.idCertification = id;
        this.nameCertification = name;
        this.rankCertification = rank;
        this.dateCertification = date;
    }

    public String getIdCertification() {
        return idCertification;
    }

    public void setIdCertification(String idCertification) {
        this.idCertification = idCertification;
    }

    public String getNameCertification() {
        return nameCertification;
    }

    public void setNameCertification(String nameCertification) {
        this.nameCertification = nameCertification;
    }

    public String getRankCertification() {
        return rankCertification;
    }

    public void setRankCertification(String rankCertification) {
        this.rankCertification = rankCertification;
    }

    public LocalDate getDateCertification() {
        return dateCertification;
    }

    public void setDateCertification(LocalDate dateCertification) {
        this.dateCertification = dateCertification;
    }

   
}
