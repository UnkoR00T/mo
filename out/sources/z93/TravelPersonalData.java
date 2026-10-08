package z93;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: z93.p, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\n¨\u0006\u001a"}, d2 = {"Lz93/p;", "", "", "firstName", "Lxw/g;", "pesel", "surname", "<init>", "(Ljava/lang/String;Liy/b0;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "c", "()Liy/b0;", "d", "nameAndSurname", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelPersonalData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f233764d = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 pesel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String surname;

    public /* synthetic */ TravelPersonalData(String str, b0 b0Var, String str2, fr.k kVar) {
        this(str, b0Var, str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    public final String b() {
        return this.firstName + ' ' + this.surname;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getPesel() {
        return this.pesel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPersonalData)) {
            return false;
        }
        TravelPersonalData travelPersonalData = (TravelPersonalData) other;
        return t.c(this.firstName, travelPersonalData.firstName) && xw.g.f(this.pesel, travelPersonalData.pesel) && t.c(this.surname, travelPersonalData.surname);
    }

    public int hashCode() {
        return (((this.firstName.hashCode() * 31) + xw.g.h(this.pesel)) * 31) + this.surname.hashCode();
    }

    public String toString() {
        return "TravelPersonalData(firstName=" + this.firstName + ", pesel=" + ((Object) xw.g.i(this.pesel)) + ", surname=" + this.surname + ')';
    }

    private TravelPersonalData(String str, b0 b0Var, String str2) {
        this.firstName = str;
        this.pesel = b0Var;
        this.surname = str2;
    }
}
