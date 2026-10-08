package me3;

import fr.k;
import fr.t;
import iy.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: me3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0010\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Lme3/a;", "", "Lme3/a$a;", "registrationNumberField", "vinNumberField", "<init>", "(Lme3/a$a;Lme3/a$a;)V", "", "c", "()Ljava/util/List;", "", "g", "()Z", "Lme3/a$b;", "d", "()Lme3/a$b;", "a", "(Lme3/a$a;Lme3/a$a;)Lme3/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lme3/a$a;", "e", "()Lme3/a$a;", "b", "f", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddVehicleManualFields {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f126110c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Data registrationNumberField;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Data vinNumberField;

    /* JADX INFO: renamed from: me3.a$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lme3/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        VIN_NUMBER,
        REGISTRATION_NUMBER;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f126120d = wq.b.a(b());
    }

    static {
        int i15 = b0.f97726c;
        int i16 = hz.b.f86845b;
        f126110c = i15 | i15 | i16 | i16;
    }

    public AddVehicleManualFields(Data data, Data data2) {
        this.registrationNumberField = data;
        this.vinNumberField = data2;
    }

    public static /* synthetic */ AddVehicleManualFields b(AddVehicleManualFields addVehicleManualFields, Data data, Data data2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            data = addVehicleManualFields.registrationNumberField;
        }
        if ((i15 & 2) != 0) {
            data2 = addVehicleManualFields.vinNumberField;
        }
        return addVehicleManualFields.a(data, data2);
    }

    private final List<Data> c() {
        return v.q(this.registrationNumberField, this.vinNumberField);
    }

    public final AddVehicleManualFields a(Data registrationNumberField, Data vinNumberField) {
        return new AddVehicleManualFields(registrationNumberField, vinNumberField);
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
        } while (((Data) next).getValidationState().a());
        Data data = (Data) next;
        if (data != null) {
            return data.getField();
        }
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Data getRegistrationNumberField() {
        return this.registrationNumberField;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddVehicleManualFields)) {
            return false;
        }
        AddVehicleManualFields addVehicleManualFields = (AddVehicleManualFields) other;
        return t.c(this.registrationNumberField, addVehicleManualFields.registrationNumberField) && t.c(this.vinNumberField, addVehicleManualFields.vinNumberField);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Data getVinNumberField() {
        return this.vinNumberField;
    }

    public final boolean g() {
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

    public int hashCode() {
        return (this.registrationNumberField.hashCode() * 31) + this.vinNumberField.hashCode();
    }

    public String toString() {
        return "AddVehicleManualFields(registrationNumberField=" + this.registrationNumberField + ", vinNumberField=" + this.vinNumberField + ')';
    }

    /* JADX INFO: renamed from: me3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lme3/a$a;", "", "Lme3/a$b;", "field", "Lhz/b;", "validationState", "Liy/b0;", "value", "<init>", "(Lme3/a$b;Lhz/b;Liy/b0;)V", "a", "(Lme3/a$b;Lhz/b;Liy/b0;)Lme3/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lme3/a$b;", "c", "()Lme3/a$b;", "b", "Lhz/b;", "d", "()Lhz/b;", "Liy/b0;", "e", "()Liy/b0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f126113d = b0.f97726c | hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b field;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 value;

        public Data(b bVar, hz.b bVar2, b0 b0Var) {
            this.field = bVar;
            this.validationState = bVar2;
            this.value = b0Var;
        }

        public static /* synthetic */ Data b(Data data, b bVar, hz.b bVar2, b0 b0Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = data.field;
            }
            if ((i15 & 2) != 0) {
                bVar2 = data.validationState;
            }
            if ((i15 & 4) != 0) {
                b0Var = data.value;
            }
            return data.a(bVar, bVar2, b0Var);
        }

        public final Data a(b field, hz.b validationState, b0 value) {
            return new Data(field, validationState, value);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getField() {
            return this.field;
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
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return this.field == data.field && t.c(this.validationState, data.validationState) && t.c(this.value, data.value);
        }

        public int hashCode() {
            return (((this.field.hashCode() * 31) + this.validationState.hashCode()) * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Data(field=" + this.field + ", validationState=" + this.validationState + ", value=" + this.value + ')';
        }

        public /* synthetic */ Data(b bVar, hz.b bVar2, b0 b0Var, int i15, k kVar) {
            this(bVar, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar2, b0Var);
        }
    }
}
