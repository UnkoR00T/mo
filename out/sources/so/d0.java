package so;

import io.sentry.android.core.c2;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String[]> f182612a = new HashMap(138);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f182613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String[] f182614c;

    class a implements Comparator<int[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            int i15 = iArr[0];
            int i16 = iArr2[0];
            if (i15 < i16) {
                return -1;
            }
            return i15 == i16 ? 0 : 1;
        }
    }

    static {
        Object[][] objArr = {new Object[]{"Adlam", new String[]{"adlm"}}, new Object[]{"Ahom", new String[]{"ahom"}}, new Object[]{"Anatolian_Hieroglyphs", new String[]{"hluw"}}, new Object[]{"Arabic", new String[]{"arab"}}, new Object[]{"Armenian", new String[]{"armn"}}, new Object[]{"Avestan", new String[]{"avst"}}, new Object[]{"Balinese", new String[]{"bali"}}, new Object[]{"Bamum", new String[]{"bamu"}}, new Object[]{"Bassa_Vah", new String[]{"bass"}}, new Object[]{"Batak", new String[]{"batk"}}, new Object[]{"Bengali", new String[]{"bng2", "beng"}}, new Object[]{"Bhaiksuki", new String[]{"bhks"}}, new Object[]{"Bopomofo", new String[]{"bopo"}}, new Object[]{"Brahmi", new String[]{"brah"}}, new Object[]{"Braille", new String[]{"brai"}}, new Object[]{"Buginese", new String[]{"bugi"}}, new Object[]{"Buhid", new String[]{"buhd"}}, new Object[]{"Canadian_Aboriginal", new String[]{"cans"}}, new Object[]{"Carian", new String[]{"cari"}}, new Object[]{"Caucasian_Albanian", new String[]{"aghb"}}, new Object[]{"Chakma", new String[]{"cakm"}}, new Object[]{"Cham", new String[]{"cham"}}, new Object[]{"Cherokee", new String[]{"cher"}}, new Object[]{"Common", new String[]{"DFLT"}}, new Object[]{"Coptic", new String[]{"copt"}}, new Object[]{"Cuneiform", new String[]{"xsux"}}, new Object[]{"Cypriot", new String[]{"cprt"}}, new Object[]{"Cyrillic", new String[]{"cyrl"}}, new Object[]{"Deseret", new String[]{"dsrt"}}, new Object[]{"Devanagari", new String[]{"dev2", "deva"}}, new Object[]{"Duployan", new String[]{"dupl"}}, new Object[]{"Egyptian_Hieroglyphs", new String[]{"egyp"}}, new Object[]{"Elbasan", new String[]{"elba"}}, new Object[]{"Ethiopic", new String[]{"ethi"}}, new Object[]{"Georgian", new String[]{"geor"}}, new Object[]{"Glagolitic", new String[]{"glag"}}, new Object[]{"Gothic", new String[]{"goth"}}, new Object[]{"Grantha", new String[]{"gran"}}, new Object[]{"Greek", new String[]{"grek"}}, new Object[]{"Gujarati", new String[]{"gjr2", "gujr"}}, new Object[]{"Gurmukhi", new String[]{"gur2", "guru"}}, new Object[]{"Han", new String[]{"hani"}}, new Object[]{"Hangul", new String[]{"hang"}}, new Object[]{"Hanunoo", new String[]{"hano"}}, new Object[]{"Hatran", new String[]{"hatr"}}, new Object[]{"Hebrew", new String[]{"hebr"}}, new Object[]{"Hiragana", new String[]{"kana"}}, new Object[]{"Imperial_Aramaic", new String[]{"armi"}}, new Object[]{"Inherited", new String[]{"Inherited"}}, new Object[]{"Inscriptional_Pahlavi", new String[]{"phli"}}, new Object[]{"Inscriptional_Parthian", new String[]{"prti"}}, new Object[]{"Javanese", new String[]{"java"}}, new Object[]{"Kaithi", new String[]{"kthi"}}, new Object[]{"Kannada", new String[]{"knd2", "knda"}}, new Object[]{"Katakana", new String[]{"kana"}}, new Object[]{"Kayah_Li", new String[]{"kali"}}, new Object[]{"Kharoshthi", new String[]{"khar"}}, new Object[]{"Khmer", new String[]{"khmr"}}, new Object[]{"Khojki", new String[]{"khoj"}}, new Object[]{"Khudawadi", new String[]{"sind"}}, new Object[]{"Lao", new String[]{"lao "}}, new Object[]{"Latin", new String[]{"latn"}}, new Object[]{"Lepcha", new String[]{"lepc"}}, new Object[]{"Limbu", new String[]{"limb"}}, new Object[]{"Linear_A", new String[]{"lina"}}, new Object[]{"Linear_B", new String[]{"linb"}}, new Object[]{"Lisu", new String[]{"lisu"}}, new Object[]{"Lycian", new String[]{"lyci"}}, new Object[]{"Lydian", new String[]{"lydi"}}, new Object[]{"Mahajani", new String[]{"mahj"}}, new Object[]{"Malayalam", new String[]{"mlm2", "mlym"}}, new Object[]{"Mandaic", new String[]{"mand"}}, new Object[]{"Manichaean", new String[]{"mani"}}, new Object[]{"Marchen", new String[]{"marc"}}, new Object[]{"Meetei_Mayek", new String[]{"mtei"}}, new Object[]{"Mende_Kikakui", new String[]{"mend"}}, new Object[]{"Meroitic_Cursive", new String[]{"merc"}}, new Object[]{"Meroitic_Hieroglyphs", new String[]{"mero"}}, new Object[]{"Miao", new String[]{"plrd"}}, new Object[]{"Modi", new String[]{"modi"}}, new Object[]{"Mongolian", new String[]{"mong"}}, new Object[]{"Mro", new String[]{"mroo"}}, new Object[]{"Multani", new String[]{"mult"}}, new Object[]{"Myanmar", new String[]{"mym2", "mymr"}}, new Object[]{"Nabataean", new String[]{"nbat"}}, new Object[]{"Newa", new String[]{"newa"}}, new Object[]{"New_Tai_Lue", new String[]{"talu"}}, new Object[]{"Nko", new String[]{"nko "}}, new Object[]{"Ogham", new String[]{"ogam"}}, new Object[]{"Ol_Chiki", new String[]{"olck"}}, new Object[]{"Old_Italic", new String[]{"ital"}}, new Object[]{"Old_Hungarian", new String[]{"hung"}}, new Object[]{"Old_North_Arabian", new String[]{"narb"}}, new Object[]{"Old_Permic", new String[]{"perm"}}, new Object[]{"Old_Persian", new String[]{"xpeo"}}, new Object[]{"Old_South_Arabian", new String[]{"sarb"}}, new Object[]{"Old_Turkic", new String[]{"orkh"}}, new Object[]{"Oriya", new String[]{"ory2", "orya"}}, new Object[]{"Osage", new String[]{"osge"}}, new Object[]{"Osmanya", new String[]{"osma"}}, new Object[]{"Pahawh_Hmong", new String[]{"hmng"}}, new Object[]{"Palmyrene", new String[]{"palm"}}, new Object[]{"Pau_Cin_Hau", new String[]{"pauc"}}, new Object[]{"Phags_Pa", new String[]{"phag"}}, new Object[]{"Phoenician", new String[]{"phnx"}}, new Object[]{"Psalter_Pahlavi", new String[]{"phlp"}}, new Object[]{"Rejang", new String[]{"rjng"}}, new Object[]{"Runic", new String[]{"runr"}}, new Object[]{"Samaritan", new String[]{"samr"}}, new Object[]{"Saurashtra", new String[]{"saur"}}, new Object[]{"Sharada", new String[]{"shrd"}}, new Object[]{"Shavian", new String[]{"shaw"}}, new Object[]{"Siddham", new String[]{"sidd"}}, new Object[]{"SignWriting", new String[]{"sgnw"}}, new Object[]{"Sinhala", new String[]{"sinh"}}, new Object[]{"Sora_Sompeng", new String[]{"sora"}}, new Object[]{"Sundanese", new String[]{"sund"}}, new Object[]{"Syloti_Nagri", new String[]{"sylo"}}, new Object[]{"Syriac", new String[]{"syrc"}}, new Object[]{"Tagalog", new String[]{"tglg"}}, new Object[]{"Tagbanwa", new String[]{"tagb"}}, new Object[]{"Tai_Le", new String[]{"tale"}}, new Object[]{"Tai_Tham", new String[]{"lana"}}, new Object[]{"Tai_Viet", new String[]{"tavt"}}, new Object[]{"Takri", new String[]{"takr"}}, new Object[]{"Tamil", new String[]{"tml2", "taml"}}, new Object[]{"Tangut", new String[]{"tang"}}, new Object[]{"Telugu", new String[]{"tel2", "telu"}}, new Object[]{"Thaana", new String[]{"thaa"}}, new Object[]{"Thai", new String[]{"thai"}}, new Object[]{"Tibetan", new String[]{"tibt"}}, new Object[]{"Tifinagh", new String[]{"tfng"}}, new Object[]{"Tirhuta", new String[]{"tirh"}}, new Object[]{"Ugaritic", new String[]{"ugar"}}, new Object[]{"Unknown", new String[]{"DFLT"}}, new Object[]{"Vai", new String[]{"vai "}}, new Object[]{"Warang_Citi", new String[]{"wara"}}, new Object[]{"Yi", new String[]{"yi  "}}};
        for (int i15 = 0; i15 < 138; i15++) {
            Object[] objArr2 = objArr[i15];
            f182612a.put((String) objArr2[0], (String[]) objArr2[1]);
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                try {
                    bufferedInputStream = yo.b.c() ? new BufferedInputStream(yo.b.a("/com/tom_roush/fontbox/resources/unicode/Scripts.txt")) : new BufferedInputStream(d0.class.getResourceAsStream("/com/tom_roush/fontbox/resources/unicode/Scripts.txt"));
                    d(bufferedInputStream);
                    bufferedInputStream.close();
                } catch (IOException e15) {
                    c2.g("PdfBox-Android", "Could not parse Scripts.txt, mirroring char map will be empty: " + e15.getMessage());
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                }
            } catch (Throwable th4) {
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                        c2.g("PdfBox-Android", "Could not close Scripts.txt");
                    }
                }
                throw th4;
            }
        } catch (IOException unused2) {
            c2.g("PdfBox-Android", "Could not close Scripts.txt");
        }
    }

    private d0() {
    }

    private static void a(int i15) {
        if (i15 < 0 || i15 > 1114111) {
            throw new IllegalArgumentException("Invalid codepoint: " + i15);
        }
    }

    public static String[] b(int i15) {
        a(i15);
        return f182612a.get(c(i15));
    }

    private static String c(int i15) {
        a(i15);
        if (Character.getType(i15) == 0) {
            return "Unknown";
        }
        int iBinarySearch = Arrays.binarySearch(f182613b, i15);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return f182614c[iBinarySearch];
    }

    private static void d(InputStream inputStream) throws IOException {
        TreeMap treeMap = new TreeMap(new a());
        LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream));
        int[] iArr = {PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail};
        String str = null;
        while (true) {
            String line = lineNumberReader.readLine();
            if (line == null) {
                break;
            }
            int iIndexOf = line.indexOf(35);
            if (iIndexOf != -1) {
                line = line.substring(0, iIndexOf);
            }
            if (line.length() >= 2) {
                StringTokenizer stringTokenizer = new StringTokenizer(line, ";");
                if (stringTokenizer.countTokens() >= 2) {
                    String strTrim = stringTokenizer.nextToken().trim();
                    String strTrim2 = stringTokenizer.nextToken().trim();
                    int[] iArr2 = new int[2];
                    int iIndexOf2 = strTrim.indexOf("..");
                    if (iIndexOf2 == -1) {
                        int i15 = Integer.parseInt(strTrim, 16);
                        iArr2[1] = i15;
                        iArr2[0] = i15;
                    } else {
                        iArr2[0] = Integer.parseInt(strTrim.substring(0, iIndexOf2), 16);
                        iArr2[1] = Integer.parseInt(strTrim.substring(iIndexOf2 + 2), 16);
                    }
                    if (iArr2[0] == iArr[1] + 1 && strTrim2.equals(str)) {
                        iArr[1] = iArr2[1];
                    } else {
                        treeMap.put(iArr2, strTrim2);
                        str = strTrim2;
                        iArr = iArr2;
                    }
                }
            }
        }
        lineNumberReader.close();
        f182613b = new int[treeMap.size()];
        f182614c = new String[treeMap.size()];
        int i16 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            f182613b[i16] = ((int[]) entry.getKey())[0];
            f182614c[i16] = (String) entry.getValue();
            i16++;
        }
    }
}
