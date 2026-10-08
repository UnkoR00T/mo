package ue3;

import fr.t;
import fu.r;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import sv0.DrivingLicence;
import sv0.l;
import te3.State;
import te3.c;
import x50.NavigationButtonData;
import x50.i;
import xw.PhoneNumber;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lue3/a;", "Lxw/f;", "Lue3/a$a;", "Lte3/c$a;", "Lmx/c;", "labelProvider", "Ldz/c;", "postCodeFormatter", "<init>", "(Lmx/c;Ldz/c;)V", "params", "c", "(Lue3/a$a;)Lte3/c$a;", "a", "Lmx/c;", "b", "Ldz/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dz.c postCodeFormatter;

    /* JADX INFO: renamed from: ue3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lue3/a$a;", "", "Lte3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "<init>", "(Lte3/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lte3/b;", "b", "()Lte3/b;", "Ler/a;", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.onClose = aVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f198050a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.VICTIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.PERPETRATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f198050a = iArr;
        }
    }

    public a(mx.c cVar, dz.c cVar2) {
        this.labelProvider = cVar;
        this.postCodeFormatter = cVar2;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.Data b(Params params) {
        int i15;
        List listE;
        mx.c cVar = this.labelProvider;
        State state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), cVar.c(md3.b.S4), null, null, null, 28, null), null, null, null, null, 61, null);
        int i16 = b.f198050a[state.getPersonalDetailsData().getCollisionRole().ordinal()];
        if (i16 == 1) {
            i15 = md3.b.T4;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            i15 = md3.b.R4;
        }
        Label labelC = cVar.c(i15);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.Q4), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getPersonalDetailsData().getPersonalData().a()), "formattedNames"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.N), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getPersonalDetailsData().getPersonalData().getPesel()), "pesel"), null, null, 0, 0, j70.a.LETTER_BY_LETTER, 30, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.f125827t), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getPersonalDetailsData().getPersonalData().getEmail()), "email"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(cVar.c(md3.b.O), null, null, 0, 0, null, 62, null);
        PhoneNumber phoneNumber = state.getPersonalDetailsData().getPersonalData().getPhoneNumber();
        CardListData cardListData = new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(phoneNumber.h()), "").o(Label.INSTANCE.d()).o(mx.b.b(v.v0(r.z1(c0.e(phoneNumber.g()), 3), " ", null, null, 0, null, null, 62, null), "phoneNumber")), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
        Label labelC2 = cVar.c(md3.b.f125755k);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.W3), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getPersonalDetailsData().getPersonalData().getCity()), "city"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.Z3), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(this.postCodeFormatter.a(c0.e(state.getPersonalDetailsData().getPersonalData().getPostCode())), "postCode"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData6 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.f125680a4), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getPersonalDetailsData().getPersonalData().getStreet()), "street"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData7 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.V3), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getPersonalDetailsData().getPersonalData().getHouseNumber()), "houseNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(cVar.c(md3.b.O4), null, null, 0, 0, null, 62, null);
        b0 apartmentNumber = state.getPersonalDetailsData().getPersonalData().getApartmentNumber();
        CardListData cardListData2 = new CardListData(v.q(defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData6, defaultSingleCardData7, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d(apartmentNumber != null ? c0.e(apartmentNumber) : null, "apartmentNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
        Label labelC3 = cVar.c(md3.b.f125862x2);
        if (state.getPersonalDetailsData().getPersonalData().d().isEmpty()) {
            listE = v.e(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.StatusBadge(new r50.a.WithIcon("lack_of_driving_authorization", cVar.c(md3.b.G), null, 0, false, g.NEGATIVE, 12, null)), null, 5, null), null, null, null, 3839, null));
        } else {
            List<DrivingLicence> listD = state.getPersonalDetailsData().getPersonalData().d();
            ArrayList arrayList = new ArrayList(v.y(listD, 10));
            Iterator it = listD.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    v.x();
                }
                arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(cVar.e(md3.b.P4, mx.b.d(((DrivingLicence) next).getCategory(), "category_" + i17).getText()), null, null, 0, 0, null, 62, null)), null, 5, null), null, null, null, 3839, null));
                it = it;
                i17 = i18;
            }
            listE = arrayList;
        }
        return new c.Data(baseScaffoldData, labelC, cardListData, labelC2, cardListData2, labelC3, new CardListData(listE, null, false, null, null, 30, null));
    }
}
