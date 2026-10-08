package tn3;

import bn3.VehicleDocumentContainerData;
import bn3.VehicleInsuranceModel;
import fr.t;
import java.util.Date;
import java.util.List;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\"\u0010!J!\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,¨\u0006-"}, d2 = {"Ltn3/c;", "Ltn3/e;", "Ldn3/a$a;", "Lez/a;", "currentTimeProvider", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "Lmx/c;", "labelProvider", "Ltn3/a;", "insurancePicker", "<init>", "(Lez/a;Lez/e;Lez/c;Lmx/c;Ltn3/a;)V", "Ljava/util/Date;", "date", "Lmx/a;", "f", "(Ljava/util/Date;)Lmx/a;", "insurancePeriodEnd", "Ldn3/b;", "h", "(Ljava/util/Date;)Ldn3/b;", "expireDate", "", "withUpcomingValidity", "g", "(Ljava/util/Date;Z)Lmx/a;", "Lbn3/g;", "documentData", "Lbn3/k;", "c", "(Lbn3/g;)Lbn3/k;", "d", "vehicleDocumentDataModel", "e", "(Lbn3/g;Z)Ldn3/a$a;", "a", "Lez/a;", "b", "Lez/e;", "Lez/c;", "Lmx/c;", "Ltn3/a;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class c implements e<dn3.a.Insurance> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a insurancePicker;

    public c(ez.a aVar, ez.e eVar, ez.c cVar, mx.c cVar2, a aVar2) {
        this.currentTimeProvider = aVar;
        this.dateFormatter = eVar;
        this.dateConverter = cVar;
        this.labelProvider = cVar2;
        this.insurancePicker = aVar2;
    }

    private final VehicleInsuranceModel c(VehicleDocumentContainerData documentData) {
        List<VehicleInsuranceModel> listN;
        if (documentData == null || (listN = documentData.n()) == null) {
            return null;
        }
        VehicleInsuranceModel vehicleInsuranceModelB = this.insurancePicker.b(listN);
        return vehicleInsuranceModelB == null ? this.insurancePicker.c(listN) : vehicleInsuranceModelB;
    }

    private final VehicleInsuranceModel d(VehicleDocumentContainerData documentData) {
        List<VehicleInsuranceModel> listN;
        if (documentData == null || (listN = documentData.n()) == null) {
            return null;
        }
        return this.insurancePicker.a(listN);
    }

    private final Label f(Date date) {
        if (date != null) {
            return mx.b.b(this.dateFormatter.d(new fz.b.Date(date), fz.c.DOTTED), "insuranceDateLabelTag");
        }
        return null;
    }

    private final Label g(Date expireDate, boolean withUpcomingValidity) {
        int iIntValue;
        Date dateH = this.currentTimeProvider.h();
        mx.c cVar = this.labelProvider;
        if (expireDate == null) {
            iIntValue = um3.b.Q0;
        } else if (expireDate.after(dateH) || t.c(expireDate, dateH)) {
            Integer numValueOf = Integer.valueOf(um3.b.P0);
            if (!withUpcomingValidity) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : um3.b.O0;
        } else {
            iIntValue = expireDate.before(dateH) ? um3.b.E0 : um3.b.Q0;
        }
        return cVar.c(iIntValue);
    }

    private final dn3.b h(Date insurancePeriodEnd) {
        Date dateH = this.currentTimeProvider.h();
        if (insurancePeriodEnd == null) {
            return dn3.b.UNKNOWN;
        }
        return (ez.d.c(this.dateConverter.l(insurancePeriodEnd), null, 1, null) || insurancePeriodEnd.after(dateH)) ? dn3.b.VALID : dn3.b.INVALID;
    }

    @Override // tn3.e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public dn3.a.Insurance b(VehicleDocumentContainerData vehicleDocumentDataModel, boolean withUpcomingValidity) {
        VehicleInsuranceModel vehicleInsuranceModelC;
        if (withUpcomingValidity) {
            vehicleInsuranceModelC = d(vehicleDocumentDataModel);
        } else {
            if (withUpcomingValidity) {
                throw new p();
            }
            vehicleInsuranceModelC = c(vehicleDocumentDataModel);
        }
        Label labelC = this.labelProvider.c(um3.b.f199255q0);
        Date insurancePeriodEnd = null;
        dn3.b bVarH = h(vehicleInsuranceModelC != null ? vehicleInsuranceModelC.getInsurancePeriodEnd() : null);
        Label labelG = g(vehicleInsuranceModelC != null ? vehicleInsuranceModelC.getInsuranceExpireDate() : null, withUpcomingValidity);
        Date insurancePeriodStart = vehicleInsuranceModelC != null ? vehicleInsuranceModelC.getInsurancePeriodStart() : null;
        if (!withUpcomingValidity) {
            insurancePeriodStart = null;
        }
        if (insurancePeriodStart != null) {
            insurancePeriodEnd = insurancePeriodStart;
        } else if (vehicleInsuranceModelC != null) {
            insurancePeriodEnd = vehicleInsuranceModelC.getInsurancePeriodEnd();
        }
        return new dn3.a.Insurance(labelC, bVarH, labelG, f(insurancePeriodEnd));
    }
}
