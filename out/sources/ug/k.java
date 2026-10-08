package ug;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class k implements Callable<SharedPreferences> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Context f198083a;

    k(Context context) {
        this.f198083a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() {
        return this.f198083a.getSharedPreferences("google_sdk_flags", 0);
    }
}
