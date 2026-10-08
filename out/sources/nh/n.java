package nh;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ah.k f136310a;

    public n(ah.k kVar) {
        this.f136310a = (ah.k) jg.s.l(kVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        try {
            return this.f136310a.L1(((n) obj).f136310a);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public int hashCode() {
        try {
            return this.f136310a.j();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }
}
