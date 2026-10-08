package zh3;

import fr.t;
import j30.ButtonTextData;
import mx.Label;
import n50.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lzh3/a;", "", "b", "a", "Lzh3/a$a;", "Lzh3/a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: zh3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, d2 = {"Lzh3/a$a;", "Lzh3/a;", "Lv50/c;", "nameInput", "phoneInput", "emailInput", "<init>", "(Lv50/c;Lv50/c;Lv50/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv50/c;", "b", "()Lv50/c;", "c", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CompanyOwner implements a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f235268d = v50.c.f203957t;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c nameInput;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c phoneInput;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c emailInput;

        public CompanyOwner(v50.c cVar, v50.c cVar2, v50.c cVar3) {
            this.nameInput = cVar;
            this.phoneInput = cVar2;
            this.emailInput = cVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final v50.c getEmailInput() {
            return this.emailInput;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final v50.c getNameInput() {
            return this.nameInput;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final v50.c getPhoneInput() {
            return this.phoneInput;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompanyOwner)) {
                return false;
            }
            CompanyOwner companyOwner = (CompanyOwner) other;
            return t.c(this.nameInput, companyOwner.nameInput) && t.c(this.phoneInput, companyOwner.phoneInput) && t.c(this.emailInput, companyOwner.emailInput);
        }

        public int hashCode() {
            return (((this.nameInput.hashCode() * 31) + this.phoneInput.hashCode()) * 31) + this.emailInput.hashCode();
        }

        public String toString() {
            return "CompanyOwner(nameInput=" + this.nameInput + ", phoneInput=" + this.phoneInput + ", emailInput=" + this.emailInput + ')';
        }
    }

    /* JADX INFO: renamed from: zh3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0013\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lzh3/a$b;", "Lzh3/a;", "Lzh3/a$b$b;", "ownerData", "Lzh3/a$b$a;", "coOwnerData", "<init>", "(Lzh3/a$b$b;Lzh3/a$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzh3/a$b$b;", "b", "()Lzh3/a$b$b;", "Lzh3/a$b$a;", "()Lzh3/a$b$a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhysicalOwner implements a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f235272c = v50.c.f203957t;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PersonScreenModel ownerData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC6342a coOwnerData;

        /* JADX INFO: renamed from: zh3.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lzh3/a$b$a;", "", "b", "a", "Lzh3/a$b$a$a;", "Lzh3/a$b$a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC6342a {

            /* JADX INFO: renamed from: zh3.a$b$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lzh3/a$b$a$a;", "Lzh3/a$b$a;", "Lmx/a;", "sectionTitle", "Lj30/a;", "closeSectionButtonData", "Lzh3/a$b$b;", "personData", "<init>", "(Lmx/a;Lj30/a;Lzh3/a$b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Lj30/a;", "()Lj30/a;", "Lzh3/a$b$b;", "()Lzh3/a$b$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Expanded implements InterfaceC6342a {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final int f235275d = v50.c.f203957t | ButtonTextData.f99099f;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label sectionTitle;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final ButtonTextData closeSectionButtonData;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final PersonScreenModel personData;

                public Expanded(Label label, ButtonTextData buttonTextData, PersonScreenModel personScreenModel) {
                    this.sectionTitle = label;
                    this.closeSectionButtonData = buttonTextData;
                    this.personData = personScreenModel;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final ButtonTextData getCloseSectionButtonData() {
                    return this.closeSectionButtonData;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final PersonScreenModel getPersonData() {
                    return this.personData;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final Label getSectionTitle() {
                    return this.sectionTitle;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Expanded)) {
                        return false;
                    }
                    Expanded expanded = (Expanded) other;
                    return t.c(this.sectionTitle, expanded.sectionTitle) && t.c(this.closeSectionButtonData, expanded.closeSectionButtonData) && t.c(this.personData, expanded.personData);
                }

                public int hashCode() {
                    return (((this.sectionTitle.hashCode() * 31) + this.closeSectionButtonData.hashCode()) * 31) + this.personData.hashCode();
                }

                public String toString() {
                    return "Expanded(sectionTitle=" + this.sectionTitle + ", closeSectionButtonData=" + this.closeSectionButtonData + ", personData=" + this.personData + ')';
                }
            }

            /* JADX INFO: renamed from: zh3.a$b$a$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzh3/a$b$a$b;", "Lzh3/a$b$a;", "Ln50/k;", "expandSingleCardData", "<init>", "(Ln50/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln50/k;", "()Ln50/k;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Folded implements InterfaceC6342a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final k expandSingleCardData;

                public Folded(k kVar) {
                    this.expandSingleCardData = kVar;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final k getExpandSingleCardData() {
                    return this.expandSingleCardData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Folded) && t.c(this.expandSingleCardData, ((Folded) other).expandSingleCardData);
                }

                public int hashCode() {
                    return this.expandSingleCardData.hashCode();
                }

                public String toString() {
                    return "Folded(expandSingleCardData=" + this.expandSingleCardData + ')';
                }
            }
        }

        /* JADX INFO: renamed from: zh3.a$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lzh3/a$b$b;", "", "Lv50/c;", "nameInput", "surnameInput", "phoneInput", "emailInput", "<init>", "(Lv50/c;Lv50/c;Lv50/c;Lv50/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv50/c;", "b", "()Lv50/c;", "d", "c", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PersonScreenModel {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f235280e = v50.c.f203957t;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c nameInput;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c surnameInput;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c phoneInput;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c emailInput;

            public PersonScreenModel(v50.c cVar, v50.c cVar2, v50.c cVar3, v50.c cVar4) {
                this.nameInput = cVar;
                this.surnameInput = cVar2;
                this.phoneInput = cVar3;
                this.emailInput = cVar4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final v50.c getEmailInput() {
                return this.emailInput;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final v50.c getNameInput() {
                return this.nameInput;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final v50.c getPhoneInput() {
                return this.phoneInput;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final v50.c getSurnameInput() {
                return this.surnameInput;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PersonScreenModel)) {
                    return false;
                }
                PersonScreenModel personScreenModel = (PersonScreenModel) other;
                return t.c(this.nameInput, personScreenModel.nameInput) && t.c(this.surnameInput, personScreenModel.surnameInput) && t.c(this.phoneInput, personScreenModel.phoneInput) && t.c(this.emailInput, personScreenModel.emailInput);
            }

            public int hashCode() {
                return (((((this.nameInput.hashCode() * 31) + this.surnameInput.hashCode()) * 31) + this.phoneInput.hashCode()) * 31) + this.emailInput.hashCode();
            }

            public String toString() {
                return "PersonScreenModel(nameInput=" + this.nameInput + ", surnameInput=" + this.surnameInput + ", phoneInput=" + this.phoneInput + ", emailInput=" + this.emailInput + ')';
            }
        }

        public PhysicalOwner(PersonScreenModel personScreenModel, InterfaceC6342a interfaceC6342a) {
            this.ownerData = personScreenModel;
            this.coOwnerData = interfaceC6342a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC6342a getCoOwnerData() {
            return this.coOwnerData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PersonScreenModel getOwnerData() {
            return this.ownerData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhysicalOwner)) {
                return false;
            }
            PhysicalOwner physicalOwner = (PhysicalOwner) other;
            return t.c(this.ownerData, physicalOwner.ownerData) && t.c(this.coOwnerData, physicalOwner.coOwnerData);
        }

        public int hashCode() {
            return (this.ownerData.hashCode() * 31) + this.coOwnerData.hashCode();
        }

        public String toString() {
            return "PhysicalOwner(ownerData=" + this.ownerData + ", coOwnerData=" + this.coOwnerData + ')';
        }
    }
}
