package cp3;

import bp3.d;
import co3.SummaryData;
import co3.n;
import eo3.DocumentConfigLabel;
import eo3.MultiDocumentSelectorLabel;
import fr.t;
import fu.r;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J#\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u0004\u0018\u00010\u001f*\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010)¨\u0006*"}, d2 = {"Lcp3/a;", "Lxw/f;", "Lcp3/a$a;", "Lbp3/d$a;", "Lmx/c;", "labelProvider", "Ljo3/d;", "verificationDataLabelMapper", "Llo3/b;", "documentRemoteResourcesMapper", "<init>", "(Lmx/c;Ljo3/d;Llo3/b;)V", "Lco3/o;", "summaryData", "Ln50/g;", "l", "(Lco3/o;)Ln50/g;", "m", "Leo3/p;", "multiDocumentSelectorLabel", "Ln30/b;", "i", "(Lco3/o;Leo3/p;)Ln30/b;", "Lmx/a;", "c", "(Lco3/o;)Lmx/a;", "e", "f", "(Lco3/o;Leo3/p;)Ln50/g;", "", "Leo3/a;", "", "q", "(Ljava/util/List;)Ljava/lang/String;", "params", "h", "(Lcp3/a$a;)Lbp3/d$a;", "a", "Lmx/c;", "b", "Ljo3/d;", "Llo3/b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jo3.d verificationDataLabelMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lo3.b documentRemoteResourcesMapper;

    /* JADX INFO: renamed from: cp3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcp3/a$a;", "", "Lbp3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Lbp3/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbp3/c;", "b", "()Lbp3/c;", "Ler/a;", "()Ler/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final bp3.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        public Params(bp3.c cVar, er.a<i0> aVar) {
            this.state = cVar;
            this.onBackClick = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final bp3.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBackClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37251a;

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
            f37251a = iArr;
        }
    }

    public a(c cVar, jo3.d dVar, lo3.b bVar) {
        this.labelProvider = cVar;
        this.verificationDataLabelMapper = dVar;
        this.documentRemoteResourcesMapper = bVar;
    }

    private final Label c(SummaryData summaryData) {
        StringBuilder sb5 = new StringBuilder();
        List<Label> listA = this.verificationDataLabelMapper.a(summaryData.a());
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        int i15 = 0;
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            sb5.append("  •  ");
            sb5.append(((Label) obj).getText());
            if (i15 != v.p(summaryData.a())) {
                sb5.append("\n");
            }
            arrayList.add(i0.f148189a);
            i15 = i16;
        }
        return mx.b.b(sb5.toString(), "bulletList");
    }

    private final DefaultSingleCardData e(SummaryData summaryData) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(un3.b.L0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(c(summaryData), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
    }

    private final DefaultSingleCardData f(SummaryData summaryData, MultiDocumentSelectorLabel multiDocumentSelectorLabel) {
        n subDocument;
        Label labelD;
        Label labelC;
        Label labelB;
        List<DocumentConfigLabel> listC;
        String strQ;
        SingleCardLabel singleCardLabel = null;
        if ((summaryData.getType() instanceof SummaryData.a.Person) && !(((SummaryData.a.Person) summaryData.getType()).getSubDocument() instanceof n.DrivingLicenceDocument) && !((SummaryData.a.Person) summaryData.getType()).getIsSingleSubDocument() && (subDocument = ((SummaryData.a.Person) summaryData.getType()).getSubDocument()) != null) {
            if (subDocument.getIsOwner()) {
                String name = subDocument.getName();
                if (r.t0(name) || (((SummaryData.a.Person) summaryData.getType()).getSubDocument() instanceof n.DynamicDocument) || (((SummaryData.a.Person) summaryData.getType()).getSubDocument() instanceof n.d.TeacherCard) || (((SummaryData.a.Person) summaryData.getType()).getSubDocument() instanceof n.d.ElectronicDiplomaGraduation) || (((SummaryData.a.Person) summaryData.getType()).getSubDocument() instanceof n.d.ElectronicDiplomaPhd) || (((SummaryData.a.Person) summaryData.getType()).getSubDocument() instanceof n.d.ElectronicDiplomaDsc)) {
                    name = null;
                }
                if (name == null || (labelD = this.labelProvider.e(un3.b.f199419f2, subDocument.getName())) == null) {
                    labelD = mx.b.b(subDocument.getName(), "name");
                }
            } else {
                labelD = mx.b.d(subDocument.getName(), "name");
            }
            Label label = labelD;
            if (label != null) {
                n50.b.Title title = new n50.b.Title(new SingleCardLabel(label, null, null, 0, 0, null, 62, null));
                if (multiDocumentSelectorLabel == null || (listC = multiDocumentSelectorLabel.c()) == null || (strQ = q(listC)) == null || (labelC = mx.b.b(strQ, "selectionLabel")) == null) {
                    labelC = this.labelProvider.c(un3.b.f199409d2);
                }
                SingleCardLabel singleCardLabel2 = new SingleCardLabel(labelC, null, null, 0, 0, null, 62, null);
                String body = ((SummaryData.a.Person) summaryData.getType()).getSubDocument().getBody();
                if (body != null && (labelB = mx.b.b(body, "description")) != null) {
                    singleCardLabel = new SingleCardLabel(labelB, null, null, 0, 0, null, 62, null);
                }
                return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, title, singleCardLabel), null, null, null, 3839, null);
            }
        }
        return null;
    }

    private final CardListData i(SummaryData summaryData, MultiDocumentSelectorLabel multiDocumentSelectorLabel) {
        return new CardListData(v.s(f(summaryData, multiDocumentSelectorLabel), e(summaryData)), null, false, null, null, 30, null);
    }

    private final DefaultSingleCardData l(SummaryData summaryData) {
        oq.r rVar;
        SummaryData.a type = summaryData.getType();
        if (t.c(type, SummaryData.a.c.f28537a)) {
            rVar = new oq.r(this.labelProvider.c(un3.b.F0), this.labelProvider.c(un3.b.G3));
        } else if (type instanceof SummaryData.a.Person) {
            rVar = new oq.r(this.labelProvider.c(un3.b.f199424g2), this.labelProvider.c(un3.b.f199470p3));
        } else {
            if (!(type instanceof SummaryData.a.Institutions)) {
                throw new p();
            }
            rVar = new oq.r(this.labelProvider.c(un3.b.M0), mx.b.d(((SummaryData.a.Institutions) summaryData.getType()).getValue(), "name"));
        }
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel((Label) rVar.a(), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel((Label) rVar.b(), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
    }

    private final DefaultSingleCardData m(SummaryData summaryData) {
        wn3.a subtype;
        int i15;
        SummaryData.a type = summaryData.getType();
        SummaryData.a.Person person = type instanceof SummaryData.a.Person ? (SummaryData.a.Person) type : null;
        n subDocument = person != null ? person.getSubDocument() : null;
        n.DrivingLicenceDocument drivingLicenceDocument = subDocument instanceof n.DrivingLicenceDocument ? (n.DrivingLicenceDocument) subDocument : null;
        if (drivingLicenceDocument == null || (subtype = drivingLicenceDocument.getSubtype()) == null) {
            return null;
        }
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(un3.b.f199428h1), null, null, 0, 0, null, 62, null);
        c cVar = this.labelProvider;
        int i16 = b.f37251a[subtype.ordinal()];
        if (i16 == 1) {
            i15 = un3.b.f199433i1;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            i15 = un3.b.f199438j1;
        }
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(cVar.c(i15), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
    }

    private final String q(List<DocumentConfigLabel> list) {
        if (list != null) {
            return this.documentRemoteResourcesMapper.a(list);
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        bp3.c state = params.getState();
        if (state instanceof bp3.c.a) {
            return d.a.C0546a.f21112a;
        }
        if (!(state instanceof bp3.c.Initialized)) {
            throw new p();
        }
        DefaultSingleCardData defaultSingleCardDataL = l(((bp3.c.Initialized) params.getState()).getSummaryData());
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), Label.INSTANCE.c(), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(un3.b.O0);
        DefaultSingleCardData defaultSingleCardDataM = m(((bp3.c.Initialized) params.getState()).getSummaryData());
        SummaryData summaryData = ((bp3.c.Initialized) params.getState()).getSummaryData();
        SummaryData.a type = ((bp3.c.Initialized) params.getState()).getSummaryData().getType();
        SummaryData.a.Person person = type instanceof SummaryData.a.Person ? (SummaryData.a.Person) type : null;
        return new d.a.Initialized(baseScaffoldData, labelC, defaultSingleCardDataL, defaultSingleCardDataM, i(summaryData, person != null ? person.getMultiDocumentSelectorLabel() : null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(un3.b.f199406d), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), params.a());
    }
}
