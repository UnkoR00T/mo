package t7;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.os.Build;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f188093i = new d().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f188094j = o0.u0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f188095k = o0.u0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f188096l = o0.u0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f188097m = o0.u0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f188098n = o0.u0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f188099o = o0.u0(5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f188100p = o0.u0(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f188104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f188105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f188106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f188107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioAttributes f188108h;

    /* JADX INFO: renamed from: t7.b$b, reason: collision with other inner class name */
    private static final class C4893b {
        @SuppressLint({"WrongConstant"})
        public static void b(AudioAttributes.Builder builder, int i15) {
            builder.setAllowedCapturePolicy(i15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(AudioAttributes.Builder builder, boolean z15) {
            builder.setHapticChannelsMuted(z15);
        }
    }

    private static final class c {
        public static void a(AudioAttributes.Builder builder, boolean z15) {
            builder.setIsContentSpatialized(z15);
        }

        @SuppressLint({"WrongConstant"})
        public static void b(AudioAttributes.Builder builder, int i15) {
            builder.setSpatializationBehavior(i15);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f188109a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f188110b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f188111c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f188112d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f188113e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f188114f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f188115g = true;

        public b a() {
            return new b(this.f188109a, this.f188110b, this.f188111c, this.f188112d, this.f188113e, this.f188114f, this.f188115g);
        }
    }

    private int b() {
        try {
            int volumeControlStream = a().getVolumeControlStream();
            if (volumeControlStream == Integer.MIN_VALUE) {
                return 3;
            }
            return volumeControlStream;
        } catch (RuntimeException unused) {
            return 3;
        }
    }

    public AudioAttributes a() {
        if (this.f188108h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f188101a).setFlags(this.f188102b).setUsage(this.f188103c);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 29) {
                C4893b.b(usage, this.f188104d);
                C4893b.c(usage, this.f188107g);
            }
            if (i15 >= 32) {
                c.b(usage, this.f188105e);
                c.a(usage, this.f188106f);
            }
            this.f188108h = usage.build();
        }
        return this.f188108h;
    }

    public int c() {
        return b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f188101a == bVar.f188101a && this.f188102b == bVar.f188102b && this.f188103c == bVar.f188103c && this.f188104d == bVar.f188104d && this.f188105e == bVar.f188105e && this.f188106f == bVar.f188106f && this.f188107g == bVar.f188107g) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((527 + this.f188101a) * 31) + this.f188102b) * 31) + this.f188103c) * 31) + this.f188104d) * 31) + this.f188105e) * 31) + (this.f188106f ? 1 : 0)) * 31) + (this.f188107g ? 1 : 0);
    }

    private b(int i15, int i16, int i17, int i18, int i19, boolean z15, boolean z16) {
        this.f188101a = i15;
        this.f188102b = i16;
        this.f188103c = i17;
        this.f188104d = i18;
        this.f188105e = i19;
        this.f188106f = z15;
        this.f188107g = z16;
    }
}
