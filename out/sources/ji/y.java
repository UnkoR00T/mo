package ji;

/* JADX INFO: loaded from: classes4.dex */
final class y extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ii.l0 f103313a;

    y(ii.l0 l0Var) {
        if (l0Var == null) {
            throw new NullPointerException("Null place");
        }
        this.f103313a = l0Var;
    }

    @Override // ji.d
    public final ii.l0 a() {
        return this.f103313a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f103313a.equals(((d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f103313a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.f103313a.toString();
        StringBuilder sb5 = new StringBuilder(string.length() + 26);
        sb5.append("FetchPlaceResponse{place=");
        sb5.append(string);
        sb5.append("}");
        return sb5.toString();
    }
}
