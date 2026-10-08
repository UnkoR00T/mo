package nh;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ah.s f136270a;

    public d(ah.s sVar) {
        this.f136270a = (ah.s) jg.s.l(sVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        try {
            return this.f136270a.Y1(((d) obj).f136270a);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public final int hashCode() {
        try {
            return this.f136270a.o();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }
}
