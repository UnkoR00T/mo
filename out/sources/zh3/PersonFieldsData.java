package zh3;

import fr.k;
import fr.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: zh3.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0013!B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b#\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b$\u0010 ¨\u0006&"}, d2 = {"Lzh3/e;", "", "Lzh3/e$a;", "nameField", "surnameField", "phonePrefixField", "phoneNumberField", "emailField", "<init>", "(Lzh3/e$a;Lzh3/e$a;Lzh3/e$a;Lzh3/e$a;Lzh3/e$a;)V", "", "c", "()Ljava/util/List;", "", "j", "()Z", "Lzh3/e$b;", "e", "()Lzh3/e$b;", "a", "(Lzh3/e$a;Lzh3/e$a;Lzh3/e$a;Lzh3/e$a;Lzh3/e$a;)Lzh3/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lzh3/e$a;", "f", "()Lzh3/e$a;", "b", "i", "h", "d", "g", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonFieldsData {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f235301f = hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Data nameField;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Data surnameField;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Data phonePrefixField;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Data phoneNumberField;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Data emailField;

    /* JADX INFO: renamed from: zh3.e$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lzh3/e$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        NAME,
        SURNAME,
        PHONE,
        EMAIL;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f235315f = wq.b.a(b());
    }

    public PersonFieldsData() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PersonFieldsData b(PersonFieldsData personFieldsData, Data data, Data data2, Data data3, Data data4, Data data5, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            data = personFieldsData.nameField;
        }
        if ((i15 & 2) != 0) {
            data2 = personFieldsData.surnameField;
        }
        if ((i15 & 4) != 0) {
            data3 = personFieldsData.phonePrefixField;
        }
        if ((i15 & 8) != 0) {
            data4 = personFieldsData.phoneNumberField;
        }
        if ((i15 & 16) != 0) {
            data5 = personFieldsData.emailField;
        }
        Data data6 = data5;
        Data data7 = data3;
        return personFieldsData.a(data, data2, data7, data4, data6);
    }

    private final List<Data> c() {
        return v.q(this.nameField, this.surnameField, this.phonePrefixField, this.phoneNumberField, this.emailField);
    }

    public final PersonFieldsData a(Data nameField, Data surnameField, Data phonePrefixField, Data phoneNumberField, Data emailField) {
        return new PersonFieldsData(nameField, surnameField, phonePrefixField, phoneNumberField, emailField);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Data getEmailField() {
        return this.emailField;
    }

    public final b e() {
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
        if (!(other instanceof PersonFieldsData)) {
            return false;
        }
        PersonFieldsData personFieldsData = (PersonFieldsData) other;
        return t.c(this.nameField, personFieldsData.nameField) && t.c(this.surnameField, personFieldsData.surnameField) && t.c(this.phonePrefixField, personFieldsData.phonePrefixField) && t.c(this.phoneNumberField, personFieldsData.phoneNumberField) && t.c(this.emailField, personFieldsData.emailField);
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
        return (((((((this.nameField.hashCode() * 31) + this.surnameField.hashCode()) * 31) + this.phonePrefixField.hashCode()) * 31) + this.phoneNumberField.hashCode()) * 31) + this.emailField.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Data getSurnameField() {
        return this.surnameField;
    }

    public final boolean j() {
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
        return "PersonFieldsData(nameField=" + this.nameField + ", surnameField=" + this.surnameField + ", phonePrefixField=" + this.phonePrefixField + ", phoneNumberField=" + this.phoneNumberField + ", emailField=" + this.emailField + ')';
    }

    public PersonFieldsData(Data data, Data data2, Data data3, Data data4, Data data5) {
        this.nameField = data;
        this.surnameField = data2;
        this.phonePrefixField = data3;
        this.phoneNumberField = data4;
        this.emailField = data5;
    }

    /* JADX INFO: renamed from: zh3.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzh3/e$a;", "", "Lhz/b;", "validationState", "Lzh3/e$b;", "field", "<init>", "(Lhz/b;Lzh3/e$b;)V", "a", "(Lhz/b;Lzh3/e$b;)Lzh3/e$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "d", "()Lhz/b;", "b", "Lzh3/e$b;", "c", "()Lzh3/e$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f235307c = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b field;

        public Data(hz.b bVar, b bVar2) {
            this.validationState = bVar;
            this.field = bVar2;
        }

        public static /* synthetic */ Data b(Data data, hz.b bVar, b bVar2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = data.validationState;
            }
            if ((i15 & 2) != 0) {
                bVar2 = data.field;
            }
            return data.a(bVar, bVar2);
        }

        public final Data a(hz.b validationState, b field) {
            return new Data(validationState, field);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getField() {
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

        public /* synthetic */ Data(hz.b bVar, b bVar2, int i15, k kVar) {
            this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, bVar2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ PersonFieldsData(Data data, Data data2, Data data3, Data data4, Data data5, int i15, k kVar) {
        int i16 = 1;
        this((i15 & 1) != 0 ? new Data(null, b.NAME, i16, 0 == true ? 1 : 0) : data, (i15 & 2) != 0 ? new Data(0 == true ? 1 : 0, b.SURNAME, i16, 0 == true ? 1 : 0) : data2, (i15 & 4) != 0 ? new Data(0 == true ? 1 : 0, b.PHONE, i16, 0 == true ? 1 : 0) : data3, (i15 & 8) != 0 ? new Data(0 == true ? 1 : 0, b.PHONE, i16, 0 == true ? 1 : 0) : data4, (i15 & 16) != 0 ? new Data(0 == true ? 1 : 0, b.EMAIL, i16, 0 == true ? 1 : 0) : data5);
    }
}
