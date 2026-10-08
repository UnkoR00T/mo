package so;

import io.sentry.android.core.c2;
import java.io.EOFException;

/* JADX INFO: loaded from: classes4.dex */
public class j extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f182655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f182656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private short[] f182657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private short[] f182658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f182659g;

    j() {
        super((short) 0, null);
        this.f182659g = 0;
    }

    private void j(int i15, i0 i0Var, short s15) {
        short sE;
        int iK;
        short sE2;
        int iK2;
        for (int i16 = 0; i16 < i15; i16++) {
            byte b15 = this.f182656d[i16];
            if ((b15 & 16) != 0) {
                if ((b15 & 2) != 0) {
                    sE2 = (short) i0Var.K();
                }
                this.f182657e[i16] = s15;
            } else {
                if ((b15 & 2) != 0) {
                    iK2 = s15 - ((short) i0Var.K());
                } else {
                    sE2 = i0Var.E();
                }
                s15 = (short) iK2;
                this.f182657e[i16] = s15;
            }
            iK2 = s15 + sE2;
            s15 = (short) iK2;
            this.f182657e[i16] = s15;
        }
        short s16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            byte b16 = this.f182656d[i17];
            if ((b16 & 32) != 0) {
                if ((b16 & 4) != 0) {
                    sE = (short) i0Var.K();
                }
                this.f182658f[i17] = s16;
            } else {
                if ((b16 & 4) != 0) {
                    iK = s16 - ((short) i0Var.K());
                } else {
                    sE = i0Var.E();
                }
                s16 = (short) iK;
                this.f182658f[i17] = s16;
            }
            iK = s16 + sE;
            s16 = (short) iK;
            this.f182658f[i17] = s16;
        }
    }

    private void k(int i15, i0 i0Var) throws EOFException {
        int i16 = 0;
        while (i16 < i15) {
            this.f182656d[i16] = (byte) i0Var.K();
            if ((this.f182656d[i16] & 8) != 0) {
                int iK = i0Var.K();
                for (int i17 = 1; i17 <= iK; i17++) {
                    int i18 = i16 + i17;
                    byte[] bArr = this.f182656d;
                    if (i18 >= bArr.length) {
                        c2.e("PdfBox-Android", "repeat count (" + iK + ") higher than remaining space");
                        return;
                    }
                    bArr[i18] = bArr[i16];
                }
                i16 += iK;
            }
            i16++;
        }
    }

    @Override // so.l
    public boolean a() {
        return false;
    }

    @Override // so.l
    public short b(int i15) {
        return this.f182658f[i15];
    }

    @Override // so.l
    public byte d(int i15) {
        return this.f182656d[i15];
    }

    @Override // so.l
    public int e() {
        return this.f182659g;
    }

    @Override // so.l
    public short f(int i15) {
        return this.f182657e[i15];
    }

    @Override // so.l
    public int g(int i15) {
        return this.f182655c[i15];
    }

    j(short s15, i0 i0Var, short s16) throws EOFException {
        super(s15, i0Var);
        if (s15 == 0) {
            this.f182659g = 0;
            return;
        }
        int[] iArrO = i0Var.O(s15);
        this.f182655c = iArrO;
        int i15 = iArrO[s15 - 1];
        if (s15 == 1 && i15 == 65535) {
            this.f182659g = 0;
            return;
        }
        int i16 = i15 + 1;
        this.f182659g = i16;
        this.f182656d = new byte[i16];
        this.f182657e = new short[i16];
        this.f182658f = new short[i16];
        i(i0Var, i0Var.N());
        k(i16, i0Var);
        j(i16, i0Var, s16);
    }
}
