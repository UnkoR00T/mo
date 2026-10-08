package a93;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.b1;
import f1.q0;
import f1.y0;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.List;
import java.util.Map;
import ju.p0;
import k40.EmptyStateData;
import mx.Label;
import n50.h0;
import oq.i0;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u001b\u001a\u00020\u0002*\u00020\u00162\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"La93/i;", "viewModel", "Loq/i0;", "u", "(La93/i;Lm2/r;I)V", "La93/g;", CMSAttributeTableGenerator.CONTENT_TYPE, "Lj50/e;", "searchBarData", "o", "(La93/g;Lj50/e;Lm2/r;I)V", "La93/i$a;", "data", "r", "(La93/i$a;Lm2/r;I)V", "Lk40/a;", "k", "(Lk40/a;Lm2/r;I)V", "Lmx/a;", "description", "m", "(Lmx/a;Lm2/r;I)V", "Lf1/q0;", "", "", "Ln50/k;", "items", "z", "(Lf1/q0;Ljava/util/Map;)V", "technicalsupport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f5079f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f5079f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f5078e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = this.f5079f;
                this.f5078e = 1;
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
            return new a(this.f5079f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5080a = new b();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(n50.k kVar) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f5081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f5082b;

        public c(er.l lVar, List list) {
            this.f5081a = lVar;
            this.f5082b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f5081a.b(this.f5082b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements er.r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f5083a;

        public d(List list) {
            this.f5083a = list;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = (rVar.W(eVar) ? 4 : 2) | i16;
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(802480018, i17, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            n50.k kVar = (n50.k) this.f5083a.get(i15);
            rVar.X(-1354966538);
            h0.v(kVar, null, rVar, 0, 2);
            r3.a(a3.r(f3.m.INSTANCE, 0.0f, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100(), 0.0f, 0.0f, 13, null), rVar, 0);
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(Label label, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2139454302, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.topiclist.topicListContent.<anonymous>.<anonymous> (TopicListScreen.kt:159)");
            }
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            TextStyle textStyleH = aVar.f(rVar, i16).h();
            int iD = b5.j.INSTANCE.d();
            j70.h.g(a3.r(f3.m.INSTANCE, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i16).getSpacing100(), 7, null), null, label, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(iD), 0L, b5.v.INSTANCE.b(), false, 1, 0, null, textStyleH, null, null, false, false, null, rVar, 0, 1597440, 0, 32944090);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    private static final void k(final EmptyStateData emptyStateData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(991666563);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(emptyStateData) : rVarH.G(emptyStateData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(991666563, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.topiclist.EmptyStateSection (TopicListScreen.kt:123)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.p(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50(), 0.0f, 2, null), 0.0f, 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
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
            k40.d.c(null, emptyStateData, rVarH, (EmptyStateData.f108236d << 3) | ((i16 << 3) & 112), 1);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a93.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.l(emptyStateData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(EmptyStateData emptyStateData, int i15, p076m2.r rVar, int i16) {
        k(emptyStateData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void m(final Label label, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1944332138);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1944332138, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.topiclist.InitialStateSection (TopicListScreen.kt:137)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.n(companion, aVar.b(rVarH, i17).getSpacing500()), 0.0f, 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.x xVar = d1.x.f39368a;
            rVar2 = rVarH;
            j70.h.g(null, null, label, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).h(), null, null, false, false, null, rVar2, (i16 << 6) & 896, 0, 0, 33026011);
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
            d5VarM.a(new er.p() { // from class: a93.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.n(label, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(Label label, int i15, p076m2.r rVar, int i16) {
        m(label, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void o(final g gVar, final SearchBarData searchBarData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1879438697);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(searchBarData) ? 32 : 16;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1879438697, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.topiclist.SearchBarActiveContent (TopicListScreen.kt:86)");
            }
            y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            String query = searchBarData.getQuery();
            boolean zW = rVarH.W(y0VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(y0VarC, null);
                rVarH.v(objE);
            }
            Function0.d(query, (er.p) objE, rVarH, 0);
            if (gVar instanceof g.Empty) {
                rVarH.X(-2040633507);
                k(((g.Empty) gVar).getEmptyStateData(), rVarH, EmptyStateData.f108236d);
                rVarH.R();
            } else if (gVar instanceof g.Results) {
                rVarH.X(1164978977);
                f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200());
                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(gVar))) {
                    z15 = false;
                }
                Object objE2 = rVarH.E();
                if (z15 || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new er.l() { // from class: a93.o
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t.p(gVar, (q0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                f1.d.c(mVarN, y0VarC, null, false, null, null, null, false, null, (er.l) objE2, rVarH, 0, 508);
                rVarH.R();
            } else {
                if (!(gVar instanceof g.Initial)) {
                    rVarH.X(-2040635145);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-2040622749);
                m(((g.Initial) gVar).getDescription(), rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: a93.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.q(gVar, searchBarData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(g gVar, q0 q0Var) {
        z(q0Var, ((g.Results) gVar).a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(g gVar, SearchBarData searchBarData, int i15, p076m2.r rVar, int i16) {
        o(gVar, searchBarData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void r(final i.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(161929537);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(161929537, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.topiclist.SearchBarInactiveContent (TopicListScreen.kt:110)");
            }
            f3.m mVarP = a3.p(f3.m.INSTANCE, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200(), 1, null);
            boolean zG = rVarH.G(data);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: a93.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.s(data, (q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(mVarP, null, null, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 510);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a93.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.t(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(i.Data data, q0 q0Var) {
        z(q0Var, data.b());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(i.Data data, int i15, p076m2.r rVar, int i16) {
        r(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void u(final i iVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1489452263);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iVar) : rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1489452263, i16, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.topiclist.TopicListScreen (TopicListScreen.kt:39)");
            }
            final f6 f6VarC = m7.b.c(iVar.getState(), null, null, null, rVarH, 0, 7);
            i50.s.r(v(f6VarC).getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-736370540, true, new er.q() { // from class: a93.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.w(f6VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            p088nul.q0.g(false, v(f6VarC).c(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a93.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.y(iVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i.Data v(f6<i.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final f6 f6Var, d3 d3Var, p076m2.r rVar, int i15) {
        float spacing200;
        float spacing100;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-736370540, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.topiclist.TopicListScreen.<anonymous> (TopicListScreen.kt:43)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarL = a3.l(w0.i.d(mVarF, aVar.a(rVar, i16).getBase().a(), null, 2, null), d3Var);
            if (v(f6Var).getSearchBarData().getIsActive()) {
                rVar.X(1478453276);
                spacing200 = aVar.b(rVar, i16).getZero();
                rVar.R();
            } else {
                rVar.X(1478509014);
                spacing200 = aVar.b(rVar, i16).getSpacing200();
                rVar.R();
            }
            if (v(f6Var).getSearchBarData().getIsActive()) {
                rVar.X(1478619932);
                spacing100 = aVar.b(rVar, i16).getZero();
                rVar.R();
            } else {
                rVar.X(1478675670);
                spacing100 = aVar.b(rVar, i16).getSpacing100();
                rVar.R();
            }
            f3.m mVarO = a3.o(mVarL, spacing200, spacing100);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarO);
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
            j50.f0.A(null, v(f6Var).getSearchBarData(), y2.m.d(131057512, true, new er.p() { // from class: a93.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.x(f6Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
            if (v(f6Var).getSearchBarData().getIsActive()) {
                rVar.X(-1907351656);
            } else {
                rVar.X(-1904419924);
                r(v(f6Var), rVar, 0);
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
    public static final i0 x(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(131057512, i15, -1, "pl.gov.coi.mobywatel.feature.technicalsupport.presentation.screens.topiclist.TopicListScreen.<anonymous>.<anonymous>.<anonymous> (TopicListScreen.kt:64)");
            }
            g activeSearchContent = v(f6Var).getActiveSearchContent();
            if (activeSearchContent == null) {
                rVar.X(209108260);
            } else {
                rVar.X(209108261);
                o(activeSearchContent, v(f6Var).getSearchBarData(), rVar, 0);
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
    public static final i0 y(i iVar, int i15, p076m2.r rVar, int i16) {
        u(iVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void z(q0 q0Var, Map<Label, ? extends List<? extends n50.k>> map) {
        for (Map.Entry<Label, ? extends List<? extends n50.k>> entry : map.entrySet()) {
            final Label key = entry.getKey();
            List<? extends n50.k> value = entry.getValue();
            q0 q0Var2 = q0Var;
            q0.c(q0Var2, null, null, y2.m.b(2139454302, true, new er.q() { // from class: a93.q
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.A(key, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
            q0Var2.j(value.size(), null, new c(b.f5080a, value), y2.m.b(802480018, true, new d(value)));
            q0Var = q0Var2;
        }
    }
}
