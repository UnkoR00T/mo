package if2;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import st3.AddressFormData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zi0.InternetAddressPoint;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lif2/e;", "Lxw/f;", "Lif2/e$a;", "Lhf2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lst3/d;", "f", "()Lst3/d;", "params", "h", "(Lif2/e$a;)Lhf2/c$a;", "a", "Lmx/c;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, hf2.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: if2.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001f\u0010\u001e¨\u0006\""}, d2 = {"Lif2/e$a;", "", "Lhf2/b;", "state", "Lkotlin/Function1;", "Lst3/d;", "Loq/i0;", "onBackAction", "Lkotlin/Function0;", "onCloseWithDialogAction", "Lzi0/a;", "onItemSelected", "<init>", "(Lhf2/b;Ler/l;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhf2/b;", "d", "()Lhf2/b;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hf2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<AddressFormData, i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseWithDialogAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<InternetAddressPoint, i0> onItemSelected;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(hf2.b bVar, l<? super AddressFormData, i0> lVar, er.a<i0> aVar, l<? super InternetAddressPoint, i0> lVar2) {
            this.state = bVar;
            this.onBackAction = lVar;
            this.onCloseWithDialogAction = aVar;
            this.onItemSelected = lVar2;
        }

        public final l<AddressFormData, i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseWithDialogAction;
        }

        public final l<InternetAddressPoint, i0> c() {
            return this.onItemSelected;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final hf2.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseWithDialogAction, params.onCloseWithDialogAction) && t.c(this.onItemSelected, params.onItemSelected);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseWithDialogAction.hashCode()) * 31) + this.onItemSelected.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onCloseWithDialogAction=" + this.onCloseWithDialogAction + ", onItemSelected=" + this.onItemSelected + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f92136a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1115428207);
            if (p076m2.t.k()) {
                p076m2.t.o(-1115428207, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.addresspoints.mapper.AddressPointsMapper.invoke.<anonymous> (AddressPointsMapper.kt:50)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final AddressFormData f() {
        return new AddressFormData(null, true, this.labelProvider.c(df2.a.f41368a), this.labelProvider.c(df2.a.I), null, null, null, 113, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, e eVar) {
        params.a().b(eVar.f());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, InternetAddressPoint internetAddressPoint) {
        params.c().b(internetAddressPoint);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public hf2.c.a b(final Params params) {
        hf2.b state = params.getState();
        if (t.c(state, hf2.b.C1941b.f84165a)) {
            return hf2.c.a.b.f84168a;
        }
        if (!(state instanceof hf2.b.SelectingAlternativeAddress)) {
            if (state instanceof hf2.b.Error) {
                return new hf2.c.a.Error(((hf2.b.Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), new er.a() { // from class: if2.c
            @Override // er.a
            public final Object a() {
                return e.i(params, this);
            }
        }), this.labelProvider.c(df2.a.F), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f92136a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(df2.a.H);
        Label labelC2 = this.labelProvider.c(df2.a.E);
        List<InternetAddressPoint> listA = ((hf2.b.SelectingAlternativeAddress) state).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (final InternetAddressPoint internetAddressPoint : listA) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: if2.d
                @Override // er.a
                public final Object a() {
                    return e.l(params, internetAddressPoint);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(internetAddressPoint.getDisplayAddress(), internetAddressPoint.getId() + "TestTag"), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        return new hf2.c.a.SelectingAlternativeAddress(baseScaffoldData, labelC, labelC2, new CardListData(arrayList, null, false, null, null, 30, null), new c30.b.c(null, null, null, this.labelProvider.c(df2.a.D), null, null, null, 119, null));
    }
}
