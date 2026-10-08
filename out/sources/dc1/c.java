package dc1;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import b50.d;
import b50.e;
import bc1.State;
import er.l;
import fr.t;
import h30.ButtonData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldc1/c;", "Lxw/f;", "Ldc1/c$a;", "Lbc1/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Ldc1/c$a;)Lbc1/f$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, bc1.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: dc1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Ldc1/c$a;", "", "Lbc1/e;", "state", "Lkotlin/Function1;", "Lkb1/a;", "Loq/i0;", "onSelectPermanentCompanyPlace", "Lkotlin/Function0;", "nextAction", "backAction", "<init>", "(Lbc1/e;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbc1/e;", "d", "()Lbc1/e;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<kb1.a, i0> onSelectPermanentCompanyPlace;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super kb1.a, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onSelectPermanentCompanyPlace = lVar;
            this.nextAction = aVar;
            this.backAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.nextAction;
        }

        public final l<kb1.a, i0> c() {
            return this.onSelectPermanentCompanyPlace;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.onSelectPermanentCompanyPlace, params.onSelectPermanentCompanyPlace) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onSelectPermanentCompanyPlace.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectPermanentCompanyPlace=" + this.onSelectPermanentCompanyPlace + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40798a;

        static {
            int[] iArr = new int[kb1.a.values().length];
            try {
                iArr[kb1.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f40798a = iArr;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params) {
        params.c().b(kb1.a.BUSINESS_ADDRESS_AVAILABLE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.c().b(kb1.a.BUSINESS_ADDRESS_NOT_AVAILABLE);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public bc1.f.Data b(final Params params) {
        Label labelB;
        Label labelC = this.labelProvider.c(ha1.a.f82545z2);
        RadioButtonRow radioButtonRow = new RadioButtonRow(new RadioButtonItemData(false, params.getState().getCompanyPlaceAnswer() == kb1.a.BUSINESS_ADDRESS_AVAILABLE, false, 5, null), new er.a() { // from class: dc1.a
            @Override // er.a
            public final Object a() {
                return c.h(params);
            }
        }, this.labelProvider.c(ha1.a.f82496s2), null, null, 24, null);
        kb1.a companyPlaceAnswer = params.getState().getCompanyPlaceAnswer();
        kb1.a aVar = kb1.a.BUSINESS_ADDRESS_NOT_AVAILABLE;
        RadioButtonItemData radioButtonItemData = new RadioButtonItemData(false, companyPlaceAnswer == aVar, false, 5, null);
        if (params.getState().getCompanyPlaceAnswer() == aVar) {
            labelB = mx.b.b(this.labelProvider.c(ha1.a.f82538y2).getText() + ' ' + params.getState().getHomeAddress(), "homeAddress");
        } else {
            labelB = null;
        }
        List listQ = v.q(radioButtonRow, new RadioButtonRow(radioButtonItemData, new er.a() { // from class: dc1.b
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, this.labelProvider.c(ha1.a.f82503t2), labelB, null, 16, null));
        e.a aVar2 = e.a.f16684a;
        kb1.a companyPlaceAnswer2 = params.getState().getCompanyPlaceAnswer();
        return new bc1.f.Data(labelC, new RadioButtonData(listQ, aVar2, (companyPlaceAnswer2 == null ? -1 : b.f40798a[companyPlaceAnswer2.ordinal()]) == 1 ? new d.Error(this.labelProvider.c(ha1.a.f82426j)) : d.c.f16683a, null, null, null, null, 120, null), params.a(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.E), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null));
    }
}
