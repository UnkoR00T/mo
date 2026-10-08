package xi3;

import fr.k;
import fr.t;
import iy.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: xi3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0014\"B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lxi3/a;", "", "Lxi3/a$a$c;", "insuranceNumberField", "Lxi3/a$a$a;", "statementCheckBoxField", "Lxi3/a$a$b;", "insuranceCompanyDropDownField", "<init>", "(Lxi3/a$a$c;Lxi3/a$a$a;Lxi3/a$a$b;)V", "", "Lxi3/a$a;", "c", "()Ljava/util/List;", "", "h", "()Z", "Lxi3/a$b;", "d", "()Lxi3/a$b;", "a", "(Lxi3/a$a$c;Lxi3/a$a$a;Lxi3/a$a$b;)Lxi3/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lxi3/a$a$c;", "f", "()Lxi3/a$a$c;", "b", "Lxi3/a$a$a;", "g", "()Lxi3/a$a$a;", "Lxi3/a$a$b;", "e", "()Lxi3/a$a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceFieldsData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f219088d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5853a.Input insuranceNumberField;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5853a.CheckBox statementCheckBoxField;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5853a.DropDown insuranceCompanyDropDownField;

    /* JADX INFO: renamed from: xi3.a$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lxi3/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        INSURANCE_COMPANY_DROP_DOWN,
        INSURANCE_NUMBER,
        STATEMENT_CHECKBOX;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f219107e = wq.b.a(b());
    }

    static {
        int i15 = hz.b.f86845b;
        f219088d = i15 | b0.f97726c | i15;
    }

    public InsuranceFieldsData(InterfaceC5853a.Input input, InterfaceC5853a.CheckBox checkBox, InterfaceC5853a.DropDown dropDown) {
        this.insuranceNumberField = input;
        this.statementCheckBoxField = checkBox;
        this.insuranceCompanyDropDownField = dropDown;
    }

    public static /* synthetic */ InsuranceFieldsData b(InsuranceFieldsData insuranceFieldsData, InterfaceC5853a.Input input, InterfaceC5853a.CheckBox checkBox, InterfaceC5853a.DropDown dropDown, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            input = insuranceFieldsData.insuranceNumberField;
        }
        if ((i15 & 2) != 0) {
            checkBox = insuranceFieldsData.statementCheckBoxField;
        }
        if ((i15 & 4) != 0) {
            dropDown = insuranceFieldsData.insuranceCompanyDropDownField;
        }
        return insuranceFieldsData.a(input, checkBox, dropDown);
    }

    private final List<InterfaceC5853a> c() {
        return v.q(this.insuranceCompanyDropDownField, this.insuranceNumberField, this.statementCheckBoxField);
    }

    public final InsuranceFieldsData a(InterfaceC5853a.Input insuranceNumberField, InterfaceC5853a.CheckBox statementCheckBoxField, InterfaceC5853a.DropDown insuranceCompanyDropDownField) {
        return new InsuranceFieldsData(insuranceNumberField, statementCheckBoxField, insuranceCompanyDropDownField);
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
        } while (((InterfaceC5853a) next).getValidationState().a());
        InterfaceC5853a interfaceC5853a = (InterfaceC5853a) next;
        if (interfaceC5853a != null) {
            return interfaceC5853a.getField();
        }
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC5853a.DropDown getInsuranceCompanyDropDownField() {
        return this.insuranceCompanyDropDownField;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsuranceFieldsData)) {
            return false;
        }
        InsuranceFieldsData insuranceFieldsData = (InsuranceFieldsData) other;
        return t.c(this.insuranceNumberField, insuranceFieldsData.insuranceNumberField) && t.c(this.statementCheckBoxField, insuranceFieldsData.statementCheckBoxField) && t.c(this.insuranceCompanyDropDownField, insuranceFieldsData.insuranceCompanyDropDownField);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC5853a.Input getInsuranceNumberField() {
        return this.insuranceNumberField;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC5853a.CheckBox getStatementCheckBoxField() {
        return this.statementCheckBoxField;
    }

    public final boolean h() {
        List<InterfaceC5853a> listC = c();
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return true;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC5853a) it.next()).getValidationState().a()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.insuranceNumberField.hashCode() * 31) + this.statementCheckBoxField.hashCode()) * 31) + this.insuranceCompanyDropDownField.hashCode();
    }

    public String toString() {
        return "InsuranceFieldsData(insuranceNumberField=" + this.insuranceNumberField + ", statementCheckBoxField=" + this.statementCheckBoxField + ", insuranceCompanyDropDownField=" + this.insuranceCompanyDropDownField + ')';
    }

    /* JADX INFO: renamed from: xi3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\n\u0003\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lxi3/a$a;", "", "Lxi3/a$b;", "a", "()Lxi3/a$b;", "field", "Lhz/b;", "b", "()Lhz/b;", "validationState", "c", "Lxi3/a$a$a;", "Lxi3/a$a$b;", "Lxi3/a$a$c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC5853a {
        /* JADX INFO: renamed from: a */
        b getField();

        /* JADX INFO: renamed from: b */
        hz.b getValidationState();

        /* JADX INFO: renamed from: xi3.a$a$b, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lxi3/a$a$b;", "Lxi3/a$a;", "Lxi3/a$b;", "field", "Lhz/b;", "validationState", "<init>", "(Lxi3/a$b;Lhz/b;)V", "c", "(Lxi3/a$b;Lhz/b;)Lxi3/a$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxi3/a$b;", "()Lxi3/a$b;", "b", "Lhz/b;", "()Lhz/b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DropDown implements InterfaceC5853a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f219096c = hz.b.f86845b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b field;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            public DropDown(b bVar, hz.b bVar2) {
                this.field = bVar;
                this.validationState = bVar2;
            }

            public static /* synthetic */ DropDown d(DropDown dropDown, b bVar, hz.b bVar2, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = dropDown.field;
                }
                if ((i15 & 2) != 0) {
                    bVar2 = dropDown.validationState;
                }
                return dropDown.c(bVar, bVar2);
            }

            @Override // xi3.InsuranceFieldsData.InterfaceC5853a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getField() {
                return this.field;
            }

            @Override // xi3.InsuranceFieldsData.InterfaceC5853a
            /* JADX INFO: renamed from: b, reason: from getter */
            public hz.b getValidationState() {
                return this.validationState;
            }

            public final DropDown c(b field, hz.b validationState) {
                return new DropDown(field, validationState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DropDown)) {
                    return false;
                }
                DropDown dropDown = (DropDown) other;
                return this.field == dropDown.field && t.c(this.validationState, dropDown.validationState);
            }

            public int hashCode() {
                return (this.field.hashCode() * 31) + this.validationState.hashCode();
            }

            public String toString() {
                return "DropDown(field=" + this.field + ", validationState=" + this.validationState + ')';
            }

            public /* synthetic */ DropDown(b bVar, hz.b bVar2, int i15, k kVar) {
                this(bVar, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar2);
            }
        }

        /* JADX INFO: renamed from: xi3.a$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lxi3/a$a$a;", "Lxi3/a$a;", "Lxi3/a$b;", "field", "Lhz/b;", "validationState", "", "isChecked", "<init>", "(Lxi3/a$b;Lhz/b;Z)V", "c", "(Lxi3/a$b;Lhz/b;Z)Lxi3/a$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lxi3/a$b;", "()Lxi3/a$b;", "b", "Lhz/b;", "()Lhz/b;", "Z", "e", "()Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckBox implements InterfaceC5853a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f219092d = hz.b.f86845b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b field;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isChecked;

            public CheckBox(b bVar, hz.b bVar2, boolean z15) {
                this.field = bVar;
                this.validationState = bVar2;
                this.isChecked = z15;
            }

            public static /* synthetic */ CheckBox d(CheckBox checkBox, b bVar, hz.b bVar2, boolean z15, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = checkBox.field;
                }
                if ((i15 & 2) != 0) {
                    bVar2 = checkBox.validationState;
                }
                if ((i15 & 4) != 0) {
                    z15 = checkBox.isChecked;
                }
                return checkBox.c(bVar, bVar2, z15);
            }

            @Override // xi3.InsuranceFieldsData.InterfaceC5853a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getField() {
                return this.field;
            }

            @Override // xi3.InsuranceFieldsData.InterfaceC5853a
            /* JADX INFO: renamed from: b, reason: from getter */
            public hz.b getValidationState() {
                return this.validationState;
            }

            public final CheckBox c(b field, hz.b validationState, boolean isChecked) {
                return new CheckBox(field, validationState, isChecked);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CheckBox)) {
                    return false;
                }
                CheckBox checkBox = (CheckBox) other;
                return this.field == checkBox.field && t.c(this.validationState, checkBox.validationState) && this.isChecked == checkBox.isChecked;
            }

            public int hashCode() {
                return (((this.field.hashCode() * 31) + this.validationState.hashCode()) * 31) + Boolean.hashCode(this.isChecked);
            }

            public String toString() {
                return "CheckBox(field=" + this.field + ", validationState=" + this.validationState + ", isChecked=" + this.isChecked + ')';
            }

            public /* synthetic */ CheckBox(b bVar, hz.b bVar2, boolean z15, int i15, k kVar) {
                this(bVar, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 4) != 0 ? false : z15);
            }
        }

        /* JADX INFO: renamed from: xi3.a$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lxi3/a$a$c;", "Lxi3/a$a;", "Lxi3/a$b;", "field", "Lhz/b;", "validationState", "Liy/b0;", "value", "<init>", "(Lxi3/a$b;Lhz/b;Liy/b0;)V", "c", "(Lxi3/a$b;Lhz/b;Liy/b0;)Lxi3/a$a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxi3/a$b;", "()Lxi3/a$b;", "b", "Lhz/b;", "()Lhz/b;", "Liy/b0;", "e", "()Liy/b0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Input implements InterfaceC5853a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f219099d = b0.f97726c | hz.b.f86845b;

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

            public static /* synthetic */ Input d(Input input, b bVar, hz.b bVar2, b0 b0Var, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = input.field;
                }
                if ((i15 & 2) != 0) {
                    bVar2 = input.validationState;
                }
                if ((i15 & 4) != 0) {
                    b0Var = input.value;
                }
                return input.c(bVar, bVar2, b0Var);
            }

            @Override // xi3.InsuranceFieldsData.InterfaceC5853a
            /* JADX INFO: renamed from: a, reason: from getter */
            public b getField() {
                return this.field;
            }

            @Override // xi3.InsuranceFieldsData.InterfaceC5853a
            /* JADX INFO: renamed from: b, reason: from getter */
            public hz.b getValidationState() {
                return this.validationState;
            }

            public final Input c(b field, hz.b validationState, b0 value) {
                return new Input(field, validationState, value);
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final b0 getValue() {
                return this.value;
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

            public int hashCode() {
                return (((this.field.hashCode() * 31) + this.validationState.hashCode()) * 31) + this.value.hashCode();
            }

            public String toString() {
                return "Input(field=" + this.field + ", validationState=" + this.validationState + ", value=" + this.value + ')';
            }

            public /* synthetic */ Input(b bVar, hz.b bVar2, b0 b0Var, int i15, k kVar) {
                this(bVar, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 4) != 0 ? b0.INSTANCE.a() : b0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ InsuranceFieldsData(InterfaceC5853a.Input input, InterfaceC5853a.CheckBox checkBox, InterfaceC5853a.DropDown dropDown, int i15, k kVar) {
        if ((i15 & 1) != 0) {
            input = new InterfaceC5853a.Input(b.INSURANCE_NUMBER, null, null, 6, null);
        }
        if ((i15 & 2) != 0) {
            checkBox = new InterfaceC5853a.CheckBox(b.STATEMENT_CHECKBOX, null, false, 6, null);
        }
        this(input, checkBox, (i15 & 4) != 0 ? new InterfaceC5853a.DropDown(b.INSURANCE_COMPANY_DROP_DOWN, null, 2, 0 == true ? 1 : 0) : dropDown);
    }
}
