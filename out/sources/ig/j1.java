package ig;

import android.app.Dialog;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class j1 extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f92218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k1 f92219b;

    j1(k1 k1Var, Dialog dialog) {
        this.f92218a = dialog;
        Objects.requireNonNull(k1Var);
        this.f92219b = k1Var;
    }

    @Override // ig.l0
    public final void a() {
        this.f92219b.f92222b.r();
        Dialog dialog = this.f92218a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
