/*
1. You have unearthed two unlabeled albums, record A and record B.
To see if these are the same album, you’re going to compare the number of songs on each one, and the total length of the albums.
First, create a variable called sameNumberOfSongs that stores whether the two albums have the same number of songs.

2. Now, create a variable called differentLength that stores the result of checking whether the two album lengths are not the same.
*/

public class EqualNotEqual {
	public static void main(String[] args) {   
		int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;
    boolean sameNumberOfSongs = songsA == songsB;
    boolean differentLength = albumLengthA != albumLengthB;
	}
}
