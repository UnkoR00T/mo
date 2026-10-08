package m8;

import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public class j extends f8.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f124313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f124314e;

    public j(Throwable th4, f8.p pVar, Surface surface) {
        super(th4, pVar);
        this.f124313d = System.identityHashCode(surface);
        this.f124314e = surface == null || surface.isValid();
    }
}
