package dp;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f43642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f43644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f43645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f43646e;

    private b(boolean z15, boolean z16, long j15, long j16) {
        boolean z17 = false;
        boolean z18 = !z16 || z15;
        j15 = z15 ? j15 : -1L;
        j16 = j16 <= 0 ? -1L : j16;
        j15 = j15 < -1 ? -1L : j15;
        if (!z18 || j15 != 0) {
            z17 = z18;
        } else if (!z16) {
            j15 = j16;
            z17 = z18;
        }
        if (z17 && j16 > -1 && (j15 == -1 || j15 > j16)) {
            j16 = j15;
        }
        this.f43642a = z17;
        this.f43643b = z16;
        this.f43644c = j15;
        this.f43645d = j16;
    }

    public static b f() {
        return g(-1L);
    }

    public static b g(long j15) {
        return new b(true, false, j15, j15);
    }

    public long a() {
        return this.f43644c;
    }

    public long b() {
        return this.f43645d;
    }

    public File c() {
        return this.f43646e;
    }

    public boolean d() {
        return this.f43644c >= 0;
    }

    public boolean e() {
        return this.f43645d > 0;
    }

    public boolean h() {
        return this.f43642a;
    }

    public boolean i() {
        return this.f43643b;
    }

    public String toString() {
        String str;
        if (!this.f43642a) {
            if (!e()) {
                return "Scratch file only with no size restriction";
            }
            return "Scratch file only with max. of " + this.f43645d + " bytes";
        }
        if (!this.f43643b) {
            if (!d()) {
                return "Main memory only with no size restriction";
            }
            return "Main memory only with max. of " + this.f43644c + " bytes";
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Mixed mode with max. of ");
        sb5.append(this.f43644c);
        sb5.append(" main memory bytes");
        if (e()) {
            str = " and max. of " + this.f43645d + " storage bytes";
        } else {
            str = " and unrestricted scratch file size";
        }
        sb5.append(str);
        return sb5.toString();
    }
}
