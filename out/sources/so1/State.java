package so1;

import java.security.KeyPair;
import javax.crypto.SecretKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: so1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJH\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, d2 = {"Lso1/c;", "", "", "keyAlias", "Lso1/b;", "generateKeyType", "Lf93/d$a;", "verificationResult", "Ljavax/crypto/SecretKey;", "secretKey", "Ljava/security/KeyPair;", "keyPair", "<init>", "(Ljava/lang/String;Lso1/b;Lf93/d$a;Ljavax/crypto/SecretKey;Ljava/security/KeyPair;)V", "a", "(Ljava/lang/String;Lso1/b;Lf93/d$a;Ljavax/crypto/SecretKey;Ljava/security/KeyPair;)Lso1/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Lso1/b;", "c", "()Lso1/b;", "Lf93/d$a;", "g", "()Lf93/d$a;", "Ljavax/crypto/SecretKey;", "f", "()Ljavax/crypto/SecretKey;", "e", "Ljava/security/KeyPair;", "()Ljava/security/KeyPair;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String keyAlias;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b generateKeyType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final f93.d.Result verificationResult;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final SecretKey secretKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final KeyPair keyPair;

    public State(String str, b bVar, f93.d.Result result, SecretKey secretKey, KeyPair keyPair) {
        this.keyAlias = str;
        this.generateKeyType = bVar;
        this.verificationResult = result;
        this.secretKey = secretKey;
        this.keyPair = keyPair;
    }

    public static /* synthetic */ State b(State state, String str, b bVar, f93.d.Result result, SecretKey secretKey, KeyPair keyPair, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.keyAlias;
        }
        if ((i15 & 2) != 0) {
            bVar = state.generateKeyType;
        }
        if ((i15 & 4) != 0) {
            result = state.verificationResult;
        }
        if ((i15 & 8) != 0) {
            secretKey = state.secretKey;
        }
        if ((i15 & 16) != 0) {
            keyPair = state.keyPair;
        }
        KeyPair keyPair2 = keyPair;
        f93.d.Result result2 = result;
        return state.a(str, bVar, result2, secretKey, keyPair2);
    }

    public final State a(String keyAlias, b generateKeyType, f93.d.Result verificationResult, SecretKey secretKey, KeyPair keyPair) {
        return new State(keyAlias, generateKeyType, verificationResult, secretKey, keyPair);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getGenerateKeyType() {
        return this.generateKeyType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getKeyAlias() {
        return this.keyAlias;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final KeyPair getKeyPair() {
        return this.keyPair;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.keyAlias, state.keyAlias) && this.generateKeyType == state.generateKeyType && fr.t.c(this.verificationResult, state.verificationResult) && fr.t.c(this.secretKey, state.secretKey) && fr.t.c(this.keyPair, state.keyPair);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final SecretKey getSecretKey() {
        return this.secretKey;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f93.d.Result getVerificationResult() {
        return this.verificationResult;
    }

    public int hashCode() {
        int iHashCode = ((this.keyAlias.hashCode() * 31) + this.generateKeyType.hashCode()) * 31;
        f93.d.Result result = this.verificationResult;
        int iHashCode2 = (iHashCode + (result == null ? 0 : result.hashCode())) * 31;
        SecretKey secretKey = this.secretKey;
        int iHashCode3 = (iHashCode2 + (secretKey == null ? 0 : secretKey.hashCode())) * 31;
        KeyPair keyPair = this.keyPair;
        return iHashCode3 + (keyPair != null ? keyPair.hashCode() : 0);
    }

    public String toString() {
        return "State(keyAlias=" + this.keyAlias + ", generateKeyType=" + this.generateKeyType + ", verificationResult=" + this.verificationResult + ", secretKey=" + this.secretKey + ", keyPair=" + this.keyPair + ')';
    }
}
