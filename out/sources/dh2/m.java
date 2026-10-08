package dh2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import j50.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.p0;
import k40.EmptyStateData;
import mx.Label;
import n50.h0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u001d\u0010\u0012\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\f\u0010\u0006\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"Ldh2/c;", "viewModel", "Loq/i0;", "j", "(Ldh2/c;Lm2/r;I)V", "Ldh2/c$a$b;", "data", "q", "(Ldh2/c$a$b;Lm2/r;I)V", "Ldh2/c$a$a;", "m", "(Ldh2/c$a$a;Lm2/r;I)V", "state", "t", "v", "", "Ldh2/c$a$a$a;", "groups", "x", "(Ljava/util/List;Lm2/r;I)V", "Ldh2/c$a;", "landregistry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f42609f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f42609f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f42608e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = this.f42609f;
                this.f42608e = 1;
                if (y0.r(y0Var, 0, 0, this, 2, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f42609f, eVar);
        }
    }

    public static final void j(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(511248523);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(511248523, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.ordereddocuments.OrderedDocumentsScreen (OrderedDocumentsScreen.kt:36)");
            }
            c.a aVarK = k(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarK instanceof c.a.Content) {
                rVarH.X(1683565691);
                m((c.a.Content) aVarK, rVarH, 0);
                rVarH.R();
            } else if (aVarK instanceof c.a.Empty) {
                rVarH.X(1683568793);
                q((c.a.Empty) aVarK, rVarH, 0);
                rVarH.R();
            } else if (fr.t.c(aVarK, c.a.d.f42590a)) {
                rVarH.X(1683571676);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarK instanceof c.a.Error)) {
                    rVarH.X(1683563418);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1683574419);
                ((c.a.Error) aVarK).getAdapter().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: dh2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.l(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
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

    public static final void m(final c.a.Content content, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-374670937);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(content) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-374670937, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.ordereddocuments.OrderedDocumentsScreenContent (OrderedDocumentsScreen.kt:75)");
            }
            q0.g(false, content.d(), rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(content.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-987946918, true, new er.q() { // from class: dh2.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.n(content, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: dh2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.p(content, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final c.a.Content content, d3 d3Var, p076m2.r rVar, int i15) {
        float spacing200;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-987946918, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.ordereddocuments.OrderedDocumentsScreenContent.<anonymous> (OrderedDocumentsScreen.kt:81)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            if (content.getSearchBar().getIsActive()) {
                rVar.X(1484455346);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getZero();
                rVar.R();
            } else {
                rVar.X(1484515052);
                spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200();
                rVar.R();
            }
            f3.m mVarP = a3.p(mVarL, spacing200, 0.0f, 2, null);
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
            f0.A(null, content.getSearchBar(), y2.m.d(-60727546, true, new er.p() { // from class: dh2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.o(content, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
            if (content.getSearchBar().getIsActive()) {
                rVar.X(-1702915682);
            } else {
                rVar.X(-1699408652);
                v(content, rVar, 0);
            }
            rVar.R();
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
    public static final i0 o(c.a.Content content, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-60727546, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.ordereddocuments.OrderedDocumentsScreenContent.<anonymous>.<anonymous>.<anonymous> (OrderedDocumentsScreen.kt:96)");
            }
            t(content, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(c.a.Content content, int i15, p076m2.r rVar, int i16) {
        m(content, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void q(final c.a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-712063425);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-712063425, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.ordereddocuments.OrderedDocumentsScreenEmpty (OrderedDocumentsScreen.kt:52)");
            }
            q0.g(false, empty.c(), rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(empty.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1162985870, true, new er.q() { // from class: dh2.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.r(empty, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: dh2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.s(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(c.a.Empty empty, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1162985870, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.ordereddocuments.OrderedDocumentsScreenEmpty.<anonymous> (OrderedDocumentsScreen.kt:58)");
            }
            f3.m mVarN = t70.s.n(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            q40.i.b(empty.b(), null, null, rVar, IconPageData.f164667h, 6);
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
    public static final i0 s(c.a.Empty empty, int i15, p076m2.r rVar, int i16) {
        q(empty, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void t(final c.a.Content content, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(323816485);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(content) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(323816485, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.ordereddocuments.SearchBarActiveContent (OrderedDocumentsScreen.kt:111)");
            }
            y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            String query = content.getSearchBar().getQuery();
            boolean zW = rVarH.W(y0VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(y0VarC, null);
                rVarH.v(objE);
            }
            Function0.d(query, (er.p) objE, rVarH, 0);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = a3.n(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200());
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
            f3.m mVarF = androidx.compose.foundation.layout.d.f(t70.i.S(companion, null, rVarH, 6, 1), 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = e0.a(iVar.k(), companion2.k(), rVarH, 0);
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
            x(content.c(), rVarH, 0);
            rVarH.x();
            if (content.c().isEmpty()) {
                rVarH.X(-1268789739);
                f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                w0 w0VarA2 = e0.a(iVar.e(), companion2.g(), rVarH, 54);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT3 = rVarH.t();
                f3.m mVarE3 = f3.j.e(rVarH, mVarF2);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB3);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarA2, companion3.d());
                n6.i(rVarC3, e0VarT3, companion3.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                n6.g(rVarC3, companion3.a());
                n6.i(rVarC3, mVarE3, companion3.e());
                k40.d.c(null, content.getEmptySearch(), rVarH, EmptyStateData.f108236d << 3, 1);
                rVarH.x();
            } else {
                rVarH.X(-1272940329);
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
            d5VarM.a(new er.p() { // from class: dh2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.u(content, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(c.a.Content content, int i15, p076m2.r rVar, int i16) {
        t(content, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void v(final c.a.Content content, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1576485059);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(content) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1576485059, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.ordereddocuments.SearchInactiveContent (OrderedDocumentsScreen.kt:145)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(companion, null, rVarH, 6, 1);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarS);
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
            x(content.c(), rVarH, 0);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dh2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.w(content, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(c.a.Content content, int i15, p076m2.r rVar, int i16) {
        v(content, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void x(final List<c.a.Content.Group> list, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-322755419);
        char c15 = 2;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(list) ? 4 : 2);
        } else {
            i16 = i15;
        }
        int i17 = 0;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-322755419, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.ordereddocuments.ordereddocuments.ShowGroups (OrderedDocumentsScreen.kt:153)");
            }
            rVarH.X(-930309171);
            List<c.a.Content.Group> list2 = list;
            char c16 = '\n';
            ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                c.a.Content.Group group = (c.a.Content.Group) it.next();
                Label title = group.getTitle();
                k70.a aVar = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                p076m2.r rVar2 = rVarH;
                ArrayList arrayList2 = arrayList;
                int i19 = i17;
                Iterator it4 = it;
                j70.h.g(null, null, title, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
                rVarH = rVar2;
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVarH, i18).getSpacing300()), rVarH, i19);
                rVarH.X(-930303046);
                List<n50.k> listA = group.a();
                ArrayList arrayList3 = new ArrayList(pq.v.y(listA, 10));
                Iterator<T> it5 = listA.iterator();
                while (it5.hasNext()) {
                    h0.v((n50.k) it5.next(), null, rVarH, i19, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, i19);
                    arrayList3.add(i0.f148189a);
                }
                rVarH.R();
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, i19);
                arrayList2.add(i0.f148189a);
                i17 = i19;
                arrayList = arrayList2;
                c16 = '\n';
                c15 = 2;
                it = it4;
            }
            rVarH.R();
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, i17);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dh2.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.y(list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(List list, int i15, p076m2.r rVar, int i16) {
        x(list, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
