package i2;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0015\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0010BY\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0007\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Li2/c;", "", "", "n", "aw", "nbb", "ncb", "c", "nc", "", "rgbD", "fl", "flRoot", "z", "<init>", "(FFFFFF[FFFF)V", "a", "F", "f", "()F", "b", "g", "d", "i", "e", "h", "[F", "j", "()[F", "k", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f88374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final c f88375m;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float n;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float aw;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float nbb;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float ncb;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float c;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float nc;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float[] rgbD;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float fl;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float flRoot;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float z;

    /* JADX INFO: renamed from: i2.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Li2/c$a;", "", "<init>", "()V", "", "whitepoint", "", "adaptingLuminance", "backgroundLstar", "surround", "", "discountingIlluminant", "Li2/c;", "b", "([FFFFZ)Li2/c;", "Default", "Li2/c;", "a", "()Li2/c;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final c a() {
            return c.f88375m;
        }

        public final c b(float[] whitepoint, float adaptingLuminance, float backgroundLstar, float surround, boolean discountingIlluminant) {
            b bVar = b.f88366a;
            float[][] fArrI = bVar.i();
            float f15 = whitepoint[0];
            float[] fArr = fArrI[0];
            float f16 = fArr[0] * f15;
            float f17 = whitepoint[1];
            float f18 = f16 + (fArr[1] * f17);
            float f19 = whitepoint[2];
            float f25 = f18 + (fArr[2] * f19);
            float[] fArr2 = fArrI[1];
            float f26 = (fArr2[0] * f15) + (fArr2[1] * f17) + (fArr2[2] * f19);
            float[] fArr3 = fArrI[2];
            float f27 = (f15 * fArr3[0]) + (f17 * fArr3[1]) + (f19 * fArr3[2]);
            float f28 = (surround / 10.0f) + 0.8f;
            float fB = ((double) f28) >= 0.9d ? d.b(0.59f, 0.69f, (f28 - 0.9f) * 10.0f) : d.b(0.525f, 0.59f, (f28 - 0.8f) * 10.0f);
            float fExp = discountingIlluminant ? 1.0f : (1.0f - (((float) Math.exp(((-adaptingLuminance) - 42.0f) / 92.0f)) * 0.2777778f)) * f28;
            double d15 = fExp;
            if (d15 > 1.0d) {
                fExp = 1.0f;
            } else if (d15 < 0.0d) {
                fExp = 0.0f;
            }
            float[] fArr4 = {(((100.0f / f25) * fExp) + 1.0f) - fExp, (((100.0f / f26) * fExp) + 1.0f) - fExp, (((100.0f / f27) * fExp) + 1.0f) - fExp};
            float f29 = 1.0f / ((5.0f * adaptingLuminance) + 1.0f);
            float f35 = f29 * f29 * f29 * f29;
            float f36 = 1.0f - f35;
            float fCbrt = (f35 * adaptingLuminance) + (0.1f * f36 * f36 * ((float) Math.cbrt(((double) adaptingLuminance) * 5.0d)));
            float fQ = ((float) bVar.q(backgroundLstar)) / whitepoint[1];
            double d16 = fQ;
            float fSqrt = ((float) Math.sqrt(d16)) + 1.48f;
            float fPow = 0.725f / ((float) Math.pow(d16, 0.2f));
            double d17 = 0.42f;
            float[] fArr5 = {(float) Math.pow(((fArr4[0] * fCbrt) * f25) / 100.0f, d17), (float) Math.pow(((fArr4[1] * fCbrt) * f26) / 100.0f, d17), (float) Math.pow(((fArr4[2] * fCbrt) * f27) / 100.0f, d17)};
            float f37 = fArr5[0];
            float f38 = (f37 * 400.0f) / (f37 + 27.13f);
            float f39 = fArr5[1];
            float f45 = (f39 * 400.0f) / (f39 + 27.13f);
            float f46 = fArr5[2];
            float[] fArr6 = {f38, f45, (400.0f * f46) / (f46 + 27.13f)};
            return new c(fQ, ((fArr6[0] * 2.0f) + fArr6[1] + (fArr6[2] * 0.05f)) * fPow, fPow, fPow, fB, f28, fArr4, fCbrt, (float) Math.pow(fCbrt, 0.25f), fSqrt, null);
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f88374l = 8;
        b bVar = b.f88366a;
        f88375m = companion.b(bVar.h(), (float) ((bVar.q(50.0d) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    public /* synthetic */ c(float f15, float f16, float f17, float f18, float f19, float f25, float[] fArr, float f26, float f27, float f28, k kVar) {
        this(f15, f16, f17, f18, f19, f25, fArr, f26, f27, f28);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getAw() {
        return this.aw;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getFl() {
        return this.fl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getFlRoot() {
        return this.flRoot;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getN() {
        return this.n;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getNbb() {
        return this.nbb;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getNc() {
        return this.nc;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getNcb() {
        return this.ncb;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float[] getRgbD() {
        return this.rgbD;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getZ() {
        return this.z;
    }

    private c(float f15, float f16, float f17, float f18, float f19, float f25, float[] fArr, float f26, float f27, float f28) {
        this.n = f15;
        this.aw = f16;
        this.nbb = f17;
        this.ncb = f18;
        this.c = f19;
        this.nc = f25;
        this.rgbD = fArr;
        this.fl = f26;
        this.flRoot = f27;
        this.z = f28;
    }
}
