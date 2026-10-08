package m7;

import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/j$b;", "maxLifecycle", "Landroidx/lifecycle/q;", "parent", "c", "(Landroidx/lifecycle/j$b;Landroidx/lifecycle/q;Lm2/r;II)Landroidx/lifecycle/q;", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m7.a f124011f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.j.b f124012g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m7.a aVar, androidx.lifecycle.j.b bVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f124011f = aVar;
            this.f124012g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f124010e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.f124011f.c(this.f124012g);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f124011f, this.f124012g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"m7/q$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.q f124013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.n f124014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m7.a f124015c;

        public b(androidx.p016lifecycle.q qVar, androidx.p016lifecycle.n nVar, m7.a aVar) {
            this.f124013a = qVar;
            this.f124014b = nVar;
            this.f124015c = aVar;
        }

        @Override // p076m2.r0
        public void j() {
            androidx.p016lifecycle.j lifecycleRegistry;
            androidx.p016lifecycle.q qVar = this.f124013a;
            if (qVar != null && (lifecycleRegistry = qVar.getLifecycleRegistry()) != null) {
                lifecycleRegistry.d(this.f124014b);
            }
            this.f124015c.b(androidx.lifecycle.j.a.ON_DESTROY);
        }
    }

    public static final androidx.p016lifecycle.q c(androidx.lifecycle.j.b bVar, final androidx.p016lifecycle.q qVar, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            bVar = androidx.lifecycle.j.b.RESUMED;
        }
        if ((i16 & 2) != 0) {
            qVar = (androidx.p016lifecycle.q) rVar.N(n.c());
        }
        if (t.k()) {
            t.o(-1501509168, i15, -1, "androidx.lifecycle.compose.rememberLifecycleOwner (RememberLifecycleOwner.kt:78)");
        }
        boolean zW = rVar.W(qVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new m7.a();
            rVar.v(objE);
        }
        final m7.a aVar = (m7.a) objE;
        boolean zG = rVar.G(aVar) | rVar.G(qVar);
        Object objE2 = rVar.E();
        if (zG || objE2 == r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: m7.o
                @Override // er.l
                public final Object b(Object obj) {
                    return q.d(qVar, aVar, (s0) obj);
                }
            };
            rVar.v(objE2);
        }
        Function0.b(aVar, qVar, (er.l) objE2, rVar, i15 & 112);
        boolean zG2 = rVar.G(aVar) | ((((i15 & 14) ^ 6) > 4 && rVar.c(bVar.ordinal())) || (i15 & 6) == 4);
        Object objE3 = rVar.E();
        if (zG2 || objE3 == r.INSTANCE.a()) {
            objE3 = new a(aVar, bVar, null);
            rVar.v(objE3);
        }
        Function0.e(aVar, bVar, (er.p) objE3, rVar, (i15 << 3) & 112);
        if (t.k()) {
            t.n();
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 d(androidx.p016lifecycle.q qVar, final m7.a aVar, s0 s0Var) {
        androidx.p016lifecycle.j lifecycleRegistry;
        androidx.p016lifecycle.n nVar = new androidx.p016lifecycle.n() { // from class: m7.p
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar2, androidx.lifecycle.j.a aVar2) {
                q.e(aVar, qVar2, aVar2);
            }
        };
        if (qVar != null && (lifecycleRegistry = qVar.getLifecycleRegistry()) != null) {
            lifecycleRegistry.a(nVar);
        }
        if (qVar == null) {
            aVar.b(androidx.lifecycle.j.a.ON_RESUME);
        }
        return new b(qVar, nVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(m7.a aVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar2) {
        aVar.b(aVar2);
    }
}
