package bq3;

import aq3.State;
import er.l;
import fr.t;
import h30.ButtonData;
import hz.b;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import oo0.k;
import oq.i0;
import p071kotlin.Metadata;
import t50.TextAreaData;
import t50.e;
import t50.s;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002+)B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\u0013*\u00020\bH\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lbq3/a;", "Lxw/f;", "Lbq3/a$b;", "Laq3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Loo0/k;", "sendIdeaCategory", "Lmx/a;", "e", "(Loo0/k;)Lmx/a;", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lh30/a;", "f", "(Ler/a;)Lh30/a;", "", "labelStringId", "Lkotlin/Function1;", "", "onValueChange", "content", "Lhz/b;", "validationState", "Lt50/s;", "textAreaType", "maxLength", "Lt50/d;", "h", "(ILer/l;Ljava/lang/String;Lhz/b;Lt50/s;I)Lt50/d;", "Lt50/e;", "l", "(Lhz/b;)Lt50/e;", "i", "(Loo0/k;)I", "params", "c", "(Lbq3/a$b;)Laq3/c$a;", "a", "Lmx/c;", "b", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, aq3.c.Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21167c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: bq3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"Lbq3/a$b;", "", "Laq3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "sendButtonClick", "Lkotlin/Function1;", "", "updateTitleValue", "updateDescriptionValue", "<init>", "(Laq3/b;Ler/a;Ler/a;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Laq3/b;", "c", "()Laq3/b;", "b", "Ler/a;", "()Ler/a;", "d", "Ler/l;", "e", "()Ler/l;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f21169f = b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> sendButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> updateTitleValue;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> updateDescriptionValue;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar, l<? super String, i0> lVar2) {
            this.state = state;
            this.backAction = aVar;
            this.sendButtonClick = aVar2;
            this.updateTitleValue = lVar;
            this.updateDescriptionValue = lVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.sendButtonClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final l<String, i0> d() {
            return this.updateDescriptionValue;
        }

        public final l<String, i0> e() {
            return this.updateTitleValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.sendButtonClick, params.sendButtonClick) && t.c(this.updateTitleValue, params.updateTitleValue) && t.c(this.updateDescriptionValue, params.updateDescriptionValue);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.sendButtonClick.hashCode()) * 31) + this.updateTitleValue.hashCode()) * 31) + this.updateDescriptionValue.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", sendButtonClick=" + this.sendButtonClick + ", updateTitleValue=" + this.updateTitleValue + ", updateDescriptionValue=" + this.updateDescriptionValue + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21175a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21175a = iArr;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label e(k sendIdeaCategory) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = c.f21175a[sendIdeaCategory.ordinal()];
        if (i16 != 1) {
            i15 = i16 != 2 ? gp3.a.J0 : gp3.a.M0;
        } else {
            i15 = gp3.a.F0;
        }
        return cVar.c(i15);
    }

    private final ButtonData f(er.a<i0> onClick) {
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gp3.a.A0), null, 2, null), d.a.f107773a, null, onClick, 35, null);
    }

    private final TextAreaData h(int labelStringId, l<? super String, i0> onValueChange, String content, b validationState, s textAreaType, int maxLength) {
        int iE = v4.t.INSTANCE.e();
        Label labelC = this.labelProvider.c(labelStringId);
        Label labelC2 = Label.INSTANCE.c();
        return new TextAreaData(null, labelC, textAreaType, null, l(validationState), content, false, new t50.a.Visible(maxLength, null, 2, null), labelC2, iE, null, null, onValueChange, null, 11337, null);
    }

    private final int i(k kVar) {
        int i15 = c.f21175a[kVar.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? gp3.a.f76120d : gp3.a.O0;
        }
        return gp3.a.H0;
    }

    private final e l(b bVar) {
        return bVar instanceof b.Invalid ? new e.Error(((b.Invalid) bVar).getMessage()) : new e.Default(null, 1, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public aq3.c.Data b(Params params) {
        return new aq3.c.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gp3.a.E0), null, null, null, 28, null), null, null, null, null, 61, null), params.a(), this.labelProvider.c(gp3.a.B0), e(params.getState().getCategory()), h(i(params.getState().getCategory()), params.e(), params.getState().getTitleValue(), params.getState().getTitleValidationState(), new s.Flexible(4), 50), h(gp3.a.f76116b, params.d(), params.getState().getDescriptionValue(), params.getState().getDescriptionValidationState(), new s.Fix(4), 500), f(params.b()));
    }
}
