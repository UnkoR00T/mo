package ne0;

import android.graphics.Bitmap;
import ie0.UutCardDocument;
import java.util.List;
import me0.DocumentPhotoData;
import me0.UutCardBottomSheetData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lne0/p;", "", "c", "d", "e", "a", "b", "Lne0/p$a;", "Lne0/p$b;", "Lne0/p$c;", "Lne0/p$d;", "Lne0/p$e;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p {

    /* JADX INFO: renamed from: ne0.p$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lne0/p$a;", "Lne0/p;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteDocument implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        public DeleteDocument(String str) {
            this.documentId = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lne0/p$b;", "Lne0/p;", "Lhb4/c;", "a", "()Lhb4/c;", "errorVMSAdapter", "b", "Lne0/p$b$a;", "Lne0/p$b$b;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends p {

        /* JADX INFO: renamed from: ne0.p$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lne0/p$b$a;", "Lne0/p$b;", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InitialError implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public InitialError(hb4.c cVar) {
                this.errorVMSAdapter = cVar;
            }

            @Override // ne0.p.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InitialError) && fr.t.c(this.errorVMSAdapter, ((InitialError) other).errorVMSAdapter);
            }

            public int hashCode() {
                return this.errorVMSAdapter.hashCode();
            }

            public String toString() {
                return "InitialError(errorVMSAdapter=" + this.errorVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: ne0.p$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lne0/p$b$b;", "Lne0/p$b;", "Lhb4/c;", "errorVMSAdapter", "", "documentId", "<init>", "(Lhb4/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "b", "Ljava/lang/String;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LoadingError implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentId;

            public LoadingError(hb4.c cVar, String str) {
                this.errorVMSAdapter = cVar;
                this.documentId = str;
            }

            @Override // ne0.p.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadingError)) {
                    return false;
                }
                LoadingError loadingError = (LoadingError) other;
                return fr.t.c(this.errorVMSAdapter, loadingError.errorVMSAdapter) && fr.t.c(this.documentId, loadingError.documentId);
            }

            public int hashCode() {
                return (this.errorVMSAdapter.hashCode() * 31) + this.documentId.hashCode();
            }

            public String toString() {
                return "LoadingError(errorVMSAdapter=" + this.errorVMSAdapter + ", documentId=" + this.documentId + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        hb4.c getErrorVMSAdapter();
    }

    /* JADX INFO: renamed from: ne0.p$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lne0/p$c;", "Lne0/p;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        public Initial(String str) {
            this.documentId = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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

    /* JADX INFO: renamed from: ne0.p$e, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lne0/p$e;", "Lne0/p;", "", "documentId", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Ljava/lang/String;Lcb4/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcb4/i;", "getDialogVMSAdapter", "()Lcb4/i;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Updating implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        public Updating(String str, cb4.i iVar) {
            this.documentId = str;
            this.dialogVMSAdapter = iVar;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Updating)) {
                return false;
            }
            Updating updating = (Updating) other;
            return fr.t.c(this.documentId, updating.documentId) && fr.t.c(this.dialogVMSAdapter, updating.dialogVMSAdapter);
        }

        public int hashCode() {
            int iHashCode = this.documentId.hashCode() * 31;
            cb4.i iVar = this.dialogVMSAdapter;
            return iHashCode + (iVar == null ? 0 : iVar.hashCode());
        }

        public String toString() {
            return "Updating(documentId=" + this.documentId + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
        }
    }

    /* JADX INFO: renamed from: ne0.p$d, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0080\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b'\u0010:\u001a\u0004\b1\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b-\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b%\u0010>\u001a\u0004\b5\u0010?¨\u0006@"}, d2 = {"Lne0/p$d;", "Lne0/p;", "", "parentDocumentId", "Landroid/graphics/Bitmap;", "imageBitmap", "Lme0/b;", "photoData", "", "Lie0/d;", "familyMembersCards", "ownCard", "selectedCard", "Ly30/n$b$b;", "selectedItem", "Lg30/v;", "bottomSheetValue", "Lme0/d;", "bottomSheetContentData", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Ljava/lang/String;Landroid/graphics/Bitmap;Lme0/b;Ljava/util/List;Lie0/d;Lie0/d;Ly30/n$b$b;Lg30/v;Lme0/d;Lcb4/i;)V", "b", "(Ljava/lang/String;Landroid/graphics/Bitmap;Lme0/b;Ljava/util/List;Lie0/d;Lie0/d;Ly30/n$b$b;Lg30/v;Lme0/d;Lcb4/i;)Lne0/p$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "j", "Landroid/graphics/Bitmap;", "h", "()Landroid/graphics/Bitmap;", "c", "Lme0/b;", "k", "()Lme0/b;", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "e", "Lie0/d;", "i", "()Lie0/d;", "f", "l", "Ly30/n$b$b;", "m", "()Ly30/n$b$b;", "Lg30/v;", "()Lg30/v;", "Lme0/d;", "()Lme0/d;", "Lcb4/i;", "()Lcb4/i;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String parentDocumentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap imageBitmap;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentPhotoData photoData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<UutCardDocument> familyMembersCards;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final UutCardDocument ownCard;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final UutCardDocument selectedCard;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final y30.n.Switch.EnumC5973b selectedItem;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final g30.v bottomSheetValue;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final UutCardBottomSheetData bottomSheetContentData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        public Initialized(String str, Bitmap bitmap, DocumentPhotoData documentPhotoData, List<UutCardDocument> list, UutCardDocument uutCardDocument, UutCardDocument uutCardDocument2, y30.n.Switch.EnumC5973b enumC5973b, g30.v vVar, UutCardBottomSheetData uutCardBottomSheetData, cb4.i iVar) {
            this.parentDocumentId = str;
            this.imageBitmap = bitmap;
            this.photoData = documentPhotoData;
            this.familyMembersCards = list;
            this.ownCard = uutCardDocument;
            this.selectedCard = uutCardDocument2;
            this.selectedItem = enumC5973b;
            this.bottomSheetValue = vVar;
            this.bottomSheetContentData = uutCardBottomSheetData;
            this.dialogVMSAdapter = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized c(Initialized initialized, String str, Bitmap bitmap, DocumentPhotoData documentPhotoData, List list, UutCardDocument uutCardDocument, UutCardDocument uutCardDocument2, y30.n.Switch.EnumC5973b enumC5973b, g30.v vVar, UutCardBottomSheetData uutCardBottomSheetData, cb4.i iVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = initialized.parentDocumentId;
            }
            if ((i15 & 2) != 0) {
                bitmap = initialized.imageBitmap;
            }
            if ((i15 & 4) != 0) {
                documentPhotoData = initialized.photoData;
            }
            if ((i15 & 8) != 0) {
                list = initialized.familyMembersCards;
            }
            if ((i15 & 16) != 0) {
                uutCardDocument = initialized.ownCard;
            }
            if ((i15 & 32) != 0) {
                uutCardDocument2 = initialized.selectedCard;
            }
            if ((i15 & 64) != 0) {
                enumC5973b = initialized.selectedItem;
            }
            if ((i15 & 128) != 0) {
                vVar = initialized.bottomSheetValue;
            }
            if ((i15 & 256) != 0) {
                uutCardBottomSheetData = initialized.bottomSheetContentData;
            }
            if ((i15 & 512) != 0) {
                iVar = initialized.dialogVMSAdapter;
            }
            UutCardBottomSheetData uutCardBottomSheetData2 = uutCardBottomSheetData;
            cb4.i iVar2 = iVar;
            y30.n.Switch.EnumC5973b enumC5973b2 = enumC5973b;
            g30.v vVar2 = vVar;
            UutCardDocument uutCardDocument3 = uutCardDocument;
            UutCardDocument uutCardDocument4 = uutCardDocument2;
            return initialized.b(str, bitmap, documentPhotoData, list, uutCardDocument3, uutCardDocument4, enumC5973b2, vVar2, uutCardBottomSheetData2, iVar2);
        }

        public final Initialized b(String parentDocumentId, Bitmap imageBitmap, DocumentPhotoData photoData, List<UutCardDocument> familyMembersCards, UutCardDocument ownCard, UutCardDocument selectedCard, y30.n.Switch.EnumC5973b selectedItem, g30.v bottomSheetValue, UutCardBottomSheetData bottomSheetContentData, cb4.i dialogVMSAdapter) {
            return new Initialized(parentDocumentId, imageBitmap, photoData, familyMembersCards, ownCard, selectedCard, selectedItem, bottomSheetValue, bottomSheetContentData, dialogVMSAdapter);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final UutCardBottomSheetData getBottomSheetContentData() {
            return this.bottomSheetContentData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final g30.v getBottomSheetValue() {
            return this.bottomSheetValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.parentDocumentId, initialized.parentDocumentId) && fr.t.c(this.imageBitmap, initialized.imageBitmap) && fr.t.c(this.photoData, initialized.photoData) && fr.t.c(this.familyMembersCards, initialized.familyMembersCards) && fr.t.c(this.ownCard, initialized.ownCard) && fr.t.c(this.selectedCard, initialized.selectedCard) && this.selectedItem == initialized.selectedItem && this.bottomSheetValue == initialized.bottomSheetValue && fr.t.c(this.bottomSheetContentData, initialized.bottomSheetContentData) && fr.t.c(this.dialogVMSAdapter, initialized.dialogVMSAdapter);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final cb4.i getDialogVMSAdapter() {
            return this.dialogVMSAdapter;
        }

        public final List<UutCardDocument> g() {
            return this.familyMembersCards;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Bitmap getImageBitmap() {
            return this.imageBitmap;
        }

        public int hashCode() {
            int iHashCode = this.parentDocumentId.hashCode() * 31;
            Bitmap bitmap = this.imageBitmap;
            int iHashCode2 = (((((((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.photoData.hashCode()) * 31) + this.familyMembersCards.hashCode()) * 31) + this.ownCard.hashCode()) * 31) + this.selectedCard.hashCode()) * 31) + this.selectedItem.hashCode()) * 31) + this.bottomSheetValue.hashCode()) * 31;
            UutCardBottomSheetData uutCardBottomSheetData = this.bottomSheetContentData;
            int iHashCode3 = (iHashCode2 + (uutCardBottomSheetData == null ? 0 : uutCardBottomSheetData.hashCode())) * 31;
            cb4.i iVar = this.dialogVMSAdapter;
            return iHashCode3 + (iVar != null ? iVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final UutCardDocument getOwnCard() {
            return this.ownCard;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getParentDocumentId() {
            return this.parentDocumentId;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final DocumentPhotoData getPhotoData() {
            return this.photoData;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final UutCardDocument getSelectedCard() {
            return this.selectedCard;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final y30.n.Switch.EnumC5973b getSelectedItem() {
            return this.selectedItem;
        }

        public String toString() {
            return "Initialized(parentDocumentId=" + this.parentDocumentId + ", imageBitmap=" + this.imageBitmap + ", photoData=" + this.photoData + ", familyMembersCards=" + this.familyMembersCards + ", ownCard=" + this.ownCard + ", selectedCard=" + this.selectedCard + ", selectedItem=" + this.selectedItem + ", bottomSheetValue=" + this.bottomSheetValue + ", bottomSheetContentData=" + this.bottomSheetContentData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
        }

        public /* synthetic */ Initialized(String str, Bitmap bitmap, DocumentPhotoData documentPhotoData, List list, UutCardDocument uutCardDocument, UutCardDocument uutCardDocument2, y30.n.Switch.EnumC5973b enumC5973b, g30.v vVar, UutCardBottomSheetData uutCardBottomSheetData, cb4.i iVar, int i15, fr.k kVar) {
            this(str, bitmap, documentPhotoData, list, uutCardDocument, uutCardDocument2, enumC5973b, (i15 & 128) != 0 ? g30.v.HIDDEN : vVar, (i15 & 256) != 0 ? null : uutCardBottomSheetData, (i15 & 512) != 0 ? null : iVar);
        }
    }
}
