package androidx.compose.ui.platform;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/b;", "view", "Landroidx/lifecycle/j;", "lifecycle", "Lkotlin/Function0;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/b;Landroidx/lifecycle/j;)Ler/a;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e3 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.a<oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.j f10496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.n f10497c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.p016lifecycle.j jVar, androidx.p016lifecycle.n nVar) {
            super(0);
            this.f10496b = jVar;
            this.f10497c = nVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            c();
            return oq.i0.f148189a;
        }

        public final void c() {
            this.f10496b.d(this.f10497c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final er.a<oq.i0> c(final b bVar, androidx.p016lifecycle.j jVar) {
        if (jVar.getState().compareTo(androidx.lifecycle.j.b.DESTROYED) > 0) {
            androidx.p016lifecycle.n nVar = new androidx.p016lifecycle.n() { // from class: androidx.compose.ui.platform.d3
                @Override // androidx.p016lifecycle.n
                public final void m(androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
                    e3.d(bVar, qVar, aVar);
                }
            };
            jVar.a(nVar);
            return new a(jVar, nVar);
        }
        throw new IllegalStateException(("Cannot configure " + bVar + " to disposeComposition at Lifecycle ON_DESTROY: " + jVar + "is already destroyed").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(b bVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        if (aVar == androidx.lifecycle.j.a.ON_DESTROY) {
            bVar.h();
        }
    }
}
