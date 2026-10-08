package cc0;

import android.graphics.Bitmap;
import bc0.DocumentPhotoData;
import java.util.Map;
import p071kotlin.Metadata;
import vb0.FamilyCardDocument;
import vb0.FamilyCards;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcc0/l;", "", "e", "c", "d", "b", "a", "Lcc0/l$a;", "Lcc0/l$b;", "Lcc0/l$c;", "Lcc0/l$d;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {

    /* JADX INFO: renamed from: cc0.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcc0/l$a;", "Lcc0/l;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteDocument implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        public DeleteDocument(String str) {
            this.documentId = str;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcc0/l$b;", "Lcc0/l;", "Lhb4/c;", "a", "()Lhb4/c;", "errorVMSAdapter", "b", "c", "Lcc0/l$b$a;", "Lcc0/l$b$b;", "Lcc0/l$b$c;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends l {

        /* JADX INFO: renamed from: cc0.l$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcc0/l$b$a;", "Lcc0/l$b;", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ErrorInitial implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public ErrorInitial(hb4.c cVar) {
                this.errorVMSAdapter = cVar;
            }

            @Override // cc0.l.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public hb4.c getErrorVMSAdapter() {
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

        /* JADX INFO: renamed from: cc0.l$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lcc0/l$b$b;", "Lcc0/l$b;", "Lhb4/c;", "errorVMSAdapter", "", "documentId", "<init>", "(Lhb4/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "b", "Ljava/lang/String;", "d", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ErrorLoading implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentId;

            public ErrorLoading(hb4.c cVar, String str) {
                this.errorVMSAdapter = cVar;
                this.documentId = str;
            }

            @Override // cc0.l.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
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

        /* JADX INFO: renamed from: cc0.l$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcc0/l$b$c;", "Lcc0/l$b;", "Lhb4/c;", "errorVMSAdapter", "Lcb4/i;", "dialogVMSAdapter", "Lcc0/l$e;", "stateData", "<init>", "(Lhb4/c;Lcb4/i;Lcc0/l$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "b", "Lcb4/i;", "getDialogVMSAdapter", "()Lcb4/i;", "c", "Lcc0/l$e;", "()Lcc0/l$e;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ErrorUpdating implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            public ErrorUpdating(hb4.c cVar, cb4.i iVar, StateData stateData) {
                this.errorVMSAdapter = cVar;
                this.dialogVMSAdapter = iVar;
                this.stateData = stateData;
            }

            @Override // cc0.l.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final StateData getStateData() {
                return this.stateData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ErrorUpdating)) {
                    return false;
                }
                ErrorUpdating errorUpdating = (ErrorUpdating) other;
                return fr.t.c(this.errorVMSAdapter, errorUpdating.errorVMSAdapter) && fr.t.c(this.dialogVMSAdapter, errorUpdating.dialogVMSAdapter) && fr.t.c(this.stateData, errorUpdating.stateData);
            }

            public int hashCode() {
                int iHashCode = this.errorVMSAdapter.hashCode() * 31;
                cb4.i iVar = this.dialogVMSAdapter;
                return ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.stateData.hashCode();
            }

            public String toString() {
                return "ErrorUpdating(errorVMSAdapter=" + this.errorVMSAdapter + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ", stateData=" + this.stateData + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        hb4.c getErrorVMSAdapter();
    }

    /* JADX INFO: renamed from: cc0.l$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcc0/l$c;", "Lcc0/l;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        public Initial(String str) {
            this.documentId = str;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcc0/l$d;", "Lcc0/l;", "Lcb4/i;", "c", "()Lcb4/i;", "dialogVMSAdapter", "Lcc0/l$e;", "b", "()Lcc0/l$e;", "stateData", "a", "Lcc0/l$d$a;", "Lcc0/l$d$b;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d extends l {

        /* JADX INFO: renamed from: cc0.l$d$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcc0/l$d$a;", "Lcc0/l$d;", "Lcb4/i;", "dialogVMSAdapter", "Lcc0/l$e;", "stateData", "<init>", "(Lcb4/i;Lcc0/l$e;)V", "d", "(Lcb4/i;Lcc0/l$e;)Lcc0/l$d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/i;", "c", "()Lcb4/i;", "b", "Lcc0/l$e;", "()Lcc0/l$e;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displaying implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            public Displaying(cb4.i iVar, StateData stateData) {
                this.dialogVMSAdapter = iVar;
                this.stateData = stateData;
            }

            public static /* synthetic */ Displaying e(Displaying displaying, cb4.i iVar, StateData stateData, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    iVar = displaying.dialogVMSAdapter;
                }
                if ((i15 & 2) != 0) {
                    stateData = displaying.stateData;
                }
                return displaying.d(iVar, stateData);
            }

            @Override // cc0.l.d
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getStateData() {
                return this.stateData;
            }

            @Override // cc0.l.d
            /* JADX INFO: renamed from: c, reason: from getter */
            public cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            public final Displaying d(cb4.i dialogVMSAdapter, StateData stateData) {
                return new Displaying(dialogVMSAdapter, stateData);
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

        /* JADX INFO: renamed from: cc0.l$d$b, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcc0/l$d$b;", "Lcc0/l$d;", "Lcb4/i;", "dialogVMSAdapter", "Lcc0/l$e;", "stateData", "<init>", "(Lcb4/i;Lcc0/l$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/i;", "c", "()Lcb4/i;", "b", "Lcc0/l$e;", "()Lcc0/l$e;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Updating implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData stateData;

            public Updating(cb4.i iVar, StateData stateData) {
                this.dialogVMSAdapter = iVar;
                this.stateData = stateData;
            }

            @Override // cc0.l.d
            /* JADX INFO: renamed from: b, reason: from getter */
            public StateData getStateData() {
                return this.stateData;
            }

            @Override // cc0.l.d
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

    /* JADX INFO: renamed from: cc0.l$e, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jl\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b/\u0010\u0017R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b*\u00104\u001a\u0004\b%\u00105¨\u00066"}, d2 = {"Lcc0/l$e;", "", "Landroid/graphics/Bitmap;", "imageBitmap", "Lbc0/b;", "photoData", "Lvb0/e;", "familyCards", "Lvb0/b;", "selectedCard", "Ly30/n$b$b;", "selectedItem", "", "isBottomSheetVisible", "", "parentDocumentId", "", "cardNumberQrBitmaps", "<init>", "(Landroid/graphics/Bitmap;Lbc0/b;Lvb0/e;Lvb0/b;Ly30/n$b$b;ZLjava/lang/String;Ljava/util/Map;)V", "a", "(Landroid/graphics/Bitmap;Lbc0/b;Lvb0/e;Lvb0/b;Ly30/n$b$b;ZLjava/lang/String;Ljava/util/Map;)Lcc0/l$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "b", "Lbc0/b;", "g", "()Lbc0/b;", "c", "Lvb0/e;", "d", "()Lvb0/e;", "Lvb0/b;", "h", "()Lvb0/b;", "Ly30/n$b$b;", "i", "()Ly30/n$b$b;", "f", "Z", "j", "()Z", "Ljava/lang/String;", "Ljava/util/Map;", "()Ljava/util/Map;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StateData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap imageBitmap;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentPhotoData photoData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FamilyCards familyCards;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final FamilyCardDocument selectedCard;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final y30.n.Switch.EnumC5973b selectedItem;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isBottomSheetVisible;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String parentDocumentId;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, Bitmap> cardNumberQrBitmaps;

        public StateData(Bitmap bitmap, DocumentPhotoData documentPhotoData, FamilyCards familyCards, FamilyCardDocument familyCardDocument, y30.n.Switch.EnumC5973b enumC5973b, boolean z15, String str, Map<String, Bitmap> map) {
            this.imageBitmap = bitmap;
            this.photoData = documentPhotoData;
            this.familyCards = familyCards;
            this.selectedCard = familyCardDocument;
            this.selectedItem = enumC5973b;
            this.isBottomSheetVisible = z15;
            this.parentDocumentId = str;
            this.cardNumberQrBitmaps = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateData b(StateData stateData, Bitmap bitmap, DocumentPhotoData documentPhotoData, FamilyCards familyCards, FamilyCardDocument familyCardDocument, y30.n.Switch.EnumC5973b enumC5973b, boolean z15, String str, Map map, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bitmap = stateData.imageBitmap;
            }
            if ((i15 & 2) != 0) {
                documentPhotoData = stateData.photoData;
            }
            if ((i15 & 4) != 0) {
                familyCards = stateData.familyCards;
            }
            if ((i15 & 8) != 0) {
                familyCardDocument = stateData.selectedCard;
            }
            if ((i15 & 16) != 0) {
                enumC5973b = stateData.selectedItem;
            }
            if ((i15 & 32) != 0) {
                z15 = stateData.isBottomSheetVisible;
            }
            if ((i15 & 64) != 0) {
                str = stateData.parentDocumentId;
            }
            if ((i15 & 128) != 0) {
                map = stateData.cardNumberQrBitmaps;
            }
            String str2 = str;
            Map map2 = map;
            y30.n.Switch.EnumC5973b enumC5973b2 = enumC5973b;
            boolean z16 = z15;
            return stateData.a(bitmap, documentPhotoData, familyCards, familyCardDocument, enumC5973b2, z16, str2, map2);
        }

        public final StateData a(Bitmap imageBitmap, DocumentPhotoData photoData, FamilyCards familyCards, FamilyCardDocument selectedCard, y30.n.Switch.EnumC5973b selectedItem, boolean isBottomSheetVisible, String parentDocumentId, Map<String, Bitmap> cardNumberQrBitmaps) {
            return new StateData(imageBitmap, photoData, familyCards, selectedCard, selectedItem, isBottomSheetVisible, parentDocumentId, cardNumberQrBitmaps);
        }

        public final Map<String, Bitmap> c() {
            return this.cardNumberQrBitmaps;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final FamilyCards getFamilyCards() {
            return this.familyCards;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Bitmap getImageBitmap() {
            return this.imageBitmap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateData)) {
                return false;
            }
            StateData stateData = (StateData) other;
            return fr.t.c(this.imageBitmap, stateData.imageBitmap) && fr.t.c(this.photoData, stateData.photoData) && fr.t.c(this.familyCards, stateData.familyCards) && fr.t.c(this.selectedCard, stateData.selectedCard) && this.selectedItem == stateData.selectedItem && this.isBottomSheetVisible == stateData.isBottomSheetVisible && fr.t.c(this.parentDocumentId, stateData.parentDocumentId) && fr.t.c(this.cardNumberQrBitmaps, stateData.cardNumberQrBitmaps);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getParentDocumentId() {
            return this.parentDocumentId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final DocumentPhotoData getPhotoData() {
            return this.photoData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final FamilyCardDocument getSelectedCard() {
            return this.selectedCard;
        }

        public int hashCode() {
            return (((((((((((((this.imageBitmap.hashCode() * 31) + this.photoData.hashCode()) * 31) + this.familyCards.hashCode()) * 31) + this.selectedCard.hashCode()) * 31) + this.selectedItem.hashCode()) * 31) + Boolean.hashCode(this.isBottomSheetVisible)) * 31) + this.parentDocumentId.hashCode()) * 31) + this.cardNumberQrBitmaps.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final y30.n.Switch.EnumC5973b getSelectedItem() {
            return this.selectedItem;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsBottomSheetVisible() {
            return this.isBottomSheetVisible;
        }

        public String toString() {
            return "StateData(imageBitmap=" + this.imageBitmap + ", photoData=" + this.photoData + ", familyCards=" + this.familyCards + ", selectedCard=" + this.selectedCard + ", selectedItem=" + this.selectedItem + ", isBottomSheetVisible=" + this.isBottomSheetVisible + ", parentDocumentId=" + this.parentDocumentId + ", cardNumberQrBitmaps=" + this.cardNumberQrBitmaps + ')';
        }

        public /* synthetic */ StateData(Bitmap bitmap, DocumentPhotoData documentPhotoData, FamilyCards familyCards, FamilyCardDocument familyCardDocument, y30.n.Switch.EnumC5973b enumC5973b, boolean z15, String str, Map map, int i15, fr.k kVar) {
            this(bitmap, documentPhotoData, familyCards, familyCardDocument, enumC5973b, (i15 & 32) != 0 ? false : z15, str, map);
        }
    }
}
