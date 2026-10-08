package o3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001e\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001a\u0010&\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010/\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u0017\u00102\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u0017\u00105\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u0017\u00108\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+R\u0017\u0010;\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010+R\u0017\u0010>\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010+R\u0017\u0010?\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b\u0007\u0010+R\u0017\u0010B\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b@\u0010)\u001a\u0004\bA\u0010+R\u0017\u0010E\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bC\u0010)\u001a\u0004\bD\u0010+R\u0017\u0010F\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b<\u0010+R\u0017\u0010I\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bG\u0010)\u001a\u0004\bH\u0010+R\u0017\u0010K\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bJ\u0010)\u001a\u0004\b6\u0010+R\u0017\u0010M\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bL\u0010)\u001a\u0004\b9\u0010+R\u0017\u0010Q\u001a\u00020N8\u0006¢\u0006\f\n\u0004\b=\u0010O\u001a\u0004\bJ\u0010PR\u0017\u0010R\u001a\u00020N8\u0006¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bG\u0010PR\u001a\u0010T\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\bS\u0010+R\u0017\u0010U\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b@\u0010+R\u0017\u0010V\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\bC\u0010+R\u0017\u0010X\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bA\u0010O\u001a\u0004\bW\u0010PR \u0010\\\u001a\b\u0012\u0004\u0012\u00020N0Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010Z\u001a\u0004\bL\u0010[¨\u0006]"}, d2 = {"Lo3/k;", "", "<init>", "()V", "Lo3/g0;", "params", "", "x", "K", "(Lo3/g0;D)D", "J", "M", "pq", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "", "b", "[F", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()[F", "SrgbPrimaries", "c", "C", "Ntsc1953Primaries", "d", "getBt2020Primaries$ui_graphics", "Bt2020Primaries", "e", "Lo3/g0;", "getSrgbTransferParameters$ui_graphics", "()Lo3/g0;", "SrgbTransferParameters", "f", "NoneTransferParameters", "g", "getBt2020HlgTransferParameters$ui_graphics", "Bt2020HlgTransferParameters", "h", "getBt2020PqTransferParameters$ui_graphics", "Bt2020PqTransferParameters", "Lo3/f0;", "i", "Lo3/f0;", "G", "()Lo3/f0;", "Srgb", "j", "A", "LinearSrgb", "k", "y", "ExtendedSrgb", "l", "z", "LinearExtendedSrgb", "m", "s", "Bt709", "n", "p", "Bt2020", "o", "w", "DciP3", "DisplayP3", "q", "B", "Ntsc1953", "r", "F", "SmpteC", "AdobeRgb", "t", "E", "ProPhotoRgb", "u", "Aces", "v", "Acescg", "Lo3/c;", "Lo3/c;", "()Lo3/c;", "CieXyz", "CieLab", "I", "Unspecified", "Bt2020Hlg", "Bt2020Pq", ip.a.f96138c, "Oklab", "", "[Lo3/c;", "()[Lo3/c;", "ColorSpacesArray", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final f0 Bt2020Pq;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final c Oklab;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final c[] ColorSpacesArray;
    public static final int D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f141750a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float[] SrgbPrimaries;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float[] Ntsc1953Primaries;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float[] Bt2020Primaries;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final TransferParameters SrgbTransferParameters;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final TransferParameters NoneTransferParameters;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final TransferParameters Bt2020HlgTransferParameters;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final TransferParameters Bt2020PqTransferParameters;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final f0 Srgb;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final f0 LinearSrgb;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final f0 ExtendedSrgb;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final f0 LinearExtendedSrgb;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final f0 Bt709;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final f0 Bt2020;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final f0 DciP3;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final f0 DisplayP3;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final f0 Ntsc1953;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final f0 SmpteC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final f0 AdobeRgb;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final f0 ProPhotoRgb;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final f0 Aces;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final f0 Acescg;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final c CieXyz;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final c CieLab;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final f0 Unspecified;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final f0 Bt2020Hlg;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        Bt2020Primaries = fArr3;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        SrgbTransferParameters = transferParameters;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        NoneTransferParameters = transferParameters2;
        TransferParameters transferParameters3 = new TransferParameters(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        Bt2020HlgTransferParameters = transferParameters3;
        TransferParameters transferParameters4 = new TransferParameters(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        Bt2020PqTransferParameters = transferParameters4;
        o oVar = o.f141788a;
        f0 f0Var = new f0("sRGB IEC61966-2.1", fArr, oVar.e(), transferParameters, 0);
        Srgb = f0Var;
        f0 f0Var2 = new f0("sRGB IEC61966-2.1 (Linear)", fArr, oVar.e(), 1.0d, 0.0f, 1.0f, 1);
        LinearSrgb = f0Var2;
        f0 f0Var3 = new f0("scRGB-nl IEC 61966-2-2:2003", fArr, oVar.e(), null, new n() { // from class: o3.e
            @Override // o3.n
            public final double a(double d15) {
                return k.k(d15);
            }
        }, new n() { // from class: o3.f
            @Override // o3.n
            public final double a(double d15) {
                return k.l(d15);
            }
        }, -0.799f, 2.399f, transferParameters, 2);
        ExtendedSrgb = f0Var3;
        f0 f0Var4 = new f0("scRGB IEC 61966-2-2:2003", fArr, oVar.e(), 1.0d, -0.5f, 7.499f, 3);
        LinearExtendedSrgb = f0Var4;
        f0 f0Var5 = new f0("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, oVar.e(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        Bt709 = f0Var5;
        f0 f0Var6 = new f0("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, oVar.e(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        Bt2020 = f0Var6;
        f0 f0Var7 = new f0("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        DciP3 = f0Var7;
        f0 f0Var8 = new f0("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, oVar.e(), transferParameters, 7);
        DisplayP3 = f0Var8;
        f0 f0Var9 = new f0("NTSC (1953)", fArr2, oVar.a(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        Ntsc1953 = f0Var9;
        f0 f0Var10 = new f0("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, oVar.e(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        SmpteC = f0Var10;
        f0 f0Var11 = new f0("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, oVar.e(), 2.2d, 0.0f, 1.0f, 10);
        AdobeRgb = f0Var11;
        f0 f0Var12 = new f0("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, oVar.b(), new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        ProPhotoRgb = f0Var12;
        f0 f0Var13 = new f0("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, oVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        Aces = f0Var13;
        f0 f0Var14 = new f0("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, oVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        Acescg = f0Var14;
        j0 j0Var = new j0("Generic XYZ", 14);
        CieXyz = j0Var;
        p pVar = new p("Generic L*a*b*", 15);
        CieLab = pVar;
        f0 f0Var15 = new f0("None", fArr, oVar.e(), transferParameters2, 16);
        Unspecified = f0Var15;
        f0 f0Var16 = new f0("Hybrid Log Gamma encoding", fArr3, oVar.e(), null, new n() { // from class: o3.g
            @Override // o3.n
            public final double a(double d15) {
                return k.g(d15);
            }
        }, new n() { // from class: o3.h
            @Override // o3.n
            public final double a(double d15) {
                return k.h(d15);
            }
        }, 0.0f, 1.0f, transferParameters3, 17);
        Bt2020Hlg = f0Var16;
        f0 f0Var17 = new f0("Perceptual Quantizer encoding", fArr3, oVar.e(), null, new n() { // from class: o3.i
            @Override // o3.n
            public final double a(double d15) {
                return k.i(d15);
            }
        }, new n() { // from class: o3.j
            @Override // o3.n
            public final double a(double d15) {
                return k.j(d15);
            }
        }, 0.0f, 1.0f, transferParameters4, 18);
        Bt2020Pq = f0Var17;
        q qVar = new q("Oklab", 19);
        Oklab = qVar;
        ColorSpacesArray = new c[]{f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7, f0Var8, f0Var9, f0Var10, f0Var11, f0Var12, f0Var13, f0Var14, j0Var, pVar, f0Var15, f0Var16, f0Var17, qVar};
        D = 8;
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(double d15) {
        return f141750a.K(Bt2020HlgTransferParameters, d15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double h(double d15) {
        return f141750a.J(Bt2020HlgTransferParameters, d15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(double d15) {
        return f141750a.M(Bt2020PqTransferParameters, d15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(double d15) {
        return f141750a.L(Bt2020PqTransferParameters, d15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double k(double d15) {
        return d.a(d15, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double l(double d15) {
        return d.b(d15, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final f0 A() {
        return LinearSrgb;
    }

    public final f0 B() {
        return Ntsc1953;
    }

    public final float[] C() {
        return Ntsc1953Primaries;
    }

    public final c D() {
        return Oklab;
    }

    public final f0 E() {
        return ProPhotoRgb;
    }

    public final f0 F() {
        return SmpteC;
    }

    public final f0 G() {
        return Srgb;
    }

    public final float[] H() {
        return SrgbPrimaries;
    }

    public final f0 I() {
        return Unspecified;
    }

    public final double J(TransferParameters params, double x15) {
        double d15 = x15 < 0.0d ? -1.0d : 1.0d;
        double d16 = x15 * d15;
        double a15 = params.getA();
        double b15 = params.getB();
        double c15 = params.getC();
        double d17 = params.getD();
        double e15 = params.getE();
        double d18 = a15 * d16;
        return (params.getF() + 1.0d) * d15 * (d18 <= 1.0d ? Math.pow(d18, b15) : Math.exp((d16 - e15) * c15) + d17);
    }

    public final double K(TransferParameters params, double x15) {
        double d15 = x15 < 0.0d ? -1.0d : 1.0d;
        double a15 = 1.0d / params.getA();
        double b15 = 1.0d / params.getB();
        double c15 = 1.0d / params.getC();
        double d16 = params.getD();
        double e15 = params.getE();
        double f15 = (x15 * d15) / (params.getF() + 1.0d);
        return d15 * (f15 <= 1.0d ? a15 * Math.pow(f15, b15) : (c15 * Math.log(f15 - d16)) + e15);
    }

    public final double L(TransferParameters pq4, double x15) {
        double d15 = x15 < 0.0d ? -1.0d : 1.0d;
        double d16 = x15 * d15;
        return d15 * Math.pow(lr.m.c(pq4.getA() + (pq4.getB() * Math.pow(d16, pq4.getC())), 0.0d) / (pq4.getD() + (pq4.getE() * Math.pow(d16, pq4.getC()))), pq4.getF());
    }

    public final double M(TransferParameters params, double x15) {
        double d15 = x15 < 0.0d ? -1.0d : 1.0d;
        double d16 = x15 * d15;
        double d17 = -params.getA();
        double d18 = params.getD();
        double f15 = 1.0d / params.getF();
        return d15 * Math.pow(Math.max(d17 + (d18 * Math.pow(d16, f15)), 0.0d) / (params.getB() + ((-params.getE()) * Math.pow(d16, f15))), 1.0d / params.getC());
    }

    public final f0 m() {
        return Aces;
    }

    public final f0 n() {
        return Acescg;
    }

    public final f0 o() {
        return AdobeRgb;
    }

    public final f0 p() {
        return Bt2020;
    }

    public final f0 q() {
        return Bt2020Hlg;
    }

    public final f0 r() {
        return Bt2020Pq;
    }

    public final f0 s() {
        return Bt709;
    }

    public final c t() {
        return CieLab;
    }

    public final c u() {
        return CieXyz;
    }

    public final c[] v() {
        return ColorSpacesArray;
    }

    public final f0 w() {
        return DciP3;
    }

    public final f0 x() {
        return DisplayP3;
    }

    public final f0 y() {
        return ExtendedSrgb;
    }

    public final f0 z() {
        return LinearExtendedSrgb;
    }
}
