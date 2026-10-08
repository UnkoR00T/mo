package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class y<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f149879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f149880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f149881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T f149882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f149883e;

    public y(T t15, T t16, T t17, T t18, String str) {
        this.f149879a = t15;
        this.f149880b = t16;
        this.f149881c = t17;
        this.f149882d = t18;
        this.f149883e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return fr.t.c(this.f149879a, yVar.f149879a) && fr.t.c(this.f149880b, yVar.f149880b) && fr.t.c(this.f149881c, yVar.f149881c) && fr.t.c(this.f149882d, yVar.f149882d) && fr.t.c(this.f149883e, yVar.f149883e);
    }

    public int hashCode() {
        T t15 = this.f149879a;
        int iHashCode = (t15 == null ? 0 : t15.hashCode()) * 31;
        T t16 = this.f149880b;
        int iHashCode2 = (iHashCode + (t16 == null ? 0 : t16.hashCode())) * 31;
        T t17 = this.f149881c;
        int iHashCode3 = (iHashCode2 + (t17 == null ? 0 : t17.hashCode())) * 31;
        T t18 = this.f149882d;
        return ((iHashCode3 + (t18 != null ? t18.hashCode() : 0)) * 31) + this.f149883e.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f149879a + ", compilerVersion=" + this.f149880b + ", languageVersion=" + this.f149881c + ", expectedVersion=" + this.f149882d + ", filePath=" + this.f149883e + ')';
    }
}
