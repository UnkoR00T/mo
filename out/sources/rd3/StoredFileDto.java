package rd3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rd3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lrd3/c;", "", "Lrd3/c$a;", "type", "Lrd3/d;", "metadata", "<init>", "(Lrd3/c$a;Lrd3/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrd3/c$a;", "b", "()Lrd3/c$a;", "Lrd3/d;", "()Lrd3/d;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoredFileDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("metadata")
    private final StoredMetadataDto metadata;

    /* JADX INFO: renamed from: rd3.c$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lrd3/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        Image,
        Regular;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f173267d = wq.b.a(b());
    }

    public StoredFileDto(a aVar, StoredMetadataDto storedMetadataDto) {
        this.type = aVar;
        this.metadata = storedMetadataDto;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final StoredMetadataDto getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoredFileDto)) {
            return false;
        }
        StoredFileDto storedFileDto = (StoredFileDto) other;
        return this.type == storedFileDto.type && t.c(this.metadata, storedFileDto.metadata);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.metadata.hashCode();
    }

    public String toString() {
        return "StoredFileDto(type=" + this.type + ", metadata=" + this.metadata + ')';
    }
}
