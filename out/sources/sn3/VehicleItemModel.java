package sn3;

import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sn3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b!\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b\u001c\u0010'¨\u0006("}, d2 = {"Lsn3/a;", "", "", "vehicleIcon", "Lmx/a;", "vehicleName", "registrationNumber", "Ldn3/a$a;", "insuranceValidity", "Ldn3/a$b;", "technicalExaminationValidity", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(ILmx/a;Lmx/a;Ldn3/a$a;Ldn3/a$b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "d", "Ldn3/a$a;", "()Ldn3/a$a;", "Ldn3/a$b;", "()Ldn3/a$b;", "Ler/a;", "()Ler/a;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleItemModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int vehicleIcon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label vehicleName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label registrationNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final dn3.a.Insurance insuranceValidity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final dn3.a.TechnicalExamination technicalExaminationValidity;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    public VehicleItemModel(int i15, Label label, Label label2, dn3.a.Insurance insurance, dn3.a.TechnicalExamination technicalExamination, er.a<i0> aVar) {
        this.vehicleIcon = i15;
        this.vehicleName = label;
        this.registrationNumber = label2;
        this.insuranceValidity = insurance;
        this.technicalExaminationValidity = technicalExamination;
        this.onClick = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final dn3.a.Insurance getInsuranceValidity() {
        return this.insuranceValidity;
    }

    public final er.a<i0> b() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getRegistrationNumber() {
        return this.registrationNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final dn3.a.TechnicalExamination getTechnicalExaminationValidity() {
        return this.technicalExaminationValidity;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getVehicleIcon() {
        return this.vehicleIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleItemModel)) {
            return false;
        }
        VehicleItemModel vehicleItemModel = (VehicleItemModel) other;
        return this.vehicleIcon == vehicleItemModel.vehicleIcon && t.c(this.vehicleName, vehicleItemModel.vehicleName) && t.c(this.registrationNumber, vehicleItemModel.registrationNumber) && t.c(this.insuranceValidity, vehicleItemModel.insuranceValidity) && t.c(this.technicalExaminationValidity, vehicleItemModel.technicalExaminationValidity) && t.c(this.onClick, vehicleItemModel.onClick);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getVehicleName() {
        return this.vehicleName;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.vehicleIcon) * 31) + this.vehicleName.hashCode()) * 31) + this.registrationNumber.hashCode()) * 31) + this.insuranceValidity.hashCode()) * 31) + this.technicalExaminationValidity.hashCode()) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "VehicleItemModel(vehicleIcon=" + this.vehicleIcon + ", vehicleName=" + this.vehicleName + ", registrationNumber=" + this.registrationNumber + ", insuranceValidity=" + this.insuranceValidity + ", technicalExaminationValidity=" + this.technicalExaminationValidity + ", onClick=" + this.onClick + ')';
    }
}
