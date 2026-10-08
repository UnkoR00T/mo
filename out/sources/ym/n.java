package ym;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import eh.ca;
import eh.e4;
import eh.g6;
import eh.i8;
import eh.ka;
import eh.lb;
import eh.ne;
import eh.qd;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.List;
import jg.s;

/* JADX INFO: loaded from: classes4.dex */
final class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f227910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f227911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xm.e f227912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f227913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qd f227914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i8 f227915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i8 f227916g;

    n(Context context, xm.e eVar, qd qdVar) {
        this.f227911b = context;
        this.f227912c = eVar;
        this.f227913d = gg.e.f().a(context);
        this.f227914e = qdVar;
    }

    static int a(int i15) {
        if (i15 == 1) {
            return 0;
        }
        if (i15 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Invalid classification type: " + i15);
    }

    static int d(int i15) {
        if (i15 == 1) {
            return 0;
        }
        if (i15 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Invalid landmark type: " + i15);
    }

    private static int e(int i15) {
        if (i15 == 1) {
            return 0;
        }
        if (i15 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Invalid mode type: " + i15);
    }

    private final List f(i8 i8Var, vm.a aVar) throws lm.a {
        e4[] e4VarArrO3;
        try {
            ne neVar = new ne(aVar.m(), aVar.i(), 0, SystemClock.elapsedRealtime(), wm.b.a(aVar.l()));
            if (aVar.h() != 35 || this.f227913d < 201500000) {
                e4VarArrO3 = i8Var.o3(rg.d.o3(wm.c.f().d(aVar, false)), neVar);
            } else {
                Image.Plane[] planeArr = (Image.Plane[]) s.l(aVar.k());
                e4VarArrO3 = i8Var.p3(rg.d.o3(planeArr[0].getBuffer()), rg.d.o3(planeArr[1].getBuffer()), rg.d.o3(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), neVar);
            }
            ArrayList arrayList = new ArrayList();
            for (e4 e4Var : e4VarArrO3) {
                arrayList.add(new xm.a(e4Var, aVar.g()));
            }
            return arrayList;
        } catch (RemoteException e15) {
            throw new lm.a("Failed to detect with legacy face detector", 13, e15);
        }
    }

    @Override // ym.c
    public final Pair b(vm.a aVar) throws lm.a {
        List listF;
        if (this.f227915f == null && this.f227916g == null) {
            c();
        }
        i8 i8Var = this.f227915f;
        if (i8Var == null && this.f227916g == null) {
            throw new lm.a("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        List listF2 = null;
        if (i8Var != null) {
            listF = f(i8Var, aVar);
            if (!this.f227912c.g()) {
                i.m(listF);
            }
        } else {
            listF = null;
        }
        i8 i8Var2 = this.f227916g;
        if (i8Var2 != null) {
            listF2 = f(i8Var2, aVar);
            i.m(listF2);
        }
        return new Pair(listF, listF2);
    }

    @Override // ym.c
    public final boolean c() throws lm.a {
        if (this.f227915f != null || this.f227916g != null) {
            return false;
        }
        try {
            lb lbVarL3 = ka.l3(DynamiteModule.e(this.f227911b, DynamiteModule.f29074b, "com.google.android.gms.vision.dynamite").d("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            rg.b bVarO3 = rg.d.o3(this.f227911b);
            if (this.f227912c.c() == 2) {
                if (this.f227916g == null) {
                    this.f227916g = lbVarL3.l2(bVarO3, new g6(2, 2, 0, true, false, this.f227912c.a()));
                }
                if ((this.f227912c.d() == 2 || this.f227912c.b() == 2 || this.f227912c.e() == 2) && this.f227915f == null) {
                    this.f227915f = lbVarL3.l2(bVarO3, new g6(e(this.f227912c.e()), d(this.f227912c.d()), a(this.f227912c.b()), false, this.f227912c.g(), this.f227912c.a()));
                }
            } else if (this.f227915f == null) {
                this.f227915f = lbVarL3.l2(bVarO3, new g6(e(this.f227912c.e()), d(this.f227912c.d()), a(this.f227912c.b()), false, this.f227912c.g(), this.f227912c.a()));
            }
            if (this.f227915f == null && this.f227916g == null && !this.f227910a) {
                pm.m.c(this.f227911b, "barcode");
                this.f227910a = true;
            }
            k.c(this.f227914e, false, ca.NO_ERROR);
            return false;
        } catch (RemoteException e15) {
            throw new lm.a("Failed to create legacy face detector.", 13, e15);
        } catch (DynamiteModule.a e16) {
            throw new lm.a("Failed to load deprecated vision dynamite module.", 13, e16);
        }
    }

    @Override // ym.c
    public final void zzb() {
        i8 i8Var = this.f227915f;
        if (i8Var != null) {
            try {
                i8Var.c();
            } catch (RemoteException e15) {
                c2.f("LegacyFaceDelegate", "Failed to release legacy face detector.", e15);
            }
            this.f227915f = null;
        }
        i8 i8Var2 = this.f227916g;
        if (i8Var2 != null) {
            try {
                i8Var2.c();
            } catch (RemoteException e16) {
                c2.f("LegacyFaceDelegate", "Failed to release legacy face detector.", e16);
            }
            this.f227916g = null;
        }
    }
}
