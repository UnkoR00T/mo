package n12;

import eo0.DeliveryMessageDetails;
import fo0.DeliveryMessageAddress;
import fr.t;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.time.OffsetDateTime;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import q12.MessageInitializedViewState;
import q12.MessageSectionData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ln12/q;", "Lxw/f;", "Ln12/q$a;", "Lm12/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Ln12/h;", "edorMessageButtonsMapper", "<init>", "(Lmx/c;Lez/e;Ln12/h;)V", "params", "Lq12/a;", "s", "(Ln12/q$a;)Lq12/a;", "Lq12/b;", "x", "(Ln12/q$a;)Lq12/b;", "Lfo0/c;", "response", "Loq/r;", "Lmx/a;", "l", "(Lfo0/c;)Loq/r;", "q", "m", "Ljava/time/OffsetDateTime;", "date", "", "i", "(Ljava/time/OffsetDateTime;)Ljava/lang/String;", "E", "(Ln12/q$a;)Lm12/e$a;", "a", "Lmx/c;", "b", "Lez/e;", "getDateFormatter", "()Lez/e;", "c", "Ln12/h;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements xw.f<Params, m12.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h edorMessageButtonsMapper;

    /* JADX INFO: renamed from: n12.q$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006\""}, d2 = {"Ln12/q$a;", "", "Lm12/d$b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "goToPermissionsSettingsAction", "Lkotlin/Function1;", "Leo0/m;", "showTechnicalDetailsAction", "<init>", "(Lm12/d$b;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm12/d$b;", "c", "()Lm12/d$b;", "b", "Ler/a;", "()Ler/a;", "getGoToPermissionsSettingsAction", "d", "Ler/l;", "()Ler/l;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m12.d.InitializedStub state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToPermissionsSettingsAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<DeliveryMessageDetails, i0> showTechnicalDetailsAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(m12.d.InitializedStub initializedStub, er.a<i0> aVar, er.a<i0> aVar2, er.l<? super DeliveryMessageDetails, i0> lVar) {
            this.state = initializedStub;
            this.onBackClick = aVar;
            this.goToPermissionsSettingsAction = aVar2;
            this.showTechnicalDetailsAction = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.l<DeliveryMessageDetails, i0> b() {
            return this.showTechnicalDetailsAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final m12.d.InitializedStub getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.goToPermissionsSettingsAction, params.goToPermissionsSettingsAction) && t.c(this.showTechnicalDetailsAction, params.showTechnicalDetailsAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.goToPermissionsSettingsAction.hashCode()) * 31) + this.showTechnicalDetailsAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", goToPermissionsSettingsAction=" + this.goToPermissionsSettingsAction + ", showTechnicalDetailsAction=" + this.showTechnicalDetailsAction + ')';
        }
    }

    public q(mx.c cVar, ez.e eVar, h hVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.edorMessageButtonsMapper = hVar;
    }

    private final String i(OffsetDateTime date) {
        return this.dateFormatter.d(new fz.b.OffsetDateTime(date), fz.c.FULL_MONTH_DATE_TIME_COMMA);
    }

    private final r<Label, Label> l(fo0.c response) {
        OffsetDateTime receiptDate;
        if (!response.t() || (receiptDate = response.getReceiptDate()) == null) {
            return null;
        }
        return y.a(this.labelProvider.c(e02.a.R2), Label.INSTANCE.d().o(mx.b.b(i(receiptDate), "date")));
    }

    private final r<Label, Label> m(fo0.c response) {
        DeliveryMessageAddress from;
        String name;
        if (response.u() || (from = response.getFrom()) == null || (name = from.getName()) == null) {
            return null;
        }
        return y.a(this.labelProvider.c(e02.a.N), mx.b.b(name, "fromName"));
    }

    private final r<Label, Label> q(fo0.c response) {
        List<DeliveryMessageAddress> listP;
        if (response.t() || (listP = response.p()) == null) {
            return null;
        }
        return y.a(this.labelProvider.c(e02.a.f46647z0), mx.b.b(v.v0(listP, ", ", null, null, 0, null, new er.l() { // from class: n12.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.r((DeliveryMessageAddress) obj);
            }
        }, 30, null), "toName"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence r(DeliveryMessageAddress deliveryMessageAddress) {
        return deliveryMessageAddress.getName();
    }

    private final MessageInitializedViewState s(Params params) {
        return new MessageInitializedViewState(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(e02.a.V2), null, null, null, 28, null), null, null, null, null, 61, null), x(params), this.edorMessageButtonsMapper.b(new h.Params(new er.a() { // from class: n12.o
            @Override // er.a
            public final Object a() {
                return q.u();
            }
        }, new er.a() { // from class: n12.p
            @Override // er.a
            public final Object a() {
                return q.v();
            }
        }, params.getState().getMessageDetailsPayload().getMessage())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v() {
        return i0.f148189a;
    }

    private final MessageSectionData x(final Params params) {
        Label labelC;
        List listS = v.s(m(params.getState().getMessageDetailsPayload().getMessage()), q(params.getState().getMessageDetailsPayload().getMessage()), y.a(this.labelProvider.c(e02.a.X2).o(Label.INSTANCE.d()), this.labelProvider.c(e02.a.f46651z4)), l(params.getState().getMessageDetailsPayload().getMessage()));
        String subject = params.getState().getMessageDetailsPayload().getMessage().getSubject();
        if (subject == null || (labelC = mx.b.b(subject, "title")) == null) {
            labelC = this.labelProvider.c(e02.a.f46584o3);
        }
        return new MessageSectionData(labelC, listS, null, new ButtonTextData(null, this.labelProvider.c(e02.a.P2), null, null, new er.a() { // from class: n12.m
            @Override // er.a
            public final Object a() {
                return q.z(params);
            }
        }, 13, null), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params) {
        params.b().b(new DeliveryMessageDetails(params.getState().getMessageDetailsPayload().getMessage(), null, v.n(), v.n(), false));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public m12.e.a b(Params params) {
        return new m12.e.a.Message(new c30.b.c("stubAlertInfo", null, null, params.getState().getAlertMessage(), null, null, null, 118, null), s(params), Label.INSTANCE.c(), null);
    }
}
