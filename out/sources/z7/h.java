package z7;

import java.util.ArrayDeque;
import z7.e;
import z7.f;
import z7.g;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h<I extends f, O extends g, E extends e> implements d<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f233239a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I[] f233243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O[] f233244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f233245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f233246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private I f233247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private E f233248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f233249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f233250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f233251m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f233240b = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f233252n = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f233241c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f233242d = new ArrayDeque<>();

    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            h.this.w();
        }
    }

    protected h(I[] iArr, O[] oArr) {
        this.f233243e = iArr;
        this.f233245g = iArr.length;
        for (int i15 = 0; i15 < this.f233245g; i15++) {
            ((I[]) this.f233243e)[i15] = j();
        }
        this.f233244f = oArr;
        this.f233246h = oArr.length;
        for (int i16 = 0; i16 < this.f233246h; i16++) {
            ((O[]) this.f233244f)[i16] = k();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f233239a = aVar;
        aVar.start();
    }

    private boolean i() {
        return !this.f233241c.isEmpty() && this.f233246h > 0;
    }

    private boolean n() {
        E e15;
        synchronized (this.f233240b) {
            while (!this.f233250l && !i()) {
                try {
                    this.f233240b.wait();
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (this.f233250l) {
                return false;
            }
            I iRemoveFirst = this.f233241c.removeFirst();
            O[] oArr = this.f233244f;
            int i15 = this.f233246h - 1;
            this.f233246h = i15;
            O o15 = oArr[i15];
            boolean z15 = this.f233249k;
            this.f233249k = false;
            if (iRemoveFirst.p()) {
                o15.k(4);
            } else {
                o15.f233236b = iRemoveFirst.f233230f;
                if (iRemoveFirst.q()) {
                    o15.k(134217728);
                }
                if (!q(iRemoveFirst.f233230f)) {
                    o15.f233238d = true;
                }
                try {
                    e15 = (E) m(iRemoveFirst, o15, z15);
                } catch (OutOfMemoryError e16) {
                    e15 = (E) l(e16);
                } catch (RuntimeException e17) {
                    e15 = (E) l(e17);
                }
                if (e15 != null) {
                    synchronized (this.f233240b) {
                        this.f233248j = e15;
                    }
                    return false;
                }
            }
            synchronized (this.f233240b) {
                try {
                    if (this.f233249k) {
                        o15.w();
                    } else if (o15.f233238d) {
                        this.f233251m++;
                        o15.w();
                    } else {
                        o15.f233237c = this.f233251m;
                        this.f233251m = 0;
                        this.f233242d.addLast(o15);
                    }
                    t(iRemoveFirst);
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            return true;
        }
    }

    private void r() {
        if (i()) {
            this.f233240b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends z7.e */
    private void s() throws E {
        E e15 = this.f233248j;
        if (e15 != null) {
            throw e15;
        }
    }

    private void t(I i15) {
        i15.l();
        I[] iArr = this.f233243e;
        int i16 = this.f233245g;
        this.f233245g = i16 + 1;
        iArr[i16] = i15;
    }

    private void v(O o15) {
        o15.l();
        O[] oArr = this.f233244f;
        int i15 = this.f233246h;
        this.f233246h = i15 + 1;
        oArr[i15] = o15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        do {
            try {
            } catch (InterruptedException e15) {
                throw new IllegalStateException(e15);
            }
        } while (n());
    }

    @Override // z7.d
    public void b() {
        synchronized (this.f233240b) {
            this.f233250l = true;
            this.f233240b.notify();
        }
        try {
            this.f233239a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // z7.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void e(I i15) {
        synchronized (this.f233240b) {
            s();
            p.d(i15 == this.f233247i);
            this.f233241c.addLast(i15);
            r();
            this.f233247i = null;
        }
    }

    @Override // z7.d
    public final void f(long j15) {
        synchronized (this.f233240b) {
            try {
                p.w(this.f233245g == this.f233243e.length || this.f233249k);
                this.f233252n = j15;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // z7.d
    public final void flush() {
        synchronized (this.f233240b) {
            try {
                this.f233249k = true;
                this.f233251m = 0;
                I i15 = this.f233247i;
                if (i15 != null) {
                    t(i15);
                    this.f233247i = null;
                }
                while (!this.f233241c.isEmpty()) {
                    t(this.f233241c.removeFirst());
                }
                while (!this.f233242d.isEmpty()) {
                    this.f233242d.removeFirst().w();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected abstract I j();

    protected abstract O k();

    protected abstract E l(Throwable th4);

    protected abstract E m(I i15, O o15, boolean z15);

    @Override // z7.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final I g() {
        I i15;
        synchronized (this.f233240b) {
            s();
            p.w(this.f233247i == null);
            int i16 = this.f233245g;
            if (i16 == 0) {
                i15 = null;
            } else {
                I[] iArr = this.f233243e;
                int i17 = i16 - 1;
                this.f233245g = i17;
                i15 = iArr[i17];
            }
            this.f233247i = i15;
        }
        return i15;
    }

    @Override // z7.d, e8.b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final O a() {
        synchronized (this.f233240b) {
            try {
                s();
                if (this.f233242d.isEmpty()) {
                    return null;
                }
                return this.f233242d.removeFirst();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected final boolean q(long j15) {
        boolean z15;
        synchronized (this.f233240b) {
            long j16 = this.f233252n;
            z15 = j16 == -9223372036854775807L || j15 >= j16;
        }
        return z15;
    }

    protected void u(O o15) {
        synchronized (this.f233240b) {
            v(o15);
            r();
        }
    }

    protected final void x(int i15) {
        p.w(this.f233245g == this.f233243e.length);
        for (I i16 : this.f233243e) {
            i16.x(i15);
        }
    }
}
