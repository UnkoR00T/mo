package j9;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import o8.l0;
import o8.m0;
import o8.q;
import o8.s;
import t7.x;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f100336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f100337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f100338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f100339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f100340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f100341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f100342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f100343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f100344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f100345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f100346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f100347l;

    private final class b implements l0 {
        private b() {
        }

        @Override // o8.l0
        public l0.a c(long j15) {
            return new l0.a(new m0(j15, o0.p((a.this.f100337b + BigInteger.valueOf(a.this.f100339d.c(j15)).multiply(BigInteger.valueOf(a.this.f100338c - a.this.f100337b)).divide(BigInteger.valueOf(a.this.f100341f)).longValue()) - 30000, a.this.f100337b, a.this.f100338c - 1)));
        }

        @Override // o8.l0
        public boolean e() {
            return true;
        }

        @Override // o8.l0
        public long h() {
            return a.this.f100339d.b(a.this.f100341f);
        }
    }

    public a(i iVar, long j15, long j16, long j17, long j18, boolean z15) {
        p.d(j15 >= 0 && j16 > j15);
        this.f100339d = iVar;
        this.f100337b = j15;
        this.f100338c = j16;
        if (j17 == j16 - j15 || z15) {
            this.f100341f = j18;
            this.f100340e = 4;
        } else {
            this.f100340e = 0;
        }
        this.f100336a = new f();
    }

    private long i(q qVar) throws IOException {
        if (this.f100344i == this.f100345j) {
            return -1L;
        }
        long position = qVar.getPosition();
        if (!this.f100336a.d(qVar, this.f100345j)) {
            long j15 = this.f100344i;
            if (j15 != position) {
                return j15;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f100336a.a(qVar, false);
        qVar.g();
        long j16 = this.f100343h;
        f fVar = this.f100336a;
        long j17 = fVar.f100366c;
        long j18 = j16 - j17;
        int i15 = fVar.f100371h + fVar.f100372i;
        if (0 <= j18 && j18 < 72000) {
            return -1L;
        }
        if (j18 < 0) {
            this.f100345j = position;
            this.f100347l = j17;
        } else {
            this.f100344i = qVar.getPosition() + ((long) i15);
            this.f100346k = this.f100336a.f100366c;
        }
        long j19 = this.f100345j;
        long j25 = this.f100344i;
        if (j19 - j25 < 100000) {
            this.f100345j = j25;
            return j25;
        }
        long position2 = qVar.getPosition() - (((long) i15) * (j18 <= 0 ? 2L : 1L));
        long j26 = this.f100345j;
        long j27 = this.f100344i;
        return o0.p(position2 + ((j18 * (j26 - j27)) / (this.f100347l - this.f100346k)), j27, j26 - 1);
    }

    private void k(q qVar) throws x {
        while (true) {
            this.f100336a.c(qVar);
            this.f100336a.a(qVar, false);
            f fVar = this.f100336a;
            if (fVar.f100366c > this.f100343h) {
                qVar.g();
                return;
            } else {
                qVar.n(fVar.f100371h + fVar.f100372i);
                this.f100344i = qVar.getPosition();
                this.f100346k = this.f100336a.f100366c;
            }
        }
    }

    @Override // j9.g
    public long a(q qVar) throws IOException {
        int i15 = this.f100340e;
        if (i15 == 0) {
            long position = qVar.getPosition();
            this.f100342g = position;
            this.f100340e = 1;
            long j15 = this.f100338c - 65307;
            if (j15 > position) {
                return j15;
            }
        } else if (i15 != 1) {
            if (i15 == 2) {
                long jI = i(qVar);
                if (jI != -1) {
                    return jI;
                }
                this.f100340e = 3;
            } else if (i15 != 3) {
                if (i15 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(qVar);
            this.f100340e = 4;
            return -(this.f100346k + 2);
        }
        this.f100341f = j(qVar);
        this.f100340e = 4;
        return this.f100342g;
    }

    @Override // j9.g
    public void c(long j15) {
        this.f100343h = o0.p(j15, 0L, this.f100341f - 1);
        this.f100340e = 2;
        this.f100344i = this.f100337b;
        this.f100345j = this.f100338c;
        this.f100346k = 0L;
        this.f100347l = this.f100341f;
    }

    @Override // j9.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b b() {
        if (this.f100341f != 0) {
            return new b();
        }
        return null;
    }

    long j(q qVar) throws x, EOFException {
        this.f100336a.b();
        if (!this.f100336a.c(qVar)) {
            throw new EOFException();
        }
        this.f100336a.a(qVar, false);
        f fVar = this.f100336a;
        qVar.n(fVar.f100371h + fVar.f100372i);
        long j15 = this.f100336a.f100366c;
        while (true) {
            f fVar2 = this.f100336a;
            if ((fVar2.f100365b & 4) == 4 || !fVar2.c(qVar) || qVar.getPosition() >= this.f100338c || !this.f100336a.a(qVar, true)) {
                break;
            }
            f fVar3 = this.f100336a;
            if (!s.f(qVar, fVar3.f100371h + fVar3.f100372i)) {
                break;
            }
            j15 = this.f100336a.f100366c;
        }
        return j15;
    }
}
