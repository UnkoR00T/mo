package y2;

import fr.n0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.j3;
import r0.q0;
import y2.e.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u00060\u0003j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ly2/e;", "Ly2/e$a;", "A", "", "<init>", "()V", "awaiter", "Lkotlin/Function0;", "Loq/i0;", "onFirstAwaiter", "Lm2/g;", "b", "(Ly2/e$a;Ler/a;)Lm2/g;", "Lkotlin/Function1;", "resume", "e", "(Ler/l;)V", "", "cause", "d", "(Ljava/lang/Throwable;)V", "Landroidx/compose/runtime/platform/SynchronizedObject;", "a", "Ljava/lang/Object;", "lock", "Ljava/lang/Throwable;", "failureCause", "Ly2/a;", "c", "Ly2/c;", "pendingAwaitersCountUnlocked", "Lr0/q0;", "Lr0/q0;", "awaiters", "spareList", "", "f", "()Z", "hasAwaiters", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<A extends a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Throwable failureCause;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private q0<A> awaiters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private q0<A> spareList;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c pendingAwaitersCountUnlocked = y2.a.b();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly2/e$a;", "", "<init>", "()V", "Loq/i0;", "a", "", "exception", "b", "(Ljava/lang/Throwable;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {
        public abstract void a();

        public abstract void b(Throwable exception);
    }

    public e() {
        int i15 = 0;
        int i16 = 1;
        fr.k kVar = null;
        this.awaiters = new q0<>(i15, i16, kVar);
        this.spareList = new q0<>(i15, i16, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(a aVar, e eVar, n0 n0Var) {
        int i15;
        aVar.a();
        c cVar = eVar.pendingAwaitersCountUnlocked;
        int i16 = n0Var.f66407a;
        do {
            i15 = cVar.get();
        } while (!cVar.compareAndSet(i15, ((i15 >>> 27) & 15) == i16 ? i15 - 1 : i15));
        return i0.f148189a;
    }

    public final p076m2.g b(final A awaiter, er.a<i0> onFirstAwaiter) {
        int i15;
        int i16;
        final n0 n0Var = new n0();
        n0Var.f66407a = -1;
        synchronized (this.lock) {
            Throwable th4 = this.failureCause;
            if (th4 != null) {
                awaiter.b(th4);
                return p076m2.g.INSTANCE.c();
            }
            c cVar = this.pendingAwaitersCountUnlocked;
            do {
                i15 = cVar.get();
                i16 = i15 + 1;
            } while (!cVar.compareAndSet(i15, i16));
            boolean z15 = true;
            if ((134217727 & i16) != 1) {
                z15 = false;
            }
            n0Var.f66407a = (i16 >>> 27) & 15;
            this.awaiters.n(awaiter);
            if (z15 && onFirstAwaiter != null) {
                try {
                    onFirstAwaiter.a();
                } catch (Throwable th5) {
                    d(th5);
                }
            }
            return new j3(new er.a() { // from class: y2.d
                @Override // er.a
                public final Object a() {
                    return e.c(awaiter, this, n0Var);
                }
            });
        }
    }

    public final void d(Throwable cause) {
        int i15;
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = cause;
                q0<A> q0Var = this.awaiters;
                Object[] objArr = q0Var.content;
                int i16 = q0Var._size;
                for (int i17 = 0; i17 < i16; i17++) {
                    ((a) objArr[i17]).b(cause);
                }
                this.awaiters.u();
                c cVar = this.pendingAwaitersCountUnlocked;
                do {
                    i15 = cVar.get();
                } while (!cVar.compareAndSet(i15, y2.a.d(cVar, ((i15 >>> 27) & 15) + 1, 0)));
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void e(er.l<? super A, i0> resume) {
        int i15;
        int i16;
        synchronized (this.lock) {
            try {
                q0<A> q0Var = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = q0Var;
                c cVar = this.pendingAwaitersCountUnlocked;
                do {
                    i15 = cVar.get();
                } while (!cVar.compareAndSet(i15, y2.a.d(cVar, ((i15 >>> 27) & 15) + 1, 0)));
                int i17 = q0Var.get_size();
                for (i16 = 0; i16 < i17; i16++) {
                    resume.b(q0Var.d(i16));
                }
                q0Var.u();
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final boolean f() {
        return (this.pendingAwaitersCountUnlocked.get() & 134217727) > 0;
    }
}
