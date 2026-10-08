package yf3;

import dz.e;
import fr.k;
import fr.t;
import iy.b0;
import iy.c0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import xw.PhoneNumber;

/* JADX INFO: renamed from: yf3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017%B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016JV\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b-\u0010(¨\u0006."}, d2 = {"Lyf3/a;", "", "Lyf3/a$a$b;", "phoneField", "Lyf3/a$a$a;", "emailField", "postCodeField", "cityField", "streetField", "buildingNumberField", "flatNumberField", "<init>", "(Lyf3/a$a$b;Lyf3/a$a$a;Lyf3/a$a$a;Lyf3/a$a$a;Lyf3/a$a$a;Lyf3/a$a$a;Lyf3/a$a$a;)V", "", "Lyf3/a$a;", "c", "()Ljava/util/List;", "", "l", "()Z", "Lyf3/a$b;", "g", "()Lyf3/a$b;", "a", "(Lyf3/a$a$b;Lyf3/a$a$a;Lyf3/a$a$a;Lyf3/a$a$a;Lyf3/a$a$a;Lyf3/a$a$a;Lyf3/a$a$a;)Lyf3/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lyf3/a$a$b;", "i", "()Lyf3/a$a$b;", "b", "Lyf3/a$a$a;", "f", "()Lyf3/a$a$a;", "j", "d", "e", "k", "h", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactDetailsFields {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f226772h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6083a.Phone phoneField;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6083a.Input emailField;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6083a.Input postCodeField;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6083a.Input cityField;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6083a.Input streetField;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6083a.Input buildingNumberField;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6083a.Input flatNumberField;

    /* JADX INFO: renamed from: yf3.a$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lyf3/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        PHONE,
        EMAIL,
        POST_CODE,
        CITY,
        STREET,
        BUILDING_NUMBER,
        FLAT_NUMBER;


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ wq.a f226797j = wq.b.a(b());
    }

    static {
        int i15 = b0.f97726c;
        int i16 = hz.b.f86845b;
        f226772h = i15 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i16 | PhoneNumber.f221634d | i16 | i16;
    }

    public ContactDetailsFields(InterfaceC6083a.Phone phone, InterfaceC6083a.Input input, InterfaceC6083a.Input input2, InterfaceC6083a.Input input3, InterfaceC6083a.Input input4, InterfaceC6083a.Input input5, InterfaceC6083a.Input input6) {
        this.phoneField = phone;
        this.emailField = input;
        this.postCodeField = input2;
        this.cityField = input3;
        this.streetField = input4;
        this.buildingNumberField = input5;
        this.flatNumberField = input6;
    }

    public static /* synthetic */ ContactDetailsFields b(ContactDetailsFields contactDetailsFields, InterfaceC6083a.Phone phone, InterfaceC6083a.Input input, InterfaceC6083a.Input input2, InterfaceC6083a.Input input3, InterfaceC6083a.Input input4, InterfaceC6083a.Input input5, InterfaceC6083a.Input input6, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            phone = contactDetailsFields.phoneField;
        }
        if ((i15 & 2) != 0) {
            input = contactDetailsFields.emailField;
        }
        if ((i15 & 4) != 0) {
            input2 = contactDetailsFields.postCodeField;
        }
        if ((i15 & 8) != 0) {
            input3 = contactDetailsFields.cityField;
        }
        if ((i15 & 16) != 0) {
            input4 = contactDetailsFields.streetField;
        }
        if ((i15 & 32) != 0) {
            input5 = contactDetailsFields.buildingNumberField;
        }
        if ((i15 & 64) != 0) {
            input6 = contactDetailsFields.flatNumberField;
        }
        InterfaceC6083a.Input input7 = input5;
        InterfaceC6083a.Input input8 = input6;
        InterfaceC6083a.Input input9 = input4;
        InterfaceC6083a.Input input10 = input2;
        return contactDetailsFields.a(phone, input, input10, input3, input9, input7, input8);
    }

    private final List<InterfaceC6083a> c() {
        return v.q(this.phoneField, this.emailField, this.postCodeField, this.cityField, this.streetField, this.buildingNumberField, this.flatNumberField);
    }

    public final ContactDetailsFields a(InterfaceC6083a.Phone phoneField, InterfaceC6083a.Input emailField, InterfaceC6083a.Input postCodeField, InterfaceC6083a.Input cityField, InterfaceC6083a.Input streetField, InterfaceC6083a.Input buildingNumberField, InterfaceC6083a.Input flatNumberField) {
        return new ContactDetailsFields(phoneField, emailField, postCodeField, cityField, streetField, buildingNumberField, flatNumberField);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC6083a.Input getBuildingNumberField() {
        return this.buildingNumberField;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC6083a.Input getCityField() {
        return this.cityField;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactDetailsFields)) {
            return false;
        }
        ContactDetailsFields contactDetailsFields = (ContactDetailsFields) other;
        return t.c(this.phoneField, contactDetailsFields.phoneField) && t.c(this.emailField, contactDetailsFields.emailField) && t.c(this.postCodeField, contactDetailsFields.postCodeField) && t.c(this.cityField, contactDetailsFields.cityField) && t.c(this.streetField, contactDetailsFields.streetField) && t.c(this.buildingNumberField, contactDetailsFields.buildingNumberField) && t.c(this.flatNumberField, contactDetailsFields.flatNumberField);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC6083a.Input getEmailField() {
        return this.emailField;
    }

    public final b g() {
        Object next;
        Iterator<T> it = c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC6083a) next).isValid());
        InterfaceC6083a interfaceC6083a = (InterfaceC6083a) next;
        if (interfaceC6083a != null) {
            return interfaceC6083a.getField();
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC6083a.Input getFlatNumberField() {
        return this.flatNumberField;
    }

    public int hashCode() {
        return (((((((((((this.phoneField.hashCode() * 31) + this.emailField.hashCode()) * 31) + this.postCodeField.hashCode()) * 31) + this.cityField.hashCode()) * 31) + this.streetField.hashCode()) * 31) + this.buildingNumberField.hashCode()) * 31) + this.flatNumberField.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC6083a.Phone getPhoneField() {
        return this.phoneField;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final InterfaceC6083a.Input getPostCodeField() {
        return this.postCodeField;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC6083a.Input getStreetField() {
        return this.streetField;
    }

    public final boolean l() {
        List<InterfaceC6083a> listC = c();
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return true;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC6083a) it.next()).isValid()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "ContactDetailsFields(phoneField=" + this.phoneField + ", emailField=" + this.emailField + ", postCodeField=" + this.postCodeField + ", cityField=" + this.cityField + ", streetField=" + this.streetField + ", buildingNumberField=" + this.buildingNumberField + ", flatNumberField=" + this.flatNumberField + ')';
    }

    /* JADX INFO: renamed from: yf3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\t\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lyf3/a$a;", "", "", "isValid", "()Z", "Lyf3/a$b;", "a", "()Lyf3/a$b;", "field", "b", "Lyf3/a$a$a;", "Lyf3/a$a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC6083a {
        /* JADX INFO: renamed from: a */
        b getField();

        boolean isValid();

        /* JADX INFO: renamed from: yf3.a$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lyf3/a$a$a;", "Lyf3/a$a;", "Lyf3/a$b;", "field", "Lhz/b;", "validationState", "Liy/b0;", "value", "<init>", "(Lyf3/a$b;Lhz/b;Liy/b0;)V", "", "isValid", "()Z", "d", "()Lyf3/a$a$a;", "b", "(Lyf3/a$b;Lhz/b;Liy/b0;)Lyf3/a$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lyf3/a$b;", "()Lyf3/a$b;", "Lhz/b;", "e", "()Lhz/b;", "c", "Liy/b0;", "f", "()Liy/b0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Input implements InterfaceC6083a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f226780d = b0.f97726c | hz.b.f86845b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b field;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 value;

            public Input(b bVar, hz.b bVar2, b0 b0Var) {
                this.field = bVar;
                this.validationState = bVar2;
                this.value = b0Var;
            }

            public static /* synthetic */ Input c(Input input, b bVar, hz.b bVar2, b0 b0Var, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = input.field;
                }
                if ((i15 & 2) != 0) {
                    bVar2 = input.validationState;
                }
                if ((i15 & 4) != 0) {
                    b0Var = input.value;
                }
                return input.b(bVar, bVar2, b0Var);
            }

            @Override // yf3.ContactDetailsFields.InterfaceC6083a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getField() {
                return this.field;
            }

            public final Input b(b field, hz.b validationState, b0 value) {
                return new Input(field, validationState, value);
            }

            public Input d() {
                return c(this, null, null, c0.g(e.e(e.f(c0.e(this.value)))), 3, null);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final hz.b getValidationState() {
                return this.validationState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Input)) {
                    return false;
                }
                Input input = (Input) other;
                return this.field == input.field && t.c(this.validationState, input.validationState) && t.c(this.value, input.value);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final b0 getValue() {
                return this.value;
            }

            public int hashCode() {
                return (((this.field.hashCode() * 31) + this.validationState.hashCode()) * 31) + this.value.hashCode();
            }

            @Override // yf3.ContactDetailsFields.InterfaceC6083a
            public boolean isValid() {
                return this.validationState.a();
            }

            public String toString() {
                return "Input(field=" + this.field + ", validationState=" + this.validationState + ", value=" + this.value + ')';
            }

            public /* synthetic */ Input(b bVar, hz.b bVar2, b0 b0Var, int i15, k kVar) {
                this(bVar, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar2, b0Var);
            }
        }

        /* JADX INFO: renamed from: yf3.a$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lyf3/a$a$b;", "Lyf3/a$a;", "Lyf3/a$b;", "field", "Lhz/b;", "phoneNumberValidation", "phonePrefixValidation", "Lxw/h;", "phoneNumber", "<init>", "(Lyf3/a$b;Lhz/b;Lhz/b;Lxw/h;)V", "", "isValid", "()Z", "d", "()Lyf3/a$a$b;", "b", "(Lyf3/a$b;Lhz/b;Lhz/b;Lxw/h;)Lyf3/a$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lyf3/a$b;", "()Lyf3/a$b;", "Lhz/b;", "f", "()Lhz/b;", "c", "g", "Lxw/h;", "e", "()Lxw/h;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Phone implements InterfaceC6083a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f226784e;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b field;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b phoneNumberValidation;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b phonePrefixValidation;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhoneNumber phoneNumber;

            static {
                int i15 = PhoneNumber.f221634d;
                int i16 = hz.b.f86845b;
                f226784e = i15 | i16 | i16;
            }

            public Phone(b bVar, hz.b bVar2, hz.b bVar3, PhoneNumber phoneNumber) {
                this.field = bVar;
                this.phoneNumberValidation = bVar2;
                this.phonePrefixValidation = bVar3;
                this.phoneNumber = phoneNumber;
            }

            public static /* synthetic */ Phone c(Phone phone, b bVar, hz.b bVar2, hz.b bVar3, PhoneNumber phoneNumber, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = phone.field;
                }
                if ((i15 & 2) != 0) {
                    bVar2 = phone.phoneNumberValidation;
                }
                if ((i15 & 4) != 0) {
                    bVar3 = phone.phonePrefixValidation;
                }
                if ((i15 & 8) != 0) {
                    phoneNumber = phone.phoneNumber;
                }
                return phone.b(bVar, bVar2, bVar3, phoneNumber);
            }

            @Override // yf3.ContactDetailsFields.InterfaceC6083a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getField() {
                return this.field;
            }

            public final Phone b(b field, hz.b phoneNumberValidation, hz.b phonePrefixValidation, PhoneNumber phoneNumber) {
                return new Phone(field, phoneNumberValidation, phonePrefixValidation, phoneNumber);
            }

            public Phone d() {
                return c(this, null, null, null, new PhoneNumber(PhoneNumber.c.c(c0.g(e.e(e.f(c0.e(this.phoneNumber.h()))))), PhoneNumber.b.c(c0.g(e.e(e.f(c0.e(this.phoneNumber.g()))))), null), 7, null);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final PhoneNumber getPhoneNumber() {
                return this.phoneNumber;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Phone)) {
                    return false;
                }
                Phone phone = (Phone) other;
                return this.field == phone.field && t.c(this.phoneNumberValidation, phone.phoneNumberValidation) && t.c(this.phonePrefixValidation, phone.phonePrefixValidation) && t.c(this.phoneNumber, phone.phoneNumber);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final hz.b getPhoneNumberValidation() {
                return this.phoneNumberValidation;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final hz.b getPhonePrefixValidation() {
                return this.phonePrefixValidation;
            }

            public int hashCode() {
                return (((((this.field.hashCode() * 31) + this.phoneNumberValidation.hashCode()) * 31) + this.phonePrefixValidation.hashCode()) * 31) + this.phoneNumber.hashCode();
            }

            @Override // yf3.ContactDetailsFields.InterfaceC6083a
            public boolean isValid() {
                return this.phonePrefixValidation.a() && this.phoneNumberValidation.a();
            }

            public String toString() {
                return "Phone(field=" + this.field + ", phoneNumberValidation=" + this.phoneNumberValidation + ", phonePrefixValidation=" + this.phonePrefixValidation + ", phoneNumber=" + this.phoneNumber + ')';
            }

            public /* synthetic */ Phone(b bVar, hz.b bVar2, hz.b bVar3, PhoneNumber phoneNumber, int i15, k kVar) {
                this(bVar, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar3, phoneNumber);
            }
        }
    }
}
