package org.example;

import java.util.ArrayList;
import java.util.List;

public class VideoPlayList {
    private List<Video>videoList=new ArrayList<>();
    public void addVideoToPlayList(Video video){
        videoList.add(video);
    }
    public List<Video> getVideoList(){
        return videoList;
    }
}
