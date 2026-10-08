package jg;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends p0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f102404g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c cVar, int i15, Bundle bundle) {
        super(cVar, i15, bundle);
        Objects.requireNonNull(cVar);
        this.f102404g = cVar;
    }

    @Override // jg.p0
    protected final boolean e() {
        this.f102404g.f102424p.d(gg.a.f72705f);
        return true;
    }

    @Override // jg.p0
    protected final void f(gg.a aVar) {
        c cVar = this.f102404g;
        if (cVar.q() && cVar.W()) {
            cVar.V(16);
        } else {
            cVar.f102424p.d(aVar);
            cVar.I(aVar);
        }
    }
}
