package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.h0;
import com.google.firebase.messaging.m;
import fg.a;
import fg.b;
import io.sentry.android.core.c2;
import java.util.concurrent.ExecutionException;
import vh.o;

/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseInstanceIdReceiver extends b {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // fg.b
    protected int b(Context context, a aVar) {
        try {
            return ((Integer) o.a(new m(context).g(aVar.h()))).intValue();
        } catch (InterruptedException | ExecutionException e15) {
            c2.f("FirebaseMessaging", "Failed to send message to service.", e15);
            return 500;
        }
    }

    @Override // fg.b
    protected void c(Context context, Bundle bundle) {
        Intent intentF = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (h0.D(intentF)) {
            h0.v(intentF);
        }
    }
}
