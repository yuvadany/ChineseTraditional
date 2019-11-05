package bible.englishbible.chinesebible;

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
        bookName.put(1 ,"创世记-Genesis" );
        bookName.put(2 ,"出埃及记-Exodus" );
        bookName.put(3 ,"利未记-Leviticus");
        bookName.put(4 ,"民数记-Numbers");
        bookName.put(5 ,"申命记-Deuteronomy" );
        bookName.put(6 ,"约书亚记-Joshua");
        bookName.put(7 ,"士师记-Judges" );
        bookName.put(8 ,"路得记-Ruth");
        bookName.put(9 ,"撒母耳记上-1 Samuel");
        bookName.put(10 ,"撒母耳记下-2 Samuel");
        bookName.put(11 ,"列王纪上-1 Kings");
        bookName.put(12 ,"列王纪下-2 Kings");
        bookName.put(13 ,"历代志上-1 Chronicles" );
        bookName.put(14 ,"历代志下-2 Chronicles");
        bookName.put(15 ,"以斯拉记-Ezra");
        bookName.put(16 ,"尼希米记-Nehemiah");
        bookName.put(17 ,"以斯帖记-Esther");
        bookName.put(18 ,"约伯记-Job");
        bookName.put(19 ,"诗篇-Psalms" );
        bookName.put(20 ,"箴言-Proverbes" );
        bookName.put(21 ,"传道书-Ecclesiastes");
        bookName.put(22 ,"雅歌-Song of Songs");
        bookName.put(23 ,"以赛亚书-Isaiah");
        bookName.put(24 ,"耶利米书-Jeremiah" );
        bookName.put(25 ,"耶利米哀歌-Lamentations" );
        bookName.put(26 ,"以西结书-Ezekiel");
        bookName.put(27 ,"但以理书-Daniel" );
        bookName.put(28 ,"何西阿书-Hosea" );
        bookName.put(29 ,"约珥书-Joel");
        bookName.put(30 ,"阿摩司书-Amos");
        bookName.put(31 ,"俄巴底亚书-Obadiah");
        bookName.put(32 ,"约拿书-Jonah");
        bookName.put(33 ,"弥迦书-Micah" );
        bookName.put(34 ,"那鸿书-Nahum");
        bookName.put(35 ,"哈巴谷书-Habakkuk" );
        bookName.put(36 ,"西番雅书-Zephaniah" );
        bookName.put(37 ,"哈该书-Haggai");
        bookName.put(38 ,"撒迦利亚书-Zechariah");
        bookName.put(39 ,"玛拉基书-Malachi");
        bookName.put(40 ,"马太福音-Matthew");
        bookName.put(41 ,"马可福音-Mark");
        bookName.put(42 ,"路加福音-Luke" );
        bookName.put(43 ,"约翰福音-John");
        bookName.put(44 ,"使徒行传-Acts" );
        bookName.put(45 ,"罗马书-Romans");
        bookName.put(46 ,"哥林多前书-1 Corinthians");
        bookName.put(47 ,"哥林多后书-2 Corinthians" );
        bookName.put(48 ,"加拉太书-Galatians" );
        bookName.put(49 ,"以弗所书-Ephesians");
        bookName.put(50 ,"腓立比书-Philippians");
        bookName.put(51 ,"歌罗西书-Colossians" );
        bookName.put(52 ,"帖撒罗尼迦前书-1 Thessalonians");
        bookName.put(53 ,"帖撒罗尼迦后书-2 Thessalonians");
        bookName.put(54 ,"提摩太前书-1 Timothy" );
        bookName.put(55 ,"提摩太后书-2 Timothy");
        bookName.put(56 ,"提多书-Titus" );
        bookName.put(57 ,"腓利门书-Philemon" );
        bookName.put(58 ,"希伯来书-Hebrews");
        bookName.put(59 ,"雅各书-James" );
        bookName.put(60 ,"彼得前书-1 Peter");
        bookName.put(61 ,"彼得后书-2 Peter");
        bookName.put(62 ,"约翰一书-1 John");
        bookName.put(63 ,"约翰二书-2 John");
        bookName.put(64 ,"约翰三书-3 John");;
        bookName.put(65 ,"犹大书-Jude");
        bookName.put(66 ,"启示录-Revelation");
        return bookName.get(booknumber);

    }


}
