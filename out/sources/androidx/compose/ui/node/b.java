package androidx.compose.ui.node;

import fr.w;
import g4.m1;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/a;", "", "e", "(Landroidx/compose/ui/node/a;)Z", "androidx/compose/ui/node/b$a", "a", "Landroidx/compose/ui/node/b$a;", "DetachedModifierLocalReadScope", "Lkotlin/Function1;", "Loq/i0;", "b", "Ler/l;", "onDrawCacheReadsChanged", "c", "updateModifierLocalConsumer", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f10047a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final er.l<androidx.compose.ui.node.a, i0> f10048b = C0217b.f10050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final er.l<androidx.compose.ui.node.a, i0> f10049c = c.f10051b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/b$a", "Lf4/k;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements f4.k {
        a() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/a;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/a;)V"}, k = 3, mv = {2, 1, 0})
    static final class C0217b extends w implements er.l<androidx.compose.ui.node.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0217b f10050b = new C0217b();

        C0217b() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(androidx.compose.ui.node.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(androidx.compose.ui.node.a aVar) {
            aVar.r3();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/a;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/a;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements er.l<androidx.compose.ui.node.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f10051b = new c();

        c() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(androidx.compose.ui.node.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(androidx.compose.ui.node.a aVar) {
            aVar.v3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(androidx.compose.ui.node.a aVar) {
        return ((m1) g4.h.s(aVar).getNodes().getTail()).getAttachHasBeenRun();
    }
}
