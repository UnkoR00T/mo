package ge1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ge1.l, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lge1/l;", "", "Lde1/b;", "incomeTaxExceededCertificateAnswer", "<init>", "(Lde1/b;)V", "a", "(Lde1/b;)Lge1/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lde1/b;", "b", "()Lde1/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final de1.b incomeTaxExceededCertificateAnswer;

    public State(de1.b bVar) {
        this.incomeTaxExceededCertificateAnswer = bVar;
    }

    public final State a(de1.b incomeTaxExceededCertificateAnswer) {
        return new State(incomeTaxExceededCertificateAnswer);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final de1.b getIncomeTaxExceededCertificateAnswer() {
        return this.incomeTaxExceededCertificateAnswer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof State) && this.incomeTaxExceededCertificateAnswer == ((State) other).incomeTaxExceededCertificateAnswer;
    }

    public int hashCode() {
        de1.b bVar = this.incomeTaxExceededCertificateAnswer;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public String toString() {
        return "State(incomeTaxExceededCertificateAnswer=" + this.incomeTaxExceededCertificateAnswer + ')';
    }
}
