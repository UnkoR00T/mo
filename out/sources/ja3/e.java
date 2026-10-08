package ja3;

import n3.o1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0017"}, d2 = {"Lja3/e;", "Lja3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/Color;", "b", "J", "a", "()J", "headerIconBackground", "c", "countryWarningLevel4IconBackground", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f101248a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long headerIconBackground = o1.d(4294832594L);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long countryWarningLevel4IconBackground = o1.d(4291635484L);

    private e() {
    }

    @Override // ja3.a
    public long a() {
        return headerIconBackground;
    }

    @Override // ja3.a
    public long b() {
        return countryWarningLevel4IconBackground;
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof e);
    }

    public int hashCode() {
        return -481486829;
    }

    public String toString() {
        return "TravelAbroadLightSchemePreset";
    }
}
