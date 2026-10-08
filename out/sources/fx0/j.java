package fx0;

import d1.a3;
import d1.d3;
import d1.h0;
import d1.i0;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Iterator;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lfx0/c;", "viewModel", "Loq/i0;", "i", "(Lfx0/c;Lm2/r;I)V", "Lfx0/c$a;", "data", "l", "(Lfx0/c$a;Lm2/r;I)V", "Lfx0/c$a$a;", "n", "(Lfx0/c$a$a;Lm2/r;I)V", "Lfx0/c$a$a$b;", "Ld1/d3;", "paddingValues", "g", "(Lfx0/c$a$a$b;Ld1/d3;Lm2/r;I)V", "Lfx0/c$a$a$a;", "q", "(Lfx0/c$a$a$a;Lm2/r;I)V", "state", "adddocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    private static final void g(final c.a.InterfaceC1530a.WithDocuments withDocuments, final d3 d3Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        Object obj;
        int i17;
        p076m2.r rVarH = rVar.h(-2014145896);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(withDocuments) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(d3Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2014145896, i16, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.asyncdocuments.AddDocumentListScreenData (AsyncDocumentsListScreen.kt:72)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(androidx.compose.foundation.layout.d.f(a3.r(mVarL, aVar.b(rVarH, i18).getSpacing200(), 0.0f, aVar.b(rVarH, i18).getSpacing200(), aVar.b(rVarH, i18).getSpacing200(), 2, null), 0.0f, 1, null), aVar.a(rVarH, i18).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarR = a3.r(t70.i.S(h0.b(i0.f39176a, companion, 1.0f, false, 2, null), null, rVarH, 0, 1), 0.0f, aVar.b(rVarH, i18).getSpacing100(), 0.0f, aVar.b(rVarH, i18).getSpacing200(), 5, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            if (withDocuments.f().isEmpty()) {
                obj = null;
                i17 = 0;
                rVarH.X(1600349950);
            } else {
                rVarH.X(1603479431);
                i17 = 0;
                j70.h.g(null, null, withDocuments.getDocumentsToAddSectionLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
                rVarH = rVarH;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
                Iterator<T> it = withDocuments.f().iterator();
                while (it.hasNext()) {
                    n50.h0.v((n50.k) it.next(), null, rVarH, 0, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, 0);
                }
                obj = null;
            }
            rVarH.R();
            if (withDocuments.d().isEmpty()) {
                rVarH.X(1600349950);
            } else {
                rVarH.X(1603939626);
                f3.m.Companion companion4 = f3.m.INSTANCE;
                k70.a aVar2 = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVarH, i19).getSpacing200()), rVarH, i17);
                p076m2.r rVar3 = rVarH;
                j70.h.g(null, null, withDocuments.getCertifiedDocumentsToAddSectionLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i19).b(), null, null, false, false, null, rVar3, 0, 0, 0, 33030139);
                rVarH = rVar3;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVarH, i19).getSpacing200()), rVarH, i17);
                Iterator<T> it4 = withDocuments.d().iterator();
                while (it4.hasNext()) {
                    n50.h0.v((n50.k) it4.next(), null, rVarH, i17, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, i17);
                }
            }
            rVarH.R();
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, i17);
            h30.q.p(withDocuments.getAddButton(), false, null, rVarH, 0, 6);
            rVar2 = rVarH;
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
            d5VarM.a(new er.p() { // from class: fx0.i
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return j.h(withDocuments, d3Var, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(c.a.InterfaceC1530a.WithDocuments withDocuments, d3 d3Var, int i15, p076m2.r rVar, int i16) {
        g(withDocuments, d3Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void i(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-17961);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-17961, i16, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.asyncdocuments.AsyncDocumentsScreen (AsyncDocumentsListScreen.kt:28)");
            }
            l(j(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fx0.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a j(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(c cVar, int i15, p076m2.r rVar, int i16) {
        i(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-69317740);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-69317740, i16, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.asyncdocuments.AsyncDocumentsScreenContent (AsyncDocumentsListScreen.kt:40)");
            }
            if (fr.t.c(aVar, c.a.b.f68492a)) {
                rVarH.X(2105133285);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.InterfaceC1530a)) {
                    rVarH.X(2105131292);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(2105135597);
                n((c.a.InterfaceC1530a) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: fx0.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.m(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(c.a aVar, int i15, p076m2.r rVar, int i16) {
        l(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final c.a.InterfaceC1530a interfaceC1530a, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2122045128);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(interfaceC1530a) : rVarH.G(interfaceC1530a) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2122045128, i16, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.asyncdocuments.AsyncDocumentsScreenInitialized (AsyncDocumentsListScreen.kt:50)");
            }
            i50.s.r(interfaceC1530a.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1671122683, true, new er.q() { // from class: fx0.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.o(interfaceC1530a, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, interfaceC1530a.a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fx0.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.p(interfaceC1530a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(c.a.InterfaceC1530a interfaceC1530a, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1671122683, i15, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.asyncdocuments.AsyncDocumentsScreenInitialized.<anonymous> (AsyncDocumentsListScreen.kt:52)");
            }
            if (interfaceC1530a instanceof c.a.InterfaceC1530a.WithDocuments) {
                rVar.X(-368866593);
                g((c.a.InterfaceC1530a.WithDocuments) interfaceC1530a, d3Var, rVar, (i15 << 3) & 112);
                rVar.R();
            } else {
                if (!(interfaceC1530a instanceof c.a.InterfaceC1530a.Empty)) {
                    rVar.X(-368869289);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-368861204);
                q((c.a.InterfaceC1530a.Empty) interfaceC1530a, rVar, 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(c.a.InterfaceC1530a interfaceC1530a, int i15, p076m2.r rVar, int i16) {
        n(interfaceC1530a, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void q(final c.a.InterfaceC1530a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1346943359);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1346943359, i16, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.asyncdocuments.EmptyScreenData (AsyncDocumentsListScreen.kt:128)");
            }
            q40.i.b(empty.c(), null, null, rVarH, IconPageData.f164667h, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fx0.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.r(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(c.a.InterfaceC1530a.Empty empty, int i15, p076m2.r rVar, int i16) {
        q(empty, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
