package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class k7 extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f92557a;

    k7(List list) {
        if (list == null) {
            throw new NullPointerException("Null asList");
        }
        this.f92557a = list;
    }

    @Override // ii.g
    public final List<f> a() {
        return this.f92557a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f92557a.equals(((g) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f92557a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.f92557a.toString();
        StringBuilder sb5 = new StringBuilder(string.length() + 27);
        sb5.append("AuthorAttributions{asList=");
        sb5.append(string);
        sb5.append("}");
        return sb5.toString();
    }
}
