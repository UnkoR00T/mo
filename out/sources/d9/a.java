package d9;

import ek.i;
import t7.v;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class a implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40393e;

    public a(long j15, long j16, long j17, long j18, long j19) {
        this.f40389a = j15;
        this.f40390b = j16;
        this.f40391c = j17;
        this.f40392d = j18;
        this.f40393e = j19;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f40389a == aVar.f40389a && this.f40390b == aVar.f40390b && this.f40391c == aVar.f40391c && this.f40392d == aVar.f40392d && this.f40393e == aVar.f40393e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + i.c(this.f40389a)) * 31) + i.c(this.f40390b)) * 31) + i.c(this.f40391c)) * 31) + i.c(this.f40392d)) * 31) + i.c(this.f40393e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f40389a + ", photoSize=" + this.f40390b + ", photoPresentationTimestampUs=" + this.f40391c + ", videoStartPosition=" + this.f40392d + ", videoSize=" + this.f40393e;
    }
}
