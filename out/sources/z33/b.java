package z33;

import cb4.i;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import tt0.BEReportSubCategory;
import x50.NavigationButtonData;
import xw.f;
import y33.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lz33/b;", "Lxw/f;", "Lz33/b$a;", "Ly33/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "stringId", "Lmx/a;", "h", "(I)Lmx/a;", "params", "e", "(Lz33/b$a;)Ly33/c$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: z33.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Lz33/b$a;", "", "Ly33/b;", "state", "Lkotlin/Function1;", "Ltt0/h;", "Loq/i0;", "onSelectSubType", "Lkotlin/Function0;", "onBack", "onClose", "<init>", "(Ly33/b;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly33/b;", "d", "()Ly33/b;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y33.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BEReportSubCategory, i0> onSelectSubType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(y33.b bVar, l<? super BEReportSubCategory, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.onSelectSubType = lVar;
            this.onBack = aVar;
            this.onClose = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final l<BEReportSubCategory, i0> c() {
            return this.onSelectSubType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final y33.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onSelectSubType, params.onSelectSubType) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onSelectSubType.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectSubType=" + this.onSelectSubType + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, BEReportSubCategory bEReportSubCategory) {
        params.c().b(bEReportSubCategory);
        return i0.f148189a;
    }

    private final Label h(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.Data b(final Params params) {
        Label labelB;
        y33.b state = params.getState();
        y33.b.Dialog dialog = state instanceof y33.b.Dialog ? (y33.b.Dialog) state : null;
        i dialogVMSAdapter = dialog != null ? dialog.getDialogVMSAdapter() : null;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), h(h23.b.O), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelH = h(h23.b.R);
        List<BEReportSubCategory> listD = params.getState().getSelectedCategory().d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        int i15 = 0;
        for (Object obj : listD) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final BEReportSubCategory bEReportSubCategory = (BEReportSubCategory) obj;
            String str = "ReportType" + i15;
            n50.b.Title title = new n50.b.Title(n50.l.b(mx.b.b(bEReportSubCategory.getName(), ""), null, null, 3, null));
            String additionalDescription = bEReportSubCategory.getAdditionalDescription();
            arrayList.add(new DefaultSingleCardData(str, new er.a() { // from class: z33.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, bEReportSubCategory);
                }
            }, false, null, null, false, null, null, new BodySection(null, title, (additionalDescription == null || (labelB = mx.b.b(additionalDescription, "")) == null) ? null : n50.l.b(labelB, null, null, 3, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2812, null));
            i15 = i16;
        }
        return new c.Data(dialogVMSAdapter, baseScaffoldData, labelH, new CardListData(arrayList, null, false, null, null, 30, null), params.a());
    }
}
