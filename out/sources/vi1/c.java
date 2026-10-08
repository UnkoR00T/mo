package vi1;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import zp0.BEUnitDefenceTrainingsByType;
import zp0.BEUserDefenceTrainingRegistration;
import zp0.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lvi1/c;", "", "", "Lzp0/s;", "a", "()Ljava/util/List;", "trainings", "b", "Lvi1/c$a;", "Lvi1/c$b;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: vi1.c$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lvi1/c$a;", "Lvi1/c;", "", "Lzp0/s;", "trainings", "Lzp0/y;", "registrationDisabledReason", "<init>", "(Ljava/util/List;Lzp0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lzp0/y;", "()Lzp0/y;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEUnitDefenceTrainingsByType> trainings;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y registrationDisabledReason;

        public Empty(List<BEUnitDefenceTrainingsByType> list, y yVar) {
            this.trainings = list;
            this.registrationDisabledReason = yVar;
        }

        @Override // vi1.c
        public List<BEUnitDefenceTrainingsByType> a() {
            return this.trainings;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public y getRegistrationDisabledReason() {
            return this.registrationDisabledReason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) other;
            return t.c(this.trainings, empty.trainings) && this.registrationDisabledReason == empty.registrationDisabledReason;
        }

        public int hashCode() {
            int iHashCode = this.trainings.hashCode() * 31;
            y yVar = this.registrationDisabledReason;
            return iHashCode + (yVar == null ? 0 : yVar.hashCode());
        }

        public String toString() {
            return "Empty(trainings=" + this.trainings + ", registrationDisabledReason=" + this.registrationDisabledReason + ')';
        }
    }

    /* JADX INFO: renamed from: vi1.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lvi1/c$b;", "Lvi1/c;", "", "Lzp0/t;", "registrations", "Lzp0/s;", "trainings", "Lzp0/y;", "registrationDisabledReason", "<init>", "(Ljava/util/List;Ljava/util/List;Lzp0/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lzp0/y;", "()Lzp0/y;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Registrations implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEUserDefenceTrainingRegistration> registrations;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEUnitDefenceTrainingsByType> trainings;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final y registrationDisabledReason;

        public Registrations(List<BEUserDefenceTrainingRegistration> list, List<BEUnitDefenceTrainingsByType> list2, y yVar) {
            this.registrations = list;
            this.trainings = list2;
            this.registrationDisabledReason = yVar;
        }

        @Override // vi1.c
        public List<BEUnitDefenceTrainingsByType> a() {
            return this.trainings;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public y getRegistrationDisabledReason() {
            return this.registrationDisabledReason;
        }

        public final List<BEUserDefenceTrainingRegistration> c() {
            return this.registrations;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Registrations)) {
                return false;
            }
            Registrations registrations = (Registrations) other;
            return t.c(this.registrations, registrations.registrations) && t.c(this.trainings, registrations.trainings) && this.registrationDisabledReason == registrations.registrationDisabledReason;
        }

        public int hashCode() {
            int iHashCode = ((this.registrations.hashCode() * 31) + this.trainings.hashCode()) * 31;
            y yVar = this.registrationDisabledReason;
            return iHashCode + (yVar == null ? 0 : yVar.hashCode());
        }

        public String toString() {
            return "Registrations(registrations=" + this.registrations + ", trainings=" + this.trainings + ", registrationDisabledReason=" + this.registrationDisabledReason + ')';
        }
    }

    List<BEUnitDefenceTrainingsByType> a();
}
