package od;

import android.graphics.Path;
import fd.a0;

/* JADX INFO: loaded from: classes3.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f144673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path.FillType f144674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd.c f144675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nd.d f144676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nd.f f144677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nd.f f144678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f144679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final nd.b f144680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final nd.b f144681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f144682j;

    public e(String str, g gVar, Path.FillType fillType, nd.c cVar, nd.d dVar, nd.f fVar, nd.f fVar2, nd.b bVar, nd.b bVar2, boolean z15) {
        this.f144673a = gVar;
        this.f144674b = fillType;
        this.f144675c = cVar;
        this.f144676d = dVar;
        this.f144677e = fVar;
        this.f144678f = fVar2;
        this.f144679g = str;
        this.f144680h = bVar;
        this.f144681i = bVar2;
        this.f144682j = z15;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return new hd.h(a0Var, fVar, bVar, this);
    }

    public nd.f b() {
        return this.f144678f;
    }

    public Path.FillType c() {
        return this.f144674b;
    }

    public nd.c d() {
        return this.f144675c;
    }

    public g e() {
        return this.f144673a;
    }

    public String f() {
        return this.f144679g;
    }

    public nd.d g() {
        return this.f144676d;
    }

    public nd.f h() {
        return this.f144677e;
    }

    public boolean i() {
        return this.f144682j;
    }
}
