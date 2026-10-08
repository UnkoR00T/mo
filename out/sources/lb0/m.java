package lb0;

import android.graphics.Bitmap;
import java.util.List;
import p071kotlin.Metadata;
import vf0.MainDocumentPhotoData;
import xf0.DrivingLicenceDocument;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Llb0/m;", "", "h", "f", "g", "e", "d", "b", "c", "a", "Llb0/m$a;", "Llb0/m$b;", "Llb0/m$c;", "Llb0/m$d;", "Llb0/m$e;", "Llb0/m$f;", "Llb0/m$g;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m {

    /* JADX INFO: renamed from: lb0.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Llb0/m$a;", "Llb0/m;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteDocument implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        public DeleteDocument(String str) {
            this.documentId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeleteDocument) && fr.t.c(this.documentId, ((DeleteDocument) other).documentId);
        }

        public int hashCode() {
            return this.documentId.hashCode();
        }

        public String toString() {
            return "DeleteDocument(documentId=" + this.documentId + ')';
        }
    }

    /* JADX INFO: renamed from: lb0.m$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Llb0/m$b;", "Llb0/m;", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorInitial implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMSAdapter;

        public ErrorInitial(hb4.c cVar) {
            this.errorVMSAdapter = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMSAdapter() {
            return this.errorVMSAdapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorInitial) && fr.t.c(this.errorVMSAdapter, ((ErrorInitial) other).errorVMSAdapter);
        }

        public int hashCode() {
            return this.errorVMSAdapter.hashCode();
        }

        public String toString() {
            return "ErrorInitial(errorVMSAdapter=" + this.errorVMSAdapter + ')';
        }
    }

    /* JADX INFO: renamed from: lb0.m$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\t¨\u0006\u0018"}, d2 = {"Llb0/m$c;", "Llb0/m;", "Lhb4/c;", "errorVMSAdapter", "", "documentId", "<init>", "(Lhb4/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "d", "()Lhb4/c;", "b", "Ljava/lang/String;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorLoading implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMSAdapter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        public ErrorLoading(hb4.c cVar, String str) {
            this.errorVMSAdapter = cVar;
            this.documentId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final hb4.c getErrorVMSAdapter() {
            return this.errorVMSAdapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorLoading)) {
                return false;
            }
            ErrorLoading errorLoading = (ErrorLoading) other;
            return fr.t.c(this.errorVMSAdapter, errorLoading.errorVMSAdapter) && fr.t.c(this.documentId, errorLoading.documentId);
        }

        public int hashCode() {
            return (this.errorVMSAdapter.hashCode() * 31) + this.documentId.hashCode();
        }

        public String toString() {
            return "ErrorLoading(errorVMSAdapter=" + this.errorVMSAdapter + ", documentId=" + this.documentId + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Llb0/m$d;", "Llb0/m;", "b", "a", "Llb0/m$d$a;", "Llb0/m$d$b;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d extends m {

        /* JADX INFO: renamed from: lb0.m$d$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Llb0/m$d$a;", "Llb0/m$d;", "Lxf0/c;", "drivingLicence", "Llb0/m$h;", "stateData", "<init>", "(Lxf0/c;Llb0/m$h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxf0/c;", "()Lxf0/c;", "b", "Llb0/m$h;", "()Llb0/m$h;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Details implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DrivingLicenceDocument drivingLicence;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            public Details(DrivingLicenceDocument drivingLicenceDocument, StateData stateData) {
                this.drivingLicence = drivingLicenceDocument;
                this.stateData = stateData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DrivingLicenceDocument getDrivingLicence() {
                return this.drivingLicence;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final StateData getStateData() {
                return this.stateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Details)) {
                    return false;
                }
                Details details = (Details) other;
                return fr.t.c(this.drivingLicence, details.drivingLicence) && fr.t.c(this.stateData, details.stateData);
            }

            public int hashCode() {
                return (this.drivingLicence.hashCode() * 31) + this.stateData.hashCode();
            }

            public String toString() {
                return "Details(drivingLicence=" + this.drivingLicence + ", stateData=" + this.stateData + ')';
            }
        }

        /* JADX INFO: renamed from: lb0.m$d$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Llb0/m$d$b;", "Llb0/m$d;", "Llb0/m$h;", "stateData", "<init>", "(Llb0/m$h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llb0/m$h;", "b", "()Llb0/m$h;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class List implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            public List(StateData stateData) {
                this.stateData = stateData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final StateData getStateData() {
                return this.stateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof List) && fr.t.c(this.stateData, ((List) other).stateData);
            }

            public int hashCode() {
                return this.stateData.hashCode();
            }

            public String toString() {
                return "List(stateData=" + this.stateData + ')';
            }
        }
    }

    /* JADX INFO: renamed from: lb0.m$e, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Llb0/m$e;", "Llb0/m;", "Llb0/m$h;", "stateData", "", "parentDocumentId", "<init>", "(Llb0/m$h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llb0/m$h;", "b", "()Llb0/m$h;", "Ljava/lang/String;", "getParentDocumentId", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoPage implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData stateData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String parentDocumentId;

        public InfoPage(StateData stateData, String str) {
            this.stateData = stateData;
            this.parentDocumentId = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final StateData getStateData() {
            return this.stateData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoPage)) {
                return false;
            }
            InfoPage infoPage = (InfoPage) other;
            return fr.t.c(this.stateData, infoPage.stateData) && fr.t.c(this.parentDocumentId, infoPage.parentDocumentId);
        }

        public int hashCode() {
            return (this.stateData.hashCode() * 31) + this.parentDocumentId.hashCode();
        }

        public String toString() {
            return "InfoPage(stateData=" + this.stateData + ", parentDocumentId=" + this.parentDocumentId + ')';
        }
    }

    /* JADX INFO: renamed from: lb0.m$f, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Llb0/m$f;", "Llb0/m;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        public Initial(String str) {
            this.documentId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && fr.t.c(this.documentId, ((Initial) other).documentId);
        }

        public int hashCode() {
            String str = this.documentId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Initial(documentId=" + this.documentId + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\n\u0003\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Llb0/m$g;", "Llb0/m;", "Lcb4/i;", "c", "()Lcb4/i;", "dialogVMSAdapter", "Llb0/m$h;", "b", "()Llb0/m$h;", "stateData", "a", "Llb0/m$g$a;", "Llb0/m$g$b;", "Llb0/m$g$c;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface g extends m {

        /* JADX INFO: renamed from: lb0.m$g$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Llb0/m$g$a;", "Llb0/m$g;", "Lcb4/i;", "dialogVMSAdapter", "Llb0/m$h;", "stateData", "<init>", "(Lcb4/i;Llb0/m$h;)V", "a", "(Lcb4/i;Llb0/m$h;)Llb0/m$g$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcb4/i;", "c", "()Lcb4/i;", "b", "Llb0/m$h;", "()Llb0/m$h;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displaying implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            public Displaying(cb4.i iVar, StateData stateData) {
                this.dialogVMSAdapter = iVar;
                this.stateData = stateData;
            }

            public static /* synthetic */ Displaying d(Displaying displaying, cb4.i iVar, StateData stateData, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    iVar = displaying.dialogVMSAdapter;
                }
                if ((i15 & 2) != 0) {
                    stateData = displaying.stateData;
                }
                return displaying.a(iVar, stateData);
            }

            public final Displaying a(cb4.i dialogVMSAdapter, StateData stateData) {
                return new Displaying(dialogVMSAdapter, stateData);
            }

            @Override // lb0.m.g
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getStateData() {
                return this.stateData;
            }

            @Override // lb0.m.g
            /* JADX INFO: renamed from: c, reason: from getter */
            public cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Displaying)) {
                    return false;
                }
                Displaying displaying = (Displaying) other;
                return fr.t.c(this.dialogVMSAdapter, displaying.dialogVMSAdapter) && fr.t.c(this.stateData, displaying.stateData);
            }

            public int hashCode() {
                cb4.i iVar = this.dialogVMSAdapter;
                return ((iVar == null ? 0 : iVar.hashCode()) * 31) + this.stateData.hashCode();
            }

            public String toString() {
                return "Displaying(dialogVMSAdapter=" + this.dialogVMSAdapter + ", stateData=" + this.stateData + ')';
            }
        }

        /* JADX INFO: renamed from: lb0.m$g$b, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Llb0/m$g$b;", "Llb0/m$g;", "Lcb4/i;", "dialogVMSAdapter", "Llb0/m$h;", "stateData", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lcb4/i;Llb0/m$h;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/i;", "c", "()Lcb4/i;", "b", "Llb0/m$h;", "()Llb0/m$h;", "Lhb4/c;", "()Lhb4/c;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ErrorUpdating implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public ErrorUpdating(cb4.i iVar, StateData stateData, hb4.c cVar) {
                this.dialogVMSAdapter = iVar;
                this.stateData = stateData;
                this.errorVMSAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            @Override // lb0.m.g
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getStateData() {
                return this.stateData;
            }

            @Override // lb0.m.g
            /* JADX INFO: renamed from: c, reason: from getter */
            public cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ErrorUpdating)) {
                    return false;
                }
                ErrorUpdating errorUpdating = (ErrorUpdating) other;
                return fr.t.c(this.dialogVMSAdapter, errorUpdating.dialogVMSAdapter) && fr.t.c(this.stateData, errorUpdating.stateData) && fr.t.c(this.errorVMSAdapter, errorUpdating.errorVMSAdapter);
            }

            public int hashCode() {
                cb4.i iVar = this.dialogVMSAdapter;
                return ((((iVar == null ? 0 : iVar.hashCode()) * 31) + this.stateData.hashCode()) * 31) + this.errorVMSAdapter.hashCode();
            }

            public String toString() {
                return "ErrorUpdating(dialogVMSAdapter=" + this.dialogVMSAdapter + ", stateData=" + this.stateData + ", errorVMSAdapter=" + this.errorVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: lb0.m$g$c, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Llb0/m$g$c;", "Llb0/m$g;", "Lcb4/i;", "dialogVMSAdapter", "Llb0/m$h;", "stateData", "<init>", "(Lcb4/i;Llb0/m$h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/i;", "c", "()Lcb4/i;", "b", "Llb0/m$h;", "()Llb0/m$h;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Updating implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            public Updating(cb4.i iVar, StateData stateData) {
                this.dialogVMSAdapter = iVar;
                this.stateData = stateData;
            }

            @Override // lb0.m.g
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getStateData() {
                return this.stateData;
            }

            @Override // lb0.m.g
            /* JADX INFO: renamed from: c, reason: from getter */
            public cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Updating)) {
                    return false;
                }
                Updating updating = (Updating) other;
                return fr.t.c(this.dialogVMSAdapter, updating.dialogVMSAdapter) && fr.t.c(this.stateData, updating.stateData);
            }

            public int hashCode() {
                cb4.i iVar = this.dialogVMSAdapter;
                return ((iVar == null ? 0 : iVar.hashCode()) * 31) + this.stateData.hashCode();
            }

            public String toString() {
                return "Updating(dialogVMSAdapter=" + this.dialogVMSAdapter + ", stateData=" + this.stateData + ')';
            }
        }

        /* JADX INFO: renamed from: b */
        StateData getStateData();

        /* JADX INFO: renamed from: c */
        cb4.i getDialogVMSAdapter();
    }

    /* JADX INFO: renamed from: lb0.m$h, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0017\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b!\u0010\u000f¨\u0006%"}, d2 = {"Llb0/m$h;", "", "Landroid/graphics/Bitmap;", "imageBitmap", "Lvf0/e;", "photo", "Lxf0/c;", "drivingLicenceData", "", "childDocuments", "", "parentDocumentId", "<init>", "(Landroid/graphics/Bitmap;Lvf0/e;Lxf0/c;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "b", "Lvf0/e;", "e", "()Lvf0/e;", "Lxf0/c;", "()Lxf0/c;", "d", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/String;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StateData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap imageBitmap;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final MainDocumentPhotoData photo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DrivingLicenceDocument drivingLicenceData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DrivingLicenceDocument> childDocuments;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String parentDocumentId;

        public StateData(Bitmap bitmap, MainDocumentPhotoData mainDocumentPhotoData, DrivingLicenceDocument drivingLicenceDocument, List<DrivingLicenceDocument> list, String str) {
            this.imageBitmap = bitmap;
            this.photo = mainDocumentPhotoData;
            this.drivingLicenceData = drivingLicenceDocument;
            this.childDocuments = list;
            this.parentDocumentId = str;
        }

        public final List<DrivingLicenceDocument> a() {
            return this.childDocuments;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final DrivingLicenceDocument getDrivingLicenceData() {
            return this.drivingLicenceData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Bitmap getImageBitmap() {
            return this.imageBitmap;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getParentDocumentId() {
            return this.parentDocumentId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final MainDocumentPhotoData getPhoto() {
            return this.photo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateData)) {
                return false;
            }
            StateData stateData = (StateData) other;
            return fr.t.c(this.imageBitmap, stateData.imageBitmap) && fr.t.c(this.photo, stateData.photo) && fr.t.c(this.drivingLicenceData, stateData.drivingLicenceData) && fr.t.c(this.childDocuments, stateData.childDocuments) && fr.t.c(this.parentDocumentId, stateData.parentDocumentId);
        }

        public int hashCode() {
            return (((((((this.imageBitmap.hashCode() * 31) + this.photo.hashCode()) * 31) + this.drivingLicenceData.hashCode()) * 31) + this.childDocuments.hashCode()) * 31) + this.parentDocumentId.hashCode();
        }

        public String toString() {
            return "StateData(imageBitmap=" + this.imageBitmap + ", photo=" + this.photo + ", drivingLicenceData=" + this.drivingLicenceData + ", childDocuments=" + this.childDocuments + ", parentDocumentId=" + this.parentDocumentId + ')';
        }
    }
}
