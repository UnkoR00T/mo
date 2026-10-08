package w8;

import ak.n0;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import t7.x;
import w7.t;
import w7.z0;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f210899a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f210900b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f210901c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : f210899a) {
            if (str.contains(str2 + "=\"1\"")) {
                return true;
            }
        }
        return false;
    }

    public static c b(String str) {
        try {
            return c(str);
        } catch (NumberFormatException | XmlPullParserException | x unused) {
            t.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static c c(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!z0.e(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw x.a("Couldn't find xmp metadata", null);
        }
        n0<c.a> n0VarC = n0.C();
        long jF = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (z0.e(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!e(xmlPullParserNewPullParser)) {
                    return null;
                }
                jF = f(xmlPullParserNewPullParser);
                n0VarC = d(xmlPullParserNewPullParser);
            } else if (z0.e(xmlPullParserNewPullParser, "Container:Directory")) {
                n0VarC = g(xmlPullParserNewPullParser, "Container", "Item");
            } else if (z0.e(xmlPullParserNewPullParser, "GContainer:Directory")) {
                n0VarC = g(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!z0.c(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (n0VarC.isEmpty()) {
            return null;
        }
        return new c(jF, n0VarC);
    }

    private static n0<c.a> d(XmlPullParser xmlPullParser) {
        for (String str : f210901c) {
            String strA = z0.a(xmlPullParser, str);
            if (strA != null) {
                return n0.F(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return n0.C();
    }

    private static boolean e(XmlPullParser xmlPullParser) {
        for (String str : f210899a) {
            String strA = z0.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    private static long f(XmlPullParser xmlPullParser) {
        for (String str : f210900b) {
            String strA = z0.a(xmlPullParser, str);
            if (strA != null) {
                long j15 = Long.parseLong(strA);
                if (j15 == -1) {
                    return -9223372036854775807L;
                }
                return j15;
            }
        }
        return -9223372036854775807L;
    }

    private static n0<c.a> g(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        n0.a aVarS = n0.s();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (z0.e(xmlPullParser, str3)) {
                String strA = z0.a(xmlPullParser, str2 + ":Mime");
                String strA2 = z0.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = z0.a(xmlPullParser, str2 + ":Length");
                String strA4 = z0.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return n0.C();
                }
                aVarS.a(new c.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!z0.c(xmlPullParser, str4));
        return aVarS.k();
    }
}
