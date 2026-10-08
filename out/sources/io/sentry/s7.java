package io.sentry;

import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public final class s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Double f95698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Double f95699b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private io.sentry.protocol.p f95710m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f95700c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<String> f95701d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f95702e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f95703f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f95704g = a.MEDIUM;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95705h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f95706i = 30000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f95707j = 5000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f95708k = 3600000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f95709l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f95711n = false;

    public enum a {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        a(float f15, int i15, int i16) {
            this.sizeScale = f15;
            this.bitRate = i15;
            this.screenshotQuality = i16;
        }

        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public s7(boolean z15, io.sentry.protocol.p pVar) {
        if (z15) {
            return;
        }
        u(true);
        t(true);
        this.f95700c.add("android.webkit.WebView");
        this.f95700c.add("android.widget.VideoView");
        this.f95700c.add("androidx.media3.ui.PlayerView");
        this.f95700c.add("com.google.android.exoplayer2.ui.PlayerView");
        this.f95700c.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        this.f95710m = pVar;
    }

    public void a(String str) {
        this.f95700c.add(str);
    }

    public void b(String str) {
        this.f95701d.add(str);
    }

    public long c() {
        return this.f95706i;
    }

    public int d() {
        return this.f95705h;
    }

    public Set<String> e() {
        return this.f95700c;
    }

    public String f() {
        return this.f95702e;
    }

    public Double g() {
        return this.f95699b;
    }

    public a h() {
        return this.f95704g;
    }

    public io.sentry.protocol.p i() {
        return this.f95710m;
    }

    public long j() {
        return this.f95708k;
    }

    public Double k() {
        return this.f95698a;
    }

    public long l() {
        return this.f95707j;
    }

    public Set<String> m() {
        return this.f95701d;
    }

    public String n() {
        return this.f95703f;
    }

    public boolean o() {
        return this.f95711n;
    }

    public boolean p() {
        return k() != null && k().doubleValue() > 0.0d;
    }

    public boolean q() {
        return g() != null && g().doubleValue() > 0.0d;
    }

    public boolean r() {
        return this.f95709l;
    }

    public void s(boolean z15) {
        this.f95711n = z15;
    }

    public void t(boolean z15) {
        if (z15) {
            a("android.widget.ImageView");
            this.f95701d.remove("android.widget.ImageView");
        } else {
            b("android.widget.ImageView");
            this.f95700c.remove("android.widget.ImageView");
        }
    }

    public void u(boolean z15) {
        if (z15) {
            a("android.widget.TextView");
            this.f95701d.remove("android.widget.TextView");
        } else {
            b("android.widget.TextView");
            this.f95700c.remove("android.widget.TextView");
        }
    }

    public void v(Double d15) {
        if (io.sentry.util.a0.f(d15)) {
            this.f95699b = d15;
            return;
        }
        throw new IllegalArgumentException("The value " + d15 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void w(io.sentry.protocol.p pVar) {
        this.f95710m = pVar;
    }

    public void x(Double d15) {
        if (io.sentry.util.a0.f(d15)) {
            this.f95698a = d15;
            return;
        }
        throw new IllegalArgumentException("The value " + d15 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }
}
