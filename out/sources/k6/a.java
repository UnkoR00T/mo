package k6;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f108655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f108656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f108657c;

    public a(int i15, p pVar, int i16) {
        this.f108655a = i15;
        this.f108656b = pVar;
        this.f108657c = i16;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f108655a);
        this.f108656b.d0(this.f108657c, bundle);
    }
}
