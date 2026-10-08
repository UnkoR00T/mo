package j34;

import cb4.DialogData;
import fr.t;
import fr0.DocumentMaintenanceBreak;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lj34/a;", "Lxw/f;", "Lj34/a$a;", "Lcb4/d;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends f<Params, DialogData> {

    /* JADX INFO: renamed from: j34.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lj34/a$a;", "", "Lfr0/h;", "maintenanceBreak", "Lkotlin/Function0;", "Loq/i0;", "onCloseDialog", "<init>", "(Lfr0/h;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfr0/h;", "()Lfr0/h;", "b", "Ler/a;", "()Ler/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentMaintenanceBreak maintenanceBreak;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseDialog;

        public Params(DocumentMaintenanceBreak documentMaintenanceBreak, er.a<i0> aVar) {
            this.maintenanceBreak = documentMaintenanceBreak;
            this.onCloseDialog = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DocumentMaintenanceBreak getMaintenanceBreak() {
            return this.maintenanceBreak;
        }

        public final er.a<i0> b() {
            return this.onCloseDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.maintenanceBreak, params.maintenanceBreak) && t.c(this.onCloseDialog, params.onCloseDialog);
        }

        public int hashCode() {
            return (this.maintenanceBreak.hashCode() * 31) + this.onCloseDialog.hashCode();
        }

        public String toString() {
            return "Params(maintenanceBreak=" + this.maintenanceBreak + ", onCloseDialog=" + this.onCloseDialog + ")";
        }
    }
}
