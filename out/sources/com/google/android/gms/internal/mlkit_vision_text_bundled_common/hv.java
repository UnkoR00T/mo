package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class hv implements xy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gv f30449a;

    private hv(gv gvVar) {
        byte[] bArr = kw.f30477b;
        this.f30449a = gvVar;
        gvVar.f30435a = this;
    }

    public static hv M(gv gvVar) {
        hv hvVar = gvVar.f30435a;
        return hvVar != null ? hvVar : new hv(gvVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void A(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof xw)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30449a.E(i15, ((Long) list.get(i16)).longValue());
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int iE = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iE += gv.e(((Long) list.get(i17)).longValue());
            }
            this.f30449a.D(iE);
            while (i16 < list.size()) {
                this.f30449a.F(((Long) list.get(i16)).longValue());
                i16++;
            }
            return;
        }
        xw xwVar = (xw) list;
        if (!z15) {
            while (i16 < xwVar.size()) {
                this.f30449a.E(i15, xwVar.f(i16));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int iE2 = 0;
        for (int i18 = 0; i18 < xwVar.size(); i18++) {
            iE2 += gv.e(xwVar.f(i18));
        }
        this.f30449a.D(iE2);
        while (i16 < xwVar.size()) {
            this.f30449a.F(xwVar.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void B(int i15, long j15) {
        this.f30449a.q(i15, j15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void C(int i15, long j15) {
        this.f30449a.E(i15, j15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void D(int i15, int i16) {
        this.f30449a.o(i15, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void E(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof sv)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30449a.o(i15, Float.floatToRawIntBits(((Float) list.get(i16)).floatValue()));
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Float) list.get(i18)).getClass();
                i17 += 4;
            }
            this.f30449a.D(i17);
            while (i16 < list.size()) {
                this.f30449a.p(Float.floatToRawIntBits(((Float) list.get(i16)).floatValue()));
                i16++;
            }
            return;
        }
        sv svVar = (sv) list;
        if (!z15) {
            while (i16 < svVar.size()) {
                this.f30449a.o(i15, Float.floatToRawIntBits(svVar.f(i16)));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < svVar.size(); i25++) {
            svVar.f(i25);
            i19 += 4;
        }
        this.f30449a.D(i19);
        while (i16 < svVar.size()) {
            this.f30449a.p(Float.floatToRawIntBits(svVar.f(i16)));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void F(int i15, int i16) {
        this.f30449a.s(i15, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void G(int i15, yu yuVar) {
        this.f30449a.m(i15, yuVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void H(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof xw)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30449a.E(i15, ((Long) list.get(i16)).longValue());
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int iE = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iE += gv.e(((Long) list.get(i17)).longValue());
            }
            this.f30449a.D(iE);
            while (i16 < list.size()) {
                this.f30449a.F(((Long) list.get(i16)).longValue());
                i16++;
            }
            return;
        }
        xw xwVar = (xw) list;
        if (!z15) {
            while (i16 < xwVar.size()) {
                this.f30449a.E(i15, xwVar.f(i16));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int iE2 = 0;
        for (int i18 = 0; i18 < xwVar.size(); i18++) {
            iE2 += gv.e(xwVar.f(i18));
        }
        this.f30449a.D(iE2);
        while (i16 < xwVar.size()) {
            this.f30449a.F(xwVar.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void I(int i15, double d15) {
        this.f30449a.q(i15, Double.doubleToRawLongBits(d15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void J(int i15, List list) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            this.f30449a.m(i15, (yu) list.get(i16));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    @Deprecated
    public final void K(int i15) {
        this.f30449a.B(i15, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void L(int i15, long j15) {
        this.f30449a.E(i15, (j15 >> 63) ^ (j15 + j15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void a(int i15, int i16) {
        this.f30449a.C(i15, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void b(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof cw)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30449a.o(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Integer) list.get(i18)).getClass();
                i17 += 4;
            }
            this.f30449a.D(i17);
            while (i16 < list.size()) {
                this.f30449a.p(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        cw cwVar = (cw) list;
        if (!z15) {
            while (i16 < cwVar.size()) {
                this.f30449a.o(i15, cwVar.f(i16));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < cwVar.size(); i25++) {
            cwVar.f(i25);
            i19 += 4;
        }
        this.f30449a.D(i19);
        while (i16 < cwVar.size()) {
            this.f30449a.p(cwVar.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void c(int i15, long j15) {
        this.f30449a.q(i15, j15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void d(int i15, Object obj, ux uxVar) {
        gv gvVar = this.f30449a;
        gvVar.B(i15, 3);
        uxVar.c((jx) obj, gvVar.f30435a);
        gvVar.B(i15, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void e(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof xw)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30449a.q(i15, ((Long) list.get(i16)).longValue());
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Long) list.get(i18)).getClass();
                i17 += 8;
            }
            this.f30449a.D(i17);
            while (i16 < list.size()) {
                this.f30449a.r(((Long) list.get(i16)).longValue());
                i16++;
            }
            return;
        }
        xw xwVar = (xw) list;
        if (!z15) {
            while (i16 < xwVar.size()) {
                this.f30449a.q(i15, xwVar.f(i16));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < xwVar.size(); i25++) {
            xwVar.f(i25);
            i19 += 8;
        }
        this.f30449a.D(i19);
        while (i16 < xwVar.size()) {
            this.f30449a.r(xwVar.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void f(int i15, int i16) {
        this.f30449a.o(i15, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void g(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof cw)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30449a.C(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int iD = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iD += gv.d(((Integer) list.get(i17)).intValue());
            }
            this.f30449a.D(iD);
            while (i16 < list.size()) {
                this.f30449a.D(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        cw cwVar = (cw) list;
        if (!z15) {
            while (i16 < cwVar.size()) {
                this.f30449a.C(i15, cwVar.f(i16));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int iD2 = 0;
        for (int i18 = 0; i18 < cwVar.size(); i18++) {
            iD2 += gv.d(cwVar.f(i18));
        }
        this.f30449a.D(iD2);
        while (i16 < cwVar.size()) {
            this.f30449a.D(cwVar.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void h(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof xw)) {
            if (!z15) {
                while (i16 < list.size()) {
                    gv gvVar = this.f30449a;
                    long jLongValue = ((Long) list.get(i16)).longValue();
                    gvVar.E(i15, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int iE = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                long jLongValue2 = ((Long) list.get(i17)).longValue();
                iE += gv.e((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.f30449a.D(iE);
            while (i16 < list.size()) {
                gv gvVar2 = this.f30449a;
                long jLongValue3 = ((Long) list.get(i16)).longValue();
                gvVar2.F((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i16++;
            }
            return;
        }
        xw xwVar = (xw) list;
        if (!z15) {
            while (i16 < xwVar.size()) {
                gv gvVar3 = this.f30449a;
                long jF = xwVar.f(i16);
                gvVar3.E(i15, (jF >> 63) ^ (jF + jF));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int iE2 = 0;
        for (int i18 = 0; i18 < xwVar.size(); i18++) {
            long jF2 = xwVar.f(i18);
            iE2 += gv.e((jF2 >> 63) ^ (jF2 + jF2));
        }
        this.f30449a.D(iE2);
        while (i16 < xwVar.size()) {
            gv gvVar4 = this.f30449a;
            long jF3 = xwVar.f(i16);
            gvVar4.F((jF3 >> 63) ^ (jF3 + jF3));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void i(int i15, List list) {
        int i16 = 0;
        if (!(list instanceof tw)) {
            while (i16 < list.size()) {
                this.f30449a.z(i15, (String) list.get(i16));
                i16++;
            }
            return;
        }
        tw twVar = (tw) list;
        while (i16 < list.size()) {
            Object objM = twVar.m();
            if (objM instanceof String) {
                this.f30449a.z(i15, (String) objM);
            } else {
                this.f30449a.m(i15, (yu) objM);
            }
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void j(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof cw)) {
            if (!z15) {
                while (i16 < list.size()) {
                    gv gvVar = this.f30449a;
                    int iIntValue = ((Integer) list.get(i16)).intValue();
                    gvVar.C(i15, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int iD = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                int iIntValue2 = ((Integer) list.get(i17)).intValue();
                iD += gv.d((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f30449a.D(iD);
            while (i16 < list.size()) {
                gv gvVar2 = this.f30449a;
                int iIntValue3 = ((Integer) list.get(i16)).intValue();
                gvVar2.D((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i16++;
            }
            return;
        }
        cw cwVar = (cw) list;
        if (!z15) {
            while (i16 < cwVar.size()) {
                gv gvVar3 = this.f30449a;
                int iF = cwVar.f(i16);
                gvVar3.C(i15, (iF >> 31) ^ (iF + iF));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int iD2 = 0;
        for (int i18 = 0; i18 < cwVar.size(); i18++) {
            int iF2 = cwVar.f(i18);
            iD2 += gv.d((iF2 >> 31) ^ (iF2 + iF2));
        }
        this.f30449a.D(iD2);
        while (i16 < cwVar.size()) {
            gv gvVar4 = this.f30449a;
            int iF3 = cwVar.f(i16);
            gvVar4.D((iF3 >> 31) ^ (iF3 + iF3));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void k(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof iv)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30449a.q(i15, Double.doubleToRawLongBits(((Double) list.get(i16)).doubleValue()));
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Double) list.get(i18)).getClass();
                i17 += 8;
            }
            this.f30449a.D(i17);
            while (i16 < list.size()) {
                this.f30449a.r(Double.doubleToRawLongBits(((Double) list.get(i16)).doubleValue()));
                i16++;
            }
            return;
        }
        iv ivVar = (iv) list;
        if (!z15) {
            while (i16 < ivVar.size()) {
                this.f30449a.q(i15, Double.doubleToRawLongBits(ivVar.f(i16)));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < ivVar.size(); i25++) {
            ivVar.f(i25);
            i19 += 8;
        }
        this.f30449a.D(i19);
        while (i16 < ivVar.size()) {
            this.f30449a.r(Double.doubleToRawLongBits(ivVar.f(i16)));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void l(int i15, int i16) {
        this.f30449a.s(i15, i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void m(int i15, long j15) {
        this.f30449a.E(i15, j15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void n(int i15, float f15) {
        this.f30449a.o(i15, Float.floatToRawIntBits(f15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void o(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof cw)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30449a.s(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int iE = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iE += gv.e(((Integer) list.get(i17)).intValue());
            }
            this.f30449a.D(iE);
            while (i16 < list.size()) {
                this.f30449a.t(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        cw cwVar = (cw) list;
        if (!z15) {
            while (i16 < cwVar.size()) {
                this.f30449a.s(i15, cwVar.f(i16));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int iE2 = 0;
        for (int i18 = 0; i18 < cwVar.size(); i18++) {
            iE2 += gv.e(cwVar.f(i18));
        }
        this.f30449a.D(iE2);
        while (i16 < cwVar.size()) {
            this.f30449a.t(cwVar.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void p(int i15, Object obj) {
        if (obj instanceof yu) {
            this.f30449a.y(i15, (yu) obj);
        } else {
            this.f30449a.x(i15, (jx) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void q(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof cw)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30449a.o(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Integer) list.get(i18)).getClass();
                i17 += 4;
            }
            this.f30449a.D(i17);
            while (i16 < list.size()) {
                this.f30449a.p(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        cw cwVar = (cw) list;
        if (!z15) {
            while (i16 < cwVar.size()) {
                this.f30449a.o(i15, cwVar.f(i16));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < cwVar.size(); i25++) {
            cwVar.f(i25);
            i19 += 4;
        }
        this.f30449a.D(i19);
        while (i16 < cwVar.size()) {
            this.f30449a.p(cwVar.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void r(int i15, Object obj, ux uxVar) {
        this.f30449a.v(i15, (jx) obj, uxVar);
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
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void s(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof nu)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30449a.k(i15, ((Boolean) list.get(i16)).booleanValue());
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Boolean) list.get(i18)).getClass();
                i17++;
            }
            this.f30449a.D(i17);
            while (i16 < list.size()) {
                this.f30449a.j(((Boolean) list.get(i16)).booleanValue() ? (byte) 1 : (byte) 0);
                i16++;
            }
            return;
        }
        nu nuVar = (nu) list;
        if (!z15) {
            while (i16 < nuVar.size()) {
                this.f30449a.k(i15, nuVar.g(i16));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < nuVar.size(); i25++) {
            nuVar.g(i25);
            i19++;
        }
        this.f30449a.D(i19);
        while (i16 < nuVar.size()) {
            this.f30449a.j(nuVar.g(i16) ? (byte) 1 : (byte) 0);
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void t(int i15, String str) {
        this.f30449a.z(i15, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void u(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof cw)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30449a.s(i15, ((Integer) list.get(i16)).intValue());
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int iE = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                iE += gv.e(((Integer) list.get(i17)).intValue());
            }
            this.f30449a.D(iE);
            while (i16 < list.size()) {
                this.f30449a.t(((Integer) list.get(i16)).intValue());
                i16++;
            }
            return;
        }
        cw cwVar = (cw) list;
        if (!z15) {
            while (i16 < cwVar.size()) {
                this.f30449a.s(i15, cwVar.f(i16));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int iE2 = 0;
        for (int i18 = 0; i18 < cwVar.size(); i18++) {
            iE2 += gv.e(cwVar.f(i18));
        }
        this.f30449a.D(iE2);
        while (i16 < cwVar.size()) {
            this.f30449a.t(cwVar.f(i16));
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void v(int i15, bx bxVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f30449a.B(i15, 2);
            this.f30449a.D(cx.b(bxVar, entry.getKey(), entry.getValue()));
            cx.e(this.f30449a, bxVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    @Deprecated
    public final void w(int i15) {
        this.f30449a.B(i15, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void x(int i15, int i16) {
        this.f30449a.C(i15, (i16 >> 31) ^ (i16 + i16));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void y(int i15, boolean z15) {
        this.f30449a.k(i15, z15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.xy
    public final void z(int i15, List list, boolean z15) {
        int i16 = 0;
        if (!(list instanceof xw)) {
            if (!z15) {
                while (i16 < list.size()) {
                    this.f30449a.q(i15, ((Long) list.get(i16)).longValue());
                    i16++;
                }
                return;
            }
            this.f30449a.B(i15, 2);
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                ((Long) list.get(i18)).getClass();
                i17 += 8;
            }
            this.f30449a.D(i17);
            while (i16 < list.size()) {
                this.f30449a.r(((Long) list.get(i16)).longValue());
                i16++;
            }
            return;
        }
        xw xwVar = (xw) list;
        if (!z15) {
            while (i16 < xwVar.size()) {
                this.f30449a.q(i15, xwVar.f(i16));
                i16++;
            }
            return;
        }
        this.f30449a.B(i15, 2);
        int i19 = 0;
        for (int i25 = 0; i25 < xwVar.size(); i25++) {
            xwVar.f(i25);
            i19 += 8;
        }
        this.f30449a.D(i19);
        while (i16 < xwVar.size()) {
            this.f30449a.r(xwVar.f(i16));
            i16++;
        }
    }
}
