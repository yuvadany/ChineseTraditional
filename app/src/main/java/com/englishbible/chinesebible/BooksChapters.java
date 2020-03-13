package com.englishbible.chinesebible;

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
        bookName.put(1 ,"創世記-Genesis" );
        bookName.put(2 ,"出埃及記-Exodus" );
        bookName.put(3 ,"利未記-Leviticus");
        bookName.put(4 ,"民數記-Numbers");
        bookName.put(5 ,"申命記-Deuteronomy" );
        bookName.put(6 ,"約書亞記-Joshua");
        bookName.put(7 ,"士師記-Judges" );
        bookName.put(8 ,"路得記-Ruth");
        bookName.put(9 ,"撒母耳記上-1 Samuel");
        bookName.put(10 ,"撒母耳記下-2 Samuel");
        bookName.put(11 ,"列王紀上-1 Kings");
        bookName.put(12 ,"列王紀下-2 Kings");
        bookName.put(13 ,"歷代志上-1 Chronicles" );
        bookName.put(14 ,"歷代志下-2 Chronicles");
        bookName.put(15 ,"以斯拉記-Ezra");
        bookName.put(16 ,"尼希米記-Nehemiah");
        bookName.put(17 ,"以斯帖記-Esther");
        bookName.put(18 ,"約伯記-Job");
        bookName.put(19 ,"詩篇-Psalms" );
        bookName.put(20 ,"箴言-Proverbes" );
        bookName.put(21 ,"傳道書-Ecclesiastes");
        bookName.put(22 ,"雅歌-Song of Songs");
        bookName.put(23 ,"以賽亞書-Isaiah");
        bookName.put(24 ,"耶利米書-Jeremiah" );
        bookName.put(25 ,"耶利米哀歌-Lamentations" );
        bookName.put(26 ,"以西結書-Ezekiel");
        bookName.put(27 ,"但以理書-Daniel" );
        bookName.put(28 ,"何西阿書-Hosea" );
        bookName.put(29 ,"約珥書-Joel");
        bookName.put(30 ,"阿摩司書-Amos");
        bookName.put(31 ,"俄巴底亞書-Obadiah");
        bookName.put(32 ,"約拿書-Jonah");
        bookName.put(33 ,"彌迦書-Micah" );
        bookName.put(34 ,"那鴻書-Nahum");
        bookName.put(35 ,"哈巴谷書-Habakkuk" );
        bookName.put(36 ,"西番雅書-Zephaniah" );
        bookName.put(37 ,"哈該書-Haggai");
        bookName.put(38 ,"撒迦利亞書-Zechariah");
        bookName.put(39 ,"瑪拉基書-Malachi");
        bookName.put(40 ,"馬太福音-Matthew");
        bookName.put(41 ,"馬可福音-Mark");
        bookName.put(42 ,"路加福音-Luke" );
        bookName.put(43 ,"約翰福音-John");
        bookName.put(44 ,"使徒行傳-Acts" );
        bookName.put(45 ,"羅馬書-Romans");
        bookName.put(46 ,"哥林多前書-1 Corinthians");
        bookName.put(47 ,"哥林多後書-2 Corinthians" );
        bookName.put(48 ,"加拉太書-Galatians" );
        bookName.put(49 ,"以弗所書-Ephesians");
        bookName.put(50 ,"腓立比書-Philippians");
        bookName.put(51 ,"歌羅西書-Colossians" );
        bookName.put(52 ,"帖撒羅尼迦前書-1 Thessalonians");
        bookName.put(53 ,"帖撒羅尼迦後書-2 Thessalonians");
        bookName.put(54 ,"提摩太前書-1 Timothy" );
        bookName.put(55 ,"提摩太後書-2 Timothy");
        bookName.put(56 ,"提多書-Titus" );
        bookName.put(57 ,"腓利門書-Philemon" );
        bookName.put(58 ,"希伯來書-Hebrews");
        bookName.put(59 ,"雅各書-James" );
        bookName.put(60 ,"彼得前書-1 Peter");
        bookName.put(61 ,"彼得後書-2 Peter");
        bookName.put(62 ,"約翰壹書-1 John");
        bookName.put(63 ,"約翰貳書-2 John");
        bookName.put(64 ,"約翰參書-3 John");;
        bookName.put(65 ,"猶大-Jude");
        bookName.put(66 ,"啟示錄-Revelation");
        return bookName.get(booknumber);

    }


}
