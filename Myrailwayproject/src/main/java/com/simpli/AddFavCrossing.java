package com.simpli;


import jakarta.persistence.Column;

@Entity
@Table(name="favcrossings")
public class AddFavCrossing {

@Id
@Column(name="crossing_name")
private String cName;
@Column(name="crossing_status")
private String status;
@Column(name="person_name")
private String pName;
@Column(name="train_schedule")
private String trainSchedule;
@Column(name="landmark")
private String landmark;
@Column(name="address")
private String address;

public String getcName() {
return cName;
}

public void setcName(String cName) {
this.cName = cName;
}

public String getpName() {
return pName;
}

public void setpName(String pName) {
this.pName = pName;
}

public String getTrainSchedule() {
return trainSchedule;
}

public void setTrainSchedule(String trainSchedule2) {
this.trainSchedule = trainSchedule2;
}

public String getLandmark() {
return landmark;
}

public void setLandmark(String landmark) {
this.landmark = landmark;
}

public String getAddress() {
return address;
}

public void setAddress(String address) {
this.address = address;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}
}

