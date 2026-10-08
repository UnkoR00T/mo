package ii;

import android.os.ParcelUuid;

/* JADX INFO: loaded from: classes4.dex */
abstract class p7 extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ParcelUuid f92715a;

    p7(ParcelUuid parcelUuid) {
        if (parcelUuid == null) {
            throw new NullPointerException("Null UUID");
        }
        this.f92715a = parcelUuid;
    }

    @Override // ii.i
    final ParcelUuid b() {
        return this.f92715a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f92715a.equals(((i) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f92715a.hashCode() ^ 1000003;
    }
}
