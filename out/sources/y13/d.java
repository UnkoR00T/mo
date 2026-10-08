package y13;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListAccessibilityData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.i;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import x13.State;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJO\u0010\u0015\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Ly13/d;", "Lxw/f;", "Ly13/d$a;", "Lx13/f$a;", "Lmx/c;", "labelProvider", "Ly13/a;", "emergencyBackpackDataMapper", "<init>", "(Lmx/c;Ly13/a;)V", "", "Lz13/a;", "", "addedItemsIds", "Lkotlin/Function1;", "Lz13/a$a;", "Loq/i0;", "toGroup", "Lz13/a$b;", "updateItemSelection", "Ln30/b;", "i", "(Ljava/util/List;Ljava/util/List;Ler/l;Ler/l;)Ln30/b;", "params", "h", "(Ly13/d$a;)Lx13/f$a;", "Lx13/e;", "state", "f", "(Lx13/e;)Ljava/lang/String;", "a", "Lmx/c;", "b", "Ly13/a;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, x13.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a emergencyBackpackDataMapper;

    /* JADX INFO: renamed from: y13.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!¨\u0006\""}, d2 = {"Ly13/d$a;", "", "Lx13/e;", "state", "Lkotlin/Function1;", "Lz13/a$a;", "Loq/i0;", "toGroup", "Lz13/a$b;", "updateItemSelection", "Lkotlin/Function0;", "onBackAction", "<init>", "(Lx13/e;Ler/l;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lx13/e;", "b", "()Lx13/e;", "Ler/l;", "c", "()Ler/l;", "d", "Ler/a;", "()Ler/a;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<z13.a.Group, i0> toGroup;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<z13.a.Item, i0> updateItemSelection;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super z13.a.Group, i0> lVar, l<? super z13.a.Item, i0> lVar2, er.a<i0> aVar) {
            this.state = state;
            this.toGroup = lVar;
            this.updateItemSelection = lVar2;
            this.onBackAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final l<z13.a.Group, i0> c() {
            return this.toGroup;
        }

        public final l<z13.a.Item, i0> d() {
            return this.updateItemSelection;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.toGroup, params.toGroup) && t.c(this.updateItemSelection, params.updateItemSelection) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.toGroup.hashCode()) * 31) + this.updateItemSelection.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", toGroup=" + this.toGroup + ", updateItemSelection=" + this.updateItemSelection + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public d(mx.c cVar, a aVar) {
        this.labelProvider = cVar;
        this.emergencyBackpackDataMapper = aVar;
    }

    private final CardListData i(List<? extends z13.a> list, List<String> list2, final l<? super z13.a.Group, i0> lVar, final l<? super z13.a.Item, i0> lVar2) {
        DefaultSingleCardData defaultSingleCardData;
        List<? extends z13.a> list3 = list;
        ArrayList arrayList = new ArrayList(v.y(list3, 10));
        Iterator<T> it = list3.iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                return new CardListData(arrayList, null, false, new CardListAccessibilityData(null, Boolean.TRUE, 1, null), null, 22, null);
            }
            Object next = it.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final z13.a aVar = (z13.a) next;
            if (aVar instanceof z13.a.Group) {
                z13.a.Group group = (z13.a.Group) aVar;
                defaultSingleCardData = new DefaultSingleCardData(null, new er.a() { // from class: y13.b
                    @Override // er.a
                    public final Object a() {
                        return d.l(lVar, aVar);
                    }
                }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(group.getName(), null, null, 3, null)), n50.l.b(this.labelProvider.e(g13.c.Y0, Integer.valueOf(z13.b.a(group.c(), list2)), Integer.valueOf(z13.b.b(group.c()))), null, null, 3, null), 1, null), new LeadingSection(false, null, new i.Icon(group.getIconResId(), null, null, null, null, 30, null), 3, null), x0.Icon.INSTANCE.b(), null, 2301, null);
            } else {
                if (!(aVar instanceof z13.a.Item)) {
                    throw new p();
                }
                z13.a.Item item = (z13.a.Item) aVar;
                LeadingSection leadingSection = new LeadingSection(false, new n50.d.CheckBox(list2.contains(item.getItemId())), null, 5, null);
                n50.b.Title title = new n50.b.Title(n50.l.b(item.getName(), null, c70.a.f23835a.a().V(item.getName().getText(), i16, list.size()), 1, null));
                Label description = item.getDescription();
                defaultSingleCardData = new DefaultSingleCardData(null, new er.a() { // from class: y13.c
                    @Override // er.a
                    public final Object a() {
                        return d.m(lVar2, aVar);
                    }
                }, false, null, null, false, null, null, new BodySection(null, title, description != null ? n50.l.b(description, null, null, 3, null) : null, 1, null), leadingSection, null, null, 3325, null);
            }
            arrayList.add(defaultSingleCardData);
            i15 = i16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l lVar, z13.a aVar) {
        lVar.b(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, z13.a aVar) {
        lVar.b(aVar);
        return i0.f148189a;
    }

    public final String f(State state) {
        z13.a.Group group = (z13.a.Group) this.emergencyBackpackDataMapper.b(state.getGroup());
        return this.labelProvider.e(g13.c.X0, Integer.valueOf(z13.b.a(group.c(), state.c())), Integer.valueOf(z13.b.b(group.c()))).getText();
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public x13.f.Data b(Params params) {
        z13.a.Group group = (z13.a.Group) this.emergencyBackpackDataMapper.b(params.getState().getGroup());
        int iB = z13.b.b(group.c());
        int iA = z13.b.a(group.c(), params.getState().c());
        return new x13.f.Data(new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new x50.i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), group.getName(), null, null, false, null, 60, null), null, null, null, null, 60, null), new r50.a.WithIcon(null, this.labelProvider.e(g13.c.X0, Integer.valueOf(iA), Integer.valueOf(iB)), null, 0, false, iB == iA ? g.POSITIVE : g.INFORMATIVE, 13, null), i(group.c(), params.getState().c(), params.c(), params.d()), params.a());
    }
}
