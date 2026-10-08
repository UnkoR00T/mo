package ji;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class g0 extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f103198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vh.a f103199b;

    /* synthetic */ g0(List list, vh.a aVar, byte[] bArr) {
        this.f103198a = list;
        this.f103199b = aVar;
    }

    @Override // ji.i, com.google.android.libraries.places.internal.c41
    public final vh.a a() {
        return this.f103199b;
    }

    @Override // ji.i
    public final List<ii.l0.d> c() {
        return this.f103198a;
    }

    public final boolean equals(Object obj) {
        vh.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f103198a.equals(iVar.c()) && ((aVar = this.f103199b) != null ? aVar.equals(iVar.a()) : iVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f103198a.hashCode() ^ 1000003;
        vh.a aVar = this.f103199b;
        return (iHashCode * 1000003) ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        String string = this.f103198a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f103199b);
        StringBuilder sb5 = new StringBuilder(length + 56 + strValueOf.length() + 1);
        sb5.append("FindCurrentPlaceRequest{placeFields=");
        sb5.append(string);
        sb5.append(", cancellationToken=");
        sb5.append(strValueOf);
        sb5.append("}");
        return sb5.toString();
    }
}
