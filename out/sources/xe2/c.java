package xe2;

import java.util.List;
import p071kotlin.Metadata;
import zd2.ImageAttachments;
import zd2.Photo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lxe2/c;", "", "a", "b", "Lxe2/c$a;", "Lxe2/c$b;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: xe2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lxe2/c$a;", "Lxe2/c;", "Lhb4/c;", "error", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "b", "()Lhb4/c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorInit implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c error;

        public ErrorInit(hb4.c cVar) {
            this.error = cVar;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getError() {
            return this.error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorInit) && fr.t.c(this.error, ((ErrorInit) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "ErrorInit(error=" + this.error + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\u0003\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lxe2/c$b;", "Lxe2/c;", "Lxe2/b;", "a", "()Lxe2/b;", "initializedStateData", "d", "c", "b", "Lxe2/c$b$a;", "Lxe2/c$b$b;", "Lxe2/c$b$c;", "Lxe2/c$b$d;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends c {

        /* JADX INFO: renamed from: xe2.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lxe2/c$b$a;", "Lxe2/c$b;", "Lxe2/b;", "initializedStateData", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Lxe2/b;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxe2/b;", "()Lxe2/b;", "b", "Lcb4/i;", "()Lcb4/i;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InitializedStateData initializedStateData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            public Dialog(InitializedStateData initializedStateData, cb4.i iVar) {
                this.initializedStateData = initializedStateData;
                this.dialogVMSAdapter = iVar;
            }

            @Override // xe2.c.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public InitializedStateData getInitializedStateData() {
                return this.initializedStateData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) other;
                return fr.t.c(this.initializedStateData, dialog.initializedStateData) && fr.t.c(this.dialogVMSAdapter, dialog.dialogVMSAdapter);
            }

            public int hashCode() {
                return (this.initializedStateData.hashCode() * 31) + this.dialogVMSAdapter.hashCode();
            }

            public String toString() {
                return "Dialog(initializedStateData=" + this.initializedStateData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: xe2.c$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR)\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lxe2/c$b$b;", "Lxe2/c$b;", "Lxe2/b;", "initializedStateData", "", "Loq/r;", "Lzd2/d;", "Lzd2/b;", "alreadyUploadedPhotos", "Lhb4/c;", "error", "<init>", "(Lxe2/b;Ljava/util/List;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxe2/b;", "()Lxe2/b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lhb4/c;", "()Lhb4/c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InitializedStateData initializedStateData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<oq.r<Photo, ImageAttachments>> alreadyUploadedPhotos;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c error;

            public Error(InitializedStateData initializedStateData, List<oq.r<Photo, ImageAttachments>> list, hb4.c cVar) {
                this.initializedStateData = initializedStateData;
                this.alreadyUploadedPhotos = list;
                this.error = cVar;
            }

            @Override // xe2.c.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public InitializedStateData getInitializedStateData() {
                return this.initializedStateData;
            }

            public final List<oq.r<Photo, ImageAttachments>> b() {
                return this.alreadyUploadedPhotos;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final hb4.c getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.initializedStateData, error.initializedStateData) && fr.t.c(this.alreadyUploadedPhotos, error.alreadyUploadedPhotos) && fr.t.c(this.error, error.error);
            }

            public int hashCode() {
                return (((this.initializedStateData.hashCode() * 31) + this.alreadyUploadedPhotos.hashCode()) * 31) + this.error.hashCode();
            }

            public String toString() {
                return "Error(initializedStateData=" + this.initializedStateData + ", alreadyUploadedPhotos=" + this.alreadyUploadedPhotos + ", error=" + this.error + ')';
            }
        }

        /* JADX INFO: renamed from: xe2.c$b$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R)\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lxe2/c$b$c;", "Lxe2/c$b;", "Lxe2/b;", "initializedStateData", "", "Loq/r;", "Lzd2/d;", "Lzd2/b;", "alreadyUploadedPhotos", "<init>", "(Lxe2/b;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxe2/b;", "()Lxe2/b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SendIncidentReport implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InitializedStateData initializedStateData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<oq.r<Photo, ImageAttachments>> alreadyUploadedPhotos;

            public SendIncidentReport(InitializedStateData initializedStateData, List<oq.r<Photo, ImageAttachments>> list) {
                this.initializedStateData = initializedStateData;
                this.alreadyUploadedPhotos = list;
            }

            @Override // xe2.c.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public InitializedStateData getInitializedStateData() {
                return this.initializedStateData;
            }

            public final List<oq.r<Photo, ImageAttachments>> b() {
                return this.alreadyUploadedPhotos;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SendIncidentReport)) {
                    return false;
                }
                SendIncidentReport sendIncidentReport = (SendIncidentReport) other;
                return fr.t.c(this.initializedStateData, sendIncidentReport.initializedStateData) && fr.t.c(this.alreadyUploadedPhotos, sendIncidentReport.alreadyUploadedPhotos);
            }

            public int hashCode() {
                return (this.initializedStateData.hashCode() * 31) + this.alreadyUploadedPhotos.hashCode();
            }

            public String toString() {
                return "SendIncidentReport(initializedStateData=" + this.initializedStateData + ", alreadyUploadedPhotos=" + this.alreadyUploadedPhotos + ')';
            }
        }

        /* JADX INFO: renamed from: xe2.c$b$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lxe2/c$b$d;", "Lxe2/c$b;", "Lxe2/b;", "initializedStateData", "<init>", "(Lxe2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxe2/b;", "()Lxe2/b;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Summary implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InitializedStateData initializedStateData;

            public Summary(InitializedStateData initializedStateData) {
                this.initializedStateData = initializedStateData;
            }

            @Override // xe2.c.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public InitializedStateData getInitializedStateData() {
                return this.initializedStateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Summary) && fr.t.c(this.initializedStateData, ((Summary) other).initializedStateData);
            }

            public int hashCode() {
                return this.initializedStateData.hashCode();
            }

            public String toString() {
                return "Summary(initializedStateData=" + this.initializedStateData + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        InitializedStateData getInitializedStateData();
    }
}
