package ue;

import java.security.MessageDigest;
import ve.k;
import zd.f;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f197803b;

    public d(Object obj) {
        this.f197803b = k.d(obj);
    }

    @Override // zd.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f197803b.toString().getBytes(f.f234355a));
    }

    @Override // zd.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f197803b.equals(((d) obj).f197803b);
        }
        return false;
    }

    @Override // zd.f
    public int hashCode() {
        return this.f197803b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f197803b + '}';
    }
}
