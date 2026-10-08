package ha3;

import fr.t;
import ga3.Field;
import ga3.StageField;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lha3/c;", "Lgz/a;", "Lha3/c$a;", "", "<init>", "()V", "params", "b", "(Lha3/c$a;)Ljava/lang/Boolean;", "a", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.a<Params, Boolean> {

    /* JADX INFO: renamed from: ha3.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lha3/c$a;", "Lgz/b$a;", "", "Lga3/d;", "stages", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<StageField> stages;

        public Params(List<StageField> list) {
            this.stages = list;
        }

        public final List<StageField> a() {
            return this.stages;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.stages, ((Params) other).stages);
        }

        public int hashCode() {
            return this.stages.hashCode();
        }

        public String toString() {
            return "Params(stages=" + this.stages + ')';
        }
    }

    public Boolean b(Params params) {
        Field<fz.e.LocalDate> fieldC;
        fz.e.LocalDate localDateD;
        Field<fz.e.LocalDate> fieldC2;
        fz.e.LocalDate localDateD2;
        StageField stageField = (StageField) v.n0(params.a());
        LocalDate end = null;
        LocalDate start = (stageField == null || (fieldC2 = stageField.c()) == null || (localDateD2 = fieldC2.d()) == null) ? null : localDateD2.getStart();
        StageField stageField2 = (StageField) v.z0(params.a());
        if (stageField2 != null && (fieldC = stageField2.c()) != null && (localDateD = fieldC.d()) != null) {
            end = localDateD.getEnd();
        }
        boolean z15 = false;
        if (start != null && end != null && Period.between(start, end).getYears() >= fa3.a.a().getYears()) {
            z15 = true;
        }
        return Boolean.valueOf(z15);
    }
}
