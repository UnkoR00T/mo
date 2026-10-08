package mg;

import android.os.Parcel;
import android.os.Parcelable;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public class h extends kg.a {
    public static final Parcelable.Creator<h> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f126333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f126334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f126335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f126336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f126337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f126338f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f126339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f126340b;

        a(long j15, long j16) {
            s.n(j16);
            this.f126339a = j15;
            this.f126340b = j16;
        }
    }

    public h(int i15, int i16, Long l15, Long l16, int i17) {
        this.f126333a = i15;
        this.f126334b = i16;
        this.f126335c = l15;
        this.f126336d = l16;
        this.f126337e = i17;
        this.f126338f = (l15 == null || l16 == null || l16.longValue() == 0) ? null : new a(l15.longValue(), l16.longValue());
    }

    public int h() {
        return this.f126337e;
    }

    public int m() {
        return this.f126334b;
    }

    public int p() {
        return this.f126333a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, p());
        kg.c.m(parcel, 2, m());
        kg.c.s(parcel, 3, this.f126335c, false);
        kg.c.s(parcel, 4, this.f126336d, false);
        kg.c.m(parcel, 5, h());
        kg.c.b(parcel, iA);
    }
}
