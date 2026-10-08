package ji;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class h0 extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f103200a;

    h0(List list) {
        if (list == null) {
            throw new NullPointerException("Null placeLikelihoods");
        }
        this.f103200a = list;
    }

    @Override // ji.j
    public final List<ii.m0> a() {
        return this.f103200a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f103200a.equals(((j) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f103200a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.f103200a.toString();
        StringBuilder sb5 = new StringBuilder(string.length() + 43);
        sb5.append("FindCurrentPlaceResponse{placeLikelihoods=");
        sb5.append(string);
        sb5.append("}");
        return sb5.toString();
    }
}
