package io.sentry.android.core;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 {
    public static io.sentry.r1 a(Context context, t0 t0Var) {
        return t0Var.d() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
