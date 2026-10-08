package ii;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class z2 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f92880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f92881b;

    z2(List list, Uri uri) {
        if (list == null) {
            throw new NullPointerException("Null legs");
        }
        this.f92880a = list;
        this.f92881b = uri;
    }

    @Override // ii.u0
    public final Uri b() {
        return this.f92881b;
    }

    @Override // ii.u0
    public final List<z> c() {
        return this.f92880a;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            if (this.f92880a.equals(u0Var.c()) && ((uri = this.f92881b) != null ? uri.equals(u0Var.b()) : u0Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f92880a.hashCode() ^ 1000003;
        Uri uri = this.f92881b;
        return (iHashCode * 1000003) ^ (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        String string = this.f92880a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f92881b);
        StringBuilder sb5 = new StringBuilder(length + 36 + strValueOf.length() + 1);
        sb5.append("RoutingSummary{legs=");
        sb5.append(string);
        sb5.append(", directionsUri=");
        sb5.append(strValueOf);
        sb5.append("}");
        return sb5.toString();
    }
}
