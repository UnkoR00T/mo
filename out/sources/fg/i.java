package fg;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
final class i extends wg.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f62292b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(c cVar, Looper looper) {
        super(looper);
        this.f62292b = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.g(this.f62292b, message);
    }
}
