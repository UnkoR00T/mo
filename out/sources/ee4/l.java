package ee4;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;
import q40.IconPageData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lee4/c;", "viewModel", "Loq/i0;", "r", "(Lee4/c;Lm2/r;I)V", "Lee4/c$a$d;", "screenData", "l", "(Lee4/c$a$d;Lm2/r;I)V", "Lee4/c$a$a;", "i", "(Lee4/c$a$a;Lm2/r;I)V", "Lee4/c$a;", "passportagreementmanagement_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    private static final void i(final c.a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-51477993);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-51477993, i16, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.managementlist.PassportAgreementEmptyContent (PassportAgreementListScreen.kt:78)");
            }
            rVar2 = rVarH;
            i50.s.r(empty.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1692384439, true, new er.q() { // from class: ee4.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.j(empty, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: ee4.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a.Empty empty, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1692384439, i15, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.managementlist.PassportAgreementEmptyContent.<anonymous>.<anonymous> (PassportAgreementListScreen.kt:82)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            q40.i.b(empty.c(), null, null, rVar, IconPageData.f164667h, 6);
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
    public static final i0 k(c.a.Empty empty, int i15, p076m2.r rVar, int i16) {
        i(empty, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-202300711);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-202300711, i16, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.managementlist.PassportAgreementListContent (PassportAgreementListScreen.kt:41)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-720881326, true, new er.q() { // from class: ee4.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.m(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: ee4.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.q(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(final c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-720881326, i16, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.managementlist.PassportAgreementListContent.<anonymous>.<anonymous> (PassportAgreementListScreen.kt:45)");
            }
            f3.m mVarN = t70.s.n(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), rVar, 0);
            boolean zG = rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ee4.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.n(initialized, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarN, null, null, false, null, null, null, false, null, (er.l) objE, rVar, 0, 510);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(c.a.Initialized initialized, q0 q0Var) {
        final int i15 = 0;
        for (Object obj : initialized.b()) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            oq.r rVar = (oq.r) obj;
            final Label label = (Label) rVar.a();
            final List<n50.k> list = (List) rVar.b();
            q0.c(q0Var, null, null, y2.m.b(-2015220672, true, new er.q() { // from class: ee4.j
                @Override // er.q
                public final Object w(Object obj2, Object obj3, Object obj4) {
                    return l.o(i15, label, (f1.e) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            }), 3, null);
            for (final n50.k kVar : list) {
                q0.c(q0Var, null, null, y2.m.b(-1252006975, true, new er.q() { // from class: ee4.k
                    @Override // er.q
                    public final Object w(Object obj2, Object obj3, Object obj4) {
                        return l.p(kVar, list, (f1.e) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                    }
                }), 3, null);
            }
            i15 = i16;
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(int i15, Label label, f1.e eVar, p076m2.r rVar, int i16) {
        if (rVar.r((i16 & 17) != 16, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2015220672, i16, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.managementlist.PassportAgreementListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementListScreen.kt:53)");
            }
            if (i15 != 0) {
                rVar.X(-386143326);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            } else {
                rVar.X(-388583646);
            }
            rVar.R();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            TextStyle textStyleP = aVar.f(rVar, i17).p();
            f3.m.Companion companion = f3.m.INSTANCE;
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleP, null, null, false, false, null, rVar, 6, 0, 0, 33030138);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(n50.k kVar, List list, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1252006975, i15, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.managementlist.PassportAgreementListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassportAgreementListScreen.kt:65)");
            }
            h0.v(kVar, null, rVar, 0, 2);
            if (fr.t.c(pq.v.x0(list), kVar)) {
                rVar.X(-1046647743);
            } else {
                rVar.X(-1043696419);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        l(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void r(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1732195380);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1732195380, i16, -1, "pl.gov.mobywatel.feature.passportagreementmanagement.presentation.managementlist.PassportAgreementListScreen (PassportAgreementListScreen.kt:28)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            c.a aVarS = s(f6VarC);
            if (aVarS instanceof c.a.Initial) {
                rVarH.X(1807558109);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarS instanceof c.a.Initialized) {
                rVarH.X(1807560603);
                l((c.a.Initialized) aVarS, rVarH, 0);
                rVarH.R();
            } else if (aVarS instanceof c.a.Empty) {
                rVarH.X(1807563836);
                i((c.a.Empty) aVarS, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarS instanceof c.a.Error)) {
                    rVarH.X(1807555732);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1807567508);
                ((c.a.Error) aVarS).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            }
            p088nul.q0.g(false, s(f6VarC).a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ee4.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.t(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a s(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(c cVar, int i15, p076m2.r rVar, int i16) {
        r(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
