package m30;

import d1.a3;
import d1.x;
import er.r;
import f1.q0;
import ja.w;
import n3.t2;
import n3.y2;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf1/q0;", "Lka/a;", "Ln50/k;", "pagingItems", "Loq/i0;", "d", "(Lf1/q0;Lka/a;)V", "g", "(Lm2/r;I)V", "Lf3/m;", "", "itemIndex", "itemCount", "i", "(Lf3/m;IILm2/r;I)Lf3/m;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    public static final void d(q0 q0Var, final ka.a<n50.k> aVar) {
        q0.e(q0Var, aVar.g(), null, null, y2.m.b(-326481277, true, new r() { // from class: m30.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return q.e(aVar, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        q0.c(q0Var, null, null, y2.m.b(-1761291654, true, new er.q() { // from class: m30.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q.f(aVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(ka.a aVar, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        int i17;
        if ((i16 & 48) == 0) {
            i17 = i16 | (rVar.c(i15) ? 32 : 16);
        } else {
            i17 = i16;
        }
        if (rVar.r((i17 & 145) != 144, i17 & 1)) {
            if (t.k()) {
                t.o(-326481277, i17, -1, "pl.gov.coi.common.ui.ds.cardlist.PagingCardList.<anonymous> (PagingCardList.kt:27)");
            }
            n50.k kVar = (n50.k) aVar.f(i15);
            if (kVar == null) {
                rVar.X(1897254197);
            } else {
                rVar.X(1897254198);
                f3.m mVarD = w0.i.d(i(f3.m.INSTANCE, i15, aVar.g(), rVar, (i17 & 112) | 6), k70.a.f108864a.a(rVar, k70.a.f108865b).getSurface().a(), null, 2, null);
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                e0 e0VarT = rVar.t();
                f3.m mVarE = f3.j.e(rVar, mVarD);
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
                x xVar = x.f39368a;
                h0.v(kVar, null, rVar, 0, 2);
                rVar.x();
            }
            rVar.R();
            if (aVar.g() - 1 > i15) {
                rVar.X(1897598732);
                f3.m.Companion companion2 = f3.m.INSTANCE;
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                vb.h(a3.r(w0.i.d(companion2, aVar2.a(rVar, i18).getSurface().a(), null, 2, null), aVar2.b(rVar, i18).getSpacing200(), 0.0f, aVar2.b(rVar, i18).getSpacing200(), 0.0f, 10, null), aVar2.b(rVar, i18).getStrokeWidth(), aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVar, 0, 0);
            } else {
                rVar.X(1896095263);
            }
            rVar.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(ka.a aVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-1761291654, i15, -1, "pl.gov.coi.common.ui.ds.cardlist.PagingCardList.<anonymous> (PagingCardList.kt:53)");
            }
            if (fr.t.c(aVar.i().getAppend(), w.Loading.f101205b)) {
                rVar.X(975852300);
                g(rVar, 0);
            } else {
                rVar.X(973919016);
            }
            rVar.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    private static final void g(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(878327370);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (t.k()) {
                t.o(878327370, i15, -1, "pl.gov.coi.common.ui.ds.cardlist.PagingLoader (PagingCardList.kt:60)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            f3.c.Companion companion = f3.c.INSTANCE;
            f3.m mVarG = androidx.compose.foundation.layout.d.G(mVarH, companion.g(), false, 2, null);
            w0 w0VarI = d1.r.i(companion.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarG);
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
            x xVar = x.f39368a;
            x70.f.g(x70.a.C5796a.f217280c, rVarH, x70.a.C5796a.f217281d);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m30.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.h(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(int i15, p076m2.r rVar, int i16) {
        g(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final f3.m i(f3.m mVar, int i15, int i16, p076m2.r rVar, int i17) {
        y2 y2VarA;
        if (t.k()) {
            t.o(1803424363, i17, -1, "pl.gov.coi.common.ui.ds.cardlist.cropPagingCardBackground (PagingCardList.kt:74)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        if (i15 == 0) {
            rVar.X(-2075969722);
            if (i16 > 1) {
                rVar.X(69473170);
                k70.a aVar = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                y2VarA = l1.h.h(aVar.b(rVar, i18).getSpacing200(), aVar.b(rVar, i18).getSpacing200(), 0.0f, 0.0f, 12, null);
                rVar.R();
            } else {
                rVar.X(69617196);
                y2VarA = l1.h.f(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
                rVar.R();
            }
            rVar.R();
        } else if (i15 == i16 - 1) {
            rVar.X(-2075961008);
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            y2VarA = l1.h.h(0.0f, 0.0f, aVar2.b(rVar, i19).getSpacing200(), aVar2.b(rVar, i19).getSpacing200(), 3, null);
            rVar.R();
        } else {
            rVar.X(-2075956359);
            rVar.R();
            y2VarA = t2.a();
        }
        f3.m mVarU = mVar.u(k3.f.a(companion, y2VarA));
        if (t.k()) {
            t.n();
        }
        return mVarU;
    }
}
