package be;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
final class x implements zd.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ve.h<Class<?>, byte[]> f18829j = new ve.h<>(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce.b f18830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.f f18831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.f f18832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f18834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f18835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final zd.h f18836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final zd.l<?> f18837i;

    x(ce.b bVar, zd.f fVar, zd.f fVar2, int i15, int i16, zd.l<?> lVar, Class<?> cls, zd.h hVar) {
        this.f18830b = bVar;
        this.f18831c = fVar;
        this.f18832d = fVar2;
        this.f18833e = i15;
        this.f18834f = i16;
        this.f18837i = lVar;
        this.f18835g = cls;
        this.f18836h = hVar;
    }

    private byte[] c() {
        ve.h<Class<?>, byte[]> hVar = f18829j;
        byte[] bArrG = hVar.g(this.f18835g);
        if (bArrG != null) {
            return bArrG;
        }
        byte[] bytes = this.f18835g.getName().getBytes(zd.f.f234355a);
        hVar.k(this.f18835g, bytes);
        return bytes;
    }

    @Override // zd.f
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f18830b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f18833e).putInt(this.f18834f).array();
        this.f18832d.b(messageDigest);
        this.f18831c.b(messageDigest);
        messageDigest.update(bArr);
        zd.l<?> lVar = this.f18837i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f18836h.b(messageDigest);
        messageDigest.update(c());
        this.f18830b.put(bArr);
    }

    @Override // zd.f
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f18834f == xVar.f18834f && this.f18833e == xVar.f18833e && ve.l.d(this.f18837i, xVar.f18837i) && this.f18835g.equals(xVar.f18835g) && this.f18831c.equals(xVar.f18831c) && this.f18832d.equals(xVar.f18832d) && this.f18836h.equals(xVar.f18836h)) {
                return true;
            }
        }
        return false;
    }

    @Override // zd.f
    public int hashCode() {
        int iHashCode = (((((this.f18831c.hashCode() * 31) + this.f18832d.hashCode()) * 31) + this.f18833e) * 31) + this.f18834f;
        zd.l<?> lVar = this.f18837i;
        if (lVar != null) {
            iHashCode = (iHashCode * 31) + lVar.hashCode();
        }
        return (((iHashCode * 31) + this.f18835g.hashCode()) * 31) + this.f18836h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f18831c + ", signature=" + this.f18832d + ", width=" + this.f18833e + ", height=" + this.f18834f + ", decodedResourceClass=" + this.f18835g + ", transformation='" + this.f18837i + "', options=" + this.f18836h + '}';
    }
}
