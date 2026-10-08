package u44;

import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: renamed from: u44.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lu44/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lu44/b;", "a", "Lu44/b;", "()Lu44/b;", "intermediateSigningKey", "b", "Ljava/lang/String;", "protocolVersion", "c", "signature", "d", "signedMessage", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GooglePayTokenModelEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @c("intermediateSigningKey")
    private final IntermediateSigningKeyModelEntity intermediateSigningKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @c("protocolVersion")
    private final String protocolVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @c("signature")
    private final String signature;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @c("signedMessage")
    private final String signedMessage;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IntermediateSigningKeyModelEntity getIntermediateSigningKey() {
        return this.intermediateSigningKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSignedMessage() {
        return this.signedMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayTokenModelEntity)) {
            return false;
        }
        GooglePayTokenModelEntity googlePayTokenModelEntity = (GooglePayTokenModelEntity) other;
        return t.c(this.intermediateSigningKey, googlePayTokenModelEntity.intermediateSigningKey) && t.c(this.protocolVersion, googlePayTokenModelEntity.protocolVersion) && t.c(this.signature, googlePayTokenModelEntity.signature) && t.c(this.signedMessage, googlePayTokenModelEntity.signedMessage);
    }

    public int hashCode() {
        return (((((this.intermediateSigningKey.hashCode() * 31) + this.protocolVersion.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.signedMessage.hashCode();
    }

    public String toString() {
        return "GooglePayTokenModelEntity(intermediateSigningKey=" + this.intermediateSigningKey + ", protocolVersion=" + this.protocolVersion + ", signature=" + this.signature + ", signedMessage=" + this.signedMessage + ')';
    }
}
