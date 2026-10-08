package pa0;

import androidx.compose.ui.graphics.Color;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pa0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, d2 = {"Lpa0/a;", "", "Landroidx/compose/ui/graphics/Color;", "headerIconBackground", "borderSchool", "borderDrivingLicence", "<init>", "(JJJLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DashboardThemeColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long headerIconBackground;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long borderSchool;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long borderDrivingLicence;

    public /* synthetic */ DashboardThemeColors(long j15, long j16, long j17, k kVar) {
        this(j15, j16, j17);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBorderDrivingLicence() {
        return this.borderDrivingLicence;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBorderSchool() {
        return this.borderSchool;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getHeaderIconBackground() {
        return this.headerIconBackground;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardThemeColors)) {
            return false;
        }
        DashboardThemeColors dashboardThemeColors = (DashboardThemeColors) other;
        return Color.m11equalsimpl0(this.headerIconBackground, dashboardThemeColors.headerIconBackground) && Color.m11equalsimpl0(this.borderSchool, dashboardThemeColors.borderSchool) && Color.m11equalsimpl0(this.borderDrivingLicence, dashboardThemeColors.borderDrivingLicence);
    }

    public int hashCode() {
        return (((Color.m17hashCodeimpl(this.headerIconBackground) * 31) + Color.m17hashCodeimpl(this.borderSchool)) * 31) + Color.m17hashCodeimpl(this.borderDrivingLicence);
    }

    public String toString() {
        return "DashboardThemeColors(headerIconBackground=" + ((Object) Color.m18toStringimpl(this.headerIconBackground)) + ", borderSchool=" + ((Object) Color.m18toStringimpl(this.borderSchool)) + ", borderDrivingLicence=" + ((Object) Color.m18toStringimpl(this.borderDrivingLicence)) + ')';
    }

    private DashboardThemeColors(long j15, long j16, long j17) {
        this.headerIconBackground = j15;
        this.borderSchool = j16;
        this.borderDrivingLicence = j17;
    }
}
