package te1;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import ju.p0;
import k40.EmptyStateData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\f\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Lte1/r;", "viewModel", "Loq/i0;", "r", "(Lte1/r;Lm2/r;I)V", "Lte1/r$a$b;", "data", "n", "(Lte1/r$a$b;Lm2/r;I)V", "Lte1/r$a$a;", "u", "(Lte1/r$a$a;Lm2/r;I)V", "state", "Ll3/d0;", "nextButtonFocusRequester", "A", "(Lte1/r$a$a;Ll3/d0;Lm2/r;I)V", ip.a.f96138c, "Lte1/r$a;", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f189876e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f189877f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f189877f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f189876e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = this.f189877f;
                this.f189876e = 1;
                if (y0.r(y0Var, 0, 0, this, 2, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f189877f, eVar);
        }
    }

    private static final void A(final r.a.Initialized initialized, final l3.d0 d0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(927825287);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(d0Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(927825287, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdCodeSearch.SearchBarActiveContent (PkdCodeSearchScreen.kt:133)");
            }
            y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            String query = initialized.getSearchBarData().getQuery();
            boolean zW = rVarH.W(y0VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(y0VarC, null);
                rVarH.v(objE);
            }
            Function0.d(query, (er.p) objE, rVarH, 0);
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean z15 = (i16 & 112) == 32;
            Object objE2 = rVarH.E();
            if (z15 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: te1.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.B(d0Var, (l3.v) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f3.m mVarN = a3.n(androidx.compose.foundation.layout.d.f(q0.c(l3.y.a(companion, (er.l) objE2), false, null, 3, null), 0.0f, 1, null), k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200());
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            m30.m.d(initialized.getCardListData(), y0VarC, rVarH, 0, 0);
            if (initialized.getCardListData().d().isEmpty()) {
                rVarH.X(50221904);
                f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), companion2.g(), rVarH, 54);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarF);
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
                n6.i(rVarC2, w0VarA, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                d1.i0 i0Var = d1.i0.f39176a;
                k40.d.c(null, initialized.getEmptyStateData(), rVarH, EmptyStateData.f108236d << 3, 1);
                rVarH.x();
            } else {
                rVarH.X(45226037);
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
            d5VarM.a(new er.p() { // from class: te1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.C(initialized, d0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(l3.d0 d0Var, l3.v vVar) {
        vVar.m(d0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(r.a.Initialized initialized, l3.d0 d0Var, int i15, p076m2.r rVar, int i16) {
        A(initialized, d0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void D(final r.a.Initialized initialized, final l3.d0 d0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1518293467);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(d0Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1518293467, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdCodeSearch.SearchInactiveContent (PkdCodeSearchScreen.kt:169)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean z15 = (i16 & 112) == 32;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: te1.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.E(d0Var, (l3.v) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarC = q0.c(l3.y.a(companion, (er.l) objE), false, null, 3, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarC);
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
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, 0);
            m30.m.d(initialized.getCardListData(), null, rVarH, 0, 2);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: te1.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.F(initialized, d0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(l3.d0 d0Var, l3.v vVar) {
        vVar.m(d0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(r.a.Initialized initialized, l3.d0 d0Var, int i15, p076m2.r rVar, int i16) {
        D(initialized, d0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final r.a.MoreInfo moreInfo, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(76570641);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(moreInfo) : rVarH.G(moreInfo) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(76570641, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdCodeSearch.PkdCodeSearchMoreInfo (PkdCodeSearchScreen.kt:55)");
            }
            int i17 = i16;
            i50.s.r(moreInfo.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1994570108, true, new er.q() { // from class: te1.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.o(moreInfo, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(moreInfo));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: te1.f
                    @Override // er.a
                    public final Object a() {
                        return n.p(moreInfo);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: te1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.q(moreInfo, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(r.a.MoreInfo moreInfo, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1994570108, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdCodeSearch.PkdCodeSearchMoreInfo.<anonymous> (PkdCodeSearchScreen.kt:57)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarS, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, moreInfo.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
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
    public static final oq.i0 p(r.a.MoreInfo moreInfo) {
        moreInfo.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(r.a.MoreInfo moreInfo, int i15, p076m2.r rVar, int i16) {
        n(moreInfo, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void r(final r rVar, p076m2.r rVar2, final int i15) {
        int i16;
        p076m2.r rVarH = rVar2.h(500040113);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(rVar) : rVarH.G(rVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(500040113, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdCodeSearch.PkdCodeSearchScreen (PkdCodeSearchScreen.kt:39)");
            }
            r.a aVarS = s(m7.b.c(rVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarS instanceof r.a.Initialized) {
                rVarH.X(-497781883);
                u((r.a.Initialized) aVarS, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarS instanceof r.a.MoreInfo)) {
                    rVarH.X(-497784230);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-497778592);
                n((r.a.MoreInfo) aVarS, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: te1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.t(rVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final r.a s(f6<? extends r.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(r rVar, int i15, p076m2.r rVar2, int i16) {
        r(rVar, rVar2, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void u(final r.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-401365726);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-401365726, i16, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdCodeSearch.PkdCodeSearchScreenContent (PkdCodeSearchScreen.kt:82)");
            }
            cb4.i dialogVMSAdapter = initialized.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(102721143);
            } else {
                rVarH.X(834597578);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new l3.d0();
                rVarH.v(objE);
            }
            final l3.d0 d0Var = (l3.d0) objE;
            i50.s.r(initialized.getScaffoldData(), y2.m.d(1504163725, true, new er.p() { // from class: te1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.v(d0Var, initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(924346517, true, new er.q() { // from class: te1.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.w(initialized, d0Var, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            boolean zG = rVarH.G(initialized);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: te1.j
                    @Override // er.a
                    public final Object a() {
                        return n.y(initialized);
                    }
                };
                rVarH.v(objE2);
            }
            p088nul.q0.g(false, (er.a) objE2, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: te1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.z(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(l3.d0 d0Var, r.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1504163725, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdCodeSearch.PkdCodeSearchScreenContent.<anonymous> (PkdCodeSearchScreen.kt:90)");
            }
            f3.m mVarA = l3.g0.a(a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), d0Var);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarA);
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
            h30.q.p(initialized.getNextButton(), false, null, rVar, 0, 6);
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
    public static final oq.i0 w(final r.a.Initialized initialized, final l3.d0 d0Var, d3 d3Var, p076m2.r rVar, int i15) {
        float spacing100;
        float spacing200;
        float spacing201;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(924346517, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdCodeSearch.PkdCodeSearchScreenContent.<anonymous> (PkdCodeSearchScreen.kt:99)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarL = a3.l(w0.i.d(companion, aVar.a(rVar, i16).getBase().a(), null, 2, null), d3Var);
            if (initialized.getSearchBarData().getIsActive()) {
                rVar.X(-761219335);
                spacing100 = aVar.b(rVar, i16).getZero();
            } else {
                rVar.X(-761218369);
                spacing100 = aVar.b(rVar, i16).getSpacing100();
            }
            rVar.R();
            float f15 = spacing100;
            if (initialized.getSearchBarData().getIsActive()) {
                rVar.X(-761215719);
                spacing200 = aVar.b(rVar, i16).getZero();
            } else {
                rVar.X(-761214753);
                spacing200 = aVar.b(rVar, i16).getSpacing200();
            }
            rVar.R();
            float f16 = spacing200;
            if (initialized.getSearchBarData().getIsActive()) {
                rVar.X(-761212167);
                spacing201 = aVar.b(rVar, i16).getZero();
            } else {
                rVar.X(-761211201);
                spacing201 = aVar.b(rVar, i16).getSpacing200();
            }
            rVar.R();
            f3.m mVarR = a3.r(mVarL, f16, f15, spacing201, 0.0f, 8, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            j50.f0.A(null, initialized.getSearchBarData(), y2.m.d(291902017, true, new er.p() { // from class: te1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.x(initialized, d0Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
            if (initialized.getSearchBarData().getIsActive()) {
                rVar.X(467075619);
            } else {
                rVar.X(471242298);
                D(initialized, d0Var, rVar, 48);
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
    public static final oq.i0 x(r.a.Initialized initialized, l3.d0 d0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(291902017, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdCodeSearch.PkdCodeSearchScreenContent.<anonymous>.<anonymous>.<anonymous> (PkdCodeSearchScreen.kt:110)");
            }
            A(initialized, d0Var, rVar, 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(r.a.Initialized initialized) {
        initialized.e().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(r.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        u(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
