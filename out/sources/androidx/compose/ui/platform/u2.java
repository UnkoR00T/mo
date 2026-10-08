package androidx.compose.ui.platform;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/u2;", "Lf3/m$c;", "Lg4/i1;", "", "tag", "<init>", "(Ljava/lang/String;)V", "Ln4/i0;", "Loq/i0;", "E2", "(Ln4/i0;)V", "r", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "n3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u2 extends f3.m.c implements g4.i1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private String tag;

    public u2(String str) {
        this.tag = str;
    }

    @Override // g4.i1
    public void E2(n4.i0 i0Var) {
        n4.f0.y0(i0Var, this.tag);
    }

    public final void n3(String str) {
        this.tag = str;
    }
}
