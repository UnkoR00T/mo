package g72;

import a14.i;
import d72.HydroWarning;
import er.l;
import ez.e;
import f72.o;
import f72.p;
import fr.t;
import h72.SingleCardTextIconData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJI\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u0013*\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lg72/c;", "Lxw/f;", "Lg72/c$a;", "Lf72/p$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "La14/i;", "formatHeaderDatesWithDaysUseCase", "<init>", "(Lmx/c;Lez/e;La14/i;)V", "", "Ld72/b;", "", "voivodeship", "Lkotlin/Function1;", "Loq/i0;", "toDetails", "", "Lmx/a;", "Ln50/g;", "f", "(Ljava/util/List;Ljava/lang/String;Ler/l;)Ljava/util/Map;", "params", "i", "(Lg72/c$a;)Lf72/p$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "La14/i;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, p.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i formatHeaderDatesWithDaysUseCase;

    /* JADX INFO: renamed from: g72.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"Lg72/c$a;", "", "Lf72/o;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Ld72/b;", "toAlarmStateDetails", "toVoivodeshipPicker", "<init>", "(Lf72/o;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf72/o;", "b", "()Lf72/o;", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<HydroWarning, i0> toAlarmStateDetails;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toVoivodeshipPicker;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(o oVar, er.a<i0> aVar, l<? super HydroWarning, i0> lVar, er.a<i0> aVar2) {
            this.state = oVar;
            this.onBackAction = aVar;
            this.toAlarmStateDetails = lVar;
            this.toVoivodeshipPicker = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o getState() {
            return this.state;
        }

        public final l<HydroWarning, i0> c() {
            return this.toAlarmStateDetails;
        }

        public final er.a<i0> d() {
            return this.toVoivodeshipPicker;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.toAlarmStateDetails, params.toAlarmStateDetails) && t.c(this.toVoivodeshipPicker, params.toVoivodeshipPicker);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.toAlarmStateDetails.hashCode()) * 31) + this.toVoivodeshipPicker.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", toAlarmStateDetails=" + this.toAlarmStateDetails + ", toVoivodeshipPicker=" + this.toVoivodeshipPicker + ')';
        }
    }

    public c(mx.c cVar, e eVar, i iVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.formatHeaderDatesWithDaysUseCase = iVar;
    }

    private final Map<Label, List<DefaultSingleCardData>> f(List<HydroWarning> list, String str, final l<? super HydroWarning, i0> lVar) {
        List arrayList;
        if (t.c(str, "") || str == null || t.c(str, this.labelProvider.c(a72.c.f4043l).getText())) {
            arrayList = list;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                List<String> listI = ((HydroWarning) obj).i();
                if (listI != null && listI.contains(str)) {
                    arrayList.add(obj);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            Label labelA = this.formatHeaderDatesWithDaysUseCase.a(new i.Params(((HydroWarning) obj2).getPublishedAt(), null, 2, null));
            Object arrayList2 = linkedHashMap.get(labelA);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(labelA, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList3 = new ArrayList(v.y(iterable, 10));
            int i15 = 0;
            for (Object obj3 : iterable) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                final HydroWarning hydroWarning = (HydroWarning) obj3;
                arrayList3.add(new DefaultSingleCardData(null, new er.a() { // from class: g72.a
                    @Override // er.a
                    public final Object a() {
                        return c.h(lVar, hydroWarning);
                    }
                }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.d(hydroWarning.getArea(), "areaTitle_" + i15), null, null, 3, null)), n50.l.b(this.labelProvider.c(a72.c.f4042k0).o(Label.INSTANCE.d()).o(mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(hydroWarning.getDateFrom()), fz.c.DOTTED_PLUS_HOUR_WITH_SEC), "areaDescription_" + i15)), null, null, 3, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
                i15 = i16;
            }
            linkedHashMap2.put(key, arrayList3);
        }
        return linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l lVar, HydroWarning hydroWarning) {
        lVar.b(hydroWarning);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, DropDownButtonData dropDownButtonData) {
        params.d().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public p.a b(final Params params) {
        Label labelC;
        o state = params.getState();
        if (t.c(state, o.a.f59816a)) {
            return p.a.C1348a.f59819a;
        }
        if (!(state instanceof o.Initialized)) {
            throw new oq.p();
        }
        er.a<i0> aVarA = params.a();
        Label labelC2 = this.labelProvider.c(a72.c.f4046m0);
        String selectedVoivodeship = ((o.Initialized) params.getState()).getSelectedVoivodeship();
        if (selectedVoivodeship == null || (labelC = mx.b.b(selectedVoivodeship, "selectedVoivodeship")) == null) {
            labelC = this.labelProvider.c(a72.c.f4043l);
        }
        DropDownButtonData dropDownButtonData = new DropDownButtonData(labelC2, v.e(labelC), 0, null, this.labelProvider.c(a72.c.f4043l), false, null, new l() { // from class: g72.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.l(params, (DropDownButtonData) obj);
            }
        }, 104, null);
        boolean z15 = !((o.Initialized) params.getState()).c().isEmpty();
        Label labelC3 = this.labelProvider.c(a72.c.f4040j0);
        String selectedVoivodeship2 = ((o.Initialized) params.getState()).getSelectedVoivodeship();
        return new p.a.Initialized(dropDownButtonData, aVarA, z15, labelC3, selectedVoivodeship2 != null ? mx.b.b(selectedVoivodeship2, "selectedVoivodeship") : null, f(((o.Initialized) params.getState()).c(), ((o.Initialized) params.getState()).getSelectedVoivodeship(), params.c()), this.labelProvider.c(a72.c.f4031f), this.labelProvider.c(a72.c.f4029e), new SingleCardTextIconData(this.labelProvider.c(a72.c.f4033g), a72.b.f4016b), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(a72.c.f4027d), null, null, null, 28, null), null, null, null, null, 61, null), params.d());
    }
}
