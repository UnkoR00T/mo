package pk1;

import al0.BECommunityOffice;
import eu3.CertReceiveMethodData;
import fr.t;
import gz.b;
import iy.b0;
import mx.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpk1/a;", "Lgz/a;", "Lpk1/a$a;", "Leu3/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "b", "(Lpk1/a$a;)Leu3/b;", "a", "Lmx/c;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<Params, CertReceiveMethodData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: pk1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lpk1/a$a;", "Lgz/b$a;", "Lal0/i;", "office", "Liy/b0;", "userEdorAddress", "<init>", "(Lal0/i;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/i;", "()Lal0/i;", "b", "Liy/b0;", "()Liy/b0;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BECommunityOffice office;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 userEdorAddress;

        public Params(BECommunityOffice bECommunityOffice, b0 b0Var) {
            this.office = bECommunityOffice;
            this.userEdorAddress = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BECommunityOffice getOffice() {
            return this.office;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getUserEdorAddress() {
            return this.userEdorAddress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.office, params.office) && t.c(this.userEdorAddress, params.userEdorAddress);
        }

        public int hashCode() {
            return (this.office.hashCode() * 31) + this.userEdorAddress.hashCode();
        }

        public String toString() {
            return "Params(office=" + this.office + ", userEdorAddress=" + this.userEdorAddress + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    public CertReceiveMethodData b(Params params) {
        return new CertReceiveMethodData(this.labelProvider.c(gk1.a.f73446n0), params.getOffice().getName(), params.getUserEdorAddress());
    }
}
