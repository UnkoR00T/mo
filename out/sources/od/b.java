package od;

import android.graphics.PointF;
import fd.a0;

/* JADX INFO: loaded from: classes3.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f144666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nd.o<PointF, PointF> f144667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd.f f144668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f144669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f144670e;

    public b(String str, nd.o<PointF, PointF> oVar, nd.f fVar, boolean z15, boolean z16) {
        this.f144666a = str;
        this.f144667b = oVar;
        this.f144668c = fVar;
        this.f144669d = z15;
        this.f144670e = z16;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return new hd.f(a0Var, bVar, this);
    }

    public String b() {
        return this.f144666a;
    }

    public nd.o<PointF, PointF> c() {
        return this.f144667b;
    }

    public nd.f d() {
        return this.f144668c;
    }

    public boolean e() {
        return this.f144670e;
    }

    public boolean f() {
        return this.f144669d;
    }
}
