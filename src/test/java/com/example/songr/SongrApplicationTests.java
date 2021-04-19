package com.example.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SongrApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Test
	public void Getters(){
		Album test=new Album("lover","taylor swift",13,760,"https://upload.wikimedia.org/wikipedia/en/c/cd/Taylor_Swift_-_Lover.png");
		String getTest=""+test.getTitle()+","+test.getArtist()+","+test.getSongCount()+","+test.getLength()+","+test.getImageUrl();
		assertThat("lover,taylor swift,13,760,https://upload.wikimedia.org/wikipedia/en/c/cd/Taylor_Swift_-_Lover.png").isEqualTo(getTest);
	}

	@Test
	public void Setters(){
		Album test=new Album("lover","taylor swift",13,760,"https://upload.wikimedia.org/wikipedia/en/c/cd/Taylor_Swift_-_Lover.png");
		test.setTitle("Alkhateeb");
		test.setArtist("Mohamad");
		test.setSongCount(7);
		test.setLength(171);
		test.setImageUrl("IMGURL");
		String setTest=""+test.getTitle()+","+test.getArtist()+","+test.getSongCount()+","+test.getLength()+","+test.getImageUrl();
		assertThat("Alkhateeb,Mohamad,7,171,IMGURL").isEqualTo(setTest);

	}
//	________________________________________________________________________


	

}
