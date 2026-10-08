package m7;

import androidx.p016lifecycle.s;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000fR*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0017¨\u0006\u0019"}, d2 = {"Lm7/a;", "Landroidx/lifecycle/q;", "<init>", "()V", "Loq/i0;", "d", "Landroidx/lifecycle/j$a;", "event", "b", "(Landroidx/lifecycle/j$a;)V", "Landroidx/lifecycle/s;", "a", "Landroidx/lifecycle/s;", "lifecycleRegistry", "Landroidx/lifecycle/j$b;", "Landroidx/lifecycle/j$b;", "parentLifecycleState", "value", "c", "getMaxLifecycleState", "()Landroidx/lifecycle/j$b;", "(Landroidx/lifecycle/j$b;)V", "maxLifecycleState", "()Landroidx/lifecycle/s;", "lifecycle", "lifecycle-runtime-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a implements androidx.p016lifecycle.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s lifecycleRegistry = new s(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private androidx.lifecycle.j.b parentLifecycleState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private androidx.lifecycle.j.b maxLifecycleState;

    public a() {
        androidx.lifecycle.j.b bVar = androidx.lifecycle.j.b.INITIALIZED;
        this.parentLifecycleState = bVar;
        this.maxLifecycleState = bVar;
    }

    private final void d() {
        androidx.lifecycle.j.b bVar = this.parentLifecycleState.ordinal() < this.maxLifecycleState.ordinal() ? this.parentLifecycleState : this.maxLifecycleState;
        if (this.lifecycleRegistry.getState() == androidx.lifecycle.j.b.INITIALIZED && bVar == androidx.lifecycle.j.b.DESTROYED) {
            return;
        }
        this.lifecycleRegistry.n(bVar);
    }

    public final void b(androidx.lifecycle.j.a event) {
        this.parentLifecycleState = event.e();
        d();
    }

    public final void c(androidx.lifecycle.j.b bVar) {
        this.maxLifecycleState = bVar;
        d();
    }

    @Override // androidx.p016lifecycle.q
    /* JADX INFO: renamed from: a, reason: from getter */
    public s getLifecycleRegistry() {
        return this.lifecycleRegistry;
    }
}
