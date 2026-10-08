package sd1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lsd1/i;", "", "b", "a", "Lsd1/i$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    /* JADX INFO: renamed from: sd1.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ@\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lsd1/i$b;", "Lsd1/i;", "Lsd1/i$a;", "", "email", "emailRepeated", "", "consent", "<init>", "(Lsd1/i$a;Lsd1/i$a;Lsd1/i$a;)V", "a", "(Lsd1/i$a;Lsd1/i$a;Lsd1/i$a;)Lsd1/i$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lsd1/i$a;", "d", "()Lsd1/i$a;", "b", "e", "c", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FormDisplayed implements i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f180302d = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field<String> email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field<String> emailRepeated;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Field<Boolean> consent;

        public FormDisplayed(Field<String> field, Field<String> field2, Field<Boolean> field3) {
            this.email = field;
            this.emailRepeated = field2;
            this.consent = field3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FormDisplayed b(FormDisplayed formDisplayed, Field field, Field field2, Field field3, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                field = formDisplayed.email;
            }
            if ((i15 & 2) != 0) {
                field2 = formDisplayed.emailRepeated;
            }
            if ((i15 & 4) != 0) {
                field3 = formDisplayed.consent;
            }
            return formDisplayed.a(field, field2, field3);
        }

        public final FormDisplayed a(Field<String> email, Field<String> emailRepeated, Field<Boolean> consent) {
            return new FormDisplayed(email, emailRepeated, consent);
        }

        public final Field<Boolean> c() {
            return this.consent;
        }

        public final Field<String> d() {
            return this.email;
        }

        public final Field<String> e() {
            return this.emailRepeated;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormDisplayed)) {
                return false;
            }
            FormDisplayed formDisplayed = (FormDisplayed) other;
            return fr.t.c(this.email, formDisplayed.email) && fr.t.c(this.emailRepeated, formDisplayed.emailRepeated) && fr.t.c(this.consent, formDisplayed.consent);
        }

        public int hashCode() {
            return (((this.email.hashCode() * 31) + this.emailRepeated.hashCode()) * 31) + this.consent.hashCode();
        }

        public String toString() {
            return "FormDisplayed(email=" + this.email + ", emailRepeated=" + this.emailRepeated + ", consent=" + this.consent + ')';
        }
    }

    /* JADX INFO: renamed from: sd1.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsd1/i$a;", "T", "", "Lhz/b;", "validationState", "value", "<init>", "(Lhz/b;Ljava/lang/Object;)V", "a", "(Lhz/b;Ljava/lang/Object;)Lsd1/i$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Field<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f180299c = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final T value;

        public Field(hz.b bVar, T t15) {
            this.validationState = bVar;
            this.value = t15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Field b(Field field, hz.b bVar, Object obj, int i15, Object obj2) {
            if ((i15 & 1) != 0) {
                bVar = field.validationState;
            }
            if ((i15 & 2) != 0) {
                obj = field.value;
            }
            return field.a(bVar, obj);
        }

        public final Field<T> a(hz.b validationState, T value) {
            return new Field<>(validationState, value);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public final T d() {
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
            int iHashCode = this.validationState.hashCode() * 31;
            T t15 = this.value;
            return iHashCode + (t15 == null ? 0 : t15.hashCode());
        }

        public String toString() {
            return "Field(validationState=" + this.validationState + ", value=" + this.value + ')';
        }

        public /* synthetic */ Field(hz.b bVar, Object obj, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, obj);
        }
    }
}
