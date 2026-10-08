package pu0;

import gz.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lpu0/a;", "", "Lpu0/a$a;", "", "Lou0/b;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends b {

    /* JADX INFO: renamed from: pu0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\f¨\u0006\u0017"}, d2 = {"Lpu0/a$a;", "Lgz/b$a;", "Lou0/a;", "paymentStatus", "", "pageNumber", "<init>", "(Lou0/a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lou0/a;", "b", "()Lou0/a;", "I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ou0.a paymentStatus;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int pageNumber;

        public Params(ou0.a aVar, int i15) {
            this.paymentStatus = aVar;
            this.pageNumber = i15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getPageNumber() {
            return this.pageNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ou0.a getPaymentStatus() {
            return this.paymentStatus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.paymentStatus == params.paymentStatus && this.pageNumber == params.pageNumber;
        }

        public int hashCode() {
            return (this.paymentStatus.hashCode() * 31) + Integer.hashCode(this.pageNumber);
        }

        public String toString() {
            return "Params(paymentStatus=" + this.paymentStatus + ", pageNumber=" + this.pageNumber + ")";
        }
    }
}
