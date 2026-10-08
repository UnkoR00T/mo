package k41;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k41.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u000b\u0019B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lk41/b;", "", "Lk41/b$a;", "childData", "Lk41/b$b;", "validations", "<init>", "(Lk41/b$a;Lk41/b$b;)V", "", "e", "()Z", "a", "(Lk41/b$a;Lk41/b$b;)Lk41/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lk41/b$a;", "c", "()Lk41/b$a;", "b", "Lk41/b$b;", "d", "()Lk41/b$b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildDataWithValidation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f108266c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Child childData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChildValidations validations;

    /* JADX INFO: renamed from: k41.b$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006!"}, d2 = {"Lk41/b$a;", "", "Liy/b0;", "name", "secondName", "surname", "nationality", "Lfz/b$c;", "birthDate", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Lfz/b$c;)V", "a", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Lfz/b$c;)Lk41/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "d", "()Liy/b0;", "b", "f", "c", "g", "e", "Lfz/b$c;", "()Lfz/b$c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Child {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f108269f;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 secondName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 surname;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 nationality;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate birthDate;

        static {
            int i15 = fz.b.LocalDate.f68860b;
            int i16 = iy.b0.f97726c;
            f108269f = i15 | i16 | i16 | i16 | i16;
        }

        public Child() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ Child b(Child child, iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, iy.b0 b0Var4, fz.b.LocalDate localDate, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                b0Var = child.name;
            }
            if ((i15 & 2) != 0) {
                b0Var2 = child.secondName;
            }
            if ((i15 & 4) != 0) {
                b0Var3 = child.surname;
            }
            if ((i15 & 8) != 0) {
                b0Var4 = child.nationality;
            }
            if ((i15 & 16) != 0) {
                localDate = child.birthDate;
            }
            fz.b.LocalDate localDate2 = localDate;
            iy.b0 b0Var5 = b0Var3;
            return child.a(b0Var, b0Var2, b0Var5, b0Var4, localDate2);
        }

        public final Child a(iy.b0 name, iy.b0 secondName, iy.b0 surname, iy.b0 nationality, fz.b.LocalDate birthDate) {
            return new Child(name, secondName, surname, nationality, birthDate);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final fz.b.LocalDate getBirthDate() {
            return this.birthDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final iy.b0 getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final iy.b0 getNationality() {
            return this.nationality;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Child)) {
                return false;
            }
            Child child = (Child) other;
            return fr.t.c(this.name, child.name) && fr.t.c(this.secondName, child.secondName) && fr.t.c(this.surname, child.surname) && fr.t.c(this.nationality, child.nationality) && fr.t.c(this.birthDate, child.birthDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final iy.b0 getSecondName() {
            return this.secondName;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final iy.b0 getSurname() {
            return this.surname;
        }

        public int hashCode() {
            int iHashCode = ((((((this.name.hashCode() * 31) + this.secondName.hashCode()) * 31) + this.surname.hashCode()) * 31) + this.nationality.hashCode()) * 31;
            fz.b.LocalDate localDate = this.birthDate;
            return iHashCode + (localDate == null ? 0 : localDate.hashCode());
        }

        public String toString() {
            return "Child(name=" + this.name + ", secondName=" + this.secondName + ", surname=" + this.surname + ", nationality=" + this.nationality + ", birthDate=" + this.birthDate + ')';
        }

        public Child(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, iy.b0 b0Var4, fz.b.LocalDate localDate) {
            this.name = b0Var;
            this.secondName = b0Var2;
            this.surname = b0Var3;
            this.nationality = b0Var4;
            this.birthDate = localDate;
        }

        public /* synthetic */ Child(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, iy.b0 b0Var4, fz.b.LocalDate localDate, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? iy.b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? iy.b0.INSTANCE.a() : b0Var2, (i15 & 4) != 0 ? iy.b0.INSTANCE.a() : b0Var3, (i15 & 8) != 0 ? iy.c0.g("polskie") : b0Var4, (i15 & 16) != 0 ? null : localDate);
        }
    }

    /* JADX INFO: renamed from: k41.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lk41/b$b;", "", "Lhz/b;", "name", "secondName", "surname", "birthDate", "<init>", "(Lhz/b;Lhz/b;Lhz/b;Lhz/b;)V", "", "g", "()Z", "a", "(Lhz/b;Lhz/b;Lhz/b;Lhz/b;)Lk41/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "d", "()Lhz/b;", "b", "e", "c", "f", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChildValidations {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f108275e = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b secondName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b surname;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b birthDate;

        public ChildValidations() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ ChildValidations b(ChildValidations childValidations, hz.b bVar, hz.b bVar2, hz.b bVar3, hz.b bVar4, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = childValidations.name;
            }
            if ((i15 & 2) != 0) {
                bVar2 = childValidations.secondName;
            }
            if ((i15 & 4) != 0) {
                bVar3 = childValidations.surname;
            }
            if ((i15 & 8) != 0) {
                bVar4 = childValidations.birthDate;
            }
            return childValidations.a(bVar, bVar2, bVar3, bVar4);
        }

        public final ChildValidations a(hz.b name, hz.b secondName, hz.b surname, hz.b birthDate) {
            return new ChildValidations(name, secondName, surname, birthDate);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getBirthDate() {
            return this.birthDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final hz.b getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final hz.b getSecondName() {
            return this.secondName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChildValidations)) {
                return false;
            }
            ChildValidations childValidations = (ChildValidations) other;
            return fr.t.c(this.name, childValidations.name) && fr.t.c(this.secondName, childValidations.secondName) && fr.t.c(this.surname, childValidations.surname) && fr.t.c(this.birthDate, childValidations.birthDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final hz.b getSurname() {
            return this.surname;
        }

        public final boolean g() {
            List listQ = pq.v.q(this.name, this.secondName, this.surname, this.birthDate);
            if ((listQ instanceof Collection) && listQ.isEmpty()) {
                return true;
            }
            Iterator it = listQ.iterator();
            while (it.hasNext()) {
                if (!((hz.b) it.next()).a()) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.secondName.hashCode()) * 31) + this.surname.hashCode()) * 31) + this.birthDate.hashCode();
        }

        public String toString() {
            return "ChildValidations(name=" + this.name + ", secondName=" + this.secondName + ", surname=" + this.surname + ", birthDate=" + this.birthDate + ')';
        }

        public ChildValidations(hz.b bVar, hz.b bVar2, hz.b bVar3, hz.b bVar4) {
            this.name = bVar;
            this.secondName = bVar2;
            this.surname = bVar3;
            this.birthDate = bVar4;
        }

        public /* synthetic */ ChildValidations(hz.b bVar, hz.b bVar2, hz.b bVar3, hz.b bVar4, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar3, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar4);
        }
    }

    static {
        int i15 = hz.b.f86845b | fz.b.LocalDate.f68860b;
        int i16 = iy.b0.f97726c;
        f108266c = i15 | i16 | i16 | i16 | i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChildDataWithValidation() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChildDataWithValidation b(ChildDataWithValidation childDataWithValidation, Child child, ChildValidations childValidations, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            child = childDataWithValidation.childData;
        }
        if ((i15 & 2) != 0) {
            childValidations = childDataWithValidation.validations;
        }
        return childDataWithValidation.a(child, childValidations);
    }

    public final ChildDataWithValidation a(Child childData, ChildValidations validations) {
        return new ChildDataWithValidation(childData, validations);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Child getChildData() {
        return this.childData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ChildValidations getValidations() {
        return this.validations;
    }

    public final boolean e() {
        return this.validations.g();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildDataWithValidation)) {
            return false;
        }
        ChildDataWithValidation childDataWithValidation = (ChildDataWithValidation) other;
        return fr.t.c(this.childData, childDataWithValidation.childData) && fr.t.c(this.validations, childDataWithValidation.validations);
    }

    public int hashCode() {
        return (this.childData.hashCode() * 31) + this.validations.hashCode();
    }

    public String toString() {
        return "ChildDataWithValidation(childData=" + this.childData + ", validations=" + this.validations + ')';
    }

    public ChildDataWithValidation(Child child, ChildValidations childValidations) {
        this.childData = child;
        this.validations = childValidations;
    }

    public /* synthetic */ ChildDataWithValidation(Child child, ChildValidations childValidations, int i15, fr.k kVar) {
        if ((i15 & 1) != 0) {
            child = new Child(null, null, null, null, null, 31, null);
        }
        if ((i15 & 2) != 0) {
            childValidations = new ChildValidations(null, null, null, null, 15, null);
        }
        this(child, childValidations);
    }
}
