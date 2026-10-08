package a50;

import androidx.compose.ui.graphics.Color;
import d1.e0;
import d1.i0;
import d1.m3;
import d1.q3;
import d1.r3;
import er.p;
import er.q;
import f3.m;
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
import p114t0.l;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0006\u0010\u0004\u001a)\u0010\u000b\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"La50/a;", "data", "Loq/i0;", "j", "(La50/a;Lm2/r;I)V", "l", "o", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "onClickHelperIcon", "t", "(Lmx/a;Ler/a;Lm2/r;I)V", "Lb50/d;", "supportText", "x", "(Lb50/d;Lm2/r;I)V", "errorText", "q", "(Lmx/a;Lm2/r;I)V", "helperText", "v", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3487a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-2101272184);
            if (t.k()) {
                t.o(-2101272184, i15, -1, "pl.gov.coi.common.ui.ds.radiobutton.RadioButtonHeader.<anonymous>.<anonymous>.<anonymous> (RadioButton.kt:99)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jC;
        }
    }

    public static final void j(final RadioButtonData radioButtonData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-70875645);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(radioButtonData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-70875645, i16, -1, "pl.gov.coi.common.ui.ds.radiobutton.RadioButton (RadioButton.kt:37)");
            }
            m mVarE = d60.m.e(m.INSTANCE, radioButtonData.getFieldIndex(), rVarH, 6);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE2 = f3.j.e(rVarH, mVarE);
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
            t(radioButtonData.getLabel(), radioButtonData.e(), rVarH, 0);
            b50.e radioButtonVariant = radioButtonData.getRadioButtonVariant();
            if (radioButtonVariant instanceof b50.e.b) {
                rVarH.X(1062462348);
                o(radioButtonData, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(radioButtonVariant instanceof b50.e.a)) {
                    rVarH.X(1062460199);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1062464719);
                l(radioButtonData, rVarH, i16 & 14);
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
            d5VarM.a(new p() { // from class: a50.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(radioButtonData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(RadioButtonData radioButtonData, int i15, r rVar, int i16) {
        j(radioButtonData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void l(final RadioButtonData radioButtonData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1195719599);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(radioButtonData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1195719599, i16, -1, "pl.gov.coi.common.ui.ds.radiobutton.RadioButtonContentBox (RadioButton.kt:55)");
            }
            x30.c.c(null, 0.0f, y2.m.d(-860623216, true, new p() { // from class: a50.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.m(radioButtonData, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a50.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.n(radioButtonData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(RadioButtonData radioButtonData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-860623216, i15, -1, "pl.gov.coi.common.ui.ds.radiobutton.RadioButtonContentBox.<anonymous> (RadioButton.kt:57)");
            }
            m mVarB = k1.c.b(m.INSTANCE);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = f3.j.e(rVar, mVarB);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            i0 i0Var = i0.f39176a;
            o(radioButtonData, rVar, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(RadioButtonData radioButtonData, int i15, r rVar, int i16) {
        l(radioButtonData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    private static final void o(final RadioButtonData radioButtonData, r rVar, final int i15) {
        int i16;
        Label label;
        Label label2;
        r rVarH = rVar.h(1997018720);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(radioButtonData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1997018720, i16, -1, "pl.gov.coi.common.ui.ds.radiobutton.RadioButtonDefault (RadioButton.kt:66)");
            }
            if (radioButtonData.getAdditionalContentDescription() != null) {
                label2 = radioButtonData.getAdditionalContentDescription();
            } else {
                Label label3 = radioButtonData.getLabel();
                if ((label3 != null ? label3.getText() : null) == null || radioButtonData.getLabel().getText().length() > 20) {
                    label = null;
                } else {
                    label2 = radioButtonData.getLabel();
                }
                g50.b.b(radioButtonData.c(), radioButtonData.getSupportText(), label, rVarH, 0, 0);
                x(radioButtonData.getSupportText(), rVarH, 0);
                if (t.k()) {
                    t.n();
                }
            }
            label = label2;
            g50.b.b(radioButtonData.c(), radioButtonData.getSupportText(), label, rVarH, 0, 0);
            x(radioButtonData.getSupportText(), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a50.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.p(radioButtonData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(RadioButtonData radioButtonData, int i15, r rVar, int i16) {
        o(radioButtonData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void q(final Label label, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1222950660);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1222950660, i16, -1, "pl.gov.coi.common.ui.ds.radiobutton.RadioButtonError (RadioButton.kt:119)");
            }
            p114t0.k.g(true, null, null, null, null, y2.m.d(-440645676, true, new q() { // from class: a50.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.r(label, (l) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196614, 30);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a50.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.s(label, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(Label label, l lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-440645676, i15, -1, "pl.gov.coi.common.ui.ds.radiobutton.RadioButtonError.<anonymous> (RadioButton.kt:121)");
        }
        m.Companion companion = m.INSTANCE;
        w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
        int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
        p076m2.e0 e0VarT = rVar.t();
        m mVarE = f3.j.e(rVar, companion);
        androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
        er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
        if (rVar.l() == null) {
            p076m2.m.d();
        }
        rVar.K();
        if (rVar.getInserting()) {
            rVar.H(aVarB);
        } else {
            rVar.u();
        }
        r rVarC = n6.c(rVar);
        n6.i(rVarC, w0VarA, companion2.d());
        n6.i(rVarC, e0VarT, companion2.f());
        n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
        n6.g(rVarC, companion2.a());
        n6.i(rVarC, mVarE, companion2.e());
        i0 i0Var = i0.f39176a;
        r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
        l40.d.d(null, label, false, rVar, 0, 5);
        rVar.x();
        if (t.k()) {
            t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(Label label, int i15, r rVar, int i16) {
        q(label, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void t(Label label, er.a<oq.i0> aVar, r rVar, final int i15) {
        int i16;
        m.Companion companion;
        r rVar2;
        final Label label2 = label;
        final er.a<oq.i0> aVar2 = aVar;
        r rVarH = rVar.h(1850598701);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label2) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1850598701, i16, -1, "pl.gov.coi.common.ui.ds.radiobutton.RadioButtonHeader (RadioButton.kt:84)");
            }
            m.Companion companion2 = m.INSTANCE;
            w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, companion2);
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
            if (label2 == null) {
                rVarH.X(-1754958252);
                rVarH.R();
                companion = companion2;
                rVar2 = rVarH;
            } else {
                rVarH.X(-1754958251);
                k70.a aVar3 = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                companion = companion2;
                j70.h.g(null, null, label2, null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).p(), null, null, false, false, null, rVarH, (i16 << 6) & 896, 0, 0, 33030107);
                rVar2 = rVarH;
                rVar2.R();
            }
            k70.a aVar4 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            m.Companion companion4 = companion;
            r3.a(androidx.compose.foundation.layout.d.y(companion4, aVar4.b(rVar2, i18).getSpacing50()), rVar2, 0);
            if (aVar == null) {
                rVar2.X(-1754701169);
                rVar2.R();
                aVar2 = aVar;
                rVarH = rVar2;
            } else {
                rVar2.X(-1754701168);
                aVar2 = aVar;
                rVarH = rVar2;
                i30.g.f(new ButtonIconData(null, jz.a.f106752d0, a.f3487a, null, null, aVar, 25, null), false, false, rVarH, 0, 6);
                rVarH.R();
            }
            rVarH.x();
            if (label2 == 0 && aVar2 == null) {
                rVarH.X(982814229);
            } else {
                rVarH.X(986331241);
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar4.b(rVarH, i18).getSpacing200()), rVarH, 0);
            }
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            label2 = label2;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a50.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.u(label2, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(Label label, er.a aVar, int i15, r rVar, int i16) {
        t(label, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void v(Label label, r rVar, final int i15) {
        int i16;
        final Label label2;
        r rVarH = rVar.h(-323860853);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-323860853, i16, -1, "pl.gov.coi.common.ui.ds.radiobutton.RadioButtonHelperText (RadioButton.kt:131)");
            }
            if (label.l()) {
                rVarH.X(-1642038942);
                r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
                label2 = label;
                p40.b.b(null, label2, false, rVarH, (i16 << 3) & 112, 5);
            } else {
                label2 = label;
                rVarH.X(-1646311145);
            }
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            label2 = label;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a50.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.w(label2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(Label label, int i15, r rVar, int i16) {
        v(label, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void x(final b50.d dVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(74204855);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(74204855, i16, -1, "pl.gov.coi.common.ui.ds.radiobutton.RadioButtonSupportText (RadioButton.kt:110)");
            }
            if (dVar instanceof b50.d.Helper) {
                rVarH.X(-1703574319);
                v(((b50.d.Helper) dVar).getHelperText(), rVarH, 0);
                rVarH.R();
            } else if (dVar instanceof b50.d.Error) {
                rVarH.X(-1703571254);
                q(((b50.d.Error) dVar).getErrorText(), rVarH, 0);
                rVarH.R();
            } else {
                if (!fr.t.c(dVar, b50.d.c.f16683a)) {
                    rVarH.X(-1703576019);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1703568581);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a50.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.y(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(b50.d dVar, int i15, r rVar, int i16) {
        x(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
