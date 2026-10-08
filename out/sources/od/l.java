package od;

import android.graphics.PointF;
import fd.a0;

/* JADX INFO: loaded from: classes3.dex */
public class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f144752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nd.o<PointF, PointF> f144753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd.o<PointF, PointF> f144754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nd.b f144755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f144756e;

    public l(String str, nd.o<PointF, PointF> oVar, nd.o<PointF, PointF> oVar2, nd.b bVar, boolean z15) {
        this.f144752a = str;
        this.f144753b = oVar;
        this.f144754c = oVar2;
        this.f144755d = bVar;
        this.f144756e = z15;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return new hd.o(a0Var, bVar, this);
    }

    public nd.b b() {
        return this.f144755d;
    }

    public String c() {
        return this.f144752a;
    }

    public nd.o<PointF, PointF> d() {
        return this.f144753b;
    }

    public nd.o<PointF, PointF> e() {
        return this.f144754c;
    }

    public boolean f() {
        return this.f144756e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f144753b + ", size=" + this.f144754c + '}';
    }
}
