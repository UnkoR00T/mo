package ph;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f157624a;

    public v(String str) {
        this.f157624a = str;
    }

    public final String a() {
        return this.f157624a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && fr.t.c(this.f157624a, ((v) obj).f157624a);
    }

    public final int hashCode() {
        return this.f157624a.hashCode();
    }

    public final String toString() {
        String str = this.f157624a;
        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 15);
        sb5.append("Error(message=");
        sb5.append(str);
        sb5.append(")");
        return sb5.toString();
    }
}
