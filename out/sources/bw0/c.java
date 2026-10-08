package bw0;

import fr.k;
import fr.t;
import iy.b0;
import java.time.LocalDate;
import p071kotlin.Metadata;
import uv0.d;
import uv0.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lbw0/c;", "", "Lbw0/c$a;", "Luv0/m;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends gz.b {

    /* JADX INFO: renamed from: bw0.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lbw0/c$a;", "Lgz/b$a;", "Luv0/d;", "plate", "Luv0/v;", "vin", "Ljava/time/LocalDate;", "firstRegistrationDate", "<init>", "(Ljava/lang/String;Liy/b0;Ljava/time/LocalDate;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "c", "()Liy/b0;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String plate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 vin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate firstRegistrationDate;

        public /* synthetic */ Params(String str, b0 b0Var, LocalDate localDate, k kVar) {
            this(str, b0Var, localDate);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getFirstRegistrationDate() {
            return this.firstRegistrationDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlate() {
            return this.plate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getVin() {
            return this.vin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return d.e(this.plate, params.plate) && v.f(this.vin, params.vin) && t.c(this.firstRegistrationDate, params.firstRegistrationDate);
        }

        public int hashCode() {
            int iF = ((d.f(this.plate) * 31) + v.g(this.vin)) * 31;
            LocalDate localDate = this.firstRegistrationDate;
            return iF + (localDate == null ? 0 : localDate.hashCode());
        }

        public String toString() {
            return "Params(plate=" + d.h(this.plate) + ", vin=" + v.i(this.vin) + ", firstRegistrationDate=" + this.firstRegistrationDate + ")";
        }

        private Params(String str, b0 b0Var, LocalDate localDate) {
            this.plate = str;
            this.vin = b0Var;
            this.firstRegistrationDate = localDate;
        }
    }
}
