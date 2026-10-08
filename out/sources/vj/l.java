package vj;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class l extends k {
    l(m mVar, vh.m mVar2, String str) {
        super(mVar, new wj.i("OnRequestInstallCallback"), mVar2);
    }

    @Override // vj.k, wj.h
    public final void x(Bundle bundle) {
        super.x(bundle);
        this.f207111e.e(new e((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
