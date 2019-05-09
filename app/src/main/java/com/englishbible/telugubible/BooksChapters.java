package com.englishbible.telugubible;

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
        bookName.put(1 ,"ఆదికాండము-Genesis" );
        bookName.put(2 ,"నిర్గమకాండము-Exodus" );
        bookName.put(3 ,"లేవీయకాండము-Leviticus");
        bookName.put(4 ,"సంఖ్యాకాండము-Numbers");
        bookName.put(5 ,"ద్వితీయోపదేశకాండమ-Deuteronomy" );
        bookName.put(6 ,"యెహొషువ-Joshua");
        bookName.put(7 ,"న్యాయాధిపతులు-Judges" );
        bookName.put(8 ,"రూతు-Ruth");
        bookName.put(9 ,"సమూయేలు మొదటి గ్రంథము-1 Samuel");
        bookName.put(10 ,"సమూయేలు రెండవ గ్రంథము-2 Samuel");
        bookName.put(11 ,"రాజులు మొదటి గ్రంథము-1 Kings");
        bookName.put(12 ,"రాజులు రెండవ గ్రంథము-2 Kings");
        bookName.put(13 ,"దినవృత్తాంతములు మొదటి గ్రంథము-1 Chronicles" );
        bookName.put(14 ,"దినవృత్తాంతములు రెండవ గ్రంథము-2 Chronicles");
        bookName.put(15 ,"ఎజ్రా-Ezra");
        bookName.put(16 ,"నెహెమ్యా-Nehemiah");
        bookName.put(17 ,"ఎస్తేరు-Esther");
        bookName.put(18 ,"యోబు గ్రంథము-Job");
        bookName.put(19 ,"కీర్తనల గ్రంథము-Psalms" );
        bookName.put(20 ,"సామెతలు-Proverbes" );
        bookName.put(21 ,"ప్రసంగి-Ecclesiastes");
        bookName.put(22 ,"పరమగీతము-Song of Songs");
        bookName.put(23 ,"యెషయా గ్రంథము-Isaiah");
        bookName.put(24 ,"యిర్మీయా-Jeremiah" );
        bookName.put(25 ,"విలాపవాక్యములు-Lamentations" );
        bookName.put(26 ,"యెహెజ్కేలు-Ezekiel");
        bookName.put(27 ,"దానియేలు-Daniel" );
        bookName.put(28 ,"హొషేయ-Hosea" );
        bookName.put(29 ,"యోవేలు-Joel");
        bookName.put(30 ,"ఆమోసు-Amos");
        bookName.put(31 ,"ఓబద్యా-Obadiah");
        bookName.put(32 ,"యోనా-Jonah");
        bookName.put(33 ,"మీకా-Micah" );
        bookName.put(34 ,"నహూము-Nahum");
        bookName.put(35 ,"హబక్కూకు-Habakkuk" );
        bookName.put(36 ,"జెఫన్యా-Zephaniah" );
        bookName.put(37 ,"హగ్గయి-Haggai");
        bookName.put(38 ,"జెకర్యా-Zechariah");
        bookName.put(39 ,"మలాకీ-Malachi");
        bookName.put(40 ,"మత్తయి సువార్త-Matthew");
        bookName.put(41 ,"మార్కు సువార్త-Mark");
        bookName.put(42 ,"లూకా సువార్త-Luke" );
        bookName.put(43 ,"యోహాను సువార్త-John");
        bookName.put(44 ,"అపొస్తలుల కార్యములు-Acts" );
        bookName.put(45 ,"రోమీయులకు-Romans");
        bookName.put(46 ,"1 కొరింథీయులకు-1 Corinthians");
        bookName.put(47 ,"2 కొరింథీయులకు-2 Corinthians" );
        bookName.put(48 ,"గలతీయులకు-Galatians" );
        bookName.put(49 ,"ఎఫెసీయులకు-Ephesians");
        bookName.put(50 ,"ఫిలిప్పీయులకు-Philippians");
        bookName.put(51 ,"కొలొస్సయులకు-Colossians" );
        bookName.put(52 ,"1 థెస్సలొనీకయులకు-1 Thessalonians");
        bookName.put(53 ,"2 థెస్సలొనీకయులకు-2 Thessalonians");
        bookName.put(54 ,"1 తిమోతికి-1 Timothy" );
        bookName.put(55 ,"2 తిమోతికి-2 Timothy");
        bookName.put(56 ,"తీతుకు-Titus" );
        bookName.put(57 ,"ఫిలేమోనుకు-Philemon" );
        bookName.put(58 ,"హెబ్రీయులకు-Hebrews");
        bookName.put(59 ,"యాకోబు-James" );
        bookName.put(60 ,"1 పేతురు-1 Peter");
        bookName.put(61 ,"2 పేతురు-2 Peter");
        bookName.put(62 ,"1 యోహాను-1 John");
        bookName.put(63 ,"2 యోహాను-2 John");
        bookName.put(64 ,"3 యోహాను-3 John");;
        bookName.put(65 ,"యూదా-Jude");
        bookName.put(66 ,"ప్రకటన గ్రంథము-Revelation");
        return bookName.get(booknumber);

    }

}
