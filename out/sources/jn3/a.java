package jn3;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import g70.ShortcutMoreTransferData;
import g70.ShortcutsMoreContentData;
import i50.BaseScaffoldData;
import in3.State;
import in3.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n30.CardListData;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljn3/a;", "Lxw/f;", "Ljn3/a$a;", "Lin3/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lg70/b;", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Lg70/c;", "e", "(Ljava/util/List;Ler/a;)Lg70/c;", "params", "c", "(Ljn3/a$a;)Lin3/d$a;", "a", "Lmx/c;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: jn3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljn3/a$a;", "", "Lin3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "<init>", "(Lin3/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lin3/c;", "b", "()Lin3/c;", "Ler/a;", "()Ler/a;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f103866a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(798676254);
            if (p076m2.t.k()) {
                p076m2.t.o(798676254, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.moreshortcuts.mapper.VehicleDetailsShortcutsMoreMapper.toShortcutsMoreLayoutData.<anonymous>.<anonymous>.<anonymous> (VehicleDetailsShortcutsMoreMapper.kt:64)");
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
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f103867a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(42910431);
            if (p076m2.t.k()) {
                p076m2.t.o(42910431, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.moreshortcuts.mapper.VehicleDetailsShortcutsMoreMapper.toShortcutsMoreLayoutData.<anonymous>.<anonymous>.<anonymous> (VehicleDetailsShortcutsMoreMapper.kt:65)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final ShortcutsMoreContentData e(List<ShortcutMoreTransferData> list, er.a<i0> aVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (t.c(((ShortcutMoreTransferData) obj).getTitle().getText(), this.labelProvider.c(um3.b.f199236k).getText())) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        List list2 = (List) new oq.r(arrayList, arrayList2).b();
        ArrayList arrayList3 = new ArrayList(v.y(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(jn3.c.c((ShortcutMoreTransferData) it.next(), aVar, x0.Icon.INSTANCE.b(), b.f103866a, c.f103867a));
        }
        return new ShortcutsMoreContentData(new CardListData(arrayList3, null, false, null, null, 30, null), null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        return new d.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(um3.b.f199239l), null, null, null, 28, null), null, null, null, null, 61, null), e(params.getState().a(), params.a()), params.a());
    }
}
