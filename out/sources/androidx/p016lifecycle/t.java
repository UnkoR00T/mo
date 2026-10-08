package androidx.p016lifecycle;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/q;", "owner", "Landroidx/lifecycle/j$b;", "current", "next", "Loq/i0;", "a", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$b;Landroidx/lifecycle/j$b;)V", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class t {
    public static final void a(q qVar, j.b bVar, j.b bVar2) {
        if (bVar == j.b.INITIALIZED && bVar2 == j.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + j.b.CREATED + "' to be moved to '" + bVar2 + "' in component " + qVar).toString());
        }
        j.b bVar3 = j.b.DESTROYED;
        if (bVar != bVar3 || bVar == bVar2) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar3 + "' and cannot be moved to `" + bVar2 + "` in component " + qVar).toString());
    }
}
