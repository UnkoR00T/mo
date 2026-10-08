package jn2;

import androidx.compose.ui.graphics.Color;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import kn2.NetworkSecurityIssuesMaliciousWebsiteAddressErrorData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import xl2.q5;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ljn2/h;", "Lxw/f;", "Ljn2/h$b;", "Ljn2/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lhz/b;", "", "i", "(Lhz/b;)Z", "Lmx/a;", "e", "(Lhz/b;)Lmx/a;", "params", "f", "(Ljn2/h$b;)Ljn2/f$a;", "a", "Lmx/c;", "b", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, f.Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f103801c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: jn2.h$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Ljn2/h$b;", "", "Ljn2/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "addMaliciousWebsiteAddress", "onNextAction", "onCloseAction", "onBackAction", "Lkotlin/Function1;", "", "removeWebsiteAddress", "<init>", "(Ljn2/e;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljn2/e;", "f", "()Ljn2/e;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "Ler/l;", "()Ler/l;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> addMaliciousWebsiteAddress;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Integer, i0> removeWebsiteAddress;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.l<? super Integer, i0> lVar) {
            this.state = state;
            this.addMaliciousWebsiteAddress = aVar;
            this.onNextAction = aVar2;
            this.onCloseAction = aVar3;
            this.onBackAction = aVar4;
            this.removeWebsiteAddress = lVar;
        }

        public final er.a<i0> a() {
            return this.addMaliciousWebsiteAddress;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onCloseAction;
        }

        public final er.a<i0> d() {
            return this.onNextAction;
        }

        public final er.l<Integer, i0> e() {
            return this.removeWebsiteAddress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.addMaliciousWebsiteAddress, params.addMaliciousWebsiteAddress) && fr.t.c(this.onNextAction, params.onNextAction) && fr.t.c(this.onCloseAction, params.onCloseAction) && fr.t.c(this.onBackAction, params.onBackAction) && fr.t.c(this.removeWebsiteAddress, params.removeWebsiteAddress);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.addMaliciousWebsiteAddress.hashCode()) * 31) + this.onNextAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.removeWebsiteAddress.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", addMaliciousWebsiteAddress=" + this.addMaliciousWebsiteAddress + ", onNextAction=" + this.onNextAction + ", onCloseAction=" + this.onCloseAction + ", onBackAction=" + this.onBackAction + ", removeWebsiteAddress=" + this.removeWebsiteAddress + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f103809a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-756997051);
            if (p076m2.t.k()) {
                p076m2.t.o(-756997051, i15, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.maliciouswebsite.address.NetworkSecurityIssuesMaliciousWebsiteAddressMapper.invoke.<anonymous> (NetworkSecurityIssuesMaliciousWebsiteAddressMapper.kt:100)");
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
    static final class d implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f103810a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1255421793);
            if (p076m2.t.k()) {
                p076m2.t.o(-1255421793, i15, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.maliciouswebsite.address.NetworkSecurityIssuesMaliciousWebsiteAddressMapper.invoke.<anonymous> (NetworkSecurityIssuesMaliciousWebsiteAddressMapper.kt:107)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public h(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label e(hz.b bVar) {
        return bVar instanceof hz.b.Invalid ? ((hz.b.Invalid) bVar).getMessage() : Label.INSTANCE.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, int i15) {
        params.e().b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    private final boolean i(hz.b bVar) {
        return bVar instanceof hz.b.Invalid;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public f.Data b(final Params params) {
        if (params.getState() == null) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(q5.D0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(q5.A0);
        Label labelC2 = this.labelProvider.c(q5.B0);
        List<String> listB = params.getState().b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        final int i15 = 0;
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(q5.A), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.b((String) obj, "content"), null, null, 2, 0, null, 54, null)), null, 4, null), null, x0.IconButton.INSTANCE.a(this.labelProvider.c(q5.B), new er.a() { // from class: jn2.g
                @Override // er.a
                public final Object a() {
                    return h.h(params, i15);
                }
            }), null, 2815, null));
            i15 = i16;
        }
        return new f.Data(baseScaffoldData, labelC, labelC2, arrayList, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(q5.f219556l), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null), new NetworkSecurityIssuesMaliciousWebsiteAddressErrorData(e(params.getState().getValidationState()), i(params.getState().getValidationState())), new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(q5.f219532b), null, d.f103810a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106760e0, null, c.f103809a, null, null, 26, null), 3, null), null, null, 3325, null), params.c());
    }
}
