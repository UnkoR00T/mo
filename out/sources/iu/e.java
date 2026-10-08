package iu;

import fr.k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Liu/e;", "T", "", "value", "Liu/f;", "trace", "<init>", "(Ljava/lang/Object;Liu/f;)V", "expect", "update", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Liu/f;", "getTrace", "()Liu/f;", "getTrace$annotations", "()V", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "d", "(Ljava/lang/Object;)V", "atomicfu"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f97085c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<e<?>, Object> f97086d = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f trace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile T value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Rd\u0010\u0007\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liu/e$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Liu/e;", "kotlin.jvm.PlatformType", "FU", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "atomicfu"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public e(T t15, f fVar) {
        this.trace = fVar;
        this.value = t15;
    }

    public final boolean a(T expect, T update) {
        f fVar;
        boolean zA = androidx.concurrent.futures.b.a(f97086d, this, expect, update);
        if (zA && (fVar = this.trace) != f.a.f97089a) {
            fVar.a("CAS(" + expect + ", " + update + ')');
        }
        return zA;
    }

    public final T b(T value) {
        T t15 = (T) f97086d.getAndSet(this, value);
        f fVar = this.trace;
        if (fVar != f.a.f97089a) {
            fVar.a("getAndSet(" + value + "):" + t15);
        }
        return t15;
    }

    public final T c() {
        return this.value;
    }

    public final void d(T t15) {
        this.value = t15;
        f fVar = this.trace;
        if (fVar != f.a.f97089a) {
            fVar.a("set(" + t15 + ')');
        }
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
