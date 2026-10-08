package ji;

/* JADX INFO: loaded from: classes4.dex */
final class k0 extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f103210a;

    k0(Boolean bool) {
        this.f103210a = bool;
    }

    @Override // ji.l
    public final Boolean a() {
        return this.f103210a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        Boolean bool = this.f103210a;
        if (bool == null) {
            return lVar.a() == null;
        }
        return bool.equals(lVar.a());
    }

    public final int hashCode() {
        Boolean bool = this.f103210a;
        return (bool == null ? 0 : bool.hashCode()) ^ 1000003;
    }

    public final String toString() {
        Boolean bool = this.f103210a;
        StringBuilder sb5 = new StringBuilder(String.valueOf(bool).length() + 23);
        sb5.append("IsOpenResponse{isOpen=");
        sb5.append(bool);
        sb5.append("}");
        return sb5.toString();
    }
}
