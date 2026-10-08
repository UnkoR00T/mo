package dz0;

import androidx.compose.ui.graphics.Color;
import b30.AccordionData;
import b30.AccordionElement;
import bz0.PointInfoData;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh0.BEBasicMeasurementPoint;
import kh0.BEExtendedMeasurementPoint;
import kh0.BEExtendedQuality;
import kh0.BEPlace;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.j0;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00020.B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0019\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J+\u0010)\u001a\u0004\u0018\u00010(2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Ldz0/h;", "Lxw/f;", "Ldz0/h$b;", "Laz0/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "", "Lkh0/c;", "closePoints", "Lkotlin/Function1;", "", "Loq/i0;", "onClosePointClick", "Ln50/g;", "q", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "Lkh0/j;", "place", "m", "(Lkh0/j;)Ljava/lang/String;", "onClick", "z", "(Lkh0/c;Lmx/c;Ler/l;)Ln50/g;", "Lkh0/e;", "extendedMeasurementPoint", "Lpy0/c;", "onMeasurementDetailsCardClick", "Ln30/b;", "r", "(Lkh0/e;Ler/l;)Ln30/b;", "Lkh0/f;", "extendedQuality", "v", "(Lkh0/f;)Ln30/b;", "Ljava/time/OffsetDateTime;", "offsetDateTime", "Lmx/a;", "x", "(Ljava/time/OffsetDateTime;Lez/e;Lmx/c;)Lmx/a;", "params", "i", "(Ldz0/h$b;)Laz0/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, az0.c.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45599d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: dz0.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010$R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, d2 = {"Ldz0/h$b;", "", "Laz0/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onDeleteFromFavourite", "onAddToFavourite", "Lkotlin/Function1;", "", "onGoToClosePoint", "Lpy0/c;", "onMeasurementDetailsCardClick", "<init>", "(Laz0/b;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Laz0/b;", "f", "()Laz0/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "Ler/l;", "()Ler/l;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final az0.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteFromFavourite;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddToFavourite;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onGoToClosePoint;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<py0.c, i0> onMeasurementDetailsCardClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(az0.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar, l<? super py0.c, i0> lVar2) {
            this.state = bVar;
            this.onBack = aVar;
            this.onDeleteFromFavourite = aVar2;
            this.onAddToFavourite = aVar3;
            this.onGoToClosePoint = lVar;
            this.onMeasurementDetailsCardClick = lVar2;
        }

        public final er.a<i0> a() {
            return this.onAddToFavourite;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final er.a<i0> c() {
            return this.onDeleteFromFavourite;
        }

        public final l<String, i0> d() {
            return this.onGoToClosePoint;
        }

        public final l<py0.c, i0> e() {
            return this.onMeasurementDetailsCardClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onDeleteFromFavourite, params.onDeleteFromFavourite) && t.c(this.onAddToFavourite, params.onAddToFavourite) && t.c(this.onGoToClosePoint, params.onGoToClosePoint) && t.c(this.onMeasurementDetailsCardClick, params.onMeasurementDetailsCardClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final az0.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onDeleteFromFavourite.hashCode()) * 31) + this.onAddToFavourite.hashCode()) * 31) + this.onGoToClosePoint.hashCode()) * 31) + this.onMeasurementDetailsCardClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onDeleteFromFavourite=" + this.onDeleteFromFavourite + ", onAddToFavourite=" + this.onAddToFavourite + ", onGoToClosePoint=" + this.onGoToClosePoint + ", onMeasurementDetailsCardClick=" + this.onMeasurementDetailsCardClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f45608a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(291805265);
            if (p076m2.t.k()) {
                p076m2.t.o(291805265, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.pointdetails.mapper.PointDetailsScreenMapper.invoke.<anonymous> (PointDetailsScreenMapper.kt:118)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f45609a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1356675717);
            if (p076m2.t.k()) {
                p076m2.t.o(1356675717, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.pointdetails.mapper.PointDetailsScreenMapper.invoke.<anonymous> (PointDetailsScreenMapper.kt:128)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f45610a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1421811996);
            if (p076m2.t.k()) {
                p076m2.t.o(1421811996, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.pointdetails.mapper.PointDetailsScreenMapper.toBasicItemModelIcon.<anonymous> (PointDetailsScreenMapper.kt:195)");
            }
            long jK = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().k();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jK;
        }
    }

    public h(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(l lVar, BEBasicMeasurementPoint bEBasicMeasurementPoint) {
        lVar.b(bEBasicMeasurementPoint.getId());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, String str) {
        params.d().b(str);
        return i0.f148189a;
    }

    private final String m(BEPlace place) {
        StringBuilder sb5 = new StringBuilder();
        String street = place.getStreet();
        if (street != null && street.length() != 0) {
            sb5.append(place.getStreet());
            sb5.append(",");
            sb5.append(" ");
        }
        sb5.append(place.getCity());
        return sb5.toString();
    }

    private final List<DefaultSingleCardData> q(List<BEBasicMeasurementPoint> closePoints, l<? super String, i0> onClosePointClick) {
        List<BEBasicMeasurementPoint> list = closePoints;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(z((BEBasicMeasurementPoint) it.next(), this.labelProvider, onClosePointClick));
        }
        return arrayList;
    }

    private final CardListData r(BEExtendedMeasurementPoint extendedMeasurementPoint, final l<? super py0.c, i0> onMeasurementDetailsCardClick) {
        StringBuilder sb5 = new StringBuilder();
        Float pm25value = extendedMeasurementPoint.getQuality().getPm25value();
        if (pm25value != null) {
            sb5.append(pm25value.floatValue());
            sb5.append(" ");
            sb5.append("µg/m3");
        } else {
            sb5.append("--");
        }
        Label labelD = mx.b.d(sb5.toString(), "pm25Value");
        StringBuilder sb6 = new StringBuilder();
        Float pm10value = extendedMeasurementPoint.getQuality().getPm10value();
        if (pm10value != null) {
            sb6.append(pm10value.floatValue());
            sb6.append(" ");
            sb6.append("µg/m3");
        } else {
            sb6.append("--");
        }
        Label labelD2 = mx.b.d(sb6.toString(), "pm10Value");
        j0.a aVar = j0.a.f132074a;
        BodySection bodySection = new BodySection(new SingleCardLabel(new Label(py0.c.PM25.getValue(), "pm25Label"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(labelD, null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.a.b bVar = k30.a.b.f107765a;
        k30.d.a aVar2 = k30.d.a.f107773a;
        return new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(zx0.b.V), null, 2, null), aVar2, null, new er.a() { // from class: dz0.d
            @Override // er.a
            public final Object a() {
                return h.s(onMeasurementDetailsCardClick);
            }
        }, 35, null)), null, 2815, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(new Label(py0.c.PM10.getValue(), "pm10Label"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(labelD2, null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(zx0.b.V), null, 2, null), aVar2, null, new er.a() { // from class: dz0.e
            @Override // er.a
            public final Object a() {
                return h.u(onMeasurementDetailsCardClick);
            }
        }, 35, null)), null, 2815, null)), aVar, false, null, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(l lVar) {
        lVar.b(py0.c.PM25);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(l lVar) {
        lVar.b(py0.c.PM10);
        return i0.f148189a;
    }

    private final CardListData v(BEExtendedQuality extendedQuality) {
        StringBuilder sb5 = new StringBuilder();
        Float temperature = extendedQuality.getTemperature();
        if (temperature != null) {
            sb5.append(hr.a.d(temperature.floatValue()));
            sb5.append("°");
        }
        Label labelD = mx.b.d(sb5.toString(), "temperatureValue");
        StringBuilder sb6 = new StringBuilder();
        Float humidity = extendedQuality.getHumidity();
        if (humidity != null) {
            sb6.append(hr.a.d(humidity.floatValue()));
            sb6.append("%");
        }
        Label labelD2 = mx.b.d(sb6.toString(), "humidityValue");
        StringBuilder sb7 = new StringBuilder();
        Float pressure = extendedQuality.getPressure();
        if (pressure != null) {
            sb7.append(hr.a.d(pressure.floatValue()));
            sb7.append(" ");
            sb7.append("hPa");
        }
        return new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(zx0.b.N), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(labelD, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(zx0.b.f238259l), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(labelD2, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(zx0.b.A), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(sb7.toString(), "pressureValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
    }

    private final Label x(OffsetDateTime offsetDateTime, ez.e dateFormatter, mx.c labelProvider) {
        if (offsetDateTime == null) {
            return null;
        }
        return labelProvider.e(zx0.b.f238261n, dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTime), fz.c.DOTTED_PLUS_HOUR));
    }

    private final DefaultSingleCardData z(final BEBasicMeasurementPoint bEBasicMeasurementPoint, mx.c cVar, final l<? super String, i0> lVar) {
        py0.a aVarA = oy0.a.a(bEBasicMeasurementPoint.getQuality());
        Label label = new Label(bEBasicMeasurementPoint.getPlace().getName() + "\n" + m(bEBasicMeasurementPoint.getPlace()), "placeValue");
        x0.Icon iconB = x0.Icon.INSTANCE.b();
        py0.a aVar = py0.a.UNKNOWN;
        return new DefaultSingleCardData(null, new er.a() { // from class: dz0.f
            @Override // er.a
            public final Object a() {
                return h.E(lVar, bEBasicMeasurementPoint);
            }
        }, aVarA != aVar, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(cVar.c(aVarA.getQualityResId()), null, null, 0, 0, null, 62, null)), new SingleCardLabel(label, null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(true, null, new i.Icon(aVarA.getIconResId(), null, aVarA != aVar ? aVarA.e() : e.f45610a, null, null, 26, null), 2, null), iconB, null, 2297, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public az0.c.a b(Params params) {
        final Params params2;
        List<DefaultSingleCardData> listN;
        az0.b state = params.getState();
        if (t.c(state, az0.b.a.f15275a)) {
            return az0.c.a.C0359a.f15278a;
        }
        if (!(state instanceof az0.b.Initialized)) {
            throw new oq.p();
        }
        Label labelX = x(((az0.b.Initialized) params.getState()).getPoint().getTimestamp(), this.dateFormatter, this.labelProvider);
        py0.a aVarA = oy0.a.a(((az0.b.Initialized) params.getState()).getPoint().getQuality().getRate());
        Label labelC = this.labelProvider.c(aVarA.getQualityResId());
        Label label = new Label(m(((az0.b.Initialized) params.getState()).getPoint().getPlace()), "addressValue");
        Label label2 = new Label(((az0.b.Initialized) params.getState()).getPoint().getPlace().getName(), "placeValue");
        if (((az0.b.Initialized) params.getState()).getEntryPoint() == ez0.a.POINT_DETAILS || ((az0.b.Initialized) params.getState()).getPoint().a().isEmpty()) {
            params2 = params;
            listN = v.n();
        } else {
            params2 = params;
            listN = q(((az0.b.Initialized) params.getState()).getPoint().a(), new l() { // from class: dz0.g
                @Override // er.l
                public final Object b(Object obj) {
                    return h.l(params2, (String) obj);
                }
            });
        }
        List<DefaultSingleCardData> list = listN;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params2.b()), this.labelProvider.c(zx0.b.f238266s), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarB = params2.b();
        PointInfoData pointInfoData = new PointInfoData(new d40.b.C0864b(null, aVarA.getIconResId(), d40.i.C0865i.f39712e, aVarA.e(), new Label("", "iconContentDescription"), null, 33, null), labelC, label, label2);
        Label labelC2 = this.labelProvider.c(zx0.b.f238262o);
        CardListData cardListDataR = r(((az0.b.Initialized) params.getState()).getPoint(), params.e());
        Label labelC3 = this.labelProvider.c(zx0.b.f238244c);
        boolean isFavourite = ((az0.b.Initialized) params.getState()).getPoint().getIsFavourite();
        LeadingSection leadingSection = new LeadingSection(false, null, new i.Icon(jz.a.f106727a, null, c.f45608a, null, null, 26, null), 3, null);
        return new az0.c.a.Initialized(baseScaffoldData, aVarB, labelX, pointInfoData, labelC2, cardListDataR, new AccordionData(v.e(new AccordionElement(null, this.labelProvider.c(zx0.b.f238242b), null, false, null, false, new cz0.b(v(((az0.b.Initialized) params.getState()).getPoint().getQuality())), 29, null))), labelC3, list, isFavourite, new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(zx0.b.f238265r), null, d.f45609a, 0, 0, null, 58, null)), null, 5, null), leadingSection, null, null, 3325, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(zx0.b.P), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null));
    }
}
