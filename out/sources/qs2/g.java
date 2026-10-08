package qs2;

import fr.t;
import g70.ShortcutMoreData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import mz3.z;
import o20.BaseDocumentComponentNewData;
import o50.SmallCardData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ps2.k;
import ps2.l;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u001c*\u00020\u001c2\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lqs2/g;", "Lxw/f;", "Lqs2/g$a;", "Lps2/l$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lps2/k$a;", "params", "Lo20/j;", "i", "(Lps2/k$a;Lqs2/g$a;)Lo20/j;", "", "zusServiceAvailable", "Lkotlin/Function0;", "Loq/i0;", "onGoToVerification", "onGoToZusVisit", "onDeleteDocument", "", "Lo50/a;", "f", "(ZLer/a;Ler/a;Ler/a;)Ljava/util/List;", "h", "(Lqs2/g$a;)Lps2/l$a;", "Lmx/a;", "", "tagId", "q", "(Lmx/a;I)Lmx/a;", "a", "Lmx/c;", "b", "Lez/e;", "pensionercard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<PensionerCardMapperParams, l.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: qs2.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b&\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b\u001f\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u001b\u0010%R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"¨\u0006)"}, d2 = {"Lqs2/g$a;", "", "Lps2/k;", "state", "Lkotlin/Function1;", "Lmz3/z$b;", "Loq/i0;", "refreshPensionerCard", "Lkotlin/Function0;", "goToQrScanner", "goToZusVisit", "deleteDocument", "close", "Ln20/a;", "dispatchAction", "<init>", "(Lps2/k;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lps2/k;", "f", "()Lps2/k;", "b", "Ler/l;", "e", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "d", "g", "getDispatchAction", "pensionercard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PensionerCardMapperParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<z.b, i0> refreshPensionerCard;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToQrScanner;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToZusVisit;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteDocument;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> close;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<n20.a, i0> dispatchAction;

        /* JADX WARN: Multi-variable type inference failed */
        public PensionerCardMapperParams(k kVar, er.l<? super z.b, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.l<? super n20.a, i0> lVar2) {
            this.state = kVar;
            this.refreshPensionerCard = lVar;
            this.goToQrScanner = aVar;
            this.goToZusVisit = aVar2;
            this.deleteDocument = aVar3;
            this.close = aVar4;
            this.dispatchAction = lVar2;
        }

        public final er.a<i0> a() {
            return this.close;
        }

        public final er.a<i0> b() {
            return this.deleteDocument;
        }

        public final er.a<i0> c() {
            return this.goToQrScanner;
        }

        public final er.a<i0> d() {
            return this.goToZusVisit;
        }

        public final er.l<z.b, i0> e() {
            return this.refreshPensionerCard;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PensionerCardMapperParams)) {
                return false;
            }
            PensionerCardMapperParams pensionerCardMapperParams = (PensionerCardMapperParams) other;
            return t.c(this.state, pensionerCardMapperParams.state) && t.c(this.refreshPensionerCard, pensionerCardMapperParams.refreshPensionerCard) && t.c(this.goToQrScanner, pensionerCardMapperParams.goToQrScanner) && t.c(this.goToZusVisit, pensionerCardMapperParams.goToZusVisit) && t.c(this.deleteDocument, pensionerCardMapperParams.deleteDocument) && t.c(this.close, pensionerCardMapperParams.close) && t.c(this.dispatchAction, pensionerCardMapperParams.dispatchAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final k getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.refreshPensionerCard.hashCode()) * 31) + this.goToQrScanner.hashCode()) * 31) + this.goToZusVisit.hashCode()) * 31) + this.deleteDocument.hashCode()) * 31) + this.close.hashCode()) * 31) + this.dispatchAction.hashCode();
        }

        public String toString() {
            return "PensionerCardMapperParams(state=" + this.state + ", refreshPensionerCard=" + this.refreshPensionerCard + ", goToQrScanner=" + this.goToQrScanner + ", goToZusVisit=" + this.goToZusVisit + ", deleteDocument=" + this.deleteDocument + ", close=" + this.close + ", dispatchAction=" + this.dispatchAction + ')';
        }
    }

    public g(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final List<SmallCardData> f(boolean zusServiceAvailable, er.a<i0> onGoToVerification, er.a<i0> onGoToZusVisit, er.a<i0> onDeleteDocument) {
        Label labelC = this.labelProvider.c(ks2.a.f112609n);
        int i15 = jz.a.f106785h1;
        o50.f.c cVar = o50.f.c.f142478a;
        SmallCardData smallCardData = new SmallCardData(null, labelC, null, i15, cVar, false, onGoToVerification, 37, null);
        SmallCardData smallCardData2 = new SmallCardData(null, this.labelProvider.c(ks2.a.f112613r), null, jz.a.f106910z0, cVar, false, onGoToZusVisit, 37, null);
        if (!zusServiceAvailable) {
            smallCardData2 = null;
        }
        return v.s(smallCardData, smallCardData2, new SmallCardData(null, this.labelProvider.c(ks2.a.f112601f), null, jz.a.f106727a, o50.f.b.f142477a, false, onDeleteDocument, 37, null));
    }

    private final BaseDocumentComponentNewData i(k.DataSet dataSet, final PensionerCardMapperParams pensionerCardMapperParams) {
        o20.l.Shortcuts shortcuts = new o20.l.Shortcuts(new ShortcutsLayoutData(f(dataSet.getZusServiceAvailable(), pensionerCardMapperParams.c(), pensionerCardMapperParams.d(), pensionerCardMapperParams.b()), new ShortcutMoreData(this.labelProvider.c(ks2.a.f112610o), new er.l() { // from class: qs2.e
            @Override // er.l
            public final Object b(Object obj) {
                return g.l((List) obj);
            }
        })));
        Label labelC = this.labelProvider.c(ks2.a.f112603h);
        String ts4 = dataSet.getPensionerCardDocumentData().getScope().getDataHeaderStandard().getTs();
        return new BaseDocumentComponentNewData(null, v.s(shortcuts, new o20.l.UpdateDataItem(labelC, q(mx.b.d(ts4 != null ? this.dateFormatter.d(new fz.b.String(ts4, fz.c.FULL_TIME_NO_SPACES, false, 4, null), fz.c.DOTTED) : null, ""), ks2.a.f112603h), this.labelProvider.c(ks2.a.f112604i), null, new er.a() { // from class: qs2.f
            @Override // er.a
            public final Object a() {
                return g.m(pensionerCardMapperParams);
            }
        }, 8, null)), null, v.e(new c30.b.c(null, null, null, this.labelProvider.c(ks2.a.f112617v), null, null, null, 119, null)), 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(PensionerCardMapperParams pensionerCardMapperParams) {
        pensionerCardMapperParams.e().b(z.b.UPDATE);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public l.a b(PensionerCardMapperParams params) {
        Label labelN;
        k state = params.getState();
        if (state instanceof k.b) {
            return l.a.C4002a.f162293a;
        }
        if (!(state instanceof k.DataSet)) {
            throw new p();
        }
        k.DataSet dataSet = (k.DataSet) state;
        String documentShortName = dataSet.getDocumentShortName();
        if (documentShortName == null || (labelN = mx.b.b(documentShortName, "title")) == null) {
            labelN = this.labelProvider.c(ks2.a.f112618w).n("title");
        }
        return new l.a.Initialized(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), labelN, null, null, null, 28, null), null, null, null, null, 61, null), i(dataSet, params), dataSet.getDocumentCardVMSAdapter());
    }

    public final Label q(Label label, int i15) {
        return Label.f(this.labelProvider.b(label.getText(), i15), "Value", null, 2, null);
    }
}
