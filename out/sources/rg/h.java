package rg;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
final class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f173727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f173728b;

    h(Context context, Intent intent) {
        this.f173727a = context;
        this.f173728b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f173727a.startActivity(this.f173728b);
        } catch (ActivityNotFoundException e15) {
            c2.f("DeferredLifecycleHelper", "Failed to start resolution intent", e15);
        }
    }
}
