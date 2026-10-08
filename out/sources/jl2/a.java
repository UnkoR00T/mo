package jl2;

import mu.a0;
import mu.h0;
import oq.i0;
import p071kotlin.Metadata;
import sq0.BENationalCourtRegisterEntry;
import tq.e;
import uq.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0003R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ljl2/a;", "Lll2/a;", "<init>", "()V", "Lmu/a0;", "Lsq0/h;", "l0", "()Lmu/a0;", "entry", "Loq/i0;", "X", "(Lsq0/h;Ltq/e;)Ljava/lang/Object;", "clear", "a", "Lmu/a0;", "subscriptionFlow", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ll2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a0<BENationalCourtRegisterEntry> subscriptionFlow = h0.b(1, 0, null, 6, null);

    @Override // ll2.a
    public Object X(BENationalCourtRegisterEntry bENationalCourtRegisterEntry, e<? super i0> eVar) {
        Object objF = this.subscriptionFlow.F(bENationalCourtRegisterEntry, eVar);
        return objF == b.e() ? objF : i0.f148189a;
    }

    @Override // wy.c
    public void clear() {
        this.subscriptionFlow = h0.b(1, 0, null, 6, null);
    }

    @Override // ll2.a
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public a0<BENationalCourtRegisterEntry> f0() {
        return this.subscriptionFlow;
    }
}
