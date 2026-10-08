package ji;

import ii.u0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class s0 extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f103292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103293b;

    /* synthetic */ s0(List list, List list2, byte[] bArr) {
        this.f103292a = list;
        this.f103293b = list2;
    }

    @Override // ji.s
    public final List<ii.l0> b() {
        return this.f103292a;
    }

    @Override // ji.s
    public final List<u0> c() {
        return this.f103293b;
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f103292a.equals(sVar.b()) && ((list = this.f103293b) != null ? list.equals(sVar.c()) : sVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f103292a.hashCode() ^ 1000003;
        List list = this.f103293b;
        return (iHashCode * 1000003) ^ (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        String string = this.f103292a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f103293b);
        StringBuilder sb5 = new StringBuilder(length + 47 + strValueOf.length() + 1);
        sb5.append("SearchNearbyResponse{places=");
        sb5.append(string);
        sb5.append(", routingSummaries=");
        sb5.append(strValueOf);
        sb5.append("}");
        return sb5.toString();
    }
}
