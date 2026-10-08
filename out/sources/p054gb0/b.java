package p054gb0;

import p071kotlin.Metadata;
import zx.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0012"}, d2 = {"Lgb0/b;", "Lzx/c;", "", "<init>", "()V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b implements c<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f71562a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String route = "mjunior/drivinglicence";

    private b() {
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
        return this == other || (other instanceof b);
    }

    public int hashCode() {
        return 2032252926;
    }

    public String toString() {
        return "DrivingLicenceGlobalDestination";
    }
}
