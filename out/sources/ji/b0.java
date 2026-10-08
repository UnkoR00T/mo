package ji;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
final class b0 extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f103171a;

    b0(Uri uri) {
        this.f103171a = uri;
    }

    @Override // ji.f
    public final Uri a() {
        return this.f103171a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        Uri uri = this.f103171a;
        if (uri == null) {
            return fVar.a() == null;
        }
        return uri.equals(fVar.a());
    }

    public final int hashCode() {
        Uri uri = this.f103171a;
        return (uri == null ? 0 : uri.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f103171a);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 35);
        sb5.append("FetchResolvedPhotoUriResponse{uri=");
        sb5.append(strValueOf);
        sb5.append("}");
        return sb5.toString();
    }
}
