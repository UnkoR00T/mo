package iu;

import fr.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\nB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Liu/a;", "", "", "v", "Liu/f;", "trace", "<init>", "(ZLiu/f;)V", "expect", "update", "a", "(ZZ)Z", "", "toString", "()Ljava/lang/String;", "Liu/f;", "getTrace", "()Liu/f;", "getTrace$annotations", "()V", "", "b", "I", "_value", "value", "()Z", "c", "(Z)V", "atomicfu"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C2273a f97073c = new C2273a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater<a> f97074d = AtomicIntegerFieldUpdater.newUpdater(a.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f trace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile int _value;

    /* JADX INFO: renamed from: iu.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R8\u0010\u0007\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liu/a$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;", "Liu/a;", "kotlin.jvm.PlatformType", "FU", "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;", "atomicfu"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class C2273a {
        public /* synthetic */ C2273a(k kVar) {
            this();
        }

        private C2273a() {
        }
    }

    public a(boolean z15, f fVar) {
        this.trace = fVar;
        this._value = z15 ? 1 : 0;
    }

    public final boolean a(boolean expect, boolean update) {
        f fVar;
        boolean zCompareAndSet = f97074d.compareAndSet(this, expect ? 1 : 0, update ? 1 : 0);
        if (zCompareAndSet && (fVar = this.trace) != f.a.f97089a) {
            fVar.a("CAS(" + expect + ", " + update + ')');
        }
        return zCompareAndSet;
    }

    public final boolean b() {
        return this._value != 0;
    }

    public final void c(boolean z15) {
        this._value = z15 ? 1 : 0;
        f fVar = this.trace;
        if (fVar != f.a.f97089a) {
            fVar.a("set(" + z15 + ')');
        }
    }

    public String toString() {
        return String.valueOf(b());
    }
}
