package hn0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hn0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Lhn0/d;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "dataEncryptionAlgorithm", "b", "dataEncryptionIv", "c", "encryptedData", "d", "encryptedEncryptionKey", "e", "keyEncryptionAlgorithm", "Ljava/time/OffsetDateTime;", "f", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "verificationDate2", "documentverificationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GetVerificationDataResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dataEncryptionAlgorithm")
    private final String dataEncryptionAlgorithm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dataEncryptionIv")
    private final String dataEncryptionIv;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("encryptedData")
    private final String encryptedData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("encryptedEncryptionKey")
    private final String encryptedEncryptionKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("keyEncryptionAlgorithm")
    private final String keyEncryptionAlgorithm;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("verificationDate2")
    private final OffsetDateTime verificationDate2;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDataEncryptionAlgorithm() {
        return this.dataEncryptionAlgorithm;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDataEncryptionIv() {
        return this.dataEncryptionIv;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEncryptedData() {
        return this.encryptedData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEncryptedEncryptionKey() {
        return this.encryptedEncryptionKey;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getKeyEncryptionAlgorithm() {
        return this.keyEncryptionAlgorithm;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetVerificationDataResponseDto)) {
            return false;
        }
        GetVerificationDataResponseDto getVerificationDataResponseDto = (GetVerificationDataResponseDto) other;
        return t.c(this.dataEncryptionAlgorithm, getVerificationDataResponseDto.dataEncryptionAlgorithm) && t.c(this.dataEncryptionIv, getVerificationDataResponseDto.dataEncryptionIv) && t.c(this.encryptedData, getVerificationDataResponseDto.encryptedData) && t.c(this.encryptedEncryptionKey, getVerificationDataResponseDto.encryptedEncryptionKey) && t.c(this.keyEncryptionAlgorithm, getVerificationDataResponseDto.keyEncryptionAlgorithm) && t.c(this.verificationDate2, getVerificationDataResponseDto.verificationDate2);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final OffsetDateTime getVerificationDate2() {
        return this.verificationDate2;
    }

    public int hashCode() {
        return (((((((((this.dataEncryptionAlgorithm.hashCode() * 31) + this.dataEncryptionIv.hashCode()) * 31) + this.encryptedData.hashCode()) * 31) + this.encryptedEncryptionKey.hashCode()) * 31) + this.keyEncryptionAlgorithm.hashCode()) * 31) + this.verificationDate2.hashCode();
    }

    public String toString() {
        return "GetVerificationDataResponseDto(dataEncryptionAlgorithm=" + this.dataEncryptionAlgorithm + ", dataEncryptionIv=" + this.dataEncryptionIv + ", encryptedData=" + this.encryptedData + ", encryptedEncryptionKey=" + this.encryptedEncryptionKey + ", keyEncryptionAlgorithm=" + this.keyEncryptionAlgorithm + ", verificationDate2=" + this.verificationDate2 + ')';
    }
}
