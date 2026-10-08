package ch2;

import bh2.d;
import er.l;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import tq0.k;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lch2/c;", "Lxw/f;", "Lch2/c$a;", "Lbh2/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Llg2/a;", "departmentMapper", "<init>", "(Lmx/c;Lez/e;Llg2/a;)V", "params", "f", "(Lch2/c$a;)Lbh2/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Llg2/a;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lg2.a departmentMapper;

    /* JADX INFO: renamed from: ch2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b \u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lch2/c$a;", "", "Lbh2/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Ltq0/b;", "onDownloadDocumentClick", "onDownloadConfirmationClick", "onCheckChangesInDocument", "onVerificationCardClick", "<init>", "(Lbh2/c;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbh2/c;", "f", "()Lbh2/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "d", "()Ler/l;", "e", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final bh2.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<tq0.b, i0> onDownloadDocumentClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<tq0.b, i0> onDownloadConfirmationClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCheckChangesInDocument;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onVerificationCardClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(bh2.c cVar, er.a<i0> aVar, l<? super tq0.b, i0> lVar, l<? super tq0.b, i0> lVar2, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = cVar;
            this.onBack = aVar;
            this.onDownloadDocumentClick = lVar;
            this.onDownloadConfirmationClick = lVar2;
            this.onCheckChangesInDocument = aVar2;
            this.onVerificationCardClick = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onCheckChangesInDocument;
        }

        public final l<tq0.b, i0> c() {
            return this.onDownloadConfirmationClick;
        }

        public final l<tq0.b, i0> d() {
            return this.onDownloadDocumentClick;
        }

        public final er.a<i0> e() {
            return this.onVerificationCardClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onDownloadDocumentClick, params.onDownloadDocumentClick) && t.c(this.onDownloadConfirmationClick, params.onDownloadConfirmationClick) && t.c(this.onCheckChangesInDocument, params.onCheckChangesInDocument) && t.c(this.onVerificationCardClick, params.onVerificationCardClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final bh2.c getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onDownloadDocumentClick.hashCode()) * 31) + this.onDownloadConfirmationClick.hashCode()) * 31) + this.onCheckChangesInDocument.hashCode()) * 31) + this.onVerificationCardClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onDownloadDocumentClick=" + this.onDownloadDocumentClick + ", onDownloadConfirmationClick=" + this.onDownloadConfirmationClick + ", onCheckChangesInDocument=" + this.onCheckChangesInDocument + ", onVerificationCardClick=" + this.onVerificationCardClick + ')';
        }
    }

    public c(mx.c cVar, e eVar, lg2.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.departmentMapper = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, tq0.b.Main main) {
        params.d().b(main);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, tq0.b.Confirmation confirmation) {
        params.c().b(confirmation);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.a b(final Params params) {
        String strD;
        DefaultSingleCardData defaultSingleCardData;
        DefaultSingleCardData defaultSingleCardData2;
        bh2.c state = params.getState();
        if (state instanceof bh2.c.Error) {
            return new d.a.Error(((bh2.c.Error) state).getErrorVMSAdapter());
        }
        if (!(state instanceof bh2.c.Downloading) && !(state instanceof bh2.c.Content) && !(state instanceof bh2.c.PermissionDialog)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(xf2.a.R), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(xf2.a.Q);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(xf2.a.O), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(params.getState().getOrderedDocument().getDocumentNumber(), ""), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(xf2.a.J), null, null, 3, null), new n50.b.Title(n50.l.b(this.labelProvider.c(lg2.c.a(params.getState().getOrderedDocument().getType())), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        String strB = this.departmentMapper.b(params.getState().getOrderedDocument().a());
        DefaultSingleCardData defaultSingleCardData5 = strB != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(xf2.a.P), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(strB, "departments"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null) : null;
        SingleCardLabel singleCardLabelB = n50.l.b(this.labelProvider.c(xf2.a.L), null, null, 3, null);
        fz.b.OffsetDateTime documentDownloadValidUntil = params.getState().getOrderedDocument().getDocumentDownloadValidUntil();
        if (documentDownloadValidUntil == null || (strD = this.dateFormatter.d(documentDownloadValidUntil, fz.c.DOTTED_PLUS_HOUR)) == null) {
            strD = "";
        }
        CardListData cardListData = new CardListData(v.s(defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(n50.l.b(mx.b.b(strD, ""), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
        final tq0.b.Main documentId = params.getState().getOrderedDocument().getDocumentId();
        if (documentId != null) {
            defaultSingleCardData = new DefaultSingleCardData(null, new er.a() { // from class: ch2.a
                @Override // er.a
                public final Object a() {
                    return c.h(params, documentId);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(xf2.a.f218373k), null, null, 3, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106751d, null, null, null, null, 30, null), 3, null), null, null, 3325, null);
        } else {
            defaultSingleCardData = null;
        }
        final tq0.b.Confirmation confirmationId = params.getState().getOrderedDocument().getConfirmationId();
        if (confirmationId != null) {
            defaultSingleCardData2 = new DefaultSingleCardData(null, new er.a() { // from class: ch2.b
                @Override // er.a
                public final Object a() {
                    return c.i(params, confirmationId);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(xf2.a.K), null, null, 3, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106751d, null, null, null, null, 30, null), 3, null), null, null, 3325, null);
        } else {
            defaultSingleCardData2 = null;
        }
        DefaultSingleCardData defaultSingleCardData6 = !(params.getState().getOrderedDocument() instanceof k.Expired) ? new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(xf2.a.I), null, null, 3, null)), n50.l.b(this.labelProvider.c(xf2.a.H), null, null, 3, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106785h1, null, null, null, null, 30, null), 3, null), null, null, 3325, null) : null;
        DefaultSingleCardData defaultSingleCardData7 = !(params.getState().getOrderedDocument() instanceof k.Expired) ? new DefaultSingleCardData(null, params.e(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(xf2.a.N), null, null, 3, null)), n50.l.b(this.labelProvider.c(xf2.a.M), null, null, 3, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106792i1, null, null, null, null, 30, null), 3, null), null, null, 3325, null) : null;
        er.a<i0> aVarA = params.a();
        bh2.c.PermissionDialog permissionDialog = state instanceof bh2.c.PermissionDialog ? (bh2.c.PermissionDialog) state : null;
        return new d.a.Content(aVarA, baseScaffoldData, labelC, cardListData, defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData6, defaultSingleCardData7, permissionDialog != null ? permissionDialog.getDialogVMS() : null);
    }
}
