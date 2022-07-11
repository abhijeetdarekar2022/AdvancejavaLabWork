package cadc.abhi;

import java.time.LocalDate;
import java.util.List;

import cdac.abhi.dao.AlbumSongDao;
import cdac.abhi.dao.GenericDao;
import cdac.abhi.entity.Album;
import cdac.abhi.entity.Song;


public class AlbumSongexample {
	public static void main(String[] args) {
	//GenericDao dao = new GenericDao();
		
		AlbumSongDao dao = new AlbumSongDao();
	
	/*Album album = new Album();
	
	album.setName("Hit song 2021");
	album.setReleaseDate(LocalDate.of(2021, 12, 24));
	album.setCopyright("Sony Musics");
	dao.save(album);*/
	/*
	Album album =(Album) dao.fetchById(Album.class, 1);
			
       Song song = new Song();
       song.setTitle("stu");
       song.setArtist("Ed Sheeran");
       song.setDuration(3.15);
       song.setAlbum(album);
       dao.save(song);
       */
	/*
	Album album =(Album) dao.fetchById(Album.class, 1);
	
    Song song = new Song();
    song.setTitle("add");
    song.setArtist("Tayor Swift");
    song.setDuration(4.35);
    song.setAlbum(album);
    dao.save(song);
    */
	
    /* Album album = new Album();
	
	album.setName("Hit song 2022");
	album.setReleaseDate(LocalDate.of(2022, 11, 21));
	album.setCopyright("Amazon Musics");
	dao.save(album);*/
	/*
	Album album =(Album) dao.fetchById(Album.class, 1);
			
       Song song = new Song();
       song.setTitle("stu");
       song.setArtist("Ed Sheeran");
       song.setDuration(3.15);
       song.setAlbum(album);
       dao.save(song);
       */
	/*
Album album =(Album) dao.fetchById(Album.class, 2);
	
    Song song = new Song();
    song.setTitle("sau");
    song.setArtist("Tayor Swift");
    song.setDuration(3.35);
    song.setAlbum(album);
    dao.save(song);
    */
	
/*	
Album album =(Album) dao.fetchById(Album.class, 2);
	
    Song song = new Song();
    song.setTitle("lav");
    song.setArtist("Ed Sheeran");
    song.setDuration(4.00);
    song.setAlbum(album);
    dao.save(song);
  */ 
	/*
Album album =(Album) dao.fetchById(Album.class, 2);
	
    Song song = new Song();
    song.setTitle("java");
    song.setArtist("Tayor Swift");
    song.setDuration(3.55);
    song.setAlbum(album);
    dao.save(song);
    
    */
		/*
		//for update 2 title 
		Song song =(Song) dao.fetchById(Song.class, 2);
		song.setTitle("lavani");
	    dao.save(song);
	*/
	
	/*List<Song> songs = dao.fetchSongsSungBy("Tayor Swift");
	for(Song song : songs) {
		System.out.println(song.getTitle()+" "+song.getArtist()+" "+song.getDuration());
	}*/
	/*
	List<Song> list = dao.fetchSongsByAlbumid(1);
	for(Song sa:list) {
		System.out.println(sa.getTitle()+" "+sa.getArtist()+" "+sa.getDuration());
	}
	*/
	/*
	dao.delete(Song.class,6);
	dao.delete(Song.class,7);
	*/
		Song song = (Song)dao.fetchById(Song.class, 2);
		song.setArtist("Taylor Swift");
		dao.save(song);
		Song song1 = (Song)dao.fetchById(Song.class, 3);
		song1.setArtist("Taylor Swift");
		dao.save(song1);
		Song song2 = (Song)dao.fetchById(Song.class, 5);
		song2.setArtist("Taylor Swift");
		dao.save(song2);
	
	}
	
}
	
