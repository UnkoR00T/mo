package lj;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f118598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f118599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[][] f118600c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d[] f118601d = new d[10];

    private void a(int[] iArr, d dVar) {
        int i15 = this.f118598a;
        if (i15 == 0 || iArr.length == 0) {
            this.f118599b = dVar;
        }
        if (i15 >= this.f118600c.length) {
            f(i15, i15 + 10);
        }
        int[][] iArr2 = this.f118600c;
        int i16 = this.f118598a;
        iArr2[i16] = iArr;
        this.f118601d[i16] = dVar;
        this.f118598a = i16 + 1;
    }

    public static p b(Context context, TypedArray typedArray, int i15, d dVar) {
        int next;
        int resourceId = typedArray.getResourceId(i15, 0);
        if (resourceId != 0 && context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            try {
                XmlResourceParser xml = context.getResources().getXml(resourceId);
                try {
                    p pVar = new p();
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (xml.getName().equals("selector")) {
                        pVar.i(context, xml, attributeSetAsAttributeSet, context.getTheme());
                    }
                    xml.close();
                    return pVar;
                } catch (Throwable th4) {
                    if (xml != null) {
                        try {
                            xml.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                return c(dVar);
            }
        }
        return c(l.m(typedArray, i15, dVar));
    }

    public static p c(d dVar) {
        p pVar = new p();
        pVar.a(StateSet.WILD_CARD, dVar);
        return pVar;
    }

    private void f(int i15, int i16) {
        int[][] iArr = new int[i16][];
        System.arraycopy(this.f118600c, 0, iArr, 0, i15);
        this.f118600c = iArr;
        d[] dVarArr = new d[i16];
        System.arraycopy(this.f118601d, 0, dVarArr, 0, i15);
        this.f118601d = dVarArr;
    }

    private int g(int[] iArr) {
        int[][] iArr2 = this.f118600c;
        for (int i15 = 0; i15 < this.f118598a; i15++) {
            if (StateSet.stateSetMatches(iArr2[i15], iArr)) {
                return i15;
            }
        }
        return -1;
    }

    private void i(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ri.l.Y3) : theme.obtainStyledAttributes(attributeSet, ri.l.Y3, 0, 0);
                d dVarM = l.m(typedArrayObtainAttributes, ri.l.f174130e4, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i15 = 0;
                for (int i16 = 0; i16 < attributeCount; i16++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i16);
                    if (attributeNameResource != ri.b.f173913h) {
                        int i17 = i15 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i16, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i15] = attributeNameResource;
                        i15 = i17;
                    }
                }
                a(StateSet.trimStateSet(iArr, i15), dVarM);
            }
        }
    }

    public d d(int[] iArr) {
        int iG = g(iArr);
        if (iG < 0) {
            iG = g(StateSet.WILD_CARD);
        }
        return iG < 0 ? this.f118599b : this.f118601d[iG];
    }

    public d e() {
        return this.f118599b;
    }

    public boolean h() {
        return this.f118598a > 1;
    }
}
