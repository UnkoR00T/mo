package jg;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
final class f0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f102465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ig.i f102466b;

    f0(Intent intent, ig.i iVar, int i15) {
        this.f102465a = intent;
        this.f102466b = iVar;
    }

    @Override // jg.g0
    public final void a() {
        Intent intent = this.f102465a;
        if (intent != null) {
            this.f102466b.startActivityForResult(intent, 2);
        }
    }
}
