package uj1;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import zp0.BEUnitDefenceTrainingsByType;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Luj1/d;", "", "a", "Luj1/d$a;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: uj1.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Luj1/d$a;", "Luj1/d;", "", "Lzp0/s;", "availableTrainings", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Types implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEUnitDefenceTrainingsByType> availableTrainings;

        public Types(List<BEUnitDefenceTrainingsByType> list) {
            this.availableTrainings = list;
        }

        public final List<BEUnitDefenceTrainingsByType> a() {
            return this.availableTrainings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Types) && t.c(this.availableTrainings, ((Types) other).availableTrainings);
        }

        public int hashCode() {
            return this.availableTrainings.hashCode();
        }

        public String toString() {
            return "Types(availableTrainings=" + this.availableTrainings + ')';
        }
    }
}
