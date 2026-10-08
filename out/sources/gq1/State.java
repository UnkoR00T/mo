package gq1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gq1.s, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lgq1/s;", "", "", "currentIndex", "<init>", "(I)V", "a", "(I)Lgq1/s;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "b", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentIndex;

    public State() {
        this(0, 1, null);
    }

    public final State a(int currentIndex) {
        return new State(currentIndex);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof State) && this.currentIndex == ((State) other).currentIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.currentIndex);
    }

    public String toString() {
        return "State(currentIndex=" + this.currentIndex + ')';
    }

    public State(int i15) {
        this.currentIndex = i15;
    }

    public /* synthetic */ State(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 0 : i15);
    }
}
