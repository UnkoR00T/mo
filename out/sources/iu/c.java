package iu;

import fr.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u00192\u00020\u0001:\u0001\u000bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Liu/c;", "", "", "value", "Liu/f;", "trace", "<init>", "(ILiu/f;)V", "expect", "update", "", "a", "(II)Z", "d", "()I", "b", "", "toString", "()Ljava/lang/String;", "Liu/f;", "getTrace", "()Liu/f;", "getTrace$annotations", "()V", "I", "c", "e", "(I)V", "atomicfu"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f97077c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater<c> f97078d = AtomicIntegerFieldUpdater.newUpdater(c.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f trace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile int value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R8\u0010\u0007\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liu/c$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;", "Liu/c;", "kotlin.jvm.PlatformType", "FU", "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;", "atomicfu"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public c(int i15, f fVar) {
        this.trace = fVar;
        this.value = i15;
    }

    public final boolean a(int expect, int update) {
        f fVar;
        boolean zCompareAndSet = f97078d.compareAndSet(this, expect, update);
        if (zCompareAndSet && (fVar = this.trace) != f.a.f97089a) {
            fVar.a("CAS(" + expect + ", " + update + ')');
        }
        return zCompareAndSet;
    }

    public final int b() {
        int iDecrementAndGet = f97078d.decrementAndGet(this);
        f fVar = this.trace;
        if (fVar != f.a.f97089a) {
            fVar.a("decAndGet():" + iDecrementAndGet);
        }
        return iDecrementAndGet;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final int d() {
        int iIncrementAndGet = f97078d.incrementAndGet(this);
        f fVar = this.trace;
        if (fVar != f.a.f97089a) {
            fVar.a("incAndGet():" + iIncrementAndGet);
        }
        return iIncrementAndGet;
    }

    public final void e(int i15) {
        this.value = i15;
        f fVar = this.trace;
        if (fVar != f.a.f97089a) {
            fVar.a("set(" + i15 + ')');
        }
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
