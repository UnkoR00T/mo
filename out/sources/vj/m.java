package vj;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import vh.o;
import wj.t;
import wj.w;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"RestrictedApi"})
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final wj.i f207113c = new wj.i("ReviewService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    t f207114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f207115b;

    /* JADX WARN: Type inference failed for: r7v0, types: [vj.i] */
    public m(Context context) {
        this.f207115b = context.getPackageName();
        if (w.a(context)) {
            this.f207114a = new t(context, f207113c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new Object() { // from class: vj.i
            }, null);
        }
    }

    public final vh.l a() {
        String str = this.f207115b;
        wj.i iVar = f207113c;
        iVar.c("requestInAppReview (%s)", str);
        if (this.f207114a == null) {
            iVar.a("Play Store app is either not installed or not the official version", new Object[0]);
            return o.e(new a(-1));
        }
        vh.m mVar = new vh.m();
        this.f207114a.s(new j(this, mVar, mVar), mVar);
        return mVar.a();
    }
}
