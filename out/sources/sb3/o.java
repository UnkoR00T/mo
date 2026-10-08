package sb3;

import d1.a3;
import d1.d3;
import d1.r3;
import h30.ButtonData;
import i50.BaseScaffoldData;
import ju.p0;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!²\u0006\f\u0010\u0006\u001a\u00020 8\nX\u008a\u0084\u0002"}, d2 = {"Lsb3/g;", "viewModel", "Loq/i0;", "p", "(Lsb3/g;Lm2/r;I)V", "Lsb3/g$a$b;", "data", "l", "(Lsb3/g$a$b;Lm2/r;I)V", "Lf3/m;", "modifier", "Lmx/a;", "title", "description", "yourChildrenSectionTitle", "Ln50/g;", "defaultParticipantCardData", "Ln30/b;", "yourChildrenCardListData", "Lc30/b$c;", "alertData", "Lj1/a;", "bringIntoViewRequester", "j", "(Lf3/m;Lmx/a;Lmx/a;Lmx/a;Ln50/g;Ln30/b;Lc30/b$c;Lj1/a;Lm2/r;I)V", "cardListData", "s", "(Lmx/a;Ln30/b;Lm2/r;I)V", "Lh30/a;", "buttonData", "h", "(Lf3/m;Lh30/a;Lm2/r;II)V", "Lsb3/g$a;", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g.a.Initialized f179962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f179963g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g.a.Initialized initialized, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f179962f = initialized;
            this.f179963g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179961e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f179962f.getScrollToError()) {
                    j1.a aVar = this.f179963g;
                    this.f179961e = 1;
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
            this.f179962f.f().a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f179962f, this.f179963g, eVar);
        }
    }

    private static final void h(final f3.m mVar, ButtonData buttonData, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final ButtonData buttonData2;
        p076m2.r rVarH = rVar.h(-1072035769);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(buttonData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1072035769, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.participants.BottomBar (TripParticipantsScreen.kt:136)");
            }
            f3.m mVarN = a3.n(mVar, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200());
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            int i19 = (i17 >> 3) & 14;
            buttonData2 = buttonData;
            h30.q.p(buttonData2, false, null, rVarH, i19, 6);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            buttonData2 = buttonData;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sb3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.i(mVar, buttonData2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(f3.m mVar, ButtonData buttonData, int i15, int i16, p076m2.r rVar, int i17) {
        h(mVar, buttonData, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void j(final f3.m mVar, final Label label, final Label label2, final Label label3, final DefaultSingleCardData defaultSingleCardData, final CardListData cardListData, final c30.b.c cVar, final j1.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1363714290);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(label) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(label2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(label3) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.W(defaultSingleCardData) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.W(cardListData) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.W(cVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.G(aVar) ? 8388608 : 4194304;
        }
        if (rVarH.r((4793491 & i16) != 4793490, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1363714290, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.participants.Content (TripParticipantsScreen.kt:88)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(mVar, null, rVarH, i16 & 14, 1), rVarH, 0);
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).m(), null, null, false, false, null, rVarH, (i16 << 3) & 896, 0, 0, 33030139);
            f3.m.Companion companion3 = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(null, null, label2, null, null, aVar2.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).d(), null, null, false, false, null, rVarH, i16 & 896, 0, 0, 33030107);
            rVar2 = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVar2, i17).getSpacing200()), rVar2, 0);
            f3.m mVarB = j1.e.b(companion3, aVar);
            w0 w0VarI = d1.r.i(companion.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB2);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarI, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            d1.x xVar = d1.x.f39368a;
            int i18 = i16 >> 12;
            h0.v(defaultSingleCardData, null, rVar2, i18 & 14, 2);
            rVar2.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVar2, i17).getSpacing300()), rVar2, 0);
            s(label3, cardListData, rVar2, ((i16 >> 9) & 14) | (i18 & 112));
            c30.e.c(null, cVar, rVar2, (i16 >> 15) & 112, 1);
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
            d5VarM.a(new er.p() { // from class: sb3.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.k(mVar, label, label2, label3, defaultSingleCardData, cardListData, cVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f3.m mVar, Label label, Label label2, Label label3, DefaultSingleCardData defaultSingleCardData, CardListData cardListData, c30.b.c cVar, j1.a aVar, int i15, p076m2.r rVar, int i16) {
        j(mVar, label, label2, label3, defaultSingleCardData, cardListData, cVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final g.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(385695352);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(385695352, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.participants.TripParticipantsContent (TripParticipantsScreen.kt:51)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVarH.v(objE);
            }
            final j1.a aVar = (j1.a) objE;
            Boolean boolValueOf = Boolean.valueOf(initialized.getScrollToError());
            boolean zG = ((i16 & 14) == 4) | rVarH.G(aVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(initialized, aVar, null);
                rVarH.v(objE2);
            }
            Function0.d(boolValueOf, (er.p) objE2, rVarH, 0);
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), y2.m.d(-1993532701, true, new er.p() { // from class: sb3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.m(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2120924139, true, new er.q() { // from class: sb3.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return o.n(initialized, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: sb3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.o(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(g.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1993532701, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.participants.TripParticipantsContent.<anonymous> (TripParticipantsScreen.kt:62)");
            }
            h(null, initialized.getButtonData(), rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(g.a.Initialized initialized, j1.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2120924139, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.participants.TripParticipantsContent.<anonymous> (TripParticipantsScreen.kt:64)");
            }
            j(a3.l(f3.m.INSTANCE, d3Var), initialized.getTitle(), initialized.getDescription(), initialized.getChildrenSectionTitle(), initialized.getUserCardData(), initialized.getChildrenCardsData(), initialized.getAlertData(), aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(g.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        l(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1735586513);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1735586513, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.participants.TripParticipantsScreen (TripParticipantsScreen.kt:38)");
            }
            g.a aVarQ = q(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarQ, g.a.c.f179937a)) {
                rVarH.X(-1451321216);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarQ instanceof g.a.Error) {
                rVarH.X(-1451318409);
                ((g.a.Error) aVarQ).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarQ instanceof g.a.Initialized)) {
                    rVarH.X(-1451323514);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1451316357);
                l((g.a.Initialized) aVarQ, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: sb3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.r(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.a q(f6<? extends g.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(g gVar, int i15, p076m2.r rVar, int i16) {
        p(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void s(Label label, CardListData cardListData, p076m2.r rVar, final int i15) {
        int i16;
        final Label label2;
        final CardListData cardListData2 = cardListData;
        p076m2.r rVarH = rVar.h(1796387383);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(cardListData2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1796387383, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.participants.YourChildrenSection (TripParticipantsScreen.kt:121)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).p(), null, null, false, false, null, rVarH, (i16 << 6) & 896, 0, 0, 33030107);
            label2 = label;
            rVarH = rVarH;
            f3.m.Companion companion = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            cardListData2 = cardListData;
            m30.i.d(cardListData2, null, null, rVarH, (i16 >> 3) & 14, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            label2 = label;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sb3.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.t(label2, cardListData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(Label label, CardListData cardListData, int i15, p076m2.r rVar, int i16) {
        s(label, cardListData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
