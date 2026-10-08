package yr3;

import er.l;
import ez.d;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xr3.State;
import xr3.h;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\r\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lyr3/b;", "Lxw/f;", "Lyr3/b$b;", "Lxr3/h$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "e", "(Lyr3/b$b;)Lxr3/h$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, h.Data> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f229079d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: yr3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lyr3/b$b;", "", "Lxr3/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackPressed", "addToCalendar", "Lkotlin/Function1;", "", "onDetailsClick", "<init>", "(Lxr3/g;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxr3/g;", "d", "()Lxr3/g;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> addToCalendar;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Long, i0> onDetailsClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, l<? super Long, i0> lVar) {
            this.state = state;
            this.onBackPressed = aVar;
            this.addToCalendar = aVar2;
            this.onDetailsClick = lVar;
        }

        public final er.a<i0> a() {
            return this.addToCalendar;
        }

        public final er.a<i0> b() {
            return this.onBackPressed;
        }

        public final l<Long, i0> c() {
            return this.onDetailsClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onBackPressed, params.onBackPressed) && t.c(this.addToCalendar, params.addToCalendar) && t.c(this.onDetailsClick, params.onDetailsClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackPressed.hashCode()) * 31) + this.addToCalendar.hashCode()) * 31) + this.onDetailsClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackPressed=" + this.onBackPressed + ", addToCalendar=" + this.addToCalendar + ", onDetailsClick=" + this.onDetailsClick + ')';
        }
    }

    public b(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params) {
        params.c().b(Long.valueOf(params.getState().getBookedData().getId()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), null, null, null, null, 30, null), null, null, null, null, 61, null);
        j.b.c cVar = j.b.c.f164688d;
        Label labelC = this.labelProvider.c(ir3.a.f96819r1);
        Label labelO = this.labelProvider.c(ir3.a.f96813p1).o(new Label("\n", "_")).o(this.labelProvider.c(ir3.a.f96816q1));
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ir3.a.I), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(params.getState().getBookedData().getTopic(), "topicValueTag"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        BodySection bodySection = new BodySection(new SingleCardLabel(this.labelProvider.c(ir3.a.f96790i), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(this.dateFormatter.d(d.j(params.getState().getBookedData().getVisitDate()), fz.c.DOTTED), "dateValueTag"), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.a.b bVar = k30.a.b.f107765a;
        k30.d.a aVar = k30.d.a.f107773a;
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(this.labelProvider.c(ir3.a.f96766a), null, 2, null), aVar, null, params.a(), 35, null)), null, 2815, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ir3.a.f96823t), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(this.dateFormatter.d(d.j(params.getState().getBookedData().getVisitDate()), fz.c.ONLY_HOUR), "timeValueTag"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(ir3.a.f96831v1), null, null, 0, 0, null, 62, null);
        String departmentDescription = params.getState().getBookedData().getDepartmentDescription();
        return new h.Data(baseScaffoldData, new IconPageData(cVar, labelC, labelO, null, new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(departmentDescription != null ? ir3.b.a(departmentDescription) : null, "departmentValueTag"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null), new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ir3.a.f96811p), null, 2, null), aVar, null, params.b(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ir3.a.f96822s1), null, 2, null), new k30.d.Secondary(null, 1, null), null, new er.a() { // from class: yr3.a
            @Override // er.a
            public final Object a() {
                return b.f(params);
            }
        }, 35, null), null, 4, null), true, 8, null), params.b());
    }
}
