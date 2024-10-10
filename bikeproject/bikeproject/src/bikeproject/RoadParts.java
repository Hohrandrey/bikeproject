package bikeproject;

public interface RoadParts {
    String TERRAIN = "track_racing";

    void setTyreWidth(String newValue);
    String getTyreWidth();

    void setPostHeight(String newValue);
    String getPostHeight();
}