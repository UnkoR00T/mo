package l62;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: l62.g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll62/g;", "", "", "cardNumber", "Lkotlin/Function0;", "Loq/i0;", "refreshAction", "<init>", "(Ljava/lang/String;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ler/a;", "()Ler/a;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GoToVerificationProcess implements n20.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<oq.i0> refreshAction;

    public GoToVerificationProcess(String str, er.a<oq.i0> aVar) {
        this.cardNumber = str;
        this.refreshAction = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final er.a<oq.i0> b() {
        return this.refreshAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoToVerificationProcess)) {
            return false;
        }
        GoToVerificationProcess goToVerificationProcess = (GoToVerificationProcess) other;
        return fr.t.c(this.cardNumber, goToVerificationProcess.cardNumber) && fr.t.c(this.refreshAction, goToVerificationProcess.refreshAction);
    }

    public int hashCode() {
        return (this.cardNumber.hashCode() * 31) + this.refreshAction.hashCode();
    }

    public String toString() {
        return "GoToVerificationProcess(cardNumber=" + this.cardNumber + ", refreshAction=" + this.refreshAction + ')';
    }
}
