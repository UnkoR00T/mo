package com.google.android.libraries.places.internal;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cf0 extends da0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final o60 f31865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final w70 f31866w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private l90 f31867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a80 f31868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Charset f31869t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f31870u;

    static {
        bf0 bf0Var = new bf0();
        f31865v = bf0Var;
        f31866w = p60.a(":status", bf0Var);
    }

    protected cf0(int i15, im0 im0Var, sm0 sm0Var, f40 f40Var) {
        super(i15, im0Var, sm0Var, f40Var);
        this.f31869t = StandardCharsets.UTF_8;
    }

    private static Charset H(a80 a80Var) {
        String str = (String) a80Var.b(ze0.f34501i);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    private static void I(a80 a80Var) {
        a80Var.d(f31866w);
        a80Var.d(r60.f33495b);
        a80Var.d(r60.f33494a);
    }

    private static final l90 J(a80 a80Var) {
        char cCharAt;
        Integer num = (Integer) a80Var.b(f31866w);
        if (num == null) {
            return l90.f32814l.e("Missing HTTP status code");
        }
        String str = (String) a80Var.b(ze0.f34501i);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return ze0.a(num.intValue()).f("invalid content-type: ".concat(String.valueOf(str)));
    }

    protected final void E(a80 a80Var) {
        zj.p.r(a80Var, "headers");
        l90 l90Var = this.f31867r;
        if (l90Var != null) {
            this.f31867r = l90Var.f("headers: ".concat(a80Var.toString()));
            return;
        }
        try {
            if (this.f31870u) {
                this.f31867r = l90.f32814l.e("Received headers twice");
            } else {
                Integer num = (Integer) a80Var.b(f31866w);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.f31870u = true;
                    l90 l90VarJ = J(a80Var);
                    this.f31867r = l90VarJ;
                    if (l90VarJ != null) {
                        this.f31867r = l90VarJ.f("headers: ".concat(a80Var.toString()));
                        this.f31868s = a80Var;
                        this.f31869t = H(a80Var);
                        return;
                    }
                    I(a80Var);
                    w(a80Var);
                }
            }
            l90 l90Var2 = this.f31867r;
            if (l90Var2 != null) {
                this.f31867r = l90Var2.f("headers: ".concat(a80Var.toString()));
                this.f31868s = a80Var;
                this.f31869t = H(a80Var);
            }
        } catch (Throwable th4) {
            l90 l90Var3 = this.f31867r;
            if (l90Var3 != null) {
                this.f31867r = l90Var3.f("headers: ".concat(a80Var.toString()));
                this.f31868s = a80Var;
                this.f31869t = H(a80Var);
            }
            throw th4;
        }
    }

    protected final void F(sj0 sj0Var, boolean z15) {
        l90 l90Var = this.f31867r;
        if (l90Var != null) {
            Charset charset = this.f31869t;
            int i15 = vj0.f34068b;
            zj.p.r(charset, "charset");
            zj.p.r(sj0Var, "buffer");
            int iF = sj0Var.f();
            byte[] bArr = new byte[iF];
            sj0Var.t3(bArr, 0, iF);
            this.f31867r = l90Var.f("DATA-----------------------------\n".concat(new String(bArr, charset)));
            sj0Var.close();
            if (this.f31867r.h().length() > 1000 || z15) {
                K(this.f31867r, false, this.f31868s);
                return;
            }
            return;
        }
        if (!this.f31870u) {
            sj0Var.close();
            K(l90.f32814l.e("headers not received before payload"), false, new a80());
            return;
        }
        int iF2 = sj0Var.f();
        x(sj0Var);
        if (z15) {
            if (iF2 > 0) {
                this.f31867r = l90.f32814l.e("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.f31867r = l90.f32814l.e("Received unexpected EOS on empty DATA frame from server");
            }
            a80 a80Var = new a80();
            this.f31868s = a80Var;
            z(this.f31867r, hb0.PROCESSED, false, a80Var);
        }
    }

    protected final void G(a80 a80Var) {
        l90 l90VarF;
        zj.p.r(a80Var, "trailers");
        l90 l90VarJ = this.f31867r;
        if (l90VarJ == null && !this.f31870u) {
            l90VarJ = J(a80Var);
            this.f31867r = l90VarJ;
            if (l90VarJ != null) {
                this.f31868s = a80Var;
            }
        }
        if (l90VarJ != null) {
            l90 l90VarF2 = l90VarJ.f("trailers: ".concat(a80Var.toString()));
            this.f31867r = l90VarF2;
            K(l90VarF2, false, this.f31868s);
            return;
        }
        l90 l90Var = (l90) a80Var.b(r60.f33495b);
        if (l90Var != null) {
            l90VarF = l90Var.e((String) a80Var.b(r60.f33494a));
        } else if (this.f31870u) {
            l90VarF = l90.f32809g.e("missing GRPC status in response");
        } else {
            Integer num = (Integer) a80Var.b(f31866w);
            l90VarF = (num != null ? ze0.a(num.intValue()) : l90.f32814l.e("missing HTTP status code")).f("missing GRPC status, inferred error from HTTP status code");
        }
        I(a80Var);
        y(a80Var, l90VarF);
    }

    protected abstract void K(l90 l90Var, boolean z15, a80 a80Var);
}
