package rj;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f174581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f174582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f174583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f174584d = new Handler(Looper.getMainLooper());

    j(s sVar, h hVar, Context context) {
        this.f174581a = sVar;
        this.f174582b = hVar;
        this.f174583c = context;
    }

    @Override // rj.b
    public final vh.l<a> a() {
        return this.f174581a.c(this.f174583c.getPackageName());
    }
}
