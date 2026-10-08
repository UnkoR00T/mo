package m0;

import o.p;

/* JADX INFO: loaded from: classes.dex */
final class a extends k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f121931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f121932b;

    a(int i15, p pVar) {
        this.f121931a = i15;
        if (pVar == null) {
            throw new NullPointerException("Null cameraIdentifier");
        }
        this.f121932b = pVar;
    }

    @Override // m0.k.a
    public p b() {
        return this.f121932b;
    }

    @Override // m0.k.a
    public int c() {
        return this.f121931a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k.a) {
            k.a aVar = (k.a) obj;
            if (this.f121931a == aVar.c() && this.f121932b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f121931a ^ 1000003) * 1000003) ^ this.f121932b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwnerHash=" + this.f121931a + ", cameraIdentifier=" + this.f121932b + "}";
    }
}
