package dq0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: dq0.l0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ldq0/l0;", "", "", "challenge", "Ldq0/k0;", "value", "<init>", "(Ljava/lang/String;Ldq0/k0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getChallenge", "b", "Ldq0/k0;", "getValue", "()Ldq0/k0;", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UnregisterFromDefenceTrainingRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("challenge")
    private final String challenge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("value")
    private final UnregisterFromDefenceTrainingDataDto value;

    public UnregisterFromDefenceTrainingRequestDto(String str, UnregisterFromDefenceTrainingDataDto unregisterFromDefenceTrainingDataDto) {
        this.challenge = str;
        this.value = unregisterFromDefenceTrainingDataDto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnregisterFromDefenceTrainingRequestDto)) {
            return false;
        }
        UnregisterFromDefenceTrainingRequestDto unregisterFromDefenceTrainingRequestDto = (UnregisterFromDefenceTrainingRequestDto) other;
        return fr.t.c(this.challenge, unregisterFromDefenceTrainingRequestDto.challenge) && fr.t.c(this.value, unregisterFromDefenceTrainingRequestDto.value);
    }

    public int hashCode() {
        return (this.challenge.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "UnregisterFromDefenceTrainingRequestDto(challenge=" + this.challenge + ", value=" + this.value + ')';
    }
}
