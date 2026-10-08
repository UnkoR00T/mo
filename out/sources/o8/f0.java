package o8;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f143071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f143073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f143074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f143075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f143076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f143077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f143078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f143079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f143080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f143081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f143082l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f143083m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f143084n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f143085o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f143086p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x7.g.k f143087q;

    private f0(List<byte[]> list, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28, int i29, int i35, int i36, float f15, int i37, String str, x7.g.k kVar) {
        this.f143071a = list;
        this.f143072b = i15;
        this.f143073c = i16;
        this.f143074d = i17;
        this.f143075e = i18;
        this.f143076f = i19;
        this.f143077g = i25;
        this.f143078h = i26;
        this.f143079i = i27;
        this.f143080j = i28;
        this.f143081k = i29;
        this.f143082l = i35;
        this.f143083m = i36;
        this.f143084n = f15;
        this.f143085o = i37;
        this.f143086p = str;
        this.f143087q = kVar;
    }

    public static f0 a(w7.c0 c0Var) {
        return b(c0Var, false, null);
    }

    private static f0 b(w7.c0 c0Var, boolean z15, x7.g.k kVar) throws t7.x {
        boolean z16;
        int i15;
        x7.g.C5795g c5795gU;
        try {
            if (z15) {
                c0Var.g0(4);
            } else {
                c0Var.g0(21);
            }
            int iQ = c0Var.Q() & 3;
            int iQ2 = c0Var.Q();
            int iG = c0Var.g();
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                z16 = true;
                if (i17 >= iQ2) {
                    break;
                }
                c0Var.g0(1);
                int iY = c0Var.Y();
                for (int i19 = 0; i19 < iY; i19++) {
                    int iY2 = c0Var.Y();
                    i18 += iY2 + 4;
                    c0Var.g0(iY2);
                }
                i17++;
            }
            c0Var.f0(iG);
            byte[] bArr = new byte[i18];
            x7.g.k kVar2 = kVar;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            int i28 = -1;
            int i29 = -1;
            int i35 = -1;
            int i36 = -1;
            int i37 = -1;
            int i38 = -1;
            int i39 = -1;
            int i45 = -1;
            int i46 = -1;
            float f15 = 1.0f;
            String strI = null;
            int i47 = 0;
            int i48 = 0;
            while (i47 < iQ2) {
                int iQ3 = c0Var.Q() & 63;
                int iY3 = c0Var.Y();
                int i49 = i16;
                x7.g.k kVarZ = kVar2;
                while (i49 < iY3) {
                    int iY4 = c0Var.Y();
                    boolean z17 = z16;
                    byte[] bArr2 = x7.g.f217160a;
                    int i55 = iQ;
                    System.arraycopy(bArr2, i16, bArr, i48, bArr2.length);
                    int length = i48 + bArr2.length;
                    System.arraycopy(c0Var.f(), c0Var.g(), bArr, length, iY4);
                    if (iQ3 == 32 && i49 == 0) {
                        kVarZ = x7.g.z(bArr, length, length + iY4);
                        i15 = iQ2;
                    } else {
                        if (iQ3 == 33 && i49 == 0) {
                            x7.g.h hVarV = x7.g.v(bArr, length, length + iY4, kVarZ);
                            i25 = hVarV.f217194b + 1;
                            i26 = hVarV.f217200h;
                            int i56 = hVarV.f217201i;
                            int i57 = hVarV.f217202j;
                            i15 = iQ2;
                            int i58 = hVarV.f217203k;
                            i35 = hVarV.f217197e + 8;
                            i36 = hVarV.f217198f + 8;
                            int i59 = hVarV.f217206n;
                            int i65 = hVarV.f217207o;
                            int i66 = hVarV.f217208p;
                            float f16 = hVarV.f217204l;
                            int i67 = hVarV.f217205m;
                            x7.g.c cVar = hVarV.f217195c;
                            if (cVar != null) {
                                strI = w7.i.i(cVar.f217169a, cVar.f217170b, cVar.f217171c, cVar.f217172d, cVar.f217173e, cVar.f217174f);
                            }
                            f15 = f16;
                            i46 = i67;
                            i38 = i65;
                            i39 = i66;
                            i29 = i58;
                            i37 = i59;
                            i28 = i57;
                            i27 = i56;
                        } else {
                            i15 = iQ2;
                            if (iQ3 == 39 && i49 == 0 && (c5795gU = x7.g.u(bArr, length, length + iY4)) != null && kVarZ != null) {
                                i16 = 0;
                                i45 = c5795gU.f217187d == kVarZ.f217215b.get(0).f217165b ? 4 : 5;
                            }
                        }
                        i16 = 0;
                    }
                    i48 = length + iY4;
                    c0Var.g0(iY4);
                    i49++;
                    z16 = z17;
                    iQ = i55;
                    iQ2 = i15;
                }
                i47++;
                kVar2 = kVarZ;
            }
            return new f0(i18 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iQ + 1, i25, i26, i27, i28, i29, i35, i36, i37, i38, i39, i45, f15, i46, strI, kVar2);
        } catch (ArrayIndexOutOfBoundsException e15) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Error parsing");
            sb5.append(z15 ? "L-HEVC config" : "HEVC config");
            throw t7.x.a(sb5.toString(), e15);
        }
    }

    public static f0 c(w7.c0 c0Var, x7.g.k kVar) {
        return b(c0Var, true, kVar);
    }
}
