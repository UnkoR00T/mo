package x8;

import ek.i;
import t7.v;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f217304a;

    public e(long j15) {
        this.f217304a = j15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e.class == obj.getClass() && this.f217304a == ((e) obj).f217304a;
    }

    public int hashCode() {
        return 527 + i.c(this.f217304a);
    }

    public String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.f217304a;
    }
}
