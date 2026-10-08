package lh;

import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mh.b f118201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f118202b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f118203c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private lh.k f118204d;

    public interface a {
        void a();

        void onCancel();
    }

    public interface b {
        View b(nh.h hVar);

        View e(nh.h hVar);
    }

    /* JADX INFO: renamed from: lh.c$c, reason: collision with other inner class name */
    public interface InterfaceC2868c {
        void a();
    }

    public interface d {
        void a();
    }

    public interface e {
        void a();
    }

    public interface f {
        void a(int i15);
    }

    public interface g {
        void a(nh.d dVar);
    }

    public interface h {
        void a(nh.e eVar);
    }

    public interface i {
        void a(nh.f fVar);

        void b();
    }

    public interface j {
        void f(nh.h hVar);
    }

    public interface k {
        void a(nh.h hVar);
    }

    public interface l {
        void g(nh.h hVar);
    }

    public interface m {
        void a(LatLng latLng);
    }

    public interface n {
        void a();
    }

    public interface o {
        void a(LatLng latLng);
    }

    public interface p {
        boolean d(nh.h hVar);
    }

    public interface q {
        void a(nh.h hVar);

        void c(nh.h hVar);

        void h(nh.h hVar);
    }

    public interface r {
        boolean a();
    }

    public interface s {
        void a(Location location);
    }

    public interface t {
        void a(nh.k kVar);
    }

    public interface u {
        void a(nh.l lVar);
    }

    public interface v {
        void a(nh.n nVar);
    }

    public c(mh.b bVar) {
        this.f118201a = (mh.b) jg.s.l(bVar);
    }

    public final void A(h hVar) {
        try {
            if (hVar == null) {
                this.f118201a.V(null);
            } else {
                this.f118201a.V(new c0(this, hVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void B(i iVar) {
        try {
            if (iVar == null) {
                this.f118201a.E0(null);
            } else {
                this.f118201a.E0(new a0(this, iVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void C(j jVar) {
        try {
            if (jVar == null) {
                this.f118201a.C0(null);
            } else {
                this.f118201a.C0(new lh.t(this, jVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void D(k kVar) {
        try {
            if (kVar == null) {
                this.f118201a.c3(null);
            } else {
                this.f118201a.c3(new lh.v(this, kVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void E(l lVar) {
        try {
            if (lVar == null) {
                this.f118201a.f1(null);
            } else {
                this.f118201a.f1(new lh.u(this, lVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void F(m mVar) {
        try {
            if (mVar == null) {
                this.f118201a.o2(null);
            } else {
                this.f118201a.o2(new m0(this, mVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public void G(n nVar) {
        try {
            if (nVar == null) {
                this.f118201a.g3(null);
            } else {
                this.f118201a.g3(new z(this, nVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void H(o oVar) {
        try {
            if (oVar == null) {
                this.f118201a.Z2(null);
            } else {
                this.f118201a.Z2(new lh.m(this, oVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void I(p pVar) {
        try {
            if (pVar == null) {
                this.f118201a.c1(null);
            } else {
                this.f118201a.c1(new lh.l(this, pVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void J(q qVar) {
        try {
            if (qVar == null) {
                this.f118201a.a2(null);
            } else {
                this.f118201a.a2(new lh.s(this, qVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void K(r rVar) {
        try {
            if (rVar == null) {
                this.f118201a.S(null);
            } else {
                this.f118201a.S(new x(this, rVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void L(s sVar) {
        try {
            if (sVar == null) {
                this.f118201a.e0(null);
            } else {
                this.f118201a.e0(new y(this, sVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void M(t tVar) {
        try {
            if (tVar == null) {
                this.f118201a.O0(null);
            } else {
                this.f118201a.O0(new g0(this, tVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void N(u uVar) {
        try {
            if (uVar == null) {
                this.f118201a.j0(null);
            } else {
                this.f118201a.j0(new e0(this, uVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void O(v vVar) {
        try {
            if (vVar == null) {
                this.f118201a.O2(null);
            } else {
                this.f118201a.O2(new f0(this, vVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void P(int i15, int i16, int i17, int i18) {
        try {
            this.f118201a.X1(i15, i16, i17, i18);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void Q(boolean z15) {
        try {
            this.f118201a.w2(z15);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void R() {
        try {
            this.f118201a.u1();
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final nh.h a(nh.i iVar) {
        try {
            jg.s.m(iVar, "MarkerOptions must not be null.");
            ah.e eVarH1 = this.f118201a.h1(iVar);
            if (eVarH1 != null) {
                return iVar.H0() == 1 ? new nh.a(eVarH1) : new nh.h(eVarH1);
            }
            return null;
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final nh.l b(nh.m mVar) {
        try {
            jg.s.m(mVar, "PolygonOptions must not be null");
            return new nh.l(this.f118201a.i3(mVar));
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void c(lh.a aVar, int i15, a aVar2) {
        try {
            jg.s.m(aVar, "CameraUpdate must not be null.");
            this.f118201a.P0(aVar.a(), i15, aVar2 == null ? null : new lh.n(aVar2));
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void d(lh.a aVar, a aVar2) {
        try {
            jg.s.m(aVar, "CameraUpdate must not be null.");
            this.f118201a.G1(aVar.a(), aVar2 == null ? null : new lh.n(aVar2));
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void e() {
        try {
            this.f118201a.clear();
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final CameraPosition f() {
        try {
            return this.f118201a.n0();
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final lh.j g() {
        try {
            return new lh.j(this.f118201a.v());
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final lh.k h() {
        try {
            if (this.f118204d == null) {
                this.f118204d = new lh.k(this.f118201a.M2());
            }
            return this.f118204d;
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void i(lh.a aVar) {
        try {
            jg.s.m(aVar, "CameraUpdate must not be null.");
            this.f118201a.r2(aVar.a());
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void j(boolean z15) {
        try {
            this.f118201a.H1(z15);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void k(String str) {
        try {
            this.f118201a.C1(str);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final boolean l(boolean z15) {
        try {
            return this.f118201a.N1(z15);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void m(b bVar) {
        try {
            if (bVar == null) {
                this.f118201a.V2(null);
            } else {
                this.f118201a.V2(new w(this, bVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public void n(LatLngBounds latLngBounds) {
        try {
            this.f118201a.O(latLngBounds);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void o(lh.d dVar) {
        try {
            if (dVar == null) {
                this.f118201a.z(null);
            } else {
                this.f118201a.z(new h0(this, dVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public void p(int i15) {
        try {
            this.f118201a.j1(i15);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public boolean q(nh.g gVar) {
        try {
            return this.f118201a.i1(gVar);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void r(int i15) {
        try {
            this.f118201a.N0(i15);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public void s(float f15) {
        try {
            this.f118201a.G0(f15);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public void t(float f15) {
        try {
            this.f118201a.x2(f15);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void u(boolean z15) {
        try {
            this.f118201a.a3(z15);
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void v(InterfaceC2868c interfaceC2868c) {
        try {
            if (interfaceC2868c == null) {
                this.f118201a.k0(null);
            } else {
                this.f118201a.k0(new l0(this, interfaceC2868c));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void w(d dVar) {
        try {
            if (dVar == null) {
                this.f118201a.C2(null);
            } else {
                this.f118201a.C2(new k0(this, dVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void x(e eVar) {
        try {
            if (eVar == null) {
                this.f118201a.v2(null);
            } else {
                this.f118201a.v2(new j0(this, eVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void y(f fVar) {
        try {
            if (fVar == null) {
                this.f118201a.x0(null);
            } else {
                this.f118201a.x0(new i0(this, fVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public final void z(g gVar) {
        try {
            if (gVar == null) {
                this.f118201a.J1(null);
            } else {
                this.f118201a.J1(new d0(this, gVar));
            }
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }
}
