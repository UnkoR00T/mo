package ry0;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kh0.BEFavoriteMeasurementPoint;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0011*\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lry0/e;", "Lxw/f;", "Lry0/e$a;", "Lqy0/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lkh0/g;", "Lkotlin/Function1;", "Loq/i0;", "onPointClick", "Ln50/g;", "i", "(Lkh0/g;Ler/l;)Ln50/g;", "", "h", "(Lkh0/g;)Ljava/lang/String;", "f", "params", "e", "(Lry0/e$a;)Lqy0/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, qy0.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: ry0.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0018\u0010\u001f¨\u0006#"}, d2 = {"Lry0/e$a;", "", "Lqy0/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onAddPointClick", "Lkotlin/Function1;", "Lkh0/g;", "onPointClick", "editClickAction", "<init>", "(Lqy0/b;Ler/a;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqy0/b;", "e", "()Lqy0/b;", "b", "Ler/a;", "c", "()Ler/a;", "d", "Ler/l;", "()Ler/l;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final qy0.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddPointClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BEFavoriteMeasurementPoint, i0> onPointClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> editClickAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(qy0.b bVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super BEFavoriteMeasurementPoint, i0> lVar, er.a<i0> aVar3) {
            this.state = bVar;
            this.onBackClick = aVar;
            this.onAddPointClick = aVar2;
            this.onPointClick = lVar;
            this.editClickAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.editClickAction;
        }

        public final er.a<i0> b() {
            return this.onAddPointClick;
        }

        public final er.a<i0> c() {
            return this.onBackClick;
        }

        public final l<BEFavoriteMeasurementPoint, i0> d() {
            return this.onPointClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final qy0.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onAddPointClick, params.onAddPointClick) && t.c(this.onPointClick, params.onPointClick) && t.c(this.editClickAction, params.editClickAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onAddPointClick.hashCode()) * 31) + this.onPointClick.hashCode()) * 31) + this.editClickAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onAddPointClick=" + this.onAddPointClick + ", onPointClick=" + this.onPointClick + ", editClickAction=" + this.editClickAction + ')';
        }
    }

    public e(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final String f(BEFavoriteMeasurementPoint bEFavoriteMeasurementPoint) {
        StringBuilder sb5 = new StringBuilder();
        String street = bEFavoriteMeasurementPoint.getPlace().getStreet();
        if (street != null && street.length() != 0) {
            sb5.append(bEFavoriteMeasurementPoint.getPlace().getStreet());
            sb5.append(", ");
        }
        sb5.append(bEFavoriteMeasurementPoint.getPlace().getCity());
        return sb5.toString().toUpperCase(Locale.ROOT);
    }

    private final String h(BEFavoriteMeasurementPoint bEFavoriteMeasurementPoint) {
        if (bEFavoriteMeasurementPoint.getQuality() == kh0.l.UNKNOWN) {
            return this.labelProvider.c(zx0.b.f238264q).getText();
        }
        StringBuilder sb5 = new StringBuilder();
        OffsetDateTime timestamp = bEFavoriteMeasurementPoint.getTimestamp();
        if (timestamp != null) {
            sb5.append(this.labelProvider.c(zx0.b.f238263p).getText());
            sb5.append(" ");
            sb5.append(this.dateFormatter.d(new fz.b.OffsetDateTime(timestamp), fz.c.DOTTED_PLUS_HOUR));
        }
        return sb5.toString();
    }

    private final DefaultSingleCardData i(final BEFavoriteMeasurementPoint bEFavoriteMeasurementPoint, final l<? super BEFavoriteMeasurementPoint, i0> lVar) {
        py0.a aVarA = oy0.a.a(bEFavoriteMeasurementPoint.getQuality());
        Label labelB = mx.b.b(f(bEFavoriteMeasurementPoint) + " \n" + h(bEFavoriteMeasurementPoint), "DescriptionLabel");
        return new DefaultSingleCardData(null, new er.a() { // from class: ry0.d
            @Override // er.a
            public final Object a() {
                return e.l(lVar, bEFavoriteMeasurementPoint);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(aVarA.getQualityResId()), null, null, 0, 0, null, 62, null)), new SingleCardLabel(labelB, null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(true, null, new i.Icon(aVarA.getIconResId(), null, aVarA.e(), d40.i.C0865i.f39712e, null, 18, null), 2, null), x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l lVar, BEFavoriteMeasurementPoint bEFavoriteMeasurementPoint) {
        lVar.b(bEFavoriteMeasurementPoint);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public qy0.c.a b(Params params) {
        qy0.b state = params.getState();
        if (state instanceof qy0.b.Initial) {
            return qy0.c.a.b.f169368a;
        }
        if (state instanceof qy0.b.Empty) {
            return new qy0.c.a.Empty(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(zx0.b.O), null, null, null, 28, null), null, null, null, null, 61, null), params.c(), new IconPageData(new j.a(jz.a.f106754d2), this.labelProvider.c(zx0.b.f238250f), this.labelProvider.c(zx0.b.f238248e), null, null, null, false, 72, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(zx0.b.f238240a), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null));
        }
        if (!(state instanceof qy0.b.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(zx0.b.O), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216849e, null, null, params.a(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(zx0.b.f238240a), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null);
        List<BEFavoriteMeasurementPoint> listA = ((qy0.b.Initialized) params.getState()).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(i((BEFavoriteMeasurementPoint) it.next(), params.d()));
        }
        return new qy0.c.a.Initialized(baseScaffoldData, buttonData, arrayList, params.c(), params.a(), ((qy0.b.Initialized) params.getState()).getWidgetPointId() != null);
    }
}
