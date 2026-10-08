package od;

import fd.a0;

/* JADX INFO: loaded from: classes3.dex */
public class r implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f144776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f144777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd.h f144778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f144779d;

    public r(String str, int i15, nd.h hVar, boolean z15) {
        this.f144776a = str;
        this.f144777b = i15;
        this.f144778c = hVar;
        this.f144779d = z15;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return new hd.r(a0Var, bVar, this);
    }

    public String b() {
        return this.f144776a;
    }

    public nd.h c() {
        return this.f144778c;
    }

    public boolean d() {
        return this.f144779d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f144776a + ", index=" + this.f144777b + '}';
    }
}
