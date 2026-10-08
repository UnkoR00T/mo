package nh;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ah.e f136274a;

    public h(ah.e eVar) {
        this.f136274a = (ah.e) jg.s.l(eVar);
    }

    public LatLng a() {
        try {
            return this.f136274a.k();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public String b() {
        try {
            return this.f136274a.A();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public String c() {
        try {
            return this.f136274a.q();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public boolean d() {
        try {
            return this.f136274a.v1();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void e() {
        try {
            this.f136274a.B();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        try {
            return this.f136274a.Q(((h) obj).f136274a);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void f(float f15) {
        try {
            this.f136274a.d3(f15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void g(float f15, float f16) {
        try {
            this.f136274a.H2(f15, f16);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void h(boolean z15) {
        try {
            this.f136274a.D(z15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public int hashCode() {
        try {
            return this.f136274a.i();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void i(boolean z15) {
        try {
            this.f136274a.t0(z15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void j(b bVar) {
        try {
            if (bVar == null) {
                this.f136274a.t1(null);
            } else {
                this.f136274a.t1(bVar.a());
            }
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void k(float f15, float f16) {
        try {
            this.f136274a.G(f15, f16);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void l(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.f136274a.W(latLng);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void m(float f15) {
        try {
            this.f136274a.C(f15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void n(String str) {
        try {
            this.f136274a.K2(str);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void o(Object obj) {
        try {
            this.f136274a.y2(rg.d.o3(obj));
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void p(String str) {
        try {
            this.f136274a.I1(str);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void q(boolean z15) {
        try {
            this.f136274a.J(z15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void r(float f15) {
        try {
            this.f136274a.L(f15);
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }

    public void s() {
        try {
            this.f136274a.v0();
        } catch (RemoteException e15) {
            throw new o(e15);
        }
    }
}
