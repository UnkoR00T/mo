package com.google.android.gms.oss.licenses;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ OssLicensesActivity f31437a;

    d(OssLicensesActivity ossLicensesActivity) {
        Objects.requireNonNull(ossLicensesActivity);
        this.f31437a = ossLicensesActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OssLicensesActivity ossLicensesActivity = this.f31437a;
        ossLicensesActivity.P0().scrollTo(0, ossLicensesActivity.Q0().getLayout().getLineTop(ossLicensesActivity.Q0().getLayout().getLineForOffset(ossLicensesActivity.R0())));
    }
}
