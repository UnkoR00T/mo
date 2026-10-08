package vp2;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import q40.IconPageData;
import q40.j;
import up2.d;
import up2.e;
import v40.InputDateTimeData;
import wp2.FieldItem;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import xw.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lvp2/b;", "Lxw/f;", "Lvp2/b$a;", "Lup2/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lkq2/b;", "Lmx/a;", "e", "(Lkq2/b;)Lmx/a;", "params", "f", "(Lvp2/b$a;)Lup2/e$a;", "a", "Lmx/c;", "b", "Lez/e;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: vp2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b(\u0010'R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010'R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010-R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b.\u0010-R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010-R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b+\u0010-R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010-R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b%\u0010-R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b1\u0010-R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010-R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b2\u0010-R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b4\u0010'¨\u00065"}, d2 = {"Lvp2/b$a;", "", "Lup2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onClose", "onNext", "Lkotlin/Function1;", "", "onFirstNameChanged", "onSecondNameChanged", "onOtherNameChanged", "onLastNameChanged", "Lxw/g;", "onPeselNumberChanged", "onBirthPlaceChanged", "", "onNoNameSwitchChanged", "onNoLastNameSwitchChanged", "onNoPeselSwitchChanged", "toDatePicker", "<init>", "(Lup2/d;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lup2/d;", "m", "()Lup2/d;", "b", "Ler/a;", "()Ler/a;", "c", "d", "f", "e", "Ler/l;", "()Ler/l;", "l", "g", "j", "h", "i", "k", "n", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onFirstNameChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onSecondNameChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onOtherNameChanged;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLastNameChanged;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<g, i0> onPeselNumberChanged;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onBirthPlaceChanged;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onNoNameSwitchChanged;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onNoLastNameSwitchChanged;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onNoPeselSwitchChanged;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toDatePicker;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3, l<? super String, i0> lVar4, l<? super g, i0> lVar5, l<? super String, i0> lVar6, l<? super Boolean, i0> lVar7, l<? super Boolean, i0> lVar8, l<? super Boolean, i0> lVar9, er.a<i0> aVar4) {
            this.state = dVar;
            this.onBack = aVar;
            this.onClose = aVar2;
            this.onNext = aVar3;
            this.onFirstNameChanged = lVar;
            this.onSecondNameChanged = lVar2;
            this.onOtherNameChanged = lVar3;
            this.onLastNameChanged = lVar4;
            this.onPeselNumberChanged = lVar5;
            this.onBirthPlaceChanged = lVar6;
            this.onNoNameSwitchChanged = lVar7;
            this.onNoLastNameSwitchChanged = lVar8;
            this.onNoPeselSwitchChanged = lVar9;
            this.toDatePicker = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<String, i0> b() {
            return this.onBirthPlaceChanged;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        public final l<String, i0> d() {
            return this.onFirstNameChanged;
        }

        public final l<String, i0> e() {
            return this.onLastNameChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onNext, params.onNext) && t.c(this.onFirstNameChanged, params.onFirstNameChanged) && t.c(this.onSecondNameChanged, params.onSecondNameChanged) && t.c(this.onOtherNameChanged, params.onOtherNameChanged) && t.c(this.onLastNameChanged, params.onLastNameChanged) && t.c(this.onPeselNumberChanged, params.onPeselNumberChanged) && t.c(this.onBirthPlaceChanged, params.onBirthPlaceChanged) && t.c(this.onNoNameSwitchChanged, params.onNoNameSwitchChanged) && t.c(this.onNoLastNameSwitchChanged, params.onNoLastNameSwitchChanged) && t.c(this.onNoPeselSwitchChanged, params.onNoPeselSwitchChanged) && t.c(this.toDatePicker, params.toDatePicker);
        }

        public final er.a<i0> f() {
            return this.onNext;
        }

        public final l<Boolean, i0> g() {
            return this.onNoLastNameSwitchChanged;
        }

        public final l<Boolean, i0> h() {
            return this.onNoNameSwitchChanged;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onNext.hashCode()) * 31) + this.onFirstNameChanged.hashCode()) * 31) + this.onSecondNameChanged.hashCode()) * 31) + this.onOtherNameChanged.hashCode()) * 31) + this.onLastNameChanged.hashCode()) * 31) + this.onPeselNumberChanged.hashCode()) * 31) + this.onBirthPlaceChanged.hashCode()) * 31) + this.onNoNameSwitchChanged.hashCode()) * 31) + this.onNoLastNameSwitchChanged.hashCode()) * 31) + this.onNoPeselSwitchChanged.hashCode()) * 31) + this.toDatePicker.hashCode();
        }

        public final l<Boolean, i0> i() {
            return this.onNoPeselSwitchChanged;
        }

        public final l<String, i0> j() {
            return this.onOtherNameChanged;
        }

        public final l<g, i0> k() {
            return this.onPeselNumberChanged;
        }

        public final l<String, i0> l() {
            return this.onSecondNameChanged;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public final er.a<i0> n() {
            return this.toDatePicker;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onNext=" + this.onNext + ", onFirstNameChanged=" + this.onFirstNameChanged + ", onSecondNameChanged=" + this.onSecondNameChanged + ", onOtherNameChanged=" + this.onOtherNameChanged + ", onLastNameChanged=" + this.onLastNameChanged + ", onPeselNumberChanged=" + this.onPeselNumberChanged + ", onBirthPlaceChanged=" + this.onBirthPlaceChanged + ", onNoNameSwitchChanged=" + this.onNoNameSwitchChanged + ", onNoLastNameSwitchChanged=" + this.onNoLastNameSwitchChanged + ", onNoPeselSwitchChanged=" + this.onNoPeselSwitchChanged + ", toDatePicker=" + this.toDatePicker + ')';
        }
    }

    /* JADX INFO: renamed from: vp2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5461b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207878a;

        static {
            int[] iArr = new int[kq2.b.values().length];
            try {
                iArr[kq2.b.PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kq2.b.GUARDIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f207878a = iArr;
        }
    }

    public b(c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label e(kq2.b bVar) {
        int i15 = C5461b.f207878a[bVar.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(bp2.a.f21074j);
        }
        if (i15 == 2) {
            return this.labelProvider.c(bp2.a.f21076k);
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, String str) {
        params.k().b(g.b(g.c(c0.g(str))));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e.a b(final Params params) {
        String strE;
        hz.b validationState;
        b0 b0VarD;
        d state = params.getState();
        if (!(state instanceof d.b.Presentation)) {
            if (state instanceof d.b.VerifyingAgreement) {
                return e.a.d.f199667a;
            }
            if (state instanceof d.b.Error) {
                return new e.a.Error(((d.b.Error) params.getState()).getErrorVMSAdapter());
            }
            if (t.c(state, d.a.f199620a)) {
                return new e.a.AgreementExists(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), null, null, null, null, 30, null), null, null, null, null, 61, null), new IconPageData(j.b.d.f164690d, this.labelProvider.c(bp2.a.C0), this.labelProvider.c(bp2.a.B0), null, i0.f148189a, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(bp2.a.f21072i), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), false, 72, null), params.a());
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(bp2.a.f21055b0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        Label labelE = e(((d.b.Presentation) params.getState()).getData().getWhoAgrees());
        v50.c.Text text = new v50.c.Text(null, this.labelProvider.c(bp2.a.f21088q), null, mx.b.b(c0.e(((d.b.Presentation) params.getState()).getData().f().d()), "firstName"), ((d.b.Presentation) params.getState()).getData().f().getValidationState(), null, null, params.d(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null);
        v50.c.Text text2 = new v50.c.Text(null, this.labelProvider.c(bp2.a.C), null, mx.b.b(c0.e(((d.b.Presentation) params.getState()).getData().n().d()), "secondName"), ((d.b.Presentation) params.getState()).getData().n().getValidationState(), null, null, params.l(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null);
        v50.c.Text text3 = new v50.c.Text(null, this.labelProvider.c(bp2.a.f21100w), null, mx.b.b(c0.e(((d.b.Presentation) params.getState()).getData().l().d()), "otherName"), ((d.b.Presentation) params.getState()).getData().l().getValidationState(), null, null, params.j(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null);
        v50.c.Text text4 = new v50.c.Text(null, this.labelProvider.c(bp2.a.f21094t), null, mx.b.b(c0.e(((d.b.Presentation) params.getState()).getData().g().d()), "lastName"), ((d.b.Presentation) params.getState()).getData().g().getValidationState(), null, null, params.e(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null);
        v50.c.Number number = new v50.c.Number(null, this.labelProvider.c(bp2.a.f21104y), null, mx.b.b(c0.e(((d.b.Presentation) params.getState()).getData().m().d().getValue()), "pesel"), ((d.b.Presentation) params.getState()).getData().m().getValidationState(), null, null, new l() { // from class: vp2.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.h(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, false, 1048421, null);
        Label labelC = this.labelProvider.c(bp2.a.f21054b);
        ez.e eVar = this.dateFormatter;
        FieldItem<b0> fieldItemC = ((d.b.Presentation) params.getState()).getData().c();
        if (fieldItemC == null || (b0VarD = fieldItemC.d()) == null || (strE = c0.e(b0VarD)) == null) {
            strE = "";
        }
        String str = strE;
        fz.c cVar = fz.c.DOTTED;
        String strD = eVar.d(new fz.b.String(str, cVar, false, 4, null), cVar);
        InputDateTimeData.b.C5303a c5303a = InputDateTimeData.b.C5303a.f203783c;
        FieldItem<b0> fieldItemC2 = ((d.b.Presentation) params.getState()).getData().c();
        if (fieldItemC2 == null || (validationState = fieldItemC2.getValidationState()) == null) {
            validationState = hz.b.C2039b.f86846c;
        }
        return new e.a.Initialized(baseScaffoldData, aVarA, labelE, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(bp2.a.f21090r), null, 2, null), k30.d.a.f107773a, null, params.f(), 35, null), !((d.b.Presentation) params.getState()).getData().getNoNameSwitchChecked(), !((d.b.Presentation) params.getState()).getData().getNoLastNameSwitchChecked(), text, text2, text3, text4, number, new v50.c.Text(null, this.labelProvider.c(bp2.a.f21060d), null, mx.b.b(c0.e(((d.b.Presentation) params.getState()).getData().d().d()), "birthPlace"), ((d.b.Presentation) params.getState()).getData().d().getValidationState(), null, null, params.b(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null), new InputDateTimeData(null, labelC, strD, c5303a, validationState, null, null, null, ((d.b.Presentation) params.getState()).getData().getDatePickerEnabled(), null, params.n(), 737, null), new s50.a.c(null, ((d.b.Presentation) params.getState()).getData().getNoNameSwitchChecked(), this.labelProvider.c(bp2.a.P), null, false, null, params.h(), null, 185, null), new s50.a.c(null, ((d.b.Presentation) params.getState()).getData().getNoLastNameSwitchChecked(), this.labelProvider.c(bp2.a.f21081m0), null, false, null, params.g(), null, 185, null), ((d.b.Presentation) params.getState()).getData().getNoPeselSwitchVisible() ? new s50.a.c(null, ((d.b.Presentation) params.getState()).getData().getNoPeselSwitchChecked(), this.labelProvider.c(bp2.a.f21083n0), null, false, null, params.i(), null, 185, null) : null, !((d.b.Presentation) params.getState()).getData().getNoPeselSwitchChecked());
    }
}
