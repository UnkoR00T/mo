package pe3;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import sv0.Download;
import sv0.ProcessId;
import sv0.StatementVehicleDetails;
import ye3.PhotosDetailsSetupData;

/* JADX INFO: renamed from: pe3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, d2 = {"Lpe3/a;", "", "Lsv0/y;", "processId", "Lsv0/p0;", "initialConfiguration", "", "Lsv0/j0$a;", "files", "Lye3/b$a;", "enteredFrom", "<init>", "(Lsv0/y;Lsv0/p0;Ljava/util/List;Lye3/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "d", "()Lsv0/y;", "b", "Lsv0/p0;", "c", "()Lsv0/p0;", "Ljava/util/List;", "()Ljava/util/List;", "Lye3/b$a;", "()Lye3/b$a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DownloadPhotosSetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProcessId processId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Download initialConfiguration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<StatementVehicleDetails.Image> files;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhotosDetailsSetupData.a enteredFrom;

    public DownloadPhotosSetupData(ProcessId processId, Download download, List<StatementVehicleDetails.Image> list, PhotosDetailsSetupData.a aVar) {
        this.processId = processId;
        this.initialConfiguration = download;
        this.files = list;
        this.enteredFrom = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PhotosDetailsSetupData.a getEnteredFrom() {
        return this.enteredFrom;
    }

    public final List<StatementVehicleDetails.Image> b() {
        return this.files;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Download getInitialConfiguration() {
        return this.initialConfiguration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ProcessId getProcessId() {
        return this.processId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadPhotosSetupData)) {
            return false;
        }
        DownloadPhotosSetupData downloadPhotosSetupData = (DownloadPhotosSetupData) other;
        return t.c(this.processId, downloadPhotosSetupData.processId) && t.c(this.initialConfiguration, downloadPhotosSetupData.initialConfiguration) && t.c(this.files, downloadPhotosSetupData.files) && t.c(this.enteredFrom, downloadPhotosSetupData.enteredFrom);
    }

    public int hashCode() {
        return (((((this.processId.hashCode() * 31) + this.initialConfiguration.hashCode()) * 31) + this.files.hashCode()) * 31) + this.enteredFrom.hashCode();
    }

    public String toString() {
        return "DownloadPhotosSetupData(processId=" + this.processId + ", initialConfiguration=" + this.initialConfiguration + ", files=" + this.files + ", enteredFrom=" + this.enteredFrom + ')';
    }
}
