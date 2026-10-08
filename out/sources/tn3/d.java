package tn3;

import bn3.VehicleDocumentContainerData;
import fr.t;
import java.util.Date;
import mx.Label;
import nn3.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"¨\u0006#"}, d2 = {"Ltn3/d;", "Ltn3/e;", "Ldn3/a$b;", "Lez/a;", "currentTimeProvider", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "Lmx/c;", "labelProvider", "<init>", "(Lez/a;Lez/e;Lez/c;Lmx/c;)V", "Ljava/util/Date;", "expireDate", "Lmx/a;", "d", "(Ljava/util/Date;)Lmx/a;", "Lbn3/g;", "vehicleDocumentDataModel", "Ldn3/b;", "f", "(Lbn3/g;)Ldn3/b;", "e", "(Lbn3/g;)Lmx/a;", "", "withUpcomingValidity", "c", "(Lbn3/g;Z)Ldn3/a$b;", "a", "Lez/a;", "b", "Lez/e;", "Lez/c;", "Lmx/c;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class d implements e<dn3.a.TechnicalExamination> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public d(ez.a aVar, ez.e eVar, ez.c cVar, mx.c cVar2) {
        this.currentTimeProvider = aVar;
        this.dateFormatter = eVar;
        this.dateConverter = cVar;
        this.labelProvider = cVar2;
    }

    private final Label d(Date expireDate) {
        if (expireDate != null) {
            return mx.b.b(this.dateFormatter.d(new fz.b.Date(expireDate), fz.c.DOTTED), "insuranceDateLabelTag");
        }
        return null;
    }

    private final Label e(VehicleDocumentContainerData vehicleDocumentDataModel) {
        Date technicalExaminationExpireDate;
        if (vehicleDocumentDataModel == null || (technicalExaminationExpireDate = vehicleDocumentDataModel.getTechnicalExaminationExpireDate()) == null) {
            return this.labelProvider.c(um3.b.Q0);
        }
        if (i.b(vehicleDocumentDataModel) && i.a(technicalExaminationExpireDate)) {
            return this.labelProvider.c(um3.b.N0);
        }
        Date dateH = this.currentTimeProvider.h();
        return this.labelProvider.c((dateH.before(technicalExaminationExpireDate) || t.c(dateH, technicalExaminationExpireDate)) ? um3.b.R0 : um3.b.F0);
    }

    private final dn3.b f(VehicleDocumentContainerData vehicleDocumentDataModel) {
        Date technicalExaminationExpireDate;
        Date dateH = this.currentTimeProvider.h();
        if (vehicleDocumentDataModel == null || (technicalExaminationExpireDate = vehicleDocumentDataModel.getTechnicalExaminationExpireDate()) == null) {
            return dn3.b.UNKNOWN;
        }
        if (i.b(vehicleDocumentDataModel) && i.a(technicalExaminationExpireDate)) {
            return dn3.b.VALID;
        }
        return (ez.d.c(this.dateConverter.l(technicalExaminationExpireDate), null, 1, null) || technicalExaminationExpireDate.after(dateH)) ? dn3.b.VALID : dn3.b.INVALID;
    }

    @Override // tn3.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public dn3.a.TechnicalExamination b(VehicleDocumentContainerData vehicleDocumentDataModel, boolean withUpcomingValidity) {
        return new dn3.a.TechnicalExamination(this.labelProvider.c(um3.b.f199261s0), f(vehicleDocumentDataModel), e(vehicleDocumentDataModel), d(vehicleDocumentDataModel != null ? vehicleDocumentDataModel.getTechnicalExaminationExpireDate() : null));
    }
}
