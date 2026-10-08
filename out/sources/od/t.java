package od;

import fd.a0;

/* JADX INFO: loaded from: classes3.dex */
public class t implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f144800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f144801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd.b f144802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nd.b f144803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nd.b f144804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f144805f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a e(int i15) {
            if (i15 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i15 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i15);
        }
    }

    public t(String str, a aVar, nd.b bVar, nd.b bVar2, nd.b bVar3, boolean z15) {
        this.f144800a = str;
        this.f144801b = aVar;
        this.f144802c = bVar;
        this.f144803d = bVar2;
        this.f144804e = bVar3;
        this.f144805f = z15;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return new hd.u(bVar, this);
    }

    public nd.b b() {
        return this.f144803d;
    }

    public String c() {
        return this.f144800a;
    }

    public nd.b d() {
        return this.f144804e;
    }

    public nd.b e() {
        return this.f144802c;
    }

    public a f() {
        return this.f144801b;
    }

    public boolean g() {
        return this.f144805f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f144802c + ", end: " + this.f144803d + ", offset: " + this.f144804e + "}";
    }
}
