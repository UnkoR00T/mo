package rg;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f173725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f173726b;

    g(a aVar, Bundle bundle) {
        this.f173725a = bundle;
        Objects.requireNonNull(aVar);
        this.f173726b = aVar;
    }

    @Override // rg.k
    public final int a() {
        return 1;
    }

    @Override // rg.k
    public final void b(c cVar) {
        this.f173726b.k().w(this.f173725a);
    }
}
