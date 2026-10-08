package jg;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
final class e0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f102456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f102457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f102458c;

    e0(Intent intent, Activity activity, int i15) {
        this.f102456a = intent;
        this.f102457b = activity;
        this.f102458c = i15;
    }

    @Override // jg.g0
    public final void a() {
        Intent intent = this.f102456a;
        if (intent != null) {
            this.f102457b.startActivityForResult(intent, this.f102458c);
        }
    }
}
