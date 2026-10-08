package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import io.sentry.android.core.c2;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseMessagingService extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Queue<String> f36456g = new ArrayDeque(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private fg.c f36457f;

    private boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f36456g;
        if (queue.contains(str)) {
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (j0.t(extras)) {
            j0 j0Var = new j0(extras);
            ExecutorService executorServiceE = n.e();
            try {
                if (new e(this, j0Var, executorServiceE).a()) {
                    executorServiceE.shutdown();
                    return;
                } else {
                    executorServiceE.shutdown();
                    if (h0.D(intent)) {
                        h0.w(intent);
                    }
                }
            } catch (Throwable th4) {
                executorServiceE.shutdown();
                throw th4;
            }
        }
        q(new p0(extras));
    }

    private String l(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private fg.c m(Context context) {
        if (this.f36457f == null) {
            this.f36457f = new fg.c(context.getApplicationContext());
        }
        return this.f36457f;
    }

    private void n(Intent intent) {
        if (!j(intent.getStringExtra("google.message_id"))) {
            u(intent);
        }
        m(this).b(new fg.a(intent));
    }

    private void u(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                o();
                break;
            case "gcm":
                h0.y(intent);
                k(intent);
                break;
            case "send_error":
                t(l(intent), new t0(intent.getStringExtra("error")));
                break;
            case "send_event":
                r(intent.getStringExtra("google.message_id"));
                break;
            default:
                c2.g("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    @Override // com.google.firebase.messaging.h
    protected Intent e(Intent intent) {
        return u0.b().c();
    }

    @Override // com.google.firebase.messaging.h
    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            n(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            s(intent.getStringExtra("token"));
        } else {
            intent.getAction();
        }
    }

    public void o() {
    }

    public void q(p0 p0Var) {
    }

    @Deprecated
    public void r(String str) {
    }

    public void s(String str) {
    }

    @Deprecated
    public void t(String str, Exception exc) {
    }
}
