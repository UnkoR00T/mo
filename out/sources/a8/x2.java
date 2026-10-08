package a8;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f4775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f4776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7.h f4777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t7.e0 f4778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f4780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f4781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4783i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4784j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f4785k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f4786l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4787m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4788n;

    public interface a {
        void i(x2 x2Var);
    }

    public interface b {
        void A(int i15, Object obj);
    }

    public x2(a aVar, b bVar, t7.e0 e0Var, int i15, w7.h hVar, Looper looper) {
        this.f4776b = aVar;
        this.f4775a = bVar;
        this.f4778d = e0Var;
        this.f4781g = looper;
        this.f4777c = hVar;
        this.f4782h = i15;
    }

    public boolean a() {
        return this.f4784j;
    }

    public Looper b() {
        return this.f4781g;
    }

    public int c() {
        return this.f4782h;
    }

    public Object d() {
        return this.f4780f;
    }

    public long e() {
        return this.f4783i;
    }

    public b f() {
        return this.f4775a;
    }

    public t7.e0 g() {
        return this.f4778d;
    }

    public int h() {
        return this.f4779e;
    }

    public synchronized boolean i() {
        return this.f4788n;
    }

    public synchronized void j(boolean z15) {
        this.f4786l = z15 | this.f4786l;
        this.f4787m = true;
        notifyAll();
    }

    public x2 k() {
        zj.p.w(!this.f4785k);
        if (this.f4783i == -9223372036854775807L) {
            zj.p.d(this.f4784j);
        }
        this.f4785k = true;
        this.f4776b.i(this);
        return this;
    }

    public x2 l(Object obj) {
        zj.p.w(!this.f4785k);
        this.f4780f = obj;
        return this;
    }

    public x2 m(int i15) {
        zj.p.w(!this.f4785k);
        this.f4779e = i15;
        return this;
    }
}
