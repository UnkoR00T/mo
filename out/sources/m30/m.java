package m30;

import d1.e0;
import er.r;
import f1.b1;
import f1.q0;
import f1.y0;
import java.util.List;
import n30.CardListData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln30/b;", "data", "Lf1/y0;", "stateList", "Loq/i0;", "d", "(Ln30/b;Lf1/y0;Lm2/r;II)V", "Lf1/q0;", "h", "(Lf1/q0;Ln30/b;)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f123524a;

        public a(List list) {
            this.f123524a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f123524a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f123525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardListData f123526b;

        public b(List list, CardListData cardListData) {
            this.f123525a = list;
            this.f123526b = cardListData;
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
            if (t.k()) {
                t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            n50.k kVar = (n50.k) this.f123525a.get(i15);
            rVar.X(-167814700);
            m30.e.b(i15, kVar, this.f123526b, null, rVar, ((i17 & 126) >> 3) & 14, 8);
            rVar.R();
            if (t.k()) {
                t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f123527a;

        public c(List list) {
            this.f123527a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f123527a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f123528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CardListData f123529b;

        public d(List list, CardListData cardListData) {
            this.f123528a = list;
            this.f123529b = cardListData;
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
            if (t.k()) {
                t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            n50.k kVar = (n50.k) this.f123528a.get(i15);
            rVar.X(-1112983366);
            m30.c.e(i15, v.p(this.f123529b.d()), y2.m.d(1032804385, true, new e(i15, kVar, this.f123529b), rVar, 54), rVar, (((i17 & 126) >> 3) & 14) | MLKEMEngine.KyberPolyBytes);
            rVar.R();
            if (t.k()) {
                t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f123530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n50.k f123531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CardListData f123532c;

        e(int i15, n50.k kVar, CardListData cardListData) {
            this.f123530a = i15;
            this.f123531b = kVar;
            this.f123532c = cardListData;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                rVar.O();
                return;
            }
            if (t.k()) {
                t.o(1032804385, i15, -1, "pl.gov.coi.common.ui.ds.cardlist.itemsCardList.<anonymous>.<anonymous> (LazyCardList.kt:67)");
            }
            m30.e.b(this.f123530a, this.f123531b, this.f123532c, null, rVar, 0, 8);
            if (t.k()) {
                t.n();
            }
        }
    }

    public static final void d(final CardListData cardListData, final y0 y0Var, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-1164840326);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(cardListData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= ((i16 & 2) == 0 && rVarH.W(y0Var)) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                }
            } else if ((i16 & 2) != 0) {
                y0Var = b1.c(0, 0, rVarH, 0, 3);
                i17 &= -113;
            }
            rVarH.y();
            if (t.k()) {
                t.o(-1164840326, i17, -1, "pl.gov.coi.common.ui.ds.cardlist.LazyCardList (LazyCardList.kt:30)");
            }
            f3.m mVarE = d60.m.e(f3.m.INSTANCE, cardListData.getFieldIndex(), rVarH, 6);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarE);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE2, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            m30.c.c(null, y2.m.d(1589983197, true, new er.p() { // from class: m30.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.e(cardListData, y0Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48, 1);
            o30.d.d(cardListData, rVarH, i17 & 14);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m30.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.g(cardListData, y0Var, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(final CardListData cardListData, y0 y0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1589983197, i15, -1, "pl.gov.coi.common.ui.ds.cardlist.LazyCardList.<anonymous>.<anonymous> (LazyCardList.kt:35)");
            }
            f3.m mVarB = cardListData.getAnimateSizeChange() ? p114t0.n.b(f3.m.INSTANCE, u0.m.l(300, 0, u0.i0.f(), 2, null), null, 2, null) : f3.m.INSTANCE;
            boolean zW = rVar.W(cardListData);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: m30.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.f(cardListData, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarB, y0Var, null, false, null, null, null, false, null, (er.l) objE, rVar, 0, 508);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(CardListData cardListData, q0 q0Var) {
        List<n50.k> listD = cardListData.d();
        q0Var.j(listD.size(), null, new a(listD), y2.m.b(2039820996, true, new b(listD, cardListData)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(CardListData cardListData, y0 y0Var, int i15, int i16, p076m2.r rVar, int i17) {
        d(cardListData, y0Var, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void h(q0 q0Var, CardListData cardListData) {
        List<n50.k> listD = cardListData.d();
        q0Var.j(listD.size(), null, new c(listD), y2.m.b(2039820996, true, new d(listD, cardListData)));
        o30.d.f(q0Var, cardListData);
    }
}
