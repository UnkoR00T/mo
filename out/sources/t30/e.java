package t30;

import androidx.compose.ui.graphics.Color;
import d1.e0;
import d1.h0;
import d1.i0;
import d1.m3;
import d1.q3;
import d1.r3;
import er.p;
import i30.ButtonIconData;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;
import r30.CheckBoxRowData;
import u30.CheckBoxGroupData;
import u30.CheckBoxHeaderData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0004\u001a+\u0010\u000b\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lu30/a;", "data", "Loq/i0;", "e", "(Lu30/a;Lm2/r;I)V", "h", "Ld1/h0;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "onHelperButtonClick", "j", "(Ld1/h0;Lmx/a;Ler/a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f187409a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(615472545);
            if (t.k()) {
                t.o(615472545, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.group.LabelRow.<anonymous>.<anonymous>.<anonymous> (GroupCheckBox.kt:81)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187410a;

        static {
            int[] iArr = new int[r30.c.values().length];
            try {
                iArr[r30.c.CONTENT_BOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r30.c.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f187410a = iArr;
        }
    }

    public static final void e(final CheckBoxGroupData checkBoxGroupData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(948492383);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(checkBoxGroupData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(948492383, i16, -1, "pl.gov.coi.common.ui.ds.checkbox.group.CheckBoxGroup (GroupCheckBox.kt:32)");
            }
            f3.m mVarE = d60.m.e(f3.m.INSTANCE, checkBoxGroupData.getFieldIndex(), rVarH, 6);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarE);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE2, companion.e());
            i0 i0Var = i0.f39176a;
            CheckBoxHeaderData header = checkBoxGroupData.getHeader();
            if (header == null) {
                rVarH.X(-854043053);
            } else {
                rVarH.X(-854043052);
                j(i0Var, header.getLabel(), header.b(), rVarH, 6);
            }
            rVarH.R();
            int i17 = b.f187410a[checkBoxGroupData.getContentType().ordinal()];
            if (i17 == 1) {
                rVarH.X(2050666357);
                x30.c.c(null, 0.0f, y2.m.d(-1716725211, true, new p() { // from class: t30.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return e.f(checkBoxGroupData, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
                rVarH.R();
            } else {
                if (i17 != 2) {
                    rVarH.X(2050664360);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(2050669624);
                h(checkBoxGroupData, rVarH, i16 & 14);
                rVarH.R();
            }
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: t30.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.g(checkBoxGroupData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(CheckBoxGroupData checkBoxGroupData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1716725211, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.group.CheckBoxGroup.<anonymous>.<anonymous> (GroupCheckBox.kt:45)");
            }
            h(checkBoxGroupData, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(CheckBoxGroupData checkBoxGroupData, int i15, r rVar, int i16) {
        e(checkBoxGroupData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void h(final CheckBoxGroupData checkBoxGroupData, r rVar, final int i15) {
        r rVarH = rVar.h(-1384225315);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(checkBoxGroupData) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1384225315, i16, -1, "pl.gov.coi.common.ui.ds.checkbox.group.GroupCheckBoxContainerContent (GroupCheckBox.kt:54)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            i0 i0Var = i0.f39176a;
            rVarH.X(-105901480);
            int i17 = 0;
            for (Object obj : checkBoxGroupData.a()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    v.x();
                }
                q30.i.g((CheckBoxRowData) obj, checkBoxGroupData.getType(), checkBoxGroupData.getIsEnabled(), rVarH, 0);
                if (i17 != v.p(checkBoxGroupData.a())) {
                    rVarH.X(-1855836715);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing250()), rVarH, 0);
                } else {
                    rVarH.X(-1858090167);
                }
                rVarH.R();
                i17 = i18;
            }
            rVarH.R();
            q30.b.b(checkBoxGroupData.getType(), rVarH, 0);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: t30.c
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return e.i(checkBoxGroupData, i15, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(CheckBoxGroupData checkBoxGroupData, int i15, r rVar, int i16) {
        h(checkBoxGroupData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void j(final h0 h0Var, Label label, er.a<oq.i0> aVar, r rVar, final int i15) {
        int i16;
        final Label label2;
        k70.a aVar2;
        int i17;
        f3.m.Companion companion;
        int i18;
        final er.a<oq.i0> aVar3 = aVar;
        r rVarH = rVar.h(1528997551);
        if ((i15 & 48) == 0) {
            i16 = (rVarH.W(label) ? 32 : 16) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar3) ? 256 : 128;
        }
        if (rVarH.r((i16 & 145) != 144, i16 & 1)) {
            if (t.k()) {
                t.o(1528997551, i16, -1, "pl.gov.coi.common.ui.ds.checkbox.group.LabelRow (GroupCheckBox.kt:67)");
            }
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            f3.m.Companion companion2 = f3.m.INSTANCE;
            w0 w0VarB = m3.b(d1.i.f39152a.j(), interfaceC1317cI, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion2);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            int iF = b5.j.INSTANCE.f();
            k70.a aVar4 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, aVar4.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(iF), 0L, 0, false, 0, 0, null, aVar4.f(rVarH, i19).p(), null, null, false, false, null, rVarH, (i16 << 3) & 896, 0, 0, 33026011);
            label2 = label;
            if (aVar == null) {
                rVarH.X(1007059590);
                rVarH.R();
                aVar3 = aVar;
                rVarH = rVarH;
                companion = companion2;
                aVar2 = aVar4;
                i17 = i19;
                i18 = 0;
            } else {
                rVarH.X(1007059591);
                aVar2 = aVar4;
                i17 = i19;
                companion = companion2;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.y(companion, aVar2.b(rVarH, i17).getSpacing50()), rVarH, 0);
                aVar3 = aVar;
                rVarH = rVarH;
                i30.g.f(new ButtonIconData(null, jz.a.f106752d0, a.f187409a, null, null, aVar, 25, null), false, false, rVarH, 0, 6);
                rVarH.R();
            }
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, i18);
            if (t.k()) {
                t.n();
            }
        } else {
            label2 = label;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: t30.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.k(h0Var, label2, aVar3, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(h0 h0Var, Label label, er.a aVar, int i15, r rVar, int i16) {
        j(h0Var, label, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
