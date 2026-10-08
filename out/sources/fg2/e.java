package fg2;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.l;
import n50.w0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import tq0.o;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001-B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b%\u0010#J\u0019\u0010(\u001a\u00020\u000e2\b\b\u0001\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lfg2/e;", "Lxw/f;", "Lfg2/e$a;", "Leg2/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Ltq0/o;", "Lr50/a$b;", "F", "(Ltq0/o;)Lr50/a$b;", "Lmx/a;", "G", "(Ltq0/o;)Lmx/a;", "Lfz/b$f;", "date", "", "i", "(Lfz/b$f;)Ljava/lang/String;", "status", "", "isFromScan", "Ln50/a;", "E", "(Ltq0/o;Z)Ln50/a;", "Lkotlin/Function0;", "Loq/i0;", "onDownload", "Lh30/a;", "q", "(ZLer/a;)Lh30/a;", "m", "(Ler/a;)Lh30/a;", "onClose", "l", "", "stringId", "z", "(I)Lmx/a;", "params", "r", "(Lfg2/e$a;)Leg2/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, eg2.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: fg2.e$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001f"}, d2 = {"Lfg2/e$a;", "", "Leg2/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onDownloadCopyDocumentClicked", "onDownloadReportClicked", "closeDownloadDocument", "<init>", "(Leg2/c;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leg2/c;", "e", "()Leg2/c;", "b", "Ler/a;", "()Ler/a;", "c", "d", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final eg2.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDownloadCopyDocumentClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDownloadReportClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeDownloadDocument;

        public Params(eg2.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = cVar;
            this.onBack = aVar;
            this.onDownloadCopyDocumentClicked = aVar2;
            this.onDownloadReportClicked = aVar3;
            this.closeDownloadDocument = aVar4;
        }

        public final er.a<i0> a() {
            return this.closeDownloadDocument;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final er.a<i0> c() {
            return this.onDownloadCopyDocumentClicked;
        }

        public final er.a<i0> d() {
            return this.onDownloadReportClicked;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final eg2.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onDownloadCopyDocumentClicked, params.onDownloadCopyDocumentClicked) && t.c(this.onDownloadReportClicked, params.onDownloadReportClicked) && t.c(this.closeDownloadDocument, params.closeDownloadDocument);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onDownloadCopyDocumentClicked.hashCode()) * 31) + this.onDownloadReportClicked.hashCode()) * 31) + this.closeDownloadDocument.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onDownloadCopyDocumentClicked=" + this.onDownloadCopyDocumentClicked + ", onDownloadReportClicked=" + this.onDownloadReportClicked + ", closeDownloadDocument=" + this.closeDownloadDocument + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62913a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.UP_TO_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.OUT_OF_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.NON_EXISTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f62913a = iArr;
        }
    }

    public e(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final BodySection E(o status, boolean isFromScan) {
        int i15;
        int i16 = b.f62913a[status.ordinal()];
        if (i16 != 1) {
            if (i16 == 2) {
                return new BodySection(l.b(z(xf2.a.f218403u), null, null, 3, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, z(xf2.a.f218344a0), null, 0, false, g.NOTICE, 13, null)), new SingleCardLabel(z(xf2.a.Z), null, null, 0, 0, null, 62, null));
            }
            if (i16 == 3 || i16 == 4) {
                return null;
            }
            throw new p();
        }
        SingleCardLabel singleCardLabelB = l.b(z(xf2.a.f218403u), null, null, 3, null);
        n50.b.StatusBadge statusBadge = new n50.b.StatusBadge(new r50.a.WithIcon(null, z(xf2.a.f218353d0), null, 0, false, g.POSITIVE, 13, null));
        if (!isFromScan) {
            i15 = xf2.a.f218347b0;
        } else {
            if (!isFromScan) {
                throw new p();
            }
            i15 = xf2.a.f218350c0;
        }
        return new BodySection(singleCardLabelB, statusBadge, new SingleCardLabel(z(i15), null, null, 0, 0, null, 62, null));
    }

    private final r50.a.WithIcon F(o oVar) {
        int i15 = b.f62913a[oVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return new r50.a.WithIcon(null, z(xf2.a.f218374k0), null, 0, false, g.POSITIVE, 29, null);
        }
        if (i15 == 3) {
            return new r50.a.WithIcon(null, z(xf2.a.f218389p0), null, 0, false, g.NEGATIVE, 29, null);
        }
        if (i15 == 4) {
            return new r50.a.WithIcon(null, z(xf2.a.f218377l0), null, 0, false, g.MINUS, 29, null);
        }
        throw new p();
    }

    private final Label G(o oVar) {
        int i15 = b.f62913a[oVar.ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 == 3) {
                return z(xf2.a.f218383n0);
            }
            if (i15 == 4) {
                return z(xf2.a.f218380m0);
            }
            throw new p();
        }
        return z(xf2.a.f218386o0);
    }

    private final String i(fz.b.OffsetDateTime date) {
        StringBuilder sb5 = new StringBuilder();
        String strD = this.dateFormatter.d(date, fz.c.DOTTED_PLUS_HOUR);
        sb5.append(z(xf2.a.f218367i).getText());
        Label.Companion companion = Label.INSTANCE;
        sb5.append(companion.a().getText());
        sb5.append(companion.d().getText());
        sb5.append(strD);
        return sb5.toString();
    }

    private final ButtonData l(er.a<i0> onClose) {
        return new ButtonData("CloseButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(xf2.a.f218361g), null, 2, null), k30.d.a.f107773a, null, onClose, 34, null);
    }

    private final ButtonData m(er.a<i0> onDownload) {
        return new ButtonData("DownloadVerificationReportButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(xf2.a.f218359f0), null, 2, null), k30.d.a.f107773a, null, onDownload, 34, null);
    }

    private final ButtonData q(boolean isFromScan, er.a<i0> onDownload) {
        k30.d secondary;
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.c.WithText withText = new k30.c.WithText(this.labelProvider.c(xf2.a.f218368i0), null, 2, null);
        if (isFromScan) {
            secondary = new k30.d.Secondary(null, 1, null);
        } else {
            if (isFromScan) {
                throw new p();
            }
            secondary = k30.d.a.f107773a;
        }
        return new ButtonData("DownloadVerificationReportButton", null, large, withText, secondary, null, onDownload, 34, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x() {
        return i0.f148189a;
    }

    private final Label z(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public eg2.d.a b(Params params) {
        boolean z15;
        CardListData cardListData;
        ButtonData buttonDataQ;
        ButtonData buttonDataQ2;
        String str;
        DefaultSingleCardData defaultSingleCardData;
        eg2.c state = params.getState();
        if (state instanceof eg2.c.FetchingStatus) {
            return new eg2.d.a.FetchingStatus(new er.a() { // from class: fg2.a
                @Override // er.a
                public final Object a() {
                    return e.s();
                }
            });
        }
        if (state instanceof eg2.c.FetchingStatusError) {
            return new eg2.d.a.Error(new er.a() { // from class: fg2.b
                @Override // er.a
                public final Object a() {
                    return e.u();
                }
            }, ((eg2.c.FetchingStatusError) state).getErrorVMS());
        }
        if (state instanceof eg2.c.InterfaceC1200c.Error) {
            return new eg2.d.a.Error(new er.a() { // from class: fg2.c
                @Override // er.a
                public final Object a() {
                    return e.v();
                }
            }, ((eg2.c.InterfaceC1200c.Error) state).getErrorVMS());
        }
        if (!(state instanceof eg2.c.InterfaceC1200c.b) && !(state instanceof eg2.c.InterfaceC1200c.Content)) {
            if (!(state instanceof eg2.c.InterfaceC1200c.InterfaceC1202c)) {
                throw new p();
            }
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null);
            x70.a.C5796a c5796a = x70.a.C5796a.f217280c;
            Label labelC = this.labelProvider.c(xf2.a.f218356e0);
            eg2.c.InterfaceC1200c.InterfaceC1202c.PermissionDialog permissionDialog = state instanceof eg2.c.InterfaceC1200c.InterfaceC1202c.PermissionDialog ? (eg2.c.InterfaceC1200c.InterfaceC1202c.PermissionDialog) state : null;
            return new eg2.d.a.DownloadReport(new er.a() { // from class: fg2.d
                @Override // er.a
                public final Object a() {
                    return e.x();
                }
            }, baseScaffoldData, c5796a, labelC, permissionDialog != null ? permissionDialog.getDialogVMS() : null);
        }
        eg2.c.InterfaceC1200c interfaceC1200c = (eg2.c.InterfaceC1200c) state;
        String number = interfaceC1200c.getVerifyDocumentResponse().getNumber();
        tq0.g type = interfaceC1200c.getVerifyDocumentResponse().getType();
        BodySection bodySectionE = E(interfaceC1200c.getVerifyDocumentResponse().getStatus(), interfaceC1200c.getIsFromScan());
        boolean z16 = (interfaceC1200c.getVerifyDocumentResponse().getStatus() == o.NON_EXISTENT || number == null || type == null) ? false : true;
        er.a<i0> aVarB = params.b();
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(xf2.a.f218371j0), null, null, null, 28, null), null, null, null, null, 61, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData("VerificationCard", null, false, null, null, false, null, new w0.StatusBadge(F(interfaceC1200c.getVerifyDocumentResponse().getStatus())), new BodySection(null, new n50.b.Title(l.b(G(interfaceC1200c.getVerifyDocumentResponse().getStatus()), null, null, 3, null)), l.b(mx.b.b(i(interfaceC1200c.getVerifyDocumentResponse().getVerificationDate()), ""), null, null, 3, null), 1, null), null, null, null, 3710, null);
        if (z16) {
            if (bodySectionE != null) {
                z15 = true;
                str = "";
                defaultSingleCardData = new DefaultSingleCardData("DocumentStatus", null, false, null, null, false, null, null, bodySectionE, null, null, null, 3838, null);
            } else {
                z15 = true;
                str = "";
                defaultSingleCardData = null;
            }
            cardListData = new CardListData(v.s(defaultSingleCardData, new DefaultSingleCardData("DocumentNumber", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(z(xf2.a.X), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(number, str), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("DocumentType", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(z(xf2.a.Y), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(z(lg2.c.a(type)), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), null, false, null, null, 30, null);
        } else {
            z15 = true;
            cardListData = null;
        }
        o status = interfaceC1200c.getVerifyDocumentResponse().getStatus();
        int[] iArr = b.f62913a;
        int i15 = iArr[status.ordinal()];
        if (i15 == z15 || i15 == 2) {
            boolean isFromScan = interfaceC1200c.getIsFromScan();
            if (isFromScan == z15) {
                buttonDataQ = m(params.c());
            } else {
                if (isFromScan) {
                    throw new p();
                }
                buttonDataQ = q(interfaceC1200c.getIsFromScan(), params.d());
            }
        } else {
            if (i15 != 3 && i15 != 4) {
                throw new p();
            }
            buttonDataQ = l(params.b());
        }
        ButtonData buttonData = buttonDataQ;
        int i16 = iArr[interfaceC1200c.getVerifyDocumentResponse().getStatus().ordinal()];
        if (i16 == z15 || i16 == 2) {
            boolean isFromScan2 = interfaceC1200c.getIsFromScan();
            if (isFromScan2 == z15) {
                buttonDataQ2 = q(interfaceC1200c.getIsFromScan(), params.d());
            } else {
                if (isFromScan2) {
                    throw new p();
                }
                buttonDataQ2 = null;
            }
        } else {
            buttonDataQ2 = null;
        }
        eg2.c.InterfaceC1200c.b.PermissionDialog permissionDialog2 = state instanceof eg2.c.InterfaceC1200c.b.PermissionDialog ? (eg2.c.InterfaceC1200c.b.PermissionDialog) state : null;
        return new eg2.d.a.Initialized(aVarB, baseScaffoldData2, defaultSingleCardData2, cardListData, buttonData, buttonDataQ2, permissionDialog2 != null ? permissionDialog2.getDialogVMS() : null);
    }
}
