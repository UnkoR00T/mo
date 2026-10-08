package o3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000e\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001aO\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aO\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a?\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0016\u001a?\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0016\u001a\u001f\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u001f\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\u0014\u0010 \u001a\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010&\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010(\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b(\u0010'\u001a\u001f\u0010!\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010'\u001a'\u0010\u0018\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\u0018\u0010,¨\u0006-"}, d2 = {"Lo3/c;", "source", "destination", "Lo3/r;", "intent", "Lo3/l;", "j", "(Lo3/c;Lo3/c;I)Lo3/l;", "h", "Lo3/i0;", "whitePoint", "Lo3/a;", "adaptation", "c", "(Lo3/c;Lo3/i0;Lo3/a;)Lo3/c;", "", "x", "a", "b", "d", "g", "o", "(DDDDDD)D", "q", "e", "f", "p", "(DDDDDDDD)D", "r", "", "(Lo3/i0;Lo3/i0;)Z", "", "([F[F)Z", "m", "k", "([F)[F", "lhs", "rhs", "l", "([F[F)[F", "n", "matrix", "srcWhitePoint", "dstWhitePoint", "([F[F[F)[F", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final double a(double d15, double d16, double d17, double d18, double d19, double d25) {
        return Math.copySign(o(d15 < 0.0d ? -d15 : d15, d16, d17, d18, d19, d25), d15);
    }

    public static final double b(double d15, double d16, double d17, double d18, double d19, double d25) {
        return Math.copySign(q(d15 < 0.0d ? -d15 : d15, d16, d17, d18, d19, d25), d15);
    }

    public static final c c(c cVar, WhitePoint whitePoint, a aVar) {
        if (b.e(cVar.getModel(), b.INSTANCE.b())) {
            f0 f0Var = (f0) cVar;
            if (!f(f0Var.getWhitePoint(), whitePoint)) {
                return new f0(f0Var, l(e(aVar.getTransform(), f0Var.getWhitePoint().c(), whitePoint.c()), f0Var.getTransform()), whitePoint);
            }
        }
        return cVar;
    }

    public static /* synthetic */ c d(c cVar, WhitePoint whitePoint, a aVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar = a.INSTANCE.a();
        }
        return c(cVar, whitePoint, aVar);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrN = n(fArr, fArr2);
        float[] fArrN2 = n(fArr, fArr3);
        return l(k(fArr), m(new float[]{fArrN2[0] / fArrN[0], fArrN2[1] / fArrN[1], fArrN2[2] / fArrN[2]}, fArr));
    }

    public static final boolean f(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            if (Float.compare(fArr[i15], fArr2[i15]) != 0 && Math.abs(fArr[i15] - fArr2[i15]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final l h(c cVar, c cVar2, int i15) {
        int iD = cVar.getId();
        int iD2 = cVar2.getId();
        if ((iD | iD2) < 0) {
            return j(cVar, cVar2, i15);
        }
        r0.j0<l> j0VarA = m.a();
        int i16 = iD | (iD2 << 6) | (i15 << 12);
        l lVarB = j0VarA.b(i16);
        if (lVarB == null) {
            lVarB = j(cVar, cVar2, i15);
            j0VarA.r(i16, lVarB);
        }
        return lVarB;
    }

    public static /* synthetic */ l i(c cVar, c cVar2, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            cVar2 = k.f141750a.G();
        }
        if ((i16 & 2) != 0) {
            i15 = r.INSTANCE.b();
        }
        return h(cVar, cVar2, i15);
    }

    private static final l j(c cVar, c cVar2, int i15) {
        if (cVar == cVar2) {
            return l.INSTANCE.c(cVar);
        }
        long jG = cVar.getModel();
        b.Companion companion = b.INSTANCE;
        fr.k kVar = null;
        return (b.e(jG, companion.b()) && b.e(cVar2.getModel(), companion.b())) ? new l.b((f0) cVar, (f0) cVar2, i15, kVar) : new l(cVar, cVar2, i15, kVar);
    }

    public static final float[] k(float[] fArr) {
        float f15 = fArr[0];
        float f16 = fArr[3];
        float f17 = fArr[6];
        float f18 = fArr[1];
        float f19 = fArr[4];
        float f25 = fArr[7];
        float f26 = fArr[2];
        float f27 = fArr[5];
        float f28 = fArr[8];
        float f29 = (f19 * f28) - (f25 * f27);
        float f35 = (f25 * f26) - (f18 * f28);
        float f36 = (f18 * f27) - (f19 * f26);
        float f37 = (f15 * f29) + (f16 * f35) + (f17 * f36);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f29 / f37;
        fArr2[1] = f35 / f37;
        fArr2[2] = f36 / f37;
        fArr2[3] = ((f17 * f27) - (f16 * f28)) / f37;
        fArr2[4] = ((f28 * f15) - (f17 * f26)) / f37;
        fArr2[5] = ((f26 * f16) - (f27 * f15)) / f37;
        fArr2[6] = ((f16 * f25) - (f17 * f19)) / f37;
        fArr2[7] = ((f17 * f18) - (f25 * f15)) / f37;
        fArr2[8] = ((f15 * f19) - (f16 * f18)) / f37;
        return fArr2;
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f15 = fArr[0] * fArr2[0];
        float f16 = fArr[3];
        float f17 = fArr2[1];
        float f18 = fArr[6];
        float f19 = fArr2[2];
        fArr3[0] = f15 + (f16 * f17) + (f18 * f19);
        float f25 = fArr[1];
        float f26 = fArr2[0];
        float f27 = fArr[4];
        float f28 = fArr[7];
        fArr3[1] = (f25 * f26) + (f17 * f27) + (f28 * f19);
        float f29 = fArr[2] * f26;
        float f35 = fArr[5];
        float f36 = f29 + (fArr2[1] * f35);
        float f37 = fArr[8];
        fArr3[2] = f36 + (f19 * f37);
        float f38 = fArr[0];
        float f39 = fArr2[3] * f38;
        float f45 = fArr2[4];
        float f46 = f39 + (f16 * f45);
        float f47 = fArr2[5];
        fArr3[3] = f46 + (f18 * f47);
        float f48 = fArr[1];
        float f49 = fArr2[3];
        fArr3[4] = (f48 * f49) + (f27 * f45) + (f28 * f47);
        float f55 = fArr[2];
        fArr3[5] = (f49 * f55) + (f35 * fArr2[4]) + (f47 * f37);
        float f56 = f38 * fArr2[6];
        float f57 = fArr[3];
        float f58 = fArr2[7];
        float f59 = f56 + (f57 * f58);
        float f65 = fArr2[8];
        fArr3[6] = f59 + (f18 * f65);
        float f66 = fArr2[6];
        fArr3[7] = (f48 * f66) + (fArr[4] * f58) + (f28 * f65);
        fArr3[8] = (f55 * f66) + (fArr[5] * fArr2[7]) + (f37 * f65);
        return fArr3;
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f15 = fArr[0];
        float f16 = fArr2[0] * f15;
        float f17 = fArr[1];
        float f18 = fArr2[1] * f17;
        float f19 = fArr[2];
        return new float[]{f16, f18, fArr2[2] * f19, fArr2[3] * f15, fArr2[4] * f17, fArr2[5] * f19, f15 * fArr2[6], f17 * fArr2[7], f19 * fArr2[8]};
    }

    public static final float[] n(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f15 = fArr2[0];
        float f16 = fArr2[1];
        float f17 = fArr2[2];
        fArr2[0] = (fArr[0] * f15) + (fArr[3] * f16) + (fArr[6] * f17);
        fArr2[1] = (fArr[1] * f15) + (fArr[4] * f16) + (fArr[7] * f17);
        fArr2[2] = (fArr[2] * f15) + (fArr[5] * f16) + (fArr[8] * f17);
        return fArr2;
    }

    public static final double o(double d15, double d16, double d17, double d18, double d19, double d25) {
        return d15 >= d19 * d18 ? (Math.pow(d15, 1.0d / d25) - d17) / d16 : d15 / d18;
    }

    public static final double p(double d15, double d16, double d17, double d18, double d19, double d25, double d26, double d27) {
        return d15 >= d19 * d18 ? (Math.pow(d15 - d25, 1.0d / d27) - d17) / d16 : (d15 - d26) / d18;
    }

    public static final double q(double d15, double d16, double d17, double d18, double d19, double d25) {
        return d15 >= d19 ? Math.pow((d16 * d15) + d17, d25) : d18 * d15;
    }

    public static final double r(double d15, double d16, double d17, double d18, double d19, double d25, double d26, double d27) {
        return d15 >= d19 ? Math.pow((d16 * d15) + d17, d27) + d25 : (d18 * d15) + d26;
    }
}
