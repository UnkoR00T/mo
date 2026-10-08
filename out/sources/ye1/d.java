package ye1;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ld1.CompanyPkdCode;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.j0;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import we1.i;
import we1.j;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lye1/d;", "Lxw/f;", "Lye1/d$a;", "Lwe1/j$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lld1/g;", "Lkotlin/Function1;", "Loq/i0;", "onRemoveAction", "Ln50/g;", "f", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "params", "e", "(Lye1/d$a;)Lwe1/j$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ye1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006#"}, d2 = {"Lye1/d$a;", "", "Lwe1/i;", "state", "Lkotlin/Function0;", "Loq/i0;", "onAddPkdCodesAction", "Lkotlin/Function1;", "Lld1/g;", "onRemovePkdCodeAction", "onNextAction", "onBackAction", "<init>", "(Lwe1/i;Ler/a;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwe1/i;", "e", "()Lwe1/i;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "d", "()Ler/l;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddPkdCodesAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<CompanyPkdCode, i0> onRemovePkdCodeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(i iVar, er.a<i0> aVar, l<? super CompanyPkdCode, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = iVar;
            this.onAddPkdCodesAction = aVar;
            this.onRemovePkdCodeAction = lVar;
            this.onNextAction = aVar2;
            this.onBackAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onAddPkdCodesAction;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onNextAction;
        }

        public final l<CompanyPkdCode, i0> d() {
            return this.onRemovePkdCodeAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onAddPkdCodesAction, params.onAddPkdCodesAction) && t.c(this.onRemovePkdCodeAction, params.onRemovePkdCodeAction) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onAddPkdCodesAction.hashCode()) * 31) + this.onRemovePkdCodeAction.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onAddPkdCodesAction=" + this.onAddPkdCodesAction + ", onRemovePkdCodeAction=" + this.onRemovePkdCodeAction + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f226654a;

        static {
            int[] iArr = new int[ld1.l.values().length];
            try {
                iArr[ld1.l.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ld1.l.MANAGEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f226654a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f226655a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1441643918);
            if (p076m2.t.k()) {
                p076m2.t.o(-1441643918, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdcode.mapper.PkdCodeMapper.invoke.<anonymous> (PkdCodeMapper.kt:65)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    /* JADX INFO: renamed from: ye1.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C6079d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C6079d f226656a = new C6079d();

        C6079d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(165828110);
            if (p076m2.t.k()) {
                p076m2.t.o(165828110, i15, -1, "pl.gov.coi.mobywatel.feature.companycommon.pkdcode.mapper.PkdCodeMapper.invoke.<anonymous> (PkdCodeMapper.kt:72)");
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
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((CompanyPkdCode) t15).getCode(), ((CompanyPkdCode) t16).getCode());
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<DefaultSingleCardData> f(List<CompanyPkdCode> list, final l<? super CompanyPkdCode, i0> lVar) {
        List listU0 = v.U0(list, new e());
        ArrayList arrayList = new ArrayList(v.y(listU0, 10));
        int i15 = 0;
        for (Object obj : listU0) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final CompanyPkdCode companyPkdCode = (CompanyPkdCode) obj;
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(companyPkdCode.getCode(), "bodySectionTitle_" + i15), null, null, 0, 0, j70.a.LETTER_BY_LETTER, 30, null)), new SingleCardLabel(mx.b.b(companyPkdCode.getName(), "bodySectionDescription"), null, null, 0, 0, null, 62, null), 1, null), null, x0.IconButton.INSTANCE.a(c70.a.f23835a.a().i0(), new er.a() { // from class: ye1.c
                @Override // er.a
                public final Object a() {
                    return d.h(lVar, companyPkdCode);
                }
            }), null, 2815, null));
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
        int i15;
        int i16;
        j0 error;
        cb4.i vmsAdapter;
        i state = params.getState();
        if (t.c(state, i.a.f212711a)) {
            return j.a.C5617a.f212719a;
        }
        if (!(state instanceof i.b.Dialog) && !(state instanceof i.b.Displayed)) {
            throw new oq.p();
        }
        mx.c cVar = this.labelProvider;
        ld1.l processType = ((i.b) params.getState()).getStateData().getProcessType();
        int[] iArr = b.f226654a;
        int i17 = iArr[processType.ordinal()];
        if (i17 == 1) {
            i15 = ha1.a.Y1;
        } else {
            if (i17 != 2) {
                throw new oq.p();
            }
            i15 = ha1.a.f82357a2;
        }
        Label labelC = cVar.c(i15);
        mx.c cVar2 = this.labelProvider;
        int i18 = iArr[((i.b) params.getState()).getStateData().getProcessType().ordinal()];
        if (i18 == 1) {
            i16 = ha1.a.X1;
        } else {
            if (i18 != 2) {
                throw new oq.p();
            }
            i16 = ha1.a.Z1;
        }
        Label labelC2 = cVar2.c(i16);
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ha1.a.T1), null, c.f226655a, 0, 0, null, 58, null)), null, 5, null);
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106760e0, null, C6079d.f226656a, null, null, 26, null), 3, null);
        hz.b validationState = ((i.b) params.getState()).getStateData().getValidationState();
        if (t.c(validationState, hz.b.C2039b.f86846c) || t.c(validationState, hz.b.d.f86848c)) {
            error = j0.a.f132074a;
        } else {
            if (!(validationState instanceof hz.b.Invalid)) {
                throw new oq.p();
            }
            error = new j0.Error(this.labelProvider.c(ha1.a.U1));
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.a(), false, error, null, false, null, null, bodySection, leadingSection, null, null, 3317, null);
        CardListData cardListData = new CardListData(f(((i.b) params.getState()).getStateData().e(), params.d()), null, false, null, null, 30, null);
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.d.a aVar = k30.d.a.f107773a;
        ButtonData buttonData = new ButtonData(null, null, large, new k30.c.WithText(this.labelProvider.c(ha1.a.E), null, 2, null), aVar, null, params.c(), 35, null);
        i.b bVar = (i.b) params.getState();
        if (bVar instanceof i.b.Dialog) {
            vmsAdapter = ((i.b.Dialog) params.getState()).getVmsAdapter();
        } else {
            if (!(bVar instanceof i.b.Displayed)) {
                throw new oq.p();
            }
            vmsAdapter = null;
        }
        return new j.a.Initialized(labelC, labelC2, vmsAdapter, cardListData, defaultSingleCardData, new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(ha1.a.V1), null, 2, null), aVar, null, params.a(), 35, null), buttonData, params.b());
    }
}
