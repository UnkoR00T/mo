package zj;

/* JADX INFO: loaded from: classes4.dex */
final class a<T> extends m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a<Object> f235374a = new a<>();

    private a() {
    }

    static <T> m<T> e() {
        return f235374a;
    }

    @Override // zj.m
    public boolean b() {
        return false;
    }

    @Override // zj.m
    public T d(T t15) {
        return (T) p.r(t15, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
