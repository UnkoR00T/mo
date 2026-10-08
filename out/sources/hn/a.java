package hn;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f85780c = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f85781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f85782b;

    public a() {
        this.f85782b = 0;
        this.f85781a = f85780c;
    }

    private void i(int i15) {
        if (i15 > this.f85781a.length * 32) {
            int[] iArrN = n((int) Math.ceil(i15 / 0.75f));
            int[] iArr = this.f85781a;
            System.arraycopy(iArr, 0, iArrN, 0, iArr.length);
            this.f85781a = iArrN;
        }
    }

    private static int[] n(int i15) {
        return new int[(i15 + 31) / 32];
    }

    public void b(boolean z15) {
        i(this.f85782b + 1);
        if (z15) {
            int[] iArr = this.f85781a;
            int i15 = this.f85782b;
            int i16 = i15 / 32;
            iArr[i16] = (1 << (i15 & 31)) | iArr[i16];
        }
        this.f85782b++;
    }

    public void c(a aVar) {
        int i15 = aVar.f85782b;
        i(this.f85782b + i15);
        for (int i16 = 0; i16 < i15; i16++) {
            b(aVar.j(i16));
        }
    }

    public void e(int i15, int i16) {
        if (i16 < 0 || i16 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i17 = this.f85782b;
        i(i17 + i16);
        for (int i18 = i16 - 1; i18 >= 0; i18--) {
            if (((1 << i18) & i15) != 0) {
                int[] iArr = this.f85781a;
                int i19 = i17 / 32;
                iArr[i19] = iArr[i19] | (1 << (i17 & 31));
            }
            i17++;
        }
        this.f85782b = i17;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f85782b == aVar.f85782b && Arrays.equals(this.f85781a, aVar.f85781a);
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f85781a.clone(), this.f85782b);
    }

    public int hashCode() {
        return (this.f85782b * 31) + Arrays.hashCode(this.f85781a);
    }

    public boolean j(int i15) {
        return ((1 << (i15 & 31)) & this.f85781a[i15 / 32]) != 0;
    }

    public int l() {
        return this.f85782b;
    }

    public int m() {
        return (this.f85782b + 7) / 8;
    }

    public void o(int i15, byte[] bArr, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = 0;
            for (int i25 = 0; i25 < 8; i25++) {
                if (j(i15)) {
                    i19 |= 1 << (7 - i25);
                }
                i15++;
            }
            bArr[i16 + i18] = (byte) i19;
        }
    }

    public void p(a aVar) {
        if (this.f85782b != aVar.f85782b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i15 = 0;
        while (true) {
            int[] iArr = this.f85781a;
            if (i15 >= iArr.length) {
                return;
            }
            iArr[i15] = iArr[i15] ^ aVar.f85781a[i15];
            i15++;
        }
    }

    public String toString() {
        int i15 = this.f85782b;
        StringBuilder sb5 = new StringBuilder(i15 + (i15 / 8) + 1);
        for (int i16 = 0; i16 < this.f85782b; i16++) {
            if ((i16 & 7) == 0) {
                sb5.append(' ');
            }
            sb5.append(j(i16) ? 'X' : '.');
        }
        return sb5.toString();
    }

    a(int[] iArr, int i15) {
        this.f85781a = iArr;
        this.f85782b = i15;
    }
}
