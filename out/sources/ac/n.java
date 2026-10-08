package ac;

import android.content.Context;
import android.os.Build;
import p071kotlin.Metadata;
import yb.NetworkState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lac/n;", "", "Landroid/content/Context;", "context", "Lec/b;", "taskExecutor", "Lac/h;", "", "batteryChargingTracker", "Lac/c;", "batteryNotLowTracker", "Lyb/h;", "networkStateTracker", "storageNotLowTracker", "<init>", "(Landroid/content/Context;Lec/b;Lac/h;Lac/c;Lac/h;Lac/h;)V", "a", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "b", "Lac/h;", "()Lac/h;", "Lac/c;", "()Lac/c;", "d", "e", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h<Boolean> batteryChargingTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c batteryNotLowTracker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h<NetworkState> networkStateTracker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h<Boolean> storageNotLowTracker;

    public n(Context context, ec.b bVar, h<Boolean> hVar, c cVar, h<NetworkState> hVar2, h<Boolean> hVar3) {
        this.context = context;
        this.batteryChargingTracker = hVar;
        this.batteryNotLowTracker = cVar;
        this.networkStateTracker = hVar2;
        this.storageNotLowTracker = hVar3;
    }

    public final h<Boolean> a() {
        return this.batteryChargingTracker;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final h<NetworkState> d() {
        return this.networkStateTracker;
    }

    public final h<Boolean> e() {
        return this.storageNotLowTracker;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(Context context, ec.b bVar, h hVar, c cVar, h hVar2, h hVar3, int i15, fr.k kVar) {
        h aVar = (i15 & 4) != 0 ? new a(context.getApplicationContext(), bVar) : hVar;
        c cVar2 = (i15 & 8) != 0 ? new c(context.getApplicationContext(), bVar) : cVar;
        if ((i15 & 16) != 0) {
            hVar2 = Build.VERSION.SDK_INT < 28 ? j.a(context.getApplicationContext(), bVar) : null;
        }
        this(context, bVar, aVar, cVar2, hVar2, (i15 & 32) != 0 ? new l(context.getApplicationContext(), bVar) : hVar3);
    }
}
