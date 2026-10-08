package v12;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import n30.CardListData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lv12/c;", "viewModel", "Loq/i0;", "j", "(Lv12/c;Lm2/r;I)V", "Lv12/c$a$b;", "state", "h", "(Lv12/c$a$b;Lm2/r;I)V", "Lv12/c$a$a;", "e", "(Lv12/c$a$a;Lm2/r;I)V", "Lv12/c$a;", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    private static final void e(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-124672168);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-124672168, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.addrecipient.AddRecipientInitializedScreen (AddRecipientScreen.kt:53)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-939843259, true, new er.q() { // from class: v12.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.f(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: v12.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.g(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m mVar;
        int i17;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-939843259, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.addrecipient.AddRecipientInitializedScreen.<anonymous> (AddRecipientScreen.kt:58)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarQ = a3.q(mVarL, aVar.b(rVar, i18).getSpacing200(), aVar.b(rVar, i18).getSpacing100(), aVar.b(rVar, i18).getSpacing200(), aVar.b(rVar, i18).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
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
            f3.m mVarB = h0.b(d1.i0.f39176a, t70.i.S(companion, null, rVar, 6, 1), 1.0f, false, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarB);
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
            j70.h.g(null, null, initialized.getHeaderLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            x12.a contentType = initialized.getContentType();
            if (contentType instanceof x12.a.Empty) {
                rVar.X(1342223013);
                m30.i.d(((x12.a.Empty) contentType).getAddRecipientCardData(), null, null, rVar, 0, 6);
                rVar.R();
                i0 i0Var = i0.f148189a;
                mVar = null;
                i17 = 1;
            } else {
                if (!(contentType instanceof x12.a.Recipients)) {
                    rVar.X(1342220742);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-1340622690);
                x12.a.Recipients recipients = (x12.a.Recipients) contentType;
                m30.i.d(recipients.getRecipients(), null, null, rVar, 0, 6);
                CardListData addRecipientCardData = recipients.getAddRecipientCardData();
                if (addRecipientCardData == null) {
                    rVar.X(-1340498908);
                } else {
                    rVar.X(-1340498907);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
                    m30.i.d(addRecipientCardData, null, null, rVar, 0, 6);
                    i0 i0Var2 = i0.f148189a;
                }
                rVar.R();
                c30.b recipientsInfoAlertData = recipients.getRecipientsInfoAlertData();
                if (recipientsInfoAlertData == null) {
                    rVar.X(-1340279986);
                    rVar.R();
                    mVar = null;
                    i17 = 1;
                } else {
                    rVar.X(-1340279985);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
                    mVar = null;
                    i17 = 1;
                    c30.e.c(null, recipientsInfoAlertData, rVar, c30.b.f22944i << 3, 1);
                    i0 i0Var3 = i0.f148189a;
                    rVar.R();
                }
                rVar.R();
            }
            c30.b generalInfoAlertData = initialized.getContentType().getGeneralInfoAlertData();
            if (generalInfoAlertData == null) {
                rVar.X(-1340080966);
            } else {
                rVar.X(-1340080965);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
                c30.e.c(mVar, generalInfoAlertData, rVar, c30.b.f22944i << 3, i17);
                i0 i0Var4 = i0.f148189a;
            }
            rVar.R();
            rVar.x();
            f3.m mVarR = a3.r(companion, 0.0f, aVar.b(rVar, i18).getSpacing200(), 0.0f, 0.0f, 13, null);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarR);
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
            n6.i(rVarC3, w0VarI, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(initialized.getNextButton(), false, null, rVar, 0, 6);
            rVar.x();
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
    public static final i0 g(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        e(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void h(final c.a.Loading loading, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(647840808);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(loading) : rVarH.G(loading) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(647840808, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.addrecipient.AddRecipientLoadingScreen (AddRecipientScreen.kt:46)");
            }
            x70.f.g(loading.getLoaderData(), rVarH, x70.a.f217278b);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v12.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.i(loading, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c.a.Loading loading, int i15, p076m2.r rVar, int i16) {
        h(loading, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(714849760);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(714849760, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.addrecipient.AddRecipientScreen (AddRecipientScreen.kt:31)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(cVar.getLifecycleConnector(), rVarH, 0);
            c.a aVarK = k(f6VarC);
            if (aVarK instanceof c.a.Initialized) {
                rVarH.X(-224139837);
                e((c.a.Initialized) aVarK, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarK instanceof c.a.Loading)) {
                    rVarH.X(-224142111);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-224137217);
                h((c.a.Loading) aVarK, rVarH, 0);
                rVarH.R();
            }
            q0.g(false, k(f6VarC).a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: v12.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.l(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a k(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c cVar, int i15, p076m2.r rVar, int i16) {
        j(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
