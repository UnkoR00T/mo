package ig;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l1 extends h implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile boolean f92223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AtomicReference f92224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f92225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final gg.d f92226e;

    l1(i iVar, gg.d dVar) {
        super(iVar);
        this.f92224c = new AtomicReference(null);
        this.f92225d = new vg.f(Looper.getMainLooper());
        this.f92226e = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void r() {
        this.f92224c.set(null);
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void s(gg.a aVar, int i15) {
        this.f92224c.set(null);
        o(aVar, i15);
    }

    private static final int n(i1 i1Var) {
        if (i1Var == null) {
            return -1;
        }
        return i1Var.a();
    }

    @Override // ig.h
    public final void e(int i15, int i16, Intent intent) {
        i1 i1Var = (i1) this.f92224c.get();
        if (i15 != 1) {
            if (i15 == 2) {
                int iG = this.f92226e.g(b());
                if (iG == 0) {
                    r();
                    return;
                } else {
                    if (i1Var == null) {
                        return;
                    }
                    if (i1Var.b().m() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i16 == -1) {
            r();
            return;
        } else if (i16 == 0) {
            if (i1Var != null) {
                s(new gg.a(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, i1Var.b().toString()), n(i1Var));
                return;
            }
            return;
        }
        if (i1Var != null) {
            s(i1Var.b(), i1Var.a());
        }
    }

    @Override // ig.h
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f92224c.set(bundle.getBoolean("resolving_error", false) ? new i1(new gg.a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // ig.h
    public final void i(Bundle bundle) {
        super.i(bundle);
        i1 i1Var = (i1) this.f92224c.get();
        if (i1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", i1Var.a());
        bundle.putInt("failed_status", i1Var.b().m());
        bundle.putParcelable("failed_resolution", i1Var.b().r());
    }

    @Override // ig.h
    public void j() {
        super.j();
        this.f92223b = true;
    }

    @Override // ig.h
    public void k() {
        super.k();
        this.f92223b = false;
    }

    protected abstract void o(gg.a aVar, int i15);

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        s(new gg.a(13, null), n((i1) this.f92224c.get()));
    }

    protected abstract void p();

    public final void q(gg.a aVar, int i15) {
        i1 i1Var = new i1(aVar, i15);
        if (androidx.camera.view.i.a(this.f92224c, null, i1Var)) {
            this.f92225d.post(new k1(this, i1Var));
        }
    }
}
