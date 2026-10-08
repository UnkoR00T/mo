package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class s2 implements o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r2 f30230a;

    private s2(r2 r2Var) {
        byte[] bArr = t3.f30242b;
        this.f30230a = r2Var;
        r2Var.f30224a = this;
    }

    public static s2 a(r2 r2Var) {
        s2 s2Var = r2Var.f30224a;
        return s2Var != null ? s2Var : new s2(r2Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    @Deprecated
    public final void D(int i15) {
        this.f30230a.u(i15, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void E(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof g4)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30230a.l(i15, ((Long) list.get(i16)).longValue());
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Long) list.get(i18)).getClass();
                i17 += 8;
            }
            this.f30230a.w(i17);
            while (i16 < list.size()) {
                this.f30230a.m(((Long) list.get(i16)).longValue());
                i16++;
            }
            return;
        }
        g4 g4Var = (g4) list;
        if (!z15) {
            while (i16 < g4Var.size()) {
                this.f30230a.l(i15, g4Var.f(i16));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < g4Var.size(); i25++) {
            g4Var.f(i25);
            i19 += 8;
        }
        this.f30230a.w(i19);
        while (i16 < g4Var.size()) {
            this.f30230a.m(g4Var.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void F(int i15, double d15) {
        this.f30230a.l(i15, Double.doubleToRawLongBits(d15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void G(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof g4)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30230a.x(i15, ((Long) list.get(i16)).longValue());
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int iB = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iB += r2.b(((Long) list.get(i17)).longValue());
            }
            this.f30230a.w(iB);
            while (i16 < list.size()) {
                this.f30230a.y(((Long) list.get(i16)).longValue());
                i16++;
            }
            return;
        }
        g4 g4Var = (g4) list;
        if (!z15) {
            while (i16 < g4Var.size()) {
                this.f30230a.x(i15, g4Var.f(i16));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int iB2 = 0;
        for (int i18 = 0; i18 < g4Var.size(); i18++) {
            iB2 += r2.b(g4Var.f(i18));
        }
        this.f30230a.w(iB2);
        while (i16 < g4Var.size()) {
            this.f30230a.y(g4Var.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void H(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof m3)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30230a.j(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Integer) list.get(i18)).getClass();
                i17 += 4;
            }
            this.f30230a.w(i17);
            while (i16 < list.size()) {
                this.f30230a.k(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        m3 m3Var = (m3) list;
        if (!z15) {
            while (i16 < m3Var.size()) {
                this.f30230a.j(i15, m3Var.f(i16));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < m3Var.size(); i25++) {
            m3Var.f(i25);
            i19 += 4;
        }
        this.f30230a.w(i19);
        while (i16 < m3Var.size()) {
            this.f30230a.k(m3Var.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void I(int i15, int i16) {
        this.f30230a.j(i15, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void J(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof m3)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30230a.v(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int iA = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iA += r2.a(((Integer) list.get(i17)).intValue());
            }
            this.f30230a.w(iA);
            while (i16 < list.size()) {
                this.f30230a.w(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        m3 m3Var = (m3) list;
        if (!z15) {
            while (i16 < m3Var.size()) {
                this.f30230a.v(i15, m3Var.f(i16));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int iA2 = 0;
        for (int i18 = 0; i18 < m3Var.size(); i18++) {
            iA2 += r2.a(m3Var.f(i18));
        }
        this.f30230a.w(iA2);
        while (i16 < m3Var.size()) {
            this.f30230a.w(m3Var.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void K(int i15, int i16) {
        this.f30230a.n(i15, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void L(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof m3)) {
            if (!z15) {
                while (i16 < list.size()) {
                    r2 r2Var = this.f30230a;
                    int iIntValue = ((Integer) list.get(i16)).intValue();
                    r2Var.v(i15, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int iA = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                int iIntValue2 = ((Integer) list.get(i17)).intValue();
                iA += r2.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f30230a.w(iA);
            while (i16 < list.size()) {
                r2 r2Var2 = this.f30230a;
                int iIntValue3 = ((Integer) list.get(i16)).intValue();
                r2Var2.w((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i16++;
            }
            return;
        }
        m3 m3Var = (m3) list;
        if (!z15) {
            while (i16 < m3Var.size()) {
                r2 r2Var3 = this.f30230a;
                int iF = m3Var.f(i16);
                r2Var3.v(i15, (iF >> 31) ^ (iF + iF));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int iA2 = 0;
        for (int i18 = 0; i18 < m3Var.size(); i18++) {
            int iF2 = m3Var.f(i18);
            iA2 += r2.a((iF2 >> 31) ^ (iF2 + iF2));
        }
        this.f30230a.w(iA2);
        while (i16 < m3Var.size()) {
            r2 r2Var4 = this.f30230a;
            int iF3 = m3Var.f(i16);
            r2Var4.w((iF3 >> 31) ^ (iF3 + iF3));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void M(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof g4)) {
            if (!z15) {
                while (i16 < list.size()) {
                    r2 r2Var = this.f30230a;
                    long jLongValue = ((Long) list.get(i16)).longValue();
                    r2Var.x(i15, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int iB = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                long jLongValue2 = ((Long) list.get(i17)).longValue();
                iB += r2.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.f30230a.w(iB);
            while (i16 < list.size()) {
                r2 r2Var2 = this.f30230a;
                long jLongValue3 = ((Long) list.get(i16)).longValue();
                r2Var2.y((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i16++;
            }
            return;
        }
        g4 g4Var = (g4) list;
        if (!z15) {
            while (i16 < g4Var.size()) {
                r2 r2Var3 = this.f30230a;
                long jF = g4Var.f(i16);
                r2Var3.x(i15, (jF >> 63) ^ (jF + jF));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int iB2 = 0;
        for (int i18 = 0; i18 < g4Var.size(); i18++) {
            long jF2 = g4Var.f(i18);
            iB2 += r2.b((jF2 >> 63) ^ (jF2 + jF2));
        }
        this.f30230a.w(iB2);
        while (i16 < g4Var.size()) {
            r2 r2Var4 = this.f30230a;
            long jF3 = g4Var.f(i16);
            r2Var4.y((jF3 >> 63) ^ (jF3 + jF3));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void N(int i15, List list) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            this.f30230a.i(i15, (j2) list.get(i16));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void O(int i15, String str) {
        this.f30230a.t(i15, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void P(int i15, Object obj, k5 k5Var) {
        this.f30230a.q(i15, (r4) obj, k5Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void Q(int i15, long j15) {
        this.f30230a.x(i15, j15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void R(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof m3)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30230a.n(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int iB = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iB += r2.b(((Integer) list.get(i17)).intValue());
            }
            this.f30230a.w(iB);
            while (i16 < list.size()) {
                this.f30230a.o(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        m3 m3Var = (m3) list;
        if (!z15) {
            while (i16 < m3Var.size()) {
                this.f30230a.n(i15, m3Var.f(i16));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int iB2 = 0;
        for (int i18 = 0; i18 < m3Var.size(); i18++) {
            iB2 += r2.b(m3Var.f(i18));
        }
        this.f30230a.w(iB2);
        while (i16 < m3Var.size()) {
            this.f30230a.o(m3Var.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void S(int i15, int i16) {
        this.f30230a.n(i15, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void T(int i15, j2 j2Var) {
        this.f30230a.i(i15, j2Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void U(int i15, long j15) {
        this.f30230a.x(i15, (j15 >> 63) ^ (j15 + j15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void V(int i15, int i16) {
        this.f30230a.j(i15, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void W(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof d3)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30230a.j(i15, Float.floatToRawIntBits(((Float) list.get(i16)).floatValue()));
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Float) list.get(i18)).getClass();
                i17 += 4;
            }
            this.f30230a.w(i17);
            while (i16 < list.size()) {
                this.f30230a.k(Float.floatToRawIntBits(((Float) list.get(i16)).floatValue()));
                i16++;
            }
            return;
        }
        d3 d3Var = (d3) list;
        if (!z15) {
            while (i16 < d3Var.size()) {
                this.f30230a.j(i15, Float.floatToRawIntBits(d3Var.f(i16)));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < d3Var.size(); i25++) {
            d3Var.f(i25);
            i19 += 4;
        }
        this.f30230a.w(i19);
        while (i16 < d3Var.size()) {
            this.f30230a.k(Float.floatToRawIntBits(d3Var.f(i16)));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void X(int i15, int i16) {
        this.f30230a.v(i15, (i16 >> 31) ^ (i16 + i16));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    @Deprecated
    public final void Y(int i15) {
        this.f30230a.u(i15, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void Z(int i15, int i16) {
        this.f30230a.v(i15, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void a0(int i15, long j15) {
        this.f30230a.l(i15, j15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void b0(int i15, Object obj, k5 k5Var) {
        r2 r2Var = this.f30230a;
        r2Var.u(i15, 3);
        k5Var.W((r4) obj, r2Var.f30224a);
        r2Var.u(i15, 4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void c(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof z1)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30230a.h(i15, ((Boolean) list.get(i16)).booleanValue());
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Boolean) list.get(i18)).getClass();
                i17++;
            }
            this.f30230a.w(i17);
            while (i16 < list.size()) {
                this.f30230a.g(((Boolean) list.get(i16)).booleanValue() ? (byte) 1 : (byte) 0);
                i16++;
            }
            return;
        }
        z1 z1Var = (z1) list;
        if (!z15) {
            while (i16 < z1Var.size()) {
                this.f30230a.h(i15, z1Var.g(i16));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < z1Var.size(); i25++) {
            z1Var.g(i25);
            i19++;
        }
        this.f30230a.w(i19);
        while (i16 < z1Var.size()) {
            this.f30230a.g(z1Var.g(i16) ? (byte) 1 : (byte) 0);
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void c0(int i15, float f15) {
        this.f30230a.j(i15, Float.floatToRawIntBits(f15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void d(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof g4)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30230a.l(i15, ((Long) list.get(i16)).longValue());
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Long) list.get(i18)).getClass();
                i17 += 8;
            }
            this.f30230a.w(i17);
            while (i16 < list.size()) {
                this.f30230a.m(((Long) list.get(i16)).longValue());
                i16++;
            }
            return;
        }
        g4 g4Var = (g4) list;
        if (!z15) {
            while (i16 < g4Var.size()) {
                this.f30230a.l(i15, g4Var.f(i16));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < g4Var.size(); i25++) {
            g4Var.f(i25);
            i19 += 8;
        }
        this.f30230a.w(i19);
        while (i16 < g4Var.size()) {
            this.f30230a.m(g4Var.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void d0(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof g4)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30230a.x(i15, ((Long) list.get(i16)).longValue());
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int iB = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iB += r2.b(((Long) list.get(i17)).longValue());
            }
            this.f30230a.w(iB);
            while (i16 < list.size()) {
                this.f30230a.y(((Long) list.get(i16)).longValue());
                i16++;
            }
            return;
        }
        g4 g4Var = (g4) list;
        if (!z15) {
            while (i16 < g4Var.size()) {
                this.f30230a.x(i15, g4Var.f(i16));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int iB2 = 0;
        for (int i18 = 0; i18 < g4Var.size(); i18++) {
            iB2 += r2.b(g4Var.f(i18));
        }
        this.f30230a.w(iB2);
        while (i16 < g4Var.size()) {
            this.f30230a.y(g4Var.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void e(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof m3)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30230a.j(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Integer) list.get(i18)).getClass();
                i17 += 4;
            }
            this.f30230a.w(i17);
            while (i16 < list.size()) {
                this.f30230a.k(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        m3 m3Var = (m3) list;
        if (!z15) {
            while (i16 < m3Var.size()) {
                this.f30230a.j(i15, m3Var.f(i16));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < m3Var.size(); i25++) {
            m3Var.f(i25);
            i19 += 4;
        }
        this.f30230a.w(i19);
        while (i16 < m3Var.size()) {
            this.f30230a.k(m3Var.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void e0(int i15, Object obj) {
        if (obj instanceof j2) {
            this.f30230a.s(i15, (j2) obj);
        } else {
            this.f30230a.r(i15, (r4) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void f(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof m3)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30230a.n(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int iB = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iB += r2.b(((Integer) list.get(i17)).intValue());
            }
            this.f30230a.w(iB);
            while (i16 < list.size()) {
                this.f30230a.o(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        m3 m3Var = (m3) list;
        if (!z15) {
            while (i16 < m3Var.size()) {
                this.f30230a.n(i15, m3Var.f(i16));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int iB2 = 0;
        for (int i18 = 0; i18 < m3Var.size(); i18++) {
            iB2 += r2.b(m3Var.f(i18));
        }
        this.f30230a.w(iB2);
        while (i16 < m3Var.size()) {
            this.f30230a.o(m3Var.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void f0(int i15, long j15) {
        this.f30230a.l(i15, j15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void g(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof t2)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30230a.l(i15, Double.doubleToRawLongBits(((Double) list.get(i16)).doubleValue()));
                    i16++;
                }
                return;
            }
            this.f30230a.u(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Double) list.get(i18)).getClass();
                i17 += 8;
            }
            this.f30230a.w(i17);
            while (i16 < list.size()) {
                this.f30230a.m(Double.doubleToRawLongBits(((Double) list.get(i16)).doubleValue()));
                i16++;
            }
            return;
        }
        t2 t2Var = (t2) list;
        if (!z15) {
            while (i16 < t2Var.size()) {
                this.f30230a.l(i15, Double.doubleToRawLongBits(t2Var.f(i16)));
                i16++;
            }
            return;
        }
        this.f30230a.u(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < t2Var.size(); i25++) {
            t2Var.f(i25);
            i19 += 8;
        }
        this.f30230a.w(i19);
        while (i16 < t2Var.size()) {
            this.f30230a.m(Double.doubleToRawLongBits(t2Var.f(i16)));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void g0(int i15, List list) {
        int i16 = 0;
        if (!(list instanceof c4)) {
            while (i16 < list.size()) {
                this.f30230a.t(i15, (String) list.get(i16));
                i16++;
            }
            return;
        }
        c4 c4Var = (c4) list;
        while (i16 < list.size()) {
            Object objZza = c4Var.zza();
            if (objZza instanceof String) {
                this.f30230a.t(i15, (String) objZza);
            } else {
                this.f30230a.i(i15, (j2) objZza);
            }
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void h0(int i15, long j15) {
        this.f30230a.x(i15, j15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.o6
    public final void k(int i15, boolean z15) {
        this.f30230a.h(i15, z15);
    }
}
