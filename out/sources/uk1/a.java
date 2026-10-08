package uk1;

import al0.BECommunityOffice;
import fr.t;
import gz.b;
import mx.Label;
import mx.c;
import p071kotlin.Metadata;
import py3.OfficeSelectionData;
import tq.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Luk1/a;", "Lgz/b;", "Luk1/a$a;", "Lpy3/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "d", "(Luk1/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b<Params, OfficeSelectionData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: uk1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Luk1/a$a;", "Lgz/b$a;", "Lal0/i;", "initialOffice", "<init>", "(Lal0/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/i;", "()Lal0/i;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BECommunityOffice initialOffice;

        public Params(BECommunityOffice bECommunityOffice) {
            this.initialOffice = bECommunityOffice;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BECommunityOffice getInitialOffice() {
            return this.initialOffice;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.initialOffice, ((Params) other).initialOffice);
        }

        public int hashCode() {
            BECommunityOffice bECommunityOffice = this.initialOffice;
            if (bECommunityOffice == null) {
                return 0;
            }
            return bECommunityOffice.hashCode();
        }

        public String toString() {
            return "Params(initialOffice=" + this.initialOffice + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    public Object d(Params params, e<? super OfficeSelectionData> eVar) {
        c cVar = this.labelProvider;
        Label labelC = cVar.c(gk1.a.f73464w0);
        Label labelC2 = cVar.c(gk1.a.f73437j);
        Label labelC3 = cVar.c(gk1.a.f73462v0);
        OfficeSelectionData.FieldData fieldData = new OfficeSelectionData.FieldData(cVar.c(gk1.a.f73443m), cVar.c(gk1.a.f73435i));
        BECommunityOffice initialOffice = params.getInitialOffice();
        return new OfficeSelectionData(labelC, labelC2, labelC3, fieldData, initialOffice != null ? new OfficeSelectionData.Office(initialOffice.getId(), initialOffice.getName(), initialOffice.getEdorAddress()) : null);
    }
}
