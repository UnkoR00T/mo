package ym;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import eh.ca;
import eh.de;
import eh.he;
import eh.je;
import eh.le;
import eh.oe;
import eh.qd;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f227879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xm.e f227880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f227881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f227882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f227883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qd f227884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private le f227885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private le f227886h;

    b(Context context, xm.e eVar, qd qdVar) {
        this.f227879a = context;
        this.f227880b = eVar;
        this.f227884f = qdVar;
    }

    static boolean a(Context context) {
        return DynamiteModule.a(context, "com.google.mlkit.dynamite.face") > 0;
    }

    private final void e() {
        if (this.f227880b.c() != 2) {
            if (this.f227886h == null) {
                this.f227886h = f(new he(this.f227880b.e(), this.f227880b.d(), this.f227880b.b(), 1, this.f227880b.g(), this.f227880b.a()));
                return;
            }
            return;
        }
        if (this.f227885g == null) {
            this.f227885g = f(new he(this.f227880b.e(), 1, 1, 2, false, this.f227880b.a()));
        }
        if ((this.f227880b.d() == 2 || this.f227880b.b() == 2 || this.f227880b.e() == 2) && this.f227886h == null) {
            this.f227886h = f(new he(this.f227880b.e(), this.f227880b.d(), this.f227880b.b(), 1, this.f227880b.g(), this.f227880b.a()));
        }
    }

    private final le f(he heVar) {
        return this.f227882d ? d(DynamiteModule.f29075c, "com.google.mlkit.dynamite.face", "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", heVar) : d(DynamiteModule.f29074b, "com.google.android.gms.vision.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", heVar);
    }

    private static List g(le leVar, vm.a aVar) throws lm.a {
        if (aVar.h() == -1) {
            aVar = vm.a.b(wm.c.f().d(aVar, false), aVar.m(), aVar.i(), aVar.l(), 17);
        }
        try {
            List listO3 = leVar.o3(wm.d.b().a(aVar), new de(aVar.h(), aVar.m(), aVar.i(), wm.b.a(aVar.l()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listO3.iterator();
            while (it.hasNext()) {
                arrayList.add(new xm.a((je) it.next(), aVar.g()));
            }
            return arrayList;
        } catch (RemoteException e15) {
            throw new lm.a("Failed to run face detector.", 13, e15);
        }
    }

    @Override // ym.c
    public final Pair b(vm.a aVar) throws lm.a {
        List listG;
        if (this.f227886h == null && this.f227885g == null) {
            c();
        }
        if (!this.f227881c) {
            try {
                le leVar = this.f227886h;
                if (leVar != null) {
                    leVar.d();
                }
                le leVar2 = this.f227885g;
                if (leVar2 != null) {
                    leVar2.d();
                }
                this.f227881c = true;
            } catch (RemoteException e15) {
                throw new lm.a("Failed to init face detector.", 13, e15);
            }
        }
        le leVar3 = this.f227886h;
        List listG2 = null;
        if (leVar3 != null) {
            listG = g(leVar3, aVar);
            if (!this.f227880b.g()) {
                i.m(listG);
            }
        } else {
            listG = null;
        }
        le leVar4 = this.f227885g;
        if (leVar4 != null) {
            listG2 = g(leVar4, aVar);
            i.m(listG2);
        }
        return new Pair(listG, listG2);
    }

    @Override // ym.c
    public final boolean c() throws lm.a {
        if (this.f227886h != null || this.f227885g != null) {
            return this.f227882d;
        }
        if (DynamiteModule.a(this.f227879a, "com.google.mlkit.dynamite.face") > 0) {
            this.f227882d = true;
            try {
                e();
            } catch (RemoteException e15) {
                throw new lm.a("Failed to create thick face detector.", 13, e15);
            } catch (DynamiteModule.a e16) {
                throw new lm.a("Failed to load the bundled face module.", 13, e16);
            }
        } else {
            this.f227882d = false;
            try {
                e();
            } catch (RemoteException e17) {
                k.c(this.f227884f, this.f227882d, ca.OPTIONAL_MODULE_INIT_ERROR);
                throw new lm.a("Failed to create thin face detector.", 13, e17);
            } catch (DynamiteModule.a e18) {
                if (!this.f227883e) {
                    pm.m.c(this.f227879a, "face");
                    this.f227883e = true;
                }
                k.c(this.f227884f, this.f227882d, ca.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new lm.a("Waiting for the face module to be downloaded. Please wait.", 14, e18);
            }
        }
        k.c(this.f227884f, this.f227882d, ca.NO_ERROR);
        return this.f227882d;
    }

    final le d(DynamiteModule.b bVar, String str, String str2, he heVar) {
        return oe.l3(DynamiteModule.e(this.f227879a, bVar, str).d(str2)).I0(rg.d.o3(this.f227879a), heVar);
    }

    @Override // ym.c
    public final void zzb() {
        try {
            le leVar = this.f227886h;
            if (leVar != null) {
                leVar.f();
                this.f227886h = null;
            }
            le leVar2 = this.f227885g;
            if (leVar2 != null) {
                leVar2.f();
                this.f227885g = null;
            }
        } catch (RemoteException e15) {
            c2.f("DecoupledFaceDelegate", "Failed to release face detector.", e15);
        }
        this.f227881c = false;
    }
}
