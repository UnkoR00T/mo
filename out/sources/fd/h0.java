package fd;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class h0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V f61272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f61273b;

    public h0(V v15) {
        this.f61272a = v15;
        this.f61273b = null;
    }

    public Throwable a() {
        return this.f61273b;
    }

    public V b() {
        return this.f61272a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (b() != null && b().equals(h0Var.b())) {
            return true;
        }
        if (a() == null || h0Var.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public h0(Throwable th4) {
        this.f61273b = th4;
        this.f61272a = null;
    }
}
