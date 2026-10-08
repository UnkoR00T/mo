package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.t3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lgm0/t3;", "", "", "challenge", "Lgm0/u3;", "value", "<init>", "(Ljava/lang/String;Lgm0/u3;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getChallenge", "b", "Lgm0/u3;", "getValue", "()Lgm0/u3;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportChildAgreementInvalidateRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("challenge")
    private final String challenge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("value")
    private final PassportChildAgreementInvalidateRequestDto value;

    public PassportChildAgreementInvalidateRequest(String str, PassportChildAgreementInvalidateRequestDto passportChildAgreementInvalidateRequestDto) {
        this.challenge = str;
        this.value = passportChildAgreementInvalidateRequestDto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportChildAgreementInvalidateRequest)) {
            return false;
        }
        PassportChildAgreementInvalidateRequest passportChildAgreementInvalidateRequest = (PassportChildAgreementInvalidateRequest) other;
        return fr.t.c(this.challenge, passportChildAgreementInvalidateRequest.challenge) && fr.t.c(this.value, passportChildAgreementInvalidateRequest.value);
    }

    public int hashCode() {
        return (this.challenge.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "PassportChildAgreementInvalidateRequest(challenge=" + this.challenge + ", value=" + this.value + ')';
    }
}
