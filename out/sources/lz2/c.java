package lz2;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import kz2.n;
import kz2.o;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pz2.NfcScreenModel;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\b*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\b*\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Llz2/c;", "Lxw/f;", "Llz2/c$a;", "Lkz2/o$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", "title", "description", "Lpz2/a;", "c", "(Llz2/c$a;Lmx/a;Lmx/a;)Lpz2/a;", "params", "Lkz2/o$a$d;", "i", "(Llz2/c$a;)Lkz2/o$a$d;", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "Li50/a;", "f", "(Ler/a;)Li50/a;", "Lcy/c;", "m", "(Lcy/c;)Lmx/a;", "l", "h", "(Llz2/c$a;)Lkz2/o$a;", "a", "Lmx/c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, o.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: lz2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Llz2/c$a;", "", "Lkz2/n;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onCloseAction", "onNextAction", "<init>", "(Lkz2/n;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkz2/n;", "d", "()Lkz2/n;", "b", "Ler/a;", "()Ler/a;", "c", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        public Params(n nVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = nVar;
            this.onBackAction = aVar;
            this.onCloseAction = aVar2;
            this.onNextAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final er.a<i0> c() {
            return this.onNextAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final n getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onNextAction, params.onNextAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onNextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ", onNextAction=" + this.onNextAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121709a;

        static {
            int[] iArr = new int[gz2.i0.values().length];
            try {
                iArr[gz2.i0.QR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gz2.i0.DEEPLINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121709a = iArr;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final NfcScreenModel c(Params params, Label label, Label label2) {
        return new NfcScreenModel(f(params.b()), label, label2, null, params.a(), params.getState().getAreAnimationsEnabled(), 8, null);
    }

    static /* synthetic */ NfcScreenModel e(c cVar, Params params, Label label, Label label2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = cVar.labelProvider.c(uy2.b.f202328y);
        }
        if ((i15 & 2) != 0) {
            label2 = cVar.labelProvider.c(uy2.b.f202326x);
        }
        return cVar.c(params, label, label2);
    }

    private final BaseScaffoldData f(er.a<i0> onCloseAction) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onCloseAction), null, null, null, null, 30, null), null, null, null, null, 61, null);
    }

    private final o.a.NfcScanning i(Params params) {
        return new o.a.NfcScanning(c(params, this.labelProvider.c(uy2.b.Q), Label.INSTANCE.c()));
    }

    private final Label l(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(uy2.b.f202318t) : this.labelProvider.c(uy2.b.f202304m);
        }
        if ((cVar instanceof cy.c.Started) || (cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Finished)) {
            return this.labelProvider.c(uy2.b.f202322v);
        }
        throw new p();
    }

    private final Label m(cy.c cVar) {
        if ((cVar instanceof cy.c.InvalidPinOrPukError) || (cVar instanceof cy.c.Error)) {
            return cVar.getCode() == ic4.a.INTERRUPTED.getCode() ? this.labelProvider.c(uy2.b.f202320u) : this.labelProvider.c(uy2.b.f202290f);
        }
        if ((cVar instanceof cy.c.Info) || (cVar instanceof cy.c.Finished) || (cVar instanceof cy.c.Progress) || (cVar instanceof cy.c.Started)) {
            return this.labelProvider.c(uy2.b.f202324w);
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public o.a b(Params params) {
        n state = params.getState();
        if ((state instanceof n.Init) || (state instanceof n.d.CheckNfc)) {
            return new o.a.NfcInfo(e(this, params, null, null, 3, null));
        }
        if (state instanceof n.d.ReadCert) {
            cy.c lastReadingData = ((n.d.ReadCert) state).getLastReadingData();
            return ((lastReadingData instanceof cy.c.Started) || lastReadingData == null) ? new o.a.NfcInfo(e(this, params, null, null, 3, null)) : new o.a.NfcScanning(c(params, m(lastReadingData), l(lastReadingData)));
        }
        if (state instanceof n.d.SignWithIdCard) {
            cy.c lastReadingData2 = ((n.d.SignWithIdCard) state).getLastReadingData();
            return ((lastReadingData2 instanceof cy.c.Started) || lastReadingData2 == null) ? new o.a.NfcInfo(e(this, params, null, null, 3, null)) : new o.a.NfcScanning(c(params, m(lastReadingData2), l(lastReadingData2)));
        }
        if ((state instanceof n.d.InitAuthentication) || (state instanceof n.d.CreateJWSEToken) || (state instanceof n.d.CreateJWSEForMID) || (state instanceof n.d.Authenticate)) {
            return i(params);
        }
        if (state instanceof n.d.Error) {
            return new o.a.Error(((n.d.Error) state).getErrorVMS());
        }
        if (!(state instanceof n.Success)) {
            if (state instanceof n.ErrorData) {
                return new o.a.Error(((n.ErrorData) state).getErrorVMS());
            }
            throw new p();
        }
        int i15 = b.f121709a[((n.Success) state).getEntryPoint().ordinal()];
        if (i15 == 1) {
            return new o.a.AuthenticationSuccessful(f(params.b()), new IconPageData(j.b.c.f164688d, this.labelProvider.c(uy2.b.f202307n0), this.labelProvider.c(uy2.b.f202305m0), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(uy2.b.f202284c), null, 2, null), d.a.f107773a, null, params.b(), 35, null), null, null, 6, null), true, 8, null), params.b());
        }
        if (i15 == 2) {
            return new o.a.AuthenticationSuccessful(f(params.b()), new IconPageData(j.b.c.f164688d, this.labelProvider.c(uy2.b.f202307n0), this.labelProvider.c(uy2.b.f202303l0), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(uy2.b.f202294h), null, 2, null), d.a.f107773a, null, params.c(), 35, null), null, null, 6, null), true, 8, null), params.c());
        }
        throw new p();
    }
}
