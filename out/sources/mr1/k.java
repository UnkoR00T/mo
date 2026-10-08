package mr1;

import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmr1/k;", "Lxw/f;", "Lmr1/k$a;", "Lmr1/f$a;", "<init>", "()V", "", "Lg30/v;", "u", "(Z)Lg30/v;", "s", "(Lg30/v;)Z", "params", "i", "(Lmr1/k$a;)Lmr1/f$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements xw.f<Params, f.Data> {

    /* JADX INFO: renamed from: mr1.k$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lmr1/k$a;", "", "Lmr1/e;", "state", "Lkotlin/Function1;", "Lmx/a;", "Loq/i0;", "onBottomSheetItemSelected", "", "bottomSheetVisibilityChange", "Lkotlin/Function0;", "onCloseAction", "<init>", "(Lmr1/e;Ler/l;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmr1/e;", "d", "()Lmr1/e;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Label, i0> onBottomSheetItemSelected;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> bottomSheetVisibilityChange;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super Label, i0> lVar, er.l<? super Boolean, i0> lVar2, er.a<i0> aVar) {
            this.state = state;
            this.onBottomSheetItemSelected = lVar;
            this.bottomSheetVisibilityChange = lVar2;
            this.onCloseAction = aVar;
        }

        public final er.l<Boolean, i0> a() {
            return this.bottomSheetVisibilityChange;
        }

        public final er.l<Label, i0> b() {
            return this.onBottomSheetItemSelected;
        }

        public final er.a<i0> c() {
            return this.onCloseAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBottomSheetItemSelected, params.onBottomSheetItemSelected) && fr.t.c(this.bottomSheetVisibilityChange, params.bottomSheetVisibilityChange) && fr.t.c(this.onCloseAction, params.onCloseAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBottomSheetItemSelected.hashCode()) * 31) + this.bottomSheetVisibilityChange.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBottomSheetItemSelected=" + this.onBottomSheetItemSelected + ", bottomSheetVisibilityChange=" + this.bottomSheetVisibilityChange + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127954a;

        static {
            int[] iArr = new int[g30.v.values().length];
            try {
                iArr[g30.v.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g30.v.HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g30.v.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f127954a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, k kVar, g30.v vVar) {
        params.a().b(Boolean.valueOf(kVar.s(vVar)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.a().b(Boolean.FALSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, DropDownButtonData dropDownButtonData) {
        params.a().b(Boolean.TRUE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, Label label) {
        params.b().b(label);
        params.a().b(Boolean.FALSE);
        return i0.f148189a;
    }

    private final boolean s(g30.v vVar) {
        int i15 = b.f127954a[vVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return true;
        }
        if (i15 == 3) {
            return false;
        }
        throw new oq.p();
    }

    private final g30.v u(boolean z15) {
        if (z15) {
            return g30.v.EXPANDED;
        }
        if (z15) {
            throw new oq.p();
        }
        return g30.v.HIDDEN;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), mx.b.b("Mock servers", "titleTag"), null, null, null, 28, null), null, null, null, null, 61, null);
        List<String> listE = params.getState().e();
        ArrayList arrayList = new ArrayList(pq.v.y(listE, 10));
        for (String str : listE) {
            arrayList.add(mx.b.b(str, str));
        }
        Label labelB = mx.b.b(params.getState().getSelectedUrl(), "selectedItem");
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(u(params.getState().getBottomSheetVisible()), true, new er.l() { // from class: mr1.g
            @Override // er.l
            public final Object b(Object obj) {
                return k.l(params, this, (g30.v) obj);
            }
        }), null, new er.a() { // from class: mr1.h
            @Override // er.a
            public final Object a() {
                return k.m(params);
            }
        }, null, 10, null);
        Label labelB2 = mx.b.b("Adres serwera", "BottomSheetInputUrlListTitle");
        List<String> listE2 = params.getState().e();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listE2, 10));
        Iterator<T> it = listE2.iterator();
        while (it.hasNext()) {
            arrayList2.add(mx.b.b((String) it.next(), ""));
        }
        Label labelB3 = mx.b.b("Wybierz serwer", "BottomSheetContentServerUrlHint");
        Iterator<String> it4 = params.getState().e().iterator();
        int i15 = 0;
        while (true) {
            if (!it4.hasNext()) {
                i15 = -1;
                break;
            }
            if (fr.t.c(it4.next(), params.getState().getSelectedUrl())) {
                break;
            }
            i15++;
        }
        Integer numValueOf = Integer.valueOf(i15);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return new f.Data(baseScaffoldData, modalBottomSheetData, arrayList, labelB, new er.l() { // from class: mr1.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.r(params, (Label) obj);
            }
        }, new DropDownButtonData(labelB2, arrayList2, numValueOf, null, labelB3, false, null, new er.l() { // from class: mr1.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.q(params, (DropDownButtonData) obj);
            }
        }, 104, null), params.c());
    }
}
