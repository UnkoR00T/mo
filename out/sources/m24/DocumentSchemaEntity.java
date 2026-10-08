package m24;

import fr.t;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: m24.h, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lm24/h;", "", "", "id", "", "documentContainerId", "", "schema", "<init>", "(ILjava/lang/String;[B)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "[B", "()[B", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentSchemaEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentContainerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] schema;

    public DocumentSchemaEntity(int i15, String str, byte[] bArr) {
        this.id = i15;
        this.documentContainerId = str;
        this.schema = bArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentContainerId() {
        return this.documentContainerId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte[] getSchema() {
        return this.schema;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentSchemaEntity)) {
            return false;
        }
        DocumentSchemaEntity documentSchemaEntity = (DocumentSchemaEntity) other;
        return this.id == documentSchemaEntity.id && t.c(this.documentContainerId, documentSchemaEntity.documentContainerId) && t.c(this.schema, documentSchemaEntity.schema);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.documentContainerId.hashCode()) * 31) + Arrays.hashCode(this.schema);
    }

    public String toString() {
        return "DocumentSchemaEntity(id=" + this.id + ", documentContainerId=" + this.documentContainerId + ", schema=" + Arrays.toString(this.schema) + ')';
    }

    public /* synthetic */ DocumentSchemaEntity(int i15, String str, byte[] bArr, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 0 : i15, str, bArr);
    }
}
