package koelDb;

import dbAdapter.Adapter;
import dbAdapter.Adapter01;
import models.Artist;
import org.testng.annotations.Test;

import java.util.List;

public class GetArtists {
    @Test
    public void getArtists(){
        List<Artist>artistList = Adapter01.getAllArtists();
        for (Artist artist : artistList){
            System.out.println(artist.getId()+" "+artist.getName());
        }
    }
}
