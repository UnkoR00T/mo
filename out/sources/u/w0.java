package u;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import v.g3;

/* JADX INFO: loaded from: classes.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Executor f193447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final g0.y f193448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CameraCharacteristics f193449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    z f193450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f193451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g0.a0<b, g0.b0<androidx.camera.core.o>> f193452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g0.a0<c0.a, g0.b0<byte[]>> f193453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g0.a0<k.b, g0.b0<byte[]>> f193454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g0.a0<g0.a, o.t0.i> f193455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g0.a0<g0.b0<byte[]>, g0.b0<Bitmap>> f193456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g0.a0<g0.b0<androidx.camera.core.o>, androidx.camera.core.o> f193457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g0.a0<g0.b0<byte[]>, g0.b0<androidx.camera.core.o>> f193458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g0.a0<g0.b0<androidx.camera.core.o>, Bitmap> f193459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g0.a0<g0.b0<Bitmap>, g0.b0<Bitmap>> f193460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final g3 f193461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f193462p;

    static abstract class a {
        a() {
        }

        static a e(int i15, List<Integer> list) {
            return new g(new g0.u(), new g0.u(), i15, list);
        }

        abstract g0.u<b> a();

        abstract int b();

        abstract List<Integer> c();

        abstract g0.u<b> d();
    }

    static abstract class b {
        b() {
        }

        static b c(x0 x0Var, androidx.camera.core.o oVar) {
            return new h(x0Var, oVar);
        }

        abstract androidx.camera.core.o a();

        abstract x0 b();
    }

    w0(Executor executor, CameraCharacteristics cameraCharacteristics, g0.y yVar) {
        this(executor, cameraCharacteristics, yVar, androidx.camera.core.internal.compat.quirk.a.c());
    }

    public static /* synthetic */ void c(final w0 w0Var, final b bVar) {
        w0Var.getClass();
        if (bVar.b().l()) {
            bVar.a().close();
        } else {
            w0Var.f193447a.execute(new Runnable() { // from class: u.q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f193428a.l(bVar);
                }
            });
        }
    }

    public static /* synthetic */ void e(final w0 w0Var, final b bVar) {
        w0Var.getClass();
        if (!bVar.b().l()) {
            w0Var.f193447a.execute(new Runnable() { // from class: u.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f193425a.n(bVar);
                }
            });
        } else {
            o.e1.o("ProcessingNode", "The postview image is closed due to request aborted");
            bVar.a().close();
        }
    }

    public static /* synthetic */ void h(w0 w0Var, b bVar) {
        w0Var.getClass();
        final x0 x0VarB = bVar.b();
        try {
            boolean z15 = true;
            if (w0Var.f193451e.c().size() <= 1) {
                z15 = false;
            }
            if (bVar.b().m()) {
                final androidx.camera.core.o oVarK = w0Var.k(bVar);
                z.a.d().execute(new Runnable() { // from class: u.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        x0VarB.q(oVarK);
                    }
                });
                return;
            }
            final o.t0.i iVarM = w0Var.m(bVar);
            if (!z15 || x0VarB.k().s()) {
                z.a.d().execute(new Runnable() { // from class: u.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        x0VarB.r(iVarM);
                    }
                });
            }
        } catch (OutOfMemoryError e15) {
            w0Var.r(x0VarB, new o.v0(0, "Processing failed due to low memory.", e15));
        } catch (RuntimeException e16) {
            w0Var.r(x0VarB, new o.v0(0, "Processing failed.", e16));
        } catch (o.v0 e17) {
            w0Var.r(x0VarB, e17);
        }
    }

    private g0.b0<byte[]> j(g0.b0<byte[]> b0Var, int i15) {
        i6.i.i(f0.b.j(b0Var.e()));
        g0.b0<Bitmap> b0VarApply = this.f193456j.apply(b0Var);
        g0.a0<g0.b0<Bitmap>, g0.b0<Bitmap>> a0Var = this.f193460n;
        if (a0Var != null) {
            b0VarApply = a0Var.apply(b0VarApply);
        }
        return this.f193454h.apply(k.b.c(b0VarApply, i15));
    }

    private o.t0.i p(g0.b0<androidx.camera.core.o> b0Var, o.t0.h hVar, int i15) {
        g0.b0<byte[]> b0VarApply = this.f193453g.apply(c0.a.c(b0Var, i15));
        if (b0VarApply.i() || this.f193460n != null) {
            b0VarApply = j(b0VarApply, i15);
        }
        g0.a0<g0.a, o.t0.i> a0Var = this.f193455i;
        Objects.requireNonNull(hVar);
        return a0Var.apply(g0.a.c(b0VarApply, hVar));
    }

    private o.t0.i q(g0.b0<androidx.camera.core.o> b0Var, o.t0.h hVar) throws o.v0 {
        if (this.f193450d == null) {
            if (this.f193449c == null) {
                throw new o.v0(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (b0Var.a().g() == null) {
                throw new o.v0(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CameraCharacteristics cameraCharacteristics = this.f193449c;
            Objects.requireNonNull(cameraCharacteristics);
            CaptureResult captureResultG = b0Var.a().g();
            Objects.requireNonNull(captureResultG);
            this.f193450d = new z(cameraCharacteristics, captureResultG);
        }
        z zVar = this.f193450d;
        androidx.camera.core.o oVarC = b0Var.c();
        int iF = b0Var.f();
        Objects.requireNonNull(hVar);
        return zVar.apply(z.a.d(oVarC, iF, hVar));
    }

    private void r(final x0 x0Var, final o.v0 v0Var) {
        z.a.d().execute(new Runnable() { // from class: u.v0
            @Override // java.lang.Runnable
            public final void run() {
                x0Var.u(v0Var);
            }
        });
    }

    androidx.camera.core.o k(b bVar) {
        o.e1.a("ProcessingNode", "processInMemoryCapture: request ID = " + bVar.b().e());
        x0 x0VarB = bVar.b();
        g0.b0<androidx.camera.core.o> b0VarApply = this.f193452f.apply(bVar);
        List<Integer> listC = this.f193451e.c();
        i6.i.a(!listC.isEmpty());
        int iIntValue = listC.get(0).intValue();
        if ((b0VarApply.e() == 35 || this.f193460n != null || this.f193462p) && iIntValue == 256) {
            g0.b0<byte[]> b0VarApply2 = this.f193453g.apply(c0.a.c(b0VarApply, x0VarB.c()));
            if (this.f193460n != null) {
                b0VarApply2 = j(b0VarApply2, x0VarB.c());
            }
            b0VarApply = this.f193458l.apply(b0VarApply2);
        }
        androidx.camera.core.o oVarApply = this.f193457k.apply(b0VarApply);
        if (listC.size() > 1) {
            x0VarB.k().u(oVarApply.getFormat(), true);
        }
        return oVarApply;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(final b bVar) {
        o.f0.a("processInputPacket", new Runnable() { // from class: u.r0
            @Override // java.lang.Runnable
            public final void run() {
                w0.h(this.f193431a, bVar);
            }
        });
    }

    o.t0.i m(b bVar) throws o.v0 {
        o.e1.a("ProcessingNode", "processOnDiskCapture: request ID = " + bVar.b().e());
        List<Integer> listC = this.f193451e.c();
        i6.i.a(listC.isEmpty() ^ true);
        boolean z15 = false;
        Integer num = listC.get(0);
        int iIntValue = num.intValue();
        i6.i.b(f0.b.j(iIntValue) || f0.b.k(iIntValue), String.format("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s", num));
        x0 x0VarB = bVar.b();
        i6.i.b(x0VarB.d() != null, "OutputFileOptions cannot be empty");
        g0.b0<androidx.camera.core.o> b0VarApply = this.f193452f.apply(bVar);
        if (listC.size() <= 1) {
            if (iIntValue != 32) {
                o.t0.h hVarD = x0VarB.d();
                Objects.requireNonNull(hVarD);
                return p(b0VarApply, hVarD, x0VarB.c());
            }
            o.t0.h hVarD2 = x0VarB.d();
            Objects.requireNonNull(hVarD2);
            return q(b0VarApply, hVarD2);
        }
        if (x0VarB.d() != null && x0VarB.g() != null) {
            z15 = true;
        }
        i6.i.b(z15, "The number of OutputFileOptions for simultaneous capture should be at least two");
        if (b0VarApply.e() != 32) {
            o.t0.h hVarG = x0VarB.g();
            Objects.requireNonNull(hVarG);
            o.t0.i iVarP = p(b0VarApply, hVarG, x0VarB.c());
            x0VarB.k().u(256, true);
            return iVarP;
        }
        o.t0.h hVarD3 = x0VarB.d();
        Objects.requireNonNull(hVarD3);
        o.t0.i iVarQ = q(b0VarApply, hVarD3);
        x0VarB.k().u(32, true);
        return iVarQ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(b bVar) {
        final x0 x0VarB = bVar.b();
        try {
            g0.b0<androidx.camera.core.o> b0VarApply = this.f193452f.apply(bVar);
            int iE = b0VarApply.e();
            i6.i.b(iE == 35 || iE == 256 || iE == 4101, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", Integer.valueOf(iE)));
            final Bitmap bitmapApply = this.f193459m.apply(b0VarApply);
            z.a.d().execute(new Runnable() { // from class: u.s0
                @Override // java.lang.Runnable
                public final void run() {
                    x0VarB.t(bitmapApply);
                }
            });
        } catch (Exception e15) {
            bVar.a().close();
            o.e1.d("ProcessingNode", "process postview input packet failed.", e15);
        }
    }

    public void o() {
    }

    public Void s(a aVar) {
        this.f193451e = aVar;
        aVar.a().a(new i6.a() { // from class: u.n0
            @Override // i6.a
            public final void accept(Object obj) {
                w0.c(this.f193419a, (w0.b) obj);
            }
        });
        aVar.d().a(new i6.a() { // from class: u.o0
            @Override // i6.a
            public final void accept(Object obj) {
                w0.e(this.f193423a, (w0.b) obj);
            }
        });
        this.f193452f = new m0();
        this.f193453g = new c0(this.f193461o);
        this.f193456j = new f0();
        this.f193454h = new k();
        this.f193455i = new g0();
        this.f193457k = new i0();
        this.f193459m = new b0();
        if (aVar.b() == 35 || this.f193448b != null || this.f193462p) {
            this.f193458l = new h0();
        }
        g0.y yVar = this.f193448b;
        if (yVar == null) {
            return null;
        }
        this.f193460n = new l(yVar);
        return null;
    }

    w0(Executor executor, CameraCharacteristics cameraCharacteristics, g0.y yVar, g3 g3Var) {
        if (androidx.camera.core.internal.compat.quirk.a.b(LowMemoryQuirk.class) != null) {
            this.f193447a = z.a.f(executor);
        } else {
            this.f193447a = executor;
        }
        this.f193448b = yVar;
        this.f193449c = cameraCharacteristics;
        this.f193461o = g3Var;
        this.f193462p = g3Var.a(IncorrectJpegMetadataQuirk.class);
    }
}
