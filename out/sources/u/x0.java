package u;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import v.o1;

/* JADX INFO: loaded from: classes.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f193464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    n1 f193465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o.t0.h f193466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o.t0.h f193467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f193468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f193469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f193470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f193471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c1 f193472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f193473j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final com.google.common.util.concurrent.q<Void> f193475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f193476m = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<Integer> f193474k = new ArrayList();

    x0(v.m1 m1Var, n1 n1Var, c1 c1Var, com.google.common.util.concurrent.q<Void> qVar, int i15) {
        this.f193464a = i15;
        this.f193465b = n1Var;
        this.f193466c = n1Var.m();
        this.f193467d = n1Var.o();
        this.f193470g = n1Var.k();
        this.f193469f = n1Var.n();
        this.f193468e = n1Var.i();
        this.f193471h = n1Var.p();
        this.f193472i = c1Var;
        this.f193473j = String.valueOf(m1Var.hashCode());
        List<o1> listA = m1Var.a();
        Objects.requireNonNull(listA);
        Iterator<o1> it = listA.iterator();
        while (it.hasNext()) {
            this.f193474k.add(Integer.valueOf(it.next().getId()));
        }
        this.f193475l = qVar;
        o.e1.a("ProcessingRequest", "ProcessingRequest: mRequestId = " + this.f193464a + ", mTagBundleKey = " + this.f193473j);
    }

    com.google.common.util.concurrent.q<Void> a() {
        return this.f193475l;
    }

    Rect b() {
        return this.f193468e;
    }

    int c() {
        return this.f193470g;
    }

    o.t0.h d() {
        return this.f193466c;
    }

    public int e() {
        return this.f193464a;
    }

    int f() {
        return this.f193469f;
    }

    o.t0.h g() {
        return this.f193467d;
    }

    Matrix h() {
        return this.f193471h;
    }

    List<Integer> i() {
        return this.f193474k;
    }

    String j() {
        return this.f193473j;
    }

    n1 k() {
        return this.f193465b;
    }

    boolean l() {
        return this.f193472i.e();
    }

    boolean m() {
        return d() == null && g() == null;
    }

    void n(o.v0 v0Var) {
        o.e1.p("ProcessingRequest", "onCaptureFailure: request ID = " + this.f193464a, v0Var);
        this.f193472i.i(v0Var);
    }

    void o(int i15) {
        if (this.f193476m != i15) {
            this.f193476m = i15;
            this.f193472i.a(i15);
        }
    }

    void p() {
        o.e1.a("ProcessingRequest", "onCaptureStarted: request ID = " + this.f193464a);
        this.f193472i.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(androidx.camera.core.o oVar) {
        o.e1.e("ProcessingRequest", "onFinalResult(ImageProxy): request ID = " + this.f193464a);
        this.f193472i.d(oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(o.t0.i iVar) {
        o.e1.e("ProcessingRequest", "onFinalResult(OutputFileResults): request ID = " + this.f193464a);
        this.f193472i.h(iVar);
    }

    void s() {
        o.e1.e("ProcessingRequest", "onImageCaptured: request ID = " + this.f193464a);
        if (this.f193476m != -1) {
            o(100);
        }
        this.f193472i.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(Bitmap bitmap) {
        o.e1.e("ProcessingRequest", "onPostviewBitmapAvailable: request ID = " + this.f193464a);
        this.f193472i.b(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(o.v0 v0Var) {
        o.e1.p("ProcessingRequest", "onProcessFailure: request ID = " + this.f193464a, v0Var);
        this.f193472i.f(v0Var);
    }
}
