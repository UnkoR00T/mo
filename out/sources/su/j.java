package su;

import er.p;
import er.q;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.k3;
import ju.n;
import ju.r;
import oq.i0;
import ou.b0;
import ou.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0018\u0010\tJ\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR,\u0010#\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0011\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004R\u0011\u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004R\u000b\u0010+\u001a\u00020(8\u0002X\u0082\u0004R\u000b\u0010-\u001a\u00020,8\u0002X\u0082\u0004¨\u0006."}, d2 = {"Lsu/j;", "", "", "permits", "acquiredPermits", "<init>", "(II)V", "Loq/i0;", "g", "(Ltq/e;)Ljava/lang/Object;", "k", "()I", "j", "()V", "Lju/k3;", "waiter", "", "i", "(Lju/k3;)Z", "w", "()Z", "v", "(Ljava/lang/Object;)Z", "u", "c", "Lju/n;", "f", "(Lju/n;)V", "b", "a", "I", "Lkotlin/Function3;", "", "Ltq/i;", "Ler/q;", "onCancellationRelease", "availablePermits", "Liu/e;", "Lsu/m;", "head", "Liu/d;", "deqIdx", "tail", "enqIdx", "Liu/c;", "_availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f184348c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f184349d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f184350e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f184351f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f184352g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int permits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q<Throwable, i0, tq.i, i0> onCancellationRelease;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends fr.q implements p<Long, m, m> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f184355j = new a();

        a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ m B(Long l15, m mVar) {
            return E(l15.longValue(), mVar);
        }

        public final m E(long j15, m mVar) {
            return l.j(j15, mVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends fr.q implements p<Long, m, m> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f184356j = new b();

        b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ m B(Long l15, m mVar) {
            return E(l15.longValue(), mVar);
        }

        public final m E(long j15, m mVar) {
            return l.j(j15, mVar);
        }
    }

    public j(int i15, int i16) {
        this.permits = i15;
        if (i15 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i15).toString());
        }
        if (i16 < 0 || i16 > i15) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i15).toString());
        }
        m mVar = new m(0L, null, 2);
        this.head$volatile = mVar;
        this.tail$volatile = mVar;
        this._availablePermits$volatile = i15 - i16;
        this.onCancellationRelease = new q() { // from class: su.i
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return j.t(this.f184347a, (Throwable) obj, (i0) obj2, (tq.i) obj3);
            }
        };
    }

    private final Object g(tq.e<? super i0> eVar) {
        ju.p pVarB = r.b(uq.b.c(eVar));
        try {
            if (!i(pVarB)) {
                f(pVarB);
            }
            Object objX = pVarB.x();
            if (objX == uq.b.e()) {
                vq.g.c(eVar);
            }
            return objX == uq.b.e() ? objX : i0.f148189a;
        } catch (Throwable th4) {
            pVarB.N();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(k3 waiter) {
        Object objC;
        m mVar = (m) f184350e.get(this);
        long andIncrement = f184351f.getAndIncrement(this);
        a aVar = a.f184355j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f184350e;
        long j15 = andIncrement / ((long) l.f184362f);
        loop0: while (true) {
            objC = ou.b.c(mVar, j15, aVar);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= b0VarB.id) {
                        break loop0;
                    }
                    if (!b0VarB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (!b0Var.p()) {
                            break loop0;
                        }
                        b0Var.n();
                        break loop0;
                    }
                    if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        }
        m mVar2 = (m) c0.b(objC);
        int i15 = (int) (andIncrement % ((long) l.f184362f));
        if (lu.l.a(mVar2.getF184363e(), i15, null, waiter)) {
            waiter.g(mVar2, i15);
            return true;
        }
        if (!lu.l.a(mVar2.getF184363e(), i15, l.f184358b, l.f184359c)) {
            return false;
        }
        if (waiter instanceof n) {
            ((n) waiter).T(i0.f148189a, this.onCancellationRelease);
        } else {
            if (!(waiter instanceof ru.k)) {
                throw new IllegalStateException(("unexpected: " + waiter).toString());
            }
            ((ru.k) waiter).f(i0.f148189a);
        }
        return true;
    }

    private final void j() {
        int i15;
        do {
            i15 = f184352g.get(this);
            if (i15 <= this.permits) {
                return;
            }
        } while (!f184352g.compareAndSet(this, i15, this.permits));
    }

    private final int k() {
        int andDecrement;
        do {
            andDecrement = f184352g.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(j jVar, Throwable th4, i0 i0Var, tq.i iVar) {
        jVar.b();
        return i0.f148189a;
    }

    private final boolean v(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            Object objU = nVar.U(i0.f148189a, null, this.onCancellationRelease);
            if (objU == null) {
                return false;
            }
            nVar.W(objU);
            return true;
        }
        if (obj instanceof ru.k) {
            return ((ru.k) obj).h(this, i0.f148189a);
        }
        throw new IllegalStateException(("unexpected: " + obj).toString());
    }

    private final boolean w() {
        Object objC;
        m mVar = (m) f184348c.get(this);
        long andIncrement = f184349d.getAndIncrement(this);
        long j15 = andIncrement / ((long) l.f184362f);
        b bVar = b.f184356j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f184348c;
        loop0: while (true) {
            objC = ou.b.c(mVar, j15, bVar);
            if (c0.c(objC)) {
                break;
            }
            b0 b0VarB = c0.b(objC);
            while (true) {
                b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                if (b0Var.id >= b0VarB.id) {
                    break loop0;
                }
                if (!b0VarB.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                    if (!b0Var.p()) {
                        break loop0;
                    }
                    b0Var.n();
                    break loop0;
                }
                if (b0VarB.p()) {
                    b0VarB.n();
                }
            }
        }
        m mVar2 = (m) c0.b(objC);
        mVar2.b();
        if (mVar2.id > j15) {
            return false;
        }
        int i15 = (int) (andIncrement % ((long) l.f184362f));
        Object andSet = mVar2.getF184363e().getAndSet(i15, l.f184358b);
        if (andSet != null) {
            if (andSet == l.f184361e) {
                return false;
            }
            return v(andSet);
        }
        int i16 = l.f184357a;
        for (int i17 = 0; i17 < i16; i17++) {
            if (mVar2.getF184363e().get(i15) == l.f184359c) {
                return true;
            }
        }
        return !lu.l.a(mVar2.getF184363e(), i15, l.f184358b, l.f184360d);
    }

    public final int a() {
        return Math.max(f184352g.get(this), 0);
    }

    public final void b() {
        do {
            int andIncrement = f184352g.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                j();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!w());
    }

    public final Object c(tq.e<? super i0> eVar) {
        Object objG;
        return (k() <= 0 && (objG = g(eVar)) == uq.b.e()) ? objG : i0.f148189a;
    }

    protected final void f(n<? super i0> waiter) {
        while (k() <= 0) {
            if (i((k3) waiter)) {
                return;
            }
        }
        waiter.T(i0.f148189a, this.onCancellationRelease);
    }

    public final boolean u() {
        while (true) {
            int i15 = f184352g.get(this);
            if (i15 > this.permits) {
                j();
            } else {
                if (i15 <= 0) {
                    return false;
                }
                if (f184352g.compareAndSet(this, i15, i15 - 1)) {
                    return true;
                }
            }
        }
    }
}
