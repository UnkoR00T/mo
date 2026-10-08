package ib3;

import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lib3/l;", "", "a", "b", "Lib3/l$a;", "Lib3/l$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lib3/l$a;", "Lib3/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f90805a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1449964729;
        }

        public String toString() {
            return "FetchingContactDetails";
        }
    }

    /* JADX INFO: renamed from: ib3.l$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\f\u001cB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lib3/l$b;", "Lib3/l;", "Lib3/l$b$a;", "email", "Lib3/l$b$b;", "phoneNumber", "Lhz/b;", "groupValidationState", "Llb3/a;", "scrollToField", "<init>", "(Lib3/l$b$a;Lib3/l$b$b;Lhz/b;Llb3/a;)V", "a", "(Lib3/l$b$a;Lib3/l$b$b;Lhz/b;Llb3/a;)Lib3/l$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lib3/l$b$a;", "c", "()Lib3/l$b$a;", "b", "Lib3/l$b$b;", "e", "()Lib3/l$b$b;", "Lhz/b;", "d", "()Lhz/b;", "Llb3/a;", "f", "()Llb3/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements l {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f90806e;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EmailField email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final PhoneNumberField phoneNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b groupValidationState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final lb3.a scrollToField;

        static {
            int i15 = hz.b.f86845b;
            f90806e = i15 | PhoneNumber.f221634d | i15;
        }

        public Initialized() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Initialized b(Initialized initialized, EmailField emailField, PhoneNumberField phoneNumberField, hz.b bVar, lb3.a aVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                emailField = initialized.email;
            }
            if ((i15 & 2) != 0) {
                phoneNumberField = initialized.phoneNumber;
            }
            if ((i15 & 4) != 0) {
                bVar = initialized.groupValidationState;
            }
            if ((i15 & 8) != 0) {
                aVar = initialized.scrollToField;
            }
            return initialized.a(emailField, phoneNumberField, bVar, aVar);
        }

        public final Initialized a(EmailField email, PhoneNumberField phoneNumber, hz.b groupValidationState, lb3.a scrollToField) {
            return new Initialized(email, phoneNumber, groupValidationState, scrollToField);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EmailField getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final hz.b getGroupValidationState() {
            return this.groupValidationState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final PhoneNumberField getPhoneNumber() {
            return this.phoneNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.email, initialized.email) && fr.t.c(this.phoneNumber, initialized.phoneNumber) && fr.t.c(this.groupValidationState, initialized.groupValidationState) && this.scrollToField == initialized.scrollToField;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final lb3.a getScrollToField() {
            return this.scrollToField;
        }

        public int hashCode() {
            int iHashCode = ((((this.email.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.groupValidationState.hashCode()) * 31;
            lb3.a aVar = this.scrollToField;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Initialized(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", groupValidationState=" + this.groupValidationState + ", scrollToField=" + this.scrollToField + ')';
        }

        public Initialized(EmailField emailField, PhoneNumberField phoneNumberField, hz.b bVar, lb3.a aVar) {
            this.email = emailField;
            this.phoneNumber = phoneNumberField;
            this.groupValidationState = bVar;
            this.scrollToField = aVar;
        }

        /* JADX INFO: renamed from: ib3.l$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lib3/l$b$a;", "", "", "value", "", "isChecked", "Lhz/b;", "validationState", "<init>", "(Ljava/lang/String;ZLhz/b;)V", "a", "(Ljava/lang/String;ZLhz/b;)Lib3/l$b$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Z", "e", "()Z", "c", "Lhz/b;", "()Lhz/b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EmailField {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f90811d = hz.b.f86845b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isChecked;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            public EmailField(String str, boolean z15, hz.b bVar) {
                this.value = str;
                this.isChecked = z15;
                this.validationState = bVar;
            }

            public static /* synthetic */ EmailField b(EmailField emailField, String str, boolean z15, hz.b bVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    str = emailField.value;
                }
                if ((i15 & 2) != 0) {
                    z15 = emailField.isChecked;
                }
                if ((i15 & 4) != 0) {
                    bVar = emailField.validationState;
                }
                return emailField.a(str, z15, bVar);
            }

            public final EmailField a(String value, boolean isChecked, hz.b validationState) {
                return new EmailField(value, isChecked, validationState);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final hz.b getValidationState() {
                return this.validationState;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EmailField)) {
                    return false;
                }
                EmailField emailField = (EmailField) other;
                return fr.t.c(this.value, emailField.value) && this.isChecked == emailField.isChecked && fr.t.c(this.validationState, emailField.validationState);
            }

            public int hashCode() {
                return (((this.value.hashCode() * 31) + Boolean.hashCode(this.isChecked)) * 31) + this.validationState.hashCode();
            }

            public String toString() {
                return "EmailField(value=" + this.value + ", isChecked=" + this.isChecked + ", validationState=" + this.validationState + ')';
            }

            public /* synthetic */ EmailField(String str, boolean z15, hz.b bVar, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? hz.b.d.f86848c : bVar);
            }
        }

        /* JADX INFO: renamed from: ib3.l$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"Lib3/l$b$b;", "", "Lxw/h;", "value", "", "isChecked", "Lhz/b;", "prefixValidationState", "numberValidationState", "<init>", "(Lxw/h;ZLhz/b;Lhz/b;)V", "a", "(Lxw/h;ZLhz/b;Lhz/b;)Lib3/l$b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lxw/h;", "e", "()Lxw/h;", "b", "Z", "f", "()Z", "c", "Lhz/b;", "d", "()Lhz/b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PhoneNumberField {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f90815e = hz.b.f86845b | PhoneNumber.f221634d;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhoneNumber value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isChecked;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b prefixValidationState;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b numberValidationState;

            public PhoneNumberField(PhoneNumber phoneNumber, boolean z15, hz.b bVar, hz.b bVar2) {
                this.value = phoneNumber;
                this.isChecked = z15;
                this.prefixValidationState = bVar;
                this.numberValidationState = bVar2;
            }

            public static /* synthetic */ PhoneNumberField b(PhoneNumberField phoneNumberField, PhoneNumber phoneNumber, boolean z15, hz.b bVar, hz.b bVar2, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    phoneNumber = phoneNumberField.value;
                }
                if ((i15 & 2) != 0) {
                    z15 = phoneNumberField.isChecked;
                }
                if ((i15 & 4) != 0) {
                    bVar = phoneNumberField.prefixValidationState;
                }
                if ((i15 & 8) != 0) {
                    bVar2 = phoneNumberField.numberValidationState;
                }
                return phoneNumberField.a(phoneNumber, z15, bVar, bVar2);
            }

            public final PhoneNumberField a(PhoneNumber value, boolean isChecked, hz.b prefixValidationState, hz.b numberValidationState) {
                return new PhoneNumberField(value, isChecked, prefixValidationState, numberValidationState);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final hz.b getNumberValidationState() {
                return this.numberValidationState;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final hz.b getPrefixValidationState() {
                return this.prefixValidationState;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final PhoneNumber getValue() {
                return this.value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PhoneNumberField)) {
                    return false;
                }
                PhoneNumberField phoneNumberField = (PhoneNumberField) other;
                return fr.t.c(this.value, phoneNumberField.value) && this.isChecked == phoneNumberField.isChecked && fr.t.c(this.prefixValidationState, phoneNumberField.prefixValidationState) && fr.t.c(this.numberValidationState, phoneNumberField.numberValidationState);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }

            public int hashCode() {
                return (((((this.value.hashCode() * 31) + Boolean.hashCode(this.isChecked)) * 31) + this.prefixValidationState.hashCode()) * 31) + this.numberValidationState.hashCode();
            }

            public String toString() {
                return "PhoneNumberField(value=" + this.value + ", isChecked=" + this.isChecked + ", prefixValidationState=" + this.prefixValidationState + ", numberValidationState=" + this.numberValidationState + ')';
            }

            public /* synthetic */ PhoneNumberField(PhoneNumber phoneNumber, boolean z15, hz.b bVar, hz.b bVar2, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? PhoneNumber.INSTANCE.a() : phoneNumber, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? hz.b.d.f86848c : bVar, (i15 & 8) != 0 ? hz.b.d.f86848c : bVar2);
            }
        }

        public /* synthetic */ Initialized(EmailField emailField, PhoneNumberField phoneNumberField, hz.b bVar, lb3.a aVar, int i15, fr.k kVar) {
            if ((i15 & 1) != 0) {
                emailField = new EmailField(null, false, null, 7, null);
            }
            if ((i15 & 2) != 0) {
                phoneNumberField = new PhoneNumberField(null, false, null, null, 15, null);
            }
            this(emailField, phoneNumberField, (i15 & 4) != 0 ? hz.b.d.f86848c : bVar, (i15 & 8) != 0 ? null : aVar);
        }
    }
}
