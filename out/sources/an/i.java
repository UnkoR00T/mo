package an;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import fh.g6;
import fh.i8;
import fh.oe;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes4.dex */
final class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oe f7918b = new oe(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g6 f7920d;

    i(Context context) {
        this.f7917a = context;
    }

    @Override // an.q
    public final void a() {
        g6 g6Var = this.f7920d;
        if (g6Var != null) {
            try {
                g6Var.c();
            } catch (RemoteException e15) {
                c2.f("LegacyTextDelegate", "Failed to release legacy text recognizer.", e15);
            }
            this.f7920d = null;
        }
    }

    @Override // an.q
    public final zm.a b(vm.a aVar) throws lm.a {
        Bitmap bitmapE;
        int iA;
        if (this.f7920d == null) {
            zzb();
        }
        if (this.f7920d == null) {
            throw new lm.a("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
        if (aVar.h() == -1) {
            bitmapE = aVar.e();
            iA = wm.b.a(aVar.l());
        } else {
            bitmapE = wm.c.f().e(aVar);
            iA = 0;
        }
        int i15 = iA;
        try {
            return o.a(((g6) jg.s.l(this.f7920d)).o3(rg.d.o3(bitmapE), new fh.c2(aVar.m(), aVar.i(), 0, 0L, i15)), aVar.g());
        } catch (RemoteException e15) {
            throw new lm.a("Failed to run legacy text recognizer.", 13, e15);
        }
    }

    @Override // an.q
    public final void zzb() throws lm.a {
        if (this.f7920d != null) {
            return;
        }
        try {
            g6 g6VarT2 = i8.l3(DynamiteModule.e(this.f7917a, DynamiteModule.f29074b, "com.google.android.gms.vision.dynamite").d("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).T2(rg.d.o3(this.f7917a), this.f7918b);
            this.f7920d = g6VarT2;
            if (g6VarT2 != null || this.f7919c) {
                return;
            }
            pm.m.c(this.f7917a, "ocr");
            this.f7919c = true;
        } catch (RemoteException e15) {
            throw new lm.a("Failed to create legacy text recognizer.", 13, e15);
        } catch (DynamiteModule.a e16) {
            throw new lm.a("Failed to load deprecated vision dynamite module.", 13, e16);
        }
    }
}
