package xb1;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import b50.d;
import b50.e;
import er.l;
import fr.t;
import h30.ButtonData;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ub1.Initialized;
import ub1.n;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxb1/c;", "Lxw/f;", "Lxb1/c$a;", "Lub1/n$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lxb1/c$a;)Lub1/n$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, n.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: xb1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u0019\u0010 R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b!\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b\u001d\u0010$¨\u0006%"}, d2 = {"Lxb1/c$a;", "", "Lub1/m;", "state", "Lkotlin/Function1;", "Lib1/a;", "Loq/i0;", "onSelectAction", "", "onNipNumberChanged", "onAccountingOfficeChanged", "Lkotlin/Function0;", "onNextAction", "onBackAction", "<init>", "(Lub1/m;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lub1/m;", "f", "()Lub1/m;", "b", "Ler/l;", "e", "()Ler/l;", "c", "d", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f217888g = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Initialized state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ib1.a, i0> onSelectAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onNipNumberChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onAccountingOfficeChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(Initialized initialized, l<? super ib1.a, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = initialized;
            this.onSelectAction = lVar;
            this.onNipNumberChanged = lVar2;
            this.onAccountingOfficeChanged = lVar3;
            this.onNextAction = aVar;
            this.onBackAction = aVar2;
        }

        public final l<String, i0> a() {
            return this.onAccountingOfficeChanged;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onNextAction;
        }

        public final l<String, i0> d() {
            return this.onNipNumberChanged;
        }

        public final l<ib1.a, i0> e() {
            return this.onSelectAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onSelectAction, params.onSelectAction) && t.c(this.onNipNumberChanged, params.onNipNumberChanged) && t.c(this.onAccountingOfficeChanged, params.onAccountingOfficeChanged) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Initialized getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onSelectAction.hashCode()) * 31) + this.onNipNumberChanged.hashCode()) * 31) + this.onAccountingOfficeChanged.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectAction=" + this.onSelectAction + ", onNipNumberChanged=" + this.onNipNumberChanged + ", onAccountingOfficeChanged=" + this.onAccountingOfficeChanged + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params) {
        params.e().b(ib1.a.SELF_ACCOUNTING_OFFICE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.e().b(ib1.a.ACCOUNTING_OFFICE);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public n.Data b(final Params params) {
        d error;
        Label labelC = this.labelProvider.c(ha1.a.L0);
        vb1.b bVar = null;
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.E), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null);
        er.a<i0> aVarB = params.b();
        RadioButtonRow radioButtonRow = new RadioButtonRow(new RadioButtonItemData(false, params.getState().getSelectedItem() == ib1.a.SELF_ACCOUNTING_OFFICE, false, 5, null), new er.a() { // from class: xb1.a
            @Override // er.a
            public final Object a() {
                return c.h(params);
            }
        }, this.labelProvider.c(ha1.a.I0), null, null, 24, null);
        ib1.a selectedItem = params.getState().getSelectedItem();
        ib1.a aVar = ib1.a.ACCOUNTING_OFFICE;
        RadioButtonItemData radioButtonItemData = new RadioButtonItemData(false, selectedItem == aVar, false, 5, null);
        er.a aVar2 = new er.a() { // from class: xb1.b
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        };
        Label labelC2 = this.labelProvider.c(ha1.a.K0);
        ib1.a selectedItem2 = params.getState().getSelectedItem();
        if (selectedItem2 != aVar) {
            selectedItem2 = null;
        }
        if (selectedItem2 != null) {
            bVar = new vb1.b(new v50.c.Text(null, this.labelProvider.c(ha1.a.G0), null, mx.b.b(params.getState().c().getValue(), "accountingOfficeValue"), params.getState().c().getValidationState(), this.labelProvider.c(ha1.a.H0), null, params.a(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048389, null), new v50.c.Number(null, this.labelProvider.c(ha1.a.J0), null, mx.b.b(params.getState().d().getValue(), "nip"), params.getState().d().getValidationState(), null, null, params.d(), null, false, 0, null, false, null, false, null, null, null, null, false, 1048421, null));
        }
        List listQ = v.q(radioButtonRow, new RadioButtonRow(radioButtonItemData, aVar2, labelC2, null, bVar, 8, null));
        e.a aVar3 = e.a.f16684a;
        hz.b validationState = params.getState().getValidationState();
        if (validationState instanceof hz.b.Invalid) {
            error = new d.Error(this.labelProvider.c(ha1.a.f82426j));
        } else {
            if (!t.c(validationState, hz.b.d.f86848c) && !t.c(validationState, hz.b.C2039b.f86846c)) {
                throw new p();
            }
            error = d.c.f16683a;
        }
        return new n.Data(labelC, new RadioButtonData(listQ, aVar3, error, null, null, null, null, 120, null), aVarB, buttonData);
    }
}
