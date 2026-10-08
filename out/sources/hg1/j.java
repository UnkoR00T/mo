package hg1;

import a50.RadioButtonData;
import d1.a3;
import d1.r3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhg1/n;", "viewModel", "Loq/i0;", "q", "(Lhg1/n;Lm2/r;I)V", "Lhg1/n$a$d;", "data", "s", "(Lhg1/n$a$d;Lm2/r;I)V", "Lhg1/n$a$c;", "j", "(Lhg1/n$a$c;Lm2/r;I)V", "Lhg1/n$a$a;", "n", "(Lhg1/n$a$a;Lm2/r;I)V", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void j(final n.a.InitializedResumption initializedResumption, p076m2.r rVar, final int i15) {
        int i16;
        final n.a.InitializedResumption initializedResumption2;
        p076m2.r rVarH = rVar.h(-1334751913);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(initializedResumption) : rVarH.G(initializedResumption) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1334751913, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.suspensionperiod.ResumptionDateScreenContent (SuspensionPeriodScreen.kt:93)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 10, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            int i18 = i16;
            j70.h.g(null, null, initializedResumption.getResumptionDate().getTitle(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            x30.c.c(null, 0.0f, y2.m.d(843105440, true, new er.p() { // from class: hg1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(initializedResumption, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            initializedResumption2 = initializedResumption;
            r3.a(d1.h0.b(i0Var, companion, 1.0f, false, 2, null), rVarH, 0);
            h30.q.p(initializedResumption2.getNextButton(), false, null, rVarH, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVarH.x();
            boolean z15 = (i18 & 14) == 4 || ((i18 & 8) != 0 && rVarH.G(initializedResumption2));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: hg1.h
                    @Override // er.a
                    public final Object a() {
                        return j.l(initializedResumption2);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            initializedResumption2 = initializedResumption;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hg1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.m(initializedResumption2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(n.a.InitializedResumption initializedResumption, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(843105440, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.suspensionperiod.ResumptionDateScreenContent.<anonymous>.<anonymous> (SuspensionPeriodScreen.kt:111)");
            }
            v40.i.h(initializedResumption.getResumptionDate().getDateInputData(), rVar, InputDateTimeData.f203769m);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(n.a.InitializedResumption initializedResumption) {
        initializedResumption.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(n.a.InitializedResumption initializedResumption, int i15, p076m2.r rVar, int i16) {
        j(initializedResumption, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final n.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-889925716);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-889925716, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.suspensionperiod.SuspensionPeriodErrorScreen (SuspensionPeriodScreen.kt:126)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: hg1.b
                    @Override // er.a
                    public final Object a() {
                        return j.o();
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hg1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.p(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(n.a.Error error, int i15, p076m2.r rVar, int i16) {
        n(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final n nVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(177292992);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(nVar) : rVarH.G(nVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(177292992, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.suspensionperiod.SuspensionPeriodScreen (SuspensionPeriodScreen.kt:29)");
            }
            n.a aVar = (n.a) m7.b.c(nVar.getState(), null, null, null, rVarH, 0, 7).getValue();
            if (fr.t.c(aVar, n.a.b.f84409a)) {
                rVarH.X(-1420119375);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof n.a.InitializedSuspension) {
                rVarH.X(-1420116656);
                s((n.a.InitializedSuspension) aVar, rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof n.a.InitializedResumption) {
                rVarH.X(-1420112978);
                j((n.a.InitializedResumption) aVar, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof n.a.Error)) {
                    rVarH.X(-1420121712);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1420109874);
                n((n.a.Error) aVar, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: hg1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.r(nVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(n nVar, int i15, p076m2.r rVar, int i16) {
        q(nVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x02cd  */
    public static final void s(final n.a.InitializedSuspension initializedSuspension, p076m2.r rVar, final int i15) {
        int i16;
        boolean z15;
        Object objE;
        final n.a.InitializedSuspension initializedSuspension2 = initializedSuspension;
        p076m2.r rVarH = rVar.h(-186067318);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(initializedSuspension2) : rVarH.G(initializedSuspension2) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-186067318, i16, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.suspensionperiod.SuspensionPeriodScreenContent (SuspensionPeriodScreen.kt:43)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            int i18 = i16;
            f3.m mVarR = a3.r(t70.i.S(w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null), null, rVarH, 0, 1), aVar.b(rVarH, i17).getSpacing200(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 10, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, initializedSuspension2.getStartSuspensionPeriod().getTitle(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            x30.c.c(null, 0.0f, y2.m.d(1085775763, true, new er.p() { // from class: hg1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.t(initializedSuspension, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j70.h.g(null, null, initializedSuspension.getEndSuspensionPeriod().getTitle(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, initializedSuspension.getEndSuspensionPeriod().getDescription(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            a50.k.j(initializedSuspension.getEndSuspensionPeriod().getRadioButtonData(), rVarH, RadioButtonData.f3462h);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            c30.e.c(null, initializedSuspension.getAlertData(), rVarH, c30.b.f22944i << 3, 1);
            r3.a(d1.h0.b(i0Var, companion, 1.0f, false, 2, null), rVarH, 0);
            h30.q.p(initializedSuspension.getNextButton(), false, null, rVarH, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVarH.x();
            if ((i18 & 14) != 4) {
                if ((i18 & 8) != 0) {
                    initializedSuspension2 = initializedSuspension;
                    if (rVarH.G(initializedSuspension2)) {
                    }
                    objE = rVarH.E();
                    if (z15 || objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: hg1.e
                            @Override // er.a
                            public final Object a() {
                                return j.u(initializedSuspension2);
                            }
                        };
                        rVarH.v(objE);
                    }
                    p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    initializedSuspension2 = initializedSuspension;
                }
                z15 = false;
                objE = rVarH.E();
                if (z15) {
                    objE = new er.a() { // from class: hg1.e
                        @Override // er.a
                        public final Object a() {
                            return j.u(initializedSuspension2);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.a() { // from class: hg1.e
                        @Override // er.a
                        public final Object a() {
                            return j.u(initializedSuspension2);
                        }
                    };
                    rVarH.v(objE);
                }
                p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                initializedSuspension2 = initializedSuspension;
            }
            z15 = true;
            objE = rVarH.E();
            if (z15) {
                objE = new er.a() { // from class: hg1.e
                    @Override // er.a
                    public final Object a() {
                        return j.u(initializedSuspension2);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.a() { // from class: hg1.e
                    @Override // er.a
                    public final Object a() {
                        return j.u(initializedSuspension2);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hg1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.v(initializedSuspension2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(n.a.InitializedSuspension initializedSuspension, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1085775763, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.suspensionperiod.SuspensionPeriodScreenContent.<anonymous>.<anonymous> (SuspensionPeriodScreen.kt:62)");
            }
            v40.i.h(initializedSuspension.getStartSuspensionPeriod().getDateInputData(), rVar, InputDateTimeData.f203769m);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(n.a.InitializedSuspension initializedSuspension) {
        initializedSuspension.d().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(n.a.InitializedSuspension initializedSuspension, int i15, p076m2.r rVar, int i16) {
        s(initializedSuspension, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
