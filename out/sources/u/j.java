package u;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class j extends n1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f193392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o.t0.f f193393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o.t0.g f193394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o.t0.h f193395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o.t0.h f193396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f193397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Matrix f193398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f193399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f193400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f193401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f193402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<v.s> f193403n;

    j(Executor executor, o.t0.f fVar, o.t0.g gVar, o.t0.h hVar, o.t0.h hVar2, Rect rect, Matrix matrix, int i15, int i16, int i17, boolean z15, List<v.s> list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f193392c = executor;
        this.f193393d = fVar;
        this.f193394e = gVar;
        this.f193395f = hVar;
        this.f193396g = hVar2;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f193397h = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f193398i = matrix;
        this.f193399j = i15;
        this.f193400k = i16;
        this.f193401l = i17;
        this.f193402m = z15;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f193403n = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            n1 n1Var = (n1) obj;
            if (this.f193392c.equals(n1Var.g())) {
                n1Var.j();
                o.t0.g gVar = this.f193394e;
                if (gVar != null ? gVar.equals(n1Var.l()) : n1Var.l() == null) {
                    o.t0.h hVar = this.f193395f;
                    if (hVar != null ? hVar.equals(n1Var.m()) : n1Var.m() == null) {
                        o.t0.h hVar2 = this.f193396g;
                        if (hVar2 != null ? hVar2.equals(n1Var.o()) : n1Var.o() == null) {
                            if (this.f193397h.equals(n1Var.i()) && this.f193398i.equals(n1Var.p()) && this.f193399j == n1Var.n() && this.f193400k == n1Var.k() && this.f193401l == n1Var.h() && this.f193402m == n1Var.t() && this.f193403n.equals(n1Var.q())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // u.n1
    Executor g() {
        return this.f193392c;
    }

    @Override // u.n1
    int h() {
        return this.f193401l;
    }

    public int hashCode() {
        int iHashCode = (((this.f193392c.hashCode() ^ 1000003) * 1000003) ^ 0) * 1000003;
        o.t0.g gVar = this.f193394e;
        int iHashCode2 = (iHashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003;
        o.t0.h hVar = this.f193395f;
        int iHashCode3 = (iHashCode2 ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003;
        o.t0.h hVar2 = this.f193396g;
        return ((((((((((((((iHashCode3 ^ (hVar2 != null ? hVar2.hashCode() : 0)) * 1000003) ^ this.f193397h.hashCode()) * 1000003) ^ this.f193398i.hashCode()) * 1000003) ^ this.f193399j) * 1000003) ^ this.f193400k) * 1000003) ^ this.f193401l) * 1000003) ^ (this.f193402m ? 1231 : 1237)) * 1000003) ^ this.f193403n.hashCode();
    }

    @Override // u.n1
    public Rect i() {
        return this.f193397h;
    }

    @Override // u.n1
    public o.t0.f j() {
        return this.f193393d;
    }

    @Override // u.n1
    public int k() {
        return this.f193400k;
    }

    @Override // u.n1
    public o.t0.g l() {
        return this.f193394e;
    }

    @Override // u.n1
    public o.t0.h m() {
        return this.f193395f;
    }

    @Override // u.n1
    public int n() {
        return this.f193399j;
    }

    @Override // u.n1
    public o.t0.h o() {
        return this.f193396g;
    }

    @Override // u.n1
    Matrix p() {
        return this.f193398i;
    }

    @Override // u.n1
    List<v.s> q() {
        return this.f193403n;
    }

    @Override // u.n1
    boolean t() {
        return this.f193402m;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f193392c + ", inMemoryCallback=" + this.f193393d + ", onDiskCallback=" + this.f193394e + ", outputFileOptions=" + this.f193395f + ", secondaryOutputFileOptions=" + this.f193396g + ", cropRect=" + this.f193397h + ", sensorToBufferTransform=" + this.f193398i + ", rotationDegrees=" + this.f193399j + ", jpegQuality=" + this.f193400k + ", captureMode=" + this.f193401l + ", simultaneousCapture=" + this.f193402m + ", sessionConfigCameraCaptureCallbacks=" + this.f193403n + "}";
    }
}
