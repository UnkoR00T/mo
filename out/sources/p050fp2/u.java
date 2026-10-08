package p050fp2;

import mv3.b;
import p071kotlin.Metadata;
import zx.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"Lfp2/u;", "", "Lmv3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u implements a, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f66016a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String route = "passportagreement/edorauth";

    private u() {
    }

    @Override // zx.a
    public String b() {
        return route;
    }

    @Override // zx.a
    public /* bridge */ boolean e() {
        return super.e();
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof u);
    }

    public int hashCode() {
        return -642862763;
    }

    public String toString() {
        return "EdorAuth";
    }
}
