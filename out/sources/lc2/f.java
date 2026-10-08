package lc2;

import er.l;
import fr.t;
import fu.r;
import h30.ButtonData;
import hl0.IdCardInvalidationTheftDescription;
import i50.BaseScaffoldData;
import java.util.List;
import jc2.Generating;
import jc2.Sending;
import jc2.Submitting;
import jc2.k;
import mc2.Section;
import mc2.StatementSection;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r30.CheckBoxRowData;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u00020)*\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010*¨\u0006,"}, d2 = {"Llc2/f;", "Lxw/f;", "Llc2/f$a;", "Ljc2/k$a;", "Lmx/c;", "labelProvider", "Llc2/a;", "applicantBasicInfoMapper", "Llc2/b;", "applicantParentInfoMapper", "Llc2/d;", "reasonMapper", "Llc2/e;", "officeMapper", "Llc2/h;", "theftDescriptionSectionMapper", "Llc2/g;", "theftDescriptionAttachmentsMapper", "Llc2/c;", "contactDetailsDataMapper", "<init>", "(Lmx/c;Llc2/a;Llc2/b;Llc2/d;Llc2/e;Llc2/h;Llc2/g;Llc2/c;)V", "params", "e", "(Llc2/f$a;)Ljc2/k$a;", "a", "Lmx/c;", "b", "Llc2/a;", "c", "Llc2/b;", "d", "Llc2/d;", "Llc2/e;", "f", "Llc2/h;", "g", "Llc2/g;", "h", "Llc2/c;", "Lhl0/a;", "", "(Lhl0/a;)I", "buttonResId", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a applicantBasicInfoMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b applicantParentInfoMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d reasonMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e officeMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h theftDescriptionSectionMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g theftDescriptionAttachmentsMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c contactDetailsDataMapper;

    /* JADX INFO: renamed from: lc2.f$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006$"}, d2 = {"Llc2/f$a;", "", "Ljc2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onSendApplicationButtonClick", "Lkotlin/Function1;", "", "onStatementChecked", "onScrolledToStatement", "onBackClick", "onCloseClick", "<init>", "(Ljc2/d;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljc2/d;", "f", "()Ljc2/d;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Ler/l;", "e", "()Ler/l;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final jc2.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSendApplicationButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onStatementChecked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToStatement;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(jc2.d dVar, er.a<i0> aVar, l<? super Boolean, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = dVar;
            this.onSendApplicationButtonClick = aVar;
            this.onStatementChecked = lVar;
            this.onScrolledToStatement = aVar2;
            this.onBackClick = aVar3;
            this.onCloseClick = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onCloseClick;
        }

        public final er.a<i0> c() {
            return this.onScrolledToStatement;
        }

        public final er.a<i0> d() {
            return this.onSendApplicationButtonClick;
        }

        public final l<Boolean, i0> e() {
            return this.onStatementChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onSendApplicationButtonClick, params.onSendApplicationButtonClick) && t.c(this.onStatementChecked, params.onStatementChecked) && t.c(this.onScrolledToStatement, params.onScrolledToStatement) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onCloseClick, params.onCloseClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final jc2.d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onSendApplicationButtonClick.hashCode()) * 31) + this.onStatementChecked.hashCode()) * 31) + this.onScrolledToStatement.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSendApplicationButtonClick=" + this.onSendApplicationButtonClick + ", onStatementChecked=" + this.onStatementChecked + ", onScrolledToStatement=" + this.onScrolledToStatement + ", onBackClick=" + this.onBackClick + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    public f(mx.c cVar, a aVar, b bVar, d dVar, e eVar, h hVar, g gVar, c cVar2) {
        this.labelProvider = cVar;
        this.applicantBasicInfoMapper = aVar;
        this.applicantParentInfoMapper = bVar;
        this.reasonMapper = dVar;
        this.officeMapper = eVar;
        this.theftDescriptionSectionMapper = hVar;
        this.theftDescriptionAttachmentsMapper = gVar;
        this.contactDetailsDataMapper = cVar2;
    }

    private final int c(hl0.a aVar) {
        if (aVar instanceof hl0.a.c) {
            return hb2.b.M;
        }
        if (aVar instanceof hl0.a.Theft) {
            return hb2.b.N;
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x012b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0161  */
    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k.a b(Params params) {
        Section sectionB;
        Section sectionB2;
        IdCardInvalidationTheftDescription descriptionData;
        IdCardInvalidationTheftDescription descriptionData2;
        jc2.d state = params.getState();
        if (state instanceof jc2.d.a) {
            return new k.a.Error(((jc2.d.a) params.getState()).getVmsAdapter());
        }
        if (!(state instanceof jc2.d.Initialized) && !(state instanceof Sending) && !(state instanceof Generating) && !(state instanceof Submitting)) {
            throw new p();
        }
        jc2.d state2 = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(hb2.b.Q), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(hb2.b.f82781e);
        c30.b.e eVar = new c30.b.e(null, null, null, this.labelProvider.c(hb2.b.Y), null, null, null, 119, null);
        Section sectionB3 = this.applicantBasicInfoMapper.b(new a.Params(state2.getInvalidationData().getInitData().getApplicantData(), state2.getInvalidationData() instanceof hl0.a.Theft));
        Section sectionB4 = this.applicantParentInfoMapper.b(new b.Params(state2.getInvalidationData().getInitData().getParentsData()));
        Section sectionB5 = this.reasonMapper.b(new d.Params(state2.getInvalidationData()));
        hl0.a invalidationData = state2.getInvalidationData();
        if (!(invalidationData instanceof hl0.a.Damage) && !(invalidationData instanceof hl0.a.Theft)) {
            invalidationData = null;
        }
        Section sectionB6 = invalidationData != null ? this.officeMapper.b(new e.Params(invalidationData.getInitData().getOfficeData(), invalidationData instanceof hl0.a.Theft)) : null;
        hl0.a invalidationData2 = state2.getInvalidationData();
        hl0.a.Theft theft = invalidationData2 instanceof hl0.a.Theft ? (hl0.a.Theft) invalidationData2 : null;
        if (theft == null || (descriptionData2 = theft.getDescriptionData()) == null) {
            sectionB = null;
        } else {
            if (r.t0(descriptionData2.getDescription())) {
                descriptionData2 = null;
            }
            if (descriptionData2 != null) {
                sectionB = this.theftDescriptionSectionMapper.b(new h.Params(descriptionData2));
            } else {
                sectionB = null;
            }
        }
        hl0.a invalidationData3 = state2.getInvalidationData();
        hl0.a.Theft theft2 = invalidationData3 instanceof hl0.a.Theft ? (hl0.a.Theft) invalidationData3 : null;
        if (theft2 == null || (descriptionData = theft2.getDescriptionData()) == null) {
            sectionB2 = null;
        } else {
            if (descriptionData.b().isEmpty()) {
                descriptionData = null;
            }
            if (descriptionData != null) {
                sectionB2 = this.theftDescriptionAttachmentsMapper.b(new g.Params(descriptionData.b()));
            } else {
                sectionB2 = null;
            }
        }
        c cVar = this.contactDetailsDataMapper;
        hl0.a invalidationData4 = state2.getInvalidationData();
        hl0.a.Theft theft3 = invalidationData4 instanceof hl0.a.Theft ? (hl0.a.Theft) invalidationData4 : null;
        List listS = v.s(sectionB3, sectionB4, sectionB5, sectionB6, sectionB, sectionB2, cVar.b(new c.Params(theft3 != null ? theft3.getContactDetails() : null, state2.getUserEdorAddress())));
        StatementSection statementSection = new StatementSection(this.labelProvider.c(hb2.b.O), new CheckBoxSingleData(new CheckBoxRowData(null, state2.getStatementData().getIsChecked(), params.e(), this.labelProvider.c(hb2.b.f82800n0), null, null, null, null, 241, null), state2.getStatementData().getShowError() ? new r30.b.Error(null, this.labelProvider.c(hb2.b.P), 1, null) : r30.b.a.f171263a, null, false, null, 28, null));
        boolean scrollTo = state2.getStatementData().getScrollTo();
        er.a<i0> aVarC = params.c();
        hl0.a invalidationData5 = state2.getInvalidationData();
        return new k.a.Initialized(baseScaffoldData, labelC, listS, statementSection, eVar, scrollTo, aVarC, (invalidationData5 instanceof hl0.a.Theft ? (hl0.a.Theft) invalidationData5 : null) != null ? new c30.b.c(null, null, null, this.labelProvider.c(hb2.b.f82802o0), null, null, null, 119, null) : null, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(c(state2.getInvalidationData())), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null));
    }
}
