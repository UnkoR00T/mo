package lo3;

import co3.n;
import fr.k;
import fr.t;
import h30.ButtonData;
import java.util.List;
import k34.a0;
import k34.g;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003$\"%B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001b*\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Llo3/e;", "Lxw/f;", "Llo3/e$c;", "Ln30/b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "", "Ln50/g;", "q", "(Llo3/e$c;)Ljava/util/List;", "f", "(Llo3/e$c;)Ln50/g;", "l", "Lk34/g;", "document", "Lk34/a0;", "scope", "", "i", "(Lk34/g;Lk34/a0;)I", "Lco3/n;", "subDocument", "Lrq0/b;", "documentType", "Lmx/a;", "r", "(Lco3/n;Lrq0/b;)Lmx/a;", "u", "(Lco3/n;)Lmx/a;", "s", "(Llo3/e$c;)Ln30/b;", "a", "Lmx/c;", "b", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, CardListData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: lo3.e$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Llo3/e$c;", "", "Llo3/e$b;", "mainData", "Llo3/e$a;", "additionalData", "<init>", "(Llo3/e$b;Llo3/e$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llo3/e$b;", "b", "()Llo3/e$b;", "Llo3/e$a;", "()Llo3/e$a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final MainData mainData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AdditionalData additionalData;

        public Params(MainData mainData, AdditionalData additionalData) {
            this.mainData = mainData;
            this.additionalData = additionalData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AdditionalData getAdditionalData() {
            return this.additionalData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final MainData getMainData() {
            return this.mainData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.mainData, params.mainData) && t.c(this.additionalData, params.additionalData);
        }

        public int hashCode() {
            int iHashCode = this.mainData.hashCode() * 31;
            AdditionalData additionalData = this.additionalData;
            return iHashCode + (additionalData == null ? 0 : additionalData.hashCode());
        }

        public String toString() {
            return "Params(mainData=" + this.mainData + ", additionalData=" + this.additionalData + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f119031a;

        static {
            int[] iArr = new int[wn3.a.values().length];
            try {
                iArr[wn3.a.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wn3.a.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f119031a = iArr;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData f(final Params params) {
        DefaultSingleCardData defaultSingleCardData;
        AdditionalData additionalData = params.getAdditionalData();
        if (additionalData == null) {
            defaultSingleCardData = null;
        } else if (params.getAdditionalData().getIsChangeable()) {
            Label selectorInfoText = additionalData.getSelectorInfoText();
            SingleCardLabel singleCardLabel = selectorInfoText != null ? new SingleCardLabel(selectorInfoText, null, null, 0, 0, null, 62, null) : null;
            n50.b.Title title = new n50.b.Title(new SingleCardLabel(r(additionalData.getSelectedDocument(), params.getMainData().getSelectedDocument().getType()), null, null, 0, 0, null, 62, null));
            String body = additionalData.getSelectedDocument().getBody();
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, title, body != null ? new SingleCardLabel(mx.b.b(body, "body"), null, null, 0, 0, null, 62, null) : null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(un3.b.f199401c), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: lo3.d
                @Override // er.a
                public final Object a() {
                    return e.h(params);
                }
            }, 35, null)), null, 2815, null);
        } else {
            Label selectorInfoText2 = additionalData.getSelectorInfoText();
            SingleCardLabel singleCardLabel2 = selectorInfoText2 != null ? new SingleCardLabel(selectorInfoText2, null, null, 0, 0, null, 62, null) : null;
            n50.b.Title title2 = new n50.b.Title(new SingleCardLabel(r(additionalData.getSelectedDocument(), params.getMainData().getSelectedDocument().getType()), null, null, 0, 0, null, 62, null));
            String body2 = additionalData.getSelectedDocument().getBody();
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, title2, body2 != null ? new SingleCardLabel(mx.b.b(body2, "body"), null, null, 0, 0, null, 62, null) : null), null, null, null, 3839, null);
        }
        AdditionalData additionalData2 = params.getAdditionalData();
        if (additionalData2 == null || additionalData2.getIsSingleSubDocument()) {
            return null;
        }
        return defaultSingleCardData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params) {
        er.a<i0> aVarA = params.getAdditionalData().a();
        if (aVarA != null) {
            aVarA.a();
        }
        return i0.f148189a;
    }

    private final int i(g document, a0 scope) {
        if (t.c(scope, a0.m.f107878a)) {
            return un3.b.I1;
        }
        return (t.c(scope, a0.n.f107880a) || t.c(scope, a0.o.f107882a) || t.c(scope, a0.p.f107884a) || t.c(scope, a0.q.f107886a) || t.c(scope, a0.r.f107888a) || t.c(scope, a0.s.f107890a) || t.c(scope, a0.t.f107892a) || t.c(scope, a0.v.f107896a)) ? un3.b.G1 : document.getName();
    }

    private final DefaultSingleCardData l(final Params params) {
        if (!params.getMainData().getIsChangeable()) {
            return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(i(params.getMainData().getSelectedDocument(), params.getMainData().getSelectedScope())), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new i.Resource(new i.Resource.a.DrawableResource(params.getMainData().getSelectedDocument().getIcons().getIcon(), null, 2, null), null, null, 6, null), 3, null), null, null, 3327, null);
        }
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(i(params.getMainData().getSelectedDocument(), params.getMainData().getSelectedScope())), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new i.Resource(new i.Resource.a.DrawableResource(params.getMainData().getSelectedDocument().getIcons().getIcon(), null, 2, null), null, null, 6, null), 3, null), new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(un3.b.f199401c), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: lo3.c
            @Override // er.a
            public final Object a() {
                return e.m(params);
            }
        }, 35, null)), null, 2303, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        er.a<i0> aVarA = params.getMainData().a();
        if (aVarA != null) {
            aVarA.a();
        }
        return i0.f148189a;
    }

    private final List<DefaultSingleCardData> q(Params params) {
        return v.s(l(params), f(params));
    }

    private final Label r(n subDocument, rq0.b documentType) {
        return (!subDocument.getIsOwner() || (subDocument instanceof n.DynamicDocument) || (subDocument instanceof n.DrivingLicenceDocument) || (subDocument instanceof n.RailwayDocument) || documentType == rq0.b.c.TEACHER || documentType == rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION || documentType == rq0.b.c.ELECTRONIC_DIPLOMA_PHD || documentType == rq0.b.c.ELECTRONIC_DIPLOMA_DSC) ? u(subDocument) : this.labelProvider.e(un3.b.f199419f2, subDocument.getName());
    }

    private final Label u(n nVar) {
        if (!(nVar instanceof n.DrivingLicenceDocument)) {
            if (nVar instanceof n.RailwayDocument) {
                n.RailwayDocument railwayDocument = (n.RailwayDocument) nVar;
                if (railwayDocument.getIsOwner() && railwayDocument.getIsFamily()) {
                    return new Label(dz.e.b(railwayDocument.getCategory().getValue(), null, 1, null), "railwayCategory");
                }
            }
            return new Label(nVar.getName(), "holderName");
        }
        int i15 = d.f119031a[((n.DrivingLicenceDocument) nVar).getSubtype().ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(un3.b.f199433i1);
        }
        if (i15 == 2) {
            return this.labelProvider.c(un3.b.f199438j1);
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public CardListData b(Params params) {
        return new CardListData(q(params), null, false, null, null, 30, null);
    }

    /* JADX INFO: renamed from: lo3.e$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, d2 = {"Llo3/e$b;", "", "", "isChangeable", "Lk34/g;", "selectedDocument", "Lk34/a0;", "selectedScope", "Lkotlin/Function0;", "Loq/i0;", "onChangedClicked", "<init>", "(ZLk34/g;Lk34/a0;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Lk34/g;", "()Lk34/g;", "c", "Lk34/a0;", "()Lk34/a0;", "Ler/a;", "()Ler/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MainData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChangeable;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final g selectedDocument;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final a0 selectedScope;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChangedClicked;

        public MainData(boolean z15, g gVar, a0 a0Var, er.a<i0> aVar) {
            this.isChangeable = z15;
            this.selectedDocument = gVar;
            this.selectedScope = a0Var;
            this.onChangedClicked = aVar;
        }

        public final er.a<i0> a() {
            return this.onChangedClicked;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final g getSelectedDocument() {
            return this.selectedDocument;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a0 getSelectedScope() {
            return this.selectedScope;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsChangeable() {
            return this.isChangeable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainData)) {
                return false;
            }
            MainData mainData = (MainData) other;
            return this.isChangeable == mainData.isChangeable && t.c(this.selectedDocument, mainData.selectedDocument) && t.c(this.selectedScope, mainData.selectedScope) && t.c(this.onChangedClicked, mainData.onChangedClicked);
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isChangeable) * 31) + this.selectedDocument.hashCode()) * 31) + this.selectedScope.hashCode()) * 31;
            er.a<i0> aVar = this.onChangedClicked;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "MainData(isChangeable=" + this.isChangeable + ", selectedDocument=" + this.selectedDocument + ", selectedScope=" + this.selectedScope + ", onChangedClicked=" + this.onChangedClicked + ')';
        }

        public /* synthetic */ MainData(boolean z15, g gVar, a0 a0Var, er.a aVar, int i15, k kVar) {
            this((i15 & 1) != 0 ? false : z15, gVar, a0Var, (i15 & 8) != 0 ? null : aVar);
        }
    }

    /* JADX INFO: renamed from: lo3.e$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001d\u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u0017\u0010#¨\u0006$"}, d2 = {"Llo3/e$a;", "", "", "isChangeable", "isSingleSubDocument", "Lco3/n;", "selectedDocument", "Lmx/a;", "selectorInfoText", "Lkotlin/Function0;", "Loq/i0;", "onChangedClicked", "<init>", "(ZZLco3/n;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "e", "c", "Lco3/n;", "()Lco3/n;", "Lmx/a;", "()Lmx/a;", "Ler/a;", "()Ler/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChangeable;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSingleSubDocument;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final n selectedDocument;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label selectorInfoText;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChangedClicked;

        public AdditionalData(boolean z15, boolean z16, n nVar, Label label, er.a<i0> aVar) {
            this.isChangeable = z15;
            this.isSingleSubDocument = z16;
            this.selectedDocument = nVar;
            this.selectorInfoText = label;
            this.onChangedClicked = aVar;
        }

        public final er.a<i0> a() {
            return this.onChangedClicked;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n getSelectedDocument() {
            return this.selectedDocument;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getSelectorInfoText() {
            return this.selectorInfoText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsChangeable() {
            return this.isChangeable;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsSingleSubDocument() {
            return this.isSingleSubDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalData)) {
                return false;
            }
            AdditionalData additionalData = (AdditionalData) other;
            return this.isChangeable == additionalData.isChangeable && this.isSingleSubDocument == additionalData.isSingleSubDocument && t.c(this.selectedDocument, additionalData.selectedDocument) && t.c(this.selectorInfoText, additionalData.selectorInfoText) && t.c(this.onChangedClicked, additionalData.onChangedClicked);
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.isChangeable) * 31) + Boolean.hashCode(this.isSingleSubDocument)) * 31) + this.selectedDocument.hashCode()) * 31;
            Label label = this.selectorInfoText;
            int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
            er.a<i0> aVar = this.onChangedClicked;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "AdditionalData(isChangeable=" + this.isChangeable + ", isSingleSubDocument=" + this.isSingleSubDocument + ", selectedDocument=" + this.selectedDocument + ", selectorInfoText=" + this.selectorInfoText + ", onChangedClicked=" + this.onChangedClicked + ')';
        }

        public /* synthetic */ AdditionalData(boolean z15, boolean z16, n nVar, Label label, er.a aVar, int i15, k kVar) {
            this((i15 & 1) != 0 ? false : z15, z16, nVar, label, (i15 & 16) != 0 ? null : aVar);
        }
    }
}
