package so;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class p0 extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f182771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private short[] f182772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private short[] f182773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f182774j;

    p0(n0 n0Var) {
        super(n0Var);
    }

    @Override // so.l0
    void e(n0 n0Var, i0 i0Var) throws IOException {
        o0 o0VarO1 = n0Var.o1();
        if (o0VarO1 == null) {
            throw new IOException("Could not get vhea table");
        }
        this.f182774j = o0VarO1.l();
        int iZ = n0Var.Z();
        int i15 = this.f182774j;
        this.f182771g = new int[i15];
        this.f182772h = new short[i15];
        int i16 = 0;
        for (int i17 = 0; i17 < this.f182774j; i17++) {
            this.f182771g[i17] = i0Var.N();
            this.f182772h[i17] = i0Var.E();
            i16 += 4;
        }
        if (i16 < b()) {
            int i18 = iZ - this.f182774j;
            if (i18 >= 0) {
                iZ = i18;
            }
            this.f182773i = new short[iZ];
            for (int i19 = 0; i19 < iZ; i19++) {
                if (i16 < b()) {
                    this.f182773i[i19] = i0Var.E();
                    i16 += 2;
                }
            }
        }
        this.f182681e = true;
    }

    public int j(int i15) {
        if (i15 < this.f182774j) {
            return this.f182771g[i15];
        }
        int[] iArr = this.f182771g;
        return iArr[iArr.length - 1];
    }

    public int k(int i15) {
        int i16 = this.f182774j;
        return i15 < i16 ? this.f182772h[i15] : this.f182773i[i15 - i16];
    }
}
