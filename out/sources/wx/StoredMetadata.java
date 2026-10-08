package wx;

import fr.t;
import fu.r;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wx.l, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lwx/l;", "Lwx/g;", "", "name", "extension", "", "sizeInBytes", "<init>", "(Ljava/lang/String;Ljava/lang/String;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getName", "c", "f", "d", "F", "e", "()F", "a", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoredMetadata implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String extension;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float sizeInBytes;

    /* JADX INFO: renamed from: wx.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lwx/l$a;", "", "<init>", "()V", "", "fullName", "", "sizeInBytes", "Lwx/l;", "a", "(Ljava/lang/String;F)Lwx/l;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final StoredMetadata a(String fullName, float sizeInBytes) {
            List listV0 = r.V0(fullName, new String[]{"."}, false, 0, 6, null);
            return new StoredMetadata((String) (listV0.size() > 0 ? listV0.get(0) : ""), (String) (1 < listV0.size() ? listV0.get(1) : ""), sizeInBytes);
        }

        private Companion() {
        }
    }

    public StoredMetadata(String str, String str2, float f15) {
        this.name = str;
        this.extension = str2;
        this.sizeInBytes = f15;
    }

    @Override // wx.g
    public /* bridge */ String c() {
        return super.c();
    }

    @Override // wx.g
    public /* bridge */ float d() {
        return super.d();
    }

    @Override // wx.g
    /* JADX INFO: renamed from: e, reason: from getter */
    public float getSizeInBytes() {
        return this.sizeInBytes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoredMetadata)) {
            return false;
        }
        StoredMetadata storedMetadata = (StoredMetadata) other;
        return t.c(this.name, storedMetadata.name) && t.c(this.extension, storedMetadata.extension) && Float.compare(this.sizeInBytes, storedMetadata.sizeInBytes) == 0;
    }

    @Override // wx.g
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getExtension() {
        return this.extension;
    }

    @Override // wx.g
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.extension.hashCode()) * 31) + Float.hashCode(this.sizeInBytes);
    }

    public String toString() {
        return "StoredMetadata(name=" + this.name + ", extension=" + this.extension + ", sizeInBytes=" + this.sizeInBytes + ")";
    }
}
