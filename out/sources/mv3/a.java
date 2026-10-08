package mv3;

import er.l;
import fr.k;
import fr.t;
import iy.b0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lmv3/a;", "", "b", "a", "Lmv3/a$a;", "Lmv3/a$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: mv3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lmv3/a$a;", "Lmv3/a;", "Lkotlin/Function0;", "Loq/i0;", "onSuccess", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EdorAddressNotRequired implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSuccess;

        /* JADX WARN: Multi-variable type inference failed */
        public EdorAddressNotRequired() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final er.a<i0> a() {
            return this.onSuccess;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EdorAddressNotRequired) && t.c(this.onSuccess, ((EdorAddressNotRequired) other).onSuccess);
        }

        public int hashCode() {
            er.a<i0> aVar = this.onSuccess;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            return "EdorAddressNotRequired(onSuccess=" + this.onSuccess + ")";
        }

        public EdorAddressNotRequired(er.a<i0> aVar) {
            this.onSuccess = aVar;
        }

        public /* synthetic */ EdorAddressNotRequired(er.a aVar, int i15, k kVar) {
            this((i15 & 1) != 0 ? null : aVar);
        }
    }

    /* JADX INFO: renamed from: mv3.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmv3/a$b;", "Lmv3/a;", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onSuccess", "Lkotlin/Function0;", "onError", "<init>", "(Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/l;", "b", "()Ler/l;", "Ler/a;", "()Ler/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EdorAddressRequired implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onSuccess;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onError;

        /* JADX WARN: Multi-variable type inference failed */
        public EdorAddressRequired(l<? super b0, i0> lVar, er.a<i0> aVar) {
            this.onSuccess = lVar;
            this.onError = aVar;
        }

        public final er.a<i0> a() {
            return this.onError;
        }

        public final l<b0, i0> b() {
            return this.onSuccess;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EdorAddressRequired)) {
                return false;
            }
            EdorAddressRequired edorAddressRequired = (EdorAddressRequired) other;
            return t.c(this.onSuccess, edorAddressRequired.onSuccess) && t.c(this.onError, edorAddressRequired.onError);
        }

        public int hashCode() {
            int iHashCode = this.onSuccess.hashCode() * 31;
            er.a<i0> aVar = this.onError;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "EdorAddressRequired(onSuccess=" + this.onSuccess + ", onError=" + this.onError + ")";
        }

        public /* synthetic */ EdorAddressRequired(l lVar, er.a aVar, int i15, k kVar) {
            this(lVar, (i15 & 2) != 0 ? null : aVar);
        }
    }
}
