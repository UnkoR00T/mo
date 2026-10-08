package m24;

import fr.t;
import java.util.Arrays;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntityStatus;
import pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntityType;

/* JADX INFO: renamed from: m24.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001d\u0010\"R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0010¨\u0006%"}, d2 = {"Lm24/a;", "", "", "id", "", "certificate", "privateKey", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityStatus;", "certificateStatus", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;", "certificateTypeEntity", "", "ticket", "<init>", "(I[B[BLpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityStatus;Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "[B", "()[B", "c", "e", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityStatus;", "()Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityStatus;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;", "()Lpl/gov/coi/mobywatel/technical/containers/data/database/entities/CertificateEntityType;", "f", "Ljava/lang/String;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CertificateEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] certificate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] privateKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CertificateEntityStatus certificateStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CertificateEntityType certificateTypeEntity;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ticket;

    public CertificateEntity(int i15, byte[] bArr, byte[] bArr2, CertificateEntityStatus certificateEntityStatus, CertificateEntityType certificateEntityType, String str) {
        this.id = i15;
        this.certificate = bArr;
        this.privateKey = bArr2;
        this.certificateStatus = certificateEntityStatus;
        this.certificateTypeEntity = certificateEntityType;
        this.ticket = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getCertificate() {
        return this.certificate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CertificateEntityStatus getCertificateStatus() {
        return this.certificateStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CertificateEntityType getCertificateTypeEntity() {
        return this.certificateTypeEntity;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final byte[] getPrivateKey() {
        return this.privateKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertificateEntity)) {
            return false;
        }
        CertificateEntity certificateEntity = (CertificateEntity) other;
        return this.id == certificateEntity.id && t.c(this.certificate, certificateEntity.certificate) && t.c(this.privateKey, certificateEntity.privateKey) && this.certificateStatus == certificateEntity.certificateStatus && this.certificateTypeEntity == certificateEntity.certificateTypeEntity && t.c(this.ticket, certificateEntity.ticket);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTicket() {
        return this.ticket;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + Arrays.hashCode(this.certificate)) * 31) + Arrays.hashCode(this.privateKey)) * 31) + this.certificateStatus.hashCode()) * 31) + this.certificateTypeEntity.hashCode()) * 31) + this.ticket.hashCode();
    }

    public String toString() {
        return "CertificateEntity(id=" + this.id + ", certificate=" + Arrays.toString(this.certificate) + ", privateKey=" + Arrays.toString(this.privateKey) + ", certificateStatus=" + this.certificateStatus + ", certificateTypeEntity=" + this.certificateTypeEntity + ", ticket=" + this.ticket + ')';
    }

    public /* synthetic */ CertificateEntity(int i15, byte[] bArr, byte[] bArr2, CertificateEntityStatus certificateEntityStatus, CertificateEntityType certificateEntityType, String str, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 0 : i15, bArr, bArr2, certificateEntityStatus, certificateEntityType, str);
    }
}
