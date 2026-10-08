package ig;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f92260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f92261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ q1 f92262c;

    p1(q1 q1Var, h hVar, String str) {
        this.f92260a = hVar;
        this.f92261b = str;
        Objects.requireNonNull(q1Var);
        this.f92262c = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        q1 q1Var = this.f92262c;
        if (q1Var.k() > 0) {
            h hVar = this.f92260a;
            if (q1Var.l() != null) {
                bundle = q1Var.l().getBundle(this.f92261b);
            } else {
                bundle = null;
            }
            hVar.f(bundle);
        }
        if (q1Var.k() >= 2) {
            this.f92260a.j();
        }
        if (q1Var.k() >= 3) {
            this.f92260a.h();
        }
        if (q1Var.k() >= 4) {
            this.f92260a.k();
        }
        if (q1Var.k() >= 5) {
            this.f92260a.g();
        }
    }
}
