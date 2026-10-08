package za1;

import java.util.List;
import ma1.CompanyRepresentative;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lza1/b;", "", "d", "c", "e", "a", "b", "Lza1/b$a;", "Lza1/b$b;", "Lza1/b$c;", "Lza1/b$d;", "Lza1/b$e;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: za1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, d2 = {"Lza1/b$a;", "Lza1/b;", "Lhb4/c;", "errorVMS", "", "entryId", "<init>", "(Lhb4/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "b", "()Lhb4/c;", "Ljava/lang/String;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorInitial implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String entryId;

        public ErrorInitial(hb4.c cVar, String str) {
            this.errorVMS = cVar;
            this.entryId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEntryId() {
            return this.entryId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorInitial)) {
                return false;
            }
            ErrorInitial errorInitial = (ErrorInitial) other;
            return fr.t.c(this.errorVMS, errorInitial.errorVMS) && fr.t.c(this.entryId, errorInitial.entryId);
        }

        public int hashCode() {
            return (this.errorVMS.hashCode() * 31) + this.entryId.hashCode();
        }

        public String toString() {
            return "ErrorInitial(errorVMS=" + this.errorVMS + ", entryId=" + this.entryId + ')';
        }
    }

    /* JADX INFO: renamed from: za1.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010\u000fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006#"}, d2 = {"Lza1/b$b;", "Lza1/b;", "", "ownerAdult", "Lhb4/c;", "errorVMS", "", "entryId", "", "Lma1/n;", "representatives", "representativeId", "<init>", "(ZLhb4/c;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lhb4/c;", "()Lhb4/c;", "Ljava/lang/String;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorRemovingRepresentative implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean ownerAdult;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String entryId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CompanyRepresentative> representatives;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String representativeId;

        public ErrorRemovingRepresentative(boolean z15, hb4.c cVar, String str, List<CompanyRepresentative> list, String str2) {
            this.ownerAdult = z15;
            this.errorVMS = cVar;
            this.entryId = str;
            this.representatives = list;
            this.representativeId = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEntryId() {
            return this.entryId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getOwnerAdult() {
            return this.ownerAdult;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRepresentativeId() {
            return this.representativeId;
        }

        public final List<CompanyRepresentative> e() {
            return this.representatives;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorRemovingRepresentative)) {
                return false;
            }
            ErrorRemovingRepresentative errorRemovingRepresentative = (ErrorRemovingRepresentative) other;
            return this.ownerAdult == errorRemovingRepresentative.ownerAdult && fr.t.c(this.errorVMS, errorRemovingRepresentative.errorVMS) && fr.t.c(this.entryId, errorRemovingRepresentative.entryId) && fr.t.c(this.representatives, errorRemovingRepresentative.representatives) && fr.t.c(this.representativeId, errorRemovingRepresentative.representativeId);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.ownerAdult) * 31) + this.errorVMS.hashCode()) * 31) + this.entryId.hashCode()) * 31) + this.representatives.hashCode()) * 31) + this.representativeId.hashCode();
        }

        public String toString() {
            return "ErrorRemovingRepresentative(ownerAdult=" + this.ownerAdult + ", errorVMS=" + this.errorVMS + ", entryId=" + this.entryId + ", representatives=" + this.representatives + ", representativeId=" + this.representativeId + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0012\u000b\u000fB'\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lza1/b$c;", "Lza1/b;", "", "entryId", "", "Lma1/n;", "representatives", "", "ownerAdult", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "a", "Ljava/lang/String;", "getEntryId", "()Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Z", "getOwnerAdult", "()Z", "Lza1/b$c$a;", "Lza1/b$c$b;", "Lza1/b$c$c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String entryId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<CompanyRepresentative> representatives;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean ownerAdult;

        /* JADX INFO: renamed from: za1.b$c$a, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0016\u0010#¨\u0006$"}, d2 = {"Lza1/b$c$a;", "Lza1/b$c;", "", "entryId", "", "Lma1/n;", "representatives", "Lcb4/i;", "dialogVMSAdapter", "", "ownerAdult", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcb4/i;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "c", "e", "Ljava/util/List;", "a", "()Ljava/util/List;", "f", "Lcb4/i;", "b", "()Lcb4/i;", "g", "Z", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog extends c {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String entryId;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<CompanyRepresentative> representatives;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean ownerAdult;

            public Dialog(String str, List<CompanyRepresentative> list, cb4.i iVar, boolean z15) {
                super(str, list, z15, null);
                this.entryId = str;
                this.representatives = list;
                this.dialogVMSAdapter = iVar;
                this.ownerAdult = z15;
            }

            @Override // za1.b.c
            public List<CompanyRepresentative> a() {
                return this.representatives;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public String getEntryId() {
                return this.entryId;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public boolean getOwnerAdult() {
                return this.ownerAdult;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) other;
                return fr.t.c(this.entryId, dialog.entryId) && fr.t.c(this.representatives, dialog.representatives) && fr.t.c(this.dialogVMSAdapter, dialog.dialogVMSAdapter) && this.ownerAdult == dialog.ownerAdult;
            }

            public int hashCode() {
                return (((((this.entryId.hashCode() * 31) + this.representatives.hashCode()) * 31) + this.dialogVMSAdapter.hashCode()) * 31) + Boolean.hashCode(this.ownerAdult);
            }

            public String toString() {
                return "Dialog(entryId=" + this.entryId + ", representatives=" + this.representatives + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ", ownerAdult=" + this.ownerAdult + ')';
            }
        }

        /* JADX INFO: renamed from: za1.b$c$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lza1/b$c$b;", "Lza1/b$c;", "", "entryId", "", "Lma1/n;", "representatives", "representativeId", "", "ownerAdult", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "e", "Ljava/util/List;", "a", "()Ljava/util/List;", "f", "g", "Z", "c", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RemovingRepresentative extends c {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String entryId;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<CompanyRepresentative> representatives;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final String representativeId;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean ownerAdult;

            public RemovingRepresentative(String str, List<CompanyRepresentative> list, String str2, boolean z15) {
                super(str, list, z15, null);
                this.entryId = str;
                this.representatives = list;
                this.representativeId = str2;
                this.ownerAdult = z15;
            }

            @Override // za1.b.c
            public List<CompanyRepresentative> a() {
                return this.representatives;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public String getEntryId() {
                return this.entryId;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public boolean getOwnerAdult() {
                return this.ownerAdult;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getRepresentativeId() {
                return this.representativeId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RemovingRepresentative)) {
                    return false;
                }
                RemovingRepresentative removingRepresentative = (RemovingRepresentative) other;
                return fr.t.c(this.entryId, removingRepresentative.entryId) && fr.t.c(this.representatives, removingRepresentative.representatives) && fr.t.c(this.representativeId, removingRepresentative.representativeId) && this.ownerAdult == removingRepresentative.ownerAdult;
            }

            public int hashCode() {
                return (((((this.entryId.hashCode() * 31) + this.representatives.hashCode()) * 31) + this.representativeId.hashCode()) * 31) + Boolean.hashCode(this.ownerAdult);
            }

            public String toString() {
                return "RemovingRepresentative(entryId=" + this.entryId + ", representatives=" + this.representatives + ", representativeId=" + this.representativeId + ", ownerAdult=" + this.ownerAdult + ')';
            }
        }

        /* JADX INFO: renamed from: za1.b$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lza1/b$c$c;", "Lza1/b$c;", "", "entryId", "", "Lma1/n;", "representatives", "", "ownerAdult", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "b", "e", "Ljava/util/List;", "a", "()Ljava/util/List;", "f", "Z", "c", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen extends c {

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String entryId;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<CompanyRepresentative> representatives;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean ownerAdult;

            public Screen(String str, List<CompanyRepresentative> list, boolean z15) {
                super(str, list, z15, null);
                this.entryId = str;
                this.representatives = list;
                this.ownerAdult = z15;
            }

            @Override // za1.b.c
            public List<CompanyRepresentative> a() {
                return this.representatives;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public String getEntryId() {
                return this.entryId;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public boolean getOwnerAdult() {
                return this.ownerAdult;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Screen)) {
                    return false;
                }
                Screen screen = (Screen) other;
                return fr.t.c(this.entryId, screen.entryId) && fr.t.c(this.representatives, screen.representatives) && this.ownerAdult == screen.ownerAdult;
            }

            public int hashCode() {
                return (((this.entryId.hashCode() * 31) + this.representatives.hashCode()) * 31) + Boolean.hashCode(this.ownerAdult);
            }

            public String toString() {
                return "Screen(entryId=" + this.entryId + ", representatives=" + this.representatives + ", ownerAdult=" + this.ownerAdult + ')';
            }
        }

        public /* synthetic */ c(String str, List list, boolean z15, fr.k kVar) {
            this(str, list, z15);
        }

        public List<CompanyRepresentative> a() {
            return this.representatives;
        }

        private c(String str, List<CompanyRepresentative> list, boolean z15) {
            this.entryId = str;
            this.representatives = list;
            this.ownerAdult = z15;
        }
    }

    /* JADX INFO: renamed from: za1.b$d, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lza1/b$d;", "Lza1/b;", "", "entryId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String entryId;

        public Loading(String str) {
            this.entryId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEntryId() {
            return this.entryId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && fr.t.c(this.entryId, ((Loading) other).entryId);
        }

        public int hashCode() {
            return this.entryId.hashCode();
        }

        public String toString() {
            return "Loading(entryId=" + this.entryId + ')';
        }
    }

    /* JADX INFO: renamed from: za1.b$e, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lza1/b$e;", "Lza1/b;", "", "entryId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepresentativeRemovedSuccess implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String entryId;

        public RepresentativeRemovedSuccess(String str) {
            this.entryId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEntryId() {
            return this.entryId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RepresentativeRemovedSuccess) && fr.t.c(this.entryId, ((RepresentativeRemovedSuccess) other).entryId);
        }

        public int hashCode() {
            return this.entryId.hashCode();
        }

        public String toString() {
            return "RepresentativeRemovedSuccess(entryId=" + this.entryId + ')';
        }
    }
}
