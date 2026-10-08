package sg2;

import er.l;
import er.p;
import ez.e;
import fr.t;
import fr.u0;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import k30.d;
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
import rg2.g;
import rg2.h;
import tq0.MyRegistry;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lsg2/b;", "Lxw/f;", "Lsg2/b$a;", "Lrg2/h$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "", "Ltq0/u$a;", "", "Ln50/g;", "e", "(Ljava/util/List;)[Ln50/g;", "params", "Lrg2/h$a$a;", "f", "(Lsg2/b$a;)Lrg2/h$a$a;", "a", "Lmx/c;", "b", "Lez/e;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: sg2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u001d\u0010%¨\u0006&"}, d2 = {"Lsg2/b$a;", "", "Lrg2/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onGoNextClick", "Lkotlin/Function1;", "", "openUrl", "Lkotlin/Function2;", "Lmx/a;", "onCopyToClipboard", "<init>", "(Lrg2/g;Ler/a;Ler/a;Ler/l;Ler/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrg2/g;", "e", "()Lrg2/g;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "Ler/p;", "()Ler/p;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoNextClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrl;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<String, Label, i0> onCopyToClipboard;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(g gVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar, p<? super String, ? super Label, i0> pVar) {
            this.state = gVar;
            this.onBackClick = aVar;
            this.onGoNextClick = aVar2;
            this.openUrl = lVar;
            this.onCopyToClipboard = pVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final p<String, Label, i0> b() {
            return this.onCopyToClipboard;
        }

        public final er.a<i0> c() {
            return this.onGoNextClick;
        }

        public final l<String, i0> d() {
            return this.openUrl;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final g getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onGoNextClick, params.onGoNextClick) && t.c(this.openUrl, params.openUrl) && t.c(this.onCopyToClipboard, params.onCopyToClipboard);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onGoNextClick.hashCode()) * 31) + this.openUrl.hashCode()) * 31) + this.onCopyToClipboard.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onGoNextClick=" + this.onGoNextClick + ", openUrl=" + this.openUrl + ", onCopyToClipboard=" + this.onCopyToClipboard + ')';
        }
    }

    public b(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final DefaultSingleCardData[] e(List<MyRegistry.a> list) {
        Label label;
        List<MyRegistry.a> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            b0 address = ((MyRegistry.a) obj).getAddress();
            String str = "address" + i15;
            if (list.size() == 1) {
                label = this.labelProvider.c(xf2.a.f218363g1);
            } else {
                Label labelC = this.labelProvider.c(xf2.a.f218363g1);
                label = new Label(labelC.getText() + ' ' + i16, labelC.getTag() + i15);
            }
            arrayList.add(new DefaultSingleCardData(str, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(label, null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(address), "address"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null));
            i15 = i16;
        }
        Object[] array = arrayList.toArray(new DefaultSingleCardData[0]);
        if (array.length == 0) {
            array = new DefaultSingleCardData[]{new DefaultSingleCardData("emptyaddress", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(xf2.a.f218363g1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(Label.INSTANCE.b(), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)};
        }
        return (DefaultSingleCardData[]) array;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(g gVar, b bVar, Params params) {
        params.b().B(c0.e(((g.Initialized) gVar).getMyRegistry().getNumber()), bVar.labelProvider.c(xf2.a.f218372j1));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public h.a.Initialized b(final Params params) {
        final g state = params.getState();
        if (!(state instanceof g.Initialized)) {
            throw new oq.p();
        }
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(xf2.a.f218390p1), null, null, null, 28, null), null, null, null, null, 61, null);
        c30.b.c cVar = new c30.b.c("alertTipLink", null, null, this.labelProvider.c(xf2.a.f218384n1), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(xf2.a.f218387o1), "https://ekw.ms.gov.pl/", LinkData.EnumC5775a.WEBSITE, false, params.d(), 17, null)), 54, null);
        Label labelC = this.labelProvider.c(xf2.a.f218378l1);
        u0 u0Var = new u0(5);
        g.Initialized initialized = (g.Initialized) state;
        BodySection bodySection = new BodySection(new SingleCardLabel(this.labelProvider.c(xf2.a.f218381m1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(initialized.getMyRegistry().getNumber()), "id"), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.a.b bVar = k30.a.b.f107765a;
        k30.c.WithText withText = new k30.c.WithText(this.labelProvider.c(xf2.a.f218364h), null, 2, null);
        d.a aVar = d.a.f107773a;
        u0Var.a(new DefaultSingleCardData("id", null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData(null, null, bVar, withText, aVar, null, new er.a() { // from class: sg2.a
            @Override // er.a
            public final Object a() {
                return b.h(state, this, params);
            }
        }, 35, null)), null, 2814, null));
        u0Var.a(new DefaultSingleCardData("status", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(xf2.a.f218393q1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(this.labelProvider.c(mg2.g.a(initialized.getMyRegistry().getType())), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null));
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(xf2.a.f218375k1), null, null, 0, 0, null, 62, null);
        i0 i0Var = i0.f148189a;
        u0Var.a(new DefaultSingleCardData("department", null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(initialized.getMyRegistry().getCourt()) + '\n' + c0.e(initialized.getMyRegistry().getDepartment()), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null));
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(xf2.a.f218369i1), null, null, 0, 0, null, 62, null);
        fz.b.OffsetDateTime closeDate = initialized.getMyRegistry().getCloseDate();
        u0Var.a(new DefaultSingleCardData("closeData", null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d(closeDate != null ? this.dateFormatter.d(closeDate, fz.c.DOTTED_PLUS_HOUR) : null, "closeData"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null));
        u0Var.b(e(initialized.getMyRegistry().a()));
        return new h.a.Initialized(aVarA, baseScaffoldData, cVar, labelC, new CardListData(v.q(u0Var.d(new DefaultSingleCardData[u0Var.c()])), null, false, null, null, 30, null), new ButtonData("orderButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(xf2.a.f218366h1), null, 2, null), aVar, null, params.c(), 34, null));
    }
}
