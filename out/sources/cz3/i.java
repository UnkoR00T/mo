package cz3;

import androidx.compose.ui.graphics.Color;
import b70.RequirementItem;
import b70.RequirementListData;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import l3.o;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p079n1.k3;
import p079n1.l3;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcz3/i;", "Lxw/f;", "Lcz3/i$a;", "Lbz3/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lbz3/h;", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lbz3/h;)Z", "params", "r", "(Lcz3/i$a;)Lbz3/i$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, bz3.i.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: cz3.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\r\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b.\u0010+R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b/\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b$\u00102R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b(\u00102R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b6\u00105\u001a\u0004\b8\u00107R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b9\u00107R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b0\u0010=R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\b3\u0010=R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\b4\u0010=R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\b*\u0010<\u001a\u0004\b:\u0010=¨\u0006>"}, d2 = {"Lcz3/i$a;", "", "Lbz3/h;", "state", "Lmx/a;", "topMenuTitle", "headerTitle", "headerMessage", "inputPasswordTitle", "inputRepeatPasswordTitle", "", "backButtonVisible", "closeButtonVisible", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onPasswordChanged", "onRepeatedPasswordChanged", "onPasswordInputFocusChanged", "onRepeatPasswordInputFocusChanged", "Lkotlin/Function0;", "onBackButtonClick", "onCloseButtonClick", "onNextButtonClick", "onReadAccessibilityMessage", "<init>", "(Lbz3/h;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;ZZLer/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lbz3/h;", "o", "()Lbz3/h;", "b", "Lmx/a;", "p", "()Lmx/a;", "c", "d", "e", "f", "g", "Z", "()Z", "h", "i", "Ler/l;", "j", "()Ler/l;", "n", "k", "l", "m", "Ler/a;", "()Ler/a;", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final bz3.h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label topMenuTitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label headerTitle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label headerMessage;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label inputPasswordTitle;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label inputRepeatPasswordTitle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean backButtonVisible;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean closeButtonVisible;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPasswordChanged;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onRepeatedPasswordChanged;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onPasswordInputFocusChanged;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onRepeatPasswordInputFocusChanged;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackButtonClick;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseButtonClick;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onReadAccessibilityMessage;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(bz3.h hVar, Label label, Label label2, Label label3, Label label4, Label label5, boolean z15, boolean z16, l<? super b0, i0> lVar, l<? super b0, i0> lVar2, l<? super Boolean, i0> lVar3, l<? super Boolean, i0> lVar4, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = hVar;
            this.topMenuTitle = label;
            this.headerTitle = label2;
            this.headerMessage = label3;
            this.inputPasswordTitle = label4;
            this.inputRepeatPasswordTitle = label5;
            this.backButtonVisible = z15;
            this.closeButtonVisible = z16;
            this.onPasswordChanged = lVar;
            this.onRepeatedPasswordChanged = lVar2;
            this.onPasswordInputFocusChanged = lVar3;
            this.onRepeatPasswordInputFocusChanged = lVar4;
            this.onBackButtonClick = aVar;
            this.onCloseButtonClick = aVar2;
            this.onNextButtonClick = aVar3;
            this.onReadAccessibilityMessage = aVar4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getBackButtonVisible() {
            return this.backButtonVisible;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCloseButtonVisible() {
            return this.closeButtonVisible;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getHeaderMessage() {
            return this.headerMessage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getHeaderTitle() {
            return this.headerTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getInputPasswordTitle() {
            return this.inputPasswordTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.topMenuTitle, params.topMenuTitle) && t.c(this.headerTitle, params.headerTitle) && t.c(this.headerMessage, params.headerMessage) && t.c(this.inputPasswordTitle, params.inputPasswordTitle) && t.c(this.inputRepeatPasswordTitle, params.inputRepeatPasswordTitle) && this.backButtonVisible == params.backButtonVisible && this.closeButtonVisible == params.closeButtonVisible && t.c(this.onPasswordChanged, params.onPasswordChanged) && t.c(this.onRepeatedPasswordChanged, params.onRepeatedPasswordChanged) && t.c(this.onPasswordInputFocusChanged, params.onPasswordInputFocusChanged) && t.c(this.onRepeatPasswordInputFocusChanged, params.onRepeatPasswordInputFocusChanged) && t.c(this.onBackButtonClick, params.onBackButtonClick) && t.c(this.onCloseButtonClick, params.onCloseButtonClick) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onReadAccessibilityMessage, params.onReadAccessibilityMessage);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getInputRepeatPasswordTitle() {
            return this.inputRepeatPasswordTitle;
        }

        public final er.a<i0> g() {
            return this.onBackButtonClick;
        }

        public final er.a<i0> h() {
            return this.onCloseButtonClick;
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            Label label = this.topMenuTitle;
            return ((((((((((((((((((((((((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.headerTitle.hashCode()) * 31) + this.headerMessage.hashCode()) * 31) + this.inputPasswordTitle.hashCode()) * 31) + this.inputRepeatPasswordTitle.hashCode()) * 31) + Boolean.hashCode(this.backButtonVisible)) * 31) + Boolean.hashCode(this.closeButtonVisible)) * 31) + this.onPasswordChanged.hashCode()) * 31) + this.onRepeatedPasswordChanged.hashCode()) * 31) + this.onPasswordInputFocusChanged.hashCode()) * 31) + this.onRepeatPasswordInputFocusChanged.hashCode()) * 31) + this.onBackButtonClick.hashCode()) * 31) + this.onCloseButtonClick.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onReadAccessibilityMessage.hashCode();
        }

        public final er.a<i0> i() {
            return this.onNextButtonClick;
        }

        public final l<b0, i0> j() {
            return this.onPasswordChanged;
        }

        public final l<Boolean, i0> k() {
            return this.onPasswordInputFocusChanged;
        }

        public final er.a<i0> l() {
            return this.onReadAccessibilityMessage;
        }

        public final l<Boolean, i0> m() {
            return this.onRepeatPasswordInputFocusChanged;
        }

        public final l<b0, i0> n() {
            return this.onRepeatedPasswordChanged;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final bz3.h getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final Label getTopMenuTitle() {
            return this.topMenuTitle;
        }

        public String toString() {
            return "Params(state=" + this.state + ", topMenuTitle=" + this.topMenuTitle + ", headerTitle=" + this.headerTitle + ", headerMessage=" + this.headerMessage + ", inputPasswordTitle=" + this.inputPasswordTitle + ", inputRepeatPasswordTitle=" + this.inputRepeatPasswordTitle + ", backButtonVisible=" + this.backButtonVisible + ", closeButtonVisible=" + this.closeButtonVisible + ", onPasswordChanged=" + this.onPasswordChanged + ", onRepeatedPasswordChanged=" + this.onRepeatedPasswordChanged + ", onPasswordInputFocusChanged=" + this.onPasswordInputFocusChanged + ", onRepeatPasswordInputFocusChanged=" + this.onRepeatPasswordInputFocusChanged + ", onBackButtonClick=" + this.onBackButtonClick + ", onCloseButtonClick=" + this.onCloseButtonClick + ", onNextButtonClick=" + this.onNextButtonClick + ", onReadAccessibilityMessage=" + this.onReadAccessibilityMessage + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f38846a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(7144519);
            if (p076m2.t.k()) {
                p076m2.t.o(7144519, i15, -1, "pl.gov.coi.mobywatel.segment.setpassword.presentation.mapper.SetPasswordScreenMapper.invoke.<anonymous>.<anonymous> (SetPasswordScreenMapper.kt:81)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f38847a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(708991780);
            if (p076m2.t.k()) {
                p076m2.t.o(708991780, i15, -1, "pl.gov.coi.mobywatel.segment.setpassword.presentation.mapper.SetPasswordScreenMapper.invoke.<anonymous>.<anonymous> (SetPasswordScreenMapper.kt:89)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f38848a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(151007717);
            if (p076m2.t.k()) {
                p076m2.t.o(151007717, i15, -1, "pl.gov.coi.mobywatel.segment.setpassword.presentation.mapper.SetPasswordScreenMapper.invoke.<anonymous>.<anonymous> (SetPasswordScreenMapper.kt:90)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public i(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(o oVar, Params params, k3 k3Var) {
        o.g(oVar, false, 1, null);
        params.i().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params, String str) {
        params.j().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params params, String str) {
        params.n().b(c0.g(str));
        return i0.f148189a;
    }

    private final boolean H(bz3.h hVar) {
        return (hVar instanceof bz3.h.PasswordInputFocused) || (hVar.getPasswordState() instanceof hz.b.Invalid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, String str) {
        params.j().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l3 u(final o oVar) {
        return new l3(null, null, new l() { // from class: cz3.a
            @Override // er.l
            public final Object b(Object obj) {
                return i.v(oVar, (k3) obj);
            }
        }, null, null, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(o oVar, k3 k3Var) {
        oVar.h(l3.g.INSTANCE.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params, String str) {
        params.n().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l3 z(final Params params, final o oVar) {
        return new l3(new l() { // from class: cz3.b
            @Override // er.l
            public final Object b(Object obj) {
                return i.E(oVar, params, (k3) obj);
            }
        }, null, null, null, null, null, 62, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:28:0x0103  */
    /* JADX WARN: Code duplicated, block: B:31:0x0126  */
    /* JADX WARN: Code duplicated, block: B:32:0x012d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0150  */
    /* JADX WARN: Code duplicated, block: B:36:0x0157  */
    /* JADX WARN: Code duplicated, block: B:39:0x017a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0181  */
    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public bz3.i.Data b(final Params params) {
        NavigationButtonData navigationButtonData;
        NavigationButtonData navigationButtonData2;
        x50.a.Icon icon;
        Boolean bool;
        boolean zBooleanValue;
        Boolean bool2;
        boolean zBooleanValue2;
        Boolean bool3;
        boolean zBooleanValue3;
        Boolean bool4;
        boolean zBooleanValue4;
        Boolean bool5;
        boolean zBooleanValue5;
        mx.c cVar = this.labelProvider;
        bz3.h state = params.getState();
        Label topMenuTitle = params.getTopMenuTitle();
        if (topMenuTitle == null) {
            topMenuTitle = params.getHeaderTitle();
        }
        Label label = topMenuTitle;
        Label topMenuTitle2 = params.getTopMenuTitle();
        boolean backButtonVisible = params.getBackButtonVisible();
        if (!backButtonVisible) {
            if (backButtonVisible) {
                throw new oq.p();
            }
            boolean closeButtonVisible = params.getCloseButtonVisible();
            if (closeButtonVisible) {
                navigationButtonData2 = new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.h());
            } else {
                if (closeButtonVisible) {
                    throw new oq.p();
                }
                navigationButtonData = null;
            }
            x50.a.Icon icon2 = new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f38846a, null, params.h(), 4, null));
            if (params.getCloseButtonVisible() || !params.getBackButtonVisible()) {
                icon = null;
            } else {
                icon = icon2;
            }
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(navigationButtonData, topMenuTitle2, null, icon, null, 20, null), null, null, label, null, 45, null);
            o40.a.Icon icon3 = new o40.a.Icon(jz.a.f106767f, c.f38847a, d.f38848a, params.getHeaderTitle(), params.getHeaderMessage(), null, 32, null);
            boolean z15 = state.getPasswordState() instanceof hz.b.Invalid;
            boolean zH = H(state);
            bool = state.f().get(wy3.a.MIN_LENGTH);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            RequirementItem requirementItem = new RequirementItem(null, zBooleanValue, cVar.e(uy3.a.f202331a, 8), 1, null);
            bool2 = state.f().get(wy3.a.LOWER_CASE);
            if (bool2 != null) {
                zBooleanValue2 = bool2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            RequirementItem requirementItem2 = new RequirementItem(null, zBooleanValue2, cVar.c(uy3.a.f202334d), 1, null);
            bool3 = state.f().get(wy3.a.UPPER_CASE);
            if (bool3 != null) {
                zBooleanValue3 = bool3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            RequirementItem requirementItem3 = new RequirementItem(null, zBooleanValue3, cVar.c(uy3.a.f202340j), 1, null);
            bool4 = state.f().get(wy3.a.NUMBER);
            if (bool4 != null) {
                zBooleanValue4 = bool4.booleanValue();
            } else {
                zBooleanValue4 = false;
            }
            RequirementItem requirementItem4 = new RequirementItem(null, zBooleanValue4, cVar.c(uy3.a.f202333c), 1, null);
            bool5 = state.f().get(wy3.a.SPECIAL_MARK);
            if (bool5 != null) {
                zBooleanValue5 = bool5.booleanValue();
            } else {
                zBooleanValue5 = false;
            }
            Label inputPasswordTitle = params.getInputPasswordTitle();
            hz.b passwordState = state.getPasswordState();
            Label labelB = mx.b.b(c0.e(state.getPassword()), "password");
            v4.t.Companion companion = v4.t.INSTANCE;
            return new bz3.i.Data(baseScaffoldData, icon3, new RequirementListData(z15, zH, v.q(requirementItem, requirementItem2, requirementItem3, requirementItem4, new RequirementItem(null, zBooleanValue5, cVar.c(uy3.a.f202339i), 1, null))), state instanceof bz3.h.PasswordInputFocused, new v50.c.Password(null, inputPasswordTitle, null, labelB, passwordState, null, null, new l() { // from class: cz3.c
                @Override // er.l
                public final Object b(Object obj) {
                    return i.s(params, (String) obj);
                }
            }, null, false, companion.d(), new l() { // from class: cz3.d
                @Override // er.l
                public final Object b(Object obj) {
                    return i.u((o) obj);
                }
            }, false, null, false, 0, null, null, null, null, 1045349, null), new v50.c.Password(null, params.getInputRepeatPasswordTitle(), null, mx.b.b(c0.e(state.getRepeatPassword()), "repeatPassword"), state.getRepeatedPasswordState(), null, null, new l() { // from class: cz3.e
                @Override // er.l
                public final Object b(Object obj) {
                    return i.x(params, (String) obj);
                }
            }, null, false, companion.b(), new l() { // from class: cz3.f
                @Override // er.l
                public final Object b(Object obj) {
                    return i.z(params, (o) obj);
                }
            }, false, null, false, 0, null, null, null, null, 1045349, null), state.getRepeatedPasswordState(), new ButtonData(null, null, new k30.a.Large(true), new k30.c.WithText(cVar.c(uy3.a.f202335e), null, 2, null), k30.d.a.f107773a, null, params.i(), 35, null), state.getImeVisible(), new l() { // from class: cz3.g
                @Override // er.l
                public final Object b(Object obj) {
                    return i.F(params, (String) obj);
                }
            }, new l() { // from class: cz3.h
                @Override // er.l
                public final Object b(Object obj) {
                    return i.G(params, (String) obj);
                }
            }, params.k(), params.m(), params.g(), params.l());
        }
        navigationButtonData2 = new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.g());
        navigationButtonData = navigationButtonData2;
        x50.a.Icon icon4 = new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f38846a, null, params.h(), 4, null));
        if (params.getCloseButtonVisible()) {
            icon = null;
        } else {
            icon = null;
        }
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new x50.i.Small(navigationButtonData, topMenuTitle2, null, icon, null, 20, null), null, null, label, null, 45, null);
        o40.a.Icon icon5 = new o40.a.Icon(jz.a.f106767f, c.f38847a, d.f38848a, params.getHeaderTitle(), params.getHeaderMessage(), null, 32, null);
        boolean z16 = state.getPasswordState() instanceof hz.b.Invalid;
        boolean zH2 = H(state);
        bool = state.f().get(wy3.a.MIN_LENGTH);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        RequirementItem requirementItem5 = new RequirementItem(null, zBooleanValue, cVar.e(uy3.a.f202331a, 8), 1, null);
        bool2 = state.f().get(wy3.a.LOWER_CASE);
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        RequirementItem requirementItem6 = new RequirementItem(null, zBooleanValue2, cVar.c(uy3.a.f202334d), 1, null);
        bool3 = state.f().get(wy3.a.UPPER_CASE);
        if (bool3 != null) {
            zBooleanValue3 = bool3.booleanValue();
        } else {
            zBooleanValue3 = false;
        }
        RequirementItem requirementItem7 = new RequirementItem(null, zBooleanValue3, cVar.c(uy3.a.f202340j), 1, null);
        bool4 = state.f().get(wy3.a.NUMBER);
        if (bool4 != null) {
            zBooleanValue4 = bool4.booleanValue();
        } else {
            zBooleanValue4 = false;
        }
        RequirementItem requirementItem8 = new RequirementItem(null, zBooleanValue4, cVar.c(uy3.a.f202333c), 1, null);
        bool5 = state.f().get(wy3.a.SPECIAL_MARK);
        if (bool5 != null) {
            zBooleanValue5 = bool5.booleanValue();
        } else {
            zBooleanValue5 = false;
        }
        Label inputPasswordTitle2 = params.getInputPasswordTitle();
        hz.b passwordState2 = state.getPasswordState();
        Label labelB2 = mx.b.b(c0.e(state.getPassword()), "password");
        v4.t.Companion companion2 = v4.t.INSTANCE;
        return new bz3.i.Data(baseScaffoldData2, icon5, new RequirementListData(z16, zH2, v.q(requirementItem5, requirementItem6, requirementItem7, requirementItem8, new RequirementItem(null, zBooleanValue5, cVar.c(uy3.a.f202339i), 1, null))), state instanceof bz3.h.PasswordInputFocused, new v50.c.Password(null, inputPasswordTitle2, null, labelB2, passwordState2, null, null, new l() { // from class: cz3.c
            @Override // er.l
            public final Object b(Object obj) {
                return i.s(params, (String) obj);
            }
        }, null, false, companion2.d(), new l() { // from class: cz3.d
            @Override // er.l
            public final Object b(Object obj) {
                return i.u((o) obj);
            }
        }, false, null, false, 0, null, null, null, null, 1045349, null), new v50.c.Password(null, params.getInputRepeatPasswordTitle(), null, mx.b.b(c0.e(state.getRepeatPassword()), "repeatPassword"), state.getRepeatedPasswordState(), null, null, new l() { // from class: cz3.e
            @Override // er.l
            public final Object b(Object obj) {
                return i.x(params, (String) obj);
            }
        }, null, false, companion2.b(), new l() { // from class: cz3.f
            @Override // er.l
            public final Object b(Object obj) {
                return i.z(params, (o) obj);
            }
        }, false, null, false, 0, null, null, null, null, 1045349, null), state.getRepeatedPasswordState(), new ButtonData(null, null, new k30.a.Large(true), new k30.c.WithText(cVar.c(uy3.a.f202335e), null, 2, null), k30.d.a.f107773a, null, params.i(), 35, null), state.getImeVisible(), new l() { // from class: cz3.g
            @Override // er.l
            public final Object b(Object obj) {
                return i.F(params, (String) obj);
            }
        }, new l() { // from class: cz3.h
            @Override // er.l
            public final Object b(Object obj) {
                return i.G(params, (String) obj);
            }
        }, params.k(), params.m(), params.g(), params.l());
    }
}
