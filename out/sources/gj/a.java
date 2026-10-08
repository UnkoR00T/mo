package gj;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<V extends View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f73268a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final V f73269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f73270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f73271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f73272e;

    public a(V v15) {
        this.f73269b = v15;
        Context context = v15.getContext();
        this.f73270c = e.f(context, ri.b.f173930y, 300);
        this.f73271d = e.f(context, ri.b.B, 150);
        this.f73272e = e.f(context, ri.b.A, 100);
    }
}
