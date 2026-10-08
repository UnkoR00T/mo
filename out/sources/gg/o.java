package gg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import io.sentry.android.core.c2;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"HandlerLeak"})
final class o extends vg.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f72745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f72746c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        Objects.requireNonNull(dVar);
        this.f72746c = dVar;
        this.f72745b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i15 = message.what;
        if (i15 != 1) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 39);
            sb5.append("Don't know how to handle this message: ");
            sb5.append(i15);
            c2.g("GoogleApiAvailability", sb5.toString());
            return;
        }
        d dVar = this.f72746c;
        Context context = this.f72745b;
        int iG = dVar.g(context);
        if (dVar.j(iG)) {
            dVar.p(context, iG);
        }
    }
}
