package b51;

import b51.a.c;
import fr.k;
import fr.t;
import hz.b;
import iy.b0;
import iy.c0;
import java.util.LinkedHashMap;
import java.util.Map;
import lr.m;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import wi0.CitizenshipDictionary;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\b\u000b\u0007\f\r\u000e\t\u000f\u0010J%\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00002\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lb51/a;", "Lb51/a$c;", "T", "", "", "Lb51/a$d;", "inputs", "c", "(Ljava/util/Map;)Lb51/a;", "b", "()Ljava/util/Map;", "d", "g", "h", "e", "f", "a", "Lb51/a$a;", "Lb51/a$b;", "Lb51/a$e;", "Lb51/a$f;", "Lb51/a$g;", "Lb51/a$h;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a<T extends c> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lb51/a$c;", "", "Lb51/a$a$a;", "Lb51/a$b$a;", "Lb51/a$e$a;", "Lb51/a$f$a;", "Lb51/a$g$a;", "Lb51/a$h$a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
    }

    /* JADX INFO: renamed from: b51.a$d, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, d2 = {"Lb51/a$d;", "", "Lb51/a$c;", "field", "Lb51/a$d$a;", "value", "Lhz/b;", "validationState", "", "enabled", "<init>", "(Lb51/a$c;Lb51/a$d$a;Lhz/b;Z)V", "a", "(Lb51/a$c;Lb51/a$d$a;Lhz/b;Z)Lb51/a$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lb51/a$c;", "d", "()Lb51/a$c;", "b", "Lb51/a$d$a;", "f", "()Lb51/a$d$a;", "c", "Lhz/b;", "e", "()Lhz/b;", "Z", "()Z", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FieldData {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f16695e = b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c field;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC0401a value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b validationState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        public FieldData(c cVar, InterfaceC0401a interfaceC0401a, b bVar, boolean z15) {
            this.field = cVar;
            this.value = interfaceC0401a;
            this.validationState = bVar;
            this.enabled = z15;
        }

        public static /* synthetic */ FieldData b(FieldData fieldData, c cVar, InterfaceC0401a interfaceC0401a, b bVar, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                cVar = fieldData.field;
            }
            if ((i15 & 2) != 0) {
                interfaceC0401a = fieldData.value;
            }
            if ((i15 & 4) != 0) {
                bVar = fieldData.validationState;
            }
            if ((i15 & 8) != 0) {
                z15 = fieldData.enabled;
            }
            return fieldData.a(cVar, interfaceC0401a, bVar, z15);
        }

        public final FieldData a(c field, InterfaceC0401a value, b validationState, boolean enabled) {
            return new FieldData(field, value, validationState, enabled);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getField() {
            return this.field;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final b getValidationState() {
            return this.validationState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldData)) {
                return false;
            }
            FieldData fieldData = (FieldData) other;
            return t.c(this.field, fieldData.field) && t.c(this.value, fieldData.value) && t.c(this.validationState, fieldData.validationState) && this.enabled == fieldData.enabled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final InterfaceC0401a getValue() {
            return this.value;
        }

        public int hashCode() {
            return (((((this.field.hashCode() * 31) + this.value.hashCode()) * 31) + this.validationState.hashCode()) * 31) + Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "FieldData(field=" + this.field + ", value=" + this.value + ", validationState=" + this.validationState + ", enabled=" + this.enabled + ')';
        }

        /* JADX INFO: renamed from: b51.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lb51/a$d$a;", "", "c", "a", "b", "Lb51/a$d$a$a;", "Lb51/a$d$a$b;", "Lb51/a$d$a$c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC0401a {

            /* JADX INFO: renamed from: b51.a$d$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb51/a$d$a$a;", "Lb51/a$d$a;", "Lfz/b$c;", "data", "<init>", "(Lfz/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfz/b$c;", "()Lfz/b$c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Date implements InterfaceC0401a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f16700b = fz.b.LocalDate.f68860b;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final fz.b.LocalDate data;

                public Date(fz.b.LocalDate localDate) {
                    this.data = localDate;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final fz.b.LocalDate getData() {
                    return this.data;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Date) && t.c(this.data, ((Date) other).data);
                }

                public int hashCode() {
                    fz.b.LocalDate localDate = this.data;
                    if (localDate == null) {
                        return 0;
                    }
                    return localDate.hashCode();
                }

                public String toString() {
                    return "Date(data=" + this.data + ')';
                }
            }

            /* JADX INFO: renamed from: b51.a$d$a$b, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb51/a$d$a$b;", "Lb51/a$d$a;", "Lwi0/a;", "data", "<init>", "(Lwi0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwi0/a;", "()Lwi0/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DropDown implements InterfaceC0401a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final CitizenshipDictionary data;

                public DropDown(CitizenshipDictionary citizenshipDictionary) {
                    this.data = citizenshipDictionary;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final CitizenshipDictionary getData() {
                    return this.data;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DropDown) && t.c(this.data, ((DropDown) other).data);
                }

                public int hashCode() {
                    CitizenshipDictionary citizenshipDictionary = this.data;
                    if (citizenshipDictionary == null) {
                        return 0;
                    }
                    return citizenshipDictionary.hashCode();
                }

                public String toString() {
                    return "DropDown(data=" + this.data + ')';
                }
            }

            /* JADX INFO: renamed from: b51.a$d$a$c, reason: from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lb51/a$d$a$c;", "Lb51/a$d$a;", "Liy/b0;", "text", "Lj70/a;", "accessibilityReadMode", "<init>", "(Liy/b0;Lj70/a;)V", "a", "(Liy/b0;Lj70/a;)Lb51/a$d$a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "d", "()Liy/b0;", "b", "Lj70/a;", "c", "()Lj70/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Text implements InterfaceC0401a {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final int f16703c = b0.f97726c;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final b0 text;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final j70.a accessibilityReadMode;

                public Text(b0 b0Var, j70.a aVar) {
                    this.text = b0Var;
                    this.accessibilityReadMode = aVar;
                }

                public static /* synthetic */ Text b(Text text, b0 b0Var, j70.a aVar, int i15, Object obj) {
                    if ((i15 & 1) != 0) {
                        b0Var = text.text;
                    }
                    if ((i15 & 2) != 0) {
                        aVar = text.accessibilityReadMode;
                    }
                    return text.a(b0Var, aVar);
                }

                public final Text a(b0 text, j70.a accessibilityReadMode) {
                    return new Text(text, accessibilityReadMode);
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final j70.a getAccessibilityReadMode() {
                    return this.accessibilityReadMode;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final b0 getText() {
                    return this.text;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) other;
                    return t.c(this.text, text.text) && this.accessibilityReadMode == text.accessibilityReadMode;
                }

                public int hashCode() {
                    return (this.text.hashCode() * 31) + this.accessibilityReadMode.hashCode();
                }

                public String toString() {
                    return "Text(text=" + this.text + ", accessibilityReadMode=" + this.accessibilityReadMode + ')';
                }

                public /* synthetic */ Text(b0 b0Var, j70.a aVar, int i15, k kVar) {
                    this(b0Var, (i15 & 2) != 0 ? j70.a.NORMAL : aVar);
                }
            }
        }

        public /* synthetic */ FieldData(c cVar, InterfaceC0401a interfaceC0401a, b bVar, boolean z15, int i15, k kVar) {
            this(cVar, interfaceC0401a, bVar, (i15 & 8) != 0 ? true : z15);
        }
    }

    Map<T, FieldData> b();

    default a<?> c(Map<?, FieldData> inputs) {
        if (this instanceof SecondDataParent) {
            return ((SecondDataParent) this).a(inputs);
        }
        if (this instanceof FatherName) {
            return ((FatherName) this).a(inputs);
        }
        if (this instanceof FatherPlaceOfBirthCertificate) {
            return ((FatherPlaceOfBirthCertificate) this).a(inputs);
        }
        if (this instanceof MarriageCertificate) {
            return ((MarriageCertificate) this).a(inputs);
        }
        if (this instanceof MotherPlaceOfBirthCertificate) {
            return ((MotherPlaceOfBirthCertificate) this).a(inputs);
        }
        if (this instanceof YourBirthCertificate) {
            return ((YourBirthCertificate) this).a(inputs);
        }
        throw new p();
    }

    /* JADX INFO: renamed from: b51.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb51/a$a;", "Lb51/a;", "Lb51/a$a$a;", "", "Lb51/a$d;", "inputs", "<init>", "(Ljava/util/Map;)V", "a", "(Ljava/util/Map;)Lb51/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FatherName implements a<EnumC0399a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<EnumC0399a, FieldData> inputs;

        /* JADX INFO: renamed from: b51.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lb51/a$a$a;", "Lb51/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC0399a implements c {
            Name;


            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ wq.a f16689c = wq.b.a(b());

            public static wq.a<EnumC0399a> e() {
                return f16689c;
            }
        }

        public FatherName(Map<EnumC0399a, FieldData> map) {
            this.inputs = map;
        }

        public final FatherName a(Map<EnumC0399a, FieldData> inputs) {
            return new FatherName(inputs);
        }

        @Override // b51.a
        public Map<EnumC0399a, FieldData> b() {
            return this.inputs;
        }

        @Override // b51.a
        public /* bridge */ a<?> c(Map<?, FieldData> map) {
            return super.c(map);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FatherName) && t.c(this.inputs, ((FatherName) other).inputs);
        }

        public int hashCode() {
            return this.inputs.hashCode();
        }

        public String toString() {
            return "FatherName(inputs=" + this.inputs + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ FatherName(Map map, int i15, k kVar) {
            if ((i15 & 1) != 0) {
                wq.a<EnumC0399a> aVarE = EnumC0399a.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(aVarE, 10)), 16));
                for (EnumC0399a enumC0399a : aVarE) {
                    boolean z15 = false;
                    linkedHashMap.put(enumC0399a, new FieldData(enumC0399a, new FieldData.InterfaceC0401a.Text(c0.g(""), null, 2, 0 == true ? 1 : 0), b.C2039b.f86846c, z15, 8, null));
                }
                map = linkedHashMap;
            }
            this(map);
        }
    }

    /* JADX INFO: renamed from: b51.a$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb51/a$b;", "Lb51/a;", "Lb51/a$b$a;", "", "Lb51/a$d;", "inputs", "<init>", "(Ljava/util/Map;)V", "a", "(Ljava/util/Map;)Lb51/a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FatherPlaceOfBirthCertificate implements a<EnumC0400a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<EnumC0400a, FieldData> inputs;

        /* JADX INFO: renamed from: b51.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lb51/a$b$a;", "Lb51/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC0400a implements c {
            Place,
            Number;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ wq.a f16694d = wq.b.a(b());

            public static wq.a<EnumC0400a> e() {
                return f16694d;
            }
        }

        public FatherPlaceOfBirthCertificate(Map<EnumC0400a, FieldData> map) {
            this.inputs = map;
        }

        public final FatherPlaceOfBirthCertificate a(Map<EnumC0400a, FieldData> inputs) {
            return new FatherPlaceOfBirthCertificate(inputs);
        }

        @Override // b51.a
        public Map<EnumC0400a, FieldData> b() {
            return this.inputs;
        }

        @Override // b51.a
        public /* bridge */ a<?> c(Map<?, FieldData> map) {
            return super.c(map);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FatherPlaceOfBirthCertificate) && t.c(this.inputs, ((FatherPlaceOfBirthCertificate) other).inputs);
        }

        public int hashCode() {
            return this.inputs.hashCode();
        }

        public String toString() {
            return "FatherPlaceOfBirthCertificate(inputs=" + this.inputs + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ FatherPlaceOfBirthCertificate(Map map, int i15, k kVar) {
            if ((i15 & 1) != 0) {
                wq.a<EnumC0400a> aVarE = EnumC0400a.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(aVarE, 10)), 16));
                for (EnumC0400a enumC0400a : aVarE) {
                    boolean z15 = false;
                    linkedHashMap.put(enumC0400a, new FieldData(enumC0400a, new FieldData.InterfaceC0401a.Text(c0.g(""), null, 2, 0 == true ? 1 : 0), b.C2039b.f86846c, z15, 8, null));
                }
                map = linkedHashMap;
            }
            this(map);
        }
    }

    /* JADX INFO: renamed from: b51.a$e, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb51/a$e;", "Lb51/a;", "Lb51/a$e$a;", "", "Lb51/a$d;", "inputs", "<init>", "(Ljava/util/Map;)V", "a", "(Ljava/util/Map;)Lb51/a$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarriageCertificate implements a<EnumC0403a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<EnumC0403a, FieldData> inputs;

        /* JADX INFO: renamed from: b51.a$e$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lb51/a$e$a;", "Lb51/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC0403a implements c {
            Place,
            Number;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ wq.a f16710d = wq.b.a(b());

            public static wq.a<EnumC0403a> e() {
                return f16710d;
            }
        }

        public MarriageCertificate(Map<EnumC0403a, FieldData> map) {
            this.inputs = map;
        }

        public final MarriageCertificate a(Map<EnumC0403a, FieldData> inputs) {
            return new MarriageCertificate(inputs);
        }

        @Override // b51.a
        public Map<EnumC0403a, FieldData> b() {
            return this.inputs;
        }

        @Override // b51.a
        public /* bridge */ a<?> c(Map<?, FieldData> map) {
            return super.c(map);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MarriageCertificate) && t.c(this.inputs, ((MarriageCertificate) other).inputs);
        }

        public int hashCode() {
            return this.inputs.hashCode();
        }

        public String toString() {
            return "MarriageCertificate(inputs=" + this.inputs + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ MarriageCertificate(Map map, int i15, k kVar) {
            if ((i15 & 1) != 0) {
                wq.a<EnumC0403a> aVarE = EnumC0403a.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(aVarE, 10)), 16));
                for (EnumC0403a enumC0403a : aVarE) {
                    boolean z15 = false;
                    linkedHashMap.put(enumC0403a, new FieldData(enumC0403a, new FieldData.InterfaceC0401a.Text(c0.g(""), null, 2, 0 == true ? 1 : 0), b.C2039b.f86846c, z15, 8, null));
                }
                map = linkedHashMap;
            }
            this(map);
        }
    }

    /* JADX INFO: renamed from: b51.a$f, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb51/a$f;", "Lb51/a;", "Lb51/a$f$a;", "", "Lb51/a$d;", "inputs", "<init>", "(Ljava/util/Map;)V", "a", "(Ljava/util/Map;)Lb51/a$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MotherPlaceOfBirthCertificate implements a<EnumC0404a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<EnumC0404a, FieldData> inputs;

        /* JADX INFO: renamed from: b51.a$f$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lb51/a$f$a;", "Lb51/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC0404a implements c {
            Place,
            Number;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ wq.a f16715d = wq.b.a(b());

            public static wq.a<EnumC0404a> e() {
                return f16715d;
            }
        }

        public MotherPlaceOfBirthCertificate(Map<EnumC0404a, FieldData> map) {
            this.inputs = map;
        }

        public final MotherPlaceOfBirthCertificate a(Map<EnumC0404a, FieldData> inputs) {
            return new MotherPlaceOfBirthCertificate(inputs);
        }

        @Override // b51.a
        public Map<EnumC0404a, FieldData> b() {
            return this.inputs;
        }

        @Override // b51.a
        public /* bridge */ a<?> c(Map<?, FieldData> map) {
            return super.c(map);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MotherPlaceOfBirthCertificate) && t.c(this.inputs, ((MotherPlaceOfBirthCertificate) other).inputs);
        }

        public int hashCode() {
            return this.inputs.hashCode();
        }

        public String toString() {
            return "MotherPlaceOfBirthCertificate(inputs=" + this.inputs + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ MotherPlaceOfBirthCertificate(Map map, int i15, k kVar) {
            if ((i15 & 1) != 0) {
                wq.a<EnumC0404a> aVarE = EnumC0404a.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(aVarE, 10)), 16));
                for (EnumC0404a enumC0404a : aVarE) {
                    boolean z15 = false;
                    linkedHashMap.put(enumC0404a, new FieldData(enumC0404a, new FieldData.InterfaceC0401a.Text(c0.g(""), null, 2, 0 == true ? 1 : 0), b.C2039b.f86846c, z15, 8, null));
                }
                map = linkedHashMap;
            }
            this(map);
        }
    }

    /* JADX INFO: renamed from: b51.a$g, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb51/a$g;", "Lb51/a;", "Lb51/a$g$a;", "", "Lb51/a$d;", "inputs", "<init>", "(Ljava/util/Map;)V", "a", "(Ljava/util/Map;)Lb51/a$g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SecondDataParent implements a<EnumC0405a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<EnumC0405a, FieldData> inputs;

        /* JADX INFO: renamed from: b51.a$g$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lb51/a$g$a;", "Lb51/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "j", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC0405a implements c {
            FirstName,
            SecondName,
            NextName,
            LastName,
            FamilyName,
            PESEL,
            DateOfBirth,
            PlaceOfBirth,
            Citizenship;


            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static final /* synthetic */ wq.a f16727l = wq.b.a(b());

            public static wq.a<EnumC0405a> e() {
                return f16727l;
            }
        }

        /* JADX INFO: renamed from: b51.a$g$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16728a;

            static {
                int[] iArr = new int[EnumC0405a.values().length];
                try {
                    iArr[EnumC0405a.Citizenship.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0405a.DateOfBirth.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC0405a.PESEL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f16728a = iArr;
            }
        }

        public SecondDataParent(Map<EnumC0405a, FieldData> map) {
            this.inputs = map;
        }

        public final SecondDataParent a(Map<EnumC0405a, FieldData> inputs) {
            return new SecondDataParent(inputs);
        }

        @Override // b51.a
        public Map<EnumC0405a, FieldData> b() {
            return this.inputs;
        }

        @Override // b51.a
        public /* bridge */ a<?> c(Map<?, FieldData> map) {
            return super.c(map);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SecondDataParent) && t.c(this.inputs, ((SecondDataParent) other).inputs);
        }

        public int hashCode() {
            return this.inputs.hashCode();
        }

        public String toString() {
            return "SecondDataParent(inputs=" + this.inputs + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ SecondDataParent(Map map, int i15, k kVar) {
            FieldData fieldData;
            if ((i15 & 1) != 0) {
                wq.a<EnumC0405a> aVarE = EnumC0405a.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(aVarE, 10)), 16));
                for (EnumC0405a enumC0405a : aVarE) {
                    EnumC0405a enumC0405a2 = enumC0405a;
                    int i16 = b.f16728a[enumC0405a2.ordinal()];
                    j70.a aVar = null;
                    Object[] objArr = 0;
                    if (i16 != 1) {
                        int i17 = 2;
                        if (i16 == 2) {
                            fieldData = new FieldData(enumC0405a2, new FieldData.InterfaceC0401a.Date(null), hz.b.C2039b.f86846c, false, 8, null);
                        } else if (i16 != 3) {
                            fieldData = new FieldData(enumC0405a2, new FieldData.InterfaceC0401a.Text(c0.g(""), aVar, i17, objArr == true ? 1 : 0), hz.b.C2039b.f86846c, false, 8, null);
                        } else {
                            fieldData = new FieldData(enumC0405a2, new FieldData.InterfaceC0401a.Text(c0.g(""), j70.a.LETTER_BY_LETTER), hz.b.C2039b.f86846c, false, 8, null);
                        }
                    } else {
                        fieldData = new FieldData(enumC0405a2, new FieldData.InterfaceC0401a.DropDown(null), hz.b.C2039b.f86846c, false, 8, null);
                    }
                    linkedHashMap.put(enumC0405a, fieldData);
                }
                map = linkedHashMap;
            }
            this(map);
        }
    }

    /* JADX INFO: renamed from: b51.a$h, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb51/a$h;", "Lb51/a;", "Lb51/a$h$a;", "", "Lb51/a$d;", "inputs", "<init>", "(Ljava/util/Map;)V", "a", "(Ljava/util/Map;)Lb51/a$h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class YourBirthCertificate implements a<EnumC0406a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<EnumC0406a, FieldData> inputs;

        /* JADX INFO: renamed from: b51.a$h$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lb51/a$h$a;", "Lb51/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC0406a implements c {
            Place,
            Number;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ wq.a f16733d = wq.b.a(b());

            public static wq.a<EnumC0406a> e() {
                return f16733d;
            }
        }

        public YourBirthCertificate(Map<EnumC0406a, FieldData> map) {
            this.inputs = map;
        }

        public final YourBirthCertificate a(Map<EnumC0406a, FieldData> inputs) {
            return new YourBirthCertificate(inputs);
        }

        @Override // b51.a
        public Map<EnumC0406a, FieldData> b() {
            return this.inputs;
        }

        @Override // b51.a
        public /* bridge */ a<?> c(Map<?, FieldData> map) {
            return super.c(map);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof YourBirthCertificate) && t.c(this.inputs, ((YourBirthCertificate) other).inputs);
        }

        public int hashCode() {
            return this.inputs.hashCode();
        }

        public String toString() {
            return "YourBirthCertificate(inputs=" + this.inputs + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ YourBirthCertificate(Map map, int i15, k kVar) {
            if ((i15 & 1) != 0) {
                wq.a<EnumC0406a> aVarE = EnumC0406a.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(aVarE, 10)), 16));
                for (EnumC0406a enumC0406a : aVarE) {
                    boolean z15 = false;
                    linkedHashMap.put(enumC0406a, new FieldData(enumC0406a, new FieldData.InterfaceC0401a.Text(c0.g(""), null, 2, 0 == true ? 1 : 0), b.C2039b.f86846c, z15, 8, null));
                }
                map = linkedHashMap;
            }
            this(map);
        }
    }
}
