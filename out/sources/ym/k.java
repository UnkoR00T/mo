package ym;

import eh.ba;
import eh.ca;
import eh.da;
import eh.ea;
import eh.ed;
import eh.g9;
import eh.h9;
import eh.i9;
import eh.k9;
import eh.l9;
import eh.n9;
import eh.od;
import eh.qd;
import eh.td;
import eh.xa;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AtomicReference f227907a = new AtomicReference();

    public static n9 a(xm.e eVar) {
        k9 k9Var;
        h9 h9Var;
        l9 l9Var;
        i9 i9Var;
        g9 g9Var = new g9();
        int iD = eVar.d();
        if (iD != 1) {
            k9Var = iD != 2 ? k9.UNKNOWN_LANDMARKS : k9.ALL_LANDMARKS;
        } else {
            k9Var = k9.NO_LANDMARKS;
        }
        g9Var.d(k9Var);
        int iB = eVar.b();
        if (iB != 1) {
            h9Var = iB != 2 ? h9.UNKNOWN_CLASSIFICATIONS : h9.ALL_CLASSIFICATIONS;
        } else {
            h9Var = h9.NO_CLASSIFICATIONS;
        }
        g9Var.a(h9Var);
        int iE = eVar.e();
        if (iE != 1) {
            l9Var = iE != 2 ? l9.UNKNOWN_PERFORMANCE : l9.ACCURATE;
        } else {
            l9Var = l9.FAST;
        }
        g9Var.f(l9Var);
        int iC = eVar.c();
        if (iC != 1) {
            i9Var = iC != 2 ? i9.UNKNOWN_CONTOURS : i9.ALL_CONTOURS;
        } else {
            i9Var = i9.NO_CONTOURS;
        }
        g9Var.b(i9Var);
        g9Var.c(Boolean.valueOf(eVar.g()));
        g9Var.e(Float.valueOf(eVar.a()));
        return g9Var.k();
    }

    public static String b() {
        return true != d() ? "play-services-mlkit-face-detection" : "face-detection";
    }

    public static void c(qd qdVar, final boolean z15, final ca caVar) {
        qdVar.f(new od() { // from class: ym.j
            @Override // eh.od
            public final ed zza() {
                boolean z16 = z15;
                ca caVar2 = caVar;
                ea eaVar = new ea();
                eaVar.e(z16 ? ba.TYPE_THICK : ba.TYPE_THIN);
                xa xaVar = new xa();
                xaVar.b(caVar2);
                eaVar.h(xaVar.c());
                return td.e(eaVar);
            }
        }, da.ON_DEVICE_FACE_LOAD);
    }

    static boolean d() {
        AtomicReference atomicReference = f227907a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zA = b.a(pm.i.c().b());
        atomicReference.set(Boolean.valueOf(zA));
        return zA;
    }
}
