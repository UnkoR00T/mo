package ug;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class g implements Callable<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f198076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f198077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Long f198078c;

    g(SharedPreferences sharedPreferences, String str, Long l15) {
        this.f198076a = sharedPreferences;
        this.f198077b = str;
        this.f198078c = l15;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() {
        return Long.valueOf(this.f198076a.getLong(this.f198077b, this.f198078c.longValue()));
    }
}
