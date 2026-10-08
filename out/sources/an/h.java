package an;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import fh.cl;
import fh.ie;
import fh.kk;
import fh.nk;
import fh.pk;
import fh.rk;
import fh.sk;
import fh.xj;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes4.dex */
final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zm.d f7912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xj f7915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private pk f7916f;

    h(Context context, zm.d dVar, xj xjVar) {
        this.f7911a = context;
        this.f7912b = dVar;
        this.f7915e = xjVar;
    }

    private static cl c(zm.d dVar, String str) {
        int i15 = 1;
        boolean z15 = (dVar instanceof g) && ((g) dVar).zza();
        String strB = dVar.b();
        String strI = dVar.i();
        switch (dVar.h()) {
            case 1:
                i15 = 2;
                break;
            case 2:
                i15 = 3;
                break;
            case 3:
                i15 = 4;
                break;
            case 4:
                i15 = 5;
                break;
            case 5:
                i15 = 6;
                break;
            case 6:
                i15 = 7;
                break;
            case 7:
                i15 = 8;
                break;
            case 8:
                i15 = 9;
                break;
        }
        return new cl(strB, strI, str, true, i15 - 1, dVar.f(), z15);
    }

    @Override // an.q
    public final void a() {
        pk pkVar = this.f7916f;
        if (pkVar != null) {
            try {
                pkVar.f();
            } catch (RemoteException e15) {
                c2.f("DecoupledTextDelegate", "Failed to release text recognizer ".concat(String.valueOf(this.f7912b.a())), e15);
            }
            this.f7916f = null;
        }
        this.f7913c = false;
    }

    @Override // an.q
    public final zm.a b(vm.a aVar) throws lm.a {
        if (this.f7916f == null) {
            zzb();
        }
        pk pkVar = (pk) jg.s.l(this.f7916f);
        if (!this.f7913c) {
            try {
                pkVar.d();
                this.f7913c = true;
            } catch (RemoteException e15) {
                throw new lm.a("Failed to init text recognizer ".concat(String.valueOf(this.f7912b.a())), 13, e15);
            }
        }
        try {
            return new zm.a(pkVar.o3(wm.d.b().a(aVar), new kk(aVar.h(), aVar.m(), aVar.i(), wm.b.a(aVar.l()), SystemClock.elapsedRealtime())), aVar.g());
        } catch (RemoteException e16) {
            throw new lm.a("Failed to run text recognizer ".concat(String.valueOf(this.f7912b.a())), 13, e16);
        }
    }

    @Override // an.q
    public final void zzb() throws lm.a {
        pk pkVarZ1;
        if (this.f7916f != null) {
            return;
        }
        try {
            zm.d dVar = this.f7912b;
            boolean z15 = dVar instanceof f;
            String strZza = z15 ? ((f) dVar).zza() : null;
            if (this.f7912b.c()) {
                pkVarZ1 = rk.l3(DynamiteModule.e(this.f7911a, DynamiteModule.f29075c, this.f7912b.e()).d("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).S1(rg.d.o3(this.f7911a), c(this.f7912b, strZza));
            } else if (z15) {
                pkVarZ1 = nk.l3(DynamiteModule.e(this.f7911a, DynamiteModule.f29074b, this.f7912b.e()).d("com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator")).U0(rg.d.o3(this.f7911a), null, c(this.f7912b, strZza));
            } else {
                sk skVarL3 = rk.l3(DynamiteModule.e(this.f7911a, DynamiteModule.f29074b, this.f7912b.e()).d("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"));
                pkVarZ1 = this.f7912b.h() == 1 ? skVarL3.z1(rg.d.o3(this.f7911a)) : skVarL3.S1(rg.d.o3(this.f7911a), c(this.f7912b, strZza));
            }
            this.f7916f = pkVarZ1;
            a.b(this.f7915e, this.f7912b.c(), ie.NO_ERROR);
        } catch (RemoteException e15) {
            a.b(this.f7915e, this.f7912b.c(), ie.OPTIONAL_MODULE_INIT_ERROR);
            throw new lm.a("Failed to create text recognizer ".concat(String.valueOf(this.f7912b.a())), 13, e15);
        } catch (DynamiteModule.a e16) {
            a.b(this.f7915e, this.f7912b.c(), ie.OPTIONAL_MODULE_NOT_AVAILABLE);
            if (this.f7912b.c()) {
                throw new lm.a(String.format("Failed to load text module %s. %s", this.f7912b.a(), e16.getMessage()), 13, e16);
            }
            if (!this.f7914d) {
                pm.m.e(this.f7911a, b.a(this.f7912b));
                this.f7914d = true;
            }
            throw new lm.a("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
    }
}
