package mu;

import ju.d2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aD\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmu/g;", "Loq/i0;", "a", "(Lmu/g;Ltq/e;)Ljava/lang/Object;", "T", "Lju/p0;", "scope", "Lju/d2;", "d", "(Lmu/g;Lju/p0;)Lju/d2;", "Lkotlin/Function2;", "Ltq/e;", "", "action", "b", "(Lmu/g;Ler/p;Ltq/e;)Ljava/lang/Object;", "Lmu/h;", "flow", "c", "(Lmu/h;Lmu/g;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g<T> f128234f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g<? extends T> gVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f128234f = gVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f128233e;
            if (i15 == 0) {
                oq.u.b(obj);
                g<T> gVar = this.f128234f;
                this.f128233e = 1;
                if (i.i(gVar, this) == objE) {
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
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f128234f, eVar);
        }
    }

    public static final Object a(g<?> gVar, tq.e<? super oq.i0> eVar) {
        Object objA = gVar.a(p086nu.t.f138789a, eVar);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    public static final <T> Object b(g<? extends T> gVar, er.p<? super T, ? super tq.e<? super oq.i0>, ? extends Object> pVar, tq.e<? super oq.i0> eVar) {
        Object objI = i.i(m.b(i.O(gVar, pVar), 0, null, 2, null), eVar);
        return objI == uq.b.e() ? objI : oq.i0.f148189a;
    }

    public static final <T> Object c(h<? super T> hVar, g<? extends T> gVar, tq.e<? super oq.i0> eVar) {
        i.w(hVar);
        Object objA = gVar.a(hVar, eVar);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    public static final <T> d2 d(g<? extends T> gVar, ju.p0 p0Var) {
        return ju.k.d(p0Var, null, null, new a(gVar, null), 3, null);
    }
}
