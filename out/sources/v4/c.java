package v4;

import android.view.inputmethod.CursorAnchorInfo;
import n3.s2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv4/c;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Lm3/g;", "decorationBoxBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lm3/g;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f203629a = new c();

    private c() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, m3.g decorationBoxBounds) {
        return builder.setEditorBoundsInfo(x1.w.a().setEditorBounds(s2.c(decorationBoxBounds)).setHandwritingBounds(s2.c(decorationBoxBounds)).build());
    }
}
