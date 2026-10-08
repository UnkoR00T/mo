package e51;

import er.l;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import l3.o;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import oq.y;
import p071kotlin.Metadata;
import p079n1.k3;
import p079n1.l3;
import pq.v0;
import q40.IconPageData;
import q40.j;
import r30.CheckBoxRowData;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\n*\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Le51/g;", "Lxw/f;", "Le51/g$a;", "Lc51/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lmx/a;", "info", "title", "Lj70/a;", "accessibilityReadMode", "Lh30/a;", "buttonData", "Ln50/g;", "m", "(Lmx/a;Lmx/a;Lj70/a;Lh30/a;)Ln50/g;", "Liy/b0;", "F", "(Liy/b0;)Lmx/a;", "params", "r", "(Le51/g$a;)Lc51/d$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lez/e;", "getDateFormatter", "()Lez/e;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, c51.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: e51.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b0\u0010/R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b+\u0010/R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b)\u0010(R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b3\u0010(R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b%\u0010/R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b!\u0010(R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b2\u0010(¨\u00064"}, d2 = {"Le51/g$a;", "", "Lc51/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextButtonClick", "onBack", "onClose", "Lkotlin/Function1;", "", "onStatementCheckBoxChange", "onResetScrollRequests", "Lg30/v;", "onBottomSheetValueChange", "Liy/b0;", "onAddSecondNameInputValueChange", "onAddSecondNameButtonClick", "onOpenAddSecondNameBottomSheet", "onAddNextNameInputValueChange", "onAddNextNameButtonClick", "onOpenAddNextNameBottomSheet", "<init>", "(Lc51/c;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lc51/c;", "m", "()Lc51/c;", "b", "Ler/a;", "h", "()Ler/a;", "c", "e", "d", "g", "Ler/l;", "l", "()Ler/l;", "f", "k", "i", "j", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c51.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onStatementCheckBoxChange;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onResetScrollRequests;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<v, i0> onBottomSheetValueChange;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onAddSecondNameInputValueChange;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddSecondNameButtonClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenAddSecondNameBottomSheet;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onAddNextNameInputValueChange;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddNextNameButtonClick;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenAddNextNameBottomSheet;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(c51.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super Boolean, i0> lVar, er.a<i0> aVar4, l<? super v, i0> lVar2, l<? super b0, i0> lVar3, er.a<i0> aVar5, er.a<i0> aVar6, l<? super b0, i0> lVar4, er.a<i0> aVar7, er.a<i0> aVar8) {
            this.state = cVar;
            this.onNextButtonClick = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
            this.onStatementCheckBoxChange = lVar;
            this.onResetScrollRequests = aVar4;
            this.onBottomSheetValueChange = lVar2;
            this.onAddSecondNameInputValueChange = lVar3;
            this.onAddSecondNameButtonClick = aVar5;
            this.onOpenAddSecondNameBottomSheet = aVar6;
            this.onAddNextNameInputValueChange = lVar4;
            this.onAddNextNameButtonClick = aVar7;
            this.onOpenAddNextNameBottomSheet = aVar8;
        }

        public final er.a<i0> a() {
            return this.onAddNextNameButtonClick;
        }

        public final l<b0, i0> b() {
            return this.onAddNextNameInputValueChange;
        }

        public final er.a<i0> c() {
            return this.onAddSecondNameButtonClick;
        }

        public final l<b0, i0> d() {
            return this.onAddSecondNameInputValueChange;
        }

        public final er.a<i0> e() {
            return this.onBack;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onStatementCheckBoxChange, params.onStatementCheckBoxChange) && t.c(this.onResetScrollRequests, params.onResetScrollRequests) && t.c(this.onBottomSheetValueChange, params.onBottomSheetValueChange) && t.c(this.onAddSecondNameInputValueChange, params.onAddSecondNameInputValueChange) && t.c(this.onAddSecondNameButtonClick, params.onAddSecondNameButtonClick) && t.c(this.onOpenAddSecondNameBottomSheet, params.onOpenAddSecondNameBottomSheet) && t.c(this.onAddNextNameInputValueChange, params.onAddNextNameInputValueChange) && t.c(this.onAddNextNameButtonClick, params.onAddNextNameButtonClick) && t.c(this.onOpenAddNextNameBottomSheet, params.onOpenAddNextNameBottomSheet);
        }

        public final l<v, i0> f() {
            return this.onBottomSheetValueChange;
        }

        public final er.a<i0> g() {
            return this.onClose;
        }

        public final er.a<i0> h() {
            return this.onNextButtonClick;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.state.hashCode() * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onStatementCheckBoxChange.hashCode()) * 31) + this.onResetScrollRequests.hashCode()) * 31) + this.onBottomSheetValueChange.hashCode()) * 31) + this.onAddSecondNameInputValueChange.hashCode()) * 31) + this.onAddSecondNameButtonClick.hashCode()) * 31) + this.onOpenAddSecondNameBottomSheet.hashCode()) * 31) + this.onAddNextNameInputValueChange.hashCode()) * 31) + this.onAddNextNameButtonClick.hashCode()) * 31) + this.onOpenAddNextNameBottomSheet.hashCode();
        }

        public final er.a<i0> i() {
            return this.onOpenAddNextNameBottomSheet;
        }

        public final er.a<i0> j() {
            return this.onOpenAddSecondNameBottomSheet;
        }

        public final er.a<i0> k() {
            return this.onResetScrollRequests;
        }

        public final l<Boolean, i0> l() {
            return this.onStatementCheckBoxChange;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final c51.c getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextButtonClick=" + this.onNextButtonClick + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onStatementCheckBoxChange=" + this.onStatementCheckBoxChange + ", onResetScrollRequests=" + this.onResetScrollRequests + ", onBottomSheetValueChange=" + this.onBottomSheetValueChange + ", onAddSecondNameInputValueChange=" + this.onAddSecondNameInputValueChange + ", onAddSecondNameButtonClick=" + this.onAddSecondNameButtonClick + ", onOpenAddSecondNameBottomSheet=" + this.onOpenAddSecondNameBottomSheet + ", onAddNextNameInputValueChange=" + this.onAddNextNameInputValueChange + ", onAddNextNameButtonClick=" + this.onAddNextNameButtonClick + ", onOpenAddNextNameBottomSheet=" + this.onOpenAddNextNameBottomSheet + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f47614b;

        static {
            int[] iArr = new int[xw.e.values().length];
            try {
                iArr[xw.e.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xw.e.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f47613a = iArr;
            int[] iArr2 = new int[c51.b.values().length];
            try {
                iArr2[c51.b.SECOND_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[c51.b.NEXT_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f47614b = iArr2;
        }
    }

    public g(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(c51.c cVar, Params params, k3 k3Var) {
        int i15 = b.f47614b[((c51.c.Initialized) cVar).getBottomSheetInputField().ordinal()];
        if (i15 == 1) {
            params.c().a();
        } else {
            if (i15 != 2) {
                throw new p();
            }
            params.a().a();
        }
        return i0.f148189a;
    }

    private final Label F(b0 b0Var) {
        String strE;
        if (b0Var == null || (strE = c0.e(b0Var)) == null) {
            strE = "";
        }
        return new Label(strE, "");
    }

    private final DefaultSingleCardData m(Label info, Label title, j70.a accessibilityReadMode, ButtonData buttonData) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(info, null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(title, null, null, 0, 0, accessibilityReadMode, 30, null)), null, 4, null), null, buttonData != null ? new x0.Button(buttonData) : null, null, 2815, null);
    }

    static /* synthetic */ DefaultSingleCardData q(g gVar, Label label, Label label2, j70.a aVar, ButtonData buttonData, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            aVar = j70.a.LOWER_CASE;
        }
        if ((i15 & 8) != 0) {
            buttonData = null;
        }
        return gVar.m(label, label2, aVar, buttonData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.f().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.f().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, boolean z15) {
        params.l().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(c51.c cVar, Params params, String str) {
        int i15 = b.f47614b[((c51.c.Initialized) cVar).getBottomSheetInputField().ordinal()];
        if (i15 == 1) {
            params.d().b(c0.g(str));
        } else {
            if (i15 != 2) {
                throw new p();
            }
            params.b().b(c0.g(str));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l3 z(final c51.c cVar, final Params params, o oVar) {
        return new l3(new l() { // from class: e51.a
            @Override // er.l
            public final Object b(Object obj) {
                return g.E(cVar, params, (k3) obj);
            }
        }, null, null, null, null, null, 62, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public c51.d.a b(final Params params) {
        Label labelC;
        r30.b error;
        Label labelN;
        Label labelN2;
        Label labelF;
        hz.b addSecondNameValidationState;
        er.a<i0> aVarC;
        mx.c cVar = this.labelProvider;
        final c51.c state = params.getState();
        if (t.c(state, c51.c.C0624c.f23561a)) {
            return c51.d.a.c.f23581a;
        }
        if (state instanceof c51.c.a) {
            return new c51.d.a.Empty(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.e()), this.labelProvider.c(j31.a.O2), null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(new j.a(jz.a.f106849q2), cVar.c(j31.a.f99227v3), null, null, null, null, false, 76, null));
        }
        if (!(state instanceof c51.c.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.e()), this.labelProvider.c(j31.a.f99222u3), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.g(), 6, null)), null, 20, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: e51.b
            @Override // er.a
            public final Object a() {
                return g.s(params);
            }
        })), null, null, 53, null);
        c51.c.Initialized initialized = (c51.c.Initialized) state;
        ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(initialized.getBottomSheetValue(), false, params.f()), cVar.c(j31.a.I0), new er.a() { // from class: e51.c
            @Override // er.a
            public final Object a() {
                return g.u(params);
            }
        }, null, 8, null);
        Label labelC2 = cVar.c(j31.a.L0);
        DefaultSingleCardData defaultSingleCardDataQ = q(this, this.labelProvider.c(j31.a.f99221u2), mx.b.b(c0.e(initialized.getPersonalData().getFirstName()), "NameValue"), null, null, 12, null);
        Label labelC3 = this.labelProvider.c(j31.a.T2);
        b0 secondName = initialized.getPersonalData().getSecondName();
        Label labelD = mx.b.d(secondName != null ? c0.e(secondName) : null, "SecondNameValue");
        k30.a.b bVar = k30.a.b.f107765a;
        k30.c.WithText withText = new k30.c.WithText(cVar.c(j31.a.f99126b2).n("AddSecondName"), null, 2, null);
        k30.d.a aVar = k30.d.a.f107773a;
        DefaultSingleCardData defaultSingleCardDataQ2 = q(this, labelC3, labelD, null, initialized.getSecondNameCanBeChangedManually() ? new ButtonData(null, null, bVar, withText, aVar, null, params.j(), 35, null) : null, 4, null);
        Label labelC4 = this.labelProvider.c(j31.a.f99239y2);
        b0 nextNames = initialized.getPersonalData().getNextNames();
        CardListData cardListData = new CardListData(pq.v.q(defaultSingleCardDataQ, defaultSingleCardDataQ2, q(this, labelC4, mx.b.d(nextNames != null ? c0.e(nextNames) : null, "NextNameValue"), null, new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(j31.a.f99126b2).n("AddNextName"), null, 2, null), aVar, null, params.i(), 35, null), 4, null), q(this, this.labelProvider.c(j31.a.f99231w2), mx.b.b(c0.e(initialized.getPersonalData().getSurname()), "SurnameValue"), null, null, 12, null), q(this, this.labelProvider.c(j31.a.f99216t2), mx.b.b(c0.e(initialized.getPersonalData().getFamilyName()), "FamilyNameValue"), null, null, 12, null), q(this, this.labelProvider.c(j31.a.F2), mx.b.b(c0.e(initialized.getPersonalData().getPesel()), "PeselValue"), j70.a.LETTER_BY_LETTER, null, 8, null), q(this, this.labelProvider.c(j31.a.V1), mx.b.b(this.dateFormatter.d(initialized.getPersonalData().getBirth().getDate(), fz.c.DOTTED), "BirthDateValue"), null, null, 12, null), q(this, this.labelProvider.c(j31.a.W1), mx.b.b(c0.e(initialized.getPersonalData().getBirth().getPlace()), "BirthPlaceValue"), null, null, 12, null), q(this, this.labelProvider.c(j31.a.f99156h2), mx.b.b(c0.e(initialized.getPersonalData().getNationality()), "CitizenshipValue"), null, null, 12, null)), null, false, null, null, 30, null);
        Label labelC5 = cVar.c(j31.a.X2);
        boolean isStatementCheckBoxChecked = initialized.getIsStatementCheckBoxChecked();
        l lVar = new l() { // from class: e51.d
            @Override // er.l
            public final Object b(Object obj) {
                return g.v(params, ((Boolean) obj).booleanValue());
            }
        };
        int i15 = b.f47613a[initialized.getPersonalData().getBirth().getGender().ordinal()];
        if (i15 == 1) {
            labelC = cVar.c(j31.a.J0);
        } else {
            if (i15 != 2) {
                throw new p();
            }
            labelC = cVar.c(j31.a.K0);
        }
        CheckBoxRowData checkBoxRowData = new CheckBoxRowData(null, isStatementCheckBoxChecked, lVar, labelC, null, null, null, null, 241, null);
        boolean isStatementCheckBoxError = initialized.getIsStatementCheckBoxError();
        if (!isStatementCheckBoxError) {
            error = r30.b.a.f171263a;
        } else {
            if (!isStatementCheckBoxError) {
                throw new p();
            }
            error = new r30.b.Error(null, cVar.c(j31.a.Y2), 1, null);
        }
        CheckBoxSingleData checkBoxSingleData = new CheckBoxSingleData(checkBoxRowData, error, null, false, null, 28, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(j31.a.f99235x2), null, 2, null), aVar, null, params.h(), 35, null);
        boolean shouldScrollToStatementSection = initialized.getShouldScrollToStatementSection();
        c51.b bottomSheetInputField = initialized.getBottomSheetInputField();
        int[] iArr = b.f47614b;
        int i16 = iArr[bottomSheetInputField.ordinal()];
        if (i16 == 1) {
            labelN = cVar.c(j31.a.T2).n("BottomSheetSecondName");
        } else {
            if (i16 != 2) {
                throw new p();
            }
            labelN = cVar.c(j31.a.f99239y2).n("BottomSheetNextName");
        }
        Label label = labelN;
        int i17 = iArr[initialized.getBottomSheetInputField().ordinal()];
        if (i17 == 1) {
            labelN2 = null;
        } else {
            if (i17 != 2) {
                throw new p();
            }
            labelN2 = cVar.c(j31.a.f99233x0).n("BottomSheetNextNameHelper");
        }
        int i18 = iArr[initialized.getBottomSheetInputField().ordinal()];
        if (i18 == 1) {
            labelF = F(initialized.getAddSecondNameInputValue());
        } else {
            if (i18 != 2) {
                throw new p();
            }
            labelF = F(initialized.getAddNextNameInputValue());
        }
        Label label2 = labelF;
        int i19 = iArr[initialized.getBottomSheetInputField().ordinal()];
        if (i19 == 1) {
            addSecondNameValidationState = initialized.getAddSecondNameValidationState();
        } else {
            if (i19 != 2) {
                throw new p();
            }
            addSecondNameValidationState = initialized.getAddNextNameValidationState();
        }
        v50.c.Text text = new v50.c.Text(null, label, null, label2, addSecondNameValidationState, labelN2, null, new l() { // from class: e51.e
            @Override // er.l
            public final Object b(Object obj) {
                return g.x(state, params, (String) obj);
            }
        }, null, false, 0, new l() { // from class: e51.f
            @Override // er.l
            public final Object b(Object obj) {
                return g.z(state, params, (o) obj);
            }
        }, false, null, false, null, null, null, null, null, 1046341, null);
        boolean z15 = initialized.getBottomSheetValue() != v.HIDDEN;
        k30.c.WithText withText2 = new k30.c.WithText(cVar.c(j31.a.f99126b2).n("BottomSheetAdd"), null, 2, null);
        k30.a.Large large = new k30.a.Large(false, 1, null);
        int i25 = iArr[initialized.getBottomSheetInputField().ordinal()];
        if (i25 == 1) {
            aVarC = params.c();
        } else {
            if (i25 != 2) {
                throw new p();
            }
            aVarC = params.a();
        }
        return new c51.d.a.Initialized(baseScaffoldData, modalBottomSheetData, labelC2, cardListData, labelC5, checkBoxSingleData, buttonData, shouldScrollToStatementSection, text, z15, new ButtonData(null, null, large, withText2, aVar, null, aVarC, 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(j31.a.f99126b2).n("BottomSheetAddNextName"), null, 2, null), aVar, null, params.a(), 35, null), params.e(), params.k());
    }
}
