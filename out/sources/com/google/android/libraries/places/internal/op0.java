package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes4.dex */
final class op0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nr0 f33227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    mp0[] f33228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f33229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33231e;

    op0(int i15, boolean z15, nr0 nr0Var) {
        mp0[] mp0VarArr = new mp0[8];
        this.f33228b = mp0VarArr;
        this.f33230d = mp0VarArr.length - 1;
        this.f33227a = nr0Var;
    }

    private final void d(mp0 mp0Var) {
        int i15;
        int i16 = mp0Var.f32985c;
        if (i16 > 4096) {
            Arrays.fill(this.f33228b, (Object) null);
            this.f33230d = this.f33228b.length - 1;
            this.f33229c = 0;
            this.f33231e = 0;
            return;
        }
        int i17 = (this.f33231e + i16) - 4096;
        if (i17 > 0) {
            int length = this.f33228b.length - 1;
            int i18 = 0;
            while (true) {
                i15 = this.f33230d;
                if (length < i15 || i17 <= 0) {
                    break;
                }
                int i19 = this.f33228b[length].f32985c;
                i17 -= i19;
                this.f33231e -= i19;
                this.f33229c--;
                i18++;
                length--;
            }
            mp0[] mp0VarArr = this.f33228b;
            int i25 = i15 + 1;
            System.arraycopy(mp0VarArr, i25, mp0VarArr, i25 + i18, this.f33229c);
            this.f33230d += i18;
        }
        int i26 = this.f33229c + 1;
        mp0[] mp0VarArr2 = this.f33228b;
        int length2 = mp0VarArr2.length;
        if (i26 > length2) {
            mp0[] mp0VarArr3 = new mp0[length2 + length2];
            System.arraycopy(mp0VarArr2, 0, mp0VarArr3, length2, length2);
            this.f33230d = this.f33228b.length - 1;
            this.f33228b = mp0VarArr3;
        }
        int i27 = this.f33230d;
        this.f33230d = i27 - 1;
        this.f33228b[i27] = mp0Var;
        this.f33229c++;
        this.f33231e += i16;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    final void a(List list) {
        int i15;
        int i16;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            mp0 mp0Var = (mp0) list.get(i17);
            rr0 rr0VarP = mp0Var.f32983a.p();
            rr0 rr0Var = mp0Var.f32984b;
            Integer num = (Integer) pp0.f33350c.get(rr0VarP);
            if (num != null) {
                int iIntValue = num.intValue();
                i16 = iIntValue + 1;
                if (i16 < 2 || i16 > 7) {
                    i15 = i16;
                    i16 = -1;
                } else if (pp0.f33349b[iIntValue].f32984b.equals(rr0Var)) {
                    i15 = i16;
                } else if (pp0.f33349b[i16].f32984b.equals(rr0Var)) {
                    i16 = iIntValue + 2;
                    i15 = i16;
                } else {
                    i15 = i16;
                    i16 = -1;
                }
            } else {
                i15 = -1;
                i16 = -1;
            }
            if (i16 == -1) {
                int i18 = this.f33230d;
                while (true) {
                    i18++;
                    mp0[] mp0VarArr = this.f33228b;
                    if (i18 >= mp0VarArr.length) {
                        i16 = -1;
                        break;
                    }
                    if (mp0VarArr[i18].f32983a.equals(rr0VarP)) {
                        if (this.f33228b[i18].f32984b.equals(rr0Var)) {
                            int i19 = i18 - this.f33230d;
                            int length = pp0.f33349b.length;
                            i16 = i19 + 61;
                            break;
                        } else if (i15 == -1) {
                            int i25 = i18 - this.f33230d;
                            int length2 = pp0.f33349b.length;
                            i15 = i25 + 61;
                        }
                    }
                }
            }
            if (i16 != -1) {
                b(i16, CertificateBody.profileType, 128);
            } else if (i15 == -1) {
                this.f33227a.b(64);
                c(rr0VarP);
                c(rr0Var);
                d(mp0Var);
            } else if (!rr0VarP.B(pp0.f33348a) || mp0.f32982h.equals(rr0VarP)) {
                b(i15, 63, 64);
                c(rr0Var);
                d(mp0Var);
            } else {
                b(i15, 15, 0);
                c(rr0Var);
            }
        }
    }

    final void b(int i15, int i16, int i17) {
        if (i15 < i16) {
            this.f33227a.b(i15 | i17);
            return;
        }
        nr0 nr0Var = this.f33227a;
        nr0Var.b(i17 | i16);
        int i18 = i15 - i16;
        while (i18 >= 128) {
            nr0Var.b(128 | (i18 & CertificateBody.profileType));
            i18 >>>= 7;
        }
        nr0Var.b(i18);
    }

    final void c(rr0 rr0Var) {
        b(rr0Var.s(), CertificateBody.profileType, 0);
        this.f33227a.u0(rr0Var);
    }
}
