package sa;

import android.os.SystemClock;
import er.p;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import ju.d2;
import ju.p0;
import ju.z0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002%#B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\u001b\u0010!\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00104R$\u0010:\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b6\u0010\u001c\"\u0004\b8\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010?R\u0011\u0010C\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lsa/b;", "", "", "timeoutAmount", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lsa/b$b;", "watch", "<init>", "(JLjava/util/concurrent/TimeUnit;Lsa/b$b;)V", "Loq/i0;", "e", "()V", "Lza/d;", "delegateOpenHelper", "l", "(Lza/d;)V", "Lju/p0;", "coroutineScope", "k", "(Lju/p0;)V", "V", "Lkotlin/Function1;", "Lza/c;", "block", "h", "(Ler/l;)Ljava/lang/Object;", "j", "()Lza/c;", "g", "f", "Lkotlin/Function0;", "onAutoClose", "n", "(Ler/a;)V", "a", "Lsa/b$b;", "b", "Lza/d;", "c", "Lju/p0;", "d", "Ler/a;", "onAutoCloseCallback", "Ljava/lang/Object;", "lock", "J", "autoCloseTimeoutInMs", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "lastDecrementRefCountTimeStamp", "i", "Lza/c;", "setDelegateDatabase$room_runtime", "(Lza/c;)V", "delegateDatabase", "", "Z", "manuallyClosed", "Lju/d2;", "Lju/d2;", "autoCloseJob", "m", "()Z", "isActive", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4615b watch;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private za.d delegateOpenHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private p0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onAutoCloseCallback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long autoCloseTimeoutInMs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger referenceCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private AtomicLong lastDecrementRefCountTimeStamp;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private za.c delegateDatabase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean manuallyClosed;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private d2 autoCloseJob;

    /* JADX INFO: renamed from: sa.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lsa/b$b;", "", "", "a", "()J", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface InterfaceC4615b {
        long a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179522e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179522e;
            if (i15 == 0) {
                u.b(obj);
                long j15 = b.this.autoCloseTimeoutInMs;
                this.f179522e = 1;
                if (z0.b(j15, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            b.this.e();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new c(eVar);
        }
    }

    public b(long j15, TimeUnit timeUnit, InterfaceC4615b interfaceC4615b) {
        this.watch = interfaceC4615b;
        this.lock = new Object();
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j15);
        this.referenceCount = new AtomicInteger(0);
        this.lastDecrementRefCountTimeStamp = new AtomicLong(interfaceC4615b.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        synchronized (this.lock) {
            try {
                if (this.watch.a() - this.lastDecrementRefCountTimeStamp.get() < this.autoCloseTimeoutInMs) {
                    return;
                }
                if (this.referenceCount.get() != 0) {
                    return;
                }
                er.a<i0> aVar = this.onAutoCloseCallback;
                if (aVar == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                aVar.a();
                za.c cVar = this.delegateDatabase;
                if (cVar != null && cVar.isOpen()) {
                    cVar.close();
                }
                this.delegateDatabase = null;
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void f() {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                d2 d2Var = this.autoCloseJob;
                if (d2Var != null) {
                    d2.a.a(d2Var, null, 1, null);
                }
                this.autoCloseJob = null;
                za.c cVar = this.delegateDatabase;
                if (cVar != null) {
                    cVar.close();
                }
                this.delegateDatabase = null;
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void g() {
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Unbalanced reference count.");
        }
        this.lastDecrementRefCountTimeStamp.set(this.watch.a());
        if (iDecrementAndGet == 0) {
            p0 p0Var = this.coroutineScope;
            this.autoCloseJob = ju.k.d(p0Var == null ? null : p0Var, null, null, new c(null), 3, null);
        }
    }

    public final <V> V h(er.l<? super za.c, ? extends V> block) {
        try {
            return block.b(j());
        } finally {
            g();
        }
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final za.c getDelegateDatabase() {
        return this.delegateDatabase;
    }

    public final za.c j() {
        d2 d2Var = this.autoCloseJob;
        za.d dVar = null;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.autoCloseJob = null;
        this.referenceCount.incrementAndGet();
        if (this.manuallyClosed) {
            throw new IllegalStateException("Attempting to open already closed database.");
        }
        synchronized (this.lock) {
            za.c cVar = this.delegateDatabase;
            if (cVar != null && cVar.isOpen()) {
                return cVar;
            }
            za.d dVar2 = this.delegateOpenHelper;
            if (dVar2 != null) {
                dVar = dVar2;
            }
            za.c cVarG3 = dVar.g3();
            this.delegateDatabase = cVarG3;
            return cVarG3;
        }
    }

    public final void k(p0 coroutineScope) {
        this.coroutineScope = coroutineScope;
    }

    public final void l(za.d delegateOpenHelper) {
        if (delegateOpenHelper instanceof g) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.delegateOpenHelper = delegateOpenHelper;
    }

    public final boolean m() {
        return !this.manuallyClosed;
    }

    public final void n(er.a<i0> onAutoClose) {
        this.onAutoCloseCallback = onAutoClose;
    }

    public /* synthetic */ b(long j15, TimeUnit timeUnit, InterfaceC4615b interfaceC4615b, int i15, fr.k kVar) {
        this(j15, timeUnit, (i15 & 4) != 0 ? new InterfaceC4615b() { // from class: sa.a
            @Override // sa.b.InterfaceC4615b
            public final long a() {
                return b.b();
            }
        } : interfaceC4615b);
    }
}
