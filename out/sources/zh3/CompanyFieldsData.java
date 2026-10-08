package zh3;

import fr.k;
import fr.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: zh3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0012 B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b#\u0010\u001f¨\u0006$"}, d2 = {"Lzh3/b;", "", "Lzh3/b$a;", "nameField", "phonePrefixField", "phoneNumberField", "emailField", "<init>", "(Lzh3/b$a;Lzh3/b$a;Lzh3/b$a;Lzh3/b$a;)V", "", "c", "()Ljava/util/List;", "", "i", "()Z", "Lzh3/b$b;", "e", "()Lzh3/b$b;", "a", "(Lzh3/b$a;Lzh3/b$a;Lzh3/b$a;Lzh3/b$a;)Lzh3/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lzh3/b$a;", "f", "()Lzh3/b$a;", "b", "h", "g", "d", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyFieldsData {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f235285e = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Data nameField;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Data phonePrefixField;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Data phoneNumberField;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Data emailField;

    /* JADX INFO: renamed from: zh3.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzh3/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC6346b {
        NAME,
        PHONE,
        EMAIL;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f235297e = wq.b.a(b());
    }

    public CompanyFieldsData(Data data, Data data2, Data data3, Data data4) {
        this.nameField = data;
        this.phonePrefixField = data2;
        this.phoneNumberField = data3;
        this.emailField = data4;
    }

    public static /* synthetic */ CompanyFieldsData b(CompanyFieldsData companyFieldsData, Data data, Data data2, Data data3, Data data4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            data = companyFieldsData.nameField;
        }
        if ((i15 & 2) != 0) {
            data2 = companyFieldsData.phonePrefixField;
        }
        if ((i15 & 4) != 0) {
            data3 = companyFieldsData.phoneNumberField;
        }
        if ((i15 & 8) != 0) {
            data4 = companyFieldsData.emailField;
        }
        return companyFieldsData.a(data, data2, data3, data4);
    }

    private final List<Data> c() {
        return v.q(this.nameField, this.phonePrefixField, this.phoneNumberField, this.emailField);
    }

    public final CompanyFieldsData a(Data nameField, Data phonePrefixField, Data phoneNumberField, Data emailField) {
        return new CompanyFieldsData(nameField, phonePrefixField, phoneNumberField, emailField);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Data getEmailField() {
        return this.emailField;
    }

    public final EnumC6346b e() {
        Object next;
        Iterator<T> it = c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Data) next).getValidationState() instanceof hz.b.Invalid));
        Data data = (Data) next;
        if (data != null) {
            return data.getField();
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyFieldsData)) {
            return false;
        }
        CompanyFieldsData companyFieldsData = (CompanyFieldsData) other;
        return t.c(this.nameField, companyFieldsData.nameField) && t.c(this.phonePrefixField, companyFieldsData.phonePrefixField) && t.c(this.phoneNumberField, companyFieldsData.phoneNumberField) && t.c(this.emailField, companyFieldsData.emailField);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Data getNameField() {
        return this.nameField;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Data getPhoneNumberField() {
        return this.phoneNumberField;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Data getPhonePrefixField() {
        return this.phonePrefixField;
    }

    public int hashCode() {
        return (((((this.nameField.hashCode() * 31) + this.phonePrefixField.hashCode()) * 31) + this.phoneNumberField.hashCode()) * 31) + this.emailField.hashCode();
    }

    public final boolean i() {
        List<Data> listC = c();
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return true;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (!((Data) it.next()).getValidationState().a()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "CompanyFieldsData(nameField=" + this.nameField + ", phonePrefixField=" + this.phonePrefixField + ", phoneNumberField=" + this.phoneNumberField + ", emailField=" + this.emailField + ')';
    }

    /* JADX INFO: renamed from: zh3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzh3/b$a;", "", "Lhz/b;", "validationState", "Lzh3/b$b;", "field", "<init>", "(Lhz/b;Lzh3/b$b;)V", "a", "(Lhz/b;Lzh3/b$b;)Lzh3/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "d", "()Lhz/b;", "b", "Lzh3/b$b;", "c", "()Lzh3/b$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f235290c = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC6346b field;

        public Data(hz.b bVar, EnumC6346b enumC6346b) {
            this.validationState = bVar;
            this.field = enumC6346b;
        }

        public static /* synthetic */ Data b(Data data, hz.b bVar, EnumC6346b enumC6346b, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = data.validationState;
            }
            if ((i15 & 2) != 0) {
                enumC6346b = data.field;
            }
            return data.a(bVar, enumC6346b);
        }

        public final Data a(hz.b validationState, EnumC6346b field) {
            return new Data(validationState, field);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC6346b getField() {
            return this.field;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.validationState, data.validationState) && this.field == data.field;
        }

        public int hashCode() {
            return (this.validationState.hashCode() * 31) + this.field.hashCode();
        }

        public String toString() {
            return "Data(validationState=" + this.validationState + ", field=" + this.field + ')';
        }

        public /* synthetic */ Data(hz.b bVar, EnumC6346b enumC6346b, int i15, k kVar) {
            this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, enumC6346b);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CompanyFieldsData(Data data, Data data2, Data data3, Data data4, int i15, k kVar) {
        int i16 = 1;
        this((i15 & 1) != 0 ? new Data(null, EnumC6346b.NAME, i16, 0 == true ? 1 : 0) : data, (i15 & 2) != 0 ? new Data(0 == true ? 1 : 0, EnumC6346b.PHONE, i16, 0 == true ? 1 : 0) : data2, (i15 & 4) != 0 ? new Data(0 == true ? 1 : 0, EnumC6346b.PHONE, i16, 0 == true ? 1 : 0) : data3, (i15 & 8) != 0 ? new Data(0 == true ? 1 : 0, EnumC6346b.EMAIL, i16, 0 == true ? 1 : 0) : data4);
    }
}
