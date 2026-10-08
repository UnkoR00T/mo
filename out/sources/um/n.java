package um;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import ch.cm;
import ch.em;
import ch.fm;
import ch.i1;
import ch.lm;
import ch.nk;
import ch.sl;
import ch.ul;
import ch.xe;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg.s;

/* JADX INFO: loaded from: classes4.dex */
final class n implements l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final i1 f199046h = i1.n("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f199047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f199048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f199049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f199050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rm.b f199051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nk f199052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private cm f199053g;

    n(Context context, rm.b bVar, nk nkVar) {
        this.f199050d = context;
        this.f199051e = bVar;
        this.f199052f = nkVar;
    }

    static boolean c(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override // um.l
    public final boolean a() throws lm.a {
        if (this.f199053g != null) {
            return this.f199048b;
        }
        if (c(this.f199050d)) {
            this.f199048b = true;
            try {
                this.f199053g = d(DynamiteModule.f29075c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e15) {
                throw new lm.a("Failed to create thick barcode scanner.", 13, e15);
            } catch (DynamiteModule.a e16) {
                throw new lm.a("Failed to load the bundled barcode module.", 13, e16);
            }
        } else {
            this.f199048b = false;
            if (!pm.m.a(this.f199050d, f199046h)) {
                if (!this.f199049c) {
                    pm.m.d(this.f199050d, i1.n("barcode", "tflite_dynamite"));
                    this.f199049c = true;
                }
                b.e(this.f199052f, xe.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new lm.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f199053g = d(DynamiteModule.f29074b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.a e17) {
                b.e(this.f199052f, xe.OPTIONAL_MODULE_INIT_ERROR);
                throw new lm.a("Failed to create thin barcode scanner.", 13, e17);
            }
        }
        b.e(this.f199052f, xe.NO_ERROR);
        return this.f199048b;
    }

    @Override // um.l
    public final List b(vm.a aVar) throws lm.a {
        if (this.f199053g == null) {
            a();
        }
        cm cmVar = (cm) s.l(this.f199053g);
        if (!this.f199047a) {
            try {
                cmVar.d();
                this.f199047a = true;
            } catch (RemoteException e15) {
                throw new lm.a("Failed to init barcode scanner.", 13, e15);
            }
        }
        int iM = aVar.m();
        if (aVar.h() == 35) {
            iM = ((Image.Plane[]) s.l(aVar.k()))[0].getRowStride();
        }
        try {
            List listO3 = cmVar.o3(wm.d.b().a(aVar), new lm(aVar.h(), iM, aVar.i(), wm.b.a(aVar.l()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listO3.iterator();
            while (it.hasNext()) {
                arrayList.add(new sm.a(new m((sl) it.next()), aVar.g()));
            }
            return arrayList;
        } catch (RemoteException e16) {
            throw new lm.a("Failed to run barcode scanner.", 13, e16);
        }
    }

    final cm d(DynamiteModule.b bVar, String str, String str2) {
        boolean z15;
        fm fmVarL3 = em.l3(DynamiteModule.e(this.f199050d, bVar, str).d(str2));
        rm.b bVar2 = this.f199051e;
        rg.b bVarO3 = rg.d.o3(this.f199050d);
        int iA = bVar2.a();
        if (bVar2.d()) {
            z15 = true;
        } else {
            this.f199051e.b();
            z15 = false;
        }
        return fmVarL3.i2(bVarO3, new ul(iA, z15));
    }

    @Override // um.l
    public final void zzb() {
        cm cmVar = this.f199053g;
        if (cmVar != null) {
            try {
                cmVar.f();
            } catch (RemoteException e15) {
                c2.f("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e15);
            }
            this.f199053g = null;
            this.f199047a = false;
        }
    }
}
