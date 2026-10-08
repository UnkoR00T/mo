package m72;

import d72.HydroWarning;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: m72.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lm72/d;", "", "Ld72/b;", "hydroWarning", "<init>", "(Ld72/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld72/b;", "()Ld72/b;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AlarmStateDetailsNavigationParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final HydroWarning hydroWarning;

    public AlarmStateDetailsNavigationParams(HydroWarning hydroWarning) {
        this.hydroWarning = hydroWarning;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final HydroWarning getHydroWarning() {
        return this.hydroWarning;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AlarmStateDetailsNavigationParams) && t.c(this.hydroWarning, ((AlarmStateDetailsNavigationParams) other).hydroWarning);
    }

    public int hashCode() {
        HydroWarning hydroWarning = this.hydroWarning;
        if (hydroWarning == null) {
            return 0;
        }
        return hydroWarning.hashCode();
    }

    public String toString() {
        return "AlarmStateDetailsNavigationParams(hydroWarning=" + this.hydroWarning + ')';
    }
}
