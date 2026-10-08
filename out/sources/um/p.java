package um;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import ch.nk;
import ch.xe;
import ch.zh;
import com.google.android.gms.dynamite.DynamiteModule;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.List;
import jg.s;

/* JADX INFO: loaded from: classes4.dex */
final class p implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f199055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f199056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ch.i f199057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nk f199058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ch.k f199059e;

    p(Context context, rm.b bVar, nk nkVar) {
        ch.i iVar = new ch.i();
        this.f199057c = iVar;
        this.f199056b = context;
        iVar.f25942a = bVar.a();
        this.f199058d = nkVar;
    }

    @Override // um.l
    public final boolean a() throws lm.a {
        if (this.f199059e != null) {
            return false;
        }
        try {
            ch.k kVarP = ch.m.l3(DynamiteModule.e(this.f199056b, DynamiteModule.f29074b, "com.google.android.gms.vision.dynamite").d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).P(rg.d.o3(this.f199056b), this.f199057c);
            this.f199059e = kVarP;
            if (kVarP == null && !this.f199055a) {
                pm.m.c(this.f199056b, "barcode");
                this.f199055a = true;
                b.e(this.f199058d, xe.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new lm.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            b.e(this.f199058d, xe.NO_ERROR);
            return false;
        } catch (RemoteException e15) {
            throw new lm.a("Failed to create legacy barcode detector.", 13, e15);
        } catch (DynamiteModule.a e16) {
            throw new lm.a("Failed to load deprecated vision dynamite module.", 13, e16);
        }
    }

    @Override // um.l
    public final List b(vm.a aVar) throws lm.a {
        zh[] zhVarArrP3;
        if (this.f199059e == null) {
            a();
        }
        ch.k kVar = this.f199059e;
        if (kVar == null) {
            throw new lm.a("Error initializing the legacy barcode scanner.", 14);
        }
        ch.k kVar2 = (ch.k) s.l(kVar);
        ch.o oVar = new ch.o(aVar.m(), aVar.i(), 0, 0L, wm.b.a(aVar.l()));
        try {
            int iH = aVar.h();
            if (iH == -1) {
                zhVarArrP3 = kVar2.p3(rg.d.o3(aVar.e()), oVar);
            } else if (iH == 17) {
                zhVarArrP3 = kVar2.o3(rg.d.o3(aVar.f()), oVar);
            } else if (iH == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) s.l(aVar.k());
                oVar.f26201a = planeArr[0].getRowStride();
                zhVarArrP3 = kVar2.o3(rg.d.o3(planeArr[0].getBuffer()), oVar);
            } else {
                if (iH != 842094169) {
                    throw new lm.a("Unsupported image format: " + aVar.h(), 3);
                }
                zhVarArrP3 = kVar2.o3(rg.d.o3(wm.c.f().d(aVar, false)), oVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zh zhVar : zhVarArrP3) {
                arrayList.add(new sm.a(new o(zhVar), aVar.g()));
            }
            return arrayList;
        } catch (RemoteException e15) {
            throw new lm.a("Failed to detect with legacy barcode detector", 13, e15);
        }
    }

    @Override // um.l
    public final void zzb() {
        ch.k kVar = this.f199059e;
        if (kVar != null) {
            try {
                kVar.c();
            } catch (RemoteException e15) {
                c2.f("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e15);
            }
            this.f199059e = null;
        }
    }
}
