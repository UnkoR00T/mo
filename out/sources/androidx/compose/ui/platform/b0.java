package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/b0;", "Landroid/view/translation/ViewTranslationCallback;", "<init>", "()V", "Landroid/view/View;", "view", "", "onShowTranslation", "(Landroid/view/View;)Z", "onHideTranslation", "onClearTranslation", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b0 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f10407a = new b0();

    private b0() {
    }

    public boolean onClearTranslation(View view) {
        ((AndroidComposeView) view).getContentCaptureManager().s();
        return true;
    }

    public boolean onHideTranslation(View view) {
        ((AndroidComposeView) view).getContentCaptureManager().u();
        return true;
    }

    public boolean onShowTranslation(View view) {
        ((AndroidComposeView) view).getContentCaptureManager().y();
        return true;
    }
}
