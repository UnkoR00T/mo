package lj;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f118618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f118619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[][] f118620c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a[] f118621d = new a[10];

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f118622a;

        a(b bVar) {
            this.f118622a = bVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f118623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f118624b;

        b(c cVar, float f15) {
            this.f118623a = cVar;
            this.f118624b = f15;
        }

        public int a(int i15) {
            c cVar = this.f118623a;
            if (cVar == c.PERCENT) {
                return (int) (this.f118624b * i15);
            }
            if (cVar == c.PIXELS) {
                return (int) this.f118624b;
            }
            return 0;
        }
    }

    public enum c {
        PERCENT,
        PIXELS
    }

    private void a(int[] iArr, a aVar) {
        int i15 = this.f118618a;
        if (i15 == 0 || iArr.length == 0) {
            this.f118619b = aVar;
        }
        if (i15 >= this.f118620c.length) {
            f(i15, i15 + 10);
        }
        int[][] iArr2 = this.f118620c;
        int i16 = this.f118618a;
        iArr2[i16] = iArr;
        this.f118621d[i16] = aVar;
        this.f118618a = i16 + 1;
    }

    public static r b(Context context, TypedArray typedArray, int i15) {
        int next;
        int resourceId = typedArray.getResourceId(i15, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                r rVar = new r();
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
                    rVar.h(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return rVar;
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
            return null;
        }
    }

    private b d(TypedArray typedArray, int i15, b bVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i15);
        if (typedValuePeekValue != null) {
            int i16 = typedValuePeekValue.type;
            if (i16 == 5) {
                return new b(c.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i16 == 6) {
                return new b(c.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return bVar;
    }

    private void f(int i15, int i16) {
        int[][] iArr = new int[i16][];
        System.arraycopy(this.f118620c, 0, iArr, 0, i15);
        this.f118620c = iArr;
        a[] aVarArr = new a[i16];
        System.arraycopy(this.f118621d, 0, aVarArr, 0, i15);
        this.f118621d = aVarArr;
    }

    private int g(int[] iArr) {
        int[][] iArr2 = this.f118620c;
        for (int i15 = 0; i15 < this.f118618a; i15++) {
            if (StateSet.stateSetMatches(iArr2[i15], iArr)) {
                return i15;
            }
        }
        return -1;
    }

    private void h(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ri.l.M4) : theme.obtainStyledAttributes(attributeSet, ri.l.M4, 0, 0);
                b bVarD = d(typedArrayObtainAttributes, ri.l.N4, null);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i15 = 0;
                for (int i16 = 0; i16 < attributeCount; i16++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i16);
                    if (attributeNameResource != ri.b.Y) {
                        int i17 = i15 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i16, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i15] = attributeNameResource;
                        i15 = i17;
                    }
                }
                a(StateSet.trimStateSet(iArr, i15), new a(bVarD));
            }
        }
    }

    public int c(int i15) {
        float fMax;
        int i16 = -i15;
        for (int i17 = 0; i17 < this.f118618a; i17++) {
            b bVar = this.f118621d[i17].f118622a;
            c cVar = bVar.f118623a;
            if (cVar == c.PIXELS) {
                fMax = Math.max(i16, bVar.f118624b);
            } else {
                if (cVar == c.PERCENT) {
                    fMax = Math.max(i16, i15 * bVar.f118624b);
                }
            }
            i16 = (int) fMax;
        }
        return i16;
    }

    public a e(int[] iArr) {
        int iG = g(iArr);
        if (iG < 0) {
            iG = g(StateSet.WILD_CARD);
        }
        return iG < 0 ? this.f118619b : this.f118621d[iG];
    }
}
