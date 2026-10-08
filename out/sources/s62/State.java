package s62;

import fr.t;
import ou0.Ticket;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s62.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ls62/c;", "", "Lou0/a;", "paymentStatus", "Lou0/b;", "ticket", "<init>", "(Lou0/a;Lou0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lou0/a;", "()Lou0/a;", "b", "Lou0/b;", "()Lou0/b;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ou0.a paymentStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ticket ticket;

    public State(ou0.a aVar, Ticket ticket) {
        this.paymentStatus = aVar;
        this.ticket = ticket;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ou0.a getPaymentStatus() {
        return this.paymentStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Ticket getTicket() {
        return this.ticket;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.paymentStatus == state.paymentStatus && t.c(this.ticket, state.ticket);
    }

    public int hashCode() {
        return (this.paymentStatus.hashCode() * 31) + this.ticket.hashCode();
    }

    public String toString() {
        return "State(paymentStatus=" + this.paymentStatus + ", ticket=" + this.ticket + ')';
    }
}
