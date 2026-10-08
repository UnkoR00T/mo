package sv3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lsv3/a;", "", "Liy/b0;", "K", "()Liy/b0;", "edorAddress", "b", "a", "Lsv3/a$a;", "Lsv3/a$b;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: sv3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsv3/a$a;", "Lsv3/a;", "Liy/b0;", "edorAddress", "Lkotlin/Function0;", "Loq/i0;", "onSuccess", "<init>", "(Liy/b0;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "K", "()Liy/b0;", "b", "Ler/a;", "()Ler/a;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotRequired implements a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f184717c = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 edorAddress;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onSuccess;

        public NotRequired(iy.b0 b0Var, er.a<oq.i0> aVar) {
            this.edorAddress = b0Var;
            this.onSuccess = aVar;
        }

        @Override // sv3.a
        /* JADX INFO: renamed from: K, reason: from getter */
        public iy.b0 getEdorAddress() {
            return this.edorAddress;
        }

        public final er.a<oq.i0> a() {
            return this.onSuccess;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotRequired)) {
                return false;
            }
            NotRequired notRequired = (NotRequired) other;
            return fr.t.c(this.edorAddress, notRequired.edorAddress) && fr.t.c(this.onSuccess, notRequired.onSuccess);
        }

        public int hashCode() {
            iy.b0 b0Var = this.edorAddress;
            int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
            er.a<oq.i0> aVar = this.onSuccess;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "NotRequired(edorAddress=" + this.edorAddress + ", onSuccess=" + this.onSuccess + ')';
        }
    }

    /* JADX INFO: renamed from: sv3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsv3/a$b;", "Lsv3/a;", "Liy/b0;", "edorAddress", "Lkotlin/Function1;", "Loq/i0;", "onSuccess", "<init>", "(Liy/b0;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "K", "()Liy/b0;", "b", "Ler/l;", "()Ler/l;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Required implements a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f184720c = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 edorAddress;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<iy.b0, oq.i0> onSuccess;

        /* JADX WARN: Multi-variable type inference failed */
        public Required(iy.b0 b0Var, er.l<? super iy.b0, oq.i0> lVar) {
            this.edorAddress = b0Var;
            this.onSuccess = lVar;
        }

        @Override // sv3.a
        /* JADX INFO: renamed from: K, reason: from getter */
        public iy.b0 getEdorAddress() {
            return this.edorAddress;
        }

        public final er.l<iy.b0, oq.i0> a() {
            return this.onSuccess;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Required)) {
                return false;
            }
            Required required = (Required) other;
            return fr.t.c(this.edorAddress, required.edorAddress) && fr.t.c(this.onSuccess, required.onSuccess);
        }

        public int hashCode() {
            return (this.edorAddress.hashCode() * 31) + this.onSuccess.hashCode();
        }

        public String toString() {
            return "Required(edorAddress=" + this.edorAddress + ", onSuccess=" + this.onSuccess + ')';
        }
    }

    /* JADX INFO: renamed from: K */
    iy.b0 getEdorAddress();
}
