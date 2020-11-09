package it.unibo.oop.lab.enum1;

import java.util.Comparator;
import java.util.List;

import it.unibo.oop.lab.socialnetwork.SocialNetworkUser;
import it.unibo.oop.lab.socialnetwork.SocialNetworkUserImpl;
import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    public static boolean checkUserOrder(final List<Sport> expected, final List<Sport> result) {
        for (int i = 0; i < expected.size(); i++) {       	
        	if (!expected.get(i).equals(result.get(i))){
                System.out.println("[EXCEPTION] [POS. " + i + "] [EXPECTED] " + expected.get(i) + " [GOT] " + result.get(i));
                return false;
            }
        }
        return true;
    }
    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        // TODO
    	final SportSocialNetworkUserImpl<User> kbacon = new SportSocialNetworkUserImpl<>("Kevin", "Bacon", "kbacon", 56);
        final SportSocialNetworkUserImpl<User> dwashington = new SportSocialNetworkUserImpl<>("Denzel", "Washington", "dwashington", 59);
        final SportSocialNetworkUserImpl<User> mgladwell = new SportSocialNetworkUserImpl<>("Malcom", "Gladwell", "mgladwell", 51);
        final SportSocialNetworkUserImpl<User> ntaleb = new SportSocialNetworkUserImpl<>("Nicholas", "Taleb", "ntaleb", 54);
        final SportSocialNetworkUserImpl<User> mrossi = new SportSocialNetworkUserImpl<>("Mario", "Rossi", "mrossi", 31);
        final SportSocialNetworkUserImpl<User> pverdi = new SportSocialNetworkUserImpl<>("Paolo", "Verdi", "pverdi", 24);
        // TEST on DENZEL
        dwashington.addSport(Sport.tennis);
        dwashington.addSport(Sport.basket);
        dwashington.addSport(Sport.volley);
        dwashington.addSport(Sport.F1);
        dwashington.addSport(Sport.bike);
        final List<User> denzelUsers = dwashington.getFollowedUsers();
        java.util.Collections.sort(denzelUsers, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				return o1.getAge() - o2.getAge();
			}
        	
        });
    }
}
