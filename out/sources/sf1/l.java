package sf1;

import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lsf1/l;", "", "b", "a", "Lsf1/l$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {

    /* JADX INFO: renamed from: sf1.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsf1/l$a;", "", "Lhz/b;", "validationState", "Liy/b0;", "value", "<init>", "(Lhz/b;Liy/b0;)V", "a", "(Lhz/b;Liy/b0;)Lsf1/l$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Liy/b0;", "d", "()Liy/b0;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Field {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f181155c = iy.b0.f97726c | hz.b.f86845b;

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
            this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? c0.g("") : b0Var);
        }
    }

    /* JADX INFO: renamed from: sf1.l$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lsf1/l$b;", "Lsf1/l;", "Lsf1/l$a;", "email", "", "ceidgConsent", "hasNoEmail", "Lhz/b;", "validation", "<init>", "(Lsf1/l$a;ZZLhz/b;)V", "a", "(Lsf1/l$a;ZZLhz/b;)Lsf1/l$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lsf1/l$a;", "d", "()Lsf1/l$a;", "b", "Z", "c", "()Z", "e", "Lhz/b;", "getValidation", "()Lhz/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements l {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f181158e;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean ceidgConsent;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasNoEmail;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validation;

        static {
            int i15 = hz.b.f86845b;
            f181158e = i15 | iy.b0.f97726c | i15;
        }

        public Initialized(Field field, boolean z15, boolean z16, hz.b bVar) {
            this.email = field;
            this.ceidgConsent = z15;
            this.hasNoEmail = z16;
            this.validation = bVar;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, Field field, boolean z15, boolean z16, hz.b bVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                field = initialized.email;
            }
            if ((i15 & 2) != 0) {
                z15 = initialized.ceidgConsent;
            }
            if ((i15 & 4) != 0) {
                z16 = initialized.hasNoEmail;
            }
            if ((i15 & 8) != 0) {
                bVar = initialized.validation;
            }
            return initialized.a(field, z15, z16, bVar);
        }

        public final Initialized a(Field email, boolean ceidgConsent, boolean hasNoEmail, hz.b validation) {
            return new Initialized(email, ceidgConsent, hasNoEmail, validation);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getCeidgConsent() {
            return this.ceidgConsent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Field getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getHasNoEmail() {
            return this.hasNoEmail;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.email, initialized.email) && this.ceidgConsent == initialized.ceidgConsent && this.hasNoEmail == initialized.hasNoEmail && fr.t.c(this.validation, initialized.validation);
        }

        public int hashCode() {
            return (((((this.email.hashCode() * 31) + Boolean.hashCode(this.ceidgConsent)) * 31) + Boolean.hashCode(this.hasNoEmail)) * 31) + this.validation.hashCode();
        }

        public String toString() {
            return "Initialized(email=" + this.email + ", ceidgConsent=" + this.ceidgConsent + ", hasNoEmail=" + this.hasNoEmail + ", validation=" + this.validation + ')';
        }

        public /* synthetic */ Initialized(Field field, boolean z15, boolean z16, hz.b bVar, int i15, fr.k kVar) {
            this(field, z15, z16, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar);
        }
    }
}
