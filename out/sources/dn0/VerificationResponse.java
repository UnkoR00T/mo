package dn0;

import fr.t;
import iy.h;
import java.security.PrivateKey;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dn0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&¨\u0006'"}, d2 = {"Ldn0/d;", "", "", "encryptedData", "encryptedEncryptionKey", "Liy/h$c;", "keyEncryptionAlgorithm", "dataEncryptionAlgorithm", "dataEncryptionIv", "Ljava/time/OffsetDateTime;", "verificationDateTime", "Ljava/security/PrivateKey;", "privateKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Liy/h$c;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/security/PrivateKey;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Liy/h$c;", "d", "()Liy/h$c;", "getDataEncryptionAlgorithm", "e", "f", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "g", "Ljava/security/PrivateKey;", "()Ljava/security/PrivateKey;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String encryptedData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String encryptedEncryptionKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final h.c keyEncryptionAlgorithm;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dataEncryptionAlgorithm;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dataEncryptionIv;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime verificationDateTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final PrivateKey privateKey;

    public VerificationResponse(String str, String str2, h.c cVar, String str3, String str4, OffsetDateTime offsetDateTime, PrivateKey privateKey) {
        this.encryptedData = str;
        this.encryptedEncryptionKey = str2;
        this.keyEncryptionAlgorithm = cVar;
        this.dataEncryptionAlgorithm = str3;
        this.dataEncryptionIv = str4;
        this.verificationDateTime = offsetDateTime;
        this.privateKey = privateKey;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDataEncryptionIv() {
        return this.dataEncryptionIv;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEncryptedData() {
        return this.encryptedData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEncryptedEncryptionKey() {
        return this.encryptedEncryptionKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h.c getKeyEncryptionAlgorithm() {
        return this.keyEncryptionAlgorithm;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationResponse)) {
            return false;
        }
        VerificationResponse verificationResponse = (VerificationResponse) other;
        return t.c(this.encryptedData, verificationResponse.encryptedData) && t.c(this.encryptedEncryptionKey, verificationResponse.encryptedEncryptionKey) && t.c(this.keyEncryptionAlgorithm, verificationResponse.keyEncryptionAlgorithm) && t.c(this.dataEncryptionAlgorithm, verificationResponse.dataEncryptionAlgorithm) && t.c(this.dataEncryptionIv, verificationResponse.dataEncryptionIv) && t.c(this.verificationDateTime, verificationResponse.verificationDateTime) && t.c(this.privateKey, verificationResponse.privateKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final OffsetDateTime getVerificationDateTime() {
        return this.verificationDateTime;
    }

    public int hashCode() {
        return (((((((((((this.encryptedData.hashCode() * 31) + this.encryptedEncryptionKey.hashCode()) * 31) + this.keyEncryptionAlgorithm.hashCode()) * 31) + this.dataEncryptionAlgorithm.hashCode()) * 31) + this.dataEncryptionIv.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.privateKey.hashCode();
    }

    public String toString() {
        return "VerificationResponse(encryptedData=" + this.encryptedData + ", encryptedEncryptionKey=" + this.encryptedEncryptionKey + ", keyEncryptionAlgorithm=" + this.keyEncryptionAlgorithm + ", dataEncryptionAlgorithm=" + this.dataEncryptionAlgorithm + ", dataEncryptionIv=" + this.dataEncryptionIv + ", verificationDateTime=" + this.verificationDateTime + ", privateKey=" + this.privateKey + ")";
    }
}
