package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0018\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/l;", "Landroidx/compose/ui/platform/b1;", "Landroidx/compose/ui/platform/m;", "androidClipboardManager", "<init>", "(Landroidx/compose/ui/platform/m;)V", "Landroidx/compose/ui/platform/a1;", "a", "(Ltq/e;)Ljava/lang/Object;", "clipEntry", "Loq/i0;", "b", "(Landroidx/compose/ui/platform/a1;Ltq/e;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/m;", "Landroid/content/ClipboardManager;", "Landroidx/compose/ui/platform/NativeClipboard;", "c", "()Landroid/content/ClipboardManager;", "nativeClipboard", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m androidClipboardManager;

    public l(m mVar) {
        this.androidClipboardManager = mVar;
    }

    @Override // androidx.compose.ui.platform.b1
    public Object a(tq.e<? super a1> eVar) {
        return this.androidClipboardManager.a();
    }

    @Override // androidx.compose.ui.platform.b1
    public Object b(a1 a1Var, tq.e<? super oq.i0> eVar) {
        this.androidClipboardManager.e(a1Var);
        return oq.i0.f148189a;
    }

    @Override // androidx.compose.ui.platform.b1
    public ClipboardManager c() {
        return this.androidClipboardManager.c();
    }
}
