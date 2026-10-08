package u6;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lu6/p;", "T", "", "<init>", "()V", "Lu6/p0;", "newState", "c", "(Lu6/p0;)Lu6/p0;", "Lmu/b0;", "a", "Lmu/b0;", "getCachedValue$annotations", "cachedValue", "()Lu6/p0;", "currentState", "Lmu/g;", "b", "()Lmu/g;", "flow", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<p0<T>> cachedValue = mu.r0.a(t0.f195737b);

    public final p0<T> a() {
        return this.cachedValue.getValue();
    }

    public final mu.g<p0<T>> b() {
        return this.cachedValue;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    public final p0<T> c(p0<T> newState) {
        p0<T> value;
        p0<T> p0Var;
        mu.b0<p0<T>> b0Var = this.cachedValue;
        do {
            value = b0Var.getValue();
            p0Var = value;
            if ((p0Var instanceof i0) || fr.t.c(p0Var, t0.f195737b)) {
                p0Var = newState;
            } else if (p0Var instanceof f) {
                if (newState.getVersion() > ((f) p0Var).getVersion()) {
                    p0Var = newState;
                }
            } else if (!(p0Var instanceof b0)) {
                if (p0Var instanceof h0) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                throw new oq.p();
            }
        } while (!b0Var.s(value, p0Var));
        return p0Var;
    }
}
