package xr0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xr0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lxr0/e;", "", "Lxr0/f;", "intermediateSigningKey", "", "protocolVersion", "signature", "signedMessage", "<init>", "(Lxr0/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxr0/f;", "()Lxr0/f;", "b", "Ljava/lang/String;", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEGooglePayTokenModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEIntermediateSigningKeyModel intermediateSigningKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String protocolVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String signature;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String signedMessage;

    public BEGooglePayTokenModel(BEIntermediateSigningKeyModel bEIntermediateSigningKeyModel, String str, String str2, String str3) {
        this.intermediateSigningKey = bEIntermediateSigningKeyModel;
        this.protocolVersion = str;
        this.signature = str2;
        this.signedMessage = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEIntermediateSigningKeyModel getIntermediateSigningKey() {
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
        if (!(other instanceof BEGooglePayTokenModel)) {
            return false;
        }
        BEGooglePayTokenModel bEGooglePayTokenModel = (BEGooglePayTokenModel) other;
        return t.c(this.intermediateSigningKey, bEGooglePayTokenModel.intermediateSigningKey) && t.c(this.protocolVersion, bEGooglePayTokenModel.protocolVersion) && t.c(this.signature, bEGooglePayTokenModel.signature) && t.c(this.signedMessage, bEGooglePayTokenModel.signedMessage);
    }

    public int hashCode() {
        return (((((this.intermediateSigningKey.hashCode() * 31) + this.protocolVersion.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.signedMessage.hashCode();
    }

    public String toString() {
        return "BEGooglePayTokenModel(intermediateSigningKey=" + this.intermediateSigningKey + ", protocolVersion=" + this.protocolVersion + ", signature=" + this.signature + ", signedMessage=" + this.signedMessage + ")";
    }
}
