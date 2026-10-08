package n10;

import fr.t;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n10.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Ln10/b;", "", "", "content", "<init>", "([B)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "[B", "()[B", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EncryptedDataField {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] content;

    public EncryptedDataField(byte[] bArr) {
        this.content = bArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getContent() {
        return this.content;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (t.c(EncryptedDataField.class, other != null ? other.getClass() : null)) {
            return Arrays.equals(this.content, ((EncryptedDataField) other).content);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.content);
    }

    public String toString() {
        return "EncryptedDataField(content=" + Arrays.toString(this.content) + ')';
    }
}
