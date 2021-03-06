package org.wcci.apimastery;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SongStorage {
    SongRepository songRepo;

    public SongStorage(SongRepository songRepo){
     this.songRepo = songRepo;
    }

    public SongRepository getSongRepo() {
        return songRepo;
    }

    public Song findSongByTitle (String title) {
        return songRepo.findSongByTitle(title);
    }

    public Song findSongById(Long songId){
        return songRepo.findById(songId).get();
    }

    public Song save(Song song){
        return songRepo.save(song);
    }

    public Collection<Song> findAllSongs(){

        return (Collection<Song>) songRepo.findAll();
    }

    public void delete(Song songToRemove) {
        songRepo.delete(songToRemove);
    }
}
