package d92;

import b92.State;
import er.l;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ld92/j;", "Lxw/f;", "Ld92/j$a;", "Lb92/g$a;", "Lmx/c;", "labelProvider", "Ld92/c;", "bottomSheetActionMapper", "<init>", "(Lmx/c;Ld92/c;)V", "params", "i", "(Ld92/j$a;)Lb92/g$a;", "a", "Lmx/c;", "b", "Ld92/c;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, b92.g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c bottomSheetActionMapper;

    /* JADX INFO: renamed from: d92.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Ld92/j$a;", "", "Lb92/f;", "state", "Lkotlin/Function1;", "Lg30/v;", "Loq/i0;", "onBottomSheetChanged", "Lkotlin/Function0;", "openExitDialog", "onBackClick", "<init>", "(Lb92/f;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb92/f;", "d", "()Lb92/f;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onBottomSheetChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> openExitDialog;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super v, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onBottomSheetChanged = lVar;
            this.openExitDialog = aVar;
            this.onBackClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final l<v, i0> b() {
            return this.onBottomSheetChanged;
        }

        public final er.a<i0> c() {
            return this.openExitDialog;
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
            return t.c(this.state, params.state) && t.c(this.onBottomSheetChanged, params.onBottomSheetChanged) && t.c(this.openExitDialog, params.openExitDialog) && t.c(this.onBackClick, params.onBackClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBottomSheetChanged.hashCode()) * 31) + this.openExitDialog.hashCode()) * 31) + this.onBackClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBottomSheetChanged=" + this.onBottomSheetChanged + ", openExitDialog=" + this.openExitDialog + ", onBackClick=" + this.onBackClick + ')';
        }
    }

    public j(mx.c cVar, c cVar2) {
        this.labelProvider = cVar;
        this.bottomSheetActionMapper = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        params.b().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.b().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.b().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.b().b(v.HIDDEN);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b92.g.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(v72.b.f204266j0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: d92.f
            @Override // er.a
            public final Object a() {
                return j.l(params);
            }
        })), null, null, 53, null);
        er.a<i0> aVarA = params.a();
        c92.a bottomSheetAction = params.getState().getBottomSheetAction();
        Label labelC = (bottomSheetAction instanceof c92.a.Voivodeship ? (c92.a.Voivodeship) bottomSheetAction : null) != null ? this.labelProvider.c(v72.b.R) : null;
        c92.a bottomSheetAction2 = params.getState().getBottomSheetAction();
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(params.getState().getBottomSheetValue(), false, params.b(), 2, null), labelC, (bottomSheetAction2 instanceof c92.a.Voivodeship ? (c92.a.Voivodeship) bottomSheetAction2 : null) != null ? new er.a() { // from class: d92.g
            @Override // er.a
            public final Object a() {
                return j.m(params);
            }
        } : null, null, 8, null);
        c92.a bottomSheetAction3 = params.getState().getBottomSheetAction();
        return new b92.g.Data(baseScaffoldData, modalBottomSheetData, bottomSheetAction3 != null ? this.bottomSheetActionMapper.b(new c.Params(bottomSheetAction3, new er.a() { // from class: d92.h
            @Override // er.a
            public final Object a() {
                return j.q(params);
            }
        })) : null, aVarA, new er.a() { // from class: d92.i
            @Override // er.a
            public final Object a() {
                return j.r(params);
            }
        });
    }
}
