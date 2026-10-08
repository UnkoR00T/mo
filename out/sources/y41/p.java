package y41;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.List;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u50.v0;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0012\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, d2 = {"Ly41/c;", "viewModel", "Loq/i0;", "C", "(Ly41/c;Lm2/r;I)V", "Ly41/c$a$c;", "data", "v", "(Ly41/c$a$c;Lm2/r;I)V", "Ly41/c$b$c;", "t", "(Ly41/c$b$c;Lm2/r;I)V", "Ly41/c$b$a;", "m", "(Ly41/c$b$a;Lm2/r;I)V", "", "Ly41/c$c;", "list", "q", "(Ljava/util/List;Lm2/r;I)V", "Ly41/c$b$b;", "o", "(Ly41/c$b$b;Lm2/r;I)V", "Ly41/c$a;", "state", "childbirthregistration_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(c.a.Initialized initialized) {
        initialized.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        v(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void C(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1820188303);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1820188303, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.parentsdata.ParentsDataScreen (ParentsDataScreen.kt:38)");
            }
            c.a aVarD = D(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarD instanceof c.a.b) {
                rVarH.X(-1149263390);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarD instanceof c.a.Initialized) {
                rVarH.X(-1149261040);
                v((c.a.Initialized) aVarD, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarD instanceof c.a.Error)) {
                    rVarH.X(-1149265433);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1149258183);
                ((c.a.Error) aVarD).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: y41.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.E(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a D(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(c cVar, int i15, p076m2.r rVar, int i16) {
        C(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final c.b.Certificate certificate, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(347564175);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(certificate) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(347564175, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.parentsdata.CertificateSection (ParentsDataScreen.kt:108)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, certificate.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            q(certificate.a(), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y41.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.n(certificate, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(c.b.Certificate certificate, int i15, p076m2.r rVar, int i16) {
        m(certificate, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final c.b.Father father, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-879792493);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(father) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-879792493, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.parentsdata.FatherName (ParentsDataScreen.kt:142)");
            }
            Label title = father.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            f3.m.Companion companion = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, father.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            q(father.b(), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y41.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.p(father, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(c.b.Father father, int i15, p076m2.r rVar, int i16) {
        o(father, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final List<? extends c.InterfaceC5990c> list, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-538650543);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-538650543, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.parentsdata.ListSection (ParentsDataScreen.kt:121)");
            }
            x30.c.c(null, 0.0f, y2.m.d(-613159856, true, new er.p() { // from class: y41.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.r(list, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y41.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.s(list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(List list, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-613159856, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.parentsdata.ListSection.<anonymous> (ParentsDataScreen.kt:123)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar.X(-475321907);
            int size = list.size();
            for (int i16 = 0; i16 < size; i16++) {
                c.InterfaceC5990c interfaceC5990c = (c.InterfaceC5990c) list.get(i16);
                if (interfaceC5990c instanceof c.InterfaceC5990c.Date) {
                    rVar.X(-1469353000);
                    v40.i.h(((c.InterfaceC5990c.Date) interfaceC5990c).getData(), rVar, InputDateTimeData.f203769m);
                    rVar.R();
                } else if (interfaceC5990c instanceof c.InterfaceC5990c.DropDown) {
                    rVar.X(-1469350727);
                    j40.l.m(((c.InterfaceC5990c.DropDown) interfaceC5990c).getData(), rVar, DropDownButtonData.f99359i);
                    rVar.R();
                } else {
                    if (!(interfaceC5990c instanceof c.InterfaceC5990c.Text)) {
                        rVar.X(-1469354591);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(-1469348556);
                    v0.g(((c.InterfaceC5990c.Text) interfaceC5990c).getData(), null, rVar, v50.c.f203957t, 2);
                    rVar.R();
                }
                if (i16 != list.size() - 1) {
                    rVar.X(1694904586);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
                } else {
                    rVar.X(1690468610);
                }
                rVar.R();
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(List list, int i15, p076m2.r rVar, int i16) {
        q(list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void t(final c.b.Parent parent, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(184565107);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(parent) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(184565107, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.parentsdata.ParentDataSection (ParentsDataScreen.kt:96)");
            }
            Label title = parent.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            q(parent.a(), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y41.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.u(parent, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(c.b.Parent parent, int i15, p076m2.r rVar, int i16) {
        t(parent, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void v(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1427255644);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1427255644, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.parentsdata.ParentsDataContent (ParentsDataScreen.kt:52)");
            }
            i50.s.r(initialized.getBaseScaffoldData(), y2.m.d(1021449167, true, new er.p() { // from class: y41.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.w(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1878178089, true, new er.q() { // from class: y41.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.y(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: y41.i
                    @Override // er.a
                    public final Object a() {
                        return p.A(initialized);
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
            d5VarM.a(new er.p() { // from class: y41.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.B(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(c.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1021449167, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.parentsdata.ParentsDataContent.<anonymous> (ParentsDataScreen.kt:56)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: y41.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.x((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(mVarN, false, (er.l) objE, 1, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(initialized.getNextButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1878178089, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.parentsdata.ParentsDataContent.<anonymous> (ParentsDataScreen.kt:67)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: y41.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.z((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(t70.s.n(t70.i.S(a3.l(companion, d3Var), null, rVar, 0, 1), rVar, 0), 0.0f, 1, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarF);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar.X(290534360);
            List<c.b> listD = initialized.d();
            int size = listD.size();
            for (int i16 = 0; i16 < size; i16++) {
                c.b bVar = listD.get(i16);
                if (bVar instanceof c.b.Certificate) {
                    rVar.X(-233106059);
                    m((c.b.Certificate) bVar, rVar, 0);
                    rVar.R();
                } else if (bVar instanceof c.b.Father) {
                    rVar.X(-233103763);
                    o((c.b.Father) bVar, rVar, 0);
                    rVar.R();
                } else {
                    if (!(bVar instanceof c.b.Parent)) {
                        rVar.X(-233107741);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(-233101708);
                    t((c.b.Parent) bVar, rVar, 0);
                    rVar.R();
                }
            }
            rVar.R();
            rVar.x();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }
}
