package ug;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class e implements Callable<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f198073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f198074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Integer f198075c;

    e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f198073a = sharedPreferences;
        this.f198074b = str;
        this.f198075c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() {
        return Integer.valueOf(this.f198073a.getInt(this.f198074b, this.f198075c.intValue()));
    }
}
