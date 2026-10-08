package ug;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class i implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f198079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f198080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f198081c;

    i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f198079a = sharedPreferences;
        this.f198080b = str;
        this.f198081c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        return this.f198079a.getString(this.f198080b, this.f198081c);
    }
}
