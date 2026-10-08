package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class j5 extends j2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f29744h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j2 f29746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j2 f29747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f29748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f29749g;

    static int Q(int i15) {
        int[] iArr = f29744h;
        int length = iArr.length;
        if (i15 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i15];
    }

    static j2 U(j2 j2Var, j2 j2Var2) {
        if (j2Var2.h() == 0) {
            return j2Var;
        }
        if (j2Var.h() == 0) {
            return j2Var2;
        }
        int iH = j2Var.h() + j2Var2.h();
        if (iH < 128) {
            return V(j2Var, j2Var2);
        }
        if (j2Var instanceof j5) {
            j5 j5Var = (j5) j2Var;
            if (j5Var.f29747e.h() + j2Var2.h() < 128) {
                return new j5(j5Var.f29746d, V(j5Var.f29747e, j2Var2));
            }
            if (j5Var.f29746d.j() > j5Var.f29747e.j() && j5Var.f29749g > j2Var2.j()) {
                return new j5(j5Var.f29746d, new j5(j5Var.f29747e, j2Var2));
            }
        }
        return iH >= Q(Math.max(j2Var.j(), j2Var2.j()) + 1) ? new j5(j2Var, j2Var2) : e5.a(new e5(null), j2Var, j2Var2);
    }

    private static j2 V(j2 j2Var, j2 j2Var2) {
        int iH = j2Var.h();
        int iH2 = j2Var2.h();
        byte[] bArr = new byte[iH + iH2];
        j2Var.L(bArr, 0, 0, iH);
        j2Var2.L(bArr, 0, iH, iH2);
        return new i2(bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    /* JADX INFO: renamed from: B */
    public final f2 iterator() {
        return new c5(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    public final byte e(int i15) {
        j2.G(i15, this.f29745c);
        return f(i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        if (this.f29745c != j2Var.h()) {
            return false;
        }
        if (this.f29745c == 0) {
            return true;
        }
        int iA = A();
        int iA2 = j2Var.A();
        if (iA != 0 && iA2 != 0 && iA != iA2) {
            return false;
        }
        g5 g5Var = null;
        h5 h5Var = new h5(this, g5Var);
        h2 h2VarA = h5Var.next();
        h5 h5Var2 = new h5(j2Var, g5Var);
        h2 h2VarA2 = h5Var2.next();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int iH = h2VarA.h() - i15;
            int iH2 = h2VarA2.h() - i16;
            int iMin = Math.min(iH, iH2);
            if (!(i15 == 0 ? h2VarA.Q(h2VarA2, i16, iMin) : h2VarA2.Q(h2VarA, i15, iMin))) {
                return false;
            }
            i17 += iMin;
            int i18 = this.f29745c;
            if (i17 >= i18) {
                if (i17 == i18) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iH) {
                h2VarA = h5Var.next();
                i15 = 0;
            } else {
                i15 += iMin;
            }
            if (iMin == iH2) {
                h2VarA = h2VarA;
                h2VarA2 = h5Var2.next();
                i16 = 0;
            } else {
                h2VarA = h2VarA;
                i16 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    final byte f(int i15) {
        int i16 = this.f29748f;
        return i15 < i16 ? this.f29746d.f(i15) : this.f29747e.f(i15 - i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    public final int h() {
        return this.f29745c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    protected final void i(byte[] bArr, int i15, int i16, int i17) {
        int i18 = i15 + i17;
        int i19 = this.f29748f;
        if (i18 <= i19) {
            this.f29746d.i(bArr, i15, i16, i17);
        } else {
            if (i15 >= i19) {
                this.f29747e.i(bArr, i15 - i19, i16, i17);
                return;
            }
            int i25 = i19 - i15;
            this.f29746d.i(bArr, i15, i16, i25);
            this.f29747e.i(bArr, 0, i16 + i25, i17 - i25);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new c5(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    protected final int j() {
        return this.f29749g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    protected final boolean k() {
        return this.f29745c >= Q(this.f29749g);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    protected final int n(int i15, int i16, int i17) {
        int i18 = i16 + i17;
        int i19 = this.f29748f;
        if (i18 <= i19) {
            return this.f29746d.n(i15, i16, i17);
        }
        if (i16 >= i19) {
            return this.f29747e.n(i15, i16 - i19, i17);
        }
        int i25 = i19 - i16;
        return this.f29747e.n(this.f29746d.n(i15, i16, i25), 0, i17 - i25);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    protected final int o(int i15, int i16, int i17) {
        int i18 = i16 + i17;
        int i19 = this.f29748f;
        if (i18 <= i19) {
            return this.f29746d.o(i15, i16, i17);
        }
        if (i16 >= i19) {
            return this.f29747e.o(i15, i16 - i19, i17);
        }
        int i25 = i19 - i16;
        return this.f29747e.o(this.f29746d.o(i15, i16, i25), 0, i17 - i25);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    public final j2 s(int i15, int i16) {
        int iW = j2.w(i15, i16, this.f29745c);
        if (iW == 0) {
            return j2.f29738b;
        }
        if (iW == this.f29745c) {
            return this;
        }
        int i17 = this.f29748f;
        if (i16 <= i17) {
            return this.f29746d.s(i15, i16);
        }
        if (i15 >= i17) {
            return this.f29747e.s(i15 - i17, i16 - i17);
        }
        j2 j2Var = this.f29746d;
        return new j5(j2Var.s(i15, j2Var.h()), this.f29747e.s(0, i16 - this.f29748f));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    protected final String t(Charset charset) {
        return new String(M(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    final void u(a2 a2Var) {
        this.f29746d.u(a2Var);
        this.f29747e.u(a2Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2
    public final boolean v() {
        j2 j2Var = this.f29746d;
        j2 j2Var2 = this.f29747e;
        return j2Var2.o(j2Var.o(0, 0, this.f29748f), 0, j2Var2.h()) == 0;
    }

    private j5(j2 j2Var, j2 j2Var2) {
        this.f29746d = j2Var;
        this.f29747e = j2Var2;
        int iH = j2Var.h();
        this.f29748f = iH;
        this.f29745c = iH + j2Var2.h();
        this.f29749g = Math.max(j2Var.j(), j2Var2.j()) + 1;
    }
}
