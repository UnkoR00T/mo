package ug;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class c implements Callable<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f198070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f198071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Boolean f198072c;

    c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f198070a = sharedPreferences;
        this.f198071b = str;
        this.f198072c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.f198070a.getBoolean(this.f198071b, this.f198072c.booleanValue()));
    }
}
