package com.englishbible.greekbible;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 7/04/2018.
 */
public class BooksChapters {

    public static int  getChaptersCount(int book)
    {
        HashMap<Integer,Integer> booksChapters = new HashMap<Integer,Integer>();
        booksChapters.put(	1 , 50	);
        booksChapters.put(	2 , 40	);
        booksChapters.put(	3 , 27	);
        booksChapters.put(	4 , 36	);
        booksChapters.put(	5 , 34	);
        booksChapters.put(	6 , 24	);
        booksChapters.put(	7 , 21	);
        booksChapters.put(	8 , 4	);
        booksChapters.put(	9 , 31	);
        booksChapters.put(	10 , 24	);
        booksChapters.put(	11 , 22	);
        booksChapters.put(	12 , 25	);
        booksChapters.put(	13 , 29	);
        booksChapters.put(	14 , 36	);
        booksChapters.put(	15 , 10	);
        booksChapters.put(	16 , 13	);
        booksChapters.put(	17 , 10	);
        booksChapters.put(	18 , 42	);
        booksChapters.put(	19 , 150);
        booksChapters.put(	20 , 31	);
        booksChapters.put(	21 , 12	);
        booksChapters.put(	22 , 8	);
        booksChapters.put(	23 , 66	);
        booksChapters.put(	24 , 52	);
        booksChapters.put(	25 , 5	);
        booksChapters.put(	26 , 48	);
        booksChapters.put(	27 , 12	);
        booksChapters.put(	28 , 14	);
        booksChapters.put(	29 , 3	);
        booksChapters.put(	30 , 9	);
        booksChapters.put(	31 , 1	);
        booksChapters.put(	32 , 4	);
        booksChapters.put(	33 , 7	);
        booksChapters.put(	34 , 3	);
        booksChapters.put(	35 , 3	);
        booksChapters.put(	36 , 3	);
        booksChapters.put(	37 , 2	);
        booksChapters.put(	38 , 14	);
        booksChapters.put(	39 , 4	);
        booksChapters.put(	40 , 28	);
        booksChapters.put(	41 , 16	);
        booksChapters.put(	42 , 24	);
        booksChapters.put(	43 , 21	);
        booksChapters.put(	44 , 28	);
        booksChapters.put(	45 , 16	);
        booksChapters.put(	46 , 16	);
        booksChapters.put(	47 , 13	);
        booksChapters.put(	48 , 6	);
        booksChapters.put(	49 , 6	);
        booksChapters.put(	50 , 4	);
        booksChapters.put(	51 , 4	);
        booksChapters.put(	52 , 5	);
        booksChapters.put(	53 , 3	);
        booksChapters.put(	54 , 6	);
        booksChapters.put(	55 , 4	);
        booksChapters.put(	56 , 3	);
        booksChapters.put(	57 , 1	);
        booksChapters.put(	58 , 13	);
        booksChapters.put(	59 , 5	);
        booksChapters.put(	60 , 5	);
        booksChapters.put(	61 , 3	);
        booksChapters.put(	62 , 5	);
        booksChapters.put(	63 , 1	);
        booksChapters.put(	64 , 1	);
        booksChapters.put(	65 , 1	);
        booksChapters.put(	66 , 22	);
        return booksChapters.get(book);
    }

