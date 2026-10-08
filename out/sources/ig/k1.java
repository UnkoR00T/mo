package ig;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class k1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i1 f92221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ l1 f92222b;

    k1(l1 l1Var, i1 i1Var) {
        Objects.requireNonNull(l1Var);
        this.f92222b = l1Var;
        this.f92221a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l1 l1Var = this.f92222b;
        if (l1Var.f92223b) {
            i1 i1Var = this.f92221a;
            gg.a aVarB = i1Var.b();
            if (aVarB.u()) {
                l1Var.f92198a.startActivityForResult(GoogleApiActivity.a(l1Var.b(), (PendingIntent) jg.s.l(aVarB.r()), i1Var.a(), false), 1);
                return;
            }
            Activity activityB = l1Var.b();
            int iM = aVarB.m();
            gg.d dVar = l1Var.f92226e;
            if (dVar.b(activityB, iM, null) != null) {
                dVar.r(l1Var.b(), l1Var.f92198a, aVarB.m(), 2, l1Var);
            } else if (aVarB.m() != 18) {
                l1Var.s(aVarB, i1Var.a());
            } else {
                dVar.v(l1Var.b().getApplicationContext(), new j1(this, dVar.u(l1Var.b(), l1Var)));
            }
        }
    }
}
