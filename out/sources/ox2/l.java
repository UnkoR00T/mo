package ox2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import ju.p0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lox2/c;", "viewModel", "Loq/i0;", "p", "(Lox2/c;Lm2/r;I)V", "Lox2/c$a$b;", "data", "k", "(Lox2/c$a$b;Lm2/r;I)V", "Lj40/a;", "Lj1/a;", "requester", "h", "(Lj40/a;Lj1/a;Lm2/r;I)V", "Lox2/c$a;", "state", "physicalidcardapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.a.Initialized f150528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f150529g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a.Initialized initialized, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f150528f = initialized;
            this.f150529g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f150527e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f150528f.getScrollToDropdownField()) {
                    j1.a aVar = this.f150529g;
                    this.f150527e = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f150528f.c().a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f150528f, this.f150529g, eVar);
        }
    }

    private static final void h(final DropDownButtonData dropDownButtonData, final j1.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1111888697);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dropDownButtonData) : rVarH.G(dropDownButtonData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1111888697, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.reasonforapplying.ReasonDropdownInput (ReasonForApplyingScreen.kt:108)");
            }
            x30.c.c(j1.e.b(f3.m.INSTANCE, aVar), 0.0f, y2.m.d(-1227028104, true, new er.p() { // from class: ox2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.i(dropDownButtonData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ox2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.j(dropDownButtonData, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(DropDownButtonData dropDownButtonData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1227028104, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.reasonforapplying.ReasonDropdownInput.<anonymous> (ReasonForApplyingScreen.kt:112)");
            }
            j40.l.m(dropDownButtonData, rVar, DropDownButtonData.f99359i);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(DropDownButtonData dropDownButtonData, j1.a aVar, int i15, p076m2.r rVar, int i16) {
        h(dropDownButtonData, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void k(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1012251458);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1012251458, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.reasonforapplying.ReasonForApplyingContent (ReasonForApplyingScreen.kt:49)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVarH.v(objE);
            }
            final j1.a aVar = (j1.a) objE;
            Boolean boolValueOf = Boolean.valueOf(initialized.getScrollToDropdownField());
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(initialized))) | rVarH.G(aVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(initialized, aVar, null);
                rVarH.v(objE2);
            }
            Function0.d(boolValueOf, (er.p) objE2, rVarH, 0);
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(197080367, true, new er.q() { // from class: ox2.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.l(f3VarB, initialized, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ox2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.o(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f3 f3Var, c.a.Initialized initialized, j1.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(197080367, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.reasonforapplying.ReasonForApplyingContent.<anonymous> (ReasonForApplyingScreen.kt:61)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarL, aVar2.b(rVar, i17).getSpacing200(), 0.0f, aVar2.b(rVar, i17).getSpacing200(), aVar2.b(rVar, i17).getSpacing200(), 2, null);
            Object objE = rVar.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new er.l() { // from class: ox2.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.m((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(mVarR, false, (er.l) objE, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarR2 = a3.r(t70.i.S(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), f3Var, rVar, 0, 0), 0.0f, aVar2.b(rVar, i17).getSpacing100(), 0.0f, aVar2.b(rVar, i17).getSpacing200(), 5, null);
            Object objE2 = rVar.E();
            if (objE2 == companion2.a()) {
                objE2 = new er.l() { // from class: ox2.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.n((n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            f3.m mVarD2 = n4.v.d(mVarR2, false, (er.l) objE2, 1, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion3.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarD2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            j70.h.g(null, null, initialized.getTitle(), null, null, aVar2.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            h(initialized.getReasonDropDownButtonData(), aVar, rVar, DropDownButtonData.f99359i);
            c30.b alertData = initialized.getAlertData();
            if (alertData == null) {
                rVar.X(-1360984004);
            } else {
                rVar.X(-1360984003);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
                c30.e.c(null, alertData, rVar, c30.b.f22944i << 3, 1);
                i0 i0Var = i0.f148189a;
            }
            rVar.R();
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(initialized.getButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        k(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-926558583);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-926558583, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.reasonforapplying.ReasonForApplyingScreen (ReasonForApplyingScreen.kt:38)");
            }
            c.a aVarQ = q(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarQ, c.a.C3712a.f150501a)) {
                rVarH.X(-1364561203);
                rVarH.R();
            } else {
                if (!(aVarQ instanceof c.a.Initialized)) {
                    rVarH.X(-1364563400);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1364559250);
                k((c.a.Initialized) aVarQ, rVarH, 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ox2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.r(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a q(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(c cVar, int i15, p076m2.r rVar, int i16) {
        p(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
