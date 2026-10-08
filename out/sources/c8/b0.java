package c8;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f24141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r0.a f24143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f24145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f24146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f24147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f24149i;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f24150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f24151b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f24152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f24153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f24154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f24155f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f24156g;

        public a(AudioTrack audioTrack) {
            this.f24150a = audioTrack;
        }

        public void a() {
            this.f24155f = true;
        }

        public long b() {
            return this.f24154e;
        }

        public long c() {
            return this.f24151b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f24150a.getTimestamp(this.f24151b);
            if (timestamp) {
                long j15 = this.f24151b.framePosition;
                long j16 = this.f24153d;
                if (j16 > j15) {
                    if (this.f24155f) {
                        this.f24156g += j16;
                        this.f24155f = false;
                    } else {
                        this.f24152c++;
                    }
                }
                this.f24153d = j15;
                this.f24154e = j15 + this.f24156g + (this.f24152c << 32);
            }
            return timestamp;
        }
    }

    public b0(AudioTrack audioTrack, r0.a aVar) {
        this.f24141a = new a(audioTrack);
        this.f24142b = audioTrack.getSampleRate();
        this.f24143c = aVar;
        j();
    }

    private void a(long j15, float f15, long j16) {
        long jC = this.f24141a.c();
        long jB = b(j15, f15);
        if (Math.abs(jC - j15) > 5000000) {
            this.f24143c.d(this.f24141a.b(), jC, j15, j16);
            k(4);
        } else if (Math.abs(jB - j16) > 5000000) {
            this.f24143c.c(this.f24141a.b(), jC, j15, j16);
            k(4);
        } else if (this.f24144d == 4) {
            j();
        }
    }

    private long b(long j15, float f15) {
        return c(this.f24141a.b(), this.f24141a.c(), j15, f15);
    }

    private long c(long j15, long j16, long j17, float f15) {
        return w7.o0.T0(j15, this.f24142b) + w7.o0.b0(j17 - j16, f15);
    }

    private boolean g(long j15, float f15) {
        long jB = this.f24141a.b();
        long j16 = this.f24148h;
        if (jB <= j16) {
            return false;
        }
        return Math.abs(b(j15, f15) - c(j16, this.f24149i, j15, f15)) < 1000;
    }

    private void k(int i15) {
        this.f24144d = i15;
        if (i15 == 0) {
            this.f24147g = 0L;
            this.f24148h = -1L;
            this.f24149i = -9223372036854775807L;
            this.f24145e = System.nanoTime() / 1000;
            this.f24146f = 10000L;
            return;
        }
        if (i15 == 1) {
            this.f24146f = 10000L;
            return;
        }
        if (i15 == 2 || i15 == 3) {
            this.f24146f = 10000000L;
        } else {
            if (i15 != 4) {
                throw new IllegalStateException();
            }
            this.f24146f = 500000L;
        }
    }

    public void d() {
        this.f24141a.a();
    }

    public long e(long j15, float f15) {
        return b(j15, f15);
    }

    public boolean f() {
        return this.f24144d == 2;
    }

    public boolean h() {
        int i15 = this.f24144d;
        return i15 == 0 || i15 == 1;
    }

    public void i(long j15, float f15, long j16, boolean z15) {
        if (z15 || j15 - this.f24147g >= this.f24146f) {
            this.f24147g = j15;
            boolean zD = this.f24141a.d();
            if (zD) {
                a(j15, f15, j16);
            }
            int i15 = this.f24144d;
            if (i15 == 0) {
                if (!zD) {
                    if (j15 - this.f24145e > 500000) {
                        k(3);
                        return;
                    }
                    return;
                } else {
                    if (this.f24141a.c() >= this.f24145e) {
                        this.f24148h = this.f24141a.b();
                        this.f24149i = this.f24141a.c();
                        k(1);
                        return;
                    }
                    return;
                }
            }
            if (i15 == 1) {
                if (!zD) {
                    j();
                    return;
                }
                if (g(j15, f15)) {
                    k(2);
                    return;
                } else if (j15 - this.f24145e > 2000000) {
                    k(3);
                    return;
                } else {
                    this.f24148h = this.f24141a.b();
                    this.f24149i = this.f24141a.c();
                    return;
                }
            }
            if (i15 == 2) {
                if (zD) {
                    return;
                }
                j();
            } else if (i15 != 3) {
                if (i15 != 4) {
                    throw new IllegalStateException();
                }
            } else if (zD) {
                j();
            }
        }
    }

    public void j() {
        k(0);
    }
}
