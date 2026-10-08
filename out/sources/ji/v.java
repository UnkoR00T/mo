package ji;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
final class v extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f103302a;

    v(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Null bitmap");
        }
        this.f103302a = bitmap;
    }

    @Override // ji.b
    public final Bitmap a() {
        return this.f103302a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f103302a.equals(((b) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f103302a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.f103302a.toString();
        StringBuilder sb5 = new StringBuilder(string.length() + 27);
        sb5.append("FetchPhotoResponse{bitmap=");
        sb5.append(string);
        sb5.append("}");
        return sb5.toString();
    }
}
