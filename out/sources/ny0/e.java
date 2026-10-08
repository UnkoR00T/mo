package ny0;

import n3.o1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001d"}, d2 = {"Lny0/e;", "Lny0/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/Color;", "b", "J", "()J", "best80", "c", "d", "good80", "e", "bad100", "bad300", "f", "a", "worst200", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f139490a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long best80 = o1.d(4282874387L);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long good80 = o1.d(4290533398L);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long bad100 = o1.d(4291637780L);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final long bad300 = o1.d(4286321922L);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final long worst200 = o1.d(4281413285L);

    private e() {
    }

    @Override // ny0.a
    public long a() {
        return worst200;
    }

    @Override // ny0.a
    public long b() {
        return best80;
    }

    @Override // ny0.a
    public long c() {
        return bad300;
    }

    @Override // ny0.a
    public long d() {
        return good80;
    }

    @Override // ny0.a
    public long e() {
        return bad100;
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof e);
    }

    public int hashCode() {
        return 1786006739;
    }

    public String toString() {
        return "AirQualityLightSchemePreset";
    }
}
