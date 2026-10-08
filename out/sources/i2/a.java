package i2;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001\u000eBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019¨\u0006&"}, d2 = {"Li2/a;", "", "", "hue", "chroma", "j", "m", "s", "jstar", "astar", "bstar", "<init>", "(FFFFFFFF)V", "other", "a", "(Li2/a;)F", "", "f", "()I", "Li2/c;", "frame", "e", "(Li2/c;)I", "F", "c", "()F", "b", "d", "getM", "getS", "getJstar", "setJstar", "(F)V", "g", "getAstar", "h", "getBstar", "i", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f88357j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float hue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float chroma;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float j;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float m;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float s;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float jstar;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float astar;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float bstar;

    /* JADX INFO: renamed from: i2.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ%\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"Li2/a$a;", "", "<init>", "()V", "", "argb", "Li2/c;", "frame", "Li2/a;", "c", "(ILi2/c;)Li2/a;", "", "j", "h", "d", "(FFF)Li2/a;", "e", "(FFFLi2/c;)Li2/a;", "hue", "chroma", "lstar", "g", "(FFFLi2/c;)I", "a", "f", "(FFF)I", "b", "(I)Li2/a;", "DL_MAX", "F", "DE_MAX", "CHROMA_SEARCH_ENDPOINT", "LIGHTNESS_SEARCH_ENDPOINT", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final a a(float hue, float chroma, float lstar) {
            float f15 = 100.0f;
            float f16 = 1000.0f;
            float f17 = 0.0f;
            a aVar = null;
            float f18 = 1000.0f;
            while (Math.abs(f17 - f15) > 0.009999999776482582d) {
                float f19 = ((f15 - f17) / 2) + f17;
                int iF = d(f19, chroma, hue).f();
                float fL = b.f88366a.l(iF);
                float fAbs = (float) Math.abs(lstar - fL);
                if (fAbs < 0.2f) {
                    a aVarB = b(iF);
                    float fA = aVarB.a(d(aVarB.getJ(), aVarB.getChroma(), hue));
                    if (fA <= 1.0f) {
                        aVar = aVarB;
                        f16 = fAbs;
                        f18 = fA;
                    }
                }
                if (f16 == 0.0f && f18 == 0.0f) {
                    return aVar;
                }
                if (fL < lstar) {
                    f17 = f19;
                } else {
                    f15 = f19;
                }
            }
            return aVar;
        }

        private final a c(int argb, c frame) {
            b bVar = b.f88366a;
            float[] fArrO = bVar.o(argb);
            float[][] fArrI = bVar.i();
            float f15 = fArrO[0];
            float[] fArr = fArrI[0];
            float f16 = fArr[0] * f15;
            float f17 = fArrO[1];
            float f18 = f16 + (fArr[1] * f17);
            float f19 = fArrO[2];
            float f25 = f18 + (fArr[2] * f19);
            float[] fArr2 = fArrI[1];
            float f26 = (fArr2[0] * f15) + (fArr2[1] * f17) + (fArr2[2] * f19);
            float[] fArr3 = fArrI[2];
            float f27 = (f15 * fArr3[0]) + (f17 * fArr3[1]) + (f19 * fArr3[2]);
            float f28 = frame.getRgbD()[0] * f25;
            float f29 = frame.getRgbD()[1] * f26;
            float f35 = frame.getRgbD()[2] * f27;
            double d15 = 0.42f;
            float fPow = (float) Math.pow((frame.getFl() * Math.abs(f28)) / 100.0f, d15);
            float fPow2 = (float) Math.pow((frame.getFl() * Math.abs(f29)) / 100.0f, d15);
            float fPow3 = (float) Math.pow((frame.getFl() * Math.abs(f35)) / 100.0f, d15);
            float fSignum = ((Math.signum(f28) * 400.0f) * fPow) / (fPow + 27.13f);
            float fSignum2 = ((Math.signum(f29) * 400.0f) * fPow2) / (fPow2 + 27.13f);
            float fSignum3 = ((Math.signum(f35) * 400.0f) * fPow3) / (fPow3 + 27.13f);
            float f36 = (((fSignum * 11.0f) + ((-12.0f) * fSignum2)) + fSignum3) / 11.0f;
            float f37 = ((fSignum + fSignum2) - (fSignum3 * 2.0f)) / 9.0f;
            float f38 = fSignum2 * 20.0f;
            float f39 = (((fSignum * 20.0f) + f38) + (21.0f * fSignum3)) / 20.0f;
            float f45 = (((fSignum * 40.0f) + f38) + fSignum3) / 20.0f;
            float fAtan2 = (((float) Math.atan2(f37, f36)) * 180.0f) / 3.1415927f;
            if (fAtan2 < 0.0f) {
                fAtan2 += 360.0f;
            } else if (fAtan2 >= 360.0f) {
                fAtan2 -= 360.0f;
            }
            float f46 = fAtan2;
            float f47 = (f46 * 3.1415927f) / 180.0f;
            float fPow4 = ((float) Math.pow((f45 * frame.getNbb()) / frame.getAw(), frame.getC() * frame.getZ())) * 100.0f;
            float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f46) < 20.14d ? 360 + f46 : f46) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * frame.getNc()) * frame.getNcb()) * ((float) Math.sqrt((f36 * f36) + (f37 * f37)))) / (f39 + 0.305f), 0.9f)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.29f, frame.getN())), 0.73f));
            float fSqrt = fPow5 * ((float) Math.sqrt(fPow4 / 100.0f));
            float flRoot = fSqrt * frame.getFlRoot();
            float fSqrt2 = ((float) Math.sqrt((fPow5 * frame.getC()) / (frame.getAw() + 4.0f))) * 50.0f;
            float f48 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
            float fLog = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
            double d16 = f47;
            return new a(f46, fSqrt, fPow4, flRoot, fSqrt2, f48, fLog * ((float) Math.cos(d16)), fLog * ((float) Math.sin(d16)));
        }

        private final a d(float j15, float c15, float h15) {
            return e(j15, c15, h15, c.INSTANCE.a());
        }

        private final a e(float j15, float c15, float h15, c frame) {
            float flRoot = c15 * frame.getFlRoot();
            float fSqrt = ((float) Math.sqrt(((c15 / ((float) Math.sqrt(((double) j15) / 100.0d))) * frame.getC()) / (frame.getAw() + 4.0f))) * 50.0f;
            float f15 = (1.7f * j15) / ((0.007f * j15) + 1.0f);
            float fLog = ((float) Math.log((((double) flRoot) * 0.0228d) + 1.0d)) * 43.85965f;
            double d15 = (3.1415927f * h15) / 180.0f;
            return new a(h15, c15, j15, flRoot, fSqrt, f15, fLog * ((float) Math.cos(d15)), fLog * ((float) Math.sin(d15)));
        }

        private final int g(float hue, float chroma, float lstar, c frame) {
            if (t.c(frame, c.INSTANCE.a())) {
                return e.f88386a.q(hue, chroma, lstar);
            }
            if (chroma < 1.0d || Math.round(lstar) <= 0.0d || Math.round(lstar) >= 100.0d) {
                return b.f88366a.j(lstar);
            }
            float fMin = hue < 0.0f ? 0.0f : Math.min(360.0f, hue);
            a aVar = null;
            boolean z15 = true;
            float f15 = 0.0f;
            float f16 = chroma;
            while (Math.abs(f15 - chroma) >= 0.4000000059604645d) {
                a aVarA = a(fMin, f16, lstar);
                if (!z15) {
                    if (aVarA == null) {
                        chroma = f16;
                    } else {
                        f15 = f16;
                        aVar = aVarA;
                    }
                    f16 = ((chroma - f15) / 2.0f) + f15;
                } else {
                    if (aVarA != null) {
                        return aVarA.e(frame);
                    }
                    f16 = ((chroma - f15) / 2.0f) + f15;
                    z15 = false;
                }
            }
            return aVar == null ? b.f88366a.j(lstar) : aVar.e(frame);
        }

        public final a b(int argb) {
            return c(argb, c.INSTANCE.a());
        }

        public final int f(float hue, float chroma, float lstar) {
            return g(hue, chroma, lstar, c.INSTANCE.a());
        }

        private Companion() {
        }
    }

    public a(float f15, float f16, float f17, float f18, float f19, float f25, float f26, float f27) {
        this.hue = f15;
        this.chroma = f16;
        this.j = f17;
        this.m = f18;
        this.s = f19;
        this.jstar = f25;
        this.astar = f26;
        this.bstar = f27;
    }

    public final float a(a other) {
        float f15 = this.jstar - other.jstar;
        float f16 = this.astar - other.astar;
        float f17 = this.bstar - other.bstar;
        return (float) (Math.pow(Math.sqrt((f15 * f15) + (f16 * f16) + (f17 * f17)), 0.63d) * 1.41d);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getChroma() {
        return this.chroma;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getHue() {
        return this.hue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getJ() {
        return this.j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public final int e(c frame) {
        float fSqrt;
        float f15 = this.chroma;
        if (f15 == 0.0f) {
            fSqrt = 0.0f;
        } else {
            float f16 = this.j;
            if (f16 == 0.0f) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f15 / ((float) Math.sqrt(f16 / 100.0f));
            }
        }
        float fPow = fSqrt / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.29f, frame.getN()), 0.73f)), 1.1111112f));
        float f17 = (this.hue * 3.1415927f) / 180.0f;
        float fCos = (((float) Math.cos(2.0f + f17)) + 3.8f) * 0.25f;
        float aw4 = frame.getAw() * ((float) Math.pow(this.j / 100.0f, (1.0f / frame.getC()) / frame.getZ()));
        float nc5 = fCos * 3846.1538f * frame.getNc() * frame.getNcb();
        float nbb = aw4 / frame.getNbb();
        double d15 = f17;
        float fSin = (float) Math.sin(d15);
        float fCos2 = (float) Math.cos(d15);
        float f18 = (((0.305f + nbb) * 23.0f) * fPow) / (((nc5 * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f19 = fCos2 * f18;
        float f25 = f18 * fSin;
        float f26 = nbb * 460.0f;
        float f27 = (((451.0f * f19) + f26) + (288.0f * f25)) / 1403.0f;
        float f28 = ((f26 - (891.0f * f19)) - (261.0f * f25)) / 1403.0f;
        float f29 = ((f26 - (f19 * 220.0f)) - (f25 * 6300.0f)) / 1403.0f;
        double d16 = 2.3809524f;
        float fSignum = Math.signum(f27) * (100.0f / frame.getFl()) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f27) * 27.13f) / (400.0f - Math.abs(f27))), d16));
        float fSignum2 = Math.signum(f28) * (100.0f / frame.getFl()) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f28) * 27.13f) / (400.0f - Math.abs(f28))), d16));
        float fSignum3 = Math.signum(f29) * (100.0f / frame.getFl()) * ((float) Math.pow(Math.max(0.0f, (Math.abs(f29) * 27.13f) / (400.0f - Math.abs(f29))), d16));
        float f35 = fSignum / frame.getRgbD()[0];
        float f36 = fSignum2 / frame.getRgbD()[1];
        float f37 = fSignum3 / frame.getRgbD()[2];
        float[][] fArrG = b.f88366a.g();
        float[] fArr = fArrG[0];
        float f38 = (fArr[0] * f35) + (fArr[1] * f36) + (fArr[2] * f37);
        float[] fArr2 = fArrG[1];
        float f39 = (fArr2[0] * f35) + (fArr2[1] * f36) + (fArr2[2] * f37);
        float[] fArr3 = fArrG[2];
        return x5.c.b(f38, f39, (f35 * fArr3[0]) + (f36 * fArr3[1]) + (f37 * fArr3[2]));
    }

    public final int f() {
        return e(c.INSTANCE.a());
    }
}
