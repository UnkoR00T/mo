package of3;

import d1.a3;
import d1.d3;
import d1.r3;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import rf3.CollisionDataFields;
import rf3.CollisionDataScreenContent;
import t50.TextAreaData;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lof3/c;", "viewModel", "Loq/i0;", "p", "(Lof3/c;Lm2/r;I)V", "Lof3/c$a;", "data", "k", "(Lof3/c$a;Lm2/r;I)V", "Lof3/c$a$b;", "m", "(Lof3/c$a$b;Lm2/r;I)V", "Lrf3/b;", "content", "s", "(Lrf3/b;Lm2/r;I)V", "y", "Lrf3/b$a;", "v", "(Lrf3/b$a;Lm2/r;I)V", "state", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(CollisionDataScreenContent collisionDataScreenContent, int i15, p076m2.r rVar, int i16) {
        y(collisionDataScreenContent, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(338880920);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(338880920, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.collisiondata.CollisionDataContent (CollisionDataScreen.kt:50)");
            }
            if (aVar instanceof c.a.C3607a) {
                rVarH.X(-1866499128);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.Initialized)) {
                    rVarH.X(-752948041);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-752944602);
                m((c.a.Initialized) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: of3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(c.a aVar, int i15, p076m2.r rVar, int i16) {
        k(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-2057057907);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2057057907, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.collisiondata.CollisionDataInitialized (CollisionDataScreen.kt:61)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(406223162, true, new er.q() { // from class: of3.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.n(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: of3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.o(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(406223162, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.collisiondata.CollisionDataInitialized.<anonymous> (CollisionDataScreen.kt:66)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200(), 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarR2 = a3.r(t70.i.S(d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR2);
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            s(initialized.getCollisionDataScreenContent(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            y(initialized.getCollisionDataScreenContent(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v(initialized.getCollisionDataScreenContent().getDescription(), rVar, TextAreaData.f187694o);
            rVar.x();
            f3.m mVarR3 = a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 0.0f, 13, null);
            w0 w0VarA3 = d1.e0.a(iVar.d(), companion2.k(), rVar, 6);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarR3);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            p076m2.r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarA3, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(initialized.getCollisionDataScreenContent().getNextButton(), null, 2, null), k30.d.a.f107773a, null, initialized.c(), 35, null), false, null, rVar, 0, 6);
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
    public static final oq.i0 o(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        m(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(28367785);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(28367785, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.collisiondata.CollisionDataScreen (CollisionDataScreen.kt:39)");
            }
            k(q(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: of3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.r(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a q(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(c cVar, int i15, p076m2.r rVar, int i16) {
        p(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void s(CollisionDataScreenContent collisionDataScreenContent, p076m2.r rVar, final int i15) {
        int i16;
        final CollisionDataScreenContent collisionDataScreenContent2;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-513118909);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(collisionDataScreenContent) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-513118909, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.collisiondata.DateContent (CollisionDataScreen.kt:121)");
            }
            Label dateTitle = collisionDataScreenContent.getDateTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, dateTitle, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            collisionDataScreenContent2 = collisionDataScreenContent;
            x30.c.c(null, 0.0f, y2.m.d(-246800732, true, new er.p() { // from class: of3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.t(collisionDataScreenContent2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            collisionDataScreenContent2 = collisionDataScreenContent;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: of3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.u(collisionDataScreenContent2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(CollisionDataScreenContent collisionDataScreenContent, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-246800732, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.collisiondata.DateContent.<anonymous> (CollisionDataScreen.kt:128)");
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
            InputDateTimeData dateCollisionInputData = collisionDataScreenContent.getDateCollisionInputData();
            int i16 = InputDateTimeData.f203769m;
            v40.i.h(dateCollisionInputData, rVar, i16);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            v40.i.h(collisionDataScreenContent.getTimeCollisionInputData(), rVar, i16);
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
    public static final oq.i0 u(CollisionDataScreenContent collisionDataScreenContent, int i15, p076m2.r rVar, int i16) {
        s(collisionDataScreenContent, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void v(CollisionDataScreenContent.DescriptionData descriptionData, p076m2.r rVar, final int i15) {
        int i16;
        final CollisionDataScreenContent.DescriptionData descriptionData2;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-163480554);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(descriptionData) : rVarH.G(descriptionData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-163480554, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.collisiondata.DescriptionContent (CollisionDataScreen.kt:164)");
            }
            Label title = descriptionData.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            f3.m.Companion companion = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            j70.h.g(null, null, descriptionData.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            descriptionData2 = descriptionData;
            x30.c.c(null, 0.0f, y2.m.d(1269499383, true, new er.p() { // from class: of3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.w(descriptionData2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            descriptionData2 = descriptionData;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: of3.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.x(descriptionData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(CollisionDataScreenContent.DescriptionData descriptionData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1269499383, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.collisiondata.DescriptionContent.<anonymous> (CollisionDataScreen.kt:179)");
            }
            t50.r.m(descriptionData.getTextAreaData(), null, rVar, TextAreaData.f187694o, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(CollisionDataScreenContent.DescriptionData descriptionData, int i15, p076m2.r rVar, int i16) {
        v(descriptionData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void y(CollisionDataScreenContent collisionDataScreenContent, p076m2.r rVar, final int i15) {
        int i16;
        final CollisionDataScreenContent collisionDataScreenContent2;
        p076m2.r rVarH = rVar.h(-1176002650);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(collisionDataScreenContent) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1176002650, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.collisiondata.PlaceContent (CollisionDataScreen.kt:141)");
            }
            Label locationTitle = collisionDataScreenContent.getLocationTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, locationTitle, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            collisionDataScreenContent2 = collisionDataScreenContent;
            d60.m.c(CollisionDataFields.b.CRASH_LOCATION, y2.m.d(-68366310, true, new er.p() { // from class: of3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.z(collisionDataScreenContent2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 54);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            collisionDataScreenContent2 = collisionDataScreenContent;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: of3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.A(collisionDataScreenContent2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(CollisionDataScreenContent collisionDataScreenContent, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-68366310, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.collisiondata.PlaceContent.<anonymous> (CollisionDataScreen.kt:152)");
            }
            n50.h0.v(collisionDataScreenContent.getLocationSingleCard(), null, rVar, 0, 2);
            Label locationError = collisionDataScreenContent.getLocationError();
            if (locationError == null) {
                rVar.X(-886150432);
                rVar.R();
            } else {
                rVar.X(-886150431);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing50()), rVar, 0);
                l40.d.d(null, locationError, false, rVar, 0, 5);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
