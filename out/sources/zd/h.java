package zd;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0.a<g<?>, Object> f234361b = new ve.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void g(g<T> gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // zd.f
    public void b(MessageDigest messageDigest) {
        for (int i15 = 0; i15 < this.f234361b.getSize(); i15++) {
            g(this.f234361b.f(i15), this.f234361b.k(i15), messageDigest);
        }
    }

    public <T> T c(g<T> gVar) {
        return this.f234361b.containsKey(gVar) ? (T) this.f234361b.get(gVar) : gVar.c();
    }

    public void d(h hVar) {
        this.f234361b.g(hVar.f234361b);
    }

    public h e(g<?> gVar) {
        this.f234361b.remove(gVar);
        return this;
    }

    @Override // zd.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f234361b.equals(((h) obj).f234361b);
        }
        return false;
    }

    public <T> h f(g<T> gVar, T t15) {
        this.f234361b.put(gVar, t15);
        return this;
    }

    @Override // zd.f
    public int hashCode() {
        return this.f234361b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f234361b + '}';
    }
}
