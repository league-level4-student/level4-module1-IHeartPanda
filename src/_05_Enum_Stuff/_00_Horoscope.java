package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	public static void main(String[] args) {
		Zodiac zap = Zodiac.LEO;
		getHoroscope(zap);
	}

	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.

	// 3. Make a main method to test your method

	public static void getHoroscope(Zodiac z) {

		switch (z) {
		case ARIES:
			JOptionPane.showMessageDialog(null,
					"JAN 13, 2019: There is one very simple rule that you need to follow today: Ask for something, and you will get it. This includes attention from people you might think are too busy or too important to have time for you. Well, you're wrong about that -- right now, you may have an inaccurate idea of how you rank among your people. So if you need any type of support today, just ask for it — you will get the help you need with little if any hesitation.\n");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null,
					"JAN 13, 2019: Some of the new situations you're thrown into today will be exciting, and some will be awkward. But either way, you'll have a good time being yourself in unfamiliar surroundings. There's no need to be self-conscious, because you are among people who respect you and who consider you an equal. Keep that in mind today, and no crowd will intimidate you or throw you off your game.");
			break;

		case GEMINI:
			JOptionPane.showMessageDialog(null,
					"JAN 13, 2019: Just because someone has more experience or more education than you does not mean that she or he is smarter than you are -- and of course, it definitely does not mean that what you have to say is less important! So don't be afraid to speak your mind today, even if you don't quite have your thoughts organized as neatly as you would like. You can safely rely on the people you're speaking with to understand you.");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null,
					"JAN 13, 2019: Are you trying to persuade someone to agree with you? Emotional appeals aren't working very well, are they? Today it's time for a different tactic. Use the power of logic, instead of trying to tug at heartstrings. Reason with facts and figures instead of with amusing anecdotes. Empathy is not easy for everyone. Right now, hard facts have the power to change minds.");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null,
					"JAN 13, 2019: Time is the most important element of your day — saving it, making it, and savoring it should be on your mind. When it comes to your relationships, you need to spend more time with someone you haven't seen in a while. Make some room in your schedule, and call or email her or him as early as you can to book a date. To save time, don't waste it with people who don't deserve your attention. To savor time, do something you enjoy, and be grateful that you can live in the moment.");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null,
					"JAN 13, 2019: Experimenting with your look is a great way to keep yourself feeling young and trendy — plus, it will help you stand out from the crowd in a memorable way. Integrate some new items into your wardrobe — you've got a wild energy today, and you'll be in a perfect frame of mind to go shopping for something a bit trendy. You know what looks good on you, so push the envelope and invest in something that shows your adventurous side.");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null,
					"JAN 13, 2019: Members of your inner social circle are dying to schedule some fun time with you, so try to make yourself more available right now. Turn your ringer back on (and answer the phone). Don't let an email linger in your inbox for too long. Get back in touch with people, and say 'yes' to every invitation they send your way. If you do, you'll enjoy a lot of fun and laughter. It's time to step out into the world and soak up some admiration.\n"
							+ "\n" + "");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null,
					"JAN 13, 2019: Your surroundings have a bigger influence over you than you might realize, especially now, when there is so much in your life that's in flux. You need to have a home base, a safe refuge where you can relax. This is a perfect time to take another stab at decorating your home in a warm, relaxing style. So pick up some throw pillows or other small accent pieces; they'll make a big difference in your mood.");
			break;

		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null,
					"JAN 13, 2019: Don't just sit quietly when you're surrounded by strangers today — get to chitchatting, and you'll transform what could have been a very boring waiting period into an enjoyable social event. Be the first one to say something, and don't shy away from being candid. It's a great day to talk to people you've never met before. People (including you) are feeling especially openhearted right now! And there's freedom in talking to people whom you know you'll never see again.");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null,
					"JAN 13, 2019: New things are irresistible. A new car has that lovely smell and sparkly shine, a new person can be intriguingly mysterious, and a new outfit can change your whole outlook on life! But you need to be wary of getting involved with something just because it's new. Sure, you can't see any cracks or rust spots, but that doesn't mean this new venture, person or opportunity is perfect. Wait until you're sure it's worthwhile before you get involved.");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null,
					"JAN 13, 2019: Now is not the time for false modesty — if you know you did something special (and you do, don't you?), you need to step up and admit your brilliance. Are you afraid of coming off as conceited? Don't be. The people in your life know what you've accomplished, and they'll respect you much more if you're openly proud. In fact, pretending that what you've done is no big deal may come across as manipulative or scheming. Honesty is especially important right now.");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null,
					"JAN 13, 2019: Only you know whether something can't be done in your life — so don't let naysayers pooh-pooh your latest great idea. Just because they don't see how it could happen doesn't mean that it is unrealistic. And the exciting news is that even if you don't see quite how to carry out your ideas, you'll have many opportunities to figure things out as you go. Your ability to get people in your corner will help you stay happy and focused. You can do this.");
			break;
		}
	}
}
