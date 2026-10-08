package ty0;

import er.l;
import er.p;
import fr.t;
import fu.r;
import i30.ButtonIconData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
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
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import y40.MenuData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Je\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b*\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lty0/f;", "Lxw/f;", "Lty0/f$a;", "Lsy0/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lkh0/g;", "", "idMenuVisible", "Lkotlin/Function0;", "Loq/i0;", "hideReorderMenu", "Lkotlin/Function2;", "", "reorderFavoritePointsListAction", "Lkotlin/Function1;", "showReorderMenu", "Ln50/g;", "l", "(Ljava/util/List;Ljava/lang/String;Ler/a;Ler/p;Ler/l;)Ljava/util/List;", "favouriteMeasurementPoint", "Lmx/a;", "i", "(Lkh0/g;)Lmx/a;", "params", "h", "(Lty0/f$a;)Lsy0/e$a;", "a", "Lmx/c;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, sy0.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ty0.f$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006%"}, d2 = {"Lty0/f$a;", "", "Lsy0/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Lkotlin/Function2;", "", "reorderFavoritePointsListAction", "Lkotlin/Function1;", "", "showReorderMenu", "hideReorderMenu", "<init>", "(Lsy0/d;Ler/a;Ler/p;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsy0/d;", "e", "()Lsy0/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/p;", "()Ler/p;", "d", "Ler/l;", "()Ler/l;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final sy0.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Integer, Integer, i0> reorderFavoritePointsListAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> showReorderMenu;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideReorderMenu;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(sy0.d dVar, er.a<i0> aVar, p<? super Integer, ? super Integer, i0> pVar, l<? super String, i0> lVar, er.a<i0> aVar2) {
            this.state = dVar;
            this.closeAction = aVar;
            this.reorderFavoritePointsListAction = pVar;
            this.showReorderMenu = lVar;
            this.hideReorderMenu = aVar2;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final er.a<i0> b() {
            return this.hideReorderMenu;
        }

        public final p<Integer, Integer, i0> c() {
            return this.reorderFavoritePointsListAction;
        }

        public final l<String, i0> d() {
            return this.showReorderMenu;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final sy0.d getState() {
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
            return t.c(this.state, params.state) && t.c(this.closeAction, params.closeAction) && t.c(this.reorderFavoritePointsListAction, params.reorderFavoritePointsListAction) && t.c(this.showReorderMenu, params.showReorderMenu) && t.c(this.hideReorderMenu, params.hideReorderMenu);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.closeAction.hashCode()) * 31) + this.reorderFavoritePointsListAction.hashCode()) * 31) + this.showReorderMenu.hashCode()) * 31) + this.hideReorderMenu.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", closeAction=" + this.closeAction + ", reorderFavoritePointsListAction=" + this.reorderFavoritePointsListAction + ", showReorderMenu=" + this.showReorderMenu + ", hideReorderMenu=" + this.hideReorderMenu + ')';
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label i(BEFavoriteMeasurementPoint favouriteMeasurementPoint) {
        String street = favouriteMeasurementPoint.getPlace().getStreet();
        String city = favouriteMeasurementPoint.getPlace().getCity();
        StringBuilder sb5 = new StringBuilder();
        if (street != null && !r.t0(street)) {
            sb5.append(street);
            sb5.append(", ");
        }
        sb5.append(city);
        return mx.b.b(sb5.toString().toUpperCase(Locale.ROOT), "address_id_" + favouriteMeasurementPoint.getId());
    }

    private final List<DefaultSingleCardData> l(List<BEFavoriteMeasurementPoint> list, String str, er.a<i0> aVar, final p<? super Integer, ? super Integer, i0> pVar, final l<? super String, i0> lVar) {
        List<BEFavoriteMeasurementPoint> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        final int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final BEFavoriteMeasurementPoint bEFavoriteMeasurementPoint = (BEFavoriteMeasurementPoint) obj;
            LeadingSection leadingSection = new LeadingSection(false, null, new i.Icon(jz.a.f106909z, null, null, null, null, 30, null), 3, null);
            BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(i(bEFavoriteMeasurementPoint), null, null, 0, 0, null, 62, null)), null, 5, null);
            int i17 = jz.a.f106728a0;
            boolean zC = t.c(str, bEFavoriteMeasurementPoint.getId());
            y40.b bVar = new y40.b("ReorderUp", this.labelProvider.c(zx0.b.f238241a0), Integer.valueOf(jz.a.f106805k0), null, new er.a() { // from class: ty0.c
                @Override // er.a
                public final Object a() {
                    return f.m(pVar, i15);
                }
            });
            x0.IconButton iconButton = null;
            if (i15 <= 0) {
                bVar = null;
            }
            x0.IconButton iconButton2 = new x0.IconButton(new ButtonIconData(null, i17, null, new MenuData(zC, aVar, v.s(bVar, i15 < list.size() - 1 ? new y40.b("ReorderDown", this.labelProvider.c(zx0.b.Z), Integer.valueOf(jz.a.f106812l0), null, new er.a() { // from class: ty0.d
                @Override // er.a
                public final Object a() {
                    return f.q(pVar, i15);
                }
            }) : null)), null, new er.a() { // from class: ty0.e
                @Override // er.a
                public final Object a() {
                    return f.r(lVar, bEFavoriteMeasurementPoint);
                }
            }, 21, null));
            if (list.size() > 1) {
                iconButton = iconButton2;
            }
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, leadingSection, iconButton, null, 2303, null));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(p pVar, int i15) {
        pVar.B(Integer.valueOf(i15), Integer.valueOf(i15 - 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(p pVar, int i15) {
        pVar.B(Integer.valueOf(i15), Integer.valueOf(i15 + 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(l lVar, BEFavoriteMeasurementPoint bEFavoriteMeasurementPoint) {
        lVar.b(bEFavoriteMeasurementPoint.getId());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public sy0.e.a b(Params params) {
        sy0.d state = params.getState();
        if (state instanceof sy0.d.Initial) {
            return sy0.e.a.C4795a.f185588a;
        }
        if (!(state instanceof sy0.d.Initialized)) {
            throw new oq.p();
        }
        sy0.d.Initialized initialized = (sy0.d.Initialized) state;
        return new sy0.e.a.Initialized(new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new x50.i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(zx0.b.f238258k), null, null, false, null, 60, null), null, null, null, null, 60, null), params.a(), this.labelProvider.c(initialized.getIsWidgetEnabled() ? zx0.b.f238257j : zx0.b.f238256i), l(initialized.c(), initialized.getIdMenuVisible(), params.b(), params.c(), params.d()), params.c());
    }
}
