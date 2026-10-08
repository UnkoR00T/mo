package ii1;

import ay0.WidgetLocation;
import er.p;
import fr.t;
import fu.r;
import java.time.OffsetDateTime;
import m50.ServiceWidgetData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import y2.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001)B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JW\u0010$\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u0004\u0018\u00010\u00032\u0006\u0010&\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lii1/d;", "Lxw/f;", "Lii1/d$a;", "Lm50/a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Ljava/time/OffsetDateTime;", "date", "Lmx/a;", "l", "(Ljava/time/OffsetDateTime;)Lmx/a;", "", "i", "(Ljava/time/OffsetDateTime;)Ljava/lang/String;", "Lay0/d;", "address", "h", "(Lay0/d;)Lmx/a;", "", "position", "Lkotlin/Function0;", "Loq/i0;", "onAirQualityWidgetClick", "Lli1/a$a;", "largeSlotData", "Lli1/a$b;", "smallSlotData", "smallLabel", "largeContentDesc", "smallContentDesc", "", "enabled", "r", "(ILer/a;Lli1/a$a;Lli1/a$b;Lmx/a;Lmx/a;Lmx/a;Z)Lm50/a;", "params", "m", "(Lii1/d$a;)Lm50/a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lez/e;", "getDateFormatter", "()Lez/e;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, ServiceWidgetData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: ii1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lii1/d$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lay0/c;", "widgetResponse", "", "position", "", "isLoading", "<init>", "(Ler/a;Lay0/c;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Lay0/c;", "c", "()Lay0/c;", "I", "d", "Z", "()Z", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClick;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ay0.c widgetResponse;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int position;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        public Params(er.a<i0> aVar, ay0.c cVar, int i15, boolean z15) {
            this.onClick = aVar;
            this.widgetResponse = cVar;
            this.position = i15;
            this.isLoading = z15;
        }

        public final er.a<i0> a() {
            return this.onClick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ay0.c getWidgetResponse() {
            return this.widgetResponse;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.onClick, params.onClick) && t.c(this.widgetResponse, params.widgetResponse) && this.position == params.position && this.isLoading == params.isLoading;
        }

        public int hashCode() {
            int iHashCode = this.onClick.hashCode() * 31;
            ay0.c cVar = this.widgetResponse;
            return ((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Integer.hashCode(this.position)) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "Params(onClick=" + this.onClick + ", widgetResponse=" + this.widgetResponse + ", position=" + this.position + ", isLoading=" + this.isLoading + ')';
        }
    }

    public d(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label h(WidgetLocation address) {
        String city;
        Label labelB;
        String street = address.getStreet();
        if (street == null || r.t0(street) || r.t0(address.getCity())) {
            String street2 = address.getStreet();
            city = (street2 == null || r.t0(street2)) ? address.getCity() : address.getStreet();
        } else {
            city = address.getStreet() + ", " + address.getCity();
        }
        return (city == null || (labelB = mx.b.b(city, "widgetAddress")) == null) ? Label.INSTANCE.c() : labelB;
    }

    private final String i(OffsetDateTime date) {
        return this.dateFormatter.d(new fz.b.OffsetDateTime(date), fz.c.ONLY_HOUR);
    }

    private final Label l(OffsetDateTime date) {
        Label labelE;
        return (date == null || (labelE = this.labelProvider.e(sg1.a.f181487k, i(date))) == null) ? Label.INSTANCE.c() : labelE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        return i0.f148189a;
    }

    private final ServiceWidgetData r(int position, er.a<i0> onAirQualityWidgetClick, final li1.a.InterfaceC2872a largeSlotData, final li1.a.b smallSlotData, Label smallLabel, Label largeContentDesc, Label smallContentDesc, boolean enabled) {
        return new ServiceWidgetData("airQualityWidget", position, jz.a.G3, smallLabel, m.b(-751494562, true, new p() { // from class: ii1.b
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return d.u(smallSlotData, (p076m2.r) obj, ((Integer) obj2).intValue());
            }
        }), m.b(-1145898401, true, new p() { // from class: ii1.c
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return d.v(largeSlotData, (p076m2.r) obj, ((Integer) obj2).intValue());
            }
        }), onAirQualityWidgetClick, smallContentDesc, largeContentDesc, enabled);
    }

    static /* synthetic */ ServiceWidgetData s(d dVar, int i15, er.a aVar, li1.a.InterfaceC2872a interfaceC2872a, li1.a.b bVar, Label label, Label label2, Label label3, boolean z15, int i16, Object obj) {
        return dVar.r(i15, aVar, interfaceC2872a, bVar, label, label2, label3, (i16 & 128) != 0 ? true : z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(li1.a.b bVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-751494562, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.mapper.AirQualityWidgetMapper.provideServiceWidgetData.<anonymous> (AirQualityWidgetMapper.kt:188)");
            }
            ki1.i.c(bVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(li1.a.InterfaceC2872a interfaceC2872a, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1145898401, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.services.list.mapper.AirQualityWidgetMapper.provideServiceWidgetData.<anonymous> (AirQualityWidgetMapper.kt:193)");
            }
            ki1.i.c(interfaceC2872a, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ServiceWidgetData b(Params params) {
        String strI;
        String strI2;
        if (params.getIsLoading()) {
            li1.a.InterfaceC2872a.Loader loader = new li1.a.InterfaceC2872a.Loader(this.labelProvider.c(sg1.a.f181529x));
            Label labelC = Label.INSTANCE.c();
            li1.a.b.Loader loader2 = new li1.a.b.Loader(this.labelProvider.c(sg1.a.f181529x));
            return r(params.getPosition(), new er.a() { // from class: ii1.a
                @Override // er.a
                public final Object a() {
                    return d.q();
                }
            }, loader, loader2, labelC, this.labelProvider.c(sg1.a.f181463e), this.labelProvider.c(sg1.a.f181463e), false);
        }
        ay0.c widgetResponse = params.getWidgetResponse();
        if (t.c(widgetResponse, ay0.c.a.f15208a)) {
            er.a<i0> aVarA = params.a();
            li1.a.InterfaceC2872a.Placeholder placeholder = new li1.a.InterfaceC2872a.Placeholder(this.labelProvider.c(sg1.a.f181483j), this.labelProvider.c(sg1.a.f181479i));
            Label labelC2 = Label.INSTANCE.c();
            return s(this, params.getPosition(), aVarA, placeholder, new li1.a.b.Placeholder(this.labelProvider.c(sg1.a.f181483j)), labelC2, this.labelProvider.c(sg1.a.f181451b), this.labelProvider.c(sg1.a.f181467f), false, 128, null);
        }
        if (t.c(widgetResponse, ay0.c.b.f15209a)) {
            er.a<i0> aVarA2 = params.a();
            li1.a.InterfaceC2872a.Placeholder placeholder2 = new li1.a.InterfaceC2872a.Placeholder(this.labelProvider.c(sg1.a.B), this.labelProvider.c(sg1.a.f181514s));
            Label labelC3 = Label.INSTANCE.c();
            return s(this, params.getPosition(), aVarA2, placeholder2, new li1.a.b.Placeholder(this.labelProvider.c(sg1.a.B)), labelC3, this.labelProvider.c(sg1.a.f181447a), this.labelProvider.c(sg1.a.f181447a), false, 128, null);
        }
        if (!(widgetResponse instanceof ay0.c.WidgetPoint)) {
            if (t.c(widgetResponse, ay0.c.C0353c.f15210a) || t.c(widgetResponse, ay0.c.d.f15211a) || widgetResponse == null) {
                return null;
            }
            throw new oq.p();
        }
        if (((ay0.c.WidgetPoint) params.getWidgetResponse()).getWidgetPoint().getQualityRate() == ay0.e.UNKNOWN) {
            er.a<i0> aVarA3 = params.a();
            li1.a.InterfaceC2872a.Placeholder placeholder3 = new li1.a.InterfaceC2872a.Placeholder(this.labelProvider.c(sg1.a.f181517t), h(((ay0.c.WidgetPoint) params.getWidgetResponse()).getWidgetPoint().getLocation()));
            Label labelC4 = Label.INSTANCE.c();
            return s(this, params.getPosition(), aVarA3, placeholder3, new li1.a.b.Placeholder(this.labelProvider.c(sg1.a.f181517t)), labelC4, this.labelProvider.e(sg1.a.f181459d, h(((ay0.c.WidgetPoint) params.getWidgetResponse()).getWidgetPoint().getLocation()).getText()), this.labelProvider.c(sg1.a.f181475h), false, 128, null);
        }
        ji1.a aVarA4 = ji1.b.a(((ay0.c.WidgetPoint) params.getWidgetResponse()).getWidgetPoint().getQualityRate());
        Label labelL = l(((ay0.c.WidgetPoint) params.getWidgetResponse()).getWidgetPoint().getTimestamp());
        er.a<i0> aVarA5 = params.a();
        li1.a.InterfaceC2872a.WidgetPoint widgetPoint = new li1.a.InterfaceC2872a.WidgetPoint(this.labelProvider.c(aVarA4.getQualityResId()), aVarA4.e(), h(((ay0.c.WidgetPoint) params.getWidgetResponse()).getWidgetPoint().getLocation()), labelL, aVarA4.getProgressValue());
        li1.a.b.WidgetPoint widgetPoint2 = new li1.a.b.WidgetPoint(this.labelProvider.c(aVarA4.getQualityResId()), aVarA4.e(), aVarA4.getProgressValue());
        int position = params.getPosition();
        mx.c cVar = this.labelProvider;
        int i15 = sg1.a.f181471g;
        String text = cVar.c(aVarA4.getQualityResId()).getText();
        OffsetDateTime timestamp = ((ay0.c.WidgetPoint) params.getWidgetResponse()).getWidgetPoint().getTimestamp();
        String str = "";
        if (timestamp == null || (strI = i(timestamp)) == null) {
            strI = "";
        }
        Label labelE = cVar.e(i15, text, strI);
        mx.c cVar2 = this.labelProvider;
        int i16 = sg1.a.f181455c;
        String text2 = cVar2.c(aVarA4.getQualityResId()).getText();
        OffsetDateTime timestamp2 = ((ay0.c.WidgetPoint) params.getWidgetResponse()).getWidgetPoint().getTimestamp();
        if (timestamp2 != null && (strI2 = i(timestamp2)) != null) {
            str = strI2;
        }
        return s(this, position, aVarA5, widgetPoint, widgetPoint2, labelL, cVar2.e(i16, text2, str, h(((ay0.c.WidgetPoint) params.getWidgetResponse()).getWidgetPoint().getLocation()).getText()), labelE, false, 128, null);
    }
}
