package xe2;

import p071kotlin.Metadata;
import zd2.NewIncidentData;

/* JADX INFO: renamed from: xe2.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lxe2/b;", "", "Lzd2/c;", "incidentData", "", "requestToNewLocalization", "<init>", "(Lzd2/c;Z)V", "a", "(Lzd2/c;Z)Lxe2/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lzd2/c;", "c", "()Lzd2/c;", "b", "Z", "d", "()Z", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitializedStateData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final NewIncidentData incidentData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requestToNewLocalization;

    public InitializedStateData(NewIncidentData newIncidentData, boolean z15) {
        this.incidentData = newIncidentData;
        this.requestToNewLocalization = z15;
    }

    public static /* synthetic */ InitializedStateData b(InitializedStateData initializedStateData, NewIncidentData newIncidentData, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            newIncidentData = initializedStateData.incidentData;
        }
        if ((i15 & 2) != 0) {
            z15 = initializedStateData.requestToNewLocalization;
        }
        return initializedStateData.a(newIncidentData, z15);
    }

    public final InitializedStateData a(NewIncidentData incidentData, boolean requestToNewLocalization) {
        return new InitializedStateData(incidentData, requestToNewLocalization);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final NewIncidentData getIncidentData() {
        return this.incidentData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRequestToNewLocalization() {
        return this.requestToNewLocalization;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializedStateData)) {
            return false;
        }
        InitializedStateData initializedStateData = (InitializedStateData) other;
        return fr.t.c(this.incidentData, initializedStateData.incidentData) && this.requestToNewLocalization == initializedStateData.requestToNewLocalization;
    }

    public int hashCode() {
        return (this.incidentData.hashCode() * 31) + Boolean.hashCode(this.requestToNewLocalization);
    }

    public String toString() {
        return "InitializedStateData(incidentData=" + this.incidentData + ", requestToNewLocalization=" + this.requestToNewLocalization + ')';
    }

    public /* synthetic */ InitializedStateData(NewIncidentData newIncidentData, boolean z15, int i15, fr.k kVar) {
        this(newIncidentData, (i15 & 2) != 0 ? false : z15);
    }
}
