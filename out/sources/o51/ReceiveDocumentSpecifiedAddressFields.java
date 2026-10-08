package o51;

import fr.k;
import fr.t;
import iy.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: o51.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0011\u001fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lo51/a;", "", "Lo51/a$a$a;", "nameFieldData", "surnameFieldData", "<init>", "(Lo51/a$a$a;Lo51/a$a$a;)V", "", "Lo51/a$a;", "c", "()Ljava/util/List;", "", "g", "()Z", "Lo51/a$b;", "d", "()Lo51/a$b;", "a", "(Lo51/a$a$a;Lo51/a$a$a;)Lo51/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lo51/a$a$a;", "e", "()Lo51/a$a$a;", "b", "f", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReceiveDocumentSpecifiedAddressFields {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f142479c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC3524a.TextInput nameFieldData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC3524a.TextInput surnameFieldData;

    /* JADX INFO: renamed from: o51.a$b */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lo51/a$b;", "", "a", "Lo51/a$b$a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: o51.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lo51/a$b$a;", "Lo51/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC3526a implements b {
            Name,
            Surname;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ wq.a f142489d = wq.b.a(b());
        }
    }

    static {
        int i15 = b0.f97726c;
        int i16 = hz.b.f86845b;
        f142479c = i15 | i15 | i16 | i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReceiveDocumentSpecifiedAddressFields() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ReceiveDocumentSpecifiedAddressFields b(ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields, InterfaceC3524a.TextInput textInput, InterfaceC3524a.TextInput textInput2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            textInput = receiveDocumentSpecifiedAddressFields.nameFieldData;
        }
        if ((i15 & 2) != 0) {
            textInput2 = receiveDocumentSpecifiedAddressFields.surnameFieldData;
        }
        return receiveDocumentSpecifiedAddressFields.a(textInput, textInput2);
    }

    private final List<InterfaceC3524a> c() {
        return v.q(this.nameFieldData, this.surnameFieldData);
    }

    public final ReceiveDocumentSpecifiedAddressFields a(InterfaceC3524a.TextInput nameFieldData, InterfaceC3524a.TextInput surnameFieldData) {
        return new ReceiveDocumentSpecifiedAddressFields(nameFieldData, surnameFieldData);
    }

    public final b d() {
        Object next;
        Iterator<T> it = c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC3524a) next).isValid());
        InterfaceC3524a interfaceC3524a = (InterfaceC3524a) next;
        if (interfaceC3524a != null) {
            return interfaceC3524a.getField();
        }
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC3524a.TextInput getNameFieldData() {
        return this.nameFieldData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiveDocumentSpecifiedAddressFields)) {
            return false;
        }
        ReceiveDocumentSpecifiedAddressFields receiveDocumentSpecifiedAddressFields = (ReceiveDocumentSpecifiedAddressFields) other;
        return t.c(this.nameFieldData, receiveDocumentSpecifiedAddressFields.nameFieldData) && t.c(this.surnameFieldData, receiveDocumentSpecifiedAddressFields.surnameFieldData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC3524a.TextInput getSurnameFieldData() {
        return this.surnameFieldData;
    }

    public final boolean g() {
        List<InterfaceC3524a> listC = c();
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return true;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC3524a) it.next()).isValid()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.nameFieldData.hashCode() * 31) + this.surnameFieldData.hashCode();
    }

    public String toString() {
        return "ReceiveDocumentSpecifiedAddressFields(nameFieldData=" + this.nameFieldData + ", surnameFieldData=" + this.surnameFieldData + ')';
    }

    public ReceiveDocumentSpecifiedAddressFields(InterfaceC3524a.TextInput textInput, InterfaceC3524a.TextInput textInput2) {
        this.nameFieldData = textInput;
        this.surnameFieldData = textInput2;
    }

    /* JADX INFO: renamed from: o51.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lo51/a$a;", "", "", "isValid", "()Z", "Lo51/a$b;", "a", "()Lo51/a$b;", "Lo51/a$a$a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC3524a {
        /* JADX INFO: renamed from: a */
        b getField();

        boolean isValid();

        /* JADX INFO: renamed from: o51.a$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lo51/a$a$a;", "Lo51/a$a;", "Lhz/b;", "validationState", "Liy/b0;", "value", "Lo51/a$b;", "field", "<init>", "(Lhz/b;Liy/b0;Lo51/a$b;)V", "", "isValid", "()Z", "a", "()Lo51/a$b;", "b", "(Lhz/b;Liy/b0;Lo51/a$b;)Lo51/a$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "d", "()Lhz/b;", "Liy/b0;", "e", "()Liy/b0;", "c", "Lo51/a$b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TextInput implements InterfaceC3524a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f142482d = b0.f97726c | hz.b.f86845b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 value;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final b field;

            public TextInput(hz.b bVar, b0 b0Var, b bVar2) {
                this.validationState = bVar;
                this.value = b0Var;
                this.field = bVar2;
            }

            public static /* synthetic */ TextInput c(TextInput textInput, hz.b bVar, b0 b0Var, b bVar2, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = textInput.validationState;
                }
                if ((i15 & 2) != 0) {
                    b0Var = textInput.value;
                }
                if ((i15 & 4) != 0) {
                    bVar2 = textInput.field;
                }
                return textInput.b(bVar, b0Var, bVar2);
            }

            @Override // o51.ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getField() {
                return this.field;
            }

            public final TextInput b(hz.b validationState, b0 value, b field) {
                return new TextInput(validationState, value, field);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final hz.b getValidationState() {
                return this.validationState;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
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
                return t.c(this.validationState, textInput.validationState) && t.c(this.value, textInput.value) && t.c(this.field, textInput.field);
            }

            public int hashCode() {
                return (((this.validationState.hashCode() * 31) + this.value.hashCode()) * 31) + this.field.hashCode();
            }

            @Override // o51.ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a
            public boolean isValid() {
                return this.validationState.a();
            }

            public String toString() {
                return "TextInput(validationState=" + this.validationState + ", value=" + this.value + ", field=" + this.field + ')';
            }

            public /* synthetic */ TextInput(hz.b bVar, b0 b0Var, b bVar2, int i15, k kVar) {
                this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var, bVar2);
            }
        }
    }

    public /* synthetic */ ReceiveDocumentSpecifiedAddressFields(InterfaceC3524a.TextInput textInput, InterfaceC3524a.TextInput textInput2, int i15, k kVar) {
        if ((i15 & 1) != 0) {
            textInput = new InterfaceC3524a.TextInput(null, null, b.EnumC3526a.Name, 3, null);
        }
        if ((i15 & 2) != 0) {
            textInput2 = new InterfaceC3524a.TextInput(null, null, b.EnumC3526a.Surname, 3, null);
        }
        this(textInput, textInput2);
    }
}
