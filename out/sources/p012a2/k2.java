package p012a2;

import androidx.camera.view.i;
import er.l;
import er.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import ju.d2;
import ju.p0;
import ju.q0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import su.g;
import tq.e;
import vq.k;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0015j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"La2/k2;", "", "<init>", "()V", "La2/k2$a;", "mutator", "Loq/i0;", "f", "(La2/k2$a;)V", "R", "Lw0/z1;", "priority", "Lkotlin/Function1;", "Ltq/e;", "block", "d", "(Lw0/z1;Ler/l;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "e", "(Ler/a;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/material/InternalAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lsu/a;", "b", "Lsu/a;", "mutex", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = g.b(false, 1, null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"La2/k2$a;", "", "Lw0/z1;", "priority", "Lju/d2;", "job", "<init>", "(Lw0/z1;Lju/d2;)V", "other", "", "a", "(La2/k2$a;)Z", "Loq/i0;", "b", "()V", "Lw0/z1;", "getPriority", "()Lw0/z1;", "Lju/d2;", "getJob", "()Lju/d2;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final z1 priority;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final d2 job;

        public a(z1 z1Var, d2 d2Var) {
            this.priority = z1Var;
            this.job = d2Var;
        }

        public final boolean a(a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            d2.a.a(this.job, null, 1, null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    static final class b<R> extends k implements p<p0, e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f1739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f1740f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f1741g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f1742h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f1743j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ z1 f1744k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ k2 f1745l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ l<e<? super R>, Object> f1746m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(z1 z1Var, k2 k2Var, l<? super e<? super R>, ? extends Object> lVar, e<? super b> eVar) {
            super(2, eVar);
            this.f1744k = z1Var;
            this.f1745l = k2Var;
            this.f1746m = lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, su.a] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            su.a aVar;
            a aVar2;
            k2 k2Var;
            l<e<? super R>, Object> lVar;
            Throwable th4;
            k2 k2Var2;
            a aVar3;
            su.a aVar4;
            Object objE = uq.b.e();
            ?? r15 = this.f1742h;
            try {
                try {
                    if (r15 == 0) {
                        u.b(obj);
                        a aVar5 = new a(this.f1744k, (d2) ((p0) this.f1743j).getCoroutineContext().m(d2.INSTANCE));
                        this.f1745l.f(aVar5);
                        aVar = this.f1745l.mutex;
                        l<e<? super R>, Object> lVar2 = this.f1746m;
                        k2 k2Var3 = this.f1745l;
                        this.f1743j = aVar5;
                        this.f1739e = aVar;
                        this.f1740f = lVar2;
                        this.f1741g = k2Var3;
                        this.f1742h = 1;
                        if (aVar.h(null, this) != objE) {
                            aVar2 = aVar5;
                            k2Var = k2Var3;
                            lVar = lVar2;
                        }
                        return objE;
                    }
                    if (r15 != 1) {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k2Var2 = (k2) this.f1740f;
                        aVar4 = (su.a) this.f1739e;
                        aVar3 = (a) this.f1743j;
                        try {
                            u.b(obj);
                            i.a(k2Var2.currentMutator, aVar3, null);
                            aVar4.r(null);
                            return obj;
                        } catch (Throwable th5) {
                            th4 = th5;
                            i.a(k2Var2.currentMutator, aVar3, null);
                            throw th4;
                        }
                    }
                    k2Var = (k2) this.f1741g;
                    lVar = (l) this.f1740f;
                    su.a aVar6 = (su.a) this.f1739e;
                    aVar2 = (a) this.f1743j;
                    u.b(obj);
                    aVar = aVar6;
                    this.f1743j = aVar2;
                    this.f1739e = aVar;
                    this.f1740f = k2Var;
                    this.f1741g = null;
                    this.f1742h = 2;
                    Object objB = lVar.b(this);
                    if (objB != objE) {
                        k2Var2 = k2Var;
                        aVar4 = aVar;
                        obj = objB;
                        aVar3 = aVar2;
                        i.a(k2Var2.currentMutator, aVar3, null);
                        aVar4.r(null);
                        return obj;
                    }
                    return objE;
                } catch (Throwable th6) {
                    th4 = th6;
                    k2Var2 = k2Var;
                    aVar3 = aVar2;
                    i.a(k2Var2.currentMutator, aVar3, null);
                    throw th4;
                }
            } catch (Throwable th7) {
                r15.r(null);
                throw th7;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super R> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = new b(this.f1744k, this.f1745l, this.f1746m, eVar);
            bVar.f1743j = obj;
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(a mutator) {
        a aVar;
        do {
            aVar = this.currentMutator.get();
            if (aVar != null && !mutator.a(aVar)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!i.a(this.currentMutator, aVar, mutator));
        if (aVar != null) {
            aVar.b();
        }
    }

    public final <R> Object d(z1 z1Var, l<? super e<? super R>, ? extends Object> lVar, e<? super R> eVar) {
        return q0.e(new b(z1Var, this, lVar, null), eVar);
    }

    public final boolean e(er.a<i0> block) {
        boolean zB = su.a.C4762a.b(this.mutex, null, 1, null);
        if (!zB) {
            return zB;
        }
        try {
            block.a();
            return zB;
        } finally {
            su.a.C4762a.c(this.mutex, null, 1, null);
        }
    }
}
