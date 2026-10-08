package n64;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: n64.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Ln64/b;", "", "Lo64/a;", "type", "Lo64/c;", "mainType", "", "lastOpenTimestamp", "<init>", "(Lo64/a;Lo64/c;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo64/a;", "c", "()Lo64/a;", "b", "Lo64/c;", "()Lo64/c;", "J", "()J", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchEntryEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final o64.a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final o64.c mainType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lastOpenTimestamp;

    public SearchEntryEntity(o64.a aVar, o64.c cVar, long j15) {
        this.type = aVar;
        this.mainType = cVar;
        this.lastOpenTimestamp = j15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getLastOpenTimestamp() {
        return this.lastOpenTimestamp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final o64.c getMainType() {
        return this.mainType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o64.a getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchEntryEntity)) {
            return false;
        }
        SearchEntryEntity searchEntryEntity = (SearchEntryEntity) other;
        return this.type == searchEntryEntity.type && this.mainType == searchEntryEntity.mainType && this.lastOpenTimestamp == searchEntryEntity.lastOpenTimestamp;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.mainType.hashCode()) * 31) + Long.hashCode(this.lastOpenTimestamp);
    }

    public String toString() {
        return "SearchEntryEntity(type=" + this.type + ", mainType=" + this.mainType + ", lastOpenTimestamp=" + this.lastOpenTimestamp + ')';
    }
}
