package ka2;

import dx.i;
import er.p;
import ju.g1;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lka2/g;", "Lz92/f;", "Lja2/c;", "repository", "<init>", "(Lja2/c;)V", "Lz92/f$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "e", "(Lz92/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lja2/c;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements z92.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ja2.c repository;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, tq.e<? super i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109382e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z92.f.Params f109384g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z92.f.Params params, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f109384g = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f109382e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ja2.c cVar = g.this.repository;
            y92.g activity = this.f109384g.getActivity();
            this.f109382e = 1;
            Object objB = cVar.b(activity, this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i<? extends dx.b, i0>> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return g.this.new a(this.f109384g, eVar);
        }
    }

    public g(ja2.c cVar) {
        this.repository = cVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(z92.f.Params params, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return ju.i.g(g1.b(), new a(params, null), eVar);
    }
}
