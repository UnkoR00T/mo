package rd;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final sd.c.a f173220a = sd.c.a.a("x", "y");

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f173221a;

        static {
            int[] iArr = new int[sd.c.b.values().length];
            f173221a = iArr;
            try {
                iArr[sd.c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f173221a[sd.c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f173221a[sd.c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(sd.c cVar, float f15) {
        cVar.h();
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.y() != sd.c.b.END_ARRAY) {
            cVar.G0();
        }
        cVar.m();
        return new PointF(fNextDouble * f15, fNextDouble2 * f15);
    }

    private static PointF b(sd.c cVar, float f15) {
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.p()) {
            cVar.G0();
        }
        return new PointF(fNextDouble * f15, fNextDouble2 * f15);
    }

    private static PointF c(sd.c cVar, float f15) {
        cVar.Y();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (cVar.p()) {
            int iE = cVar.E(f173220a);
            if (iE == 0) {
                fG = g(cVar);
            } else if (iE != 1) {
                cVar.H();
                cVar.G0();
            } else {
                fG2 = g(cVar);
            }
        }
        cVar.h0();
        return new PointF(fG * f15, fG2 * f15);
    }

    static int d(sd.c cVar) {
        cVar.h();
        int iNextDouble = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (cVar.nextDouble() * 255.0d);
        while (cVar.p()) {
            cVar.G0();
        }
        cVar.m();
        return Color.argb(GF2Field.MASK, iNextDouble, iNextDouble2, iNextDouble3);
    }

    static PointF e(sd.c cVar, float f15) {
        int i15 = a.f173221a[cVar.y().ordinal()];
        if (i15 == 1) {
            return b(cVar, f15);
        }
        if (i15 == 2) {
            return a(cVar, f15);
        }
        if (i15 == 3) {
            return c(cVar, f15);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.y());
    }

    static List<PointF> f(sd.c cVar, float f15) {
        ArrayList arrayList = new ArrayList();
        cVar.h();
        while (cVar.y() == sd.c.b.BEGIN_ARRAY) {
            cVar.h();
            arrayList.add(e(cVar, f15));
            cVar.m();
        }
        cVar.m();
        return arrayList;
    }

    static float g(sd.c cVar) {
        sd.c.b bVarY = cVar.y();
        int i15 = a.f173221a[bVarY.ordinal()];
        if (i15 == 1) {
            return (float) cVar.nextDouble();
        }
        if (i15 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarY);
        }
        cVar.h();
        float fNextDouble = (float) cVar.nextDouble();
        while (cVar.p()) {
            cVar.G0();
        }
        cVar.m();
        return fNextDouble;
    }
}
