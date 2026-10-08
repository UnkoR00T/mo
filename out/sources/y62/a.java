package y62;

import er.p;
import fr.t;
import ja.n0;
import oq.i0;
import ou0.Ticket;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ly62/a;", "Lxw/f;", "Ly62/a$a;", "Lja/n0;", "Lz62/a;", "a", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends f<Params, n0<z62.a>> {

    /* JADX INFO: renamed from: y62.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0018\u0010$¨\u0006%"}, d2 = {"Ly62/a$a;", "", "Lja/n0;", "Lou0/b;", "ticketPagingData", "Lou0/a;", "paymentStatus", "Lkotlin/Function0;", "Loq/i0;", "navigateBack", "Lkotlin/Function2;", "navigateToDetails", "<init>", "(Lja/n0;Lou0/a;Ler/a;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lja/n0;", "c", "()Lja/n0;", "b", "Lou0/a;", "()Lou0/a;", "Ler/a;", "getNavigateBack", "()Ler/a;", "d", "Ler/p;", "()Ler/p;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n0<Ticket> ticketPagingData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ou0.a paymentStatus;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> navigateBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<ou0.a, Ticket, i0> navigateToDetails;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(n0<Ticket> n0Var, ou0.a aVar, er.a<i0> aVar2, p<? super ou0.a, ? super Ticket, i0> pVar) {
            this.ticketPagingData = n0Var;
            this.paymentStatus = aVar;
            this.navigateBack = aVar2;
            this.navigateToDetails = pVar;
        }

        public final p<ou0.a, Ticket, i0> a() {
            return this.navigateToDetails;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ou0.a getPaymentStatus() {
            return this.paymentStatus;
        }

        public final n0<Ticket> c() {
            return this.ticketPagingData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.ticketPagingData, params.ticketPagingData) && this.paymentStatus == params.paymentStatus && t.c(this.navigateBack, params.navigateBack) && t.c(this.navigateToDetails, params.navigateToDetails);
        }

        public int hashCode() {
            return (((((this.ticketPagingData.hashCode() * 31) + this.paymentStatus.hashCode()) * 31) + this.navigateBack.hashCode()) * 31) + this.navigateToDetails.hashCode();
        }

        public String toString() {
            return "Params(ticketPagingData=" + this.ticketPagingData + ", paymentStatus=" + this.paymentStatus + ", navigateBack=" + this.navigateBack + ", navigateToDetails=" + this.navigateToDetails + ')';
        }
    }
}
