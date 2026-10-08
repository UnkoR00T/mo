package com.google.android.libraries.places.internal;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class a80 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f31573c = Logger.getLogger(a80.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v70 f31574d = new t70();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final bk.a f31575e = bk.a.b().m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f31576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31577b;

    public a80() {
    }

    private final byte[] h(int i15) {
        return (byte[]) this.f31576a[i15 + i15];
    }

    private final Object i(int i15) {
        return this.f31576a[i15 + i15 + 1];
    }

    private final byte[] j(int i15) {
        Object objI = i(i15);
        if (objI instanceof byte[]) {
            return (byte[]) objI;
        }
        throw null;
    }

    private final int k() {
        Object[] objArr = this.f31576a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final boolean l() {
        return this.f31577b == 0;
    }

    private final void m(int i15) {
        Object[] objArr = new Object[i15];
        if (!l()) {
            Object[] objArr2 = this.f31576a;
            int i16 = this.f31577b;
            System.arraycopy(objArr2, 0, objArr, 0, i16 + i16);
        }
        this.f31576a = objArr;
    }

    final int a() {
        return this.f31577b;
    }

    public final Object b(w70 w70Var) {
        int i15 = this.f31577b;
        do {
            i15--;
            if (i15 < 0) {
                return null;
            }
        } while (!Arrays.equals(w70Var.e(), h(i15)));
        Object objI = i(i15);
        if (objI instanceof byte[]) {
            return w70Var.b((byte[]) objI);
        }
        throw null;
    }

    public final void c(w70 w70Var, Object obj) {
        zj.p.r(w70Var, "key");
        zj.p.r(obj, "value");
        int i15 = this.f31577b;
        int i16 = i15 + i15;
        if (i16 == 0 || i16 == k()) {
            m(Math.max(i16 + i16, 8));
        }
        int i17 = this.f31577b;
        this.f31576a[i17 + i17] = w70Var.e();
        int i18 = this.f31577b;
        this.f31576a[i18 + i18 + 1] = w70Var.a(obj);
        this.f31577b++;
    }

    public final void d(w70 w70Var) {
        if (l()) {
            return;
        }
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = this.f31577b;
            if (i15 >= i17) {
                Arrays.fill(this.f31576a, i16 + i16, i17 + i17, (Object) null);
                this.f31577b = i16;
                return;
            }
            if (!Arrays.equals(w70Var.e(), h(i15))) {
                int i18 = i16 + i16;
                this.f31576a[i18] = h(i15);
                Object objI = i(i15);
                if (this.f31576a instanceof byte[][]) {
                    m(k());
                }
                this.f31576a[i18 + 1] = objI;
                i16++;
            }
            i15++;
        }
    }

    final byte[][] e() {
        int i15 = this.f31577b;
        int i16 = i15 + i15;
        byte[][] bArr = new byte[i16][];
        Object[] objArr = this.f31576a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i16);
            return bArr;
        }
        for (int i17 = 0; i17 < this.f31577b; i17++) {
            int i18 = i17 + i17;
            bArr[i18] = h(i17);
            bArr[i18 + 1] = j(i17);
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final void f(a80 a80Var) {
        if (a80Var.l()) {
            return;
        }
        int iK = k();
        int i15 = this.f31577b;
        int i16 = i15 + i15;
        int i17 = iK - i16;
        if (l()) {
            int i18 = a80Var.f31577b;
            m(i16 + i18 + i18);
        } else {
            int i19 = a80Var.f31577b;
            if (i17 < i19 + i19) {
                int i110 = a80Var.f31577b;
                m(i16 + i110 + i110);
            }
        }
        Object[] objArr = a80Var.f31576a;
        Object[] objArr2 = this.f31576a;
        int i25 = this.f31577b;
        int i26 = a80Var.f31577b;
        System.arraycopy(objArr, 0, objArr2, i25 + i25, i26 + i26);
        this.f31577b += a80Var.f31577b;
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder("Metadata(");
        for (int i15 = 0; i15 < this.f31577b; i15++) {
            if (i15 != 0) {
                sb5.append(',');
            }
            byte[] bArrH = h(i15);
            Charset charset = StandardCharsets.US_ASCII;
            String str = new String(bArrH, charset);
            sb5.append(str);
            sb5.append('=');
            if (str.endsWith("-bin")) {
                sb5.append(f31575e.f(j(i15)));
            } else {
                sb5.append(new String(j(i15), charset));
            }
        }
        sb5.append(')');
        return sb5.toString();
    }

    a80(int i15, Object[] objArr) {
        this.f31577b = i15;
        this.f31576a = objArr;
    }
}
