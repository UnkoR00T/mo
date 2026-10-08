package fm2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lfm2/e;", "viewModel", "Loq/i0;", "q", "(Lfm2/e;Lm2/r;I)V", "Lfm2/e$a;", "screenData", "Lka/a;", "Ln50/g;", "articles", "l", "(Lfm2/e$a;Lka/a;Lm2/r;I)V", "Lfm2/e$a$b;", "n", "(Lfm2/e$a$b;Lka/a;Lm2/r;I)V", "h", "(Lka/a;Lm2/r;I)V", "networksecurityissues_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void h(final ka.a<DefaultSingleCardData> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(867513060);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(867513060, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.knowledgebase.presentation.list.ArticlesList (NetworkSecurityIssuesKnowledgeBaseListScreen.kt:86)");
            }
            d3 d3VarG = a3.g(0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100(), 1, null);
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(aVar))) {
                z15 = true;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: fm2.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.i(aVar, (q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(null, null, d3VarG, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 507);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fm2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final ka.a aVar, q0 q0Var) {
        q0.e(q0Var, aVar.g(), null, null, y2.m.b(1617554946, true, new er.r() { // from class: fm2.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return m.j(aVar, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        if (fr.t.c(aVar.i().getAppend(), ja.w.Loading.f101205b)) {
            q0.c(q0Var, null, null, b.f65371a.b(), 3, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(ka.a aVar, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        if ((i16 & 48) == 0) {
            i16 |= rVar.c(i15) ? 32 : 16;
        }
        if (rVar.r((i16 & 145) != 144, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1617554946, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.knowledgebase.presentation.list.ArticlesList.<anonymous>.<anonymous>.<anonymous> (NetworkSecurityIssuesKnowledgeBaseListScreen.kt:91)");
            }
            DefaultSingleCardData defaultSingleCardData = (DefaultSingleCardData) aVar.f(i15);
            if (defaultSingleCardData == null) {
                rVar.X(-953626393);
            } else {
                rVar.X(-953626392);
                h0.v(defaultSingleCardData, null, rVar, 0, 2);
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
    public static final i0 k(ka.a aVar, int i15, p076m2.r rVar, int i16) {
        h(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final e.a aVar, final ka.a<DefaultSingleCardData> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1918298139);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar2) : rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1918298139, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.knowledgebase.presentation.list.NetworkSecurityIssuesKnowledgeBaseListContent (NetworkSecurityIssuesKnowledgeBaseListScreen.kt:49)");
            }
            if (fr.t.c(aVar, e.a.C1452a.f65382a)) {
                rVarH.X(-943533034);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.Initialized)) {
                    rVarH.X(-943535586);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-943529731);
                n((e.a.Initialized) aVar, aVar2, rVarH, (i16 & 112) | (i16 & 14) | (ka.a.f109310f << 3));
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
            d5VarM.a(new er.p() { // from class: fm2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.m(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(e.a aVar, ka.a aVar2, int i15, p076m2.r rVar, int i16) {
        l(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final e.a.Initialized initialized, final ka.a<DefaultSingleCardData> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-314134652);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-314134652, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.knowledgebase.presentation.list.NetworkSecurityIssuesKnowledgeBaseListInitialized (NetworkSecurityIssuesKnowledgeBaseListScreen.kt:64)");
            }
            if (fr.t.c(aVar.i().getRefresh(), ja.w.Loading.f101205b)) {
                rVarH.X(348566890);
                x70.f.g(x70.a.b.f217282c, rVarH, x70.a.b.f217283d);
                rVarH.R();
                rVar2 = rVarH;
            } else {
                rVarH.X(348635896);
                rVar2 = rVarH;
                i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1734616083, true, new er.q() { // from class: fm2.h
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return m.o(initialized, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: fm2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.p(initialized, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(e.a.Initialized initialized, ka.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1734616083, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.knowledgebase.presentation.list.NetworkSecurityIssuesKnowledgeBaseListInitialized.<anonymous> (NetworkSecurityIssuesKnowledgeBaseListScreen.kt:69)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(a3.l(w0.i.d(mVarF, aVar2.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar2.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            h(aVar, rVar, ka.a.f109310f);
            rVar.x();
            p088nul.q0.g(false, initialized.a(), rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(e.a.Initialized initialized, ka.a aVar, int i15, p076m2.r rVar, int i16) {
        n(initialized, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void q(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1797672470);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1797672470, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.knowledgebase.presentation.list.NetworkSecurityIssuesKnowledgeBaseListScreen (NetworkSecurityIssuesKnowledgeBaseListScreen.kt:35)");
            }
            l(r(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), ka.b.b(eVar.D5(), null, rVarH, 0, 1), rVarH, ka.a.f109310f << 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fm2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.s(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a r(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(e eVar, int i15, p076m2.r rVar, int i16) {
        q(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
