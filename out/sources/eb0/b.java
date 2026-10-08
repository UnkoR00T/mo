package eb0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Leb0/b;", "", "b", "a", "Leb0/b$a;", "Leb0/b$b;", "documentloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: eb0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Leb0/b$a;", "Leb0/b;", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "documentloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMSAdapter;

        public Error(hb4.c cVar) {
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
            return (other instanceof Error) && fr.t.c(this.errorVMSAdapter, ((Error) other).errorVMSAdapter);
        }

        public int hashCode() {
            return this.errorVMSAdapter.hashCode();
        }

        public String toString() {
            return "Error(errorVMSAdapter=" + this.errorVMSAdapter + ')';
        }
    }

    /* JADX INFO: renamed from: eb0.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Leb0/b$b;", "Leb0/b;", "", "allowTermination", "Lcb4/i;", "terminationDialog", "Lcf0/c;", "documentType", "<init>", "(ZLcb4/i;Lcf0/c;)V", "a", "(ZLcb4/i;Lcf0/c;)Leb0/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "Lcb4/i;", "e", "()Lcb4/i;", "Lcf0/c;", "d", "()Lcf0/c;", "documentloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Observing implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allowTermination;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i terminationDialog;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final cf0.c documentType;

        public Observing() {
            this(false, null, null, 7, null);
        }

        public static /* synthetic */ Observing b(Observing observing, boolean z15, cb4.i iVar, cf0.c cVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = observing.allowTermination;
            }
            if ((i15 & 2) != 0) {
                iVar = observing.terminationDialog;
            }
            if ((i15 & 4) != 0) {
                cVar = observing.documentType;
            }
            return observing.a(z15, iVar, cVar);
        }

        public final Observing a(boolean allowTermination, cb4.i terminationDialog, cf0.c documentType) {
            return new Observing(allowTermination, terminationDialog, documentType);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getAllowTermination() {
            return this.allowTermination;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final cf0.c getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final cb4.i getTerminationDialog() {
            return this.terminationDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Observing)) {
                return false;
            }
            Observing observing = (Observing) other;
            return this.allowTermination == observing.allowTermination && fr.t.c(this.terminationDialog, observing.terminationDialog) && this.documentType == observing.documentType;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.allowTermination) * 31;
            cb4.i iVar = this.terminationDialog;
            int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            cf0.c cVar = this.documentType;
            return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "Observing(allowTermination=" + this.allowTermination + ", terminationDialog=" + this.terminationDialog + ", documentType=" + this.documentType + ')';
        }

        public Observing(boolean z15, cb4.i iVar, cf0.c cVar) {
            this.allowTermination = z15;
            this.terminationDialog = iVar;
            this.documentType = cVar;
        }

        public /* synthetic */ Observing(boolean z15, cb4.i iVar, cf0.c cVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? null : iVar, (i15 & 4) != 0 ? null : cVar);
        }
    }
}
