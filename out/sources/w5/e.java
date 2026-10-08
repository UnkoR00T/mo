package w5;

import CON.j0;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    static class a {
        static int a(TypedArray typedArray, int i15) {
            return typedArray.getType(i15);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d[] f210239a;

        public c(d[] dVarArr) {
            this.f210239a = dVarArr;
        }

        public d[] a() {
            return this.f210239a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f210240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f210241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f210242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f210243d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f210244e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f210245f;

        public d(String str, int i15, boolean z15, String str2, int i16, int i17) {
            this.f210240a = str;
            this.f210241b = i15;
            this.f210242c = z15;
            this.f210243d = str2;
            this.f210244e = i16;
            this.f210245f = i17;
        }

        public String a() {
            return this.f210240a;
        }

        public int b() {
            return this.f210245f;
        }

        public int c() {
            return this.f210244e;
        }

        public String d() {
            return this.f210243d;
        }

        public int e() {
            return this.f210241b;
        }

        public boolean f() {
            return this.f210242c;
        }
    }

    /* JADX INFO: renamed from: w5.e$e, reason: collision with other inner class name */
    public static final class C5528e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<f6.e> f210246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f210247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f210248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f210249d;

        public C5528e(List<f6.e> list, int i15, int i16, String str) {
            this.f210246a = list;
            this.f210248c = i15;
            this.f210247b = i16;
            this.f210249d = str;
        }

        public int a() {
            return this.f210248c;
        }

        public List<f6.e> b() {
            return this.f210246a;
        }

        public String c() {
            return this.f210249d;
        }

        public int d() {
            return this.f210247b;
        }
    }

    private static int a(TypedArray typedArray, int i15) {
        return a.a(typedArray, i15);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i15) {
        if (i15 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i15);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i16 = 0; i16 < typedArrayObtainTypedArray.length(); i16++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i16, 0);
                    if (resourceId != 0) {
                        arrayList.add(i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(i(resources.getStringArray(i15)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static f6.e d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List<List<byte[]>> list) throws Exception {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r5.g.B);
        try {
            String string = typedArrayObtainAttributes.getString(r5.g.C);
            String string2 = typedArrayObtainAttributes.getString(r5.g.D);
            String string3 = typedArrayObtainAttributes.getString(r5.g.E);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                h(xmlPullParser);
            }
            f6.e eVar = new f6.e(str, str2, string, list, string2, string3);
            j0.a(typedArrayObtainAttributes);
            return eVar;
        } catch (Throwable th4) {
            if (typedArrayObtainAttributes == null) {
                throw th4;
            }
            try {
                j0.a(typedArrayObtainAttributes);
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return f(xmlPullParser, resources);
        }
        h(xmlPullParser);
        return null;
    }

    private static b f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r5.g.f171844h);
        String string = typedArrayObtainAttributes.getString(r5.g.f171845i);
        String string2 = typedArrayObtainAttributes.getString(r5.g.f171850n);
        String string3 = typedArrayObtainAttributes.getString(r5.g.f171851o);
        String string4 = typedArrayObtainAttributes.getString(r5.g.f171847k);
        int resourceId = typedArrayObtainAttributes.getResourceId(r5.g.f171846j, 0);
        int integer = typedArrayObtainAttributes.getInteger(r5.g.f171848l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(r5.g.f171849m, 500);
        String string5 = typedArrayObtainAttributes.getString(r5.g.f171852p);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(g(xmlPullParser, resources));
                    } else {
                        h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        List<List<byte[]>> listC = c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(d(xmlPullParser, resources, string, string2, listC));
                } else {
                    h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new C5528e(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new f6.e(string, string2, string3, listC, null, null));
        if (string4 != null) {
            arrayList2.add(new f6.e(string, string2, string4, listC, null, null));
        }
        return new C5528e(arrayList2, integer, integer2, string5);
    }

    private static d g(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r5.g.f171853q);
        int i15 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(r5.g.f171862z) ? r5.g.f171862z : r5.g.f171855s, 400);
        boolean z15 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(r5.g.f171860x) ? r5.g.f171860x : r5.g.f171856t, 0);
        int i16 = typedArrayObtainAttributes.hasValue(r5.g.A) ? r5.g.A : r5.g.f171857u;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(r5.g.f171861y) ? r5.g.f171861y : r5.g.f171858v);
        int i17 = typedArrayObtainAttributes.getInt(i16, 0);
        int i18 = typedArrayObtainAttributes.hasValue(r5.g.f171859w) ? r5.g.f171859w : r5.g.f171854r;
        int resourceId = typedArrayObtainAttributes.getResourceId(i18, 0);
        String string2 = typedArrayObtainAttributes.getString(i18);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            h(xmlPullParser);
        }
        return new d(string2, i15, z15, string, i17, resourceId);
    }

    private static void h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i15 = 1;
        while (i15 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i15++;
            } else if (next == 3) {
                i15--;
            }
        }
    }

    private static List<byte[]> i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
