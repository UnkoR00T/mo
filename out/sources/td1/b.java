package td1;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import r30.CheckBoxRowData;
import sd1.CheckBox;
import sd1.TextInput;
import sd1.i;
import sd1.j;
import w30.CheckBoxSingleData;
import x40.LinkData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltd1/b;", "Lxw/f;", "Ltd1/b$a;", "Lsd1/j$a;", "Lmx/c;", "labelProvider", "Lia1/a;", "companyEndpoints", "<init>", "(Lmx/c;Lia1/a;)V", "params", "e", "(Ltd1/b$a;)Lsd1/j$a;", "a", "Lmx/c;", "b", "Lia1/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ia1.a companyEndpoints;

    /* JADX INFO: renamed from: td1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b$\u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b%\u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b\"\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001a\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b\u001e\u0010'¨\u0006("}, d2 = {"Ltd1/b$a;", "", "Lsd1/i;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onEmailChanged", "onEmailRepeatedChanged", "", "onCheckBoxChanged", "onLinkClicked", "Lkotlin/Function0;", "nextAction", "backAction", "closeAction", "<init>", "(Lsd1/i;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsd1/i;", "h", "()Lsd1/i;", "b", "Ler/l;", "e", "()Ler/l;", "c", "f", "d", "g", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onEmailChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onEmailRepeatedChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onCheckBoxChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLinkClicked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(i iVar, l<? super String, i0> lVar, l<? super String, i0> lVar2, l<? super Boolean, i0> lVar3, l<? super String, i0> lVar4, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = iVar;
            this.onEmailChanged = lVar;
            this.onEmailRepeatedChanged = lVar2;
            this.onCheckBoxChanged = lVar3;
            this.onLinkClicked = lVar4;
            this.nextAction = aVar;
            this.backAction = aVar2;
            this.closeAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final er.a<i0> c() {
            return this.nextAction;
        }

        public final l<Boolean, i0> d() {
            return this.onCheckBoxChanged;
        }

        public final l<String, i0> e() {
            return this.onEmailChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onEmailChanged, params.onEmailChanged) && t.c(this.onEmailRepeatedChanged, params.onEmailRepeatedChanged) && t.c(this.onCheckBoxChanged, params.onCheckBoxChanged) && t.c(this.onLinkClicked, params.onLinkClicked) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction);
        }

        public final l<String, i0> f() {
            return this.onEmailRepeatedChanged;
        }

        public final l<String, i0> g() {
            return this.onLinkClicked;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final i getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onEmailChanged.hashCode()) * 31) + this.onEmailRepeatedChanged.hashCode()) * 31) + this.onCheckBoxChanged.hashCode()) * 31) + this.onLinkClicked.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onEmailChanged=" + this.onEmailChanged + ", onEmailRepeatedChanged=" + this.onEmailRepeatedChanged + ", onCheckBoxChanged=" + this.onCheckBoxChanged + ", onLinkClicked=" + this.onLinkClicked + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ')';
        }
    }

    public b(c cVar, ia1.a aVar) {
        this.labelProvider = cVar;
        this.companyEndpoints = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, String str) {
        params.g().b(str);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j.a b(final Params params) {
        r30.b error;
        r30.b bVar;
        i state = params.getState();
        if (!(state instanceof i.FormDisplayed)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ha1.a.f82475p2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(ha1.a.f82544z1);
        Label labelC2 = this.labelProvider.c(ha1.a.f82523w1);
        Label labelC3 = this.labelProvider.c(ha1.a.f82395f0);
        er.a<i0> aVarA = params.a();
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), d.a.f107773a, null, params.c(), 35, null);
        sd1.i0 i0Var = sd1.i0.EMAIL;
        Label labelC4 = this.labelProvider.c(ha1.a.f82486r);
        v4.t.Companion companion = v4.t.INSTANCE;
        int iD = companion.d();
        i.FormDisplayed formDisplayed = (i.FormDisplayed) state;
        Label labelB = mx.b.b(formDisplayed.d().d(), "email");
        l<String, i0> lVarE = params.e();
        hz.b validationState = formDisplayed.d().getValidationState();
        v50.c.Text.a aVar = v50.c.Text.a.EMAIL;
        TextInput textInput = new TextInput(i0Var, new v50.c.Text(null, labelC4, null, labelB, validationState, null, null, lVarE, null, false, iD, null, false, null, false, null, null, aVar, null, null, 916325, null));
        sd1.i0 i0Var2 = sd1.i0.CONSENT;
        CheckBoxRowData checkBoxRowData = new CheckBoxRowData(null, formDisplayed.c().d().booleanValue(), params.d(), this.labelProvider.c(ha1.a.f82530x1), null, null, new r30.d.Link(new LinkData(null, this.labelProvider.c(ha1.a.f82537y1), this.companyEndpoints.m0(), LinkData.EnumC5775a.WEBSITE, false, new l() { // from class: td1.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f(params, (String) obj);
            }
        }, 17, null)), null, 177, null);
        hz.b validationState2 = formDisplayed.c().getValidationState();
        if (t.c(validationState2, hz.b.C2039b.f86846c)) {
            bVar = r30.b.a.f171263a;
            textInput = textInput;
            baseScaffoldData = baseScaffoldData;
        } else {
            if (validationState2 instanceof hz.b.Invalid) {
                error = new r30.b.Error(null, ((hz.b.Invalid) formDisplayed.c().getValidationState()).getMessage(), 1, null);
            } else {
                if (!t.c(validationState2, hz.b.d.f86848c)) {
                    throw new p();
                }
                error = r30.b.a.f171263a;
            }
            bVar = error;
        }
        CheckBox checkBox = new CheckBox(i0Var2, new CheckBoxSingleData(checkBoxRowData, bVar, null, false, null, 28, null));
        sd1.i0 i0Var3 = sd1.i0.EMAIL_REPEATED;
        Label labelC5 = this.labelProvider.c(ha1.a.Z);
        int iD2 = companion.d();
        return new j.a.DataDisplayed(baseScaffoldData, labelC, labelC2, labelC3, textInput, new TextInput(i0Var3, new v50.c.Text(null, labelC5, null, mx.b.b(formDisplayed.e().d(), "email"), formDisplayed.e().getValidationState(), null, null, params.f(), null, false, iD2, null, false, null, false, null, null, aVar, null, null, 916325, null)), checkBox, buttonData, aVarA);
    }
}
