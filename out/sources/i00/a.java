package i00;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.u0;
import er.l;
import er.p;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import uq.b;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/t0;", "Lkotlin/Function1;", "Ltq/e;", "Loq/i0;", "", "action", "a", "(Landroidx/lifecycle/t0;Ler/l;)V", "navigation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: i00.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class C2059a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l<e<? super i0>, Object> f87711f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2059a(l<? super e<? super i0>, ? extends Object> lVar, e<? super C2059a> eVar) {
            super(2, eVar);
            this.f87711f = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f87710e;
            if (i15 == 0) {
                u.b(obj);
                l<e<? super i0>, Object> lVar = this.f87711f;
                this.f87710e = 1;
                if (lVar.b(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((C2059a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new C2059a(this.f87711f, eVar);
        }
    }

    public static final void a(t0 t0Var, l<? super e<? super i0>, ? extends Object> lVar) {
        ju.k.d(u0.a(t0Var), null, null, new C2059a(lVar, null), 3, null);
    }
}
