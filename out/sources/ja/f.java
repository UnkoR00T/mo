package ja;

import ju.d2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"T", "Lju/d2;", "controller", "Lkotlin/Function2;", "Lja/h1;", "Ltq/e;", "Loq/i0;", "", "block", "Lmu/g;", "a", "(Lju/d2;Ler/p;)Lmu/g;", "paging-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lja/h1;", "Loq/i0;", "<anonymous>", "(Lja/h1;)V"}, k = 3, mv = {2, 0, 0})
    static final class a<T> extends vq.k implements er.p<h1<T>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f100670f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d2 f100671g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.p<h1<T>, tq.e<? super oq.i0>, Object> f100672h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d2 d2Var, er.p<? super h1<T>, ? super tq.e<? super oq.i0>, ? extends Object> pVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f100671g = d2Var;
            this.f100672h = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(h1 h1Var, Throwable th4) {
            lu.z.a.a(h1Var, null, 1, null);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f100669e;
            if (i15 == 0) {
                oq.u.b(obj);
                final h1<T> h1Var = (h1) this.f100670f;
                this.f100671g.C0(new er.l() { // from class: ja.e
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f.a.O(h1Var, (Throwable) obj2);
                    }
                });
                er.p<h1<T>, tq.e<? super oq.i0>, Object> pVar = this.f100672h;
                this.f100669e = 1;
                if (pVar.B(h1Var, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(h1<T> h1Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(h1Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f100671g, this.f100672h, eVar);
            aVar.f100670f = obj;
            return aVar;
        }
    }

    public static final <T> mu.g<T> a(d2 d2Var, er.p<? super h1<T>, ? super tq.e<? super oq.i0>, ? extends Object> pVar) {
        return g1.a(new a(d2Var, pVar, null));
    }
}
