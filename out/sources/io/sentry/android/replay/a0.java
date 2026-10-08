package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Landroid/view/Window;", "a", "(Landroid/view/View;)Landroid/view/Window;", "phoneWindow", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a0 {
    public static final Window a(View view) {
        return z.f94621a.d(view.getRootView());
    }
}
