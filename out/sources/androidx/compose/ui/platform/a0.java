package androidx.compose.ui.platform;

import android.view.View;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/a0;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lj3/h;", "transferData", "Lj3/b;", "dragShadowBuilder", "", "a", "(Landroid/view/View;Lj3/h;Lj3/b;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f10391a = new a0();

    private a0() {
    }

    public final boolean a(View view, j3.h transferData, j3.b dragShadowBuilder) {
        return view.startDragAndDrop(transferData.getClipData(), dragShadowBuilder, transferData.getLocalState(), transferData.getFlags());
    }
}
