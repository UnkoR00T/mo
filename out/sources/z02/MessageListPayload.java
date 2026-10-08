package z02;

import eo0.r;
import eo0.t;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: z02.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz02/c;", "", "Leo0/r;", "directoryId", "", "name", "Leo0/t;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Leo0/t;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Leo0/t;", "()Leo0/t;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MessageListPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String directoryId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final t type;

    public /* synthetic */ MessageListPayload(String str, String str2, t tVar, k kVar) {
        this(str, str2, tVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDirectoryId() {
        return this.directoryId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListPayload)) {
            return false;
        }
        MessageListPayload messageListPayload = (MessageListPayload) other;
        return r.d(this.directoryId, messageListPayload.directoryId) && fr.t.c(this.name, messageListPayload.name) && this.type == messageListPayload.type;
    }

    public int hashCode() {
        return (((r.e(this.directoryId) * 31) + this.name.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "MessageListPayload(directoryId=" + ((Object) r.f(this.directoryId)) + ", name=" + this.name + ", type=" + this.type + ')';
    }

    private MessageListPayload(String str, String str2, t tVar) {
        this.directoryId = str;
        this.name = str2;
        this.type = tVar;
    }
}
