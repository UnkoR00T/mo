package k;

import ju.d2;
import ju.p0;
import ju.q0;
import ju.r0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000e\u001a\u00020\u0005*\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lk/e;", "Lju/p0;", "scope", "Lkotlin/Function2;", "Ltq/e;", "Loq/i0;", "", "block", "Lju/d2;", "e", "(Lk/e;Lju/p0;Ler/p;)Lju/d2;", "Lsu/a;", "d", "(Lsu/a;Ltq/e;)Ljava/lang/Object;", "c", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.p<su.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f107062j = new a();

        a() {
            super(2, m.class, "lockWithoutOwner", "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // er.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Object B(su.a aVar, tq.e<? super i0> eVar) {
            return m.d(aVar, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f107063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f107064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f107065g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ e f107066h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.p<p0, tq.e<? super i0>, Object> f107067j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(e eVar, er.p<? super p0, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super b> eVar2) {
            super(2, eVar2);
            this.f107066h = eVar;
            this.f107067j = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            su.a mutex;
            er.p<p0, tq.e<? super i0>, Object> pVar;
            su.a aVar;
            Throwable th4;
            Object objE = uq.b.e();
            int i15 = this.f107064f;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    q0.f((p0) this.f107065g);
                    mutex = this.f107066h.getMutex();
                    pVar = this.f107067j;
                    this.f107065g = mutex;
                    this.f107063e = pVar;
                    this.f107064f = 1;
                    if (m.c(mutex, this) != objE) {
                    }
                    return objE;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (su.a) this.f107065g;
                    try {
                        oq.u.b(obj);
                        i0 i0Var = i0.f148189a;
                        su.a.C4762a.c(aVar, null, 1, null);
                        return i0.f148189a;
                    } catch (Throwable th5) {
                        th4 = th5;
                        su.a.C4762a.c(aVar, null, 1, null);
                        throw th4;
                    }
                }
                pVar = (er.p) this.f107063e;
                su.a aVar2 = (su.a) this.f107065g;
                oq.u.b(obj);
                mutex = aVar2;
                this.f107065g = mutex;
                this.f107063e = null;
                this.f107064f = 2;
                if (q0.e(pVar, this) != objE) {
                    aVar = mutex;
                    i0 i0Var2 = i0.f148189a;
                    su.a.C4762a.c(aVar, null, 1, null);
                    return i0.f148189a;
                }
                return objE;
            } catch (Throwable th6) {
                aVar = mutex;
                th4 = th6;
                su.a.C4762a.c(aVar, null, 1, null);
                throw th4;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f107066h, this.f107067j, eVar);
            bVar.f107065g = obj;
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(su.a aVar, tq.e<? super i0> eVar) {
        if (uq.b.d(a.f107062j, aVar, eVar) != uq.b.e()) {
            uq.b.c(eVar).i(oq.t.b(i0.f148189a));
        }
        Object objE = uq.b.e();
        if (objE == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(su.a aVar, tq.e<? super i0> eVar) {
        Object objH = aVar.h(null, eVar);
        return objH == uq.b.e() ? objH : i0.f148189a;
    }

    public static final d2 e(e eVar, p0 p0Var, er.p<? super p0, ? super tq.e<? super i0>, ? extends Object> pVar) {
        return ju.k.d(p0Var, null, r0.UNDISPATCHED, new b(eVar, pVar, null), 1, null);
    }
}
