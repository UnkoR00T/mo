package u41;

import fr.k;
import fr.t;
import hz.b;
import iy.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import xw.PhoneNumber;

/* JADX INFO: renamed from: u41.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lu41/a;", "", "Lu41/a$a$b;", "emailFieldData", "Lu41/a$a$a;", "phoneFieldData", "<init>", "(Lu41/a$a$b;Lu41/a$a$a;)V", "", "Lu41/a$a;", "c", "()Ljava/util/List;", "", "f", "()Z", "a", "(Lu41/a$a$b;Lu41/a$a$a;)Lu41/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lu41/a$a$b;", "d", "()Lu41/a$a$b;", "b", "Lu41/a$a$a;", "e", "()Lu41/a$a$a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactInfoWriteFieldsData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f195325c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5084a.TextInput emailFieldData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5084a.Phone phoneFieldData;

    /* JADX INFO: renamed from: u41.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lu41/a$a;", "", "", "isValid", "()Z", "b", "a", "Lu41/a$a$a;", "Lu41/a$a$b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC5084a {

        /* JADX INFO: renamed from: u41.a$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lu41/a$a$a;", "Lu41/a$a;", "Lhz/b;", "phonePrefixValidationState", "phoneNumberValidationState", "Lxw/h;", "phoneNumber", "<init>", "(Lhz/b;Lhz/b;Lxw/h;)V", "", "isValid", "()Z", "a", "(Lhz/b;Lhz/b;Lxw/h;)Lu41/a$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "e", "()Lhz/b;", "b", "d", "c", "Lxw/h;", "()Lxw/h;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Phone implements InterfaceC5084a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f195328d;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b phonePrefixValidationState;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b phoneNumberValidationState;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhoneNumber phoneNumber;

            static {
                int i15 = PhoneNumber.f221634d;
                int i16 = b.f86845b;
                f195328d = i15 | i16 | i16;
            }

            public Phone() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ Phone b(Phone phone, b bVar, b bVar2, PhoneNumber phoneNumber, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = phone.phonePrefixValidationState;
                }
                if ((i15 & 2) != 0) {
                    bVar2 = phone.phoneNumberValidationState;
                }
                if ((i15 & 4) != 0) {
                    phoneNumber = phone.phoneNumber;
                }
                return phone.a(bVar, bVar2, phoneNumber);
            }

            public final Phone a(b phonePrefixValidationState, b phoneNumberValidationState, PhoneNumber phoneNumber) {
                return new Phone(phonePrefixValidationState, phoneNumberValidationState, phoneNumber);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final PhoneNumber getPhoneNumber() {
                return this.phoneNumber;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final b getPhoneNumberValidationState() {
                return this.phoneNumberValidationState;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final b getPhonePrefixValidationState() {
                return this.phonePrefixValidationState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Phone)) {
                    return false;
                }
                Phone phone = (Phone) other;
                return t.c(this.phonePrefixValidationState, phone.phonePrefixValidationState) && t.c(this.phoneNumberValidationState, phone.phoneNumberValidationState) && t.c(this.phoneNumber, phone.phoneNumber);
            }

            public int hashCode() {
                return (((this.phonePrefixValidationState.hashCode() * 31) + this.phoneNumberValidationState.hashCode()) * 31) + this.phoneNumber.hashCode();
            }

            @Override // u41.ContactInfoWriteFieldsData.InterfaceC5084a
            public boolean isValid() {
                List listQ = v.q(this.phonePrefixValidationState, this.phoneNumberValidationState);
                if ((listQ instanceof Collection) && listQ.isEmpty()) {
                    return true;
                }
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    if (!((b) it.next()).a()) {
                        return false;
                    }
                }
                return true;
            }

            public String toString() {
                return "Phone(phonePrefixValidationState=" + this.phonePrefixValidationState + ", phoneNumberValidationState=" + this.phoneNumberValidationState + ", phoneNumber=" + this.phoneNumber + ')';
            }

            public Phone(b bVar, b bVar2, PhoneNumber phoneNumber) {
                this.phonePrefixValidationState = bVar;
                this.phoneNumberValidationState = bVar2;
                this.phoneNumber = phoneNumber;
            }

            public /* synthetic */ Phone(b bVar, b bVar2, PhoneNumber phoneNumber, int i15, k kVar) {
                this((i15 & 1) != 0 ? b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? b.C2039b.f86846c : bVar2, (i15 & 4) != 0 ? PhoneNumber.INSTANCE.a() : phoneNumber);
            }
        }

        /* JADX INFO: renamed from: u41.a$a$b, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lu41/a$a$b;", "Lu41/a$a;", "Lhz/b;", "validationState", "Liy/b0;", "value", "<init>", "(Lhz/b;Liy/b0;)V", "", "isValid", "()Z", "a", "(Lhz/b;Liy/b0;)Lu41/a$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Liy/b0;", "d", "()Liy/b0;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TextInput implements InterfaceC5084a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f195332c = b0.f97726c | b.f86845b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b validationState;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 value;

            /* JADX WARN: Multi-variable type inference failed */
            public TextInput() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ TextInput b(TextInput textInput, b bVar, b0 b0Var, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = textInput.validationState;
                }
                if ((i15 & 2) != 0) {
                    b0Var = textInput.value;
                }
                return textInput.a(bVar, b0Var);
            }

            public final TextInput a(b validationState, b0 value) {
                return new TextInput(validationState, value);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final b getValidationState() {
                return this.validationState;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final b0 getValue() {
                return this.value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextInput)) {
                    return false;
                }
                TextInput textInput = (TextInput) other;
                return t.c(this.validationState, textInput.validationState) && t.c(this.value, textInput.value);
            }

            public int hashCode() {
                return (this.validationState.hashCode() * 31) + this.value.hashCode();
            }

            @Override // u41.ContactInfoWriteFieldsData.InterfaceC5084a
            public boolean isValid() {
                return this.validationState.a();
            }

            public String toString() {
                return "TextInput(validationState=" + this.validationState + ", value=" + this.value + ')';
            }

            public TextInput(b bVar, b0 b0Var) {
                this.validationState = bVar;
                this.value = b0Var;
            }

            public /* synthetic */ TextInput(b bVar, b0 b0Var, int i15, k kVar) {
                this((i15 & 1) != 0 ? b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var);
            }
        }

        boolean isValid();
    }

    static {
        int i15 = PhoneNumber.f221634d;
        int i16 = b.f86845b;
        f195325c = i15 | i16 | i16 | b0.f97726c | i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContactInfoWriteFieldsData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ContactInfoWriteFieldsData b(ContactInfoWriteFieldsData contactInfoWriteFieldsData, InterfaceC5084a.TextInput textInput, InterfaceC5084a.Phone phone, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            textInput = contactInfoWriteFieldsData.emailFieldData;
        }
        if ((i15 & 2) != 0) {
            phone = contactInfoWriteFieldsData.phoneFieldData;
        }
        return contactInfoWriteFieldsData.a(textInput, phone);
    }

    private final List<InterfaceC5084a> c() {
        return v.q(this.emailFieldData, this.phoneFieldData);
    }

    public final ContactInfoWriteFieldsData a(InterfaceC5084a.TextInput emailFieldData, InterfaceC5084a.Phone phoneFieldData) {
        return new ContactInfoWriteFieldsData(emailFieldData, phoneFieldData);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC5084a.TextInput getEmailFieldData() {
        return this.emailFieldData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC5084a.Phone getPhoneFieldData() {
        return this.phoneFieldData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactInfoWriteFieldsData)) {
            return false;
        }
        ContactInfoWriteFieldsData contactInfoWriteFieldsData = (ContactInfoWriteFieldsData) other;
        return t.c(this.emailFieldData, contactInfoWriteFieldsData.emailFieldData) && t.c(this.phoneFieldData, contactInfoWriteFieldsData.phoneFieldData);
    }

    public final boolean f() {
        List<InterfaceC5084a> listC = c();
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return true;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC5084a) it.next()).isValid()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.emailFieldData.hashCode() * 31) + this.phoneFieldData.hashCode();
    }

    public String toString() {
        return "ContactInfoWriteFieldsData(emailFieldData=" + this.emailFieldData + ", phoneFieldData=" + this.phoneFieldData + ')';
    }

    public ContactInfoWriteFieldsData(InterfaceC5084a.TextInput textInput, InterfaceC5084a.Phone phone) {
        this.emailFieldData = textInput;
        this.phoneFieldData = phone;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ContactInfoWriteFieldsData(InterfaceC5084a.TextInput textInput, InterfaceC5084a.Phone phone, int i15, k kVar) {
        if ((i15 & 1) != 0) {
            textInput = new InterfaceC5084a.TextInput(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        if ((i15 & 2) != 0) {
            phone = new InterfaceC5084a.Phone(null, null, null, 7, null);
        }
        this(textInput, phone);
    }
}
