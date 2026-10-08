package fp1;

import androidx.compose.ui.graphics.Color;
import fr.t;
import g70.ShortcutMoreTransferData;
import g70.ShortcutsMoreContentData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n30.CardListData;
import n50.DefaultSingleCardData;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lfp1/f;", "Lxw/f;", "Lfp1/f$a;", "Lfp1/d$a;", "<init>", "()V", "", "Lg70/b;", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Lg70/c;", "h", "(Ljava/util/List;Ler/a;)Lg70/c;", "params", "e", "(Lfp1/f$a;)Lfp1/d$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, fp1.d.Data> {

    /* JADX INFO: renamed from: fp1.f$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lfp1/f$a;", "", "Lfp1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "<init>", "(Lfp1/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfp1/c;", "b", "()Lfp1/c;", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.onCloseAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onCloseAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f65862a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(1283303828);
            if (p076m2.t.k()) {
                p076m2.t.o(1283303828, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.shortcuts.more.DeveloperShortcutsMoreMapper.toShortcutsMoreLayoutData.<anonymous>.<anonymous> (DeveloperShortcutsMoreMapper.kt:57)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f65863a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(863184883);
            if (p076m2.t.k()) {
                p076m2.t.o(863184883, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.shortcuts.more.DeveloperShortcutsMoreMapper.toShortcutsMoreLayoutData.<anonymous>.<anonymous> (DeveloperShortcutsMoreMapper.kt:58)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f65864a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-339176820);
            if (p076m2.t.k()) {
                p076m2.t.o(-339176820, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.shortcuts.more.DeveloperShortcutsMoreMapper.toShortcutsMoreLayoutData.<anonymous>.<anonymous>.<anonymous> (DeveloperShortcutsMoreMapper.kt:65)");
            }
            long jI = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().i();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jI;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f65865a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-75155955);
            if (p076m2.t.k()) {
                p076m2.t.o(-75155955, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.shortcuts.more.DeveloperShortcutsMoreMapper.toShortcutsMoreLayoutData.<anonymous>.<anonymous>.<anonymous> (DeveloperShortcutsMoreMapper.kt:66)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    private final ShortcutsMoreContentData h(List<ShortcutMoreTransferData> list, er.a<i0> aVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (t.c(((ShortcutMoreTransferData) obj).getTitle().getText(), "Usuń dokument")) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        oq.r rVar = new oq.r(arrayList, arrayList2);
        List list2 = (List) rVar.a();
        List list3 = (List) rVar.b();
        ShortcutMoreTransferData shortcutMoreTransferData = (ShortcutMoreTransferData) v.n0(list2);
        DefaultSingleCardData defaultSingleCardDataC = shortcutMoreTransferData != null ? h.c(shortcutMoreTransferData, aVar, null, b.f65862a, c.f65863a) : null;
        List list4 = list3;
        ArrayList arrayList3 = new ArrayList(v.y(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList3.add(h.c((ShortcutMoreTransferData) it.next(), aVar, x0.Icon.INSTANCE.b(), d.f65864a, e.f65865a));
        }
        return new ShortcutsMoreContentData(new CardListData(arrayList3, null, false, null, null, 30, null), defaultSingleCardDataC);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public fp1.d.Data b(Params params) {
        return new fp1.d.Data(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), new er.a() { // from class: fp1.e
            @Override // er.a
            public final Object a() {
                return f.f();
            }
        }), mx.b.b("Pozostałe skróty", ""), null, null, null, 28, null), null, null, null, null, 61, null), h(params.getState().a(), params.a()), params.a());
    }
}
