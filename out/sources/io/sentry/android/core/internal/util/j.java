package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import io.sentry.android.core.t0;
import io.sentry.p2;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0 f93992a;

    public j() {
        this(new t0(p2.e()));
    }

    @SuppressLint({"NewApi"})
    public void a(ContentProvider contentProvider) {
        int iD = this.f93992a.d();
        if (iD < 26 || iD > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public j(t0 t0Var) {
        this.f93992a = t0Var;
    }
}
