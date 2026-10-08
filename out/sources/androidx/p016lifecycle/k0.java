package androidx.p016lifecycle;

import p071kotlin.Metadata;
import ua.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/lifecycle/k0;", "Landroidx/lifecycle/n;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "key", "Landroidx/lifecycle/i0;", "handle", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/i0;)V", "Lua/g;", "registry", "Landroidx/lifecycle/j;", "lifecycle", "Loq/i0;", "b", "(Lua/g;Landroidx/lifecycle/j;)V", "Landroidx/lifecycle/q;", "source", "Landroidx/lifecycle/j$a;", "event", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "close", "()V", "a", "Ljava/lang/String;", "Landroidx/lifecycle/i0;", "h", "()Landroidx/lifecycle/i0;", "", "value", "c", "Z", "p", "()Z", "isAttached", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 implements n, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i0 handle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isAttached;

    public k0(String str, i0 i0Var) {
        this.key = str;
        this.handle = i0Var;
    }

    public final void b(g registry, j lifecycle) {
        if (this.isAttached) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.isAttached = true;
        lifecycle.a(this);
        registry.c(this.key, this.handle.b());
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final i0 getHandle() {
        return this.handle;
    }

    @Override // androidx.p016lifecycle.n
    public void m(q source, j.a event) {
        if (event == j.a.ON_DESTROY) {
            this.isAttached = false;
            source.getLifecycleRegistry().d(this);
        }
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }
}
