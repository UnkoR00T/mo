package vy0;

import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import kh0.BEAirQualityRateDictionary;
import kh0.l;
import mx.Label;
import mx.b;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import uy0.d;
import uy0.e;
import wy0.AirQualityRating;
import wy0.LegendEntryData;
import wy0.PmIndicatorTable;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002'%B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lvy0/a;", "Lxw/f;", "Lvy0/a$b;", "Luy0/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lwy0/b;", "legendEntryData", "", "Lkh0/a;", "rateDictionaryList", "Lwy0/d;", "l", "(Lwy0/b;Ljava/util/List;)Lwy0/d;", "rateDictionary", "", "index", "Lmx/a;", "c", "(Lkh0/a;I)Lmx/a;", "Lwy0/c;", "entryPoint", "Lwy0/a;", "e", "(Lkh0/a;ILwy0/c;)Lwy0/a;", "data", "f", "(Lwy0/b;)Lmx/a;", "Lpy0/c;", "type", "h", "(Lpy0/c;)Lmx/a;", "params", "i", "(Lvy0/a$b;)Luy0/e$a;", "a", "Lmx/c;", "b", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f208698c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: vy0.a$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lvy0/a$b;", "", "Luy0/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Luy0/d;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luy0/d;", "b", "()Luy0/d;", "Ler/a;", "()Ler/a;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Params(d dVar, er.a<i0> aVar) {
            this.state = dVar;
            this.onBack = aVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f208702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f208703b;

        static {
            int[] iArr = new int[wy0.c.values().length];
            try {
                iArr[wy0.c.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wy0.c.POINT_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f208702a = iArr;
            int[] iArr2 = new int[py0.c.values().length];
            try {
                iArr2[py0.c.PM10.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[py0.c.PM25.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f208703b = iArr2;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(BEAirQualityRateDictionary rateDictionary, int index) {
        StringBuilder sb5 = new StringBuilder();
        if (rateDictionary.getRate() == l.UNKNOWN) {
            i0 i0Var = i0.f148189a;
        } else {
            if (rateDictionary.getPm25maxValue() != null) {
                Float pm25minValue = rateDictionary.getPm25minValue();
                sb5.append(pm25minValue != null ? Integer.valueOf(hr.a.d(pm25minValue.floatValue())) : null);
                sb5.append("-");
                Float pm25maxValue = rateDictionary.getPm25maxValue();
                sb5.append(pm25maxValue != null ? Integer.valueOf(hr.a.d(pm25maxValue.floatValue())) : null);
            } else {
                sb5.append(">");
                Float pm25minValue2 = rateDictionary.getPm25minValue();
                sb5.append(pm25minValue2 != null ? Integer.valueOf(hr.a.d(pm25minValue2.floatValue())) : null);
            }
        }
        return b.b(sb5.toString(), "ratingValue_" + index);
    }

    private final AirQualityRating e(BEAirQualityRateDictionary rateDictionary, int index, wy0.c entryPoint) {
        py0.a aVarA = oy0.a.a(rateDictionary.getRate());
        int i15 = c.f208702a[entryPoint.ordinal()];
        if (i15 == 1) {
            return new AirQualityRating(py0.a.INSTANCE.a(aVarA), c(rateDictionary, index), b.d(rateDictionary.getDescription(), "descriptionValue_" + index));
        }
        if (i15 != 2) {
            throw new p();
        }
        AirQualityRating airQualityRating = new AirQualityRating(py0.a.INSTANCE.c(aVarA), c(rateDictionary, index), b.d(rateDictionary.getDescription(), "descriptionValue_" + index));
        if (t.c(rateDictionary.getRate().name(), "UNKNOWN")) {
            return null;
        }
        return airQualityRating;
    }

    private final Label f(LegendEntryData data) {
        int i15 = c.f208702a[data.getEntryPoint().ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(zx0.b.T);
        }
        if (i15 == 2) {
            return new Label(data.getDustIndicatorType().getValue(), "dustIndicatorType");
        }
        throw new p();
    }

    private final Label h(py0.c type) {
        int i15 = c.f208703b[type.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(zx0.b.f238267t);
        }
        if (i15 == 2) {
            return this.labelProvider.c(zx0.b.f238268u);
        }
        throw new p();
    }

    private final PmIndicatorTable l(LegendEntryData legendEntryData, List<BEAirQualityRateDictionary> rateDictionaryList) {
        Label label = new Label(py0.c.PM25.getValue() + " [µg/m3]", "dustIndicatorType");
        Label labelC = this.labelProvider.c(zx0.b.f238269v);
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Object obj : rateDictionaryList) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            AirQualityRating airQualityRatingE = e((BEAirQualityRateDictionary) obj, i15, legendEntryData.getEntryPoint());
            if (airQualityRatingE != null) {
                arrayList.add(airQualityRatingE);
            }
            i15 = i16;
        }
        PmIndicatorTable pmIndicatorTable = new PmIndicatorTable(label, labelC, arrayList);
        if (rateDictionaryList.isEmpty() || legendEntryData.getDustIndicatorType() != py0.c.PM25) {
            return null;
        }
        return pmIndicatorTable;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        d state = params.getState();
        if (t.c(state, d.a.f202166a)) {
            return e.a.C5259a.f202169a;
        }
        if (!(state instanceof d.Initialized)) {
            throw new p();
        }
        return new e.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), f(((d.Initialized) params.getState()).getLegendEntryData()), null, null, null, 28, null), null, null, null, null, 61, null), params.a(), l(((d.Initialized) params.getState()).getLegendEntryData(), ((d.Initialized) params.getState()).b()), h(((d.Initialized) params.getState()).getLegendEntryData().getDustIndicatorType()), this.labelProvider.c(zx0.b.M));
    }
}
