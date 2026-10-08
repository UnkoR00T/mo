package lp;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f119046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f119047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f119048c;

    public b(String str, String str2, int i15) {
        this.f119046a = str;
        this.f119047b = str2;
        this.f119048c = i15;
    }

    public String a() {
        return this.f119047b;
    }

    public String b() {
        return this.f119046a;
    }

    public int c() {
        return this.f119048c;
    }

    public String toString() {
        return b() + "-" + a() + "-" + c();
    }
}
