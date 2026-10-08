package y52;

import fr.k;
import fr.t;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Ly52/g;", "", "", "c", "()Ljava/lang/String;", "Liy/b0;", "a", "()Liy/b0;", "firstName", "d", "lastName", "Lxw/g;", "b", "pesel", "Ly52/g$a;", "Ly52/g$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: y52.g$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Ly52/g$a;", "Ly52/g;", "Liy/b0;", "firstName", "lastName", "Lxw/g;", "pesel", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "d", "c", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MyPersonalData implements g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f224262d = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 firstName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 lastName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pesel;

        public /* synthetic */ MyPersonalData(b0 b0Var, b0 b0Var2, b0 b0Var3, k kVar) {
            this(b0Var, b0Var2, b0Var3);
        }

        @Override // y52.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public b0 getFirstName() {
            return this.firstName;
        }

        @Override // y52.g
        /* JADX INFO: renamed from: b, reason: from getter */
        public b0 getPesel() {
            return this.pesel;
        }

        @Override // y52.g
        public /* bridge */ String c() {
            return super.c();
        }

        @Override // y52.g
        /* JADX INFO: renamed from: d, reason: from getter */
        public b0 getLastName() {
            return this.lastName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MyPersonalData)) {
                return false;
            }
            MyPersonalData myPersonalData = (MyPersonalData) other;
            return t.c(this.firstName, myPersonalData.firstName) && t.c(this.lastName, myPersonalData.lastName) && xw.g.f(this.pesel, myPersonalData.pesel);
        }

        public int hashCode() {
            return (((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + xw.g.h(this.pesel);
        }

        public String toString() {
            return "MyPersonalData(firstName=" + this.firstName + ", lastName=" + this.lastName + ", pesel=" + ((Object) xw.g.i(this.pesel)) + ')';
        }

        private MyPersonalData(b0 b0Var, b0 b0Var2, b0 b0Var3) {
            this.firstName = b0Var;
            this.lastName = b0Var2;
            this.pesel = b0Var3;
        }
    }

    /* JADX INFO: renamed from: y52.g$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Ly52/g$b;", "Ly52/g;", "Liy/b0;", "firstName", "lastName", "Lxw/g;", "pesel", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "d", "c", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OtherPersonData implements g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f224266d = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 firstName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 lastName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pesel;

        public /* synthetic */ OtherPersonData(b0 b0Var, b0 b0Var2, b0 b0Var3, k kVar) {
            this(b0Var, b0Var2, b0Var3);
        }

        @Override // y52.g
        /* JADX INFO: renamed from: a, reason: from getter */
        public b0 getFirstName() {
            return this.firstName;
        }

        @Override // y52.g
        /* JADX INFO: renamed from: b, reason: from getter */
        public b0 getPesel() {
            return this.pesel;
        }

        @Override // y52.g
        /* JADX INFO: renamed from: d, reason: from getter */
        public b0 getLastName() {
            return this.lastName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OtherPersonData)) {
                return false;
            }
            OtherPersonData otherPersonData = (OtherPersonData) other;
            return t.c(this.firstName, otherPersonData.firstName) && t.c(this.lastName, otherPersonData.lastName) && xw.g.f(this.pesel, otherPersonData.pesel);
        }

        public int hashCode() {
            return (((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + xw.g.h(this.pesel);
        }

        public String toString() {
            return "OtherPersonData(firstName=" + this.firstName + ", lastName=" + this.lastName + ", pesel=" + ((Object) xw.g.i(this.pesel)) + ')';
        }

        private OtherPersonData(b0 b0Var, b0 b0Var2, b0 b0Var3) {
            this.firstName = b0Var;
            this.lastName = b0Var2;
            this.pesel = b0Var3;
        }
    }

    /* JADX INFO: renamed from: a */
    b0 getFirstName();

    /* JADX INFO: renamed from: b */
    b0 getPesel();

    default String c() {
        return v.v0(v.s(c0.e(getFirstName()), c0.e(getLastName())), " ", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: d */
    b0 getLastName();
}
