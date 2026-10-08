package r9;

import android.text.Layout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l9.i;
import l9.k;
import l9.m;
import l9.s;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import w7.j;
import w7.l;
import w7.o0;
import w7.t;
import w7.z0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f172371b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f172372c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f172373d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Pattern f172374e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Pattern f172375f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f172376g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f172377h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f172378i = new a(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f172379a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f172380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f172381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f172382c;

        a(float f15, int i15, int i16) {
            this.f172380a = f15;
            this.f172381b = i15;
            this.f172382c = i16;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f172383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f172384b;

        b(int i15, int i16) {
            this.f172383a = i15;
            this.f172384b = i16;
        }
    }

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f172379a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e15) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e15);
        }
    }

    private static g d(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment f(String str) {
        String strF = zj.c.f(str);
        strF.getClass();
        switch (strF) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static int g(XmlPullParser xmlPullParser, int i15) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i15;
        }
        Matcher matcher = f172377h.matcher(attributeValue);
        if (!matcher.matches()) {
            t.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i15;
        }
        boolean z15 = true;
        try {
            int i16 = Integer.parseInt((String) p.q(matcher.group(1)));
            int i17 = Integer.parseInt((String) p.q(matcher.group(2)));
            if (i16 == 0 || i17 == 0) {
                z15 = false;
            }
            p.i(z15, "Invalid cell resolution %s %s", i16, i17);
            return i17;
        } catch (NumberFormatException unused) {
            t.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i15;
        }
    }

    private static void h(String str, g gVar) throws m {
        Matcher matcher;
        String[] strArrZ0 = o0.Z0(str, "\\s+");
        if (strArrZ0.length == 1) {
            matcher = f172373d.matcher(str);
        } else {
            if (strArrZ0.length != 2) {
                throw new m("Invalid number of entries for fontSize: " + strArrZ0.length + ".");
            }
            matcher = f172373d.matcher(strArrZ0[1]);
            t.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new m("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) p.q(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                gVar.C(3);
                break;
            case "em":
                gVar.C(2);
                break;
            case "px":
                gVar.C(1);
                break;
            default:
                throw new m("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.B(Float.parseFloat((String) p.q(matcher.group(1))));
    }

    private static a i(XmlPullParser xmlPullParser) {
        float f15;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i15 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrZ0 = o0.Z0(attributeValue2, " ");
            p.e(strArrZ0.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f15 = Integer.parseInt(strArrZ0[0]) / Integer.parseInt(strArrZ0[1]);
        } else {
            f15 = 1.0f;
        }
        a aVar = f172378i;
        int i16 = aVar.f172381b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i16 = Integer.parseInt(attributeValue3);
        }
        int i17 = aVar.f172382c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i17 = Integer.parseInt(attributeValue4);
        }
        return new a(i15 * f15, i16, i17);
    }

    private static Map<String, g> j(XmlPullParser xmlPullParser, Map<String, g> map, int i15, b bVar, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (z0.e(xmlPullParser, "style")) {
                String strA = z0.a(xmlPullParser, "style");
                g gVarO = o(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : p(strA)) {
                        gVarO.a(map.get(str));
                    }
                }
                String strH = gVarO.h();
                if (strH != null) {
                    map.put(strH, gVarO);
                }
            } else if (z0.e(xmlPullParser, "region")) {
                e eVarM = m(xmlPullParser, i15, bVar, map);
                if (eVarM != null) {
                    map2.put(eVarM.f172385a, eVarM);
                }
            } else if (z0.e(xmlPullParser, "metadata")) {
                k(xmlPullParser, map3);
            }
        } while (!z0.c(xmlPullParser, "head"));
        return map;
    }

    private static void k(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (z0.e(xmlPullParser, "image") && (strA = z0.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!z0.c(xmlPullParser, "metadata"));
    }

    private static c l(XmlPullParser xmlPullParser, c cVar, Map<String, e> map, a aVar) throws m {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        g gVarO = o(xmlPullParser2, null);
        long jQ = -9223372036854775807L;
        long jQ2 = -9223372036854775807L;
        long jQ3 = -9223372036854775807L;
        String[] strArr = null;
        String str = "";
        int i15 = 0;
        while (i15 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i15);
            int i16 = attributeCount;
            String attributeValue = xmlPullParser2.getAttributeValue(i15);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i15++;
                    xmlPullParser2 = xmlPullParser;
                    attributeCount = i16;
                    break;
                case "dur":
                    jQ3 = q(attributeValue, aVar);
                    break;
                case "end":
                    jQ2 = q(attributeValue, aVar);
                    break;
                case "begin":
                    jQ = q(attributeValue, aVar);
                    break;
                case "style":
                    String[] strArrP = p(attributeValue);
                    if (strArrP.length > 0) {
                        strArr = strArrP;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i15++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i16;
        }
        if (cVar != null) {
            long j15 = cVar.f172361d;
            if (j15 != -9223372036854775807L) {
                if (jQ != -9223372036854775807L) {
                    jQ += j15;
                }
                if (jQ2 != -9223372036854775807L) {
                    jQ2 += j15;
                }
            }
        }
        long j16 = jQ;
        if (jQ2 == -9223372036854775807L) {
            if (jQ3 != -9223372036854775807L) {
                jQ2 = j16 + jQ3;
            } else if (cVar != null) {
                long j17 = cVar.f172362e;
                if (j17 != -9223372036854775807L) {
                    jQ2 = j17;
                }
            }
        }
        return c.c(xmlPullParser.getName(), j16, jQ2, gVarO, strArr, str, strSubstring, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x023d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static e m(XmlPullParser xmlPullParser, int i15, b bVar, Map<String, g> map) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f25;
        int i16;
        float f26;
        float f27;
        String strA;
        g gVar;
        String strA2;
        g gVar2;
        String strA3 = z0.a(xmlPullParser, "id");
        if (strA3 == null) {
            return null;
        }
        String strA4 = z0.a(xmlPullParser, "origin");
        if (strA4 == null && (strA2 = z0.a(xmlPullParser, "style")) != null && (gVar2 = map.get(strA2)) != null) {
            strA4 = gVar2.j();
        }
        int i17 = 2;
        if (strA4 != null) {
            Matcher matcher = f172375f.matcher(strA4);
            Matcher matcher2 = f172376g.matcher(strA4);
            if (matcher.matches()) {
                try {
                    f16 = Float.parseFloat((String) p.q(matcher.group(1))) / 100.0f;
                    f15 = Float.parseFloat((String) p.q(matcher.group(2))) / 100.0f;
                } catch (NumberFormatException unused) {
                    t.h("TtmlParser", "Ignoring region with malformed origin: " + strA4);
                    return null;
                }
            } else {
                if (!matcher2.matches()) {
                    t.h("TtmlParser", "Ignoring region with unsupported origin: " + strA4);
                    return null;
                }
                if (bVar == null) {
                    t.h("TtmlParser", "Ignoring region with missing tts:extent: " + strA4);
                    return null;
                }
                try {
                    int i18 = Integer.parseInt((String) p.q(matcher2.group(1)));
                    int i19 = Integer.parseInt((String) p.q(matcher2.group(2)));
                    float f28 = i18 / bVar.f172383a;
                    float f29 = i19 / bVar.f172384b;
                    f16 = f28;
                    f15 = f29;
                } catch (NumberFormatException unused2) {
                    t.h("TtmlParser", "Ignoring region with malformed origin: " + strA4);
                    return null;
                }
            }
        } else {
            f15 = 0.0f;
            f16 = 0.0f;
        }
        String strA5 = z0.a(xmlPullParser, "extent");
        if (strA5 == null && (strA = z0.a(xmlPullParser, "style")) != null && (gVar = map.get(strA)) != null) {
            strA5 = gVar.c();
        }
        if (strA5 != null) {
            Matcher matcher3 = f172375f.matcher(strA5);
            Matcher matcher4 = f172376g.matcher(strA5);
            f17 = 1.0f;
            if (matcher3.matches()) {
                try {
                    f18 = Float.parseFloat((String) p.q(matcher3.group(1))) / 100.0f;
                    f27 = Float.parseFloat((String) p.q(matcher3.group(2))) / 100.0f;
                } catch (NumberFormatException unused3) {
                    t.h("TtmlParser", "Ignoring region with malformed extent: " + strA4);
                    return null;
                }
            } else {
                if (!matcher4.matches()) {
                    t.h("TtmlParser", "Ignoring region with unsupported extent: " + strA4);
                    return null;
                }
                if (bVar == null) {
                    t.h("TtmlParser", "Ignoring region with missing tts:extent: " + strA4);
                    return null;
                }
                try {
                    int i25 = Integer.parseInt((String) p.q(matcher4.group(1)));
                    int i26 = Integer.parseInt((String) p.q(matcher4.group(2)));
                    float f35 = i25 / bVar.f172383a;
                    f27 = i26 / bVar.f172384b;
                    f18 = f35;
                } catch (NumberFormatException unused4) {
                    t.h("TtmlParser", "Ignoring region with malformed extent: " + strA4);
                    return null;
                }
            }
            f19 = f27;
        } else {
            f17 = 1.0f;
            f18 = 1.0f;
            f19 = 1.0f;
        }
        String strA6 = z0.a(xmlPullParser, "displayAlign");
        int i27 = 0;
        if (strA6 != null) {
            String strF = zj.c.f(strA6);
            strF.getClass();
            if (strF.equals("center")) {
                f26 = f15 + (f19 / 2.0f);
                i17 = 1;
            } else if (strF.equals("after")) {
                f26 = f15 + f19;
            } else {
                i15 = i15;
                i17 = 2;
                f25 = f15;
                i17 = 0;
            }
            f25 = f26;
        } else {
            i15 = i15;
            i17 = 2;
            f25 = f15;
            i17 = 0;
        }
        float f36 = f17 / i15;
        String strA7 = z0.a(xmlPullParser, "writingMode");
        if (strA7 != null) {
            String strF2 = zj.c.f(strA7);
            strF2.getClass();
            switch (strF2.hashCode()) {
                case 3694:
                    if (!strF2.equals("tb")) {
                        i27 = -1;
                    }
                    break;
                case 3553396:
                    i27 = !strF2.equals("tblr") ? -1 : 1;
                    break;
                case 3553576:
                    i27 = !strF2.equals("tbrl") ? -1 : i17;
                    break;
                default:
                    i27 = -1;
                    break;
            }
            switch (i27) {
                case 0:
                case 1:
                    i16 = i17;
                    break;
                case 2:
                    i16 = 1;
                    break;
                default:
                    i16 = Integer.MIN_VALUE;
                    break;
            }
        } else {
            i16 = Integer.MIN_VALUE;
        }
        return new e(strA3, f16, f25, 0, i17, f18, f19, 1, f36, i16);
    }

    private static float n(String str) {
        Matcher matcher = f172374e.matcher(str);
        if (!matcher.matches()) {
            t.h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) p.q(matcher.group(1)))));
        } catch (NumberFormatException e15) {
            t.i("TtmlParser", "Failed to parse shear: " + str, e15);
            return Float.MAX_VALUE;
        }
    }

    private static g o(XmlPullParser xmlPullParser, g gVar) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i15 = 0; i15 < attributeCount; i15++) {
            String attributeValue = xmlPullParser.getAttributeValue(i15);
            String attributeName = xmlPullParser.getAttributeName(i15);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    gVar = d(gVar).E("italic".equalsIgnoreCase(attributeValue));
                    break;
                case "extent":
                    gVar = d(gVar).y(attributeValue);
                    break;
                case "fontFamily":
                    gVar = d(gVar).A(attributeValue);
                    break;
                case "textAlign":
                    gVar = d(gVar).L(f(attributeValue));
                    break;
                case "origin":
                    gVar = d(gVar).H(attributeValue);
                    break;
                case "textDecoration":
                    String strF = zj.c.f(attributeValue);
                    strF.getClass();
                    switch (strF) {
                        case "nounderline":
                            gVar = d(gVar).O(false);
                            break;
                        case "underline":
                            gVar = d(gVar).O(true);
                            break;
                        case "nolinethrough":
                            gVar = d(gVar).F(false);
                            break;
                        case "linethrough":
                            gVar = d(gVar).F(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    gVar = d(gVar).x("bold".equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        gVar = d(gVar).D(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String strF2 = zj.c.f(attributeValue);
                    strF2.getClass();
                    switch (strF2) {
                        case "baseContainer":
                        case "base":
                            gVar = d(gVar).J(2);
                            break;
                        case "container":
                            gVar = d(gVar).J(1);
                            break;
                        case "delimiter":
                            gVar = d(gVar).J(4);
                            break;
                        case "textContainer":
                        case "text":
                            gVar = d(gVar).J(3);
                            break;
                    }
                    break;
                case "color":
                    gVar = d(gVar);
                    try {
                        gVar.z(j.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        t.h("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    gVar = d(gVar).K(n(attributeValue));
                    break;
                case "textCombine":
                    String strF3 = zj.c.f(attributeValue);
                    strF3.getClass();
                    if (!strF3.equals("all")) {
                        if (strF3.equals("none")) {
                            gVar = d(gVar).M(false);
                        }
                        break;
                    } else {
                        gVar = d(gVar).M(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        gVar = d(gVar);
                        h(attributeValue, gVar);
                        break;
                    } catch (m unused2) {
                        t.h("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    gVar = d(gVar).N(r9.b.a(attributeValue));
                    break;
                case "rubyPosition":
                    String strF4 = zj.c.f(attributeValue);
                    strF4.getClass();
                    if (!strF4.equals("before")) {
                        if (strF4.equals("after")) {
                            gVar = d(gVar).I(2);
                        }
                        break;
                    } else {
                        gVar = d(gVar).I(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    gVar = d(gVar);
                    try {
                        gVar.w(j.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        t.h("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    gVar = d(gVar).G(f(attributeValue));
                    break;
            }
        }
        return gVar;
    }

    private static String[] p(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : o0.Z0(strTrim, "\\s+");
    }

    private static long q(String str, a aVar) throws m {
        double d15;
        double d16;
        Matcher matcher = f172371b.matcher(str);
        if (matcher.matches()) {
            double d17 = (Long.parseLong((String) p.q(matcher.group(1))) * 3600) + (Long.parseLong((String) p.q(matcher.group(2))) * 60) + Long.parseLong((String) p.q(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d18 = d17 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d19 = d18 + (strGroup2 != null ? Long.parseLong(strGroup2) / aVar.f172380a : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d19 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) aVar.f172381b)) / ((double) aVar.f172380a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f172372c.matcher(str);
        if (!matcher2.matches()) {
            throw new m("Malformed time expression: " + str);
        }
        double d25 = Double.parseDouble((String) p.q(matcher2.group(1)));
        String str2 = (String) p.q(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d15 = aVar.f172380a;
                d25 /= d15;
                return (long) (d25 * 1000000.0d);
            case "h":
                d16 = 3600.0d;
                break;
            case "m":
                d16 = 60.0d;
                break;
            case "t":
                d15 = aVar.f172382c;
                d25 /= d15;
                return (long) (d25 * 1000000.0d);
            case "ms":
                d15 = 1000.0d;
                d25 /= d15;
                return (long) (d25 * 1000000.0d);
            default:
                return (long) (d25 * 1000000.0d);
        }
        d25 *= d16;
        return (long) (d25 * 1000000.0d);
    }

    private static b r(XmlPullParser xmlPullParser) {
        String strA = z0.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f172376g.matcher(strA);
        if (!matcher.matches()) {
            t.h("TtmlParser", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) p.q(matcher.group(1))), Integer.parseInt((String) p.q(matcher.group(2))));
        } catch (NumberFormatException unused) {
            t.h("TtmlParser", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // l9.s
    public k a(byte[] bArr, int i15, int i16) {
        char c15;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f172379a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            h hVar = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i15, i16), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i17 = 0;
            int iG = 15;
            a aVarI = f172378i;
            b bVarR = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i17 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVarI = i(xmlPullParserNewPullParser);
                            c15 = 15;
                            iG = g(xmlPullParserNewPullParser, 15);
                            bVarR = r(xmlPullParserNewPullParser);
                        } else {
                            c15 = 15;
                        }
                        a aVar = aVarI;
                        b bVar = bVarR;
                        int i18 = iG;
                        if (e(name)) {
                            if ("head".equals(name)) {
                                j(xmlPullParserNewPullParser, map, i18, bVar, map2, map3);
                            } else {
                                try {
                                    c cVarL = l(xmlPullParserNewPullParser, cVar, map2, aVar);
                                    arrayDeque.push(cVarL);
                                    if (cVar != null) {
                                        cVar.a(cVarL);
                                    }
                                } catch (m e15) {
                                    t.i("TtmlParser", "Suppressing parser error", e15);
                                    i17++;
                                }
                            }
                            iG = i18;
                            bVarR = bVar;
                            aVarI = aVar;
                        } else {
                            t.f("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i17++;
                        iG = i18;
                        bVarR = bVar;
                        aVarI = aVar;
                    } else {
                        c15 = 15;
                        if (eventType == 4) {
                            ((c) p.q(cVar)).a(c.d(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                hVar = new h((c) p.q((c) arrayDeque.peek()), map, map2, map3);
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (eventType == 2) {
                    i17++;
                } else if (eventType == 3) {
                    i17--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (k) p.q(hVar);
        } catch (IOException e16) {
            throw new IllegalStateException("Unexpected error when reading input.", e16);
        } catch (XmlPullParserException e17) {
            throw new IllegalStateException("Unable to decode source", e17);
        }
    }

    @Override // l9.s
    public void b(byte[] bArr, int i15, int i16, s.b bVar, l<l9.e> lVar) {
        i.c(a(bArr, i15, i16), bVar, lVar);
    }

    @Override // l9.s
    public int c() {
        return 1;
    }
}
