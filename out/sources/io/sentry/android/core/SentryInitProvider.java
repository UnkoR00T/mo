package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import io.sentry.b7;
import io.sentry.d5;
import io.sentry.z6;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryInitProvider extends h1 {
    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        io.sentry.android.core.performance.h.u(this);
        y yVar = new y();
        Context context = getContext();
        if (context == null) {
            yVar.c(b7.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            io.sentry.android.core.performance.h.v(this);
            return false;
        }
        if (q1.c(context, yVar) && !a1.f(context)) {
            z1.e(context, yVar);
            z6.d().a("AutoInit");
        }
        io.sentry.android.core.performance.h.v(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        d5.l();
    }
}
