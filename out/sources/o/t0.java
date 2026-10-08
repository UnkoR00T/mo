package o;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p105prN.o2;
import s.ImageFormatFeature;
import v.j3;
import v.l3;
import v.n3;
import v.o3;
import v.t2;
import v.u2;
import v.w3;
import v.x3;
import v.z2;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends j2 {
    public static final c H = new c();
    static final e0.b I = new e0.b();
    private Rational A;
    private b0.k B;
    j3.b C;
    private u.e0 D;
    private u.d1 E;
    private j3.c F;
    private final u.d0 G;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final v.g2.a f140135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f140136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicReference<Integer> f140137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f140138y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f140139z;

    class a implements u.d0 {
        a() {
        }

        @Override // u.d0
        public com.google.common.util.concurrent.q<Void> a(List<v.n1> list) {
            return t0.this.S0(list);
        }

        @Override // u.d0
        public void b() {
            t0.this.M0();
        }

        @Override // u.d0
        public void c() {
            t0.this.W0();
        }
    }

    public static final class b implements w3.b<t0, v.d2, b>, v.f2.a<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u2 f140141a;

        public b() {
            this(u2.l0());
        }

        public static b f(v.p1 p1Var) {
            return new b(u2.m0(p1Var));
        }

        @Override // o.j0
        public t2 a() {
            return this.f140141a;
        }

        public t0 e() {
            Integer num = (Integer) a().f(v.d2.V, null);
            if (num != null) {
                a().m(v.e2.f202557n, num);
            } else if (t0.G0(a())) {
                a().m(v.e2.f202557n, 32);
            } else if (t0.H0(a())) {
                a().m(v.e2.f202557n, 32);
                a().m(v.e2.f202558o, 256);
            } else if (t0.I0(a())) {
                a().m(v.e2.f202557n, 4101);
                a().m(v.e2.f202559p, i0.f140010c);
            } else {
                a().m(v.e2.f202557n, 256);
            }
            v.d2 d2VarD = d();
            v.f2.t(d2VarD);
            t0 t0Var = new t0(d2VarD);
            Size size = (Size) a().f(v.f2.f202581u, null);
            if (size != null) {
                t0Var.O0(new Rational(size.getWidth(), size.getHeight()));
            }
            i6.i.h((Executor) a().f(b0.i.f15589a, z.a.c()), "The IO executor can't be null");
            t2 t2VarA = a();
            v.p1.a<Integer> aVar = v.d2.T;
            if (t2VarA.h(aVar)) {
                Integer num2 = (Integer) a().d(aVar);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3 && a().f(v.d2.f202538c0, null) == null) {
                    throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                }
            }
            return t0Var;
        }

        @Override // v.w3.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public v.d2 d() {
            return new v.d2(z2.k0(this.f140141a));
        }

        public b h(int i15) {
            a().m(v.d2.S, Integer.valueOf(i15));
            return this;
        }

        public b i(x3.b bVar) {
            a().m(w3.L, bVar);
            return this;
        }

        public b j(i0 i0Var) {
            a().m(v.e2.f202559p, i0Var);
            return this;
        }

        public b k(int i15) {
            a().m(v.d2.W, Integer.valueOf(i15));
            return this;
        }

        public b l(j0.c cVar) {
            a().m(v.f2.f202585y, cVar);
            return this;
        }

        public b m(o3 o3Var) {
            a().m(w3.Q, o3Var);
            return this;
        }

        public b n(int i15) {
            a().m(w3.E, Integer.valueOf(i15));
            return this;
        }

        @Deprecated
        public b o(int i15) {
            if (i15 == -1) {
                i15 = 0;
            }
            a().m(v.f2.f202577q, Integer.valueOf(i15));
            return this;
        }

        public b p(Class<t0> cls) {
            a().m(b0.r.f15616c, cls);
            if (a().f(b0.r.f15615b, null) == null) {
                q(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b q(String str) {
            a().m(b0.r.f15615b, str);
            return this;
        }

        @Override // v.f2.a
        @Deprecated
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b c(Size size) {
            a().m(v.f2.f202581u, size);
            return this;
        }

        @Override // v.f2.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b b(int i15) {
            a().m(v.f2.f202578r, Integer.valueOf(i15));
            return this;
        }

        private b(u2 u2Var) {
            this.f140141a = u2Var;
            Class cls = (Class) u2Var.f(b0.r.f15616c, null);
            if (cls == null || cls.equals(t0.class)) {
                i(x3.b.IMAGE_CAPTURE);
                p(t0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final o3 f140142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final j0.c f140143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final v.d2 f140144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final i0 f140145d;

        static {
            o3 o3Var = o3.STILL_CAPTURE;
            f140142a = o3Var;
            j0.c cVarA = new j0.c.a().d(j0.a.f98425c).f(j0.d.f98437c).a();
            f140143b = cVarA;
            i0 i0Var = i0.f140011d;
            f140145d = i0Var;
            f140144c = new b().n(4).m(o3Var).o(0).l(cVarA).k(0).j(i0Var).d();
        }

        public v.d2 a() {
            return f140144c;
        }
    }

    private static class d implements u0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f140146a;

        d(q qVar) {
            this.f140146a = qVar;
        }

        private Set<Integer> b() {
            q qVar = this.f140146a;
            HashSet hashSet = null;
            if (!(qVar instanceof v.e)) {
                return null;
            }
            v.p1 p1VarA = ((v.e) qVar).e().l().a(x3.b.IMAGE_CAPTURE, 1);
            if (p1VarA != null) {
                v.p1.a<List<Pair<Integer, Size[]>>> aVar = v.f2.f202584x;
                if (p1VarA.h(aVar)) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    Iterator it = ((List) p1VarA.d(aVar)).iterator();
                    while (it.hasNext()) {
                        if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                            hashSet.add(1);
                            break;
                        }
                    }
                }
            }
            return hashSet;
        }

        private boolean c() {
            q qVar = this.f140146a;
            if (!(qVar instanceof v.m0)) {
                return false;
            }
            v.m0 m0Var = (v.m0) qVar;
            if (m0Var.v().contains(3)) {
                return m0Var.a().contains(32);
            }
            return false;
        }

        private boolean d() {
            q qVar = this.f140146a;
            if (qVar instanceof v.m0) {
                return ((v.m0) qVar).a().contains(4101);
            }
            return false;
        }

        @Override // o.u0
        public Set<Integer> a() {
            Set<Integer> setB = b();
            if (setB != null) {
                return setB;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(0);
            if (d()) {
                hashSet.add(1);
            }
            if (c()) {
                hashSet.add(2);
                hashSet.add(3);
            }
            return hashSet;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f140147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f140148b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f140149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f140150d;

        public Location a() {
            return this.f140150d;
        }

        public boolean b() {
            return this.f140147a;
        }

        public boolean c() {
            return this.f140149c;
        }

        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.f140147a + ", mIsReversedVertical=" + this.f140149c + ", mLocation=" + this.f140150d + "}";
        }
    }

    public static abstract class f {
        public abstract void a(int i15);

        public abstract void b();

        public abstract void c(androidx.camera.core.o oVar);

        public abstract void d(v0 v0Var);

        public abstract void e(Bitmap bitmap);
    }

    public interface g {
        default void a(int i15) {
        }

        default void b(Bitmap bitmap) {
        }

        default void c() {
        }

        void d(i iVar);

        void e(v0 v0Var);
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f140151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ContentResolver f140152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f140153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ContentValues f140154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final OutputStream f140155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final e f140156f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private File f140157a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private ContentResolver f140158b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Uri f140159c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private ContentValues f140160d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private OutputStream f140161e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private e f140162f;

            public a(File file) {
                this.f140157a = file;
            }

            public h a() {
                return new h(this.f140157a, this.f140158b, this.f140159c, this.f140160d, this.f140161e, this.f140162f);
            }
        }

        h(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, e eVar) {
            this.f140151a = file;
            this.f140152b = contentResolver;
            this.f140153c = uri;
            this.f140154d = contentValues;
            this.f140155e = outputStream;
            this.f140156f = eVar == null ? new e() : eVar;
        }

        public ContentResolver a() {
            return this.f140152b;
        }

        public ContentValues b() {
            return this.f140154d;
        }

        public File c() {
            return this.f140151a;
        }

        public e d() {
            return this.f140156f;
        }

        public OutputStream e() {
            return this.f140155e;
        }

        public Uri f() {
            return this.f140153c;
        }

        public String toString() {
            return "OutputFileOptions{mFile=" + this.f140151a + ", mContentResolver=" + this.f140152b + ", mSaveCollection=" + this.f140153c + ", mContentValues=" + this.f140154d + ", mOutputStream=" + this.f140155e + ", mMetadata=" + this.f140156f + "}";
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f140163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f140164b;

        public i(Uri uri, int i15) {
            this.f140163a = uri;
            this.f140164b = i15;
        }
    }

    public interface j {
        void a(long j15, k kVar);

        void clear();
    }

    public interface k {
        void a();
    }

    t0(v.d2 d2Var) {
        super(d2Var);
        this.f140135v = new v.g2.a() { // from class: o.s0
            @Override // v.g2.a
            public final void a(v.g2 g2Var) {
                t0.j0(g2Var);
            }
        };
        this.f140137x = new AtomicReference<>(null);
        this.f140139z = -1;
        this.A = null;
        this.G = new a();
        v.d2 d2Var2 = (v.d2) l();
        if (d2Var2.h(v.d2.S)) {
            this.f140136w = d2Var2.j0();
        } else {
            this.f140136w = 1;
        }
        this.f140138y = d2Var2.l0(0);
        this.B = b0.k.g(d2Var2.p0());
    }

    private int A0() {
        v.d2 d2Var = (v.d2) l();
        if (d2Var.h(v.d2.f202537b0)) {
            return d2Var.o0();
        }
        int i15 = this.f140136w;
        if (i15 == 0) {
            return 100;
        }
        if (i15 == 1 || i15 == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f140136w + " is invalid");
    }

    private l3 C0() {
        return i().i().F(null);
    }

    private Rect D0() {
        Rect rectE = E();
        Size sizeH = h();
        Objects.requireNonNull(sizeH);
        if (rectE != null) {
            return rectE;
        }
        if (!f0.b.i(this.A)) {
            return new Rect(0, 0, sizeH.getWidth(), sizeH.getHeight());
        }
        v.n0 n0VarI = i();
        Objects.requireNonNull(n0VarI);
        int iT = t(n0VarI);
        Rational rational = new Rational(this.A.getDenominator(), this.A.getNumerator());
        if (!y.x.i(iT)) {
            rational = this.A;
        }
        Rect rectA = f0.b.a(sizeH, rational);
        Objects.requireNonNull(rectA);
        return rectA;
    }

    private static boolean F0(List<Pair<Integer, Size[]>> list, int i15) {
        if (list == null) {
            return false;
        }
        Iterator<Pair<Integer, Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next().first).equals(Integer.valueOf(i15))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean G0(t2 t2Var) {
        return Objects.equals(t2Var.f(v.d2.W, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean H0(t2 t2Var) {
        return Objects.equals(t2Var.f(v.d2.W, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean I0(t2 t2Var) {
        return Objects.equals(t2Var.f(v.d2.W, null), 1);
    }

    private boolean K0(Map<Integer, List<Size>> map, int i15) {
        return map.containsKey(Integer.valueOf(i15)) && !map.get(Integer.valueOf(i15)).isEmpty();
    }

    private boolean L0() {
        return (i() == null || i().i().F(null) == null) ? false : true;
    }

    private void N0(Executor executor, f fVar, g gVar) {
        v0 v0Var = new v0(4, "Not bound to a valid Camera [" + this + "]", null);
        if (gVar == null) {
            throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
        }
        gVar.e(v0Var);
    }

    private void P0() {
        Q0(this.B);
    }

    private void Q0(j jVar) {
        j().d(jVar);
    }

    private void U0(Executor executor, f fVar, g gVar, h hVar, h hVar2) {
        y.w.b();
        if (y0() == 3 && this.B.getScreenFlash() == null) {
            throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
        }
        v.n0 n0VarI = i();
        if (n0VarI == null || !H()) {
            N0(executor, fVar, gVar);
            return;
        }
        boolean z15 = l().Y() != 0;
        if (z15 && hVar2 == null && gVar != null) {
            throw new IllegalArgumentException("Simultaneous capture RAW and JPEG needs two output file options");
        }
        if (!z15 && hVar2 != null) {
            throw new IllegalArgumentException("Non simultaneous capture cannot have two output file options");
        }
        u.d1 d1Var = this.E;
        Objects.requireNonNull(d1Var);
        d1Var.e(u.n1.v(executor, fVar, gVar, hVar, hVar2, D0(), y(), t(n0VarI), A0(), x0(), z15, this.C.q()));
    }

    private void V0() {
        synchronized (this.f140137x) {
            try {
                if (this.f140137x.get() != null) {
                    return;
                }
                j().g(y0());
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static /* synthetic */ void i0(t0 t0Var, j3 j3Var, j3.g gVar) {
        if (t0Var.i() == null) {
            return;
        }
        t0Var.E.g();
        t0Var.t0(true);
        j3.b bVarU0 = t0Var.u0(t0Var.k(), (v.d2) t0Var.l(), (n3) i6.i.g(t0Var.g()));
        t0Var.C = bVarU0;
        t0Var.f0(k0.a(new Object[]{bVarU0.o()}));
        t0Var.M();
        t0Var.E.s();
    }

    public static /* synthetic */ void j0(v.g2 g2Var) {
        try {
            androidx.camera.core.o oVarC = g2Var.c();
            try {
                Objects.toString(oVarC);
                if (oVarC != null) {
                    oVarC.close();
                }
            } catch (Throwable th4) {
                if (oVarC != null) {
                    try {
                        oVarC.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (IllegalStateException e15) {
            io.sentry.android.core.c2.f("ImageCapture", "Failed to acquire latest image.", e15);
        }
    }

    public static /* synthetic */ Void k0(List list) {
        return null;
    }

    private void m0() {
        this.B.f();
        u.d1 d1Var = this.E;
        if (d1Var != null) {
            d1Var.c();
        }
    }

    private void q0(w3.b<?, ?, ?> bVar) {
        Set<q.b> setO = o();
        if (setO != null) {
            int iF = 0;
            for (q.b bVar2 : setO) {
                if (bVar2 instanceof ImageFormatFeature) {
                    iF = ((ImageFormatFeature) bVar2).getImageCaptureOutputFormat();
                }
            }
            bVar.a().m(v.d2.W, Integer.valueOf(iF));
        }
    }

    private u.l0 r0(int i15, Size size) {
        l3 l3VarC0 = C0();
        if (l3VarC0 == null) {
            return null;
        }
        Map<Integer, List<Size>> mapD = l3VarC0.d(size);
        ArrayList arrayList = new ArrayList();
        if (K0(mapD, 35)) {
            arrayList.add(35);
        }
        if (K0(mapD, 256)) {
            arrayList.add(256);
        }
        if (K0(mapD, 4101)) {
            arrayList.add(4101);
        }
        int iA = !arrayList.isEmpty() ? i().i().G().a(i15, arrayList) : 0;
        if (iA == 0) {
            return null;
        }
        List<Size> list = mapD.get(Integer.valueOf(iA));
        j0.c cVar = (j0.c) l().f(v.d2.f202539d0, null);
        if (cVar == null) {
            return u.l0.a((Size) Collections.max(list, new y.d()), iA);
        }
        Collections.sort(list, new y.d(true));
        v.n0 n0VarI = i();
        Rect rectK = n0VarI.o().k();
        v.m0 m0VarO = n0VarI.o();
        List<Size> listP = b0.p.p(cVar, list, null, E0(), new Rational(rectK.width(), rectK.height()), m0VarO.g(), m0VarO.n());
        if (listP.isEmpty()) {
            throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
        }
        return u.l0.a(listP.get(0), iA);
    }

    private void s0() {
        t0(false);
    }

    private void t0(boolean z15) {
        u.d1 d1Var;
        y.w.b();
        j3.c cVar = this.F;
        if (cVar != null) {
            cVar.b();
            this.F = null;
        }
        u.e0 e0Var = this.D;
        if (e0Var != null) {
            e0Var.a();
            this.D = null;
        }
        if (!z15 && (d1Var = this.E) != null) {
            d1Var.c();
            this.E = null;
        }
        j().a();
    }

    private j3.b u0(String str, v.d2 d2Var, n3 n3Var) {
        y.w.b();
        String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, n3Var);
        Size sizeF = n3Var.f();
        v.n0 n0VarI = i();
        Objects.requireNonNull(n0VarI);
        boolean z15 = !n0VarI.s();
        if (this.D != null) {
            i6.i.i(z15);
            this.D.a();
        }
        Set<Integer> setA = z0(i().c()).a();
        i6.i.b(setA.contains(Integer.valueOf(B0())), "The specified output format (" + B0() + ") is not supported by current configuration. Supported output formats: " + setA);
        CameraCharacteristics cameraCharacteristics = null;
        u.l0 l0VarR0 = J0() ? r0(d2Var.r(), sizeF) : null;
        if (i() != null) {
            try {
                Object objQ = i().o().q();
                if (objQ instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objQ;
                }
            } catch (Exception e15) {
                io.sentry.android.core.c2.f("ImageCapture", "getCameraCharacteristics failed", e15);
            }
        }
        this.D = new u.e0(d2Var, sizeF, cameraCharacteristics, n(), z15, l0VarR0);
        if (this.E == null) {
            this.E = l().s().a(this.G);
        }
        this.E.a(this.D);
        j3.b bVarF = this.D.f(n3Var.f());
        bVarF.x(n3Var.g());
        if (x0() == 2 && !n3Var.h()) {
            j().b(bVarF);
        }
        if (n3Var.d() != null) {
            bVarF.g(n3Var.d());
        }
        j3.c cVar = this.F;
        if (cVar != null) {
            cVar.b();
        }
        j3.c cVar2 = new j3.c(new j3.d() { // from class: o.p0
            @Override // v.j3.d
            public final void a(j3 j3Var, j3.g gVar) {
                t0.i0(this.f140102a, j3Var, gVar);
            }
        });
        this.F = cVar2;
        bVarF.r(cVar2);
        return bVarF;
    }

    private int w0() {
        v.n0 n0VarI = i();
        if (n0VarI != null) {
            return n0VarI.c().n();
        }
        return -1;
    }

    public static u0 z0(q qVar) {
        return new d(qVar);
    }

    @Override // o.j2
    public Set<Integer> B() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public int B0() {
        return ((Integer) i6.i.g((Integer) l().f(v.d2.W, 0))).intValue();
    }

    @Override // o.j2
    public w3.b<?, ?, ?> D(v.p1 p1Var) {
        return b.f(p1Var);
    }

    public int E0() {
        return C();
    }

    @Override // o.j2
    public boolean F() {
        return true;
    }

    public boolean J0() {
        return ((Boolean) l().f(v.d2.f202540e0, Boolean.FALSE)).booleanValue();
    }

    void M0() {
        synchronized (this.f140137x) {
            try {
                if (this.f140137x.get() != null) {
                    return;
                }
                this.f140137x.set(Integer.valueOf(y0()));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // o.j2
    public void O() {
        i6.i.h(i(), "Attached camera cannot be null");
        if (y0() == 3 && w0() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    public void O0(Rational rational) {
        this.A = rational;
    }

    @Override // o.j2
    public void P() {
        e1.a("ImageCapture", "onCameraControlReady");
        V0();
        P0();
    }

    @Override // o.j2
    protected w3<?> Q(v.m0 m0Var, w3.b<?, ?, ?> bVar) {
        q0(bVar);
        if (m0Var.s().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            t2 t2VarA = bVar.a();
            v.p1.a<Boolean> aVar = v.d2.Z;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(t2VarA.f(aVar, bool2))) {
                e1.o("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                e1.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                bVar.a().m(aVar, bool2);
            }
        }
        boolean zV0 = v0(bVar.a());
        Integer num = (Integer) bVar.a().f(v.d2.V, null);
        if (num != null) {
            i6.i.b(!L0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            bVar.a().m(v.e2.f202557n, Integer.valueOf(zV0 ? 35 : num.intValue()));
        } else if (G0(bVar.a())) {
            bVar.a().m(v.e2.f202557n, 32);
        } else if (H0(bVar.a())) {
            bVar.a().m(v.e2.f202557n, 32);
            bVar.a().m(v.e2.f202558o, 256);
        } else if (I0(bVar.a())) {
            bVar.a().m(v.e2.f202557n, 4101);
            bVar.a().m(v.e2.f202559p, i0.f140010c);
        } else if (zV0) {
            bVar.a().m(v.e2.f202557n, 35);
        } else {
            List list = (List) bVar.a().f(v.f2.f202584x, null);
            if (list == null || F0(list, 256)) {
                bVar.a().m(v.e2.f202557n, 256);
            } else if (F0(list, 35)) {
                bVar.a().m(v.e2.f202557n, 35);
            }
        }
        return bVar.d();
    }

    @Override // o.j2
    protected void R(int i15) {
        R0(i15);
    }

    public void R0(int i15) {
        int iE0 = E0();
        if (!c0(i15) || this.A == null) {
            return;
        }
        this.A = f0.b.g(Math.abs(y.c.b(i15) - y.c.b(iE0)), this.A);
    }

    com.google.common.util.concurrent.q<Void> S0(List<v.n1> list) {
        y.w.b();
        return a0.f.n(j().e(list, this.f140136w, this.f140138y), new o2() { // from class: o.r0
            @Override // p105prN.o2
            public final Object apply(Object obj) {
                return t0.k0((List) obj);
            }
        }, z.a.a());
    }

    @Override // o.j2
    public void T() {
        m0();
    }

    public void T0(final h hVar, final Executor executor, final g gVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            z.a.d().execute(new Runnable() { // from class: o.q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140114a.T0(hVar, executor, gVar);
                }
            });
        } else {
            U0(executor, null, gVar, hVar, null);
        }
    }

    @Override // o.j2
    protected n3 U(v.p1 p1Var) {
        this.C.g(p1Var);
        f0(k0.a(new Object[]{this.C.o()}));
        return g().i().d(p1Var).a();
    }

    @Override // o.j2
    protected n3 V(n3 n3Var, n3 n3Var2) {
        e1.a("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + n3Var + ", secondaryStreamSpec " + n3Var2);
        j3.b bVarU0 = u0(k(), (v.d2) l(), n3Var);
        this.C = bVarU0;
        f0(k0.a(new Object[]{bVarU0.o()}));
        K();
        return n3Var;
    }

    @Override // o.j2
    public void W() {
        m0();
        s0();
        Q0(null);
    }

    void W0() {
        synchronized (this.f140137x) {
            try {
                Integer andSet = this.f140137x.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                if (andSet.intValue() != y0()) {
                    V0();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // o.j2
    public w3<?> m(boolean z15, x3 x3Var) {
        c cVar = H;
        v.p1 p1VarA = x3Var.a(cVar.a().W(), x0());
        if (z15) {
            p1VarA = v.p1.u(p1VarA, cVar.a());
        }
        if (p1VarA == null) {
            return null;
        }
        return D(p1VarA).d();
    }

    public String toString() {
        return "ImageCapture:" + r();
    }

    boolean v0(t2 t2Var) {
        boolean z15;
        Boolean bool = Boolean.TRUE;
        v.p1.a<Boolean> aVar = v.d2.Z;
        Boolean bool2 = Boolean.FALSE;
        boolean z16 = false;
        if (bool.equals(t2Var.f(aVar, bool2))) {
            if (L0()) {
                e1.o("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z15 = false;
            } else {
                z15 = true;
            }
            Integer num = (Integer) t2Var.f(v.d2.V, null);
            if (num == null || num.intValue() == 256) {
                z16 = z15;
            } else {
                e1.o("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z16) {
                e1.o("ImageCapture", "Unable to support software JPEG. Disabling.");
                t2Var.m(aVar, bool2);
            }
        }
        return z16;
    }

    public int x0() {
        return this.f140136w;
    }

    public int y0() {
        int iK0;
        synchronized (this.f140137x) {
            iK0 = this.f140139z;
            if (iK0 == -1) {
                iK0 = ((v.d2) l()).k0(2);
            }
        }
        return iK0;
    }
}
