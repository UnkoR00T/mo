package re2;

import java.util.List;
import p071kotlin.Metadata;
import zd2.ThumbnailsWihName;
import zp0.BEIncidentReportFileImageConfiguration;

/* JADX INFO: renamed from: re2.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lre2/b;", "", "", "Lzd2/e;", "thumbnails", "Lzp0/e;", "fileImageConfiguration", "Lg30/v;", "bottomSheetValue", "<init>", "(Ljava/util/List;Lzp0/e;Lg30/v;)V", "a", "(Ljava/util/List;Lzp0/e;Lg30/v;)Lre2/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Lzp0/e;", "d", "()Lzp0/e;", "c", "Lg30/v;", "()Lg30/v;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitializedData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ThumbnailsWihName> thumbnails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEIncidentReportFileImageConfiguration fileImageConfiguration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final g30.v bottomSheetValue;

    public InitializedData(List<ThumbnailsWihName> list, BEIncidentReportFileImageConfiguration eVar, g30.v vVar) {
        this.thumbnails = list;
        this.fileImageConfiguration = eVar;
        this.bottomSheetValue = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InitializedData b(InitializedData initializedData, List list, BEIncidentReportFileImageConfiguration eVar, g30.v vVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = initializedData.thumbnails;
        }
        if ((i15 & 2) != 0) {
            eVar = initializedData.fileImageConfiguration;
        }
        if ((i15 & 4) != 0) {
            vVar = initializedData.bottomSheetValue;
        }
        return initializedData.a(list, eVar, vVar);
    }

    public final InitializedData a(List<ThumbnailsWihName> thumbnails, BEIncidentReportFileImageConfiguration fileImageConfiguration, g30.v bottomSheetValue) {
        return new InitializedData(thumbnails, fileImageConfiguration, bottomSheetValue);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g30.v getBottomSheetValue() {
        return this.bottomSheetValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEIncidentReportFileImageConfiguration getFileImageConfiguration() {
        return this.fileImageConfiguration;
    }

    public final List<ThumbnailsWihName> e() {
        return this.thumbnails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializedData)) {
            return false;
        }
        InitializedData initializedData = (InitializedData) other;
        return fr.t.c(this.thumbnails, initializedData.thumbnails) && fr.t.c(this.fileImageConfiguration, initializedData.fileImageConfiguration) && this.bottomSheetValue == initializedData.bottomSheetValue;
    }

    public int hashCode() {
        return (((this.thumbnails.hashCode() * 31) + this.fileImageConfiguration.hashCode()) * 31) + this.bottomSheetValue.hashCode();
    }

    public String toString() {
        return "InitializedData(thumbnails=" + this.thumbnails + ", fileImageConfiguration=" + this.fileImageConfiguration + ", bottomSheetValue=" + this.bottomSheetValue + ')';
    }

    public /* synthetic */ InitializedData(List list, BEIncidentReportFileImageConfiguration eVar, g30.v vVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? pq.v.n() : list, eVar, (i15 & 4) != 0 ? g30.v.HIDDEN : vVar);
    }
}
