package a31;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"La31/e;", "", "b", "a", "c", "La31/e$a;", "La31/e$b;", "La31/e$c;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    /* JADX INFO: renamed from: a31.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"La31/e$a;", "La31/e;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: a31.e$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"La31/e$c;", "La31/e;", "", "queryUuid", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Ljava/lang/String;Lhb4/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lhb4/c;", "()Lhb4/c;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String queryUuid;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMSAdapter;

        public Error(String str, hb4.c cVar) {
            this.queryUuid = str;
            this.errorVMSAdapter = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMSAdapter() {
            return this.errorVMSAdapter;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getQueryUuid() {
            return this.queryUuid;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.queryUuid, error.queryUuid) && fr.t.c(this.errorVMSAdapter, error.errorVMSAdapter);
        }

        public int hashCode() {
            return (this.queryUuid.hashCode() * 31) + this.errorVMSAdapter.hashCode();
        }

        public String toString() {
            return "Error(queryUuid=" + this.queryUuid + ", errorVMSAdapter=" + this.errorVMSAdapter + ')';
        }
    }

    /* JADX INFO: renamed from: a31.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"La31/e$b;", "La31/e;", "", "queryUuid", "Lcb4/i;", "dialogVMSAdapter", "filePath", "<init>", "(Ljava/lang/String;Lcb4/i;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Lcb4/i;Ljava/lang/String;)La31/e$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lcb4/i;", "c", "()Lcb4/i;", "d", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DownloadingConfirmation implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String queryUuid;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String filePath;

        public DownloadingConfirmation(String str, cb4.i iVar, String str2) {
            this.queryUuid = str;
            this.dialogVMSAdapter = iVar;
            this.filePath = str2;
        }

        public static /* synthetic */ DownloadingConfirmation b(DownloadingConfirmation downloadingConfirmation, String str, cb4.i iVar, String str2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = downloadingConfirmation.queryUuid;
            }
            if ((i15 & 2) != 0) {
                iVar = downloadingConfirmation.dialogVMSAdapter;
            }
            if ((i15 & 4) != 0) {
                str2 = downloadingConfirmation.filePath;
            }
            return downloadingConfirmation.a(str, iVar, str2);
        }

        public final DownloadingConfirmation a(String queryUuid, cb4.i dialogVMSAdapter, String filePath) {
            return new DownloadingConfirmation(queryUuid, dialogVMSAdapter, filePath);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final cb4.i getDialogVMSAdapter() {
            return this.dialogVMSAdapter;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getQueryUuid() {
            return this.queryUuid;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadingConfirmation)) {
                return false;
            }
            DownloadingConfirmation downloadingConfirmation = (DownloadingConfirmation) other;
            return fr.t.c(this.queryUuid, downloadingConfirmation.queryUuid) && fr.t.c(this.dialogVMSAdapter, downloadingConfirmation.dialogVMSAdapter) && fr.t.c(this.filePath, downloadingConfirmation.filePath);
        }

        public int hashCode() {
            int iHashCode = this.queryUuid.hashCode() * 31;
            cb4.i iVar = this.dialogVMSAdapter;
            int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            String str = this.filePath;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "DownloadingConfirmation(queryUuid=" + this.queryUuid + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ", filePath=" + this.filePath + ')';
        }

        public /* synthetic */ DownloadingConfirmation(String str, cb4.i iVar, String str2, int i15, fr.k kVar) {
            this(str, (i15 & 2) != 0 ? null : iVar, (i15 & 4) != 0 ? null : str2);
        }
    }
}
