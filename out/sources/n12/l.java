package n12;

import eo0.DeliveryMessageDetails;
import eo0.DeliveryMessageDetailsAttachment;
import eo0.y;
import fo0.DeliveryMessageAddress;
import fo0.Status;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import m12.Error;
import m12.Loading;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.r;
import p071kotlin.Metadata;
import pq.v;
import q12.MessageInitializedViewState;
import q12.MessageSectionData;
import q12.MessageSectionStatusData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001<B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001aH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'\u0018\u00010&2\u0006\u0010%\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'\u0018\u00010&2\u0006\u0010%\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010)J%\u0010+\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'\u0018\u00010&2\u0006\u0010%\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010)J%\u0010,\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'\u0018\u00010&2\u0006\u0010%\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010)J\u0017\u0010/\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u001b\u00104\u001a\u0004\u0018\u0001032\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u0004\u0018\u000107*\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Ln12/l;", "Lxw/f;", "Ln12/l$a;", "Lm12/e$a;", "Lez/e;", "dateFormatter", "Lmx/c;", "labelProvider", "Ldz/b;", "fileSizeFormatter", "Ln12/e;", "draftMessageDetailsMapper", "Ln12/h;", "edorMessageButtonsMapper", "Ln12/q;", "stubMessageDetailsMapper", "<init>", "(Lez/e;Lmx/c;Ldz/b;Ln12/e;Ln12/h;Ln12/q;)V", "params", "Lm12/d$a;", "state", "Lq12/a;", "v", "(Ln12/l$a;Lm12/d$a;)Lq12/a;", "Leo0/m;", "messageDetails", "Lkotlin/Function2;", "Leo0/y;", "", "Loq/i0;", "downloadAttachment", "Ln30/b;", "i", "(Leo0/m;Ler/p;)Ln30/b;", "Lq12/b;", "x", "(Lm12/d$a;Ln12/l$a;)Lq12/b;", "response", "Loq/r;", "Lmx/a;", "m", "(Leo0/m;)Loq/r;", "q", "s", "r", "Ljava/time/OffsetDateTime;", "date", "h", "(Ljava/time/OffsetDateTime;)Ljava/lang/String;", "Lfo0/i;", "status", "Lq12/c;", "E", "(Lfo0/i;)Lq12/c;", "Lfo0/a;", "Lr50/g;", "G", "(Lfo0/a;)Lr50/g;", "F", "(Ln12/l$a;)Lm12/e$a;", "a", "Lez/e;", "getDateFormatter", "()Lez/e;", "b", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "c", "Ldz/b;", "d", "Ln12/e;", "e", "Ln12/h;", "f", "Ln12/q;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements xw.f<Params, m12.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dz.b fileSizeFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e draftMessageDetailsMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h edorMessageButtonsMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final q stubMessageDetailsMapper;

    /* JADX INFO: renamed from: n12.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b)\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b+\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b\u001e\u0010%R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u00108\u0006¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b,\u0010.¨\u0006/"}, d2 = {"Ln12/l$a;", "", "Lm12/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function2;", "Leo0/y;", "", "downloadAttachment", "goToPermissionsSettingsAction", "forwardAction", "replyAction", "editDraftAction", "deleteAction", "Lkotlin/Function1;", "Leo0/m;", "showTechnicalDetailsAction", "<init>", "(Lm12/d;Ler/a;Ler/p;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm12/d;", "i", "()Lm12/d;", "b", "Ler/a;", "f", "()Ler/a;", "c", "Ler/p;", "()Ler/p;", "d", "e", "g", "h", "Ler/l;", "()Ler/l;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m12.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<y, String, i0> downloadAttachment;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToPermissionsSettingsAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> forwardAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> replyAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> editDraftAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<DeliveryMessageDetails, i0> showTechnicalDetailsAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(m12.d dVar, er.a<i0> aVar, er.p<? super y, ? super String, i0> pVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, er.l<? super DeliveryMessageDetails, i0> lVar) {
            this.state = dVar;
            this.onBackClick = aVar;
            this.downloadAttachment = pVar;
            this.goToPermissionsSettingsAction = aVar2;
            this.forwardAction = aVar3;
            this.replyAction = aVar4;
            this.editDraftAction = aVar5;
            this.deleteAction = aVar6;
            this.showTechnicalDetailsAction = lVar;
        }

        public final er.a<i0> a() {
            return this.deleteAction;
        }

        public final er.p<y, String, i0> b() {
            return this.downloadAttachment;
        }

        public final er.a<i0> c() {
            return this.editDraftAction;
        }

        public final er.a<i0> d() {
            return this.forwardAction;
        }

        public final er.a<i0> e() {
            return this.goToPermissionsSettingsAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.downloadAttachment, params.downloadAttachment) && t.c(this.goToPermissionsSettingsAction, params.goToPermissionsSettingsAction) && t.c(this.forwardAction, params.forwardAction) && t.c(this.replyAction, params.replyAction) && t.c(this.editDraftAction, params.editDraftAction) && t.c(this.deleteAction, params.deleteAction) && t.c(this.showTechnicalDetailsAction, params.showTechnicalDetailsAction);
        }

        public final er.a<i0> f() {
            return this.onBackClick;
        }

        public final er.a<i0> g() {
            return this.replyAction;
        }

        public final er.l<DeliveryMessageDetails, i0> h() {
            return this.showTechnicalDetailsAction;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.downloadAttachment.hashCode()) * 31) + this.goToPermissionsSettingsAction.hashCode()) * 31) + this.forwardAction.hashCode()) * 31) + this.replyAction.hashCode()) * 31) + this.editDraftAction.hashCode()) * 31) + this.deleteAction.hashCode()) * 31) + this.showTechnicalDetailsAction.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final m12.d getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", downloadAttachment=" + this.downloadAttachment + ", goToPermissionsSettingsAction=" + this.goToPermissionsSettingsAction + ", forwardAction=" + this.forwardAction + ", replyAction=" + this.replyAction + ", editDraftAction=" + this.editDraftAction + ", deleteAction=" + this.deleteAction + ", showTechnicalDetailsAction=" + this.showTechnicalDetailsAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130683a;

        static {
            int[] iArr = new int[fo0.a.values().length];
            try {
                iArr[fo0.a.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fo0.a.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fo0.a.UNDELIVERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fo0.a.VERIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[fo0.a.COMMISSIONED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[fo0.a.TRANSMITTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[fo0.a.SENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[fo0.a.PENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[fo0.a.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f130683a = iArr;
        }
    }

    public l(ez.e eVar, mx.c cVar, dz.b bVar, e eVar2, h hVar, q qVar) {
        this.dateFormatter = eVar;
        this.labelProvider = cVar;
        this.fileSizeFormatter = bVar;
        this.draftMessageDetailsMapper = eVar2;
        this.edorMessageButtonsMapper = hVar;
        this.stubMessageDetailsMapper = qVar;
    }

    private final MessageSectionStatusData E(Status status) {
        fo0.a code;
        r50.g gVarG;
        if (status == null || (code = status.getCode()) == null || (gVarG = G(code)) == null) {
            return null;
        }
        return new MessageSectionStatusData(this.labelProvider.c(e02.a.Y2), new r50.a.WithIcon(null, mx.b.b(status.getDisplayValue(), "messageStatus"), null, 0, false, gVarG, 13, null));
    }

    private final r50.g G(fo0.a aVar) {
        switch (b.f130683a[aVar.ordinal()]) {
            case 1:
                return r50.g.POSITIVE;
            case 2:
            case 3:
                return r50.g.NEGATIVE;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return r50.g.INFORMATIVE;
            case 9:
                return null;
            default:
                throw new oq.p();
        }
    }

    private final String h(OffsetDateTime date) {
        return this.dateFormatter.d(new fz.b.OffsetDateTime(date), fz.c.FULL_MONTH_DATE_TIME_COMMA);
    }

    private final CardListData i(DeliveryMessageDetails messageDetails, final er.p<? super y, ? super String, i0> downloadAttachment) {
        List<DeliveryMessageDetailsAttachment> listD = messageDetails.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        int i15 = 0;
        for (Object obj : listD) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final DeliveryMessageDetailsAttachment deliveryMessageDetailsAttachment = (DeliveryMessageDetailsAttachment) obj;
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(deliveryMessageDetailsAttachment.getFileName(), "fileName_" + i15), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.fileSizeFormatter.a(deliveryMessageDetailsAttachment.getFileSize()), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(e02.a.f46604s), mx.b.b(this.labelProvider.c(e02.a.f46604s).getText() + ' ' + deliveryMessageDetailsAttachment.getFileName(), "fileName_download" + i15)), k30.d.a.f107773a, null, new er.a() { // from class: n12.j
                @Override // er.a
                public final Object a() {
                    return l.l(downloadAttachment, deliveryMessageDetailsAttachment);
                }
            }, 35, null)), null, 2815, null));
            i15 = i16;
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(er.p pVar, DeliveryMessageDetailsAttachment deliveryMessageDetailsAttachment) {
        pVar.B(y.a(deliveryMessageDetailsAttachment.getAttachmentId()), deliveryMessageDetailsAttachment.getFileName());
        return i0.f148189a;
    }

    private final r<Label, Label> m(DeliveryMessageDetails response) {
        String caseId = response.getDeliveryMessage().getCaseId();
        if (caseId != null) {
            return oq.y.a(this.labelProvider.c(e02.a.Q2).o(Label.INSTANCE.d()), mx.b.b(caseId, "caseId"));
        }
        return null;
    }

    private final r<Label, Label> q(DeliveryMessageDetails response) {
        OffsetDateTime receiptDate;
        if (response.getDeliveryMessage().u()) {
            OffsetDateTime submissionDate = response.getDeliveryMessage().getSubmissionDate();
            if (submissionDate != null) {
                return oq.y.a(this.labelProvider.c(e02.a.W2), Label.INSTANCE.d().o(mx.b.b(h(submissionDate), "date")));
            }
            return null;
        }
        if (!response.getDeliveryMessage().t() || (receiptDate = response.getDeliveryMessage().getReceiptDate()) == null) {
            return null;
        }
        return oq.y.a(this.labelProvider.c(e02.a.R2), Label.INSTANCE.d().o(mx.b.b(h(receiptDate), "date")));
    }

    private final r<Label, Label> r(DeliveryMessageDetails response) {
        DeliveryMessageAddress from;
        String name;
        if (response.getDeliveryMessage().u() || (from = response.getDeliveryMessage().getFrom()) == null || (name = from.getName()) == null) {
            return null;
        }
        return oq.y.a(this.labelProvider.c(e02.a.N), mx.b.b(name, "fromName"));
    }

    private final r<Label, Label> s(DeliveryMessageDetails response) {
        List<DeliveryMessageAddress> listP;
        if (response.getDeliveryMessage().t() || (listP = response.getDeliveryMessage().p()) == null) {
            return null;
        }
        return oq.y.a(this.labelProvider.c(e02.a.f46647z0), mx.b.b(v.v0(listP, ", ", null, null, 0, null, new er.l() { // from class: n12.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.u((DeliveryMessageAddress) obj);
            }
        }, 30, null), "toName"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence u(DeliveryMessageAddress deliveryMessageAddress) {
        return deliveryMessageAddress.getName();
    }

    private final MessageInitializedViewState v(Params params, m12.d.a state) {
        x50.a.Icon icon = new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216850f, null, null, params.a(), 6, null));
        return new MessageInitializedViewState(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.f()), this.labelProvider.c(e02.a.V2), null, icon, null, 20, null), null, null, null, null, 61, null), x(state, params), this.edorMessageButtonsMapper.b(new h.Params(params.d(), params.g(), state.getMessageDetails().getDeliveryMessage())));
    }

    private final MessageSectionData x(final m12.d.a state, final Params params) {
        Label labelC;
        List listS = v.s(r(state.getMessageDetails()), s(state.getMessageDetails()), oq.y.a(this.labelProvider.c(e02.a.X2).o(Label.INSTANCE.d()), this.labelProvider.c(e02.a.f46651z4)), m(state.getMessageDetails()), q(state.getMessageDetails()));
        String textBody = state.getMessageDetails().getTextBody();
        Label labelB = textBody != null ? mx.b.b(textBody, "TextBody") : null;
        String subject = state.getMessageDetails().getDeliveryMessage().getSubject();
        if (subject == null || (labelC = mx.b.b(subject, "title")) == null) {
            labelC = this.labelProvider.c(e02.a.f46584o3);
        }
        return new MessageSectionData(labelC, listS, E(state.getMessageDetails().getDeliveryMessage().getStatus()), state.getMessageDetails().getDeliveryMessage().getType() != fo0.g.EVIDENCE ? new ButtonTextData(null, this.labelProvider.c(e02.a.P2), null, null, new er.a() { // from class: n12.k
            @Override // er.a
            public final Object a() {
                return l.z(params, state);
            }
        }, 13, null) : null, labelB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, m12.d.a aVar) {
        params.h().b(aVar.getMessageDetails());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public m12.e.a b(Params params) {
        m12.d state = params.getState();
        if (state instanceof Error) {
            return new m12.e.a.Error(((Error) params.getState()).getErrorVMS());
        }
        if (state instanceof m12.d.a.Error) {
            return new m12.e.a.Error(((m12.d.a.Error) params.getState()).getErrorVMS());
        }
        if (state instanceof Loading) {
            return new m12.e.a.Loading(x70.a.b.f217282c);
        }
        if (!(state instanceof m12.d.a)) {
            if (state instanceof m12.d.InitializedStub) {
                return this.stubMessageDetailsMapper.b(new q.Params((m12.d.InitializedStub) params.getState(), params.f(), params.e(), params.h()));
            }
            throw new oq.p();
        }
        if (params.getState().getMessageDetailsPayload().getDirectoryType() == eo0.t.DRAFT) {
            e eVar = this.draftMessageDetailsMapper;
            DeliveryMessageDetails messageDetails = ((m12.d.a) params.getState()).getMessageDetails();
            return eVar.b(new e.Params(params.f(), params.c(), params.a(), messageDetails));
        }
        c30.b.c cVar = new c30.b.c("evidenceAlertInfo", null, null, this.labelProvider.c(e02.a.T2), null, null, null, 118, null);
        if (((m12.d.a) params.getState()).getMessageDetails().getDeliveryMessage().getType() != fo0.g.EVIDENCE) {
            cVar = null;
        }
        return new m12.e.a.Message(cVar, v(params, (m12.d.a) params.getState()), this.labelProvider.c(e02.a.f46520e), i(((m12.d.a) params.getState()).getMessageDetails(), params.b()));
    }
}
