package we0;

import android.graphics.Bitmap;
import p071kotlin.Metadata;
import pe0.VerificationDocumentData;
import ye0.SecondDocumentInfo;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lwe0/b;", "", "b", "c", "a", "d", "Lwe0/b$a;", "Lwe0/b$b;", "Lwe0/b$c;", "Lwe0/b$d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: we0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwe0/b$a;", "Lwe0/b;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitError implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public InitError(hb4.c cVar) {
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitError) && fr.t.c(this.errorVMS, ((InitError) other).errorVMS);
        }

        public int hashCode() {
            return this.errorVMS.hashCode();
        }

        public String toString() {
            return "InitError(errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: we0.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lwe0/b$b;", "Lwe0/b;", "Lwe0/i0;", "data", "Lpe0/d;", "documentData", "<init>", "(Lwe0/i0;Lpe0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwe0/i0;", "()Lwe0/i0;", "b", "Lpe0/d;", "()Lpe0/d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final VerificationDataModel data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final VerificationDocumentData documentData;

        public Initial(VerificationDataModel verificationDataModel, VerificationDocumentData verificationDocumentData) {
            this.data = verificationDataModel;
            this.documentData = verificationDocumentData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final VerificationDataModel getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final VerificationDocumentData getDocumentData() {
            return this.documentData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initial)) {
                return false;
            }
            Initial initial = (Initial) other;
            return fr.t.c(this.data, initial.data) && fr.t.c(this.documentData, initial.documentData);
        }

        public int hashCode() {
            VerificationDataModel verificationDataModel = this.data;
            int iHashCode = (verificationDataModel == null ? 0 : verificationDataModel.hashCode()) * 31;
            VerificationDocumentData verificationDocumentData = this.documentData;
            return iHashCode + (verificationDocumentData != null ? verificationDocumentData.hashCode() : 0);
        }

        public String toString() {
            return "Initial(data=" + this.data + ", documentData=" + this.documentData + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\t\n\u0006\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lwe0/b$c;", "Lwe0/b;", "Lwe0/b$c$d;", "data", "<init>", "(Lwe0/b$c$d;)V", "a", "Lwe0/b$c$d;", "()Lwe0/b$c$d;", "c", "e", "b", "d", "Lwe0/b$c$a;", "Lwe0/b$c$b;", "Lwe0/b$c$c;", "Lwe0/b$c$e;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final StateData data;

        /* JADX INFO: renamed from: we0.b$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwe0/b$c$a;", "Lwe0/b$c;", "Lwe0/b$c$d;", "data", "<init>", "(Lwe0/b$c$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lwe0/b$c$d;", "a", "()Lwe0/b$c$d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckVerificationStatus extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            public CheckVerificationStatus(StateData stateData) {
                super(stateData, null);
                this.data = stateData;
            }

            @Override // we0.b.c
            /* JADX INFO: renamed from: a, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckVerificationStatus) && fr.t.c(this.data, ((CheckVerificationStatus) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "CheckVerificationStatus(data=" + this.data + ')';
            }
        }

        /* JADX INFO: renamed from: we0.b$c$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwe0/b$c$b;", "Lwe0/b$c;", "Lwe0/b$c$d;", "data", "Lhb4/c;", "errorVMS", "<init>", "(Lwe0/b$c$d;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lwe0/b$c$d;", "a", "()Lwe0/b$c$d;", "c", "Lhb4/c;", "()Lhb4/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(StateData stateData, hb4.c cVar) {
                super(stateData, null);
                this.data = stateData;
                this.errorVMS = cVar;
            }

            @Override // we0.b.c
            /* JADX INFO: renamed from: a, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.data, error.data) && fr.t.c(this.errorVMS, error.errorVMS);
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(data=" + this.data + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: we0.b$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwe0/b$c$c;", "Lwe0/b$c;", "Lwe0/b$c$d;", "data", "<init>", "(Lwe0/b$c$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lwe0/b$c$d;", "a", "()Lwe0/b$c$d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            public Initialized(StateData stateData) {
                super(stateData, null);
                this.data = stateData;
            }

            @Override // we0.b.c
            /* JADX INFO: renamed from: a, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initialized) && fr.t.c(this.data, ((Initialized) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Initialized(data=" + this.data + ')';
            }
        }

        /* JADX INFO: renamed from: we0.b$c$d, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJF\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\"\u0010'¨\u0006("}, d2 = {"Lwe0/b$c$d;", "", "", "documentId", "Lwe0/i0;", "data", "Landroid/graphics/Bitmap;", "imageBitmap", "Lye0/a;", "secondDocumentInfo", "Lpe0/d;", "documentData", "<init>", "(Ljava/lang/String;Lwe0/i0;Landroid/graphics/Bitmap;Lye0/a;Lpe0/d;)V", "a", "(Ljava/lang/String;Lwe0/i0;Landroid/graphics/Bitmap;Lye0/a;Lpe0/d;)Lwe0/b$c$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocumentId", "b", "Lwe0/i0;", "c", "()Lwe0/i0;", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "d", "Lye0/a;", "f", "()Lye0/a;", "Lpe0/d;", "()Lpe0/d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StateData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final VerificationDataModel data;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Bitmap imageBitmap;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final SecondDocumentInfo secondDocumentInfo;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final VerificationDocumentData documentData;

            public StateData(String str, VerificationDataModel verificationDataModel, Bitmap bitmap, SecondDocumentInfo secondDocumentInfo, VerificationDocumentData verificationDocumentData) {
                this.documentId = str;
                this.data = verificationDataModel;
                this.imageBitmap = bitmap;
                this.secondDocumentInfo = secondDocumentInfo;
                this.documentData = verificationDocumentData;
            }

            public static /* synthetic */ StateData b(StateData stateData, String str, VerificationDataModel verificationDataModel, Bitmap bitmap, SecondDocumentInfo secondDocumentInfo, VerificationDocumentData verificationDocumentData, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    str = stateData.documentId;
                }
                if ((i15 & 2) != 0) {
                    verificationDataModel = stateData.data;
                }
                if ((i15 & 4) != 0) {
                    bitmap = stateData.imageBitmap;
                }
                if ((i15 & 8) != 0) {
                    secondDocumentInfo = stateData.secondDocumentInfo;
                }
                if ((i15 & 16) != 0) {
                    verificationDocumentData = stateData.documentData;
                }
                VerificationDocumentData verificationDocumentData2 = verificationDocumentData;
                Bitmap bitmap2 = bitmap;
                return stateData.a(str, verificationDataModel, bitmap2, secondDocumentInfo, verificationDocumentData2);
            }

            public final StateData a(String documentId, VerificationDataModel data, Bitmap imageBitmap, SecondDocumentInfo secondDocumentInfo, VerificationDocumentData documentData) {
                return new StateData(documentId, data, imageBitmap, secondDocumentInfo, documentData);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final VerificationDataModel getData() {
                return this.data;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final VerificationDocumentData getDocumentData() {
                return this.documentData;
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
                return fr.t.c(this.documentId, stateData.documentId) && fr.t.c(this.data, stateData.data) && fr.t.c(this.imageBitmap, stateData.imageBitmap) && fr.t.c(this.secondDocumentInfo, stateData.secondDocumentInfo) && fr.t.c(this.documentData, stateData.documentData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final SecondDocumentInfo getSecondDocumentInfo() {
                return this.secondDocumentInfo;
            }

            public int hashCode() {
                int iHashCode = ((this.documentId.hashCode() * 31) + this.data.hashCode()) * 31;
                Bitmap bitmap = this.imageBitmap;
                int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
                SecondDocumentInfo secondDocumentInfo = this.secondDocumentInfo;
                return ((iHashCode2 + (secondDocumentInfo != null ? secondDocumentInfo.hashCode() : 0)) * 31) + this.documentData.hashCode();
            }

            public String toString() {
                return "StateData(documentId=" + this.documentId + ", data=" + this.data + ", imageBitmap=" + this.imageBitmap + ", secondDocumentInfo=" + this.secondDocumentInfo + ", documentData=" + this.documentData + ')';
            }
        }

        /* JADX INFO: renamed from: we0.b$c$e, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwe0/b$c$e;", "Lwe0/b$c;", "Lwe0/b$c$d;", "data", "<init>", "(Lwe0/b$c$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lwe0/b$c$d;", "a", "()Lwe0/b$c$d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class VerifyData extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StateData data;

            public VerifyData(StateData stateData) {
                super(stateData, null);
                this.data = stateData;
            }

            @Override // we0.b.c
            /* JADX INFO: renamed from: a, reason: from getter */
            public StateData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VerifyData) && fr.t.c(this.data, ((VerifyData) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "VerifyData(data=" + this.data + ')';
            }
        }

        public /* synthetic */ c(StateData stateData, fr.k kVar) {
            this(stateData);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public StateData getData() {
            return this.data;
        }

        private c(StateData stateData) {
            this.data = stateData;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwe0/b$d;", "Lwe0/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f212577a = new d();

        private d() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -911655816;
        }

        public String toString() {
            return "Success";
        }
    }
}
