package gx0;

import fr.t;
import fr0.BEDocumentConfigLabel;
import fx0.c;
import h30.ButtonData;
import hx0.AvailableCertifiedDocumentCardData;
import hx0.AvailableDocumentCardData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k30.d;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgx0/b;", "Lxw/f;", "Lgx0/b$a;", "Lfx0/c$a;", "Lmx/c;", "labelProvider", "Lg34/b;", "documentRemoteResourcesMapper", "<init>", "(Lmx/c;Lg34/b;)V", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Li50/a;", "e", "(Ler/a;)Li50/a;", "params", "f", "(Lgx0/b$a;)Lfx0/c$a;", "a", "Lmx/c;", "b", "Lg34/b;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g34.b documentRemoteResourcesMapper;

    /* JADX INFO: renamed from: gx0.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lgx0/b$a;", "", "Lfx0/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "addDocumentsAction", "<init>", "(Lfx0/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfx0/b;", "c", "()Lfx0/b;", "b", "Ler/a;", "()Ler/a;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final fx0.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> addDocumentsAction;

        public Params(fx0.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.onBackAction = aVar;
            this.addDocumentsAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.addDocumentsAction;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final fx0.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.addDocumentsAction, params.addDocumentsAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.addDocumentsAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", addDocumentsAction=" + this.addDocumentsAction + ')';
        }
    }

    public b(mx.c cVar, g34.b bVar) {
        this.labelProvider = cVar;
        this.documentRemoteResourcesMapper = bVar;
    }

    private final BaseScaffoldData e(er.a<i0> onBackAction) {
        return new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new i.Large(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBackAction), this.labelProvider.c(yw0.a.f229984m), null, null, null, 28, null), null, null, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(AvailableDocumentCardData availableDocumentCardData) {
        availableDocumentCardData.getCheckboxData().getCheckbox().h().b(Boolean.valueOf(!availableDocumentCardData.getCheckboxData().getCheckbox().getIsChecked()));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x02f8  */
    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        k30.b bVar;
        SingleCardLabel singleCardLabel;
        SingleCardLabel singleCardLabel2;
        fx0.b state = params.getState();
        if (state instanceof fx0.b.InterfaceC1528b) {
            return c.a.b.f68492a;
        }
        if (!(state instanceof fx0.b.a)) {
            throw new p();
        }
        fx0.b.a aVar = (fx0.b.a) state;
        int i15 = 0;
        boolean z15 = (aVar.getAvailableDocuments().d().isEmpty() && aVar.getAvailableDocuments().c().isEmpty()) ? false : true;
        if (!z15) {
            return new c.a.InterfaceC1530a.Empty(e(params.b()), params.b(), new IconPageData(new j.a(jz.a.f106754d2), this.labelProvider.c(yw0.a.f229983l), null, null, null, null, false, 76, null));
        }
        if (!z15) {
            throw new p();
        }
        k30.a.Large large = new k30.a.Large(false, 1, null);
        d.a aVar2 = d.a.f107773a;
        k30.c.WithText withText = new k30.c.WithText(this.labelProvider.c(yw0.a.I), null, 2, null);
        List<AvailableDocumentCardData> listD = aVar.getAvailableDocuments().d();
        if (!(listD instanceof Collection) || !listD.isEmpty()) {
            Iterator<T> it = listD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = k30.b.C2562b.f107767a;
                    break;
                }
                if (((AvailableDocumentCardData) it.next()).getCheckboxData().getCheckbox().getIsChecked()) {
                    bVar = k30.b.c.f107768a;
                    break;
                }
            }
        } else {
            bVar = k30.b.C2562b.f107767a;
            break;
        }
        ButtonData buttonData = new ButtonData(null, null, large, withText, aVar2, bVar, params.a(), 3, null);
        Label labelC = this.labelProvider.c(yw0.a.f229982k);
        Label labelC2 = this.labelProvider.c(yw0.a.f229981j);
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        for (Object obj : aVar.getAvailableDocuments().d()) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            final AvailableDocumentCardData availableDocumentCardData = (AvailableDocumentCardData) obj;
            String strA = this.documentRemoteResourcesMapper.a(availableDocumentCardData.getAddingDocument().getConfig().g());
            if (strA != null) {
                boolean isEnabled = availableDocumentCardData.getCheckboxData().getIsEnabled();
                LeadingSection leadingSection = new LeadingSection(false, new n50.d.CheckBox(availableDocumentCardData.getCheckboxData().getCheckbox().getIsChecked()), new n50.i.Resource(new n50.i.Resource.a.DrawableResource(availableDocumentCardData.getAddingDocument().getDocument().getIcons().getIcon(), null, 2, null), null, null, 6, null), 1, null);
                n50.b.Title title = new n50.b.Title(new SingleCardLabel(mx.b.b(strA, "documentsToAddName_" + i16), null, null, 0, 0, null, 62, null));
                List<BEDocumentConfigLabel> listA = availableDocumentCardData.getAddingDocument().getConfig().a();
                if (listA != null) {
                    List<BEDocumentConfigLabel> list = listA;
                    if (list.isEmpty()) {
                        list = null;
                    }
                    List<BEDocumentConfigLabel> list2 = list;
                    if (list2 != null) {
                        String strA2 = this.documentRemoteResourcesMapper.a(list2);
                        singleCardLabel2 = strA2 != null ? new SingleCardLabel(mx.b.b(strA2, "documentsToAddDescription_" + i16), null, null, 0, 0, null, 62, null) : null;
                    } else {
                        singleCardLabel2 = null;
                    }
                } else {
                    singleCardLabel2 = null;
                }
                arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: gx0.a
                    @Override // er.a
                    public final Object a() {
                        return b.h(availableDocumentCardData);
                    }
                }, isEnabled, null, null, false, null, null, new BodySection(null, title, singleCardLabel2, 1, null), leadingSection, null, null, 3321, null));
            }
            i16 = i17;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : aVar.getAvailableDocuments().c()) {
            int i18 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            AvailableCertifiedDocumentCardData availableCertifiedDocumentCardData = (AvailableCertifiedDocumentCardData) obj2;
            String strA3 = this.documentRemoteResourcesMapper.a(availableCertifiedDocumentCardData.getAddingDocument().getConfig().g());
            if (strA3 != null) {
                LeadingSection leadingSection2 = new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(availableCertifiedDocumentCardData.getAddingDocument().getDocument().getIcons().getIcon(), null, 2, null), null, null, 6, null), 3, null);
                n50.b.Title title2 = new n50.b.Title(new SingleCardLabel(mx.b.b(strA3, "certifiedDocumentsToAddName_" + i15), null, null, 0, 0, null, 62, null));
                List<BEDocumentConfigLabel> listA2 = availableCertifiedDocumentCardData.getAddingDocument().getConfig().a();
                if (listA2 != null) {
                    List<BEDocumentConfigLabel> list3 = listA2;
                    if (list3.isEmpty()) {
                        list3 = null;
                    }
                    List<BEDocumentConfigLabel> list4 = list3;
                    if (list4 != null) {
                        String strA4 = this.documentRemoteResourcesMapper.a(list4);
                        singleCardLabel = strA4 != null ? new SingleCardLabel(mx.b.b(strA4, "certifiedDocumentsToAddDescription_" + i15), null, null, 0, 0, null, 62, null) : null;
                    } else {
                        singleCardLabel = null;
                    }
                } else {
                    singleCardLabel = null;
                }
                arrayList2.add(new DefaultSingleCardData(null, availableCertifiedDocumentCardData.b(), false, null, null, false, null, null, new BodySection(null, title2, singleCardLabel, 1, null), leadingSection2, new x0.Icon(jz.a.V, null, null, 6, null), null, 2301, null));
            }
            i15 = i18;
        }
        return new c.a.InterfaceC1530a.WithDocuments(e(params.b()), params.b(), buttonData, labelC, arrayList, labelC2, arrayList2);
    }
}
