package tv0;

import fr.t;
import iy.b0;
import java.util.Iterator;
import java.util.Map;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Ltv0/l;", "", "a", "c", "b", "Ltv0/l$b;", "Ltv0/l$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f192424a;

    /* JADX INFO: renamed from: tv0.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltv0/l$a;", "", "<init>", "()V", "Ltv0/l;", "Ltv0/l$c;", "b", "(Ltv0/l;)Ltv0/l$c;", "Ltv0/l$b;", "a", "(Ltv0/l;)Ltv0/l$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f192424a = new Companion();

        private Companion() {
        }

        public final CompanyOwner a(l lVar) {
            CompanyOwner companyOwner = lVar instanceof CompanyOwner ? (CompanyOwner) lVar : null;
            if (companyOwner == null) {
                return new CompanyOwner(null, null, null, 7, null);
            }
            return companyOwner;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final PhysicalOwner b(l lVar) {
            Map map = null;
            Object[] objArr = 0;
            PhysicalOwner physicalOwner = lVar instanceof PhysicalOwner ? (PhysicalOwner) lVar : null;
            return physicalOwner == null ? new PhysicalOwner(map, 1, objArr == true ? 1 : 0) : physicalOwner;
        }
    }

    /* JADX INFO: renamed from: tv0.l$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006 "}, d2 = {"Ltv0/l$b;", "Ltv0/l;", "Liy/b0;", "name", "Lxw/h;", "phoneNumber", "email", "<init>", "(Liy/b0;Lxw/h;Liy/b0;)V", "", "f", "()Z", "a", "(Liy/b0;Lxw/h;Liy/b0;)Ltv0/l$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Liy/b0;", "d", "()Liy/b0;", "c", "Lxw/h;", "e", "()Lxw/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CompanyOwner implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final PhoneNumber phoneNumber;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 email;

        public CompanyOwner() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ CompanyOwner b(CompanyOwner companyOwner, b0 b0Var, PhoneNumber phoneNumber, b0 b0Var2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                b0Var = companyOwner.name;
            }
            if ((i15 & 2) != 0) {
                phoneNumber = companyOwner.phoneNumber;
            }
            if ((i15 & 4) != 0) {
                b0Var2 = companyOwner.email;
            }
            return companyOwner.a(b0Var, phoneNumber, b0Var2);
        }

        public final CompanyOwner a(b0 name, PhoneNumber phoneNumber, b0 email) {
            return new CompanyOwner(name, phoneNumber, email);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final PhoneNumber getPhoneNumber() {
            return this.phoneNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompanyOwner)) {
                return false;
            }
            CompanyOwner companyOwner = (CompanyOwner) other;
            return t.c(this.name, companyOwner.name) && t.c(this.phoneNumber, companyOwner.phoneNumber) && t.c(this.email, companyOwner.email);
        }

        public final boolean f() {
            if (!this.name.c(new PhysicalOwner.PersonData(null, null, null, null, 15, null).getName())) {
                return true;
            }
            if (this.email.c(new PhysicalOwner.PersonData(null, null, null, null, 15, null).getEmail())) {
                return !this.phoneNumber.g().c(new PhysicalOwner.PersonData(null, null, null, null, 15, null).getPhoneNumber().g());
            }
            return true;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode();
        }

        public String toString() {
            return "CompanyOwner(name=" + this.name + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ")";
        }

        public CompanyOwner(b0 b0Var, PhoneNumber phoneNumber, b0 b0Var2) {
            this.name = b0Var;
            this.phoneNumber = phoneNumber;
            this.email = b0Var2;
        }

        public /* synthetic */ CompanyOwner(b0 b0Var, PhoneNumber phoneNumber, b0 b0Var2, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? PhoneNumber.INSTANCE.a() : phoneNumber, (i15 & 4) != 0 ? b0.INSTANCE.a() : b0Var2);
        }
    }

    /* JADX INFO: renamed from: tv0.l$c, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0003\u001a\u000b\u0018B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ltv0/l$c;", "Ltv0/l;", "", "Ltv0/l$c$c;", "Ltv0/l$c$b;", "owners", "<init>", "(Ljava/util/Map;)V", "", "d", "()Z", "b", "(Ljava/util/Map;)Ltv0/l$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhysicalOwner implements l {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Map<EnumC5029c, PersonData> f192429d = v0.f(y.a(EnumC5029c.OWNER, new PersonData(null, null, null, null, 15, null)));

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<EnumC5029c, PersonData> owners;

        /* JADX INFO: renamed from: tv0.l$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltv0/l$c$a;", "", "<init>", "()V", "", "Ltv0/l$c$c;", "Ltv0/l$c$b;", "DEFAULT", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final Map<EnumC5029c, PersonData> a() {
                return PhysicalOwner.f192429d;
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: tv0.l$c$b, reason: from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006!"}, d2 = {"Ltv0/l$c$b;", "", "Liy/b0;", "name", "surname", "Lxw/h;", "phoneNumber", "email", "<init>", "(Liy/b0;Liy/b0;Lxw/h;Liy/b0;)V", "", "g", "()Z", "a", "(Liy/b0;Liy/b0;Lxw/h;Liy/b0;)Ltv0/l$c$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "d", "()Liy/b0;", "b", "f", "c", "Lxw/h;", "e", "()Lxw/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PersonData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 name;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 surname;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhoneNumber phoneNumber;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 email;

            public PersonData() {
                this(null, null, null, null, 15, null);
            }

            public static /* synthetic */ PersonData b(PersonData personData, b0 b0Var, b0 b0Var2, PhoneNumber phoneNumber, b0 b0Var3, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    b0Var = personData.name;
                }
                if ((i15 & 2) != 0) {
                    b0Var2 = personData.surname;
                }
                if ((i15 & 4) != 0) {
                    phoneNumber = personData.phoneNumber;
                }
                if ((i15 & 8) != 0) {
                    b0Var3 = personData.email;
                }
                return personData.a(b0Var, b0Var2, phoneNumber, b0Var3);
            }

            public final PersonData a(b0 name, b0 surname, PhoneNumber phoneNumber, b0 email) {
                return new PersonData(name, surname, phoneNumber, email);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final b0 getEmail() {
                return this.email;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final b0 getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final PhoneNumber getPhoneNumber() {
                return this.phoneNumber;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PersonData)) {
                    return false;
                }
                PersonData personData = (PersonData) other;
                return t.c(this.name, personData.name) && t.c(this.surname, personData.surname) && t.c(this.phoneNumber, personData.phoneNumber) && t.c(this.email, personData.email);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final b0 getSurname() {
                return this.surname;
            }

            public final boolean g() {
                if (!this.name.c(new PersonData(null, null, null, null, 15, null).name)) {
                    return true;
                }
                if (!this.surname.c(new PersonData(null, null, null, null, 15, null).surname)) {
                    return true;
                }
                if (this.email.c(new PersonData(null, null, null, null, 15, null).email)) {
                    return !this.phoneNumber.g().c(new PersonData(null, null, null, null, 15, null).phoneNumber.g());
                }
                return true;
            }

            public int hashCode() {
                return (((((this.name.hashCode() * 31) + this.surname.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode();
            }

            public String toString() {
                return "PersonData(name=" + this.name + ", surname=" + this.surname + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ")";
            }

            public PersonData(b0 b0Var, b0 b0Var2, PhoneNumber phoneNumber, b0 b0Var3) {
                this.name = b0Var;
                this.surname = b0Var2;
                this.phoneNumber = phoneNumber;
                this.email = b0Var3;
            }

            public /* synthetic */ PersonData(b0 b0Var, b0 b0Var2, PhoneNumber phoneNumber, b0 b0Var3, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var2, (i15 & 4) != 0 ? PhoneNumber.INSTANCE.a() : phoneNumber, (i15 & 8) != 0 ? b0.INSTANCE.a() : b0Var3);
            }
        }

        /* JADX INFO: renamed from: tv0.l$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ltv0/l$c$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC5029c {
            OWNER,
            CO_OWNER;


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ wq.a f192439e = wq.b.a(b());

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: tv0.l$c$c$a, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltv0/l$c$c$a;", "", "<init>", "()V", "", "index", "Ltv0/l$c$c;", "a", "(I)Ltv0/l$c$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(fr.k kVar) {
                    this();
                }

                public final EnumC5029c a(int index) {
                    EnumC5029c next;
                    Iterator<EnumC5029c> it = EnumC5029c.e().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (next.ordinal() == index) {
                            return next;
                        }
                    }
                    next = null;
                    return next;
                }

                private Companion() {
                }
            }

            public static wq.a<EnumC5029c> e() {
                return f192439e;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PhysicalOwner() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final PhysicalOwner b(Map<EnumC5029c, PersonData> owners) {
            return new PhysicalOwner(owners);
        }

        public final Map<EnumC5029c, PersonData> c() {
            return this.owners;
        }

        public final boolean d() {
            if (this.owners.size() <= 1) {
                PersonData personData = this.owners.get(EnumC5029c.OWNER);
                if (!(personData != null ? personData.g() : false)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PhysicalOwner) && t.c(this.owners, ((PhysicalOwner) other).owners);
        }

        public int hashCode() {
            return this.owners.hashCode();
        }

        public String toString() {
            return "PhysicalOwner(owners=" + this.owners + ")";
        }

        public PhysicalOwner(Map<EnumC5029c, PersonData> map) {
            this.owners = map;
        }

        public /* synthetic */ PhysicalOwner(Map map, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? f192429d : map);
        }
    }
}
