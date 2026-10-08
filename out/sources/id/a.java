package id;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d<K> f90956c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ud.c<A> f90958e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<b> f90954a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f90955b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f90957d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private A f90959f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f90960g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f90961h = -1.0f;

    public interface b {
        void a();
    }

    private static final class c<T> implements d<T> {
        private c() {
        }

        @Override // id.a.d
        public boolean a(float f15) {
            throw new IllegalStateException("not implemented");
        }

        @Override // id.a.d
        public ud.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // id.a.d
        public boolean c(float f15) {
            return false;
        }

        @Override // id.a.d
        public float d() {
            return 0.0f;
        }

        @Override // id.a.d
        public float e() {
            return 1.0f;
        }

        @Override // id.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    private interface d<T> {
        boolean a(float f15);

        ud.a<T> b();

        boolean c(float f15);

        float d();

        float e();

        boolean isEmpty();
    }

    private static final class e<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends ud.a<T>> f90962a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ud.a<T> f90964c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f90965d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ud.a<T> f90963b = f(0.0f);

        e(List<? extends ud.a<T>> list) {
            this.f90962a = list;
        }

        private ud.a<T> f(float f15) {
            List<? extends ud.a<T>> list = this.f90962a;
            ud.a<T> aVar = list.get(list.size() - 1);
            if (f15 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f90962a.size() - 2; size >= 1; size--) {
                ud.a<T> aVar2 = this.f90962a.get(size);
                if (this.f90963b != aVar2 && aVar2.a(f15)) {
                    return aVar2;
                }
            }
            return this.f90962a.get(0);
        }

        @Override // id.a.d
        public boolean a(float f15) {
            ud.a<T> aVar = this.f90964c;
            ud.a<T> aVar2 = this.f90963b;
            if (aVar == aVar2 && this.f90965d == f15) {
                return true;
            }
            this.f90964c = aVar2;
            this.f90965d = f15;
            return false;
        }

        @Override // id.a.d
        public ud.a<T> b() {
            return this.f90963b;
        }

        @Override // id.a.d
        public boolean c(float f15) {
            if (this.f90963b.a(f15)) {
                return !this.f90963b.i();
            }
            this.f90963b = f(f15);
            return true;
        }

        @Override // id.a.d
        public float d() {
            return this.f90962a.get(0).f();
        }

        @Override // id.a.d
        public float e() {
            List<? extends ud.a<T>> list = this.f90962a;
            return list.get(list.size() - 1).c();
        }

        @Override // id.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    private static final class f<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ud.a<T> f90966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f90967b = -1.0f;

        f(List<? extends ud.a<T>> list) {
            this.f90966a = list.get(0);
        }

        @Override // id.a.d
        public boolean a(float f15) {
            if (this.f90967b == f15) {
                return true;
            }
            this.f90967b = f15;
            return false;
        }

        @Override // id.a.d
        public ud.a<T> b() {
            return this.f90966a;
        }

        @Override // id.a.d
        public boolean c(float f15) {
            return !this.f90966a.i();
        }

        @Override // id.a.d
        public float d() {
            return this.f90966a.f();
        }

        @Override // id.a.d
        public float e() {
            return this.f90966a.c();
        }

        @Override // id.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    a(List<? extends ud.a<K>> list) {
        this.f90956c = q(list);
    }

    @SuppressLint({"Range"})
    private float g() {
        if (this.f90960g == -1.0f) {
            this.f90960g = this.f90956c.d();
        }
        return this.f90960g;
    }

    private static <T> d<T> q(List<? extends ud.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f90954a.add(bVar);
    }

    protected ud.a<K> b() {
        if (fd.e.h()) {
            fd.e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        ud.a<K> aVarB = this.f90956c.b();
        if (fd.e.h()) {
            fd.e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return aVarB;
    }

    @SuppressLint({"Range"})
    float c() {
        if (this.f90961h == -1.0f) {
            this.f90961h = this.f90956c.e();
        }
        return this.f90961h;
    }

    protected float d() {
        Interpolator interpolator;
        ud.a<K> aVarB = b();
        if (aVarB == null || aVarB.i() || (interpolator = aVarB.f197578d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    float e() {
        if (this.f90955b) {
            return 0.0f;
        }
        ud.a<K> aVarB = b();
        if (aVarB.i()) {
            return 0.0f;
        }
        return (this.f90957d - aVarB.f()) / (aVarB.c() - aVarB.f());
    }

    public float f() {
        return this.f90957d;
    }

    public A h() {
        float fE = e();
        if (this.f90958e == null && this.f90956c.a(fE) && !p()) {
            return this.f90959f;
        }
        ud.a<K> aVarB = b();
        Interpolator interpolator = aVarB.f197579e;
        A aI = (interpolator == null || aVarB.f197580f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f197580f.getInterpolation(fE));
        this.f90959f = aI;
        return aI;
    }

    abstract A i(ud.a<K> aVar, float f15);

    protected A j(ud.a<K> aVar, float f15, float f16, float f17) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f90958e != null;
    }

    public void l() {
        if (fd.e.h()) {
            fd.e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i15 = 0; i15 < this.f90954a.size(); i15++) {
            this.f90954a.get(i15).a();
        }
        if (fd.e.h()) {
            fd.e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.f90955b = true;
    }

    public void n(float f15) {
        if (fd.e.h()) {
            fd.e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f90956c.isEmpty()) {
            if (fd.e.h()) {
                fd.e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f15 < g()) {
            f15 = g();
        } else if (f15 > c()) {
            f15 = c();
        }
        if (f15 == this.f90957d) {
            if (fd.e.h()) {
                fd.e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f90957d = f15;
            if (this.f90956c.c(f15)) {
                l();
            }
            if (fd.e.h()) {
                fd.e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(ud.c<A> cVar) {
        ud.c<A> cVar2 = this.f90958e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f90958e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    protected boolean p() {
        return false;
    }
}
