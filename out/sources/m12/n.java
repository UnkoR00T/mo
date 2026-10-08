package m12;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Lm12/e;", "viewModel", "Loq/i0;", "m", "(Lm12/e;Lm2/r;I)V", "Lm12/e$a$b;", "data", "u", "(Lm12/e$a$b;Lm2/r;I)V", "Lm12/e$a$d;", "k", "(Lm12/e$a$d;Lm2/r;I)V", "Lm12/e$a$a;", "q", "(Lm12/e$a$a;Lm2/r;I)V", "Lm12/e$a$a$a;", "sectionData", "i", "(Lm12/e$a$a$a;Lm2/r;I)V", "Lm12/e$a;", "state", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    private static final void i(final e.a.DraftMessage.MessageSection messageSection, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-752245202);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(messageSection) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-752245202, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.edor.DraftSection (EdorMessageDetailsScreen.kt:121)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label sectionTitle = messageSection.getSectionTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, sectionTitle, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            m30.i.d(messageSection.getCards(), null, null, rVar2, 0, 6);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m12.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.j(messageSection, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(e.a.DraftMessage.MessageSection messageSection, int i15, p076m2.r rVar, int i16) {
        i(messageSection, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void k(final e.a.Message message, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-77934379);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(message) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-77934379, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.edor.EdorMessageDetailsContent (EdorMessageDetailsScreen.kt:60)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            c30.b alertData = message.getAlertData();
            if (alertData == null) {
                rVarH.X(1168117605);
            } else {
                rVarH.X(1168117606);
                c30.e.c(null, alertData, rVarH, c30.b.f22944i << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, 0);
            }
            rVarH.R();
            k12.g.d(message.getMessageInitialized(), rVarH, 0);
            CardListData attachmentsCardListData = message.getAttachmentsCardListData();
            List<n50.k> listD = attachmentsCardListData != null ? attachmentsCardListData.d() : null;
            if (listD == null || listD.isEmpty()) {
                rVarH.X(1165510723);
            } else {
                rVarH.X(1168389414);
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
                j70.h.g(null, null, message.getAttachmentsHeader(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
                m30.i.d(message.getAttachmentsCardListData(), null, null, rVarH, 0, 6);
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m12.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(message, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(e.a.Message message, int i15, p076m2.r rVar, int i16) {
        k(message, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1429869457);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1429869457, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.edor.EdorMessageDetailsScreen (EdorMessageDetailsScreen.kt:33)");
            }
            f6 f6VarC = m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(eVar.getLifecycleConnector(), rVarH, 0);
            final e.a aVarN = n(f6VarC);
            if (aVarN instanceof e.a.Loading) {
                rVarH.X(284995187);
                x70.f.g(((e.a.Loading) aVarN).getLoaderData(), rVarH, x70.a.f217278b);
                rVarH.R();
            } else if (aVarN instanceof e.a.Message) {
                rVarH.X(284998122);
                k12.k.d(((e.a.Message) aVarN).getMessageInitialized(), y2.m.d(1971087779, true, new er.q() { // from class: m12.f
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return n.o(aVarN, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, 48);
                rVarH.R();
            } else if (aVarN instanceof e.a.DraftMessage) {
                rVarH.X(285003851);
                q((e.a.DraftMessage) aVarN, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarN instanceof e.a.Error)) {
                    rVarH.X(284993118);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(285006382);
                u((e.a.Error) aVarN, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: m12.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.p(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a n(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(e.a aVar, d1.h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1971087779, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.edor.EdorMessageDetailsScreen.<anonymous> (EdorMessageDetailsScreen.kt:42)");
            }
            k((e.a.Message) aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(e eVar, int i15, p076m2.r rVar, int i16) {
        m(eVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void q(final e.a.DraftMessage draftMessage, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(424423608);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(draftMessage) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(424423608, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.edor.InitializeDraftMessage (EdorMessageDetailsScreen.kt:85)");
            }
            rVar2 = rVarH;
            i50.s.r(draftMessage.getBaseScaffoldData(), y2.m.d(1609820259, true, new er.p() { // from class: m12.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.r(draftMessage, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-188852373, true, new er.q() { // from class: m12.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.s(draftMessage, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m12.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.t(draftMessage, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(e.a.DraftMessage draftMessage, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1609820259, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.edor.InitializeDraftMessage.<anonymous> (EdorMessageDetailsScreen.kt:89)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarN = a3.n(companion, aVar.b(rVar, i16).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.r(aVar.b(rVar, i16).getSpacing150()), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            h30.q.p(draftMessage.getEditDraftButtonData(), false, null, rVar, 0, 6);
            h30.q.p(draftMessage.getDeleteDraftButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 s(e.a.DraftMessage draftMessage, d3 d3Var, p076m2.r rVar, int i15) {
        int i16 = (i15 & 6) == 0 ? i15 | (rVar.W(d3Var) ? 4 : 2) : i15;
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-188852373, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.edor.InitializeDraftMessage.<anonymous> (EdorMessageDetailsScreen.kt:99)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            Label headerText = draftMessage.getHeaderText();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, headerText, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            rVar.X(-924107505);
            for (e.a.DraftMessage.MessageSection messageSection : draftMessage.f()) {
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
                i(messageSection, rVar, 0);
            }
            rVar.R();
            rVar.x();
            p088nul.q0.g(false, draftMessage.a(), rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(e.a.DraftMessage draftMessage, int i15, p076m2.r rVar, int i16) {
        q(draftMessage, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void u(final e.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1686620951);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1686620951, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.edor.MessageDetailsErrorScreen (EdorMessageDetailsScreen.kt:53)");
            }
            error.getErrorVMS().b(rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m12.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.v(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(e.a.Error error, int i15, p076m2.r rVar, int i16) {
        u(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
