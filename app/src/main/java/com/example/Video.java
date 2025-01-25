package com.example;

import com.google.gson.annotations.SerializedName;

public class Video {
    private int id;
    private String videoUniqueId;
    private String thumbnailImageId;
    private String videoBrandType;
    private String author;
    private String title;
    private String url;
    @SerializedName("fetchable_url")
    private String fetchableUrl;
    private String thumbnailImageUrl;
    private String thumbnailImageFetchableUrl;
    private String createdTime;
    private String commentNum;
    private String likeNum;
    private String bookmarkNum;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getVideoUniqueId() {
        return videoUniqueId;
    }

    public void setVideoUniqueId(String videoUniqueId) {
        this.videoUniqueId = videoUniqueId;
    }

    public String getThumbnailImageId() {
        return thumbnailImageId;
    }

    public void setThumbnailImageId(String thumbnailImageId) {
        this.thumbnailImageId = thumbnailImageId;
    }

    public void setVideoBrandType(String videoBrandType) {
        this.videoBrandType = videoBrandType;
    }

    public String getVideoBrandType() {
        return videoBrandType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFetchableUrl() {
        return fetchableUrl;
    }

    public void setFetchableUrl(String fetchableUrl) {
        this.fetchableUrl = fetchableUrl;
    }

    public void setThumbnailImageUrl(String thumbnailImageUrl) {
        this.thumbnailImageUrl = thumbnailImageUrl;
    }

    // Getter cho thumbnailImageUrl
    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    public void setThumbnailImageFetchableUrl(String thumbnailImageFetchableUrl) {
        this.thumbnailImageFetchableUrl = thumbnailImageFetchableUrl;
    }

    public String getThumbnailImageFetchableUrl() {
        return thumbnailImageFetchableUrl;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public String getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(String likeNum) {
        this.likeNum = likeNum;
    }

    public String getBookmarkNum() {
        return bookmarkNum;
    }

    public void setBookmarkNum(String bookmarkNum) {
        this.bookmarkNum = bookmarkNum;
    }
}
