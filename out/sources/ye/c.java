package ye;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f226635a;

    private c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f226635a = str;
    }

    public static c b(String str) {
        return new c(str);
    }

    public String a() {
        return this.f226635a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f226635a.equals(((c) obj).f226635a);
        }
        return false;
    }

    public int hashCode() {
        return this.f226635a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f226635a + "\"}";
    }
}
