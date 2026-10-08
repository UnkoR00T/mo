package ii1;

import cb4.DialogData;
import er.p;
import fr.t;
import iq0.TemporaryInterruption;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lii1/h;", "Lxw/f;", "Lii1/h$a;", "Lhi1/g$b;", "Liq0/g0;", "temporaryInterruption", "Lcb4/d;", "A", "(Liq0/g0;)Lcb4/d;", "a", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends xw.f<ServiceListParams, hi1.g.b> {

    /* JADX INFO: renamed from: ii1.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001e\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b\u001a\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lii1/h$a;", "", "Lhi1/f;", "state", "Lkotlin/Function2;", "Lgx/b;", "Lrq0/c;", "Loq/i0;", "onServiceClick", "Lkotlin/Function0;", "onRefreshServicesButtonClick", "onEditButtonClick", "onAirQualityWidgetClick", "toPayments", "<init>", "(Lhi1/f;Ler/p;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi1/f;", "e", "()Lhi1/f;", "b", "Ler/p;", "d", "()Ler/p;", "c", "Ler/a;", "()Ler/a;", "f", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ServiceListParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hi1.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<gx.b, rq0.c, i0> onServiceClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRefreshServicesButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEditButtonClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAirQualityWidgetClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toPayments;

        /* JADX WARN: Multi-variable type inference failed */
        public ServiceListParams(hi1.f fVar, p<? super gx.b, ? super rq0.c, i0> pVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = fVar;
            this.onServiceClick = pVar;
            this.onRefreshServicesButtonClick = aVar;
            this.onEditButtonClick = aVar2;
            this.onAirQualityWidgetClick = aVar3;
            this.toPayments = aVar4;
        }

        public final er.a<i0> a() {
            return this.onAirQualityWidgetClick;
        }

        public final er.a<i0> b() {
            return this.onEditButtonClick;
        }

        public final er.a<i0> c() {
            return this.onRefreshServicesButtonClick;
        }

        public final p<gx.b, rq0.c, i0> d() {
            return this.onServiceClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final hi1.f getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceListParams)) {
                return false;
            }
            ServiceListParams serviceListParams = (ServiceListParams) other;
            return t.c(this.state, serviceListParams.state) && t.c(this.onServiceClick, serviceListParams.onServiceClick) && t.c(this.onRefreshServicesButtonClick, serviceListParams.onRefreshServicesButtonClick) && t.c(this.onEditButtonClick, serviceListParams.onEditButtonClick) && t.c(this.onAirQualityWidgetClick, serviceListParams.onAirQualityWidgetClick) && t.c(this.toPayments, serviceListParams.toPayments);
        }

        public final er.a<i0> f() {
            return this.toPayments;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onServiceClick.hashCode()) * 31) + this.onRefreshServicesButtonClick.hashCode()) * 31) + this.onEditButtonClick.hashCode()) * 31) + this.onAirQualityWidgetClick.hashCode()) * 31) + this.toPayments.hashCode();
        }

        public String toString() {
            return "ServiceListParams(state=" + this.state + ", onServiceClick=" + this.onServiceClick + ", onRefreshServicesButtonClick=" + this.onRefreshServicesButtonClick + ", onEditButtonClick=" + this.onEditButtonClick + ", onAirQualityWidgetClick=" + this.onAirQualityWidgetClick + ", toPayments=" + this.toPayments + ')';
        }
    }

    DialogData A(TemporaryInterruption temporaryInterruption);
}
