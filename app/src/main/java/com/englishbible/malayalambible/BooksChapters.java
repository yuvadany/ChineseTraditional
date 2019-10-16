package com.englishbible.malayalambible;

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
        bookName.put(1 ,"ഉല്പത്തി-Genesis" );
        bookName.put(2 ,"പുറപ്പാടു്-Exodus" );
        bookName.put(3 ,"ലേവ്യപുസ്തകം-Leviticus");
        bookName.put(4 ,"സംഖ്യാപുസ്തകം-Numbers");
        bookName.put(5 ,"ആവർത്തനം-Deuteronomy" );
        bookName.put(6 ,"യോശുവ-Joshua");
        bookName.put(7 ,"ന്യായാധിപന്മാർ-Judges" );
        bookName.put(8 ,"രൂത്ത്-Ruth");
        bookName.put(9 ,"ശമൂവേൽ-1-1 Samuel");
        bookName.put(10 ,"ശമൂവേൽ -2-2 Samuel");
        bookName.put(11 ,"രാജാക്കന്മാർ 1-1 Kings");
        bookName.put(12 ,"രാജാക്കന്മാർ 2-2 Kings");
        bookName.put(13 ,"ദിനവൃത്താന്തം 1-1 Chronicles" );
        bookName.put(14 ,"ദിനവൃത്താന്തം 2-2 Chronicles");
        bookName.put(15 ,"എസ്രാ-Ezra");
        bookName.put(16 ,"നെഹെമ്യാവു-Nehemiah");
        bookName.put(17 ,"എസ്ഥേർ-Esther");
        bookName.put(18 ,"ഇയ്യോബ്-Job");
        bookName.put(19 ,"സങ്കീർത്തനങ്ങൾ-Psalms" );
        bookName.put(20 ,"സദൃശ്യവാക്യങ്ങൾ-Proverbes" );
        bookName.put(21 ,"സഭാപ്രസംഗി-Ecclesiastes");
        bookName.put(22 ,"ഉത്തമ ഗീതം-Song of Songs");
        bookName.put(23 ,"യെശയ്യാ-Isaiah");
        bookName.put(24 ,"യിരേമ്യാവു-Jeremiah" );
        bookName.put(25 ,"വിലാപങ്ങൾ-Lamentations" );
        bookName.put(26 ,"യേഹേസ്കേൽ-Ezekiel");
        bookName.put(27 ,"ദാനീയേൽ-Daniel" );
        bookName.put(28 ,"ഹോശേയ-Hosea" );
        bookName.put(29 ,"യോവേൽ-Joel");
        bookName.put(30 ,"ആമോസ്-Amos");
        bookName.put(31 ,"ഓബദ്യാവു-Obadiah");
        bookName.put(32 ,"യോനാ-Jonah");
        bookName.put(33 ,"മീഖാ-Micah" );
        bookName.put(34 ,"നഹൂം-Nahum");
        bookName.put(35 ,"ഹബക്കൂക്‍-Habakkuk" );
        bookName.put(36 ,"സെഫന്യാവു-Zephaniah" );
        bookName.put(37 ,"ഹഗ്ഗായി-Haggai");
        bookName.put(38 ,"സെഖർയ്യാവു-Zechariah");
        bookName.put(39 ,"മലാഖി-Malachi");
        bookName.put(40 ,"മത്തായി-Matthew");
        bookName.put(41 ,"മർക്കൊസ്-Mark");
        bookName.put(42 ,"ലൂക്കോസ്-Luke" );
        bookName.put(43 ,"യോഹന്നാൻ-John");
        bookName.put(44 ,"പ്രവൃത്തികൾ-Acts" );
        bookName.put(45 ,"റോമർ-Romans");
        bookName.put(46 ,"കൊരിന്ത്യർ 1-1 Corinthians");
        bookName.put(47 ,"കൊരിന്ത്യർ 2-2 Corinthians" );
        bookName.put(48 ,"ഗലാത്യർ-Galatians" );
        bookName.put(49 ,"എഫെസ്യർ-Ephesians");
        bookName.put(50 ,"ഫിലിപ്പിയർ-Philippians");
        bookName.put(51 ,"കൊലൊസ്സ്യർ-Colossians" );
        bookName.put(52 ,"തെസ്സലൊനീക്യർ 1-1 Thessalonians");
        bookName.put(53 ,"തെസ്സലൊനീക്യർ 2-2 Thessalonians");
        bookName.put(54 ,"തിമൊഥെയൊസ് 1-1 Timothy" );
        bookName.put(55 ,"തിമൊഥെയൊസ് 2-2 Timothy");
        bookName.put(56 ,"തീത്തൊസ്-Titus" );
        bookName.put(57 ,"ഫിലേമോൻ-Philemon" );
        bookName.put(58 ,"എബ്രായർ-Hebrews");
        bookName.put(59 ,"യാക്കോബ്-James" );
        bookName.put(60 ,"പത്രൊസ് 1-1 Peter");
        bookName.put(61 ,"പത്രൊസ് 2-2 Peter");
        bookName.put(62 ,"യോഹന്നാൻ 1-1 John");
        bookName.put(63 ,"യോഹന്നാൻ 2-2 John");
        bookName.put(64 ,"യോഹന്നാൻ 3-3 John");;
        bookName.put(65 ,"യൂദാ-Jude");
        bookName.put(66 ,"വെളിപ്പാടു-Revelation");
        return bookName.get(booknumber);

    }


}
