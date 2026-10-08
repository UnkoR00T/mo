package vj;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes4.dex */
final class g extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ vh.m f207105a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, Handler handler, vh.m mVar) {
        super(handler);
        this.f207105a = mVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i15, Bundle bundle) {
        this.f207105a.e(null);
    }
}
