package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.m;
import jg.r;
import jg.s;
import kh.n;
import kh.o;
import zg.f0;
import zg.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class LocationRequest extends kg.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f31369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f31370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f31371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f31372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f31374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31375h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f31376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f31377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f31378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f31379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WorkSource f31380n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final f0 f31381p;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String V(long j15) {
        return j15 == Long.MAX_VALUE ? "∞" : q0.b(j15);
    }

    public float C() {
        return this.f31374g;
    }

    public long E() {
        return this.f31370c;
    }

    public int H() {
        return this.f31368a;
    }

    public boolean I() {
        long j15 = this.f31371d;
        return j15 > 0 && (j15 >> 1) >= this.f31369b;
    }

    public boolean J() {
        return this.f31368a == 105;
    }

    public boolean K() {
        return this.f31375h;
    }

    public final int L() {
        return this.f31378l;
    }

    public final boolean M() {
        return this.f31379m;
    }

    public final WorkSource N() {
        return this.f31380n;
    }

    public final f0 O() {
        return this.f31381p;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f31368a == locationRequest.f31368a && ((J() || this.f31369b == locationRequest.f31369b) && this.f31370c == locationRequest.f31370c && I() == locationRequest.I() && ((!I() || this.f31371d == locationRequest.f31371d) && this.f31372e == locationRequest.f31372e && this.f31373f == locationRequest.f31373f && this.f31374g == locationRequest.f31374g && this.f31375h == locationRequest.f31375h && this.f31377k == locationRequest.f31377k && this.f31378l == locationRequest.f31378l && this.f31379m == locationRequest.f31379m && this.f31380n.equals(locationRequest.f31380n) && r.a(this.f31381p, locationRequest.f31381p)))) {
                return true;
            }
        }
        return false;
    }

    public long h() {
        return this.f31372e;
    }

    public int hashCode() {
        return r.b(Integer.valueOf(this.f31368a), Long.valueOf(this.f31369b), Long.valueOf(this.f31370c), this.f31380n);
    }

    public int m() {
        return this.f31377k;
    }

    public long p() {
        return this.f31369b;
    }

    public long r() {
        return this.f31376j;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Request[");
        if (J()) {
            sb5.append(n.b(this.f31368a));
            if (this.f31371d > 0) {
                sb5.append("/");
                q0.c(this.f31371d, sb5);
            }
        } else {
            sb5.append("@");
            if (I()) {
                q0.c(this.f31369b, sb5);
                sb5.append("/");
                q0.c(this.f31371d, sb5);
            } else {
                q0.c(this.f31369b, sb5);
            }
            sb5.append(" ");
            sb5.append(n.b(this.f31368a));
        }
        if (J() || this.f31370c != this.f31369b) {
            sb5.append(", minUpdateInterval=");
            sb5.append(V(this.f31370c));
        }
        if (this.f31374g > 0.0d) {
            sb5.append(", minUpdateDistance=");
            sb5.append(this.f31374g);
        }
        if (!J() ? this.f31376j != this.f31369b : this.f31376j != Long.MAX_VALUE) {
            sb5.append(", maxUpdateAge=");
            sb5.append(V(this.f31376j));
        }
        if (this.f31372e != Long.MAX_VALUE) {
            sb5.append(", duration=");
            q0.c(this.f31372e, sb5);
        }
        if (this.f31373f != Integer.MAX_VALUE) {
            sb5.append(", maxUpdates=");
            sb5.append(this.f31373f);
        }
        if (this.f31378l != 0) {
            sb5.append(", ");
            sb5.append(o.b(this.f31378l));
        }
        if (this.f31377k != 0) {
            sb5.append(", ");
            sb5.append(kh.r.b(this.f31377k));
        }
        if (this.f31375h) {
            sb5.append(", waitForAccurateLocation");
        }
        if (this.f31379m) {
            sb5.append(", bypass");
        }
        if (!m.d(this.f31380n)) {
            sb5.append(", ");
            sb5.append(this.f31380n);
        }
        if (this.f31381p != null) {
            sb5.append(", impersonation=");
            sb5.append(this.f31381p);
        }
        sb5.append(']');
        return sb5.toString();
    }

    public long u() {
        return this.f31371d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, H());
        kg.c.r(parcel, 2, p());
        kg.c.r(parcel, 3, E());
        kg.c.m(parcel, 6, y());
        kg.c.i(parcel, 7, C());
        kg.c.r(parcel, 8, u());
        kg.c.c(parcel, 9, K());
        kg.c.r(parcel, 10, h());
        kg.c.r(parcel, 11, r());
        kg.c.m(parcel, 12, m());
        kg.c.m(parcel, 13, this.f31378l);
        kg.c.c(parcel, 15, this.f31379m);
        kg.c.t(parcel, 16, this.f31380n, i15, false);
        kg.c.t(parcel, 17, this.f31381p, i15, false);
        kg.c.b(parcel, iA);
    }

    public int y() {
        return this.f31373f;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f31382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f31383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f31384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f31385d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f31386e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f31387f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f31388g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f31389h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f31390i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f31391j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f31392k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f31393l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private WorkSource f31394m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private f0 f31395n;

        public a(int i15, long j15) {
            this(j15);
            j(i15);
        }

        public LocationRequest a() {
            int i15 = this.f31382a;
            long j15 = this.f31383b;
            long jMin = this.f31384c;
            if (jMin == -1) {
                jMin = j15;
            } else if (i15 != 105) {
                jMin = Math.min(jMin, j15);
            }
            long jMax = Math.max(this.f31385d, this.f31383b);
            long j16 = this.f31386e;
            int i16 = this.f31387f;
            float f15 = this.f31388g;
            boolean z15 = this.f31389h;
            long j17 = this.f31390i;
            if (j17 == -1) {
                j17 = this.f31383b;
            }
            return new LocationRequest(i15, j15, jMin, jMax, Long.MAX_VALUE, j16, i16, f15, z15, j17, this.f31391j, this.f31392k, this.f31393l, new WorkSource(this.f31394m), this.f31395n);
        }

        public a b(long j15) {
            s.b(j15 > 0, "durationMillis must be greater than 0");
            this.f31386e = j15;
            return this;
        }

        public a c(int i15) {
            kh.r.a(i15);
            this.f31391j = i15;
            return this;
        }

        public a d(long j15) {
            s.b(j15 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f31383b = j15;
            return this;
        }

        public a e(long j15) {
            boolean z15 = true;
            if (j15 != -1 && j15 < 0) {
                z15 = false;
            }
            s.b(z15, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f31390i = j15;
            return this;
        }

        public a f(long j15) {
            s.b(j15 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.f31385d = j15;
            return this;
        }

        public a g(int i15) {
            s.b(i15 > 0, "maxUpdates must be greater than 0");
            this.f31387f = i15;
            return this;
        }

        public a h(float f15) {
            s.b(f15 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f31388g = f15;
            return this;
        }

        public a i(long j15) {
            boolean z15 = true;
            if (j15 != -1 && j15 < 0) {
                z15 = false;
            }
            s.b(z15, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f31384c = j15;
            return this;
        }

        public a j(int i15) {
            n.a(i15);
            this.f31382a = i15;
            return this;
        }

        public a k(boolean z15) {
            this.f31389h = z15;
            return this;
        }

        public final a l(int i15) {
            o.a(i15);
            this.f31392k = i15;
            return this;
        }

        public final a m(boolean z15) {
            this.f31393l = z15;
            return this;
        }

        public final a n(WorkSource workSource) {
            this.f31394m = workSource;
            return this;
        }

        public a(long j15) {
            this.f31382a = 102;
            this.f31384c = -1L;
            this.f31385d = 0L;
            this.f31386e = Long.MAX_VALUE;
            this.f31387f = Integer.MAX_VALUE;
            this.f31388g = 0.0f;
            this.f31389h = true;
            this.f31390i = -1L;
            this.f31391j = 0;
            this.f31392k = 0;
            this.f31393l = false;
            this.f31394m = null;
            this.f31395n = null;
            d(j15);
        }

        public a(LocationRequest locationRequest) {
            this(locationRequest.H(), locationRequest.p());
            i(locationRequest.E());
            f(locationRequest.u());
            b(locationRequest.h());
            g(locationRequest.y());
            h(locationRequest.C());
            k(locationRequest.K());
            e(locationRequest.r());
            c(locationRequest.m());
            int iL = locationRequest.L();
            o.a(iL);
            this.f31392k = iL;
            this.f31393l = locationRequest.M();
            this.f31394m = locationRequest.N();
            f0 f0VarO = locationRequest.O();
            boolean z15 = true;
            if (f0VarO != null && f0VarO.zza()) {
                z15 = false;
            }
            s.a(z15);
            this.f31395n = f0VarO;
        }
    }

    LocationRequest(int i15, long j15, long j16, long j17, long j18, long j19, int i16, float f15, boolean z15, long j25, int i17, int i18, boolean z16, WorkSource workSource, f0 f0Var) {
        this.f31368a = i15;
        if (i15 == 105) {
            this.f31369b = Long.MAX_VALUE;
        } else {
            this.f31369b = j15;
        }
        this.f31370c = j16;
        this.f31371d = j17;
        this.f31372e = j18 == Long.MAX_VALUE ? j19 : Math.min(Math.max(1L, j18 - SystemClock.elapsedRealtime()), j19);
        this.f31373f = i16;
        this.f31374g = f15;
        this.f31375h = z15;
        this.f31376j = j25 != -1 ? j25 : j15;
        this.f31377k = i17;
        this.f31378l = i18;
        this.f31379m = z16;
        this.f31380n = workSource;
        this.f31381p = f0Var;
    }
}
