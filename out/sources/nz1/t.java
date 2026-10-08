package nz1;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.b1;
import f1.q0;
import f1.y0;
import i50.BaseScaffoldData;
import java.io.IOException;
import mx.Label;
import n30.CardListData;
import org.xmlpull.v1.XmlPullParserException;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import q40.IconPageData;
import x40.LinkData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lnz1/f;", "viewModel", "Loq/i0;", "r", "(Lnz1/f;Lm2/r;I)V", "Lnz1/f$a;", "screenData", "n", "(Lnz1/f$a;Lm2/r;I)V", "Lnz1/f$a$a;", "u", "(Lnz1/f$a$a;Lm2/r;I)V", "Lnz1/f$a$e;", ip.a.f96138c, "(Lnz1/f$a$e;Lm2/r;I)V", "Lnz1/f$a$c;", "p", "(Lnz1/f$a$c;Lm2/r;I)V", "electoralsupport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(n50.k kVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(779416665, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.ElectoralSupportServiceDisplayed.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportScreen.kt:81)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            n50.h0.v(kVar, null, rVar, 0, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(f.a.Displayed displayed, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1795186645, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.ElectoralSupportServiceDisplayed.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportScreen.kt:86)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
            j70.h.g(null, null, displayed.getMoreInfoLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing50()), rVar, 0);
            x40.h.g(displayed.getMoreInfoLinkData(), rVar, LinkData.f216731g);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(f.a.Displayed displayed, int i15, p076m2.r rVar, int i16) {
        u(displayed, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void D(final f.a.ServiceForAdults serviceForAdults, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1687640871);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(serviceForAdults) : rVarH.G(serviceForAdults) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1687640871, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.ElectoralSupportServiceForAdults (ElectoralSupportScreen.kt:100)");
            }
            rVar2 = rVarH;
            i50.s.r(serviceForAdults.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1380183532, true, new er.q() { // from class: nz1.n
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.E(serviceForAdults, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: nz1.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.F(serviceForAdults, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(f.a.ServiceForAdults serviceForAdults, d3 d3Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1380183532, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.ElectoralSupportServiceForAdults.<anonymous> (ElectoralSupportScreen.kt:104)");
            }
            q40.i.b(serviceForAdults.a(), null, null, rVar, IconPageData.f164667h, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(f.a.ServiceForAdults serviceForAdults, int i15, p076m2.r rVar, int i16) {
        D(serviceForAdults, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final f.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-56708904);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-56708904, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.ElectoralSupportContent (ElectoralSupportScreen.kt:35)");
            }
            if (fr.t.c(aVar, f.a.d.f139816a)) {
                rVarH.X(1337322729);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof f.a.Displayed) {
                rVarH.X(1337325009);
                u((f.a.Displayed) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof f.a.ServiceForAdults) {
                rVarH.X(1337328753);
                D((f.a.ServiceForAdults) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof f.a.c) {
                rVarH.X(1337332332);
                p((f.a.c) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof f.a.Error)) {
                    rVarH.X(1337321067);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1337336160);
                ((f.a.Error) aVar).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: nz1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.o(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(f.a aVar, int i15, p076m2.r rVar, int i16) {
        n(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final f.a.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2085069235);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2085069235, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.ElectoralSupportInfoContent (ElectoralSupportScreen.kt:109)");
            }
            q40.i.b(cVar.a(), null, null, rVarH, IconPageData.f164667h, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nz1.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.q(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(f.a.c cVar, int i15, p076m2.r rVar, int i16) {
        p(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void r(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1643087335);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1643087335, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.ElectoralSupportScreen (ElectoralSupportScreen.kt:29)");
            }
            n(s(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nz1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.t(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a s(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(f fVar, int i15, p076m2.r rVar, int i16) {
        r(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void u(final f.a.Displayed displayed, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(810248196);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(displayed) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(810248196, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.ElectoralSupportServiceDisplayed (ElectoralSupportScreen.kt:46)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            rVar2 = rVarH;
            i50.s.r(displayed.getScaffoldData(), null, null, 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-2122518089, true, new er.q() { // from class: nz1.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.v(y0VarC, displayed, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32702);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nz1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.C(displayed, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(y0 y0Var, final f.a.Displayed displayed, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2122518089, i16, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.ElectoralSupportServiceDisplayed.<anonymous> (ElectoralSupportScreen.kt:52)");
            }
            f3.m mVarN = t70.s.n(a3.l(f3.m.INSTANCE, d3Var), rVar, 0);
            boolean zG = rVar.G(displayed);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: nz1.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.w(displayed, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarN, y0Var, null, false, null, null, null, false, null, (er.l) objE, rVar, 0, 508);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(final f.a.Displayed displayed, q0 q0Var) {
        q0.c(q0Var, null, null, y2.m.b(-1149100158, true, new er.q() { // from class: nz1.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t.x(displayed, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        final CardListData currentlyCollectedSignatures = displayed.getCurrentlyCollectedSignatures();
        if (currentlyCollectedSignatures != null) {
            q0.c(q0Var, null, null, y2.m.b(75877307, true, new er.q() { // from class: nz1.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.y(displayed, currentlyCollectedSignatures, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        final n50.k stateOfCommitteeSupport = displayed.getStateOfCommitteeSupport();
        if (stateOfCommitteeSupport != null) {
            q0.c(q0Var, null, null, y2.m.b(1438482746, true, new er.q() { // from class: nz1.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.z(stateOfCommitteeSupport, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        final n50.k historyOfSupport = displayed.getHistoryOfSupport();
        if (historyOfSupport != null) {
            q0.c(q0Var, null, null, y2.m.b(779416665, true, new er.q() { // from class: nz1.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.A(historyOfSupport, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        q0.c(q0Var, null, null, y2.m.b(-1795186645, true, new er.q() { // from class: nz1.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return t.B(displayed, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(f.a.Displayed displayed, f1.e eVar, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1149100158, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.ElectoralSupportServiceDisplayed.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportScreen.kt:59)");
            }
            o40.j.i(displayed.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(f.a.Displayed displayed, CardListData cardListData, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(75877307, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.ElectoralSupportServiceDisplayed.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportScreen.kt:64)");
            }
            Label currentlyCollectedSignaturesTitle = displayed.getCurrentlyCollectedSignaturesTitle();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, currentlyCollectedSignaturesTitle, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            f3.m.Companion companion = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            m30.i.d(cardListData, null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(n50.k kVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1438482746, i15, -1, "pl.gov.coi.mobywatel.feature.electoralsupport.presentation.electoralsupport.ElectoralSupportServiceDisplayed.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ElectoralSupportScreen.kt:75)");
            }
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            n50.h0.v(kVar, null, rVar, 0, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
