package co3;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: co3.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012.\u0010\u0006\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R?\u0010\u0006\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lco3/d;", "", "Lkotlin/Function2;", "Ldx/i;", "Loq/i0;", "Ltq/e;", "callback", "<init>", "(Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/p;", "()Ler/p;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PinAuthResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.p<dx.i<i0, i0>, tq.e<? super i0>, Object> callback;

    /* JADX WARN: Multi-variable type inference failed */
    public PinAuthResult(er.p<? super dx.i<i0, i0>, ? super tq.e<? super i0>, ? extends Object> pVar) {
        this.callback = pVar;
    }

    public final er.p<dx.i<i0, i0>, tq.e<? super i0>, Object> a() {
        return this.callback;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PinAuthResult) && fr.t.c(this.callback, ((PinAuthResult) other).callback);
    }

    public int hashCode() {
        return this.callback.hashCode();
    }

    public String toString() {
        return "PinAuthResult(callback=" + this.callback + ')';
    }
}
