package com.englishbible.croatianbible;

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
        bookName.put(1 ,"Postanak-Genesis" );
        bookName.put(2 ,"Izlazak-Exodus" );
        bookName.put(3 ,"Levitski zakonik-Leviticus");
        bookName.put(4 ,"Brojevi-Numbers");
        bookName.put(5 ,"Ponovljeni zakon-Deuteronomy" );
        bookName.put(6 ,"Jošua-Joshua");
        bookName.put(7 ,"Suci-Judges" );
        bookName.put(8 ,"Ruta-Ruth");
        bookName.put(9 ,"1 Samuelova-1 Samuel");
        bookName.put(10 ,"2 Samuelova-2 Samuel");
        bookName.put(11 ,"1 Kraljevima-1 Kings");
        bookName.put(12 ,"2 Kraljevima-2 Kings");
        bookName.put(13 ,"1 Ljetopisa-1 Chronicles" );
        bookName.put(14 ,"2 Ljetopisa-2 Chronicles");
        bookName.put(15 ,"Ezra-Ezra");
        bookName.put(16 ,"Nehemija-Nehemiah");
        bookName.put(17 ,"Estera-Esther");
        bookName.put(18 ,"Job-Job");
        bookName.put(19 ,"Psalmi-Psalms" );
        bookName.put(20 ,"Mudre izreke-Proverbes" );
        bookName.put(21 ,"Propovjednik-Ecclesiastes");
        bookName.put(22 ,"Pjesma nad pjesmama-Song of Songs");
        bookName.put(23 ,"Izaija-Isaiah");
        bookName.put(24 ,"Jeremija-Jeremiah" );
        bookName.put(25 ,"Tužaljke-Lamentations" );
        bookName.put(26 ,"Ezekiel-Ezekiel");
        bookName.put(27 ,"Daniel-Daniel" );
        bookName.put(28 ,"Hošea-Hosea" );
        bookName.put(29 ,"Joel-Joel");
        bookName.put(30 ,"Amos-Amos");
        bookName.put(31 ,"Obadija-Obadiah");
        bookName.put(32 ,"Jona-Jonah");
        bookName.put(33 ,"Mihej-Micah" );
        bookName.put(34 ,"Nahum-Nahum");
        bookName.put(35 ,"Habakuk-Habakkuk" );
        bookName.put(36 ,"Sefanija-Zephaniah" );
        bookName.put(37 ,"Hagaj-Haggai");
        bookName.put(38 ,"Zaharija-Zechariah");
        bookName.put(39 ,"Malahija-Malachi");
        bookName.put(40 ,"Matej-Matthew");
        bookName.put(41 ,"Marko-Mark");
        bookName.put(42 ,"Luka-Luke" );
        bookName.put(43 ,"Ivan-John");
        bookName.put(44 ,"Djela apostolska-Acts" );
        bookName.put(45 ,"Rimljanima-Romans");
        bookName.put(46 ,"1 Korinćanima-1 Corinthians");
        bookName.put(47 ,"2 Korinćanima-2 Corinthians" );
        bookName.put(48 ,"Galaćanima-Galatians" );
        bookName.put(49 ,"Efežanima-Ephesians");
        bookName.put(50 ,"Filipljanima-Philippians");
        bookName.put(51 ,"Kološanima-Colossians" );
        bookName.put(52 ,"1 Solunjanima-1 Thessalonians");
        bookName.put(53 ,"2 Solunjanima-2 Thessalonians");
        bookName.put(54 ,"1 Timoteju-1 Timothy" );
        bookName.put(55 ,"2 Timoteju-2 Timothy");
        bookName.put(56 ,"Titu-Titus" );
        bookName.put(57 ,"Filemonu-Philemon" );
        bookName.put(58 ,"Hebrejima-Hebrews");
        bookName.put(59 ,"Jakovljeva-James" );
        bookName.put(60 ,"1 Petrova-1 Peter");
        bookName.put(61 ,"2 Petrova-2 Peter");
        bookName.put(62 ,"1 Ivanova-1 John");
        bookName.put(63 ,"2 Ivanova-2 John");
        bookName.put(64 ,"3 Ivanova-3 John");;
        bookName.put(65 ,"Judina-Jude");
        bookName.put(66 ,"Otkrivenje-Revelation");
        return bookName.get(booknumber);

    }


}
