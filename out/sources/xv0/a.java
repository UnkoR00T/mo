package xv0;

import fr.t;
import gz.b;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lxv0/a;", "", "Lxv0/a$a;", "Lpv0/a;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends b {

    /* JADX INFO: renamed from: xv0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"Lxv0/a$a;", "Lgz/b$a;", "Liy/b0;", "firstName", "surname", "seriesAndNumber", "<init>", "(Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 firstName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 surname;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 seriesAndNumber;

        public Params(b0 b0Var, b0 b0Var2, b0 b0Var3) {
            this.firstName = b0Var;
            this.surname = b0Var2;
            this.seriesAndNumber = b0Var3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getSeriesAndNumber() {
            return this.seriesAndNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getSurname() {
            return this.surname;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.firstName, params.firstName) && t.c(this.surname, params.surname) && t.c(this.seriesAndNumber, params.seriesAndNumber);
        }

        public int hashCode() {
            return (((this.firstName.hashCode() * 31) + this.surname.hashCode()) * 31) + this.seriesAndNumber.hashCode();
        }

        public String toString() {
            return "Params(firstName=" + this.firstName + ", surname=" + this.surname + ", seriesAndNumber=" + this.seriesAndNumber + ")";
        }
    }
}
