package w13;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
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
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import v13.State;
import v13.g;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0013\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lw13/b;", "Lxw/f;", "Lw13/b$a;", "Lv13/g$a;", "Lmx/c;", "labelProvider", "Ly13/a;", "emergencyBackpackDataMapper", "<init>", "(Lmx/c;Ly13/a;)V", "", "Ll13/a;", "", "addedItemsIds", "Lkotlin/Function1;", "Lz13/a$a;", "Loq/i0;", "onGroupClick", "Ln30/b;", "h", "(Ljava/util/List;Ljava/util/List;Ler/l;)Ln30/b;", "params", "f", "(Lw13/b$a;)Lv13/g$a;", "Lmx/a;", "e", "()Lmx/a;", "a", "Lmx/c;", "b", "Ly13/a;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y13.a emergencyBackpackDataMapper;

    /* JADX INFO: renamed from: w13.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lw13/b$a;", "", "Lv13/f;", "state", "Lkotlin/Function1;", "Lz13/a$a;", "Loq/i0;", "toGroup", "Lkotlin/Function0;", "onSetReminderNotificationClick", "onBackAction", "openEmergencyBackpackPdf", "<init>", "(Lv13/f;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv13/f;", "d", "()Lv13/f;", "b", "Ler/l;", "e", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<z13.a.Group, i0> toGroup;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSetReminderNotificationClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> openEmergencyBackpackPdf;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super z13.a.Group, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.toGroup = lVar;
            this.onSetReminderNotificationClick = aVar;
            this.onBackAction = aVar2;
            this.openEmergencyBackpackPdf = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onSetReminderNotificationClick;
        }

        public final er.a<i0> c() {
            return this.openEmergencyBackpackPdf;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final l<z13.a.Group, i0> e() {
            return this.toGroup;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.toGroup, params.toGroup) && t.c(this.onSetReminderNotificationClick, params.onSetReminderNotificationClick) && t.c(this.onBackAction, params.onBackAction) && t.c(this.openEmergencyBackpackPdf, params.openEmergencyBackpackPdf);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.toGroup.hashCode()) * 31) + this.onSetReminderNotificationClick.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.openEmergencyBackpackPdf.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", toGroup=" + this.toGroup + ", onSetReminderNotificationClick=" + this.onSetReminderNotificationClick + ", onBackAction=" + this.onBackAction + ", openEmergencyBackpackPdf=" + this.openEmergencyBackpackPdf + ')';
        }
    }

    /* JADX INFO: renamed from: w13.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5510b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5510b f209312a = new C5510b();

        C5510b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1578456159);
            if (p076m2.t.k()) {
                p076m2.t.o(1578456159, i15, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.emergencybackpack.mapper.EmergencyBackpackMapper.invoke.<anonymous> (EmergencyBackpackMapper.kt:77)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f209313a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1717295615);
            if (p076m2.t.k()) {
                p076m2.t.o(-1717295615, i15, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.emergencybackpack.mapper.EmergencyBackpackMapper.invoke.<anonymous> (EmergencyBackpackMapper.kt:84)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public b(mx.c cVar, y13.a aVar) {
        this.labelProvider = cVar;
        this.emergencyBackpackDataMapper = aVar;
    }

    private final CardListData h(List<? extends l13.a> list, List<String> list2, final l<? super z13.a.Group, i0> lVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        int i15 = 0;
        while (true) {
            DefaultSingleCardData defaultSingleCardData = null;
            if (!it.hasNext()) {
                return new CardListData(arrayList, null, false, new CardListAccessibilityData(null, Boolean.TRUE, 1, null), null, 22, null);
            }
            Object next = it.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            z13.a aVarB = this.emergencyBackpackDataMapper.b((l13.a) next);
            final z13.a.Group group = aVarB instanceof z13.a.Group ? (z13.a.Group) aVarB : null;
            if (group != null) {
                defaultSingleCardData = new DefaultSingleCardData(null, new er.a() { // from class: w13.a
                    @Override // er.a
                    public final Object a() {
                        return b.i(lVar, group);
                    }
                }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(group.getName(), null, c70.a.f23835a.a().V(group.getName().getText(), i16, list.size()), 1, null)), n50.l.b(this.labelProvider.e(g13.c.Y0, Integer.valueOf(z13.b.a(group.c(), list2)), Integer.valueOf(z13.b.b(group.c()))), null, null, 3, null), 1, null), new LeadingSection(false, null, new i.Icon(group.getIconResId(), null, null, null, null, 30, null), 3, null), x0.Icon.INSTANCE.b(), null, 2301, null);
            }
            if (defaultSingleCardData != null) {
                arrayList.add(defaultSingleCardData);
            }
            i15 = i16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, z13.a.Group group) {
        lVar.b(group);
        return i0.f148189a;
    }

    public final Label e() {
        return this.labelProvider.c(g13.c.f69690b);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new x50.i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(g13.c.P0), null, null, false, null, 60, null), null, null, null, null, 60, null);
        Label labelC = this.labelProvider.c(g13.c.S);
        Label labelC2 = this.labelProvider.c(g13.c.Q);
        CardListData cardListDataH = h(params.getState().d(), params.getState().c(), params.e());
        LeadingSection leadingSection = new LeadingSection(false, null, new i.Icon(jz.a.f106736b0, null, null, null, null, 30, null), 3, null);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(g13.c.J0), null, null, 3, null)), null, 5, null), leadingSection, null, null, 3325, null);
        LeadingSection leadingSection2 = new LeadingSection(false, null, new i.Icon(jz.a.f106751d, null, C5510b.f209312a, null, null, 26, null), 3, null);
        return new g.Data(baseScaffoldData, labelC, labelC2, cardListDataH, defaultSingleCardData, new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(g13.c.Y), null, c.f209313a, 0, 0, null, 58, null)), null, 5, null), leadingSection2, null, null, 3325, null), params.a());
    }
}
