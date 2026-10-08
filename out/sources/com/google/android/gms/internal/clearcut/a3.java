package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.util.Arrays;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
final class a3 {
    private int A;
    private int B;
    private Field C;
    private Object D;
    private Object E;
    private Object F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b3 f29156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f29157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class<?> f29158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f29160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f29161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f29162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f29163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f29164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f29165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f29166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f29167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f29168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f29169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f29170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f29171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f29172q = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f29173r = PKIFailureInfo.systemUnavail;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f29174s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f29175t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f29176u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f29177v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f29178w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f29179x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f29180y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f29181z;

    a3(Class<?> cls, String str, Object[] objArr) {
        this.f29158c = cls;
        b3 b3Var = new b3(str);
        this.f29156a = b3Var;
        this.f29157b = objArr;
        this.f29159d = b3Var.b();
        int iB = b3Var.b();
        this.f29160e = iB;
        if (iB == 0) {
            this.f29161f = 0;
            this.f29162g = 0;
            this.f29163h = 0;
            this.f29164i = 0;
            this.f29165j = 0;
            this.f29167l = 0;
            this.f29166k = 0;
            this.f29168m = 0;
            this.f29169n = null;
            return;
        }
        int iB2 = b3Var.b();
        this.f29161f = iB2;
        int iB3 = b3Var.b();
        this.f29162g = iB3;
        this.f29163h = b3Var.b();
        this.f29164i = b3Var.b();
        this.f29167l = b3Var.b();
        this.f29166k = b3Var.b();
        this.f29165j = b3Var.b();
        this.f29168m = b3Var.b();
        int iB4 = b3Var.b();
        this.f29169n = iB4 != 0 ? new int[iB4] : null;
        this.f29170o = (iB2 << 1) + iB3;
    }

    private static Field c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb5.append("Field ");
            sb5.append(str);
            sb5.append(" for ");
            sb5.append(name);
            sb5.append(" not found. Known fields are ");
            sb5.append(string);
            throw new RuntimeException(sb5.toString());
        }
    }

    private final Object f() {
        Object[] objArr = this.f29157b;
        int i15 = this.f29170o;
        this.f29170o = i15 + 1;
        return objArr[i15];
    }

    private final boolean i() {
        return (this.f29159d & 1) == 1;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    final boolean a() {
        int i15;
        Object type;
        if (!this.f29156a.a()) {
            return false;
        }
        this.f29179x = this.f29156a.b();
        int iB = this.f29156a.b();
        this.f29180y = iB;
        int i16 = iB & GF2Field.MASK;
        this.f29181z = i16;
        int i17 = this.f29179x;
        if (i17 < this.f29172q) {
            this.f29172q = i17;
        }
        if (i17 > this.f29173r) {
            this.f29173r = i17;
        }
        a1 a1Var = a1.D0;
        if (i16 == a1Var.b()) {
            this.f29174s++;
        } else if (this.f29181z >= a1.A.b() && this.f29181z <= a1.C0.b()) {
            this.f29175t++;
        }
        int i18 = this.f29178w + 1;
        this.f29178w = i18;
        if (e3.s(this.f29172q, this.f29179x, i18)) {
            int i19 = this.f29179x + 1;
            this.f29177v = i19;
            i15 = i19 - this.f29172q;
        } else {
            i15 = this.f29176u + 1;
        }
        this.f29176u = i15;
        if ((this.f29180y & 1024) != 0) {
            int[] iArr = this.f29169n;
            int i25 = this.f29171p;
            this.f29171p = i25 + 1;
            iArr[i25] = this.f29179x;
        }
        this.D = null;
        this.E = null;
        this.F = null;
        if (k()) {
            this.A = this.f29156a.b();
            if (this.f29181z == a1.f29130q.b() + 51 || this.f29181z == a1.f29147z.b() + 51) {
                type = f();
                this.D = type;
            } else if (this.f29181z == a1.f29136t.b() + 51 && i()) {
                this.E = f();
            }
        } else {
            this.C = c(this.f29158c, (String) f());
            if (o()) {
                this.B = this.f29156a.b();
            }
            if (this.f29181z == a1.f29130q.b() || this.f29181z == a1.f29147z.b()) {
                type = this.C.getType();
                this.D = type;
            } else if (this.f29181z == a1.K.b() || this.f29181z == a1.C0.b()) {
                type = f();
                this.D = type;
            } else if (this.f29181z == a1.f29136t.b() || this.f29181z == a1.P.b() || this.f29181z == a1.f29144x0.b()) {
                if (i()) {
                    this.E = f();
                }
            } else if (this.f29181z == a1Var.b()) {
                this.F = f();
                if ((this.f29180y & 2048) != 0) {
                    this.E = f();
                }
            }
        }
        return true;
    }

    final int g() {
        return this.f29179x;
    }

    final int h() {
        return this.f29181z;
    }

    final boolean k() {
        return this.f29181z > a1.D0.b();
    }

    final Field l() {
        int i15 = this.A << 1;
        Object obj = this.f29157b[i15];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field fieldC = c(this.f29158c, (String) obj);
        this.f29157b[i15] = fieldC;
        return fieldC;
    }

    final Field m() {
        int i15 = (this.A << 1) + 1;
        Object obj = this.f29157b[i15];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field fieldC = c(this.f29158c, (String) obj);
        this.f29157b[i15] = fieldC;
        return fieldC;
    }

    final Field n() {
        return this.C;
    }

    final boolean o() {
        return i() && this.f29181z <= a1.f29147z.b();
    }

    final Field p() {
        int i15 = (this.f29161f << 1) + (this.B / 32);
        Object obj = this.f29157b[i15];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field fieldC = c(this.f29158c, (String) obj);
        this.f29157b[i15] = fieldC;
        return fieldC;
    }

    final int q() {
        return this.B % 32;
    }

    final boolean r() {
        return (this.f29180y & 256) != 0;
    }

    final boolean s() {
        return (this.f29180y & 512) != 0;
    }

    final Object t() {
        return this.D;
    }

    final Object u() {
        return this.E;
    }

    final Object v() {
        return this.F;
    }
}
