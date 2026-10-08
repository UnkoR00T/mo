package kh;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import zg.f0;
import zg.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f110920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f110921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f110922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f110923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f110924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f110925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WorkSource f110926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f0 f110927h;

    /* JADX INFO: renamed from: kh.a$a, reason: collision with other inner class name */
    public static final class C2669a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f110928a = 10000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f110929b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f110930c = 102;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f110931d = Long.MAX_VALUE;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f110932e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f110933f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WorkSource f110934g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final f0 f110935h = null;

        public a a() {
            return new a(this.f110928a, this.f110929b, this.f110930c, this.f110931d, this.f110932e, this.f110933f, new WorkSource(this.f110934g), this.f110935h);
        }

        public C2669a b(long j15) {
            jg.s.b(j15 > 0, "durationMillis must be greater than 0");
            this.f110931d = j15;
            return this;
        }

        public C2669a c(int i15) {
            n.a(i15);
            this.f110930c = i15;
            return this;
        }
    }

    a(long j15, int i15, int i16, long j16, boolean z15, int i17, WorkSource workSource, f0 f0Var) {
        this.f110920a = j15;
        this.f110921b = i15;
        this.f110922c = i16;
        this.f110923d = j16;
        this.f110924e = z15;
        this.f110925f = i17;
        this.f110926g = workSource;
        this.f110927h = f0Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f110920a == aVar.f110920a && this.f110921b == aVar.f110921b && this.f110922c == aVar.f110922c && this.f110923d == aVar.f110923d && this.f110924e == aVar.f110924e && this.f110925f == aVar.f110925f && jg.r.a(this.f110926g, aVar.f110926g) && jg.r.a(this.f110927h, aVar.f110927h);
    }

    public long h() {
        return this.f110923d;
    }

    public int hashCode() {
        return jg.r.b(Long.valueOf(this.f110920a), Integer.valueOf(this.f110921b), Integer.valueOf(this.f110922c), Long.valueOf(this.f110923d));
    }

    public int m() {
        return this.f110921b;
    }

    public long p() {
        return this.f110920a;
    }

    public int r() {
        return this.f110922c;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("CurrentLocationRequest[");
        sb5.append(n.b(this.f110922c));
        if (this.f110920a != Long.MAX_VALUE) {
            sb5.append(", maxAge=");
            q0.c(this.f110920a, sb5);
        }
        if (this.f110923d != Long.MAX_VALUE) {
            sb5.append(", duration=");
            sb5.append(this.f110923d);
            sb5.append("ms");
        }
        if (this.f110921b != 0) {
            sb5.append(", ");
            sb5.append(r.b(this.f110921b));
        }
        if (this.f110924e) {
            sb5.append(", bypass");
        }
        if (this.f110925f != 0) {
            sb5.append(", ");
            sb5.append(o.b(this.f110925f));
        }
        if (!com.google.android.gms.common.util.m.d(this.f110926g)) {
            sb5.append(", workSource=");
            sb5.append(this.f110926g);
        }
        if (this.f110927h != null) {
            sb5.append(", impersonation=");
            sb5.append(this.f110927h);
        }
        sb5.append(']');
        return sb5.toString();
    }

    public final int u() {
        return this.f110925f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.r(parcel, 1, p());
        kg.c.m(parcel, 2, m());
        kg.c.m(parcel, 3, r());
        kg.c.r(parcel, 4, h());
        kg.c.c(parcel, 5, this.f110924e);
        kg.c.t(parcel, 6, this.f110926g, i15, false);
        kg.c.m(parcel, 7, this.f110925f);
        kg.c.t(parcel, 9, this.f110927h, i15, false);
        kg.c.b(parcel, iA);
    }

    public final WorkSource y() {
        return this.f110926g;
    }

    public final boolean zza() {
        return this.f110924e;
    }
}
