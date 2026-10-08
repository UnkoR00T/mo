package es;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f53153a;

    public i(Object obj) {
        this.f53153a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && fr.t.c(this.f53153a, ((i) obj).f53153a);
    }

    public int hashCode() {
        Object obj = this.f53153a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "KmConstantValue(value=" + this.f53153a + ')';
    }
}
