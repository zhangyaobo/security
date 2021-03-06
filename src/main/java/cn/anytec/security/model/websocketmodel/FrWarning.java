package cn.anytec.security.model.websocketmodel;

import java.util.List;

public class FrWarning {

    private String snapshotUrl;
    private String wholePhoto;
    private String faceUrl;
    private Double confidence;
    private String personName;
    private String gender;
    private Integer age;
    private List<String> emotions;
    private String idNumber;
    private String faceSdkId;
    private Integer personGroupId;
    private String personGroupName;
    private Integer cameraId;
    private Integer cameraGroupId;
    private String cameraSdkId;
    private String catchTime;
    private String cameraName;
    private String cameraGroupName;
    private Integer warningOfWeek;
    private String colorLabel;
    private String voiceLabel;

    public FrWarning(String snapshotUrl, String faceUrl, String wholePhoto) {
        this.faceUrl = faceUrl;
        this.snapshotUrl = snapshotUrl;
        this.wholePhoto = wholePhoto;
    }


    public String getWholePhoto() {
        return wholePhoto;
    }

    public void setWholePhoto(String wholePhoto) {
        this.wholePhoto = wholePhoto;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPersonGroupName() {
        return personGroupName;
    }

    public void setPersonGroupName(String personGroupName) {
        this.personGroupName = personGroupName;
    }

    public String getCatchTime() {
        return catchTime;
    }

    public void setCatchTime(String catchTime) {
        this.catchTime = catchTime;
    }

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    public String getCameraGroupName() {
        return cameraGroupName;
    }

    public void setCameraGroupName(String cameraGroupName) {
        this.cameraGroupName = cameraGroupName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPersonGroupId() {
        return personGroupId;
    }

    public void setPersonGroupId(Integer personGroupId) {
        this.personGroupId = personGroupId;
    }

    public Integer getCameraId() {
        return cameraId;
    }

    public void setCameraId(Integer cameraId) {
        this.cameraId = cameraId;
    }

    public String getCameraSdkId() {
        return cameraSdkId;
    }

    public void setCameraSdkId(String cameraSdkId) {
        this.cameraSdkId = cameraSdkId;
    }

    public Integer getWarningOfWeek() {
        return warningOfWeek;
    }

    public void setWarningOfWeek(Integer warningOfWeek) {
        this.warningOfWeek = warningOfWeek;
    }

    public List<String> getEmotions() {
        return emotions;
    }

    public void setEmotions(List<String> emotions) {
        this.emotions = emotions;
    }

    public Integer getCameraGroupId() {
        return cameraGroupId;
    }

    public void setCameraGroupId(Integer cameraGroupId) {
        this.cameraGroupId = cameraGroupId;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFaceSdkId() {
        return faceSdkId;
    }

    public void setFaceSdkId(String faceSdkId) {
        this.faceSdkId = faceSdkId;
    }

    public String getColorLabel() {
        return colorLabel;
    }

    public void setColorLabel(String colorLabel) {
        this.colorLabel = colorLabel;
    }

    public String getVoiceLabel() {
        return voiceLabel;
    }

    public void setVoiceLabel(String voiceLabel) {
        this.voiceLabel = voiceLabel;
    }
}
