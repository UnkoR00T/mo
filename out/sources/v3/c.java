package v3;

import android.view.View;
import j6.l0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lv3/c;", "Lv3/a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lv3/b;", "hapticFeedbackType", "Loq/i0;", "a", "(I)V", "Landroid/view/View;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    public c(View view) {
        this.view = view;
    }

    @Override // v3.a
    public void a(int hapticFeedbackType) {
        int i15;
        b.Companion companion = b.INSTANCE;
        if (b.d(hapticFeedbackType, companion.a())) {
            i15 = 16;
        } else if (b.d(hapticFeedbackType, companion.b())) {
            i15 = 6;
        } else if (b.d(hapticFeedbackType, companion.c())) {
            i15 = 13;
        } else if (b.d(hapticFeedbackType, companion.d())) {
            i15 = 23;
        } else if (b.d(hapticFeedbackType, companion.e())) {
            i15 = 3;
        } else if (b.d(hapticFeedbackType, companion.f())) {
            i15 = 0;
        } else if (b.d(hapticFeedbackType, companion.g())) {
            i15 = 17;
        } else if (b.d(hapticFeedbackType, companion.h())) {
            i15 = 27;
        } else if (b.d(hapticFeedbackType, companion.i())) {
            i15 = 26;
        } else if (b.d(hapticFeedbackType, companion.j())) {
            i15 = 9;
        } else if (b.d(hapticFeedbackType, companion.k())) {
            i15 = 22;
        } else if (b.d(hapticFeedbackType, companion.l())) {
            i15 = 21;
        } else {
            i15 = b.d(hapticFeedbackType, companion.m()) ? 1 : -1;
        }
        l0.W(this.view, i15);
    }
}
