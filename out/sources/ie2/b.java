package ie2;

import cb4.i;
import er.l;
import fr.t;
import he2.d;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import xw.f;
import zp0.BEReportIncidentTypesIncidentTypeConfig;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lie2/b;", "Lxw/f;", "Lie2/b$a;", "Lhe2/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "stringId", "Lmx/a;", "h", "(I)Lmx/a;", "params", "e", "(Lie2/b$a;)Lhe2/d$a;", "a", "Lmx/c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ie2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Lie2/b$a;", "", "Lhe2/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onCloseClick", "Lkotlin/Function1;", "Lzp0/o;", "onCategoryClick", "<init>", "(Lhe2/c;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhe2/c;", "d", "()Lhe2/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final he2.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BEReportIncidentTypesIncidentTypeConfig, i0> onCategoryClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(he2.c cVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super BEReportIncidentTypesIncidentTypeConfig, i0> lVar) {
            this.state = cVar;
            this.onBackClick = aVar;
            this.onCloseClick = aVar2;
            this.onCategoryClick = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final l<BEReportIncidentTypesIncidentTypeConfig, i0> b() {
            return this.onCategoryClick;
        }

        public final er.a<i0> c() {
            return this.onCloseClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final he2.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onCategoryClick, params.onCategoryClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.onCategoryClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onCloseClick=" + this.onCloseClick + ", onCategoryClick=" + this.onCategoryClick + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, BEReportIncidentTypesIncidentTypeConfig bEReportIncidentTypesIncidentTypeConfig) {
        params.b().b(bEReportIncidentTypesIncidentTypeConfig);
        return i0.f148189a;
    }

    private final Label h(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        i dialogVMSAdapter;
        SingleCardLabel singleCardLabel;
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), h(ud2.a.F), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelH = h(ud2.a.f197762t0);
        List<BEReportIncidentTypesIncidentTypeConfig> listA = params.getState().getInitializedStateData().a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        int i15 = 0;
        while (true) {
            dialogVMSAdapter = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final BEReportIncidentTypesIncidentTypeConfig bEReportIncidentTypesIncidentTypeConfig = (BEReportIncidentTypesIncidentTypeConfig) next;
            String str = "incidentCategoryCard_" + i15;
            n50.b.Title title = new n50.b.Title(new SingleCardLabel(mx.b.b(bEReportIncidentTypesIncidentTypeConfig.getType().getName(), "title_" + i15), null, null, 0, 0, null, 62, null));
            String description = bEReportIncidentTypesIncidentTypeConfig.getDescription();
            if (description != null) {
                singleCardLabel = new SingleCardLabel(mx.b.b(description, "description_" + i15), null, null, 0, 0, null, 62, null);
            } else {
                singleCardLabel = null;
            }
            arrayList.add(new DefaultSingleCardData(str, new er.a() { // from class: ie2.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, bEReportIncidentTypesIncidentTypeConfig);
                }
            }, false, null, null, false, null, null, new BodySection(null, title, singleCardLabel, 1, null), null, x0.Icon.INSTANCE.b(), null, 2812, null));
            i15 = i16;
        }
        CardListData cardListData = new CardListData(arrayList, null, false, null, null, 30, null);
        he2.c state = params.getState();
        if (!(state instanceof he2.c.Screen)) {
            if (!(state instanceof he2.c.Dialog)) {
                throw new p();
            }
            dialogVMSAdapter = ((he2.c.Dialog) params.getState()).getDialogVMSAdapter();
        }
        return new d.Data(aVarA, baseScaffoldData, labelH, cardListData, dialogVMSAdapter);
    }
}
