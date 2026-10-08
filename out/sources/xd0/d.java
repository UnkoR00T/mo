package xd0;

import androidx.compose.ui.graphics.Color;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import rd0.SetPinThemeColors;
import rd0.e;
import wd0.g;
import wd0.h;
import x50.NavigationButtonData;
import x50.i;
import x60.BasicPinInputScreenData;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lxd0/d;", "Lxw/f;", "Lxd0/d$a;", "Lwd0/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Liy/b0;", "pin", "Lkotlin/Function1;", "Loq/i0;", "onPinChanged", "", "title", "description", "Lwd0/h$a$b;", "h", "(Lxd0/d$a;Liy/b0;Ler/l;ILjava/lang/Integer;)Lwd0/h$a$b;", "s", "(Lxd0/d$a;)Lwd0/h$a;", "Lcb4/d;", "m", "()Lcb4/d;", "Lmx/a;", "r", "()Lmx/a;", "a", "Lmx/c;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: xd0.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"¨\u0006#"}, d2 = {"Lxd0/d$a;", "", "Lwd0/g;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onCurrentPinChanged", "onNewPinChanged", "onConfirmNewPinChanged", "Lkotlin/Function0;", "backAction", "<init>", "(Lwd0/g;Ler/l;Ler/l;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwd0/g;", "e", "()Lwd0/g;", "b", "Ler/l;", "c", "()Ler/l;", "d", "Ler/a;", "()Ler/a;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f218032f = b0.f97726c | hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onCurrentPinChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onNewPinChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onConfirmNewPinChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(g gVar, l<? super b0, i0> lVar, l<? super b0, i0> lVar2, l<? super b0, i0> lVar3, er.a<i0> aVar) {
            this.state = gVar;
            this.onCurrentPinChanged = lVar;
            this.onNewPinChanged = lVar2;
            this.onConfirmNewPinChanged = lVar3;
            this.backAction = aVar;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final l<b0, i0> b() {
            return this.onConfirmNewPinChanged;
        }

        public final l<b0, i0> c() {
            return this.onCurrentPinChanged;
        }

        public final l<b0, i0> d() {
            return this.onNewPinChanged;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final g getState() {
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
            return t.c(this.state, params.state) && t.c(this.onCurrentPinChanged, params.onCurrentPinChanged) && t.c(this.onNewPinChanged, params.onNewPinChanged) && t.c(this.onConfirmNewPinChanged, params.onConfirmNewPinChanged) && t.c(this.backAction, params.backAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onCurrentPinChanged.hashCode()) * 31) + this.onNewPinChanged.hashCode()) * 31) + this.onConfirmNewPinChanged.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCurrentPinChanged=" + this.onCurrentPinChanged + ", onNewPinChanged=" + this.onNewPinChanged + ", onConfirmNewPinChanged=" + this.onConfirmNewPinChanged + ", backAction=" + this.backAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f218038a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(230355651);
            if (p076m2.t.k()) {
                p076m2.t.o(230355651, i15, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.resetpin.main.mapper.ResetPinMapper.createBasicPinInputModel.<anonymous> (ResetPinMapper.kt:101)");
            }
            long headerIconBackground = ((SetPinThemeColors) rVar.N(e.e())).getHeaderIconBackground();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return headerIconBackground;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final h.a.Initialized h(Params params, b0 pin, final l<? super b0, i0> onPinChanged, int title, Integer description) {
        Label labelC;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(pd0.a.f157005p), null, null, null, 28, null), null, null, null, null, 61, null);
        int i15 = jz.a.f106790i;
        b bVar = b.f218038a;
        Label labelC2 = this.labelProvider.c(title);
        if (description != null) {
            labelC = this.labelProvider.c(description.intValue());
        } else {
            labelC = null;
        }
        return new h.a.Initialized(new BasicPinInputScreenData(baseScaffoldData, new o40.a.Icon(i15, null, bVar, labelC2, labelC, null, 34, null), new v50.c.Pin(null, null, mx.b.b(c0.e(pin), "resetPinTag"), params.getState().getData().getValidationState(), null, null, new l() { // from class: xd0.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.i(onPinChanged, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 6, null, 196531, null), true, new er.a() { // from class: xd0.b
            @Override // er.a
            public final Object a() {
                return d.l();
            }
        }), false, params.a(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, String str) {
        lVar.b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        return i0.f148189a;
    }

    public final DialogData m() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(pd0.a.f156994e), null, new DialogButtonTextData(this.labelProvider.c(pd0.a.f156990a), null, new er.a() { // from class: xd0.c
            @Override // er.a
            public final Object a() {
                return d.q();
            }
        }, 2, null), null, null, null, 116, null);
    }

    public final Label r() {
        return this.labelProvider.c(pd0.a.f156991b);
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public h.a b(Params params) {
        g state = params.getState();
        if ((state instanceof g.ConfirmCurrentPin) || (state instanceof g.CheckCurrentPin)) {
            return h(params, state.getData().getCurrentPin(), params.c(), pd0.a.f156993d, null);
        }
        if ((state instanceof g.NewPin) || (state instanceof g.CheckNewPin)) {
            return h(params, state.getData().getNewPin(), params.d(), pd0.a.f157003n, Integer.valueOf(pd0.a.f157001l));
        }
        if ((state instanceof g.ConfirmNewPin) || (state instanceof g.CheckConfirmedNewPin)) {
            return h(params, state.getData().getRepeatedNewPin(), params.b(), pd0.a.f156998i, Integer.valueOf(pd0.a.f156997h));
        }
        if (!(state instanceof g.SetNewPin)) {
            if (state instanceof g.Error) {
                return new h.a.Error(((g.Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        return h(params, ((g.SetNewPin) state).getData().getRepeatedNewPin(), params.b(), pd0.a.f156998i, Integer.valueOf(pd0.a.f156997h));
    }
}
