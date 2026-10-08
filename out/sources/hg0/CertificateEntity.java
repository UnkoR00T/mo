package hg0;

import fr.k;
import fr.t;
import java.util.Arrays;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.CertificateStatusEntity;

/* JADX INFO: renamed from: hg0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lhg0/a;", "", "", "id", "", "certificateBytes", "privateKeyBytes", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;", "certificateStatus", "", "termsAccepted", "<init>", "(I[B[BLpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "[B", "()[B", "d", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;", "()Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;", "e", "Z", "()Z", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CertificateEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] certificateBytes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] privateKeyBytes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CertificateStatusEntity certificateStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean termsAccepted;

    public CertificateEntity(int i15, byte[] bArr, byte[] bArr2, CertificateStatusEntity certificateStatusEntity, boolean z15) {
        this.id = i15;
        this.certificateBytes = bArr;
        this.privateKeyBytes = bArr2;
        this.certificateStatus = certificateStatusEntity;
        this.termsAccepted = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getCertificateBytes() {
        return this.certificateBytes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CertificateStatusEntity getCertificateStatus() {
        return this.certificateStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final byte[] getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getTermsAccepted() {
        return this.termsAccepted;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertificateEntity)) {
            return false;
        }
        CertificateEntity certificateEntity = (CertificateEntity) other;
        return this.id == certificateEntity.id && t.c(this.certificateBytes, certificateEntity.certificateBytes) && t.c(this.privateKeyBytes, certificateEntity.privateKeyBytes) && this.certificateStatus == certificateEntity.certificateStatus && this.termsAccepted == certificateEntity.termsAccepted;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + Arrays.hashCode(this.certificateBytes)) * 31) + Arrays.hashCode(this.privateKeyBytes)) * 31) + this.certificateStatus.hashCode()) * 31) + Boolean.hashCode(this.termsAccepted);
    }

    public String toString() {
        return "CertificateEntity(id=" + this.id + ", certificateBytes=" + Arrays.toString(this.certificateBytes) + ", privateKeyBytes=" + Arrays.toString(this.privateKeyBytes) + ", certificateStatus=" + this.certificateStatus + ", termsAccepted=" + this.termsAccepted + ')';
    }

    public /* synthetic */ CertificateEntity(int i15, byte[] bArr, byte[] bArr2, CertificateStatusEntity certificateStatusEntity, boolean z15, int i16, k kVar) {
        this((i16 & 1) != 0 ? 0 : i15, bArr, bArr2, certificateStatusEntity, (i16 & 16) != 0 ? false : z15);
    }
}
