package g33;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import d60.ScrollControllerData;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k23.m;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import t50.TextAreaData;
import t50.e;
import t50.s;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000f\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lg33/d;", "Lxw/f;", "Lg33/d$a;", "Le33/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "testTag", "name", "Lkotlin/Function1;", "Loq/i0;", "onValueChanged", "Lf33/b;", "h", "(Lg33/d$a;Ljava/lang/String;Ljava/lang/String;Ler/l;)Lf33/b;", "", "stringId", "Lmx/a;", "r", "(I)Lmx/a;", "params", "l", "(Lg33/d$a;)Le33/d$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, e33.d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g33.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\"\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\u001a\u0010!R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001e\u0010!¨\u0006'"}, d2 = {"Lg33/d$a;", "", "Le33/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextClick", "Lkotlin/Function1;", "Lk23/m;", "onSelectLocationType", "", "onLocationPropertyChanged", "onLocationCarriageChanged", "onBack", "onClose", "<init>", "(Le33/c;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le33/c;", "g", "()Le33/c;", "b", "Ler/a;", "e", "()Ler/a;", "c", "Ler/l;", "f", "()Ler/l;", "d", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e33.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<m, i0> onSelectLocationType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLocationPropertyChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLocationCarriageChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(e33.c cVar, er.a<i0> aVar, l<? super m, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = cVar;
            this.onNextClick = aVar;
            this.onSelectLocationType = lVar;
            this.onLocationPropertyChanged = lVar2;
            this.onLocationCarriageChanged = lVar3;
            this.onBack = aVar2;
            this.onClose = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final l<String, i0> c() {
            return this.onLocationCarriageChanged;
        }

        public final l<String, i0> d() {
            return this.onLocationPropertyChanged;
        }

        public final er.a<i0> e() {
            return this.onNextClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onSelectLocationType, params.onSelectLocationType) && t.c(this.onLocationPropertyChanged, params.onLocationPropertyChanged) && t.c(this.onLocationCarriageChanged, params.onLocationCarriageChanged) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final l<m, i0> f() {
            return this.onSelectLocationType;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final e33.c getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onNextClick.hashCode()) * 31) + this.onSelectLocationType.hashCode()) * 31) + this.onLocationPropertyChanged.hashCode()) * 31) + this.onLocationCarriageChanged.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextClick=" + this.onNextClick + ", onSelectLocationType=" + this.onSelectLocationType + ", onLocationPropertyChanged=" + this.onLocationPropertyChanged + ", onLocationCarriageChanged=" + this.onLocationCarriageChanged + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70300a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.CARRIAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70300a = iArr;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final f33.b h(Params params, String str, String str2, l<? super String, i0> lVar) {
        Label labelR;
        int i15 = b.f70300a[params.getState().getForm().getSelectedLocationType().ordinal()];
        if (i15 == 1) {
            labelR = r(h23.b.M0);
        } else {
            if (i15 != 2) {
                throw new p();
            }
            labelR = r(h23.b.I0);
        }
        Label label = labelR;
        s.Fix fix = new s.Fix(0, 1, null);
        hz.b locationNameValidation = params.getState().getForm().getLocationNameValidation();
        return new f33.b(new TextAreaData(str, label, fix, null, locationNameValidation instanceof hz.b.Invalid ? new e.Error(((hz.b.Invalid) locationNameValidation).getMessage()) : new e.Default(null, 1, null), str2, false, new t50.a.Visible(300, new l() { // from class: g33.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.i(((Boolean) obj).booleanValue());
            }
        }), null, 0, null, null, lVar, null, 12104, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.f().b(m.PROPERTY);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.f().b(m.CARRIAGE);
        return i0.f148189a;
    }

    private final Label r(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e33.d.Data b(final Params params) {
        e33.c state = params.getState();
        e33.c.Dialog dialog = state instanceof e33.c.Dialog ? (e33.c.Dialog) state : null;
        return new e33.d.Data(dialog != null ? dialog.getDialogVMSAdapter() : null, new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), r(h23.b.L), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, new ScrollControllerData(params.getState().getForm().f(), false, false, 6, null), 29, null), r(h23.b.K0), new RadioButtonData(v.q(new RadioButtonRow(new RadioButtonItemData(false, params.getState().getForm().getSelectedLocationType() == m.PROPERTY, false, 5, null), new er.a() { // from class: g33.b
            @Override // er.a
            public final Object a() {
                return d.m(params);
            }
        }, r(h23.b.L0), null, h(params, "PropertyTextArea", params.getState().getForm().getLocationNameProperty(), params.d()), 8, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getForm().getSelectedLocationType() == m.CARRIAGE, false, 5, null), new er.a() { // from class: g33.c
            @Override // er.a
            public final Object a() {
                return d.q(params);
            }
        }, r(h23.b.H0), null, h(params, "CarriageTextArea", params.getState().getForm().getLocationNameCarriage(), params.c()), 8, null)), b50.e.a.f16684a, null, null, null, null, e33.c.b.f47092a, 60, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(h23.b.H), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null), params.a());
    }
}
