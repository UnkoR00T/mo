package o3;

import java.util.Arrays;
import n3.o1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001.B]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0016BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0019B!\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b)\u0010*J7\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\"J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010D\u001a\u0004\bG\u0010FR\u001a\u0010J\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010FR\u001a\u0010M\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010K\u001a\u0004\b=\u0010LR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170N8\u0006¢\u0006\f\n\u0004\b)\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010K\u001a\u0004\bR\u0010LR\u001a\u0010V\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010K\u001a\u0004\bU\u0010LR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170N8\u0006¢\u0006\f\n\u0004\bW\u0010O\u001a\u0004\b-\u0010QR\u001a\u0010Z\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bY\u0010LR\u001a\u0010]\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010`\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010\\\u001a\u0004\bC\u0010^¨\u0006b"}, d2 = {"Lo3/f0;", "Lo3/c;", "", "name", "", "primaries", "Lo3/i0;", "whitePoint", "transform", "Lo3/n;", "oetf", "eotf", "", "min", "max", "Lo3/g0;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLo3/i0;[FLo3/n;Lo3/n;FFLo3/g0;I)V", "function", "(Ljava/lang/String;[FLo3/i0;Lo3/g0;I)V", "", "gamma", "(Ljava/lang/String;[FLo3/i0;DFFI)V", "colorSpace", "(Lo3/f0;[FLo3/i0;)V", "component", "f", "(I)F", "e", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "Landroidx/compose/ui/graphics/Color;", "n", "(FFFFLo3/c;)J", "b", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lo3/i0;", "J", "()Lo3/i0;", "F", "g", "h", "Lo3/g0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Lo3/g0;", "i", "[F", "G", "()[F", "I", "k", "C", "inverseTransform", "Lo3/n;", "()Lo3/n;", "oetfOrig", "Lkotlin/Function1;", "Ler/l;", ip.a.f96138c, "()Ler/l;", "E", "oetfFunc", "o", "B", "eotfOrig", "p", "q", "A", "eotfFunc", "r", "Z", "isWideGamut", "()Z", "s", "isSrgb", "t", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 extends o3.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f141722u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final n f141723v = new n() { // from class: o3.u
        @Override // o3.n
        public final double a(double d15) {
            return f0.t(d15);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WhitePoint whitePoint;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float min;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float max;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final TransferParameters transferParameters;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float[] primaries;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float[] transform;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float[] inverseTransform;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final n oetfOrig;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final er.l<Double, Double> oetf;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final n oetfFunc;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final n eotfOrig;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final er.l<Double, Double> eotf;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final n eotfFunc;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean isWideGamut;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean isSrgb;

    /* JADX INFO: renamed from: o3.f0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lo3/f0$a;", "", "<init>", "()V", "", "primaries", "Lo3/i0;", "whitePoint", "Lo3/n;", "OETF", "EOTF", "", "min", "max", "", "id", "", "C", "([FLo3/i0;Lo3/n;Lo3/n;FFI)Z", "", "point", "a", "b", "p", "(DLo3/n;Lo3/n;)Z", ip.a.f96138c, "([FFF)Z", "o", "([F)F", "p1", "p2", "r", "([F[F)Z", "E", "([F)[F", "q", "([FLo3/i0;)[F", "Lo3/g0;", "function", "x", "(Lo3/g0;)Lo3/n;", "s", "DoubleIdentity", "Lo3/n;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double A(TransferParameters transferParameters, double d15) {
            return d.o(d15, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double B(TransferParameters transferParameters, double d15) {
            return d.p(d15, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean C(float[] primaries, WhitePoint whitePoint, n OETF, n EOTF, float min, float max, int id5) {
            if (id5 == 0) {
                return true;
            }
            k kVar = k.f141750a;
            if (!d.g(primaries, kVar.H()) || !d.f(whitePoint, o.f141788a.e()) || min != 0.0f || max != 1.0f) {
                return false;
            }
            f0 f0VarG = kVar.G();
            for (double d15 = 0.0d; d15 <= 1.0d; d15 += 0.00392156862745098d) {
                if (!p(d15, OETF, f0VarG.getOetfOrig()) || !p(d15, EOTF, f0VarG.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean D(float[] primaries, float min, float max) {
            float fO = o(primaries);
            k kVar = k.f141750a;
            if (fO / o(kVar.C()) <= 0.9f || !r(primaries, kVar.H())) {
                return min < 0.0f && max > 1.0f;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] E(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length != 9) {
                pq.n.p(primaries, fArr, 0, 0, 6, 6, null);
                return fArr;
            }
            float f15 = primaries[0];
            float f16 = primaries[1];
            float f17 = f15 + f16 + primaries[2];
            fArr[0] = f15 / f17;
            fArr[1] = f16 / f17;
            float f18 = primaries[3];
            float f19 = primaries[4];
            float f25 = f18 + f19 + primaries[5];
            fArr[2] = f18 / f25;
            fArr[3] = f19 / f25;
            float f26 = primaries[6];
            float f27 = primaries[7];
            float f28 = f26 + f27 + primaries[8];
            fArr[4] = f26 / f28;
            fArr[5] = f27 / f28;
            return fArr;
        }

        private final float o(float[] primaries) {
            if (primaries.length < 6) {
                return 0.0f;
            }
            float f15 = primaries[0];
            float f16 = primaries[1];
            float f17 = primaries[2];
            float f18 = primaries[3];
            float f19 = primaries[4];
            float f25 = primaries[5];
            float f26 = ((((((f15 * f18) + (f16 * f19)) + (f17 * f25)) - (f18 * f19)) - (f16 * f17)) - (f15 * f25)) * 0.5f;
            return f26 < 0.0f ? -f26 : f26;
        }

        private final boolean p(double point, n a15, n b15) {
            return Math.abs(a15.a(point) - b15.a(point)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] q(float[] primaries, WhitePoint whitePoint) {
            float f15 = primaries[0];
            float f16 = primaries[1];
            float f17 = primaries[2];
            float f18 = primaries[3];
            float f19 = primaries[4];
            float f25 = primaries[5];
            float x15 = whitePoint.getX();
            float y15 = whitePoint.getY();
            float f26 = 1;
            float f27 = (f26 - f15) / f16;
            float f28 = (f26 - f17) / f18;
            float f29 = (f26 - f19) / f25;
            float f35 = (f26 - x15) / y15;
            float f36 = f15 / f16;
            float f37 = (f17 / f18) - f36;
            float f38 = (x15 / y15) - f36;
            float f39 = f28 - f27;
            float f45 = (f19 / f25) - f36;
            float f46 = (((f35 - f27) * f37) - (f38 * f39)) / (((f29 - f27) * f37) - (f39 * f45));
            float f47 = (f38 - (f45 * f46)) / f37;
            float f48 = (1.0f - f47) - f46;
            float f49 = f48 / f16;
            float f55 = f47 / f18;
            float f56 = f46 / f25;
            return new float[]{f49 * f15, f48, f49 * ((1.0f - f15) - f16), f55 * f17, f47, f55 * ((1.0f - f17) - f18), f56 * f19, f46, f56 * ((1.0f - f19) - f25)};
        }

        private final boolean r(float[] p15, float[] p16) {
            float f15 = p15[0];
            float f16 = p16[0];
            float f17 = p15[1];
            float f18 = p16[1];
            float f19 = p15[2];
            float f25 = p16[2];
            float f26 = p15[3];
            float f27 = p16[3];
            float f28 = p15[4];
            float f29 = p16[4];
            float f35 = p15[5];
            float f36 = p16[5];
            float[] fArr = {f15 - f16, f17 - f18, f19 - f25, f26 - f27, f28 - f29, f35 - f36};
            float f37 = fArr[0];
            float f38 = fArr[1];
            if (((f18 - f36) * f37) - ((f16 - f29) * f38) >= 0.0f && ((f16 - f25) * f38) - ((f18 - f27) * f37) >= 0.0f) {
                float f39 = fArr[2];
                float f45 = fArr[3];
                if (((f27 - f18) * f39) - ((f25 - f16) * f45) >= 0.0f && ((f25 - f29) * f45) - ((f27 - f36) * f39) >= 0.0f) {
                    float f46 = fArr[4];
                    float f47 = fArr[5];
                    if (((f36 - f27) * f46) - ((f29 - f25) * f47) >= 0.0f && ((f29 - f16) * f47) - ((f36 - f18) * f46) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final n s(final TransferParameters function) {
            if (function.h()) {
                return new n() { // from class: o3.x
                    @Override // o3.n
                    public final double a(double d15) {
                        return f0.Companion.t(function, d15);
                    }
                };
            }
            if (function.i()) {
                return new n() { // from class: o3.y
                    @Override // o3.n
                    public final double a(double d15) {
                        return f0.Companion.u(function, d15);
                    }
                };
            }
            return (function.getE() == 0.0d && function.getF() == 0.0d) ? new n() { // from class: o3.z
                @Override // o3.n
                public final double a(double d15) {
                    return f0.Companion.v(function, d15);
                }
            } : new n() { // from class: o3.a0
                @Override // o3.n
                public final double a(double d15) {
                    return f0.Companion.w(function, d15);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double t(TransferParameters transferParameters, double d15) {
            return k.f141750a.J(transferParameters, d15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double u(TransferParameters transferParameters, double d15) {
            return k.f141750a.L(transferParameters, d15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double v(TransferParameters transferParameters, double d15) {
            return d.q(d15, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double w(TransferParameters transferParameters, double d15) {
            return d.r(d15, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final n x(final TransferParameters function) {
            if (function.h()) {
                return new n() { // from class: o3.b0
                    @Override // o3.n
                    public final double a(double d15) {
                        return f0.Companion.y(function, d15);
                    }
                };
            }
            if (function.i()) {
                return new n() { // from class: o3.c0
                    @Override // o3.n
                    public final double a(double d15) {
                        return f0.Companion.z(function, d15);
                    }
                };
            }
            return (function.getE() == 0.0d && function.getF() == 0.0d) ? new n() { // from class: o3.d0
                @Override // o3.n
                public final double a(double d15) {
                    return f0.Companion.A(function, d15);
                }
            } : new n() { // from class: o3.e0
                @Override // o3.n
                public final double a(double d15) {
                    return f0.Companion.B(function, d15);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double y(TransferParameters transferParameters, double d15) {
            return k.f141750a.K(transferParameters, d15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double z(TransferParameters transferParameters, double d15) {
            return k.f141750a.M(transferParameters, d15);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "c", "(D)Ljava/lang/Double;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<Double, Double> {
        b() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Double b(Double d15) {
            return c(d15.doubleValue());
        }

        public final Double c(double d15) {
            return Double.valueOf(f0.this.getEotfOrig().a(lr.m.l(d15, f0.this.min, f0.this.max)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "c", "(D)Ljava/lang/Double;"}, k = 3, mv = {2, 1, 0})
    static final class c extends fr.w implements er.l<Double, Double> {
        c() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Double b(Double d15) {
            return c(d15.doubleValue());
        }

        public final Double c(double d15) {
            return Double.valueOf(lr.m.l(f0.this.getOetfOrig().a(d15), f0.this.min, f0.this.max));
        }
    }

    public f0(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, n nVar, n nVar2, float f15, float f16, TransferParameters transferParameters, int i15) {
        super(str, o3.b.INSTANCE.b(), i15, null);
        this.whitePoint = whitePoint;
        this.min = f15;
        this.max = f16;
        this.transferParameters = transferParameters;
        this.oetfOrig = nVar;
        this.oetf = new c();
        this.oetfFunc = new n() { // from class: o3.s
            @Override // o3.n
            public final double a(double d15) {
                return f0.K(this.f141811a, d15);
            }
        };
        this.eotfOrig = nVar2;
        this.eotf = new b();
        this.eotfFunc = new n() { // from class: o3.t
            @Override // o3.n
            public final double a(double d15) {
                return f0.y(this.f141812a, d15);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f15 >= f16) {
            throw new IllegalArgumentException("Invalid range: min=" + f15 + ", max=" + f16 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrE = companion.E(fArr);
        this.primaries = fArrE;
        if (fArr2 == null) {
            this.transform = companion.q(fArrE, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = d.k(this.transform);
        this.isWideGamut = companion.D(fArrE, f15, f16);
        this.isSrgb = companion.C(fArrE, whitePoint, nVar, nVar2, f15, f16, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double K(f0 f0Var, double d15) {
        return lr.m.l(f0Var.oetfOrig.a(d15), f0Var.min, f0Var.max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double t(double d15) {
        return d15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double u(double d15, double d16) {
        if (d16 < 0.0d) {
            d16 = 0.0d;
        }
        return Math.pow(d16, 1.0d / d15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double v(double d15, double d16) {
        if (d16 < 0.0d) {
            d16 = 0.0d;
        }
        return Math.pow(d16, d15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(f0 f0Var, double d15) {
        return f0Var.eotfOrig.a(lr.m.l(d15, f0Var.min, f0Var.max));
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final n getEotfFunc() {
        return this.eotfFunc;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final n getEotfOrig() {
        return this.eotfOrig;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    public final er.l<Double, Double> D() {
        return this.oetf;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final n getOetfFunc() {
        return this.oetfFunc;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final n getOetfOrig() {
        return this.oetfOrig;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // o3.c
    public float[] b(float[] v15) {
        d.n(this.inverseTransform, v15);
        if (v15.length < 3) {
            return v15;
        }
        v15[0] = (float) this.oetfFunc.a(v15[0]);
        v15[1] = (float) this.oetfFunc.a(v15[1]);
        v15[2] = (float) this.oetfFunc.a(v15[2]);
        return v15;
    }

    @Override // o3.c
    public float e(int component) {
        return this.max;
    }

    @Override // o3.c
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || f0.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        f0 f0Var = (f0) other;
        if (Float.compare(f0Var.min, this.min) != 0 || Float.compare(f0Var.max, this.max) != 0 || !fr.t.c(this.whitePoint, f0Var.whitePoint) || !Arrays.equals(this.primaries, f0Var.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return fr.t.c(transferParameters, f0Var.transferParameters);
        }
        if (f0Var.transferParameters == null) {
            return true;
        }
        if (fr.t.c(this.oetfOrig, f0Var.oetfOrig)) {
            return fr.t.c(this.eotfOrig, f0Var.eotfOrig);
        }
        return false;
    }

    @Override // o3.c
    public float f(int component) {
        return this.min;
    }

    @Override // o3.c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f15 = this.min;
        int iFloatToIntBits = (iHashCode + (f15 == 0.0f ? 0 : Float.floatToIntBits(f15))) * 31;
        float f16 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f16 == 0.0f ? 0 : Float.floatToIntBits(f16))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : iHashCode2;
    }

    @Override // o3.c
    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // o3.c
    public long j(float v15, float v16, float v17) {
        float fA = (float) this.eotfFunc.a(v15);
        float fA2 = (float) this.eotfFunc.a(v16);
        float fA3 = (float) this.eotfFunc.a(v17);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(((fArr[0] * fA) + (fArr[3] * fA2)) + (fArr[6] * fA3))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3))) & BodyPartID.bodyIdMax);
    }

    @Override // o3.c
    public float[] l(float[] v15) {
        if (v15.length < 3) {
            return v15;
        }
        v15[0] = (float) this.eotfFunc.a(v15[0]);
        v15[1] = (float) this.eotfFunc.a(v15[1]);
        v15[2] = (float) this.eotfFunc.a(v15[2]);
        return d.n(this.transform, v15);
    }

    @Override // o3.c
    public float m(float v15, float v16, float v17) {
        float fA = (float) this.eotfFunc.a(v15);
        float fA2 = (float) this.eotfFunc.a(v16);
        float fA3 = (float) this.eotfFunc.a(v17);
        float[] fArr = this.transform;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // o3.c
    public long n(float x15, float y15, float z15, float a15, o3.c colorSpace) {
        float[] fArr = this.inverseTransform;
        return o1.a((float) this.oetfFunc.a((fArr[0] * x15) + (fArr[3] * y15) + (fArr[6] * z15)), (float) this.oetfFunc.a((fArr[1] * x15) + (fArr[4] * y15) + (fArr[7] * z15)), (float) this.oetfFunc.a((fArr[2] * x15) + (fArr[5] * y15) + (fArr[8] * z15)), a15, colorSpace);
    }

    public final er.l<Double, Double> z() {
        return this.eotf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters, int i15) {
        Companion companion = INSTANCE;
        this(str, fArr, whitePoint, null, companion.x(transferParameters), companion.s(transferParameters), 0.0f, 1.0f, transferParameters, i15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(String str, float[] fArr, WhitePoint whitePoint, final double d15, float f15, float f16, int i15) {
        n nVar;
        n nVar2;
        if (d15 == 1.0d) {
            nVar = f141723v;
        } else {
            nVar = new n() { // from class: o3.v
                @Override // o3.n
                public final double a(double d16) {
                    return f0.u(d15, d16);
                }
            };
        }
        n nVar3 = nVar;
        if (d15 == 1.0d) {
            nVar2 = f141723v;
        } else {
            nVar2 = new n() { // from class: o3.w
                @Override // o3.n
                public final double a(double d16) {
                    return f0.v(d15, d16);
                }
            };
        }
        this(str, fArr, whitePoint, null, nVar3, nVar2, f15, f16, new TransferParameters(d15, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i15);
    }

    public f0(f0 f0Var, float[] fArr, WhitePoint whitePoint) {
        this(f0Var.getName(), f0Var.primaries, whitePoint, fArr, f0Var.oetfOrig, f0Var.eotfOrig, f0Var.min, f0Var.max, f0Var.transferParameters, -1);
    }
}
