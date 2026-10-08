package x1;

import android.view.inputmethod.EditorInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx1/h0;", "", "<init>", "()V", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "Loq/i0;", "a", "(Landroid/view/inputmethod/EditorInfo;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f216348a = new h0();

    private h0() {
    }

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(pq.v.q(a0.a(), c0.a(), d0.a(), b0.a(), e0.a(), f0.a(), g0.a()));
        editorInfo.setSupportedHandwritingGesturePreviews(pq.e1.i(a0.a(), c0.a(), d0.a(), b0.a()));
    }
}
