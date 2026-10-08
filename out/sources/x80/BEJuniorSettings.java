package x80;

import fr.t;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: x80.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lx80/d;", "", "", "Lx80/c;", "features", "", "school", "Ljava/time/OffsetDateTime;", "serverCurrentTime", "<init>", "(Ljava/util/List;ZLjava/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getFeatures", "()Ljava/util/List;", "b", "Z", "()Z", "c", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEJuniorSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEJuniorFeature> features;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean school;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime serverCurrentTime;

    public BEJuniorSettings(List<BEJuniorFeature> list, boolean z15, OffsetDateTime offsetDateTime) {
        this.features = list;
        this.school = z15;
        this.serverCurrentTime = offsetDateTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getSchool() {
        return this.school;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getServerCurrentTime() {
        return this.serverCurrentTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEJuniorSettings)) {
            return false;
        }
        BEJuniorSettings bEJuniorSettings = (BEJuniorSettings) other;
        return t.c(this.features, bEJuniorSettings.features) && this.school == bEJuniorSettings.school && t.c(this.serverCurrentTime, bEJuniorSettings.serverCurrentTime);
    }

    public int hashCode() {
        return (((this.features.hashCode() * 31) + Boolean.hashCode(this.school)) * 31) + this.serverCurrentTime.hashCode();
    }

    public String toString() {
        return "BEJuniorSettings(features=" + this.features + ", school=" + this.school + ", serverCurrentTime=" + this.serverCurrentTime + ")";
    }
}
