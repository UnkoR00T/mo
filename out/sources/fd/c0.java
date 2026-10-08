package fd;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<b0> f61204a = new HashSet<>();

    c0() {
    }

    @SuppressLint({"DefaultLocale"})
    public boolean a(b0 b0Var, boolean z15) {
        if (!z15) {
            return this.f61204a.remove(b0Var);
        }
        if (Build.VERSION.SDK_INT >= b0Var.f61203a) {
            return this.f61204a.add(b0Var);
        }
        td.e.c(String.format("%s is not supported pre SDK %d", b0Var.name(), Integer.valueOf(b0Var.f61203a)));
        return false;
    }

    public boolean b(b0 b0Var) {
        return this.f61204a.contains(b0Var);
    }
}
