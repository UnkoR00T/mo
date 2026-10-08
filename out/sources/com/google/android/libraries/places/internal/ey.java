package com.google.android.libraries.places.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class ey implements w10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dy f32239a;

    private ey(dy dyVar) {
        this.f32239a = dyVar;
        dyVar.f32109a = this;
    }

    public static ey D(dy dyVar) {
        Object obj = dyVar.f32109a;
        return obj != null ? (ey) obj : new ey(dyVar);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void A(int i15, boolean z15) {
        this.f32239a.o(i15, z15);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void B(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof bz)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f32239a.j(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            int iE = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iE += dy.e(((Integer) list.get(i17)).intValue());
            }
            dyVar.y(iE);
            while (i16 < list.size()) {
                dyVar.x(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        bz bzVar = (bz) list;
        if (!z15) {
            while (i16 < bzVar.size()) {
                this.f32239a.j(i15, bzVar.h(i16));
                i16++;
            }
            return;
        }
        dy dyVar2 = this.f32239a;
        dyVar2.i(i15, 2);
        int iE2 = 0;
        for (int i18 = 0; i18 < bzVar.size(); i18++) {
            iE2 += dy.e(bzVar.h(i18));
        }
        dyVar2.y(iE2);
        while (i16 < bzVar.size()) {
            dyVar2.x(bzVar.h(i16));
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void C(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof bz)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f32239a.j(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            int iE = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iE += dy.e(((Integer) list.get(i17)).intValue());
            }
            dyVar.y(iE);
            while (i16 < list.size()) {
                dyVar.x(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        bz bzVar = (bz) list;
        if (!z15) {
            while (i16 < bzVar.size()) {
                this.f32239a.j(i15, bzVar.h(i16));
                i16++;
            }
            return;
        }
        dy dyVar2 = this.f32239a;
        dyVar2.i(i15, 2);
        int iE2 = 0;
        for (int i18 = 0; i18 < bzVar.size(); i18++) {
            iE2 += dy.e(bzVar.h(i18));
        }
        dyVar2.y(iE2);
        while (i16 < bzVar.size()) {
            dyVar2.x(bzVar.h(i16));
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void E(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof uz)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f32239a.n(i15, ((Long) list.get(i16)).longValue());
                    i16++;
                }
                return;
            }
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Long) list.get(i18)).getClass();
                i17 += 8;
            }
            dyVar.y(i17);
            while (i16 < list.size()) {
                dyVar.B(((Long) list.get(i16)).longValue());
                i16++;
            }
            return;
        }
        uz uzVar = (uz) list;
        if (!z15) {
            while (i16 < uzVar.size()) {
                this.f32239a.n(i15, uzVar.i(i16));
                i16++;
            }
            return;
        }
        dy dyVar2 = this.f32239a;
        dyVar2.i(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < uzVar.size(); i25++) {
            uzVar.i(i25);
            i19 += 8;
        }
        dyVar2.y(i19);
        while (i16 < uzVar.size()) {
            dyVar2.B(uzVar.i(i16));
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void F(int i15, double d15) {
        this.f32239a.n(i15, Double.doubleToRawLongBits(d15));
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void G(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof uz)) {
            if (!z15) {
                while (i16 < list.size()) {
                    dy dyVar = this.f32239a;
                    long jLongValue = ((Long) list.get(i16)).longValue();
                    dyVar.m(i15, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i16++;
                }
                return;
            }
            dy dyVar2 = this.f32239a;
            dyVar2.i(i15, 2);
            int iE = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                long jLongValue2 = ((Long) list.get(i17)).longValue();
                iE += dy.e((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            dyVar2.y(iE);
            while (i16 < list.size()) {
                long jLongValue3 = ((Long) list.get(i16)).longValue();
                dyVar2.A((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i16++;
            }
            return;
        }
        uz uzVar = (uz) list;
        if (!z15) {
            while (i16 < uzVar.size()) {
                dy dyVar3 = this.f32239a;
                long jI = uzVar.i(i16);
                dyVar3.m(i15, (jI >> 63) ^ (jI + jI));
                i16++;
            }
            return;
        }
        dy dyVar4 = this.f32239a;
        dyVar4.i(i15, 2);
        int iE2 = 0;
        for (int i18 = 0; i18 < uzVar.size(); i18++) {
            long jI2 = uzVar.i(i18);
            iE2 += dy.e((jI2 >> 63) ^ (jI2 + jI2));
        }
        dyVar4.y(iE2);
        while (i16 < uzVar.size()) {
            long jI3 = uzVar.i(i16);
            dyVar4.A((jI3 >> 63) ^ (jI3 + jI3));
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void H(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof uz)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f32239a.m(i15, ((Long) list.get(i16)).longValue());
                    i16++;
                }
                return;
            }
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            int iE = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iE += dy.e(((Long) list.get(i17)).longValue());
            }
            dyVar.y(iE);
            while (i16 < list.size()) {
                dyVar.A(((Long) list.get(i16)).longValue());
                i16++;
            }
            return;
        }
        uz uzVar = (uz) list;
        if (!z15) {
            while (i16 < uzVar.size()) {
                this.f32239a.m(i15, uzVar.i(i16));
                i16++;
            }
            return;
        }
        dy dyVar2 = this.f32239a;
        dyVar2.i(i15, 2);
        int iE2 = 0;
        for (int i18 = 0; i18 < uzVar.size(); i18++) {
            iE2 += dy.e(uzVar.i(i18));
        }
        dyVar2.y(iE2);
        while (i16 < uzVar.size()) {
            dyVar2.A(uzVar.i(i16));
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void I(int i15, int i16) {
        this.f32239a.l(i15, i16);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void J(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof uz)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f32239a.n(i15, ((Long) list.get(i16)).longValue());
                    i16++;
                }
                return;
            }
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Long) list.get(i18)).getClass();
                i17 += 8;
            }
            dyVar.y(i17);
            while (i16 < list.size()) {
                dyVar.B(((Long) list.get(i16)).longValue());
                i16++;
            }
            return;
        }
        uz uzVar = (uz) list;
        if (!z15) {
            while (i16 < uzVar.size()) {
                this.f32239a.n(i15, uzVar.i(i16));
                i16++;
            }
            return;
        }
        dy dyVar2 = this.f32239a;
        dyVar2.i(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < uzVar.size(); i25++) {
            uzVar.i(i25);
            i19 += 8;
        }
        dyVar2.y(i19);
        while (i16 < uzVar.size()) {
            dyVar2.B(uzVar.i(i16));
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void K(int i15, int i16) {
        this.f32239a.j(i15, i16);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void L(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof fy)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f32239a.n(i15, Double.doubleToRawLongBits(((Double) list.get(i16)).doubleValue()));
                    i16++;
                }
                return;
            }
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Double) list.get(i18)).getClass();
                i17 += 8;
            }
            dyVar.y(i17);
            while (i16 < list.size()) {
                dyVar.B(Double.doubleToRawLongBits(((Double) list.get(i16)).doubleValue()));
                i16++;
            }
            return;
        }
        fy fyVar = (fy) list;
        if (!z15) {
            while (i16 < fyVar.size()) {
                this.f32239a.n(i15, Double.doubleToRawLongBits(fyVar.g(i16)));
                i16++;
            }
            return;
        }
        dy dyVar2 = this.f32239a;
        dyVar2.i(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < fyVar.size(); i25++) {
            fyVar.g(i25);
            i19 += 8;
        }
        dyVar2.y(i19);
        while (i16 < fyVar.size()) {
            dyVar2.B(Double.doubleToRawLongBits(fyVar.g(i16)));
            i16++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.libraries.places.internal.w10
    public final void M(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof lx)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f32239a.o(i15, ((Boolean) list.get(i16)).booleanValue());
                    i16++;
                }
                return;
            }
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Boolean) list.get(i18)).getClass();
                i17++;
            }
            dyVar.y(i17);
            while (i16 < list.size()) {
                dyVar.w(((Boolean) list.get(i16)).booleanValue() ? (byte) 1 : (byte) 0);
                i16++;
            }
            return;
        }
        lx lxVar = (lx) list;
        if (!z15) {
            while (i16 < lxVar.size()) {
                this.f32239a.o(i15, lxVar.g(i16));
                i16++;
            }
            return;
        }
        dy dyVar2 = this.f32239a;
        dyVar2.i(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < lxVar.size(); i25++) {
            lxVar.g(i25);
            i19++;
        }
        dyVar2.y(i19);
        while (i16 < lxVar.size()) {
            dyVar2.w(lxVar.g(i16) ? (byte) 1 : (byte) 0);
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void a(int i15, long j15) {
        this.f32239a.m(i15, j15);
    }

    @Override // com.google.android.libraries.places.internal.w10
    @Deprecated
    public final void b(int i15) {
        this.f32239a.i(i15, 3);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void c(int i15, long j15) {
        this.f32239a.m(i15, (j15 >> 63) ^ (j15 + j15));
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void d(int i15, tx txVar) {
        this.f32239a.q(i15, txVar);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void e(int i15, String str) {
        this.f32239a.p(i15, str);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void f(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof bz)) {
            if (!z15) {
                while (i16 < list.size()) {
                    dy dyVar = this.f32239a;
                    int iIntValue = ((Integer) list.get(i16)).intValue();
                    dyVar.k(i15, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i16++;
                }
                return;
            }
            dy dyVar2 = this.f32239a;
            dyVar2.i(i15, 2);
            int iD = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                int iIntValue2 = ((Integer) list.get(i17)).intValue();
                iD += dy.d((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            dyVar2.y(iD);
            while (i16 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i16)).intValue();
                dyVar2.y((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i16++;
            }
            return;
        }
        bz bzVar = (bz) list;
        if (!z15) {
            while (i16 < bzVar.size()) {
                dy dyVar3 = this.f32239a;
                int iH = bzVar.h(i16);
                dyVar3.k(i15, (iH >> 31) ^ (iH + iH));
                i16++;
            }
            return;
        }
        dy dyVar4 = this.f32239a;
        dyVar4.i(i15, 2);
        int iD2 = 0;
        for (int i18 = 0; i18 < bzVar.size(); i18++) {
            int iH2 = bzVar.h(i18);
            iD2 += dy.d((iH2 >> 31) ^ (iH2 + iH2));
        }
        dyVar4.y(iD2);
        while (i16 < bzVar.size()) {
            int iH3 = bzVar.h(i16);
            dyVar4.y((iH3 >> 31) ^ (iH3 + iH3));
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void g(int i15, int i16) {
        this.f32239a.j(i15, i16);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void h(int i15, float f15) {
        this.f32239a.l(i15, Float.floatToRawIntBits(f15));
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void i(int i15, int i16) {
        this.f32239a.l(i15, i16);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void j(int i15, Object obj, v00 v00Var) {
        dy dyVar = this.f32239a;
        fx fxVar = (fx) obj;
        dyVar.i(i15, 2);
        dyVar.y(fxVar.d(v00Var));
        v00Var.c(fxVar, this);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void k(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof uz)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f32239a.m(i15, ((Long) list.get(i16)).longValue());
                    i16++;
                }
                return;
            }
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            int iE = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iE += dy.e(((Long) list.get(i17)).longValue());
            }
            dyVar.y(iE);
            while (i16 < list.size()) {
                dyVar.A(((Long) list.get(i16)).longValue());
                i16++;
            }
            return;
        }
        uz uzVar = (uz) list;
        if (!z15) {
            while (i16 < uzVar.size()) {
                this.f32239a.m(i15, uzVar.i(i16));
                i16++;
            }
            return;
        }
        dy dyVar2 = this.f32239a;
        dyVar2.i(i15, 2);
        int iE2 = 0;
        for (int i18 = 0; i18 < uzVar.size(); i18++) {
            iE2 += dy.e(uzVar.i(i18));
        }
        dyVar2.y(iE2);
        while (i16 < uzVar.size()) {
            dyVar2.A(uzVar.i(i16));
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void l(int i15, Object obj, v00 v00Var) {
        dy dyVar = this.f32239a;
        dyVar.i(i15, 3);
        v00Var.c((fx) obj, this);
        dyVar.i(i15, 4);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void m(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof bz)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f32239a.l(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Integer) list.get(i18)).getClass();
                i17 += 4;
            }
            dyVar.y(i17);
            while (i16 < list.size()) {
                dyVar.z(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        bz bzVar = (bz) list;
        if (!z15) {
            while (i16 < bzVar.size()) {
                this.f32239a.l(i15, bzVar.h(i16));
                i16++;
            }
            return;
        }
        dy dyVar2 = this.f32239a;
        dyVar2.i(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < bzVar.size(); i25++) {
            bzVar.h(i25);
            i19 += 4;
        }
        dyVar2.y(i19);
        while (i16 < bzVar.size()) {
            dyVar2.z(bzVar.h(i16));
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void n(int i15, long j15) {
        this.f32239a.m(i15, j15);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void o(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof bz)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f32239a.k(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            int iD = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iD += dy.d(((Integer) list.get(i17)).intValue());
            }
            dyVar.y(iD);
            while (i16 < list.size()) {
                dyVar.y(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        bz bzVar = (bz) list;
        if (!z15) {
            while (i16 < bzVar.size()) {
                this.f32239a.k(i15, bzVar.h(i16));
                i16++;
            }
            return;
        }
        dy dyVar2 = this.f32239a;
        dyVar2.i(i15, 2);
        int iD2 = 0;
        for (int i18 = 0; i18 < bzVar.size(); i18++) {
            iD2 += dy.d(bzVar.h(i18));
        }
        dyVar2.y(iD2);
        while (i16 < bzVar.size()) {
            dyVar2.y(bzVar.h(i16));
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void p(int i15, List list) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            this.f32239a.q(i15, (tx) list.get(i16));
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void q(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof sy)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f32239a.l(i15, Float.floatToRawIntBits(((Float) list.get(i16)).floatValue()));
                    i16++;
                }
                return;
            }
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Float) list.get(i18)).getClass();
                i17 += 4;
            }
            dyVar.y(i17);
            while (i16 < list.size()) {
                dyVar.z(Float.floatToRawIntBits(((Float) list.get(i16)).floatValue()));
                i16++;
            }
            return;
        }
        sy syVar = (sy) list;
        if (!z15) {
            while (i16 < syVar.size()) {
                this.f32239a.l(i15, Float.floatToRawIntBits(syVar.g(i16)));
                i16++;
            }
            return;
        }
        dy dyVar2 = this.f32239a;
        dyVar2.i(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < syVar.size(); i25++) {
            syVar.g(i25);
            i19 += 4;
        }
        dyVar2.y(i19);
        while (i16 < syVar.size()) {
            dyVar2.z(Float.floatToRawIntBits(syVar.g(i16)));
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void r(int i15, int i16) {
        this.f32239a.k(i15, i16);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void s(int i15, List list) {
        int i16 = 0;
        if (!(list instanceof rz)) {
            while (i16 < list.size()) {
                this.f32239a.p(i15, (String) list.get(i16));
                i16++;
            }
            return;
        }
        rz rzVar = (rz) list;
        while (i16 < list.size()) {
            Object objA = rzVar.a();
            if (objA instanceof String) {
                this.f32239a.p(i15, (String) objA);
            } else {
                this.f32239a.q(i15, (tx) objA);
            }
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    @Deprecated
    public final void t(int i15) {
        this.f32239a.i(i15, 4);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void u(int i15, int i16) {
        this.f32239a.k(i15, (i16 >> 31) ^ (i16 + i16));
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void v(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof bz)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f32239a.l(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Integer) list.get(i18)).getClass();
                i17 += 4;
            }
            dyVar.y(i17);
            while (i16 < list.size()) {
                dyVar.z(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        bz bzVar = (bz) list;
        if (!z15) {
            while (i16 < bzVar.size()) {
                this.f32239a.l(i15, bzVar.h(i16));
                i16++;
            }
            return;
        }
        dy dyVar2 = this.f32239a;
        dyVar2.i(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < bzVar.size(); i25++) {
            bzVar.h(i25);
            i19 += 4;
        }
        dyVar2.y(i19);
        while (i16 < bzVar.size()) {
            dyVar2.z(bzVar.h(i16));
            i16++;
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void w(int i15, long j15) {
        this.f32239a.n(i15, j15);
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void x(int i15, Object obj) {
        if (obj instanceof tx) {
            this.f32239a.u(i15, (tx) obj);
        } else {
            this.f32239a.t(i15, (g00) obj);
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void y(int i15, yz yzVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            dy dyVar = this.f32239a;
            dyVar.i(i15, 2);
            dyVar.y(zz.c(yzVar, entry.getKey(), entry.getValue()));
            zz.b(dyVar, yzVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.libraries.places.internal.w10
    public final void z(int i15, long j15) {
        this.f32239a.n(i15, j15);
    }
}
