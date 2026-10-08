package m12;

import p071kotlin.Metadata;
import z02.MessageDetailsPayload;

/* JADX INFO: renamed from: m12.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lm12/b;", "", "Lhb4/c;", "errorVMS", "Lz02/b;", "messageDetailsPayload", "<init>", "(Lhb4/c;Lz02/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "c", "()Lhb4/c;", "b", "Lz02/b;", "()Lz02/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c errorVMS;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MessageDetailsPayload messageDetailsPayload;

    public Error(hb4.c cVar, MessageDetailsPayload messageDetailsPayload) {
        this.errorVMS = cVar;
        this.messageDetailsPayload = messageDetailsPayload;
    }

    @Override // m12.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public MessageDetailsPayload getMessageDetailsPayload() {
        return this.messageDetailsPayload;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hb4.c getErrorVMS() {
        return this.errorVMS;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.errorVMS, error.errorVMS) && fr.t.c(this.messageDetailsPayload, error.messageDetailsPayload);
    }

    public int hashCode() {
        return (this.errorVMS.hashCode() * 31) + this.messageDetailsPayload.hashCode();
    }

    public String toString() {
        return "Error(errorVMS=" + this.errorVMS + ", messageDetailsPayload=" + this.messageDetailsPayload + ')';
    }
}
