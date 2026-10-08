package xe0;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import b30.AccordionData;
import b30.AccordionElement;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.l;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pe0.AdditionalSectionData;
import pe0.ItemData;
import pq.v;
import te0.VerificationThemeColors;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lxe0/e;", "Lxw/f;", "Lxe0/e$a;", "Lwe0/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", "info", "title", "Ln50/g;", "e", "(Lmx/a;Lmx/a;)Ln50/g;", "params", "c", "(Lxe0/e$a;)Lwe0/c$a;", "a", "Lmx/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, we0.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: xe0.e$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lxe0/e$a;", "", "Lwe0/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onSharedDataClick", "onBack", "onClose", "<init>", "(Lwe0/b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwe0/b;", "d", "()Lwe0/b;", "b", "Ler/a;", "c", "()Ler/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final we0.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSharedDataClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public Params(we0.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = bVar;
            this.onSharedDataClick = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onSharedDataClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final we0.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onSharedDataClick, params.onSharedDataClick) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onSharedDataClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSharedDataClick=" + this.onSharedDataClick + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f218120a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1186768931);
            if (p076m2.t.k()) {
                p076m2.t.o(-1186768931, i15, -1, "pl.gov.coi.mjunior.feature.verification.presentation.screen.shareddata.mapper.SharedDataMapper.invoke.<anonymous> (SharedDataMapper.kt:155)");
            }
            long headerIconBackground = ((VerificationThemeColors) rVar.N(te0.e.e())).getHeaderIconBackground();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return headerIconBackground;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData e(Label info, Label title) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(info, null, null, 3, null), new n50.b.Title(l.b(title, null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public we0.c.a b(Params params) {
        ArrayList arrayList;
        we0.b state = params.getState();
        if (state instanceof we0.b.Initial) {
            return we0.c.a.b.f212582a;
        }
        if (!(state instanceof we0.b.c)) {
            if (t.c(state, we0.b.d.f212577a)) {
                return new we0.c.a.SuccessScreen(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), null, null, null, null, 30, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.f106761e1, null, b.f218120a, this.labelProvider.c(oe0.a.C), this.labelProvider.c(oe0.a.B), null, 34, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(oe0.a.D), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(this.labelProvider.c(oe0.a.f145045z), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(oe0.a.f145020a), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null));
            }
            if (state instanceof we0.b.InitError) {
                return new we0.c.a.Error(((we0.b.InitError) state).getErrorVMS());
            }
            throw new oq.p();
        }
        we0.b.c cVar = (we0.b.c) state;
        if (!(cVar instanceof we0.b.c.CheckVerificationStatus) && !(cVar instanceof we0.b.c.Initialized) && !(cVar instanceof we0.b.c.VerifyData)) {
            if (cVar instanceof we0.b.c.Error) {
                return new we0.c.a.Error(((we0.b.c.Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(oe0.a.f145043x), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(oe0.a.f145042w);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(((we0.b.c) params.getState()).getData().getDocumentData().getDocumentTypeName(), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(cVar.getData().getDocumentData().getDocumentTypeIcon(), null, 2, null), null, null, 6, null), 3, null), null, null, 3327, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(oe0.a.f145044y), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(this.labelProvider.c(oe0.a.f145045z), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        Label labelC2 = this.labelProvider.c(oe0.a.f145041v);
        Bitmap imageBitmap = cVar.getData().getImageBitmap();
        DefaultSingleCardData defaultSingleCardData3 = imageBitmap != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(oe0.a.f145040u), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Image(imageBitmap, null, null, 6, null), 3, null), null, null, 3327, null) : null;
        List<ItemData> listI = cVar.getData().getDocumentData().i();
        int i15 = 10;
        ArrayList arrayList2 = new ArrayList(v.y(listI, 10));
        for (ItemData itemData : listI) {
            arrayList2.add(e(itemData.getLabel(), itemData.getValue()));
        }
        CardListData cardListData = new CardListData(arrayList2, null, false, null, null, 30, null);
        List<AdditionalSectionData> listA = cVar.getData().getDocumentData().a();
        if (listA != null) {
            List<AdditionalSectionData> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            for (AdditionalSectionData additionalSectionData : list) {
                Label header = additionalSectionData.getHeader();
                List<ItemData> listB = additionalSectionData.b();
                ArrayList arrayList3 = new ArrayList(v.y(listB, i15));
                for (ItemData itemData2 : listB) {
                    arrayList3.add(e(itemData2.getLabel(), itemData2.getValue()));
                }
                arrayList.add(new AccordionData(v.e(new AccordionElement(null, header, null, false, null, false, new q20.b(new CardListData(arrayList3, null, false, null, null, 30, null)), 29, null))));
                i15 = 10;
            }
        } else {
            arrayList = null;
        }
        return new we0.c.a.Initialized(baseScaffoldData, labelC, defaultSingleCardData, defaultSingleCardData2, labelC2, defaultSingleCardData3, cardListData, arrayList, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(oe0.a.f145039t), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
