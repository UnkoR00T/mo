package hg0;

import fr.k;
import fr.t;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hg0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lhg0/f;", "", "", "id", "", "documentOwnerId", "", "data", "<init>", "(ILjava/lang/String;[B)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "[B", "()[B", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemaEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentOwnerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] data;

    public SchemaEntity(int i15, String str, byte[] bArr) {
        this.id = i15;
        this.documentOwnerId = str;
        this.data = bArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentOwnerId() {
        return this.documentOwnerId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchemaEntity)) {
            return false;
        }
        SchemaEntity schemaEntity = (SchemaEntity) other;
        return this.id == schemaEntity.id && t.c(this.documentOwnerId, schemaEntity.documentOwnerId) && t.c(this.data, schemaEntity.data);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.documentOwnerId.hashCode()) * 31) + Arrays.hashCode(this.data);
    }

    public String toString() {
        return "SchemaEntity(id=" + this.id + ", documentOwnerId=" + this.documentOwnerId + ", data=" + Arrays.toString(this.data) + ')';
    }

    public /* synthetic */ SchemaEntity(int i15, String str, byte[] bArr, int i16, k kVar) {
        this((i16 & 1) != 0 ? 0 : i15, str, bArr);
    }
}