    public static String getBookName(int booknumber)
    {
        Map<Integer,String> bookName = new HashMap<Integer,String>();
        bookName.put(1 ,"Γένεση-Genesis" );
        bookName.put(2 ,"Έξοδος-Exodus" );
        bookName.put(3 ,"Λευιτικό-Leviticus");
        bookName.put(4 ,"Αριθμοί-Numbers");
        bookName.put(5 ,"Δευτερονόμιο-Deuteronomy" );
        bookName.put(6 ,"Ιησούς του Ναυή-Joshua");
        bookName.put(7 ,"Κριτές-Judges" );
        bookName.put(8 ,"Ρουθ-Ruth");
        bookName.put(9 ,"1 Σαμουήλ-1-1 Samuel");
        bookName.put(10 ,"2 Σαμουήλ -2-2 Samuel");
        bookName.put(11 ,"1 Βασιλέων 1-1 Kings");
        bookName.put(12 ,"2 Βασιλέων 2-2 Kings");
        bookName.put(13 ,"1 Χρονικών 1-1 Chronicles" );
        bookName.put(14 ,"2 Χρονικών 2-2 Chronicles");
        bookName.put(15 ,"Έσδρας-Ezra");
        bookName.put(16 ,"Νεεμίας-Nehemiah");
        bookName.put(17 ,"Εσθήρ-Esther");
        bookName.put(18 ,"Ιώβ-Job");
        bookName.put(19 ,"Ψαλμοί-Psalms" );
        bookName.put(20 ,"Παροιμίες-Proverbes" );
        bookName.put(21 ,"Εκκλησιαστής-Ecclesiastes");
        bookName.put(22 ,"Άσμα Σολομώντος (Άσμα Ασμάτων)-Song of Songs");
        bookName.put(23 ,"Ησαΐας-Isaiah");
        bookName.put(24 ,"Ιερεμίας-Jeremiah" );
        bookName.put(25 ,"Θρήνοι-Lamentations" );
        bookName.put(26 ,"Ιεζεκιήλ-Ezekiel");
        bookName.put(27 ,"Δανιήλ-Daniel" );
        bookName.put(28 ,"Ωσηέ-Hosea" );
        bookName.put(29 ,"Ιωήλ-Joel");
        bookName.put(30 ,"Αμώς-Amos");
        bookName.put(31 ,"Αβδιού-Obadiah");
        bookName.put(32 ,"Ιωνάς-Jonah");
        bookName.put(33 ,"Μιχαίας-Micah" );
        bookName.put(34 ,"Ναούμ-Nahum");
        bookName.put(35 ,"Αββακούμ‍-Habakkuk" );
        bookName.put(36 ,"Σοφονίας-Zephaniah" );
        bookName.put(37 ,"Αγγαίος-Haggai");
        bookName.put(38 ,"Ζαχαρίας-Zechariah");
        bookName.put(39 ,"Μαλαχίας-Malachi");
        bookName.put(40 ,"Μαθθαῖον-Matthew");
        bookName.put(41 ,"Μᾶρκον-Mark");
        bookName.put(42 ,"Λουκᾶν-Luke" );
        bookName.put(43 ,"Ἰωάννην-John");
        bookName.put(44 ,"Πράξεις Ἀποστόλων-Acts" );
        bookName.put(45 ,"Πρὸς Ῥωμαίουςς-Romans");
        bookName.put(46 ,"Κορινθίους α’-1 Corinthians");
        bookName.put(47 ,"Κορινθίους β’-2 Corinthians" );
        bookName.put(48 ,"Γαλάτας-Galatians" );
        bookName.put(49 ,"Ἐφεσίους-Ephesians");
        bookName.put(50 ,"Φιλιππησίους-Philippians");
        bookName.put(51 ,"Κολοσσαεῖς-Colossians" );
        bookName.put(52 ,"Θεσσαλονικεῖς α’-1 Thessalonians");
        bookName.put(53 ,"Θεσσαλονικεῖς β’-2 Thessalonians");
        bookName.put(54 ,"Τιμόθεον α’-1 Timothy" );
        bookName.put(55 ,"Τιμόθεον β’-2 Timothy");
        bookName.put(56 ,"Τίτον-Titus" );
        bookName.put(57 ,"Φιλήμονα-Philemon" );
        bookName.put(58 ,"Ἑβραίους-Hebrews");
        bookName.put(59 ,"Ἰακώβου-James" );
        bookName.put(60 ,"ἐπιστολή α’-1 Peter");
        bookName.put(61 ,"ἐπιστολή β’-2 Peter");
        bookName.put(62 ,"Ἰωάννου ἐπιστολή α’-1 John");
        bookName.put(63 ,"Ἰωάννου ἐπιστολή β’-2 John");
        bookName.put(64 ,"Ἰωάννου ἐπιστολή γ’-3 John");;
        bookName.put(65 ,"Ἰούδα ἐπιστολή-Jude");
        bookName.put(66 ,"Ἀποκάλυψις-Revelation");
        return bookName.get(booknumber);

    }


}
