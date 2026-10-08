package tx2;

import al0.BECorrespondenceAddressData;
import al0.DMSTerytDetail;
import fr.t;
import fu.r;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import p071kotlin.Metadata;
import pq.v;
import ux2.Section;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltx2/g;", "Lxw/f;", "Ltx2/g$a;", "Lux2/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Ltx2/g$a;)Lux2/a;", "a", "Lmx/c;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: tx2.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltx2/g$a;", "", "Lal0/k;", "data", "<init>", "(Lal0/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/k;", "()Lal0/k;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BECorrespondenceAddressData data;

        public Params(BECorrespondenceAddressData bECorrespondenceAddressData) {
            this.data = bECorrespondenceAddressData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BECorrespondenceAddressData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.data, ((Params) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ')';
        }
    }

    public g(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Section b(Params params) {
        DefaultSingleCardData defaultSingleCardData;
        DefaultSingleCardData defaultSingleCardData2;
        DefaultSingleCardData defaultSingleCardData3;
        BECorrespondenceAddressData data = params.getData();
        Label labelC = this.labelProvider.c(gv2.a.K2);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.W), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getProvince().getName(), "province"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77302r), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getCounty().getName(), "county"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData6 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77290o), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getCommunity().getName(), "community"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData7 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77282m), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getCity().getName(), "city"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData8 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.V), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getPostalCode(), "postalCode"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DMSTerytDetail street = data.getStreet();
        if (street != null) {
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77261h0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(street.getName(), "street"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        } else {
            defaultSingleCardData = null;
        }
        DefaultSingleCardData defaultSingleCardData9 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77250f), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(data.getBuildingNumber(), "buildingNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        String apartmentNumber = data.getApartmentNumber();
        if (r.t0(apartmentNumber)) {
            apartmentNumber = null;
        }
        if (apartmentNumber != null) {
            defaultSingleCardData3 = defaultSingleCardData9;
            defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gv2.a.f77230b), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(apartmentNumber, "apartmentNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        } else {
            defaultSingleCardData2 = null;
            defaultSingleCardData3 = defaultSingleCardData9;
        }
        return new Section(labelC, new CardListData(v.s(defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData6, defaultSingleCardData7, defaultSingleCardData8, defaultSingleCardData, defaultSingleCardData3, defaultSingleCardData2), null, false, null, null, 30, null));
    }
}
