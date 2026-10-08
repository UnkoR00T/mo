package be;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class n implements zd.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f18783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class<?> f18786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class<?> f18787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zd.f f18788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<Class<?>, zd.l<?>> f18789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final zd.h f18790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f18791j;

    n(Object obj, zd.f fVar, int i15, int i16, Map<Class<?>, zd.l<?>> map, Class<?> cls, Class<?> cls2, zd.h hVar) {
        this.f18783b = ve.k.d(obj);
        this.f18788g = (zd.f) ve.k.e(fVar, "Signature must not be null");
        this.f18784c = i15;
        this.f18785d = i16;
        this.f18789h = (Map) ve.k.d(map);
        this.f18786e = (Class) ve.k.e(cls, "Resource class must not be null");
        this.f18787f = (Class) ve.k.e(cls2, "Transcode class must not be null");
        this.f18790i = (zd.h) ve.k.d(hVar);
    }

    @Override // zd.f
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // zd.f
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f18783b.equals(nVar.f18783b) && this.f18788g.equals(nVar.f18788g) && this.f18785d == nVar.f18785d && this.f18784c == nVar.f18784c && this.f18789h.equals(nVar.f18789h) && this.f18786e.equals(nVar.f18786e) && this.f18787f.equals(nVar.f18787f) && this.f18790i.equals(nVar.f18790i)) {
                return true;
            }
        }
        return false;
    }

    @Override // zd.f
    public int hashCode() {
        if (this.f18791j == 0) {
            int iHashCode = this.f18783b.hashCode();
            this.f18791j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f18788g.hashCode()) * 31) + this.f18784c) * 31) + this.f18785d;
            this.f18791j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f18789h.hashCode();
            this.f18791j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f18786e.hashCode();
            this.f18791j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f18787f.hashCode();
            this.f18791j = iHashCode5;
            this.f18791j = (iHashCode5 * 31) + this.f18790i.hashCode();
        }
        return this.f18791j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f18783b + ", width=" + this.f18784c + ", height=" + this.f18785d + ", resourceClass=" + this.f18786e + ", transcodeClass=" + this.f18787f + ", signature=" + this.f18788g + ", hashCode=" + this.f18791j + ", transformations=" + this.f18789h + ", options=" + this.f18790i + '}';
    }
}
