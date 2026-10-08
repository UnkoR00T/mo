package de2;

import java.util.List;
import p071kotlin.Metadata;
import zp0.BEReportedIncidentsReportedIncident;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lde2/d;", "", "a", "Lde2/d$a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: de2.d$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lde2/d$a;", "Lde2/d;", "", "Lzp0/r;", "reports", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Ljava/util/List;Lcb4/i;)V", "a", "(Ljava/util/List;Lcb4/i;)Lde2/d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lcb4/i;", "c", "()Lcb4/i;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEReportedIncidentsReportedIncident> reports;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        public Initialized(List<BEReportedIncidentsReportedIncident> list, cb4.i iVar) {
            this.reports = list;
            this.dialogVMSAdapter = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, List list, cb4.i iVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = initialized.reports;
            }
            if ((i15 & 2) != 0) {
                iVar = initialized.dialogVMSAdapter;
            }
            return initialized.a(list, iVar);
        }

        public final Initialized a(List<BEReportedIncidentsReportedIncident> reports, cb4.i dialogVMSAdapter) {
            return new Initialized(reports, dialogVMSAdapter);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final cb4.i getDialogVMSAdapter() {
            return this.dialogVMSAdapter;
        }

        public final List<BEReportedIncidentsReportedIncident> d() {
            return this.reports;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.reports, initialized.reports) && fr.t.c(this.dialogVMSAdapter, initialized.dialogVMSAdapter);
        }

        public int hashCode() {
            int iHashCode = this.reports.hashCode() * 31;
            cb4.i iVar = this.dialogVMSAdapter;
            return iHashCode + (iVar == null ? 0 : iVar.hashCode());
        }

        public String toString() {
            return "Initialized(reports=" + this.reports + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
        }

        public /* synthetic */ Initialized(List list, cb4.i iVar, int i15, fr.k kVar) {
            this(list, (i15 & 2) != 0 ? null : iVar);
        }
    }
}
