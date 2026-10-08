package z02;

import eo0.r;
import eo0.t;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: z02.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\r¨\u0006\u001e"}, d2 = {"Lz02/b;", "", "Lfo0/c;", "message", "Leo0/r;", "directoryId", "Leo0/t;", "directoryType", "", "directoryName", "<init>", "(Lfo0/c;Ljava/lang/String;Leo0/t;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfo0/c;", "d", "()Lfo0/c;", "b", "Ljava/lang/String;", "c", "Leo0/t;", "()Leo0/t;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MessageDetailsPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fo0.c message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String directoryId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final t directoryType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String directoryName;

    public /* synthetic */ MessageDetailsPayload(fo0.c cVar, String str, t tVar, String str2, k kVar) {
        this(cVar, str, tVar, str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDirectoryId() {
        return this.directoryId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDirectoryName() {
        return this.directoryName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t getDirectoryType() {
        return this.directoryType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final fo0.c getMessage() {
        return this.message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageDetailsPayload)) {
            return false;
        }
        MessageDetailsPayload messageDetailsPayload = (MessageDetailsPayload) other;
        return fr.t.c(this.message, messageDetailsPayload.message) && r.d(this.directoryId, messageDetailsPayload.directoryId) && this.directoryType == messageDetailsPayload.directoryType && fr.t.c(this.directoryName, messageDetailsPayload.directoryName);
    }

    public int hashCode() {
        return (((((this.message.hashCode() * 31) + r.e(this.directoryId)) * 31) + this.directoryType.hashCode()) * 31) + this.directoryName.hashCode();
    }

    public String toString() {
        return "MessageDetailsPayload(message=" + this.message + ", directoryId=" + ((Object) r.f(this.directoryId)) + ", directoryType=" + this.directoryType + ", directoryName=" + this.directoryName + ')';
    }

    private MessageDetailsPayload(fo0.c cVar, String str, t tVar, String str2) {
        this.message = cVar;
        this.directoryId = str;
        this.directoryType = tVar;
        this.directoryName = str2;
    }
}
