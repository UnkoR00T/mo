package e84;

import d1.a3;
import d1.d3;
import d1.r3;
import g84.Initialized;
import g84.NoPermission;
import i50.BaseScaffoldData;
import java.util.Iterator;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012²\u0006\f\u0010\u000e\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Le84/z;", "viewModel", "Loq/i0;", "s", "(Le84/z;Lm2/r;I)V", "Lg84/a;", "notificationSettingsModel", "k", "(Lg84/a;Lm2/r;I)V", "Lg84/c;", "notificationSettingsSectionData", "i", "(Lg84/c;Lm2/r;I)V", "Lg84/b;", "data", "o", "(Lg84/b;Lm2/r;I)V", "Le84/z$a;", "notifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {
    private static final void i(final g84.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(496768904);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(496768904, i16, -1, "pl.gov.coi.shared.feature.notificationsettings.presentation.NotificationSectionContent (NotificationSettingsScreen.kt:100)");
            }
            Label header = cVar.getHeader();
            if (header == null || !header.l()) {
                rVarH.X(-1218532518);
            } else {
                rVarH.X(-1214697198);
                Label header2 = cVar.getHeader();
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                j70.h.g(a3.r(f3.m.INSTANCE, 0.0f, aVar.b(rVarH, i17).getSpacing250(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null), null, header2, null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.d()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).h(), null, null, false, false, null, rVarH, 0, 0, 0, 33026042);
                rVarH = rVarH;
            }
            rVarH.R();
            m30.i.d(cVar.getNotificationSettingCardList(), null, null, rVarH, 0, 6);
            rVar2 = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: e84.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.j(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(g84.c cVar, int i15, p076m2.r rVar, int i16) {
        i(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-777433877);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-777433877, i16, -1, "pl.gov.coi.shared.feature.notificationsettings.presentation.NotificationSettingsContent (NotificationSettingsScreen.kt:53)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2112484248, true, new er.q() { // from class: e84.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return w.l(f3VarB, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: e84.p
                    @Override // er.a
                    public final Object a() {
                        return w.m(initialized);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: e84.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.n(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(f3 f3Var, Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2112484248, i16, -1, "pl.gov.coi.shared.feature.notificationsettings.presentation.NotificationSettingsContent.<anonymous> (NotificationSettingsScreen.kt:59)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), f3Var, rVar, 6, 0), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(mVarL, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
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
            j70.h.g(a3.r(companion, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i17).getSpacing200(), 7, null), null, initialized.getInfoText(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.d()), 0L, b5.v.INSTANCE.b(), false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 24576, 0, 33009658);
            rVar.X(-1149264719);
            Iterator<T> it = initialized.c().iterator();
            while (it.hasNext()) {
                i((g84.c) it.next(), rVar, 0);
            }
            rVar.R();
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            c30.b alertData = initialized.getAlertData();
            if (alertData == null) {
                rVar.X(-1267184487);
            } else {
                rVar.X(-1267184486);
                c30.e.c(null, alertData, rVar, c30.b.f22944i << 3, 1);
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
    public static final oq.i0 m(Initialized initialized) {
        initialized.d().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(Initialized initialized, int i15, p076m2.r rVar, int i16) {
        k(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final NoPermission noPermission, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2069870754);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(noPermission) : rVarH.G(noPermission) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2069870754, i16, -1, "pl.gov.coi.shared.feature.notificationsettings.presentation.NotificationSettingsNoPermissionScreen (NotificationSettingsScreen.kt:116)");
            }
            int i17 = i16;
            i50.s.r(noPermission.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-329071665, true, new er.q() { // from class: e84.r
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return w.p(noPermission, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(noPermission));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: e84.s
                    @Override // er.a
                    public final Object a() {
                        return w.q(noPermission);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: e84.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.r(noPermission, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(NoPermission noPermission, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-329071665, i15, -1, "pl.gov.coi.shared.feature.notificationsettings.presentation.NotificationSettingsNoPermissionScreen.<anonymous> (NotificationSettingsScreen.kt:120)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            q40.i.b(noPermission.a(), b.f48522a.b(), null, rVar, IconPageData.f164667h | 48, 4);
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
    public static final oq.i0 q(NoPermission noPermission) {
        noPermission.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(NoPermission noPermission, int i15, p076m2.r rVar, int i16) {
        o(noPermission, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void s(final z zVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1466825594);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(zVar) : rVarH.G(zVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1466825594, i16, -1, "pl.gov.coi.shared.feature.notificationsettings.presentation.NotificationSettingsScreen (NotificationSettingsScreen.kt:33)");
            }
            z.a aVarT = t(m7.b.c(zVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarT instanceof z.a.EmptyState) {
                rVarH.X(-870116680);
                o(((z.a.EmptyState) aVarT).getScreenModel(), rVarH, BaseScaffoldData.f89350g | IconPageData.f164667h);
                rVarH.R();
            } else {
                if (!(aVarT instanceof z.a.Initialized)) {
                    rVarH.X(-870118679);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-870112638);
                k(((z.a.Initialized) aVarT).getScreenModel(), rVarH, 0);
                rVarH.R();
            }
            oz.l.b(zVar.getLifecycleConnector(), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: e84.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.u(zVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final z.a t(f6<? extends z.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(z zVar, int i15, p076m2.r rVar, int i16) {
        s(zVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
