package dn0;

import fr.t;
import java.security.KeyPair;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dn0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u001c"}, d2 = {"Ldn0/b;", "", "", "sessionId", "secret", "qrCode", "Ljava/security/KeyPair;", "keyPair", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/security/KeyPair;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "Ljava/security/KeyPair;", "()Ljava/security/KeyPair;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StartVerificationSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secret;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String qrCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final KeyPair keyPair;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    public StartVerificationSession(String str, String str2, String str3, KeyPair keyPair, String str4) {
        this.sessionId = str;
        this.secret = str2;
        this.qrCode = str3;
        this.keyPair = keyPair;
        this.code = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final KeyPair getKeyPair() {
        return this.keyPair;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartVerificationSession)) {
            return false;
        }
        StartVerificationSession startVerificationSession = (StartVerificationSession) other;
        return t.c(this.sessionId, startVerificationSession.sessionId) && t.c(this.secret, startVerificationSession.secret) && t.c(this.qrCode, startVerificationSession.qrCode) && t.c(this.keyPair, startVerificationSession.keyPair) && t.c(this.code, startVerificationSession.code);
    }

    public int hashCode() {
        int iHashCode = ((((((this.sessionId.hashCode() * 31) + this.secret.hashCode()) * 31) + this.qrCode.hashCode()) * 31) + this.keyPair.hashCode()) * 31;
        String str = this.code;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "StartVerificationSession(sessionId=" + this.sessionId + ", secret=" + this.secret + ", qrCode=" + this.qrCode + ", keyPair=" + this.keyPair + ", code=" + this.code + ")";
    }
}
