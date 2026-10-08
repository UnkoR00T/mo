package ab1;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import k30.d;
import ma1.CompanyRepresentative;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lab1/b;", "Lxw/f;", "Lab1/b$a;", "Lza1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lab1/b$a;)Lza1/c$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, za1.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ab1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lab1/b$a;", "", "Lza1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "", "onOpenUrlAction", "onRemoveRepresentative", "<init>", "(Lza1/b;Ler/a;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lza1/b;", "d", "()Lza1/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final za1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onOpenUrlAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onRemoveRepresentative;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(za1.b bVar, er.a<i0> aVar, l<? super String, i0> lVar, l<? super String, i0> lVar2) {
            this.state = bVar;
            this.onBackAction = aVar;
            this.onOpenUrlAction = lVar;
            this.onRemoveRepresentative = lVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<String, i0> b() {
            return this.onOpenUrlAction;
        }

        public final l<String, i0> c() {
            return this.onRemoveRepresentative;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final za1.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onOpenUrlAction, params.onOpenUrlAction) && t.c(this.onRemoveRepresentative, params.onRemoveRepresentative);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onOpenUrlAction.hashCode()) * 31) + this.onRemoveRepresentative.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onOpenUrlAction=" + this.onOpenUrlAction + ", onRemoveRepresentative=" + this.onRemoveRepresentative + ')';
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, CompanyRepresentative companyRepresentative) {
        params.c().b(companyRepresentative.getId());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public za1.c.a b(final Params params) {
        za1.b state = params.getState();
        if (state instanceof za1.b.Loading) {
            return za1.c.a.C6305c.f233914a;
        }
        int i15 = 0;
        za1.b.c.Dialog dialog = null;
        if (!(state instanceof za1.b.c.Screen) && !(state instanceof za1.b.c.Dialog) && !(state instanceof za1.b.c.RemovingRepresentative)) {
            if (state instanceof za1.b.RepresentativeRemovedSuccess) {
                return new za1.c.a.RepresentativeRemovedSuccess(new IconPageData(j.b.c.f164688d, this.labelProvider.c(ha1.a.f82360a5), null, null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.f82450m), null, 2, null), d.a.f107773a, null, params.a(), 35, null), null, null, 6, null), false, 76, null));
            }
            if (state instanceof za1.b.ErrorInitial) {
                return new za1.c.a.Error(((za1.b.ErrorInitial) params.getState()).getErrorVMS());
            }
            if (state instanceof za1.b.ErrorRemovingRepresentative) {
                return new za1.c.a.Error(((za1.b.ErrorRemovingRepresentative) params.getState()).getErrorVMS());
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ha1.a.f82368b5), null, null, false, null, 60, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(ha1.a.Z4);
        LinkData linkData = new LinkData(null, this.labelProvider.c(ha1.a.J4), "https://www.biznes.gov.pl/pl/e-uslugi/00_9998_00", LinkData.EnumC5775a.WEBSITE, false, params.b(), 17, null);
        List<CompanyRepresentative> listA = ((za1.b.c) state).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final CompanyRepresentative companyRepresentative = (CompanyRepresentative) obj;
            SingleCardLabel singleCardLabel = new SingleCardLabel(mx.b.b(companyRepresentative.getRole(), "representativeRoleAt" + i15), null, null, 0, 0, null, 62, null);
            n50.b.Title title = new n50.b.Title(new SingleCardLabel(mx.b.b(companyRepresentative.getName(), "representativeNameAt" + i15), null, null, 0, 0, null, 62, null));
            String krs = companyRepresentative.getKrs();
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, title, krs != null ? new SingleCardLabel(this.labelProvider.e(ha1.a.K, krs).n("representativeKrsAt" + i15), null, null, 0, 0, null, 62, null) : null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(ha1.a.f82472p), null, 2, null), d.a.f107773a, null, new er.a() { // from class: ab1.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, companyRepresentative);
                }
            }, 35, null)), null, 2815, null));
            i15 = i16;
            dialog = null;
        }
        za1.b.c.Dialog dialog2 = dialog;
        CardListData cardListData = new CardListData(arrayList, null, false, null, null, 30, null);
        Label labelC2 = this.labelProvider.c(ha1.a.Y4);
        za1.b.c.Dialog dialog3 = state instanceof za1.b.c.Dialog ? (za1.b.c.Dialog) state : dialog2;
        return new za1.c.a.Initialized(baseScaffoldData, labelC, linkData, cardListData, labelC2, dialog3 != null ? dialog3.getDialogVMSAdapter() : dialog2);
    }
}
