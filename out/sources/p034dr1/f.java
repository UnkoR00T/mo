package p034dr1;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.i;
import er.l;
import er.q;
import f1.e;
import f1.q0;
import f3.j;
import j70.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.s0;
import pq.v;
import y2.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f44182a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<d3, r, Integer, i0> f44183b = m.b(-1934602814, false, new q() { // from class: dr1.d
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return f.d((d3) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f44184a = new a();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(String str) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f44185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f44186b;

        public b(l lVar, List list) {
            this.f44185a = lVar;
            this.f44186b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f44185a.b(this.f44186b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<e, Integer, r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f44187a;

        public c(List list) {
            this.f44187a = list;
        }

        public final void c(e eVar, int i15, r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = i16 | (rVar.W(eVar) ? 4 : 2);
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
                t.o(802480018, i17, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            String str = (String) this.f44187a.get(i15);
            rVar.X(254911209);
            h.g(d.i(d.h(f3.m.INSTANCE, 0.0f, 1, null), c5.h.n(40)), null, mx.b.b(str, ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 6, 0, 0, 33554426);
            rVar.R();
            if (t.k()) {
                t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(e eVar, Integer num, r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = (rVar.W(d3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1934602814, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.topappbar.ComposableSingletons$DeveloperTopAppBarMediumScreenKt.lambda$-1934602814.<anonymous> (DeveloperTopAppBarMediumScreen.kt:57)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarA = e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarL);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            lr.i iVar = new lr.i(0, 100);
            final ArrayList arrayList = new ArrayList(v.y(iVar, 10));
            Iterator<Integer> it = iVar.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((s0) it).nextInt()));
            }
            f3.m mVarD = d.d(f3.m.INSTANCE, 0.0f, 1, null);
            boolean zG = rVar.G(arrayList);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: dr1.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.e(arrayList, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarD, null, null, false, null, null, null, false, null, (l) objE, rVar, 6, 510);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(List list, q0 q0Var) {
        q0Var.j(list.size(), null, new b(a.f44184a, list), m.b(802480018, true, new c(list)));
        return i0.f148189a;
    }

    public final q<d3, r, Integer, i0> c() {
        return f44183b;
    }
}
