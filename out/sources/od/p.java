package od;

import android.graphics.Path;
import fd.a0;

/* JADX INFO: loaded from: classes3.dex */
public class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f144767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path.FillType f144768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f144769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nd.a f144770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nd.d f144771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f144772f;

    public p(String str, boolean z15, Path.FillType fillType, nd.a aVar, nd.d dVar, boolean z16) {
        this.f144769c = str;
        this.f144767a = z15;
        this.f144768b = fillType;
        this.f144770d = aVar;
        this.f144771e = dVar;
        this.f144772f = z16;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return new hd.g(a0Var, bVar, this);
    }

    public nd.a b() {
        return this.f144770d;
    }

    public Path.FillType c() {
        return this.f144768b;
    }

    public String d() {
        return this.f144769c;
    }

    public nd.d e() {
        return this.f144771e;
    }

    public boolean f() {
        return this.f144772f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f144767a + '}';
    }
}
