package nh;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ah.b f136272a;

    public f(ah.b bVar) {
        s sVar = s.f136316a;
        this.f136272a = (ah.b) jg.s.m(bVar, "delegate");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            return this.f136272a.h2(((f) obj).f136272a);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public int hashCode() {
        try {
            return this.f136272a.f();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }
}
