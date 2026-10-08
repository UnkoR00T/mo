package bf1;

import er.l;
import fr.t;
import h30.ButtonData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ld1.CompanyPkdCode;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.d;
import n50.j0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import xw.f;
import ze1.i;
import ze1.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lbf1/b;", "Lxw/f;", "Lbf1/b$a;", "Lze1/j$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lld1/g;", "Lkotlin/Function1;", "Loq/i0;", "onSelectAction", "selectedPkdCode", "Ln50/g;", "f", "(Ljava/util/List;Ler/l;Lld1/g;)Ljava/util/List;", "params", "e", "(Lbf1/b$a;)Lze1/j$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: bf1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Lbf1/b$a;", "", "Lze1/i;", "state", "Lkotlin/Function1;", "Lld1/g;", "Loq/i0;", "onSelectAction", "Lkotlin/Function0;", "onNextAction", "onBackAction", "<init>", "(Lze1/i;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lze1/i;", "d", "()Lze1/i;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<CompanyPkdCode, i0> onSelectAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(i iVar, l<? super CompanyPkdCode, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = iVar;
            this.onSelectAction = lVar;
            this.onNextAction = aVar;
            this.onBackAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onNextAction;
        }

        public final l<CompanyPkdCode, i0> c() {
            return this.onSelectAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final i getState() {
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
            return t.c(this.state, params.state) && t.c(this.onSelectAction, params.onSelectAction) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onSelectAction.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectAction=" + this.onSelectAction + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    /* JADX INFO: renamed from: bf1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0483b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((CompanyPkdCode) t15).getCode(), ((CompanyPkdCode) t16).getCode());
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final List<DefaultSingleCardData> f(List<CompanyPkdCode> list, final l<? super CompanyPkdCode, i0> lVar, CompanyPkdCode companyPkdCode) {
        List listU0 = v.U0(list, new C0483b());
        ArrayList arrayList = new ArrayList(v.y(listU0, 10));
        int i15 = 0;
        for (Object obj : listU0) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final CompanyPkdCode companyPkdCode2 = (CompanyPkdCode) obj;
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: bf1.a
                @Override // er.a
                public final Object a() {
                    return b.h(lVar, companyPkdCode2);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(companyPkdCode2.getCode(), "PkdCodeMainSelectionCategoryTitle_" + i15), null, null, 0, 0, j70.a.LETTER_BY_LETTER, 30, null)), new SingleCardLabel(mx.b.b(companyPkdCode2.getName(), "PkdCodeMainSelectionDescription_" + i15), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, new d.RadioButton(t.c(companyPkdCode2, companyPkdCode), false, 2, null), null, 5, null), null, null, 3325, null));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l lVar, CompanyPkdCode companyPkdCode) {
        lVar.b(companyPkdCode);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j.a b(Params params) {
        j0 error;
        i state = params.getState();
        if (t.c(state, i.a.f234684a)) {
            return j.a.C6321a.f234688a;
        }
        if (!(state instanceof i.Initialized)) {
            throw new p();
        }
        Label labelC = this.labelProvider.c(ha1.a.f82468o2);
        Label labelC2 = this.labelProvider.c(ha1.a.f82461n2);
        List<DefaultSingleCardData> listF = f(((i.Initialized) params.getState()).d(), params.c(), ((i.Initialized) params.getState()).getSelectedPkdCode());
        hz.b validationState = ((i.Initialized) params.getState()).getValidationState();
        if (t.c(validationState, hz.b.C2039b.f86846c) || t.c(validationState, hz.b.d.f86848c)) {
            error = j0.a.f132074a;
        } else {
            if (!(validationState instanceof hz.b.Invalid)) {
                throw new p();
            }
            error = new j0.Error(this.labelProvider.c(ha1.a.f82426j));
        }
        return new j.a.Initialized(labelC, labelC2, new CardListData(listF, error, false, null, null, 28, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.E), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), params.a());
    }
}
