package nh;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ah.v f136271a;

    public e(ah.v vVar) {
        this.f136271a = (ah.v) jg.s.l(vVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        try {
            return this.f136271a.y0(((e) obj).f136271a);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public int hashCode() {
        try {
            return this.f136271a.o();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }
}
