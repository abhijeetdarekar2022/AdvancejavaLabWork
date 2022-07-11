package cdac.abhi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cdac.abhi.entity.Song;

public class AlbumSongDao extends GenericDao {
	
	public List<Song> fetchSongsSungBy(String artist) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Just Practice");
		try {
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select s from Song s where s.artist = :artist");
			q.setParameter("artist", artist);
			List<Song> list = q.getResultList();
			return list;
		}
		finally {
			emf.close();
		}
	}
	
	public List<Song> fetchSongsByAlbumid(int a) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Just Practice");
		try {
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select s from Song s join s.album sa where sa.id =:aa");
			//Query q = em.createQuery("select s from Song s join s.album sa where album_id =:aa");
			q.setParameter("aa", a);
			List<Song> list = q.getResultList();
			
			return list;
		}
		finally {
			emf.close();
		}
	}

}
