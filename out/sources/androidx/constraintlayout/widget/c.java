package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f11399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f11400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f11401c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f11402d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SparseArray<a> f11403e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SparseArray<d> f11404f = new SparseArray<>();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<b> f11406b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f11407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        d f11408d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f11407c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.P6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index == i.Q6) {
                    this.f11405a = typedArrayObtainStyledAttributes.getResourceId(index, this.f11405a);
                } else if (index == i.R6) {
                    this.f11407c = typedArrayObtainStyledAttributes.getResourceId(index, this.f11407c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f11407c);
                    context.getResources().getResourceName(this.f11407c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f11408d = dVar;
                        dVar.e(context, this.f11407c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f11406b.add(bVar);
        }

        public int b(float f15, float f16) {
            for (int i15 = 0; i15 < this.f11406b.size(); i15++) {
                if (this.f11406b.get(i15).a(f15, f16)) {
                    return i15;
                }
            }
            return -1;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f11409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f11410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f11411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f11412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f11413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        d f11414f;

        b(Context context, XmlPullParser xmlPullParser) {
            this.f11409a = Float.NaN;
            this.f11410b = Float.NaN;
            this.f11411c = Float.NaN;
            this.f11412d = Float.NaN;
            this.f11413e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f11610i7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index == i.f11619j7) {
                    this.f11413e = typedArrayObtainStyledAttributes.getResourceId(index, this.f11413e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f11413e);
                    context.getResources().getResourceName(this.f11413e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f11414f = dVar;
                        dVar.e(context, this.f11413e);
                    }
                } else if (index == i.f11628k7) {
                    this.f11412d = typedArrayObtainStyledAttributes.getDimension(index, this.f11412d);
                } else if (index == i.f11637l7) {
                    this.f11410b = typedArrayObtainStyledAttributes.getDimension(index, this.f11410b);
                } else if (index == i.f11646m7) {
                    this.f11411c = typedArrayObtainStyledAttributes.getDimension(index, this.f11411c);
                } else if (index == i.f11655n7) {
                    this.f11409a = typedArrayObtainStyledAttributes.getDimension(index, this.f11409a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f15, float f16) {
            if (!Float.isNaN(this.f11409a) && f15 < this.f11409a) {
                return false;
            }
            if (!Float.isNaN(this.f11410b) && f16 < this.f11410b) {
                return false;
            }
            if (Float.isNaN(this.f11411c) || f15 <= this.f11411c) {
                return Float.isNaN(this.f11412d) || f16 <= this.f11412d;
            }
            return false;
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i15) {
        this.f11399a = constraintLayout;
        a(context, i15);
    }

    private void a(Context context, int i15) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i15);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                a aVar2 = new a(context, xml);
                                this.f11403e.put(aVar2.f11405a, aVar2);
                                aVar = aVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xml);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e15) {
            c2.f("ConstraintLayoutStates", "Error parsing resource: " + i15, e15);
        } catch (XmlPullParserException e16) {
            c2.f("ConstraintLayoutStates", "Error parsing resource: " + i15, e16);
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i15 = 0; i15 < attributeCount; i15++) {
            String attributeName = xmlPullParser.getAttributeName(i15);
            String attributeValue = xmlPullParser.getAttributeValue(i15);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        c2.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.m(context, xmlPullParser);
                this.f11404f.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }

    public void d(int i15, float f15, float f16) {
        int iB;
        int i16 = this.f11401c;
        if (i16 != i15) {
            this.f11401c = i15;
            a aVar = this.f11403e.get(i15);
            int iB2 = aVar.b(f15, f16);
            d dVar = iB2 == -1 ? aVar.f11408d : aVar.f11406b.get(iB2).f11414f;
            if (iB2 != -1) {
                int i17 = aVar.f11406b.get(iB2).f11413e;
            }
            if (dVar == null) {
                return;
            }
            this.f11402d = iB2;
            dVar.c(this.f11399a);
            return;
        }
        a aVarValueAt = i15 == -1 ? this.f11403e.valueAt(0) : this.f11403e.get(i16);
        int i18 = this.f11402d;
        if ((i18 == -1 || !aVarValueAt.f11406b.get(i18).a(f15, f16)) && this.f11402d != (iB = aVarValueAt.b(f15, f16))) {
            d dVar2 = iB == -1 ? this.f11400b : aVarValueAt.f11406b.get(iB).f11414f;
            if (iB != -1) {
                int i19 = aVarValueAt.f11406b.get(iB).f11413e;
            }
            if (dVar2 == null) {
                return;
            }
            this.f11402d = iB;
            dVar2.c(this.f11399a);
        }
    }
}
