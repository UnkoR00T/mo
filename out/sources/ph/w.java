package ph;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f157631a;

    public w(List list) {
        this.f157631a = list;
    }

    public final List a() {
        return this.f157631a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && fr.t.c(this.f157631a, ((w) obj).f157631a);
    }

    public final int hashCode() {
        return this.f157631a.hashCode();
    }

    public final String toString() {
        List list = this.f157631a;
        StringBuilder sb5 = new StringBuilder(String.valueOf(list).length() + 17);
        sb5.append("Loaded(licenses=");
        sb5.append(list);
        sb5.append(")");
        return sb5.toString();
    }
}
