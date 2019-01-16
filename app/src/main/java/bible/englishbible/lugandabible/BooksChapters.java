package bible.englishbible.lugandabible;

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
        bookName.put(1 ,"Olubereberye-Genesis" );
        bookName.put(2 ,"Okuva-Exod-Exodus" );
        bookName.put(3 ,"Ebyabaleevi-Leviticus");
        bookName.put(4 ,"Okubala-Numbers");
        bookName.put(5 ,"Ekyamateeka-Deuteronomy" );
        bookName.put(6 ,"Yoswa-Joshua");
        bookName.put(7 ,"Ekyabalamuzi-Judges" );
        bookName.put(8 ,"Luusi-Ruth");
        bookName.put(9 ,"1 Samwiri-1 Samuel");
        bookName.put(10 ,"2 Samwiri-2 Samuel");
        bookName.put(11 ,"1 Bassekabaka-1 Kings");
        bookName.put(12 ,"2 Bassekabaka-2 Kings");
        bookName.put(13 ,"1 Ebyomumirembe-1 Chronicles" );
        bookName.put(14 ,"2 Ebyomumirembe-2 Chronicles");
        bookName.put(15 ,"Ezera-Ezra");
        bookName.put(16 ,"Nekkemiya-Nehemiah");
        bookName.put(17 ,"Eseza-Esther");
        bookName.put(18 ,"Yobu-Job");
        bookName.put(19 ,"Zabbuli-Psalms" );
        bookName.put(20 ,"Engero-Proverbes" );
        bookName.put(21 ,"Omubuulizi-Ecclesiastes");
        bookName.put(22 ,"Oluyimba lwa Sulemaani-Song of Songs");
        bookName.put(23 ,"Isaaya-Isaiah");
        bookName.put(24 ,"Yeremiya-Jeremiah" );
        bookName.put(25 ,"Okukungubaga-Lamentations" );
        bookName.put(26 ,"Ezekyeri-Ezekiel");
        bookName.put(27 ,"Danyeri-Daniel" );
        bookName.put(28 ,"Koseya-Hosea" );
        bookName.put(29 ,"Yoweeri-Joel");
        bookName.put(30 ,"Amosi-Amos");
        bookName.put(31 ,"Obadiya-Obadiah");
        bookName.put(32 ,"Yona-Jonah");
        bookName.put(33 ,"Mikka-Micah" );
        bookName.put(34 ,"Nakumu-Nahum");
        bookName.put(35 ,"Kaabakuuku-Habakkuk" );
        bookName.put(36 ,"Zeffaniya-Zephaniah" );
        bookName.put(37 ,"Kaggayi-Haggai");
        bookName.put(38 ,"Zekkaliya-Zechariah");
        bookName.put(39 ,"Malaki-Malachi");
        bookName.put(40 ,"Matayo-Matthew");
        bookName.put(41 ,"Makko-Mark");
        bookName.put(42 ,"Lukka-Luke" );
        bookName.put(43 ,"Yokaana-John");
        bookName.put(44 ,"Ebikolwa-Acts" );
        bookName.put(45 ,"Abaruumi-Romans");
        bookName.put(46 ,"1 Abakkolinso-1 Corinthians");
        bookName.put(47 ,"2 Abakkolinso-2 Corinthians" );
        bookName.put(48 ,"Abaggalatiya-Galatians" );
        bookName.put(49 ,"Abaefeeso-Ephesians");
        bookName.put(50 ,"Abafiripi-Philippians");
        bookName.put(51 ,"Abakkolosaayi-Colossians" );
        bookName.put(52 ,"1 Abasessaloniika-1 Thessalonians");
        bookName.put(53 ,"2 Abasessaloniika-2 Thessalonians");
        bookName.put(54 ,"1 Timoseewo-1 Timothy" );
        bookName.put(55 ,"2 Timoseewo-2 Timothy");
        bookName.put(56 ,"Tito-Titus" );
        bookName.put(57 ,"Firemooni-Philemon" );
        bookName.put(58 ,"Abaebbulaniya-Hebrews");
        bookName.put(59 ,"Yakobo-James" );
        bookName.put(60 ,"1 Peetero-1 Peter");
        bookName.put(61 ,"2 Peetero-2 Peter");
        bookName.put(62 ,"1 Yokaana-1 John");
        bookName.put(63 ,"2 Yokaana-2 John");
        bookName.put(64 ,"3 Yokaana-3 John");;
        bookName.put(65 ,"Yuda-Jude");
        bookName.put(66 ,"Okubikkulirwa-Revelation");
        return bookName.get(booknumber);

    }

}
