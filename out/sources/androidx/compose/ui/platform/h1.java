package androidx.compose.ui.platform;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/h1;", "Landroidx/compose/ui/platform/r2;", "Lv4/v0;", "textInputService", "<init>", "(Lv4/v0;)V", "Loq/i0;", "a", "()V", "c", "Lv4/v0;", "getTextInputService", "()Lv4/v0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h1 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v4.v0 textInputService;

    public h1(v4.v0 v0Var) {
        this.textInputService = v0Var;
    }

    @Override // androidx.compose.ui.platform.r2
    public void a() {
        this.textInputService.c();
    }

    @Override // androidx.compose.ui.platform.r2
    public void c() {
        this.textInputService.b();
    }
}
