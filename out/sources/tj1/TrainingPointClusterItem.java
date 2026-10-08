package tj1;

import com.google.android.gms.maps.model.LatLng;
import fr.t;
import p071kotlin.Metadata;
import zp0.DefenceUnit;

/* JADX INFO: renamed from: tj1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u000b¨\u0006\""}, d2 = {"Ltj1/b;", "Lbm/b;", "", "contentDescription", "Lzp0/a0;", "unit", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "<init>", "(Ljava/lang/String;Lzp0/a0;Lcom/google/android/gms/maps/model/LatLng;)V", "getPosition", "()Lcom/google/android/gms/maps/model/LatLng;", "getTitle", "()Ljava/lang/String;", "b", "", "a", "()Ljava/lang/Float;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContentDescription", "Lzp0/a0;", "d", "()Lzp0/a0;", "c", "Lcom/google/android/gms/maps/model/LatLng;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TrainingPointClusterItem implements bm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contentDescription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DefenceUnit unit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LatLng latLng;

    public TrainingPointClusterItem(String str, DefenceUnit defenceUnit, LatLng latLng) {
        this.contentDescription = str;
        this.unit = defenceUnit;
        this.latLng = latLng;
    }

    @Override // bm.b
    public Float a() {
        return Float.valueOf(0.0f);
    }

    @Override // bm.b
    public String b() {
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LatLng getLatLng() {
        return this.latLng;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DefenceUnit getUnit() {
        return this.unit;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingPointClusterItem)) {
            return false;
        }
        TrainingPointClusterItem trainingPointClusterItem = (TrainingPointClusterItem) other;
        return t.c(this.contentDescription, trainingPointClusterItem.contentDescription) && t.c(this.unit, trainingPointClusterItem.unit) && t.c(this.latLng, trainingPointClusterItem.latLng);
    }

    @Override // bm.b
    public LatLng getPosition() {
        return this.latLng;
    }

    @Override // bm.b
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public String getContentDescription() {
        return this.contentDescription;
    }

    public int hashCode() {
        return (((this.contentDescription.hashCode() * 31) + this.unit.hashCode()) * 31) + this.latLng.hashCode();
    }

    public String toString() {
        return "TrainingPointClusterItem(contentDescription=" + this.contentDescription + ", unit=" + this.unit + ", latLng=" + this.latLng + ')';
    }
}
