package w7;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i15 = 0; i15 < attributeCount; i15++) {
            if (xmlPullParser.getAttributeName(i15).equals(str)) {
                return xmlPullParser.getAttributeValue(i15);
            }
        }
        return null;
    }

    public static boolean b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        return d(xmlPullParser) && xmlPullParser.getName().equals(str);
    }
}
