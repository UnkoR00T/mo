package ji;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class e0 extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f103195a;

    e0(List list) {
        if (list == null) {
            throw new NullPointerException("Null autocompletePredictions");
        }
        this.f103195a = list;
    }

    @Override // ji.h
    public final List<ii.h> a() {
        return this.f103195a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return this.f103195a.equals(((h) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f103195a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.f103195a.toString();
        StringBuilder sb5 = new StringBuilder(string.length() + 61);
        sb5.append("FindAutocompletePredictionsResponse{autocompletePredictions=");
        sb5.append(string);
        sb5.append("}");
        return sb5.toString();
    }
}
