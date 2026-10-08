package o8;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f143033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f143035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f143036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f143037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f143038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f143039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f143040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f143041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f143042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f143043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f143044l;

    private d(List<byte[]> list, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28, float f15, String str) {
        this.f143033a = list;
        this.f143034b = i15;
        this.f143035c = i16;
        this.f143036d = i17;
        this.f143037e = i18;
        this.f143038f = i19;
        this.f143039g = i25;
        this.f143040h = i26;
        this.f143041i = i27;
        this.f143042j = i28;
        this.f143043k = f15;
        this.f143044l = str;
    }

    private static byte[] a(w7.c0 c0Var) {
        int iY = c0Var.Y();
        int iG = c0Var.g();
        c0Var.g0(iY);
        return w7.i.k(c0Var.f(), iG, iY);
    }

    public static d b(w7.c0 c0Var) throws t7.x {
        String strG;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i25;
        float f15;
        int i26;
        int i27;
        try {
            c0Var.g0(4);
            int iQ = (c0Var.Q() & 3) + 1;
            if (iQ == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iQ2 = c0Var.Q() & 31;
            for (int i28 = 0; i28 < iQ2; i28++) {
                arrayList.add(a(c0Var));
            }
            int iQ3 = c0Var.Q();
            for (int i29 = 0; i29 < iQ3; i29++) {
                arrayList.add(a(c0Var));
            }
            if (iQ2 > 0) {
                x7.g.m mVarD = x7.g.D((byte[]) arrayList.get(0), x7.g.f217160a.length, ((byte[]) arrayList.get(0)).length);
                int i35 = mVarD.f217227f;
                int i36 = mVarD.f217228g;
                int i37 = mVarD.f217230i + 8;
                int i38 = mVarD.f217231j + 8;
                int i39 = mVarD.f217238q;
                int i45 = mVarD.f217239r;
                int i46 = mVarD.f217240s;
                int i47 = mVarD.f217241t;
                float f16 = mVarD.f217229h;
                strG = w7.i.g(mVarD.f217222a, mVarD.f217223b, mVarD.f217224c);
                i19 = i46;
                i25 = i47;
                f15 = f16;
                i18 = i38;
                i26 = i39;
                i27 = i45;
                i15 = i35;
                i16 = i36;
                i17 = i37;
            } else {
                strG = null;
                i15 = -1;
                i16 = -1;
                i17 = -1;
                i18 = -1;
                i19 = -1;
                i25 = 16;
                f15 = 1.0f;
                i26 = -1;
                i27 = -1;
            }
            return new d(arrayList, iQ, i15, i16, i17, i18, i26, i27, i19, i25, f15, strG);
        } catch (ArrayIndexOutOfBoundsException e15) {
            throw t7.x.a("Error parsing AVC config", e15);
        }
    }
}
