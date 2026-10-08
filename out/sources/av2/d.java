package av2;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import er.l;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import t50.TextAreaData;
import t50.e;
import t50.s;
import xw.f;
import yu2.n;
import yu2.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lav2/d;", "Lxw/f;", "Lav2/d$a;", "Lyu2/o$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lyu2/n;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onReasonChanged", "Lt50/d;", "h", "(Lyu2/n;Ler/l;)Lt50/d;", "Lhz/b;", "Lt50/e;", "r", "(Lhz/b;)Lt50/e;", "params", "l", "(Lav2/d$a;)Lyu2/o$a;", "a", "Lmx/c;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, o.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: av2.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b\u001f\u0010%R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b'\u0010%R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b\u001b\u0010%R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b&\u0010%R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b(\u0010%¨\u0006)"}, d2 = {"Lav2/d$a;", "", "Lyu2/n;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextButtonClickAction", "Lkotlin/Function1;", "Lbv2/a;", "onVerificationCheckRadioButtonSelected", "", "onCitizenPeselNumberChanged", "onNonCitizenPeselNumberChanged", "onCitizenIdNumberChanged", "onNonCitizenIdNumberChanged", "onReasonChanged", "<init>", "(Lyu2/n;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyu2/n;", "h", "()Lyu2/n;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/l;", "g", "()Ler/l;", "d", "e", "f", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClickAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<bv2.a, i0> onVerificationCheckRadioButtonSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onCitizenPeselNumberChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onNonCitizenPeselNumberChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onCitizenIdNumberChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onNonCitizenIdNumberChanged;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onReasonChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(n nVar, er.a<i0> aVar, l<? super bv2.a, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3, l<? super String, i0> lVar4, l<? super String, i0> lVar5, l<? super String, i0> lVar6) {
            this.state = nVar;
            this.onNextButtonClickAction = aVar;
            this.onVerificationCheckRadioButtonSelected = lVar;
            this.onCitizenPeselNumberChanged = lVar2;
            this.onNonCitizenPeselNumberChanged = lVar3;
            this.onCitizenIdNumberChanged = lVar4;
            this.onNonCitizenIdNumberChanged = lVar5;
            this.onReasonChanged = lVar6;
        }

        public final l<String, i0> a() {
            return this.onCitizenIdNumberChanged;
        }

        public final l<String, i0> b() {
            return this.onCitizenPeselNumberChanged;
        }

        public final er.a<i0> c() {
            return this.onNextButtonClickAction;
        }

        public final l<String, i0> d() {
            return this.onNonCitizenIdNumberChanged;
        }

        public final l<String, i0> e() {
            return this.onNonCitizenPeselNumberChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onNextButtonClickAction, params.onNextButtonClickAction) && t.c(this.onVerificationCheckRadioButtonSelected, params.onVerificationCheckRadioButtonSelected) && t.c(this.onCitizenPeselNumberChanged, params.onCitizenPeselNumberChanged) && t.c(this.onNonCitizenPeselNumberChanged, params.onNonCitizenPeselNumberChanged) && t.c(this.onCitizenIdNumberChanged, params.onCitizenIdNumberChanged) && t.c(this.onNonCitizenIdNumberChanged, params.onNonCitizenIdNumberChanged) && t.c(this.onReasonChanged, params.onReasonChanged);
        }

        public final l<String, i0> f() {
            return this.onReasonChanged;
        }

        public final l<bv2.a, i0> g() {
            return this.onVerificationCheckRadioButtonSelected;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final n getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onNextButtonClickAction.hashCode()) * 31) + this.onVerificationCheckRadioButtonSelected.hashCode()) * 31) + this.onCitizenPeselNumberChanged.hashCode()) * 31) + this.onNonCitizenPeselNumberChanged.hashCode()) * 31) + this.onCitizenIdNumberChanged.hashCode()) * 31) + this.onNonCitizenIdNumberChanged.hashCode()) * 31) + this.onReasonChanged.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextButtonClickAction=" + this.onNextButtonClickAction + ", onVerificationCheckRadioButtonSelected=" + this.onVerificationCheckRadioButtonSelected + ", onCitizenPeselNumberChanged=" + this.onCitizenPeselNumberChanged + ", onNonCitizenPeselNumberChanged=" + this.onNonCitizenPeselNumberChanged + ", onCitizenIdNumberChanged=" + this.onCitizenIdNumberChanged + ", onNonCitizenIdNumberChanged=" + this.onNonCitizenIdNumberChanged + ", onReasonChanged=" + this.onReasonChanged + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final TextAreaData h(n state, final l<? super String, i0> onReasonChanged) {
        Label labelC = this.labelProvider.c(ut2.a.f201407i0);
        Label labelC2 = Label.INSTANCE.c();
        int iD = v4.t.INSTANCE.d();
        t50.a.C4878a c4878a = t50.a.C4878a.f187691a;
        return new TextAreaData(null, labelC, new s.Flexible(0, 1, null), null, r(state.getReasonInputData().getValidationState()), state.getReasonInputData().getContent().getText(), false, c4878a, labelC2, iD, null, null, new l() { // from class: av2.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.i(onReasonChanged, (String) obj);
            }
        }, null, 11337, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, String str) {
        lVar.b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.g().b(bv2.a.POLISH_CITIZENSHIP);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.g().b(bv2.a.NO_POLISH_CITIZENSHIP);
        return i0.f148189a;
    }

    private final e r(hz.b bVar) {
        return bVar instanceof hz.b.Invalid ? new e.Error(((hz.b.Invalid) bVar).getMessage()) : new e.Default(null, 1, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public o.Data b(final Params params) {
        return new o.Data(this.labelProvider.c(ut2.a.f201399e0).getText(), this.labelProvider.c(ut2.a.f201412l), params.c(), params.getState().getSelectedRadioButtonId(), h(params.getState(), params.f()), new RadioButtonData(v.q(new RadioButtonRow(new RadioButtonItemData(false, params.getState().getSelectedRadioButtonId() == bv2.a.POLISH_CITIZENSHIP, false, 5, null), new er.a() { // from class: av2.b
            @Override // er.a
            public final Object a() {
                return d.m(params);
            }
        }, this.labelProvider.c(ut2.a.W), null, new zu2.b(this.labelProvider.c(ut2.a.X), this.labelProvider.c(ut2.a.f201416n), params.getState().getCitizenPeselNumberInputData().getContent(), params.getState().getCitizenPeselNumberInputData().getValidationState(), params.b(), this.labelProvider.c(ut2.a.f201400f), params.getState().getCitizenIdNumberInputData().getContent(), params.getState().getCitizenIdNumberInputData().getValidationState(), params.a()), 8, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getSelectedRadioButtonId() == bv2.a.NO_POLISH_CITIZENSHIP, false, 5, null), new er.a() { // from class: av2.c
            @Override // er.a
            public final Object a() {
                return d.q(params);
            }
        }, this.labelProvider.c(ut2.a.f201403g0), null, new zu2.b(this.labelProvider.c(ut2.a.f201405h0), this.labelProvider.c(ut2.a.f201416n), params.getState().getNonCitizenPeselNumberInputData().getContent(), params.getState().getNonCitizenPeselNumberInputData().getValidationState(), params.e(), this.labelProvider.c(ut2.a.f201400f), params.getState().getNonCitizenIdNumberInputData().getContent(), params.getState().getNonCitizenIdNumberInputData().getValidationState(), params.d()), 8, null)), b50.e.a.f16684a, null, this.labelProvider.c(ut2.a.f201395c0), null, null, null, 116, null));
    }
}
