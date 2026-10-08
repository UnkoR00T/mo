package kf2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lkf2/h;", "", "b", "a", "Lkf2/h$b;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {

    /* JADX INFO: renamed from: kf2.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkf2/h$a;", "", "Lhz/b;", "validationState", "Liy/b0;", "value", "<init>", "(Lhz/b;Liy/b0;)V", "a", "(Lhz/b;Liy/b0;)Lkf2/h$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Liy/b0;", "d", "()Liy/b0;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Field {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f110581c = iy.b0.f97726c | hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 value;

        public Field(hz.b bVar, iy.b0 b0Var) {
            this.validationState = bVar;
            this.value = b0Var;
        }

        public static /* synthetic */ Field b(Field field, hz.b bVar, iy.b0 b0Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = field.validationState;
            }
            if ((i15 & 2) != 0) {
                b0Var = field.value;
            }
            return field.a(bVar, b0Var);
        }

        public final Field a(hz.b validationState, iy.b0 value) {
            return new Field(validationState, value);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final iy.b0 getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return fr.t.c(this.validationState, field.validationState) && fr.t.c(this.value, field.value);
        }

        public int hashCode() {
            return (this.validationState.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Field(validationState=" + this.validationState + ", value=" + this.value + ')';
        }

        public /* synthetic */ Field(hz.b bVar, iy.b0 b0Var, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? iy.c0.g("") : b0Var);
        }
    }

    /* JADX INFO: renamed from: kf2.h$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001f¨\u0006 "}, d2 = {"Lkf2/h$b;", "Lkf2/h;", "Lkf2/h$a;", "email", "phoneNumber", "countryCode", "Lhz/b;", "contactValidation", "<init>", "(Lkf2/h$a;Lkf2/h$a;Lkf2/h$a;Lhz/b;)V", "a", "(Lkf2/h$a;Lkf2/h$a;Lkf2/h$a;Lhz/b;)Lkf2/h$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkf2/h$a;", "e", "()Lkf2/h$a;", "b", "f", "c", "d", "Lhz/b;", "()Lhz/b;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f110584e;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field phoneNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field countryCode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b contactValidation;

        static {
            int i15 = hz.b.f86845b;
            int i16 = iy.b0.f97726c;
            f110584e = i15 | i16 | i15 | i16 | i15 | i16 | i15;
        }

        public Initialized(Field field, Field field2, Field field3, hz.b bVar) {
            this.email = field;
            this.phoneNumber = field2;
            this.countryCode = field3;
            this.contactValidation = bVar;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, Field field, Field field2, Field field3, hz.b bVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                field = initialized.email;
            }
            if ((i15 & 2) != 0) {
                field2 = initialized.phoneNumber;
            }
            if ((i15 & 4) != 0) {
                field3 = initialized.countryCode;
            }
            if ((i15 & 8) != 0) {
                bVar = initialized.contactValidation;
            }
            return initialized.a(field, field2, field3, bVar);
        }

        public final Initialized a(Field email, Field phoneNumber, Field countryCode, hz.b contactValidation) {
            return new Initialized(email, phoneNumber, countryCode, contactValidation);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getContactValidation() {
            return this.contactValidation;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Field getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Field getEmail() {
            return this.email;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.email, initialized.email) && fr.t.c(this.phoneNumber, initialized.phoneNumber) && fr.t.c(this.countryCode, initialized.countryCode) && fr.t.c(this.contactValidation, initialized.contactValidation);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Field getPhoneNumber() {
            return this.phoneNumber;
        }

        public int hashCode() {
            return (((((this.email.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.contactValidation.hashCode();
        }

        public String toString() {
            return "Initialized(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", countryCode=" + this.countryCode + ", contactValidation=" + this.contactValidation + ')';
        }

        public /* synthetic */ Initialized(Field field, Field field2, Field field3, hz.b bVar, int i15, fr.k kVar) {
            this(field, field2, field3, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar);
        }
    }
}
