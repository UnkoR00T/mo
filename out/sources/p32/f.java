package p32;

import eo0.DeliveryMessageDetails;
import eo0.c0;
import eo0.y0;
import er.l;
import fo0.DeliveryMessageAddress;
import fo0.Status;
import fr.t;
import fu.r;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import o32.State;
import oq.i0;
import oq.p;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import x50.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lp32/f;", "Lxw/f;", "Lp32/f$a;", "Lo32/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lp32/b;", "attachmentsMapper", "<init>", "(Lmx/c;Lez/e;Lp32/b;)V", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "Loq/i0;", "onClick", "Ln50/x0$a;", "l", "(Lmx/a;Ler/a;)Ln50/x0$a;", "title", "info", "trailingSectionButton", "Ln50/g;", "h", "(Lmx/a;Lmx/a;Ln50/x0$a;)Ln50/g;", "Lfo0/a;", "Lr50/g;", "u", "(Lfo0/a;)Lr50/g;", "params", "m", "(Lp32/f$a;)Lo32/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lp32/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, o32.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p32.b attachmentsMapper;

    /* JADX INFO: renamed from: p32.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001e\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b#\u0010!R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b$\u0010&R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001a\u0010&¨\u0006'"}, d2 = {"Lp32/f$a;", "", "Lo32/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "downloadTechnicalEvidencesArchive", "downloadUpoDocumentClick", "downloadUpoPreviewClick", "Lkotlin/Function1;", "Leo0/c0;", "getTechnicalEvidenceFile", "", "copyToClipboardClick", "<init>", "(Lo32/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo32/b;", "g", "()Lo32/b;", "b", "Ler/a;", "f", "()Ler/a;", "c", "d", "e", "Ler/l;", "()Ler/l;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> downloadTechnicalEvidencesArchive;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> downloadUpoDocumentClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> downloadUpoPreviewClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<c0, i0> getTechnicalEvidenceFile;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> copyToClipboardClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, l<? super c0, i0> lVar, l<? super String, i0> lVar2) {
            this.state = state;
            this.onCloseClick = aVar;
            this.downloadTechnicalEvidencesArchive = aVar2;
            this.downloadUpoDocumentClick = aVar3;
            this.downloadUpoPreviewClick = aVar4;
            this.getTechnicalEvidenceFile = lVar;
            this.copyToClipboardClick = lVar2;
        }

        public final l<String, i0> a() {
            return this.copyToClipboardClick;
        }

        public final er.a<i0> b() {
            return this.downloadTechnicalEvidencesArchive;
        }

        public final er.a<i0> c() {
            return this.downloadUpoDocumentClick;
        }

        public final er.a<i0> d() {
            return this.downloadUpoPreviewClick;
        }

        public final l<c0, i0> e() {
            return this.getTechnicalEvidenceFile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.downloadTechnicalEvidencesArchive, params.downloadTechnicalEvidencesArchive) && t.c(this.downloadUpoDocumentClick, params.downloadUpoDocumentClick) && t.c(this.downloadUpoPreviewClick, params.downloadUpoPreviewClick) && t.c(this.getTechnicalEvidenceFile, params.getTechnicalEvidenceFile) && t.c(this.copyToClipboardClick, params.copyToClipboardClick);
        }

        public final er.a<i0> f() {
            return this.onCloseClick;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onCloseClick.hashCode()) * 31) + this.downloadTechnicalEvidencesArchive.hashCode()) * 31) + this.downloadUpoDocumentClick.hashCode()) * 31) + this.downloadUpoPreviewClick.hashCode()) * 31) + this.getTechnicalEvidenceFile.hashCode()) * 31) + this.copyToClipboardClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseClick=" + this.onCloseClick + ", downloadTechnicalEvidencesArchive=" + this.downloadTechnicalEvidencesArchive + ", downloadUpoDocumentClick=" + this.downloadUpoDocumentClick + ", downloadUpoPreviewClick=" + this.downloadUpoPreviewClick + ", getTechnicalEvidenceFile=" + this.getTechnicalEvidenceFile + ", copyToClipboardClick=" + this.copyToClipboardClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f152902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f152903b;

        static {
            int[] iArr = new int[y0.values().length];
            try {
                iArr[y0.E_PUAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y0.E_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f152902a = iArr;
            int[] iArr2 = new int[fo0.a.values().length];
            try {
                iArr2[fo0.a.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[fo0.a.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[fo0.a.UNDELIVERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[fo0.a.VERIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[fo0.a.COMMISSIONED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[fo0.a.TRANSMITTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[fo0.a.SENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[fo0.a.PENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[fo0.a.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            f152903b = iArr2;
        }
    }

    public f(mx.c cVar, ez.e eVar, p32.b bVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.attachmentsMapper = bVar;
    }

    private final DefaultSingleCardData h(Label title, Label info, x0.Button trailingSectionButton) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(info, null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(title, null, null, 0, 0, null, 62, null)), null, 4, null), null, trailingSectionButton, null, 2815, null);
    }

    static /* synthetic */ DefaultSingleCardData i(f fVar, Label label, Label label2, x0.Button button, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            button = null;
        }
        return fVar.h(label, label2, button);
    }

    private final x0.Button l(Label label, er.a<i0> onClick) {
        return new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(label, null, 2, null), k30.d.a.f107773a, null, onClick, 35, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, String str) {
        params.a().b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence r(DeliveryMessageAddress deliveryMessageAddress) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(deliveryMessageAddress.getName());
        String address = deliveryMessageAddress.getAddress();
        if (address != null) {
            sb5.append(" (" + address + ')');
        }
        return sb5.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, String str) {
        params.a().b(str);
        return i0.f148189a;
    }

    private final g u(fo0.a aVar) {
        switch (b.f152903b[aVar.ordinal()]) {
            case 1:
                return g.POSITIVE;
            case 2:
            case 3:
                return g.NEGATIVE;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return g.INFORMATIVE;
            case 9:
                return null;
            default:
                throw new p();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0136  */
    /* JADX WARN: Code duplicated, block: B:29:0x0140  */
    /* JADX WARN: Code duplicated, block: B:30:0x0142  */
    /* JADX WARN: Code duplicated, block: B:32:0x0159  */
    /* JADX WARN: Code duplicated, block: B:35:0x0164  */
    /* JADX WARN: Code duplicated, block: B:37:0x016e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0170  */
    /* JADX WARN: Code duplicated, block: B:40:0x0194  */
    /* JADX WARN: Code duplicated, block: B:43:0x019f  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0224  */
    /* JADX WARN: Code duplicated, block: B:53:0x0230  */
    /* JADX WARN: Code duplicated, block: B:57:0x0244  */
    /* JADX WARN: Code duplicated, block: B:63:0x0253  */
    /* JADX WARN: Code duplicated, block: B:65:0x0256  */
    /* JADX WARN: Code duplicated, block: B:67:0x026e  */
    /* JADX WARN: Code duplicated, block: B:70:0x027a  */
    /* JADX WARN: Code duplicated, block: B:75:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:77:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:78:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x030a  */
    /* JADX WARN: Code duplicated, block: B:84:0x030c  */
    /* JADX WARN: Code duplicated, block: B:86:0x030f  */
    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public o32.c.Data b(final Params params) {
        DefaultSingleCardData defaultSingleCardDataH;
        DefaultSingleCardData defaultSingleCardDataH2;
        Label labelC;
        DefaultSingleCardData defaultSingleCardDataI;
        String caseId;
        DefaultSingleCardData defaultSingleCardData;
        OffsetDateTime submissionDate;
        DefaultSingleCardData defaultSingleCardData2;
        Status status;
        DefaultSingleCardData defaultSingleCardData3;
        Status status2;
        DefaultSingleCardData defaultSingleCardData4;
        OffsetDateTime receiptDate;
        DefaultSingleCardData defaultSingleCardData5;
        f fVar;
        DefaultSingleCardData defaultSingleCardDataI2;
        String statusDescription;
        DefaultSingleCardData defaultSingleCardDataI3;
        g gVarU;
        DefaultSingleCardData defaultSingleCardData6;
        DefaultSingleCardData defaultSingleCardDataI4;
        DefaultSingleCardData defaultSingleCardDataI5;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(null, this.labelProvider.c(e02.a.f46598r), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.f(), 6, null)), null, 21, null), null, null, null, null, 61, null);
        er.a<i0> aVarF = params.f();
        DeliveryMessageDetails details = params.getState().getDetails();
        DeliveryMessageAddress from = details.getDeliveryMessage().getFrom();
        if (from != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(from.getName());
            String address = from.getAddress();
            if (address != null) {
                sb5.append(" (" + address + ')');
            }
            final String string = sb5.toString();
            defaultSingleCardDataH = h(mx.b.b(string, "from"), this.labelProvider.c(e02.a.D2), l(this.labelProvider.c(e02.a.f46574n), new er.a() { // from class: p32.c
                @Override // er.a
                public final Object a() {
                    return f.q(params, string);
                }
            }));
        } else {
            defaultSingleCardDataH = null;
        }
        List<DeliveryMessageAddress> listP = details.getDeliveryMessage().p();
        if (listP != null) {
            final String strV0 = v.v0(listP, null, null, null, 0, null, new l() { // from class: p32.d
                @Override // er.l
                public final Object b(Object obj) {
                    return f.r((DeliveryMessageAddress) obj);
                }
            }, 31, null);
            defaultSingleCardDataH2 = h(mx.b.b(strV0, "to"), this.labelProvider.c(e02.a.A4), l(this.labelProvider.c(e02.a.f46574n), new er.a() { // from class: p32.e
                @Override // er.a
                public final Object a() {
                    return f.s(params, strV0);
                }
            }));
        } else {
            defaultSingleCardDataH2 = null;
        }
        y0 serviceType = details.getDeliveryMessage().getServiceType();
        Label labelC2 = this.labelProvider.c(e02.a.C0);
        int i15 = b.f152902a[serviceType.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                labelC = this.labelProvider.c(e02.a.f46540h1);
            } else {
                if (i15 != 3) {
                    throw new p();
                }
                defaultSingleCardDataI = null;
            }
            caseId = details.getDeliveryMessage().getCaseId();
            if (caseId != null) {
                if (details.getDeliveryMessage().r()) {
                    defaultSingleCardDataI5 = i(this, mx.b.b(caseId, "caseId"), this.labelProvider.c(e02.a.P3), null, 4, null);
                } else {
                    defaultSingleCardDataI5 = null;
                }
                defaultSingleCardData = defaultSingleCardDataI5;
            } else {
                defaultSingleCardData = null;
            }
            submissionDate = details.getDeliveryMessage().getSubmissionDate();
            if (submissionDate != null) {
                if (details.getDeliveryMessage().u()) {
                    defaultSingleCardDataI4 = i(this, mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(submissionDate), fz.c.DOTTED_PLUS_HOUR), "submissionDate"), this.labelProvider.c(e02.a.f46614t3), null, 4, null);
                } else {
                    defaultSingleCardDataI4 = null;
                }
                defaultSingleCardData2 = defaultSingleCardDataI4;
            } else {
                defaultSingleCardData2 = null;
            }
            status = details.getDeliveryMessage().getStatus();
            if (status != null) {
                if (details.getDeliveryMessage().u() || (gVarU = u(status.getCode())) == null) {
                    defaultSingleCardData6 = null;
                } else {
                    defaultSingleCardData6 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(e02.a.f46623v0), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, mx.b.b(status.getDisplayValue(), "messageStatus"), null, 0, false, gVarU, 13, null)), null, 4, null), null, null, null, 3839, null);
                }
                defaultSingleCardData3 = defaultSingleCardData6;
            } else {
                defaultSingleCardData3 = null;
            }
            status2 = details.getDeliveryMessage().getStatus();
            if (status2 != null) {
                if ((!details.getDeliveryMessage().u() || details.getDeliveryMessage().r()) && (statusDescription = status2.getStatusDescription()) != null) {
                    if (r.t0(statusDescription)) {
                        statusDescription = null;
                    }
                    if (statusDescription != null) {
                        defaultSingleCardDataI3 = i(this, mx.b.b(statusDescription, "statusDescription"), this.labelProvider.c(e02.a.f46608s3), null, 4, null);
                    } else {
                        defaultSingleCardDataI3 = null;
                    }
                } else {
                    defaultSingleCardDataI3 = null;
                }
                defaultSingleCardData4 = defaultSingleCardDataI3;
            } else {
                defaultSingleCardData4 = null;
            }
            receiptDate = details.getDeliveryMessage().getReceiptDate();
            if (receiptDate != null) {
                if (!details.getDeliveryMessage().t() && details.getDeliveryMessage().s()) {
                    defaultSingleCardDataI2 = i(this, mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(receiptDate), fz.c.DOTTED_PLUS_HOUR), "receiptDate"), this.labelProvider.c(e02.a.f46602r3), null, 4, null);
                } else if (details.getDeliveryMessage().r()) {
                    defaultSingleCardDataI2 = i(this, mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(receiptDate), fz.c.DOTTED_PLUS_HOUR), "receiptDate"), this.labelProvider.c(e02.a.f46596q3), null, 4, null);
                } else {
                    defaultSingleCardDataI2 = null;
                }
                defaultSingleCardData5 = defaultSingleCardDataI2;
            } else {
                defaultSingleCardData5 = null;
            }
            CardListData cardListData = new CardListData(v.s(defaultSingleCardDataH, defaultSingleCardDataH2, defaultSingleCardDataI, defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5), null, false, null, null, 30, null);
            if (params.getState().getDetails().getDeliveryMessage().v()) {
                fVar = null;
            } else {
                fVar = this;
            }
            return new o32.c.Data(baseScaffoldData, cardListData, fVar != null ? new o32.c.FilesSection(this.labelProvider.c(e02.a.B4), this.attachmentsMapper.b(new p32.b.Params(params.getState(), params.b(), params.c(), params.d(), params.e()))) : null, aVarF);
        }
        labelC = this.labelProvider.c(e02.a.f46564l1);
        defaultSingleCardDataI = i(this, labelC, labelC2, null, 4, null);
        caseId = details.getDeliveryMessage().getCaseId();
        if (caseId != null) {
            if (details.getDeliveryMessage().r()) {
                defaultSingleCardDataI5 = null;
            } else {
                defaultSingleCardDataI5 = i(this, mx.b.b(caseId, "caseId"), this.labelProvider.c(e02.a.P3), null, 4, null);
            }
            defaultSingleCardData = defaultSingleCardDataI5;
        } else {
            defaultSingleCardData = null;
        }
        submissionDate = details.getDeliveryMessage().getSubmissionDate();
        if (submissionDate != null) {
            if (details.getDeliveryMessage().u()) {
                defaultSingleCardDataI4 = null;
            } else {
                defaultSingleCardDataI4 = i(this, mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(submissionDate), fz.c.DOTTED_PLUS_HOUR), "submissionDate"), this.labelProvider.c(e02.a.f46614t3), null, 4, null);
            }
            defaultSingleCardData2 = defaultSingleCardDataI4;
        } else {
            defaultSingleCardData2 = null;
        }
        status = details.getDeliveryMessage().getStatus();
        if (status != null) {
            if (details.getDeliveryMessage().u()) {
                defaultSingleCardData6 = null;
            } else {
                defaultSingleCardData6 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(e02.a.f46623v0), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, mx.b.b(status.getDisplayValue(), "messageStatus"), null, 0, false, gVarU, 13, null)), null, 4, null), null, null, null, 3839, null);
            }
            defaultSingleCardData3 = defaultSingleCardData6;
        } else {
            defaultSingleCardData3 = null;
        }
        status2 = details.getDeliveryMessage().getStatus();
        if (status2 != null) {
            if (details.getDeliveryMessage().u()) {
                if (r.t0(statusDescription)) {
                    statusDescription = null;
                }
                if (statusDescription != null) {
                    defaultSingleCardDataI3 = i(this, mx.b.b(statusDescription, "statusDescription"), this.labelProvider.c(e02.a.f46608s3), null, 4, null);
                } else {
                    defaultSingleCardDataI3 = null;
                }
            } else {
                if (r.t0(statusDescription)) {
                    statusDescription = null;
                }
                if (statusDescription != null) {
                    defaultSingleCardDataI3 = i(this, mx.b.b(statusDescription, "statusDescription"), this.labelProvider.c(e02.a.f46608s3), null, 4, null);
                } else {
                    defaultSingleCardDataI3 = null;
                }
            }
            defaultSingleCardData4 = defaultSingleCardDataI3;
        } else {
            defaultSingleCardData4 = null;
        }
        receiptDate = details.getDeliveryMessage().getReceiptDate();
        if (receiptDate != null) {
            if (!details.getDeliveryMessage().t()) {
                if (details.getDeliveryMessage().r()) {
                    defaultSingleCardDataI2 = i(this, mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(receiptDate), fz.c.DOTTED_PLUS_HOUR), "receiptDate"), this.labelProvider.c(e02.a.f46596q3), null, 4, null);
                } else {
                    defaultSingleCardDataI2 = null;
                }
            } else if (details.getDeliveryMessage().r()) {
                defaultSingleCardDataI2 = i(this, mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(receiptDate), fz.c.DOTTED_PLUS_HOUR), "receiptDate"), this.labelProvider.c(e02.a.f46596q3), null, 4, null);
            } else {
                defaultSingleCardDataI2 = null;
            }
            defaultSingleCardData5 = defaultSingleCardDataI2;
        } else {
            defaultSingleCardData5 = null;
        }
        CardListData cardListData2 = new CardListData(v.s(defaultSingleCardDataH, defaultSingleCardDataH2, defaultSingleCardDataI, defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5), null, false, null, null, 30, null);
        if (params.getState().getDetails().getDeliveryMessage().v()) {
            fVar = this;
        } else {
            fVar = null;
        }
        return new o32.c.Data(baseScaffoldData, cardListData2, fVar != null ? new o32.c.FilesSection(this.labelProvider.c(e02.a.B4), this.attachmentsMapper.b(new p32.b.Params(params.getState(), params.b(), params.c(), params.d(), params.e()))) : null, aVarF);
    }
}
