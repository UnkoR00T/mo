package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye.c f6137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f6138b;

    public h(ye.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f6137a = cVar;
        this.f6138b = bArr;
    }

    public byte[] a() {
        return this.f6138b;
    }

    public ye.c b() {
        return this.f6137a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f6137a.equals(hVar.f6137a)) {
            return Arrays.equals(this.f6138b, hVar.f6138b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6137a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6138b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f6137a + ", bytes=[...]}";
    }
}
