package g71;

import al0.s0;
import fr.t;
import i61.ChildDataResult;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lg71/a;", "", "Li61/c;", "childDataResult", "Loq/i0;", "S6", "(Li61/c;)V", "Lg71/a$a;", "S3", "()Lg71/a$a;", "childPassportInput", "l6", "()Li61/c;", "childPassportResult", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: g71.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lg71/a$a;", "", "Lal0/s0;", "passportType", "", "childId", "Liy/b0;", "birthPlaceInput", "<init>", "(Lal0/s0;Ljava/lang/String;Liy/b0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/s0;", "c", "()Lal0/s0;", "b", "Ljava/lang/String;", "Liy/b0;", "()Liy/b0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f71144d = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final s0 passportType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String childId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 birthPlaceInput;

        public Input(s0 s0Var, String str, b0 b0Var) {
            this.passportType = s0Var;
            this.childId = str;
            this.birthPlaceInput = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getBirthPlaceInput() {
            return this.birthPlaceInput;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getChildId() {
            return this.childId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final s0 getPassportType() {
            return this.passportType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return this.passportType == input.passportType && t.c(this.childId, input.childId) && t.c(this.birthPlaceInput, input.birthPlaceInput);
        }

        public int hashCode() {
            int iHashCode = ((this.passportType.hashCode() * 31) + this.childId.hashCode()) * 31;
            b0 b0Var = this.birthPlaceInput;
            return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
        }

        public String toString() {
            return "Input(passportType=" + this.passportType + ", childId=" + this.childId + ", birthPlaceInput=" + this.birthPlaceInput + ')';
        }
    }

    Input S3();

    void S6(ChildDataResult childDataResult);

    ChildDataResult l6();
}
