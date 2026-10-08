package f8;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements m.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f59999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zj.w<HandlerThread> f60000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zj.w<HandlerThread> f60001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f60002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f60003f;

    @Deprecated
    public j() {
        this.f60002e = 0;
        this.f60003f = true;
        this.f59999b = null;
        this.f60000c = null;
        this.f60001d = null;
    }

    private boolean c() {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 31) {
            return true;
        }
        Context context = this.f59999b;
        return context != null && i15 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // f8.m.b
    public m a(m.a aVar) {
        zj.w<HandlerThread> wVar;
        int i15 = this.f60002e;
        if (i15 != 1 && (i15 != 0 || !c())) {
            return new f0.b().a(aVar);
        }
        int iF = t7.w.f(aVar.f60011c.f188381p);
        w7.t.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + o0.o0(iF));
        zj.w<HandlerThread> wVar2 = this.f60000c;
        c.b bVar = (wVar2 == null || (wVar = this.f60001d) == null) ? new c.b(iF) : new c.b(wVar2, wVar);
        bVar.f(this.f60003f);
        return bVar.a(aVar);
    }

    public j(Context context) {
        this(context, null, null);
    }

    public j(Context context, zj.w<HandlerThread> wVar, zj.w<HandlerThread> wVar2) {
        this.f59999b = context;
        this.f60002e = 0;
        this.f60003f = true;
        this.f60000c = wVar;
        this.f60001d = wVar2;
    }
}
