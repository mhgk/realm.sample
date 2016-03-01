package dk.miracle.grapevine.realm_db.model;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;

/**
 * Created by mak on 13-01-2016.
 */
public class MediaContentEntity extends RealmObject {

    @PrimaryKey
    private int id;
    private int ownedById;
    private String contentUrl;
    private String thumbnailUrl;
    private String mimeType;
    private int width;
    private int height;
    @Index
    private boolean isSynchronized;

    public MediaContentEntity() {
    }

    public boolean isSynchronized() {
        return isSynchronized;
    }

    public void setIsSynchronized(boolean isSynchronized) {
        this.isSynchronized = isSynchronized;
    }

    public int getOwnedById() {
        return ownedById;
    }

    public void setOwnedById(int ownedById) {
        this.ownedById = ownedById;
    }

    public int getId() {
        return id;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getMimeType() {
        return mimeType;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}