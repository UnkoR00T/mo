package nh1;

import i30.ButtonIconData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import y40.MenuData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnh1/d;", "Lxw/f;", "Lnh1/d$a;", "Lnh1/q$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Lnh1/q$a$a;", "h", "(Lnh1/d$a;)Lnh1/q$a$a;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, q.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: nh1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006&"}, d2 = {"Lnh1/d$a;", "", "Lnh1/p;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function2;", "", "reorderDocumentsList", "Lkotlin/Function1;", "Lrq0/b;", "showReorderMenu", "hideReorderMenu", "<init>", "(Lnh1/p;Ler/a;Ler/p;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnh1/p;", "e", "()Lnh1/p;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/p;", "()Ler/p;", "d", "Ler/l;", "()Ler/l;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final p state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<Integer, Integer, i0> reorderDocumentsList;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<rq0.b, i0> showReorderMenu;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideReorderMenu;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(p pVar, er.a<i0> aVar, er.p<? super Integer, ? super Integer, i0> pVar2, er.l<? super rq0.b, i0> lVar, er.a<i0> aVar2) {
            this.state = pVar;
            this.onBackAction = aVar;
            this.reorderDocumentsList = pVar2;
            this.showReorderMenu = lVar;
            this.hideReorderMenu = aVar2;
        }

        public final er.a<i0> a() {
            return this.hideReorderMenu;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.p<Integer, Integer, i0> c() {
            return this.reorderDocumentsList;
        }

        public final er.l<rq0.b, i0> d() {
            return this.showReorderMenu;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final p getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBackAction, params.onBackAction) && fr.t.c(this.reorderDocumentsList, params.reorderDocumentsList) && fr.t.c(this.showReorderMenu, params.showReorderMenu) && fr.t.c(this.hideReorderMenu, params.hideReorderMenu);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.reorderDocumentsList.hashCode()) * 31) + this.showReorderMenu.hashCode()) * 31) + this.hideReorderMenu.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", reorderDocumentsList=" + this.reorderDocumentsList + ", showReorderMenu=" + this.showReorderMenu + ", hideReorderMenu=" + this.hideReorderMenu + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, int i15) {
        params.c().B(Integer.valueOf(i15), Integer.valueOf(i15 - 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, int i15) {
        params.c().B(Integer.valueOf(i15), Integer.valueOf(i15 + 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, k34.g gVar) {
        params.d().b(gVar.getType());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public q.a.Screen b(final Params params) {
        Label labelC;
        d dVar = this;
        p state = params.getState();
        if (!(state instanceof p.Content)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), dVar.labelProvider.c(sg1.a.K0), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarB = params.b();
        List<k34.g> listC = ((p.Content) params.getState()).c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        final int i15 = 0;
        for (Object obj : listC) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            final k34.g gVar = (k34.g) obj;
            String referenceName = gVar.getType().getReferenceName();
            LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106909z, null, null, null, null, 30, null), 3, null);
            mx.c cVar = dVar.labelProvider;
            Integer nameAlternative = gVar.getNameAlternative();
            n50.b.Title title = new n50.b.Title(new SingleCardLabel(cVar.c(nameAlternative != null ? nameAlternative.intValue() : gVar.getName()), null, null, 0, 0, null, 62, null));
            Integer description = gVar.getDescription();
            BodySection bodySection = new BodySection(null, title, (description == null || (labelC = dVar.labelProvider.c(description.intValue())) == null) ? null : n50.l.b(labelC, null, null, 3, null), 1, null);
            p.Content content = (p.Content) state;
            arrayList.add(new DocumentItem(referenceName, new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, leadingSection, content.c().size() > 1 ? new x0.IconButton(new ButtonIconData(null, jz.a.f106728a0, null, new MenuData(fr.t.c(content.getVisibleDocumentType(), gVar.getType()), params.a(), pq.v.s(i15 > 0 ? new y40.b("ReorderUp", dVar.labelProvider.c(sg1.a.J0), Integer.valueOf(jz.a.f106805k0), null, new er.a() { // from class: nh1.a
                @Override // er.a
                public final Object a() {
                    return d.i(params, i15);
                }
            }) : null, i15 < ((p.Content) params.getState()).c().size() - 1 ? new y40.b("ReorderDown", dVar.labelProvider.c(sg1.a.I0), Integer.valueOf(jz.a.f106812l0), null, new er.a() { // from class: nh1.b
                @Override // er.a
                public final Object a() {
                    return d.l(params, i15);
                }
            }) : null)), null, new er.a() { // from class: nh1.c
                @Override // er.a
                public final Object a() {
                    return d.m(params, gVar);
                }
            }, 21, null)) : null, null, 2303, null)));
            dVar = this;
            i15 = i16;
        }
        return new q.a.Screen(baseScaffoldData, aVarB, arrayList, params.c());
    }
}
