package jg;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
abstract class p0 extends w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f102533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f102534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f102535f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected p0(c cVar, int i15, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        Objects.requireNonNull(cVar);
        this.f102535f = cVar;
        this.f102533d = i15;
        this.f102534e = bundle;
    }

    @Override // jg.w0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        int i15 = this.f102533d;
        if (i15 != 0) {
            this.f102535f.T(1, null);
            Bundle bundle = this.f102534e;
            f(new gg.a(i15, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (e()) {
                return;
            }
            this.f102535f.T(1, null);
            f(new gg.a(8, null));
        }
    }

    protected abstract boolean e();

    protected abstract void f(gg.a aVar);
}
