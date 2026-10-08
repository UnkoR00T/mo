package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import j6.v0;
import j6.w0;
import j6.x0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f8370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    w0 f8371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8372e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f8369b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x0 f8373f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<v0> f8368a = new ArrayList<>();

    class a extends x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8374a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8375b = 0;

        a() {
        }

        @Override // j6.w0
        public void b(View view) {
            int i15 = this.f8375b + 1;
            this.f8375b = i15;
            if (i15 == h.this.f8368a.size()) {
                w0 w0Var = h.this.f8371d;
                if (w0Var != null) {
                    w0Var.b(null);
                }
                d();
            }
        }

        @Override // j6.x0, j6.w0
        public void c(View view) {
            if (this.f8374a) {
                return;
            }
            this.f8374a = true;
            w0 w0Var = h.this.f8371d;
            if (w0Var != null) {
                w0Var.c(null);
            }
        }

        void d() {
            this.f8375b = 0;
            this.f8374a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f8372e) {
            Iterator<v0> it = this.f8368a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f8372e = false;
        }
    }

    void b() {
        this.f8372e = false;
    }

    public h c(v0 v0Var) {
        if (!this.f8372e) {
            this.f8368a.add(v0Var);
        }
        return this;
    }

    public h d(v0 v0Var, v0 v0Var2) {
        this.f8368a.add(v0Var);
        v0Var2.i(v0Var.d());
        this.f8368a.add(v0Var2);
        return this;
    }

    public h e(long j15) {
        if (!this.f8372e) {
            this.f8369b = j15;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f8372e) {
            this.f8370c = interpolator;
        }
        return this;
    }

    public h g(w0 w0Var) {
        if (!this.f8372e) {
            this.f8371d = w0Var;
        }
        return this;
    }

    public void h() {
        if (this.f8372e) {
            return;
        }
        for (v0 v0Var : this.f8368a) {
            long j15 = this.f8369b;
            if (j15 >= 0) {
                v0Var.e(j15);
            }
            Interpolator interpolator = this.f8370c;
            if (interpolator != null) {
                v0Var.f(interpolator);
            }
            if (this.f8371d != null) {
                v0Var.g(this.f8373f);
            }
            v0Var.k();
        }
        this.f8372e = true;
    }
}
