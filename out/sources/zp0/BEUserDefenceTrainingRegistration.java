package zp0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zp0.t, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, d2 = {"Lzp0/t;", "", "Lzp0/z;", "status", "Lzp0/c0;", "training", "Lzp0/a0;", "unit", "", "Lzp0/h;", "childParticipants", "<init>", "(Lzp0/z;Lzp0/c0;Lzp0/a0;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp0/z;", "b", "()Lzp0/z;", "Lzp0/c0;", "c", "()Lzp0/c0;", "Lzp0/a0;", "d", "()Lzp0/a0;", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEUserDefenceTrainingRegistration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final z status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserDefenceTraining training;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DefenceUnit unit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BERegisteredChildParticipant> childParticipants;

    public BEUserDefenceTrainingRegistration(z zVar, UserDefenceTraining userDefenceTraining, DefenceUnit defenceUnit, List<BERegisteredChildParticipant> list) {
        this.status = zVar;
        this.training = userDefenceTraining;
        this.unit = defenceUnit;
        this.childParticipants = list;
    }

    public final List<BERegisteredChildParticipant> a() {
        return this.childParticipants;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final z getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final UserDefenceTraining getTraining() {
        return this.training;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DefenceUnit getUnit() {
        return this.unit;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEUserDefenceTrainingRegistration)) {
            return false;
        }
        BEUserDefenceTrainingRegistration bEUserDefenceTrainingRegistration = (BEUserDefenceTrainingRegistration) other;
        return this.status == bEUserDefenceTrainingRegistration.status && fr.t.c(this.training, bEUserDefenceTrainingRegistration.training) && fr.t.c(this.unit, bEUserDefenceTrainingRegistration.unit) && fr.t.c(this.childParticipants, bEUserDefenceTrainingRegistration.childParticipants);
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.training.hashCode()) * 31) + this.unit.hashCode()) * 31) + this.childParticipants.hashCode();
    }

    public String toString() {
        return "BEUserDefenceTrainingRegistration(status=" + this.status + ", training=" + this.training + ", unit=" + this.unit + ", childParticipants=" + this.childParticipants + ")";
    }
}
