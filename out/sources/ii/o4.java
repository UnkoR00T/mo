package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class o4 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f92684a;

    o4(List list) {
        if (list == null) {
            throw new NullPointerException("Null asList");
        }
        this.f92684a = list;
    }

    @Override // ii.c
    public final List<b> a() {
        return this.f92684a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return this.f92684a.equals(((c) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f92684a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.f92684a.toString();
        StringBuilder sb5 = new StringBuilder(string.length() + 26);
        sb5.append("AddressComponents{asList=");
        sb5.append(string);
        sb5.append("}");
        return sb5.toString();
    }
}
