package ps1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ps1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lps1/f;", "", "", "textValueFromSetup", "<init>", "(Ljava/lang/String;)V", "a", "(Ljava/lang/String;)Lps1/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String textValueFromSetup;

    public State(String str) {
        this.textValueFromSetup = str;
    }

    public final State a(String textValueFromSetup) {
        return new State(textValueFromSetup);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTextValueFromSetup() {
        return this.textValueFromSetup;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof State) && fr.t.c(this.textValueFromSetup, ((State) other).textValueFromSetup);
    }

    public int hashCode() {
        return this.textValueFromSetup.hashCode();
    }

    public String toString() {
        return "State(textValueFromSetup=" + this.textValueFromSetup + ')';
    }
}
