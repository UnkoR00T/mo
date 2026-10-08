package w7;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f210630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f210631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a<T> f210632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f210633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private T f210634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f210635f;

    public interface a<T> {
        void a(T t15, T t16);
    }

    public e(T t15, Looper looper, Looper looper2, h hVar, a<T> aVar) {
        this.f210630a = hVar.e(looper, null);
        this.f210631b = hVar.e(looper2, null);
        this.f210633d = t15;
        this.f210634e = t15;
        this.f210632c = aVar;
    }

    public static /* synthetic */ void a(final e eVar, zj.g gVar) {
        final T t15 = (T) gVar.apply(eVar.f210634e);
        eVar.f210634e = t15;
        eVar.f(new Runnable() { // from class: w7.c
            @Override // java.lang.Runnable
            public final void run() {
                e.c(this.f210613a, t15);
            }
        });
    }

    public static /* synthetic */ void b(e eVar, Object obj) {
        if (eVar.f210635f == 0) {
            eVar.i(obj);
        }
    }

    public static /* synthetic */ void c(e eVar, Object obj) {
        int i15 = eVar.f210635f - 1;
        eVar.f210635f = i15;
        if (i15 == 0) {
            eVar.i(obj);
        }
    }

    private void f(Runnable runnable) {
        if (this.f210631b.g().getThread().isAlive()) {
            this.f210631b.j(runnable);
        }
    }

    private void i(T t15) {
        T t16 = this.f210633d;
        this.f210633d = t15;
        if (t16.equals(t15)) {
            return;
        }
        this.f210632c.a(t16, t15);
    }

    public T d() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f210631b.g()) {
            return this.f210633d;
        }
        zj.p.w(looperMyLooper == this.f210630a.g());
        return this.f210634e;
    }

    public void e(Runnable runnable) {
        if (this.f210630a.g().getThread().isAlive()) {
            this.f210630a.j(runnable);
        }
    }

    public void g(final T t15) {
        this.f210634e = t15;
        f(new Runnable() { // from class: w7.d
            @Override // java.lang.Runnable
            public final void run() {
                e.b(this.f210622a, t15);
            }
        });
    }

    public void h(zj.g<T, T> gVar, final zj.g<T, T> gVar2) {
        zj.p.w(Looper.myLooper() == this.f210631b.g());
        this.f210635f++;
        e(new Runnable() { // from class: w7.b
            @Override // java.lang.Runnable
            public final void run() {
                e.a(this.f210607a, gVar2);
            }
        });
        i(gVar.apply(this.f210633d));
    }
}
