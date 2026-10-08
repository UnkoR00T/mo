package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes4.dex */
final class np0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pr0 f33085b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    mp0[] f33088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f33089f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33084a = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f33090g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f33091h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33086c = PKIFailureInfo.certConfirmed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33087d = PKIFailureInfo.certConfirmed;

    np0(int i15, int i16, es0 es0Var) {
        mp0[] mp0VarArr = new mp0[8];
        this.f33088e = mp0VarArr;
        this.f33089f = mp0VarArr.length - 1;
        this.f33085b = tr0.c(es0Var);
    }

    private final void f() {
        int i15 = this.f33087d;
        int i16 = this.f33091h;
        if (i15 < i16) {
            if (i15 == 0) {
                g();
            } else {
                h(i16 - i15);
            }
        }
    }

    private final void g() {
        Arrays.fill(this.f33088e, (Object) null);
        this.f33089f = this.f33088e.length - 1;
        this.f33090g = 0;
        this.f33091h = 0;
    }

    private final int h(int i15) {
        int i16;
        int i17 = 0;
        if (i15 > 0) {
            int length = this.f33088e.length;
            while (true) {
                length--;
                i16 = this.f33089f;
                if (length < i16 || i15 <= 0) {
                    break;
                }
                int i18 = this.f33088e[length].f32985c;
                i15 -= i18;
                this.f33091h -= i18;
                this.f33090g--;
                i17++;
            }
            mp0[] mp0VarArr = this.f33088e;
            int i19 = i16 + 1;
            System.arraycopy(mp0VarArr, i19, mp0VarArr, i19 + i17, this.f33090g);
            this.f33089f += i17;
        }
        return i17;
    }

    private final int i(int i15) {
        return this.f33089f + 1 + i15;
    }

    private final rr0 j(int i15) throws IOException {
        if (m(i15)) {
            return pp0.f33349b[i15].f32983a;
        }
        int length = pp0.f33349b.length;
        int i16 = i(i15 - 61);
        if (i16 >= 0) {
            mp0[] mp0VarArr = this.f33088e;
            if (i16 < mp0VarArr.length) {
                return mp0VarArr[i16].f32983a;
            }
        }
        int i17 = i15 + 1;
        StringBuilder sb5 = new StringBuilder(String.valueOf(i17).length() + 23);
        sb5.append("Header index too large ");
        sb5.append(i17);
        throw new IOException(sb5.toString());
    }

    private final void k(int i15, mp0 mp0Var) {
        this.f33084a.add(mp0Var);
        int i16 = mp0Var.f32985c;
        int i17 = this.f33087d;
        if (i16 > i17) {
            g();
            return;
        }
        h((this.f33091h + i16) - i17);
        int i18 = this.f33090g + 1;
        mp0[] mp0VarArr = this.f33088e;
        int length = mp0VarArr.length;
        if (i18 > length) {
            mp0[] mp0VarArr2 = new mp0[length + length];
            System.arraycopy(mp0VarArr, 0, mp0VarArr2, length, length);
            this.f33089f = this.f33088e.length - 1;
            this.f33088e = mp0VarArr2;
        }
        int i19 = this.f33089f;
        this.f33089f = i19 - 1;
        this.f33088e[i19] = mp0Var;
        this.f33090g++;
        this.f33091h += i16;
    }

    private final int l() {
        return this.f33085b.k() & 255;
    }

    private static final boolean m(int i15) {
        if (i15 < 0) {
            return false;
        }
        int length = pp0.f33349b.length;
        return i15 <= 60;
    }

    final void a(int i15) {
        this.f33086c = i15;
        this.f33087d = i15;
        f();
    }

    final void b() throws IOException {
        while (true) {
            pr0 pr0Var = this.f33085b;
            if (pr0Var.f()) {
                return;
            }
            byte bK = pr0Var.k();
            int i15 = bK & 255;
            if (i15 == 128) {
                throw new IOException("index == 0");
            }
            if ((bK & 128) == 128) {
                int iD = d(i15, CertificateBody.profileType);
                int i16 = iD - 1;
                if (!m(i16)) {
                    int length = pp0.f33349b.length;
                    int i17 = i(iD - 62);
                    if (i17 >= 0) {
                        mp0[] mp0VarArr = this.f33088e;
                        if (i17 <= mp0VarArr.length - 1) {
                            this.f33084a.add(mp0VarArr[i17]);
                        }
                    }
                    StringBuilder sb5 = new StringBuilder(String.valueOf(iD).length() + 23);
                    sb5.append("Header index too large ");
                    sb5.append(iD);
                    throw new IOException(sb5.toString());
                }
                this.f33084a.add(pp0.f33349b[i16]);
            } else if (i15 == 64) {
                rr0 rr0VarE = e();
                pp0.a(rr0VarE);
                k(-1, new mp0(rr0VarE, e()));
            } else if ((bK & 64) == 64) {
                k(-1, new mp0(j(d(i15, 63) - 1), e()));
            } else if ((bK & 32) == 32) {
                int iD2 = d(i15, 31);
                this.f33087d = iD2;
                if (iD2 < 0 || iD2 > this.f33086c) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(iD2).length() + 34);
                    sb6.append("Invalid dynamic table size update ");
                    sb6.append(iD2);
                    throw new IOException(sb6.toString());
                }
                f();
            } else if (i15 == 16 || i15 == 0) {
                rr0 rr0VarE2 = e();
                pp0.a(rr0VarE2);
                this.f33084a.add(new mp0(rr0VarE2, e()));
            } else {
                this.f33084a.add(new mp0(j(d(i15, 15) - 1), e()));
            }
        }
    }

    public final List c() {
        List list = this.f33084a;
        ArrayList arrayList = new ArrayList(list);
        list.clear();
        return arrayList;
    }

    final int d(int i15, int i16) {
        int i17 = i15 & i16;
        if (i17 < i16) {
            return i17;
        }
        int i18 = 0;
        while (true) {
            int iL = l();
            if ((iL & 128) == 0) {
                return i16 + (iL << i18);
            }
            i16 += (iL & CertificateBody.profileType) << i18;
            i18 += 7;
        }
    }

    final rr0 e() {
        int iL = l();
        int i15 = iL & 128;
        long jD = d(iL, CertificateBody.profileType);
        if (i15 != 128) {
            return this.f33085b.C2(jD);
        }
        byte[] bArrB = wp0.a().b(this.f33085b.y3(jD));
        rr0 rr0Var = rr0.f33593d;
        return qr0.b(bArrB);
    }
}
