package uo1;

import fr.k;
import fr.t;
import n10.EncryptedDataField;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: uo1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Luo1/a;", "", "", "id", "", "internalId", "Luo1/h;", "entityType", "Ln10/b;", "content", "<init>", "(ILjava/lang/String;Luo1/h;Ln10/b;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "d", "Luo1/h;", "()Luo1/h;", "Ln10/b;", "()Ln10/b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeveloperSampleEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String internalId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final h entityType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final EncryptedDataField content;

    public DeveloperSampleEntity(int i15, String str, h hVar, EncryptedDataField encryptedDataField) {
        this.id = i15;
        this.internalId = str;
        this.entityType = hVar;
        this.content = encryptedDataField;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EncryptedDataField getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getEntityType() {
        return this.entityType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInternalId() {
        return this.internalId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeveloperSampleEntity)) {
            return false;
        }
        DeveloperSampleEntity developerSampleEntity = (DeveloperSampleEntity) other;
        return this.id == developerSampleEntity.id && t.c(this.internalId, developerSampleEntity.internalId) && this.entityType == developerSampleEntity.entityType && t.c(this.content, developerSampleEntity.content);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.internalId.hashCode()) * 31) + this.entityType.hashCode()) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "DeveloperSampleEntity(id=" + this.id + ", internalId=" + this.internalId + ", entityType=" + this.entityType + ", content=" + this.content + ')';
    }

    public /* synthetic */ DeveloperSampleEntity(int i15, String str, h hVar, EncryptedDataField encryptedDataField, int i16, k kVar) {
        this((i16 & 1) != 0 ? 0 : i15, str, hVar, encryptedDataField);
    }
}
