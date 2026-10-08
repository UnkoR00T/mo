package nh;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ah.h f136298a;

    public l(ah.h hVar) {
        this.f136298a = (ah.h) jg.s.l(hVar);
    }

    public void a() {
        try {
            this.f136298a.B();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void b(boolean z15) {
        try {
            this.f136298a.k3(z15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void c(int i15) {
        try {
            this.f136298a.E2(i15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void d(boolean z15) {
        try {
            this.f136298a.D(z15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void e(List<? extends List<LatLng>> list) {
        try {
            this.f136298a.m1(list);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        try {
            return this.f136298a.L0(((l) obj).f136298a);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void f(List<LatLng> list) {
        try {
            jg.s.m(list, "points must not be null.");
            this.f136298a.W0(list);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void g(int i15) {
        try {
            this.f136298a.t(i15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void h(int i15) {
        try {
            this.f136298a.K(i15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public int hashCode() {
        try {
            return this.f136298a.o();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void i(List<j> list) {
        try {
            this.f136298a.b0(list);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void j(float f15) {
        try {
            this.f136298a.C(f15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void k(Object obj) {
        try {
            this.f136298a.p2(rg.d.o3(obj));
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void l(boolean z15) {
        try {
            this.f136298a.b1(z15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void m(float f15) {
        try {
            this.f136298a.D0(f15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }
}
