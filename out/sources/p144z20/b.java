package p144z20;

import er.l;
import er.p;
import er.r;
import f1.e;
import f1.q0;
import f3.m;
import f3.v;
import java.util.List;
import k3.u;
import n3.a2;
import n3.z1;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "T", "Lf1/q0;", "", "items", "Lkotlin/Function2;", "Lf3/m;", "Loq/i0;", "rowContent", "Lz20/c;", "dragDropListState", "Lkotlin/Function1;", "key", "b", "(Lf1/q0;Ljava/util/List;Ler/r;Lz20/c;Ler/l;)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f232328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f232329b;

        public a(p pVar, List list) {
            this.f232328a = pVar;
            this.f232329b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f232328a.B(Integer.valueOf(i15), this.f232329b.get(i15));
        }
    }

    /* JADX INFO: renamed from: z20.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C6233b implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f232330a;

        public C6233b(List list) {
            this.f232330a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f232330a.get(i15);
            return new DraggableItem(i15);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements r<e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f232331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p144z20.c f232332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f232333c;

        public c(List list, p144z20.c cVar, r rVar) {
            this.f232331a = list;
            this.f232332b = cVar;
            this.f232333c = rVar;
        }

        public final void c(e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            m mVarB;
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
                t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            Object obj = this.f232331a.get(i15);
            rVar.X(-1744372133);
            Integer numC = this.f232332b.c();
            if (numC != null && numC.intValue() == i15) {
                rVar.X(-1744315280);
                m mVarA = v.a(m.INSTANCE, 1.0f);
                boolean zG = rVar.G(this.f232332b);
                Object objE = rVar.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new d(this.f232332b);
                    rVar.v(objE);
                }
                m mVarC = z1.c(mVarA, (l) objE);
                k70.a aVar = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                mVarB = u.b(mVarC, aVar.c(rVar, i18).getLevel3(), aVar.e(rVar, i18).getRadius200(), false, 0L, 0L, 28, null);
                rVar.R();
            } else {
                rVar.X(-1744066536);
                m.Companion companion = m.INSTANCE;
                k70.a aVar2 = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                mVarB = u.b(companion, aVar2.c(rVar, i19).getLevel0(), aVar2.e(rVar, i19).getRadius200(), false, 0L, 0L, 28, null);
                rVar.R();
            }
            this.f232333c.g(mVarB, obj, rVar, 0);
            rVar.R();
            if (t.k()) {
                t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements l<a2, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p144z20.c f232334a;

        d(p144z20.c cVar) {
            this.f232334a = cVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2 a2Var) {
            c(a2Var);
            return i0.f148189a;
        }

        public final void c(a2 a2Var) {
            a2Var.j(this.f232334a.a());
        }
    }

    public static final <T> void b(q0 q0Var, List<? extends T> list, r<? super m, ? super T, ? super p076m2.r, ? super Integer, i0> rVar, p144z20.c cVar, final l<? super T, ? extends Object> lVar) {
        p pVar = lVar != null ? new p() { // from class: z20.a
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return b.c(lVar, ((Integer) obj).intValue(), obj2);
            }
        } : null;
        q0Var.j(list.size(), pVar != null ? new a(pVar, list) : null, new C6233b(list), y2.m.b(2039820996, true, new c(list, cVar, rVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(l lVar, int i15, Object obj) {
        return lVar.b(obj);
    }
}
