package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class j3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<Integer> f202617j = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f> f202618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f202619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<CameraDevice.StateCallback> f202620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<CameraCaptureSession.StateCallback> f202621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<s> f202622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f202623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n1 f202624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f202625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InputConfiguration f202626i;

    static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        d f202632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        InputConfiguration f202633g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        f f202635i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Set<f> f202627a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final n1.a f202628b = new n1.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List<CameraDevice.StateCallback> f202629c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List<CameraCaptureSession.StateCallback> f202630d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final List<s> f202631e = new ArrayList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f202634h = 0;

        a() {
        }
    }

    public static class b extends a {
        public static b p(w3<?> w3Var, Size size) {
            e eVarK = w3Var.k(null);
            if (eVarK != null) {
                b bVar = new b();
                eVarK.a(size, w3Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + w3Var.w(w3Var.toString()));
        }

        public b a(Collection<s> collection) {
            for (s sVar : collection) {
                this.f202628b.c(sVar);
                if (!this.f202631e.contains(sVar)) {
                    this.f202631e.add(sVar);
                }
            }
            return this;
        }

        public b b(Collection<CameraDevice.StateCallback> collection) {
            Iterator<CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
            return this;
        }

        public b c(Collection<s> collection) {
            this.f202628b.a(collection);
            return this;
        }

        public b d(List<CameraCaptureSession.StateCallback> list) {
            Iterator<CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                k(it.next());
            }
            return this;
        }

        public b e(s sVar) {
            this.f202628b.c(sVar);
            if (!this.f202631e.contains(sVar)) {
                this.f202631e.add(sVar);
            }
            return this;
        }

        public b f(CameraDevice.StateCallback stateCallback) {
            if (this.f202629c.contains(stateCallback)) {
                return this;
            }
            this.f202629c.add(stateCallback);
            return this;
        }

        public b g(p1 p1Var) {
            this.f202628b.e(p1Var);
            return this;
        }

        public b h(u1 u1Var) {
            return i(u1Var, o.i0.f140011d);
        }

        public b i(u1 u1Var, o.i0 i0Var) {
            this.f202627a.add(f.a(u1Var).b(i0Var).a());
            return this;
        }

        public b j(s sVar) {
            this.f202628b.c(sVar);
            return this;
        }

        public b k(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f202630d.contains(stateCallback)) {
                return this;
            }
            this.f202630d.add(stateCallback);
            return this;
        }

        public b l(u1 u1Var) {
            return m(u1Var, o.i0.f140011d);
        }

        public b m(u1 u1Var, o.i0 i0Var) {
            return n(u1Var, i0Var, null, -1);
        }

        public b n(u1 u1Var, o.i0 i0Var, String str, int i15) {
            this.f202627a.add(f.a(u1Var).d(str).b(i0Var).c(i15).a());
            this.f202628b.f(u1Var);
            return this;
        }

        public j3 o() {
            return new j3(new ArrayList(this.f202627a), new ArrayList(this.f202629c), new ArrayList(this.f202630d), new ArrayList(this.f202631e), this.f202628b.h(), this.f202632f, this.f202633g, this.f202634h, this.f202635i);
        }

        public List<s> q() {
            return Collections.unmodifiableList(this.f202631e);
        }

        public b r(d dVar) {
            this.f202632f = dVar;
            return this;
        }

        public b s(Range<Integer> range) {
            this.f202628b.m(range);
            return this;
        }

        public b t(p1 p1Var) {
            this.f202628b.o(p1Var);
            return this;
        }

        public b u(InputConfiguration inputConfiguration) {
            this.f202633g = inputConfiguration;
            return this;
        }

        public b v(u1 u1Var) {
            this.f202635i = f.a(u1Var).a();
            return this;
        }

        public b w(int i15) {
            if (i15 != 0) {
                this.f202628b.q(i15);
            }
            return this;
        }

        public b x(int i15) {
            this.f202634h = i15;
            return this;
        }

        public b y(int i15) {
            this.f202628b.r(i15);
            return this;
        }

        public b z(int i15) {
            if (i15 != 0) {
                this.f202628b.t(i15);
            }
            return this;
        }
    }

    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f202636a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f202637b;

        public c(d dVar) {
            this.f202637b = dVar;
        }

        @Override // v.j3.d
        public void a(j3 j3Var, g gVar) {
            if (this.f202636a.get()) {
                return;
            }
            this.f202637b.a(j3Var, gVar);
        }

        public void b() {
            this.f202636a.set(true);
        }
    }

    public interface d {
        void a(j3 j3Var, g gVar);
    }

    public interface e {
        void a(Size size, w3<?> w3Var, b bVar);
    }

    public static abstract class f {

        public static abstract class a {
            public abstract f a();

            public abstract a b(o.i0 i0Var);

            public abstract a c(int i15);

            public abstract a d(String str);

            public abstract a e(List<u1> list);

            public abstract a f(int i15);
        }

        public static a a(u1 u1Var) {
            return new o.b().g(u1Var).e(Collections.EMPTY_LIST).d(null).c(-1).f(-1).b(o.i0.f140011d);
        }

        public abstract o.i0 b();

        public abstract int c();

        public abstract String d();

        public abstract List<u1> e();

        public abstract u1 f();

        public abstract int g();
    }

    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class h extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final e0.g f202641j = new e0.g();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f202642k = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private StringBuilder f202643l = new StringBuilder();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f202644m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<d> f202645n = new ArrayList();

        public static /* synthetic */ void a(h hVar, j3 j3Var, g gVar) {
            Iterator<d> it = hVar.f202645n.iterator();
            while (it.hasNext()) {
                it.next().a(j3Var, gVar);
            }
        }

        private List<u1> e() {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f202627a) {
                arrayList.add(fVar.f());
                Iterator<u1> it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        }

        private void g(Range<Integer> range) {
            Range<Integer> range2 = n3.f202727a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f202628b.j().equals(range2)) {
                this.f202628b.m(range);
                return;
            }
            if (this.f202628b.j().equals(range)) {
                return;
            }
            this.f202642k = false;
            String str = "Different ExpectedFrameRateRange values; current = " + this.f202628b.j() + ", new = " + range;
            o.e1.c("ValidatingBuilder", str);
            this.f202643l.append(str);
        }

        private void h(int i15) {
            if (i15 != 0) {
                this.f202628b.q(i15);
            }
        }

        private void i(int i15) {
            if (i15 != 0) {
                this.f202628b.t(i15);
            }
        }

        public void b(j3 j3Var) {
            n1 n1VarL = j3Var.l();
            if (n1VarL.j() != -1) {
                this.f202644m = true;
                this.f202628b.r(j3.f(n1VarL.j(), this.f202628b.l()));
            }
            g(n1VarL.d());
            h(n1VarL.g());
            i(n1VarL.k());
            this.f202628b.b(j3Var.l().i());
            this.f202629c.addAll(j3Var.c());
            this.f202630d.addAll(j3Var.m());
            this.f202628b.a(j3Var.k());
            this.f202631e.addAll(j3Var.o());
            if (j3Var.d() != null) {
                this.f202645n.add(j3Var.d());
            }
            if (j3Var.h() != null) {
                this.f202633g = j3Var.h();
            }
            this.f202627a.addAll(j3Var.i());
            this.f202628b.k().addAll(n1VarL.h());
            if (!e().containsAll(this.f202628b.k())) {
                o.e1.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f202642k = false;
                this.f202643l.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
            }
            if (j3Var.n() != this.f202634h && j3Var.n() != 0 && this.f202634h != 0) {
                o.e1.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f202642k = false;
                this.f202643l.append("Invalid configuration due to that two non-default session types are set");
            } else if (j3Var.n() != 0) {
                this.f202634h = j3Var.n();
            }
            if (j3Var.f202619b != null) {
                if (this.f202635i == j3Var.f202619b || this.f202635i == null) {
                    this.f202635i = j3Var.f202619b;
                } else {
                    o.e1.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f202642k = false;
                    this.f202643l.append("Invalid configuration due to that two different postview output configs are set");
                }
            }
            this.f202628b.e(n1VarL.f());
        }

        public j3 c() {
            if (!this.f202642k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f202627a);
            this.f202641j.c(arrayList);
            if (this.f202634h == 1) {
                new b0.g().e(arrayList, this.f202628b);
            }
            return new j3(arrayList, new ArrayList(this.f202629c), new ArrayList(this.f202630d), new ArrayList(this.f202631e), this.f202628b.h(), !this.f202645n.isEmpty() ? new d() { // from class: v.k3
                @Override // v.j3.d
                public final void a(j3 j3Var, j3.g gVar) {
                    j3.h.a(this.f202657a, j3Var, gVar);
                }
            } : null, this.f202633g, this.f202634h, this.f202635i);
        }

        public String d() {
            return !this.f202644m ? "Template is not set" : this.f202643l.toString();
        }

        public boolean f() {
            return this.f202644m && this.f202642k;
        }
    }

    j3(List<f> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<s> list4, n1 n1Var, d dVar, InputConfiguration inputConfiguration, int i15, f fVar) {
        this.f202618a = list;
        this.f202620c = Collections.unmodifiableList(list2);
        this.f202621d = Collections.unmodifiableList(list3);
        this.f202622e = Collections.unmodifiableList(list4);
        this.f202623f = dVar;
        this.f202624g = n1Var;
        this.f202626i = inputConfiguration;
        this.f202625h = i15;
        this.f202619b = fVar;
    }

    public static j3 b() {
        return new j3(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new n1.a().h(), null, null, 0, null);
    }

    public static int f(int i15, int i16) {
        List<Integer> list = f202617j;
        return list.indexOf(Integer.valueOf(i15)) >= list.indexOf(Integer.valueOf(i16)) ? i15 : i16;
    }

    public List<CameraDevice.StateCallback> c() {
        return this.f202620c;
    }

    public d d() {
        return this.f202623f;
    }

    public Range<Integer> e() {
        return this.f202624g.d();
    }

    public p1 g() {
        return this.f202624g.f();
    }

    public InputConfiguration h() {
        return this.f202626i;
    }

    public List<f> i() {
        return this.f202618a;
    }

    public f j() {
        return this.f202619b;
    }

    public List<s> k() {
        return this.f202624g.c();
    }

    public n1 l() {
        return this.f202624g;
    }

    public List<CameraCaptureSession.StateCallback> m() {
        return this.f202621d;
    }

    public int n() {
        return this.f202625h;
    }

    public List<s> o() {
        return this.f202622e;
    }

    public List<u1> p() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.f202618a) {
            arrayList.add(fVar.f());
            Iterator<u1> it = fVar.e().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int q() {
        return this.f202624g.j();
    }
}
