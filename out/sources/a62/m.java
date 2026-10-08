package a62;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import v60.PaymentStatusCardData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La62/f;", "viewModel", "Loq/i0;", "n", "(La62/f;Lm2/r;I)V", "La62/f$a;", "screenData", "Lka/a;", "Lc62/a;", "transactions", "g", "(La62/f$a;Lka/a;Lm2/r;I)V", "i", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void g(final f.Data data, final ka.a<c62.a> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1044862101);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1044862101, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.transactions.PaymentsTransactionsContent (PaymentsTransactionsScreen.kt:45)");
            }
            i(data, aVar, rVarH, BaseScaffoldData.f89350g | (i16 & 14) | (ka.a.f109310f << 3) | (i16 & 112));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a62.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.h(data, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(f.Data data, ka.a aVar, int i15, p076m2.r rVar, int i16) {
        g(data, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final f.Data data, final ka.a<c62.a> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(679885574);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(679885574, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.transactions.PaymentsTransactionsInitialized (PaymentsTransactionsScreen.kt:56)");
            }
            if (fr.t.c(aVar.i().getRefresh(), ja.w.Loading.f101205b)) {
                rVarH.X(-594423960);
                x70.f.g(x70.a.b.f217282c, rVarH, x70.a.b.f217283d);
                rVarH.R();
                rVar2 = rVarH;
            } else {
                rVarH.X(-594309446);
                rVar2 = rVarH;
                i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1941327895, true, new er.q() { // from class: a62.i
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return m.j(aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a62.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.m(data, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(final ka.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1941327895, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.transactions.PaymentsTransactionsInitialized.<anonymous> (PaymentsTransactionsScreen.kt:61)");
            }
            f3.m mVarD = androidx.compose.foundation.layout.d.d(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(a3.l(w0.i.d(mVarD, aVar2.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar2.b(rVar, i17).getSpacing200(), aVar2.b(rVar, i17).getSpacing100(), aVar2.b(rVar, i17).getSpacing200(), 0.0f, 8, null);
            f3.c.b bVarG = f3.c.INSTANCE.g();
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = e0.a(iVar.k(), bVarG, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            d3 d3VarI = a3.i(0.0f, 0.0f, 0.0f, aVar2.b(rVar, i17).getSpacing200(), 7, null);
            d1.i.f fVarR = iVar.r(aVar2.b(rVar, i17).getSpacing100());
            boolean zG = rVar.G(aVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: a62.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.k(aVar, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(null, null, d3VarI, false, fVarR, null, null, false, null, (er.l) objE, rVar, 0, 491);
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
    public static final i0 k(final ka.a aVar, q0 q0Var) {
        q0.e(q0Var, aVar.g(), null, null, y2.m.b(1389355947, true, new er.r() { // from class: a62.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m.l(aVar, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        if (fr.t.c(aVar.i().getAppend(), ja.w.Loading.f101205b)) {
            q0.c(q0Var, null, null, b.f3869a.b(), 3, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(ka.a aVar, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        int i17;
        p076m2.r rVar2 = rVar;
        if ((i16 & 48) == 0) {
            i17 = i16 | (rVar2.c(i15) ? 32 : 16);
        } else {
            i17 = i16;
        }
        if (rVar2.r((i17 & 145) != 144, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1389355947, i17, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.transactions.PaymentsTransactionsInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentsTransactionsScreen.kt:78)");
            }
            c62.a aVar2 = (c62.a) aVar.f(i15);
            if (aVar2 == null) {
                rVar2.X(-296741469);
            } else {
                rVar2.X(-296741468);
                if (aVar2 instanceof c62.a.DateSeparator) {
                    rVar2.X(-2129615678);
                    if (i15 != 0) {
                        rVar2.X(-68696390);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                    } else {
                        rVar2.X(-2133115702);
                    }
                    rVar2.R();
                    Label createdAt = ((c62.a.DateSeparator) aVar2).getCreatedAt();
                    k70.a aVar3 = k70.a.f108864a;
                    int i18 = k70.a.f108865b;
                    j70.h.g(null, null, createdAt, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i18).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                    rVar2 = rVar;
                    if (i15 != aVar.g() - 1) {
                        rVar2.X(-2129299106);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar3.b(rVar2, i18).getSpacing200()), rVar2, 0);
                    } else {
                        rVar2.X(-2133115702);
                    }
                    rVar2.R();
                    rVar2.R();
                } else {
                    if (!(aVar2 instanceof c62.a.TransactionCard)) {
                        rVar2.X(-68699455);
                        rVar2.R();
                        throw new oq.p();
                    }
                    rVar2.X(-68681057);
                    v60.i.h(null, ((c62.a.TransactionCard) aVar2).getCardData(), rVar2, PaymentStatusCardData.f204081k << 3, 1);
                    rVar2.R();
                }
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(f.Data data, ka.a aVar, int i15, p076m2.r rVar, int i16) {
        i(data, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(691208304);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(691208304, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.transactions.PaymentsTransactionsScreen (PaymentsTransactionsScreen.kt:35)");
            }
            g(o(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7)), ka.b.b(fVar.I4(), null, rVarH, 0, 1), rVarH, BaseScaffoldData.f89350g | (ka.a.f109310f << 3));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a62.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.p(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.Data o(f6<f.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(f fVar, int i15, p076m2.r rVar, int i16) {
        n(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
