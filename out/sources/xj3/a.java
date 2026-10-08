package xj3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fj\u0002\b\u0010j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lxj3/a;", "", "", "infoResId", "fuelConsumptionResId", "co2EmissionResId", "index", "<init>", "(Ljava/lang/String;IIIII)V", "a", "I", "k", "()I", "b", "g", "c", "e", "d", "j", "f", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    First(yi3.a.f227228g0, yi3.a.f227222e0, yi3.a.f227225f0, 1),
    Second(yi3.a.f227237j0, yi3.a.f227231h0, yi3.a.f227234i0, 2);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ wq.a f219124h = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int infoResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int fuelConsumptionResId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int co2EmissionResId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int index;

    a(int i15, int i16, int i17, int i18) {
        this.infoResId = i15;
        this.fuelConsumptionResId = i16;
        this.co2EmissionResId = i17;
        this.index = i18;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCo2EmissionResId() {
        return this.co2EmissionResId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getFuelConsumptionResId() {
        return this.fuelConsumptionResId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getInfoResId() {
        return this.infoResId;
    }
}
