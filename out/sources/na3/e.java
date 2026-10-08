package na3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lna3/e;", "", "b", "a", "c", "Lna3/e$a;", "Lna3/e$b;", "Lna3/e$c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    /* JADX INFO: renamed from: na3.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lna3/e$a;", "Lna3/e;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DownloadInterrupted implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String filePath;

        public DownloadInterrupted(String str) {
            this.filePath = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DownloadInterrupted) && fr.t.c(this.filePath, ((DownloadInterrupted) other).filePath);
        }

        public int hashCode() {
            String str = this.filePath;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "DownloadInterrupted(filePath=" + this.filePath + ')';
        }
    }

    /* JADX INFO: renamed from: na3.e$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lna3/e$b;", "Lna3/e;", "Lz93/s;", "tripUuid", "Lcb4/i;", "dialogVmsAdapter", "", "filePath", "<init>", "(Ljava/lang/String;Lcb4/i;Ljava/lang/String;Lfr/k;)V", "a", "(Ljava/lang/String;Lcb4/i;Ljava/lang/String;)Lna3/e$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lcb4/i;", "c", "()Lcb4/i;", "d", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DownloadingConfirmation implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tripUuid;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVmsAdapter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String filePath;

        public /* synthetic */ DownloadingConfirmation(String str, cb4.i iVar, String str2, fr.k kVar) {
            this(str, iVar, str2);
        }

        public static /* synthetic */ DownloadingConfirmation b(DownloadingConfirmation downloadingConfirmation, String str, cb4.i iVar, String str2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = downloadingConfirmation.tripUuid;
            }
            if ((i15 & 2) != 0) {
                iVar = downloadingConfirmation.dialogVmsAdapter;
            }
            if ((i15 & 4) != 0) {
                str2 = downloadingConfirmation.filePath;
            }
            return downloadingConfirmation.a(str, iVar, str2);
        }

        public final DownloadingConfirmation a(String tripUuid, cb4.i dialogVmsAdapter, String filePath) {
            return new DownloadingConfirmation(tripUuid, dialogVmsAdapter, filePath, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final cb4.i getDialogVmsAdapter() {
            return this.dialogVmsAdapter;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTripUuid() {
            return this.tripUuid;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadingConfirmation)) {
                return false;
            }
            DownloadingConfirmation downloadingConfirmation = (DownloadingConfirmation) other;
            return z93.s.d(this.tripUuid, downloadingConfirmation.tripUuid) && fr.t.c(this.dialogVmsAdapter, downloadingConfirmation.dialogVmsAdapter) && fr.t.c(this.filePath, downloadingConfirmation.filePath);
        }

        public int hashCode() {
            int iE = z93.s.e(this.tripUuid) * 31;
            cb4.i iVar = this.dialogVmsAdapter;
            int iHashCode = (iE + (iVar == null ? 0 : iVar.hashCode())) * 31;
            String str = this.filePath;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "DownloadingConfirmation(tripUuid=" + ((Object) z93.s.f(this.tripUuid)) + ", dialogVmsAdapter=" + this.dialogVmsAdapter + ", filePath=" + this.filePath + ')';
        }

        private DownloadingConfirmation(String str, cb4.i iVar, String str2) {
            this.tripUuid = str;
            this.dialogVmsAdapter = iVar;
            this.filePath = str2;
        }

        public /* synthetic */ DownloadingConfirmation(String str, cb4.i iVar, String str2, int i15, fr.k kVar) {
            this(str, (i15 & 2) != 0 ? null : iVar, (i15 & 4) != 0 ? null : str2, null);
        }
    }

    /* JADX INFO: renamed from: na3.e$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lna3/e$c;", "Lna3/e;", "Lz93/s;", "tripUuid", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Ljava/lang/String;Lhb4/c;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lhb4/c;", "()Lhb4/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tripUuid;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMSAdapter;

        public /* synthetic */ Error(String str, hb4.c cVar, fr.k kVar) {
            this(str, cVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMSAdapter() {
            return this.errorVMSAdapter;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTripUuid() {
            return this.tripUuid;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return z93.s.d(this.tripUuid, error.tripUuid) && fr.t.c(this.errorVMSAdapter, error.errorVMSAdapter);
        }

        public int hashCode() {
            return (z93.s.e(this.tripUuid) * 31) + this.errorVMSAdapter.hashCode();
        }

        public String toString() {
            return "Error(tripUuid=" + ((Object) z93.s.f(this.tripUuid)) + ", errorVMSAdapter=" + this.errorVMSAdapter + ')';
        }

        private Error(String str, hb4.c cVar) {
            this.tripUuid = str;
            this.errorVMSAdapter = cVar;
        }
    }
}
