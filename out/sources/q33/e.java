package q33;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import cb4.i;
import d60.ScrollControllerData;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import k23.o;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import r30.CheckBoxRowData;
import u30.CheckBoxGroupData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000f\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lq33/e;", "Lxw/f;", "Lq33/e$a;", "Lo33/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "testTag", "webAddress", "Lkotlin/Function1;", "Loq/i0;", "onValueChanged", "Lp33/b;", "i", "(Lq33/e$a;Ljava/lang/String;Ljava/lang/String;Ler/l;)Lp33/b;", "", "stringId", "Lmx/a;", "u", "(I)Lmx/a;", "params", "l", "(Lq33/e$a;)Lo33/d$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, o33.d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: q33.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b(\u0010'R)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b \u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b\u001c\u0010#R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b$\u0010#¨\u0006+"}, d2 = {"Lq33/e$a;", "", "Lo33/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextClick", "Lkotlin/Function1;", "Lk23/o;", "onWebAddressAnswerChanged", "", "onWebAddressChanged", "Lkotlin/Function2;", "Lk23/c;", "", "onBusinessChanged", "onBack", "onClose", "<init>", "(Lo33/c;Ler/a;Ler/l;Ler/l;Ler/p;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lo33/c;", "g", "()Lo33/c;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Ler/l;", "e", "()Ler/l;", "f", "Ler/p;", "()Ler/p;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o33.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<o, i0> onWebAddressAnswerChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onWebAddressChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<k23.c, Boolean, i0> onBusinessChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(o33.c cVar, er.a<i0> aVar, l<? super o, i0> lVar, l<? super String, i0> lVar2, p<? super k23.c, ? super Boolean, i0> pVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = cVar;
            this.onNextClick = aVar;
            this.onWebAddressAnswerChanged = lVar;
            this.onWebAddressChanged = lVar2;
            this.onBusinessChanged = pVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final p<k23.c, Boolean, i0> b() {
            return this.onBusinessChanged;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        public final er.a<i0> d() {
            return this.onNextClick;
        }

        public final l<o, i0> e() {
            return this.onWebAddressAnswerChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onWebAddressAnswerChanged, params.onWebAddressAnswerChanged) && t.c(this.onWebAddressChanged, params.onWebAddressChanged) && t.c(this.onBusinessChanged, params.onBusinessChanged) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final l<String, i0> f() {
            return this.onWebAddressChanged;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final o33.c getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onNextClick.hashCode()) * 31) + this.onWebAddressAnswerChanged.hashCode()) * 31) + this.onWebAddressChanged.hashCode()) * 31) + this.onBusinessChanged.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextClick=" + this.onNextClick + ", onWebAddressAnswerChanged=" + this.onWebAddressAnswerChanged + ", onWebAddressChanged=" + this.onWebAddressChanged + ", onBusinessChanged=" + this.onBusinessChanged + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final p33.b i(Params params, String str, String str2, l<? super String, i0> lVar) {
        return new p33.b(new v50.c.Text(str, u(h23.b.f80129c1), null, mx.b.b(str2, ""), params.getState().getForm().getWebAddressValidation(), null, null, lVar, null, false, 0, null, true, null, false, null, null, null, null, null, 1044324, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.e().b(o.YES);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.e().b(o.NO);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, boolean z15) {
        params.b().B(k23.c.SELLER, Boolean.valueOf(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, boolean z15) {
        params.b().B(k23.c.SUPPLIER, Boolean.valueOf(z15));
        return i0.f148189a;
    }

    private final Label u(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public o33.d.Data b(final Params params) {
        o33.c state = params.getState();
        o33.c.Dialog dialog = state instanceof o33.c.Dialog ? (o33.c.Dialog) state : null;
        i dialogVMSAdapter = dialog != null ? dialog.getDialogVMSAdapter() : null;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), u(h23.b.f80126b1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, new ScrollControllerData(params.getState().getForm().e(), false, false, 6, null), 29, null);
        Label labelU = u(h23.b.W0);
        List listQ = v.q(new RadioButtonRow(new RadioButtonItemData(false, params.getState().getForm().getWebAddressAnswer() == o.YES, false, 5, null), new er.a() { // from class: q33.a
            @Override // er.a
            public final Object a() {
                return e.m(params);
            }
        }, u(h23.b.f80131d0), null, i(params, "webAddress", params.getState().getForm().getWebAddress(), params.f()), 8, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getForm().getWebAddressAnswer() == o.NO, false, 5, null), new er.a() { // from class: q33.b
            @Override // er.a
            public final Object a() {
                return e.q(params);
            }
        }, u(h23.b.I), null, null, 24, null));
        b50.e.a aVar = b50.e.a.f16684a;
        hz.b webAddressAnswerValidation = params.getState().getForm().getWebAddressAnswerValidation();
        RadioButtonData radioButtonData = new RadioButtonData(listQ, aVar, webAddressAnswerValidation instanceof hz.b.Invalid ? new b50.d.Error(((hz.b.Invalid) webAddressAnswerValidation).getMessage()) : b50.d.c.f16683a, null, null, null, o33.c.b.WEB_ADDRESS_ANSWER, 56, null);
        Label labelU2 = u(h23.b.X0);
        Label labelU3 = u(h23.b.Y0);
        List listQ2 = v.q(new CheckBoxRowData(null, params.getState().getForm().c().contains(k23.c.SELLER), new l() { // from class: q33.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.r(params, ((Boolean) obj).booleanValue());
            }
        }, u(h23.b.Z0), null, null, null, null, 241, null), new CheckBoxRowData(null, params.getState().getForm().c().contains(k23.c.SUPPLIER), new l() { // from class: q33.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.s(params, ((Boolean) obj).booleanValue());
            }
        }, u(h23.b.f80123a1), null, null, null, null, 241, null));
        hz.b businessValidation = params.getState().getForm().getBusinessValidation();
        return new o33.d.Data(dialogVMSAdapter, baseScaffoldData, labelU, radioButtonData, labelU2, labelU3, new CheckBoxGroupData(listQ2, null, businessValidation instanceof hz.b.Invalid ? new r30.b.Error(null, ((hz.b.Invalid) businessValidation).getMessage(), 1, null) : r30.b.a.f171263a, null, false, o33.c.b.BUSINESS_DETAILS, 26, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(h23.b.H), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null), params.a());
    }
}
