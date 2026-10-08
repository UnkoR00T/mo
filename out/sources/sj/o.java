package sj;

import android.content.Context;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p f181981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IntentFilter f181982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f181983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Set f181984d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f181985e = false;

    protected o(p pVar, IntentFilter intentFilter, Context context) {
        this.f181981a = pVar;
        this.f181982b = intentFilter;
        this.f181983c = c0.a(context);
    }
}
