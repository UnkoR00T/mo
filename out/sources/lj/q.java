package lj;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f118602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final l f118603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[][] f118604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final l[] f118605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final p f118606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final p f118607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final p f118608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final p f118609h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f118610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l f118611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[][] f118612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private l[] f118613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p f118614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p f118615f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p f118616g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private p f118617h;

        private boolean k(int i15, int i16) {
            return (i16 | i15) == i15;
        }

        private void l(int i15, int i16) {
            int[][] iArr = new int[i16][];
            System.arraycopy(this.f118612c, 0, iArr, 0, i15);
            this.f118612c = iArr;
            l[] lVarArr = new l[i16];
            System.arraycopy(this.f118613d, 0, lVarArr, 0, i15);
            this.f118613d = lVarArr;
        }

        private void m() {
            this.f118611b = new l();
            this.f118612c = new int[10][];
            this.f118613d = new l[10];
        }

        public b i(int[] iArr, l lVar) {
            int i15 = this.f118610a;
            if (i15 == 0 || iArr.length == 0) {
                this.f118611b = lVar;
            }
            if (i15 >= this.f118612c.length) {
                l(i15, i15 + 10);
            }
            int[][] iArr2 = this.f118612c;
            int i16 = this.f118610a;
            iArr2[i16] = iArr;
            this.f118613d[i16] = lVar;
            this.f118610a = i16 + 1;
            return this;
        }

        public q j() {
            if (this.f118610a == 0) {
                return null;
            }
            return new q(this);
        }

        public b n(p pVar, int i15) {
            if (k(i15, 1)) {
                this.f118614e = pVar;
            }
            if (k(i15, 2)) {
                this.f118615f = pVar;
            }
            if (k(i15, 4)) {
                this.f118616g = pVar;
            }
            if (k(i15, 8)) {
                this.f118617h = pVar;
            }
            return this;
        }

        public b(q qVar) {
            int i15 = qVar.f118602a;
            this.f118610a = i15;
            this.f118611b = qVar.f118603b;
            int[][] iArr = qVar.f118604c;
            int[][] iArr2 = new int[iArr.length][];
            this.f118612c = iArr2;
            this.f118613d = new l[qVar.f118605d.length];
            System.arraycopy(iArr, 0, iArr2, 0, i15);
            System.arraycopy(qVar.f118605d, 0, this.f118613d, 0, this.f118610a);
            this.f118614e = qVar.f118606e;
            this.f118615f = qVar.f118607f;
            this.f118616g = qVar.f118608g;
            this.f118617h = qVar.f118609h;
        }

        public b(l lVar) {
            m();
            i(StateSet.WILD_CARD, lVar);
        }

        private b(Context context, int i15) {
            int next;
            m();
            try {
                XmlResourceParser xml = context.getResources().getXml(i15);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            q.g(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
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
                m();
            }
        }
    }

    public static q b(Context context, TypedArray typedArray, int i15) {
        int resourceId = typedArray.getResourceId(i15, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new b(context, resourceId).j();
        }
        return null;
    }

    private int e(int[] iArr) {
        int[][] iArr2 = this.f118604c;
        for (int i15 = 0; i15 < this.f118602a; i15++) {
            if (StateSet.stateSetMatches(iArr2[i15], iArr)) {
                return i15;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(b bVar, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ri.l.f174209o3) : theme.obtainStyledAttributes(attributeSet, ri.l.f174209o3, 0, 0);
                l lVarM = l.b(context, typedArrayObtainAttributes.getResourceId(ri.l.f174217p3, 0), typedArrayObtainAttributes.getResourceId(ri.l.f174225q3, 0)).m();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i15 = 0;
                for (int i16 = 0; i16 < attributeCount; i16++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i16);
                    if (attributeNameResource != ri.b.J && attributeNameResource != ri.b.K) {
                        int i17 = i15 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i16, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i15] = attributeNameResource;
                        i15 = i17;
                    }
                }
                bVar.i(StateSet.trimStateSet(iArr, i15), lVarM);
            }
        }
    }

    public static int h(int i15) {
        int i16 = i15 & 5;
        return ((i15 & 10) >> 1) | (i16 << 1);
    }

    public l c(boolean z15) {
        if (!z15 || (this.f118606e == null && this.f118607f == null && this.f118608g == null && this.f118609h == null)) {
            return this.f118603b;
        }
        l.b bVarW = this.f118603b.w();
        p pVar = this.f118606e;
        if (pVar != null) {
            bVarW.D(pVar.e());
        }
        p pVar2 = this.f118607f;
        if (pVar2 != null) {
            bVarW.H(pVar2.e());
        }
        p pVar3 = this.f118608g;
        if (pVar3 != null) {
            bVarW.v(pVar3.e());
        }
        p pVar4 = this.f118609h;
        if (pVar4 != null) {
            bVarW.z(pVar4.e());
        }
        return bVarW.m();
    }

    protected l d(int[] iArr) {
        int iE = e(iArr);
        if (iE < 0) {
            iE = e(StateSet.WILD_CARD);
        }
        if (this.f118606e == null && this.f118607f == null && this.f118608g == null && this.f118609h == null) {
            return this.f118605d[iE];
        }
        l.b bVarW = this.f118605d[iE].w();
        p pVar = this.f118606e;
        if (pVar != null) {
            bVarW.D(pVar.d(iArr));
        }
        p pVar2 = this.f118607f;
        if (pVar2 != null) {
            bVarW.H(pVar2.d(iArr));
        }
        p pVar3 = this.f118608g;
        if (pVar3 != null) {
            bVarW.v(pVar3.d(iArr));
        }
        p pVar4 = this.f118609h;
        if (pVar4 != null) {
            bVarW.z(pVar4.d(iArr));
        }
        return bVarW.m();
    }

    public boolean f() {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        return this.f118602a > 1 || ((pVar = this.f118606e) != null && pVar.h()) || (((pVar2 = this.f118607f) != null && pVar2.h()) || (((pVar3 = this.f118608g) != null && pVar3.h()) || ((pVar4 = this.f118609h) != null && pVar4.h())));
    }

    public b i() {
        return new b(this);
    }

    private q(b bVar) {
        this.f118602a = bVar.f118610a;
        this.f118603b = bVar.f118611b;
        this.f118604c = bVar.f118612c;
        this.f118605d = bVar.f118613d;
        this.f118606e = bVar.f118614e;
        this.f118607f = bVar.f118615f;
        this.f118608g = bVar.f118616g;
        this.f118609h = bVar.f118617h;
    }
}
