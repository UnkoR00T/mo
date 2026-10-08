package p12;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import eo0.DeliveryMessageDetails;
import eo0.DeliveryMessageDetailsAttachment;
import eo0.y;
import er.p;
import fo0.DeliveryMessageAddress;
import fo0.Status;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import o12.Error;
import oq.i0;
import oq.k;
import oq.l;
import oq.r;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import q12.MessageInitializedViewState;
import q12.MessageSectionData;
import q12.MessageSectionStatusData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001JB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020#2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190!H\u0002¢\u0006\u0004\b$\u0010%J%\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0018\u00010'2\u0006\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010*J%\u0010+\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0018\u00010'2\u0006\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010*J%\u0010,\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0018\u00010'2\u0006\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b,\u0010*J\u0017\u0010/\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u001b\u00104\u001a\u0004\u0018\u0001032\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b4\u00105J9\u0010:\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010\u0010\u001a\u00020\u000f2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00190!2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190!H\u0002¢\u0006\u0004\b:\u0010;J7\u0010B\u001a\u0002092\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00190!2\u0006\u0010=\u001a\u00020(2\u0006\u0010?\u001a\u00020>2\b\b\u0002\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\u0004\u0018\u00010E*\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\bH\u0010IR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001b\u0010X\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001b\u0010[\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010U\u001a\u0004\bZ\u0010W¨\u0006\\"}, d2 = {"Lp12/h;", "Lxw/f;", "Lp12/h$a;", "Lo12/f$a;", "Lez/e;", "dateFormatter", "Lmx/c;", "labelProvider", "Ldz/b;", "fileSizeFormatter", "<init>", "(Lez/e;Lmx/c;Ldz/b;)V", "params", "Lo12/e$a;", "state", "Leo0/t;", "directoryType", "Lq12/a;", "G", "(Lp12/h$a;Lo12/e$a;Leo0/t;)Lq12/a;", "Leo0/m;", "messageDetails", "Lkotlin/Function2;", "Leo0/y;", "", "Loq/i0;", "downloadAttachment", "Ln30/b;", "q", "(Leo0/m;Ler/p;)Ln30/b;", "Lq12/b;", i.f37087n, "(Lo12/e$a;Lp12/h$a;)Lq12/b;", "Lkotlin/Function0;", "onPreviewClick", "Ln50/g;", "K", "(Ler/a;)Ln50/g;", "response", "Loq/r;", "Lmx/a;", "v", "(Leo0/m;)Loq/r;", "z", "x", "Ljava/time/OffsetDateTime;", "date", "l", "(Ljava/time/OffsetDateTime;)Ljava/lang/String;", "Lfo0/i;", "status", "Lq12/c;", "J", "(Lfo0/i;)Lq12/c;", "forwardAction", "replyAction", "", "Lh30/a;", "O", "(Leo0/t;Ler/a;Ler/a;)Ljava/util/List;", "action", AnnotatedPrivateKey.LABEL, "Lk30/d;", "buttonVariant", "Lk30/b;", "buttonState", "s", "(Ler/a;Lmx/a;Lk30/d;Lk30/b;)Lh30/a;", "Lfo0/a;", "Lr50/g;", "N", "(Lfo0/a;)Lr50/g;", "M", "(Lp12/h$a;)Lo12/f$a;", "a", "Lez/e;", "getDateFormatter", "()Lez/e;", "b", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "c", "Ldz/b;", "d", "Loq/k;", "F", "()Lmx/a;", "forwardLabel", "e", i.f37094u, "replyLabel", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, o12.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dz.b fileSizeFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k forwardLabel = l.a(new er.a() { // from class: p12.d
        @Override // er.a
        public final Object a() {
            return h.m(this.f151518a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k replyLabel = l.a(new er.a() { // from class: p12.e
        @Override // er.a
        public final Object a() {
            return h.P(this.f151519a);
        }
    });

    /* JADX INFO: renamed from: p12.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b)\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b+\u0010%R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f8\u0006¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b,\u0010.R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b\u001e\u0010%¨\u00060"}, d2 = {"Lp12/h$a;", "", "Lo12/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function2;", "Leo0/y;", "", "downloadAttachment", "onShowUpoPreviewFile", "goToPermissionsSettingsAction", "forwardAction", "replyAction", "Lkotlin/Function1;", "Leo0/m;", "showTechnicalDetailsAction", "deleteMessageAction", "<init>", "(Lo12/e;Ler/a;Ler/p;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo12/e;", "h", "()Lo12/e;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Ler/p;", "()Ler/p;", "e", "getGoToPermissionsSettingsAction", "f", "g", "Ler/l;", "()Ler/l;", "i", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o12.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<y, String, i0> downloadAttachment;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShowUpoPreviewFile;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToPermissionsSettingsAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> forwardAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> replyAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<DeliveryMessageDetails, i0> showTechnicalDetailsAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deleteMessageAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(o12.e eVar, er.a<i0> aVar, p<? super y, ? super String, i0> pVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.l<? super DeliveryMessageDetails, i0> lVar, er.a<i0> aVar6) {
            this.state = eVar;
            this.onBackClick = aVar;
            this.downloadAttachment = pVar;
            this.onShowUpoPreviewFile = aVar2;
            this.goToPermissionsSettingsAction = aVar3;
            this.forwardAction = aVar4;
            this.replyAction = aVar5;
            this.showTechnicalDetailsAction = lVar;
            this.deleteMessageAction = aVar6;
        }

        public final er.a<i0> a() {
            return this.deleteMessageAction;
        }

        public final p<y, String, i0> b() {
            return this.downloadAttachment;
        }

        public final er.a<i0> c() {
            return this.forwardAction;
        }

        public final er.a<i0> d() {
            return this.onBackClick;
        }

        public final er.a<i0> e() {
            return this.onShowUpoPreviewFile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.downloadAttachment, params.downloadAttachment) && t.c(this.onShowUpoPreviewFile, params.onShowUpoPreviewFile) && t.c(this.goToPermissionsSettingsAction, params.goToPermissionsSettingsAction) && t.c(this.forwardAction, params.forwardAction) && t.c(this.replyAction, params.replyAction) && t.c(this.showTechnicalDetailsAction, params.showTechnicalDetailsAction) && t.c(this.deleteMessageAction, params.deleteMessageAction);
        }

        public final er.a<i0> f() {
            return this.replyAction;
        }

        public final er.l<DeliveryMessageDetails, i0> g() {
            return this.showTechnicalDetailsAction;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final o12.e getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.downloadAttachment.hashCode()) * 31) + this.onShowUpoPreviewFile.hashCode()) * 31) + this.goToPermissionsSettingsAction.hashCode()) * 31) + this.forwardAction.hashCode()) * 31) + this.replyAction.hashCode()) * 31) + this.showTechnicalDetailsAction.hashCode()) * 31) + this.deleteMessageAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", downloadAttachment=" + this.downloadAttachment + ", onShowUpoPreviewFile=" + this.onShowUpoPreviewFile + ", goToPermissionsSettingsAction=" + this.goToPermissionsSettingsAction + ", forwardAction=" + this.forwardAction + ", replyAction=" + this.replyAction + ", showTechnicalDetailsAction=" + this.showTechnicalDetailsAction + ", deleteMessageAction=" + this.deleteMessageAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f151539b;

        static {
            int[] iArr = new int[eo0.t.values().length];
            try {
                iArr[eo0.t.INBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eo0.t.SENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f151538a = iArr;
            int[] iArr2 = new int[fo0.a.values().length];
            try {
                iArr2[fo0.a.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[fo0.a.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[fo0.a.UNDELIVERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[fo0.a.VERIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[fo0.a.COMMISSIONED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[fo0.a.TRANSMITTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[fo0.a.SENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[fo0.a.PENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[fo0.a.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            f151539b = iArr2;
        }
    }

    public h(ez.e eVar, mx.c cVar, dz.b bVar) {
        this.dateFormatter = eVar;
        this.labelProvider = cVar;
        this.fileSizeFormatter = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence E(DeliveryMessageAddress deliveryMessageAddress) {
        return deliveryMessageAddress.getName();
    }

    private final Label F() {
        return (Label) this.forwardLabel.getValue();
    }

    private final MessageInitializedViewState G(Params params, o12.e.a state, eo0.t directoryType) {
        x50.a.Icon icon = new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216850f, null, null, params.a(), 6, null));
        return new MessageInitializedViewState(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.d()), this.labelProvider.c(e02.a.V2), null, icon, null, 20, null), null, null, null, null, 61, null), H(state, params), O(directoryType, params.c(), params.f()));
    }

    private final MessageSectionData H(final o12.e.a state, final Params params) {
        Label labelC;
        List listS = v.s(x(state.getData().getMessageDetails()), z(state.getData().getMessageDetails()), oq.y.a(this.labelProvider.c(e02.a.X2).o(Label.INSTANCE.d()), this.labelProvider.c(e02.a.f46559k2)), v(state.getData().getMessageDetails()));
        String textBody = state.getData().getMessageDetails().getTextBody();
        Label labelB = textBody != null ? mx.b.b(textBody, "TextBody") : null;
        String subject = state.getData().getMessageDetails().getDeliveryMessage().getSubject();
        if (subject == null || (labelC = mx.b.b(subject, "title")) == null) {
            labelC = this.labelProvider.c(e02.a.f46584o3);
        }
        return new MessageSectionData(labelC, listS, J(state.getData().getMessageDetails().getDeliveryMessage().getStatus()), new ButtonTextData(null, this.labelProvider.c(e02.a.P2), null, null, new er.a() { // from class: p12.g
            @Override // er.a
            public final Object a() {
                return h.I(params, state);
            }
        }, 13, null), labelB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(Params params, o12.e.a aVar) {
        params.g().b(aVar.getData().getMessageDetails());
        return i0.f148189a;
    }

    private final MessageSectionStatusData J(Status status) {
        fo0.a code;
        r50.g gVarN;
        if (status == null || (code = status.getCode()) == null || (gVarN = N(code)) == null) {
            return null;
        }
        return new MessageSectionStatusData(this.labelProvider.c(e02.a.Y2), new r50.a.WithIcon(null, mx.b.b(status.getDisplayValue(), "messageStatus"), null, 0, false, gVarN, 13, null));
    }

    private final DefaultSingleCardData K(er.a<i0> onPreviewClick) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(e02.a.f46529f2), null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(e02.a.f46497a0), null, 2, null), k30.d.a.f107773a, null, onPreviewClick, 35, null)), null, 2815, null);
    }

    private final Label L() {
        return (Label) this.replyLabel.getValue();
    }

    private final r50.g N(fo0.a aVar) {
        switch (b.f151539b[aVar.ordinal()]) {
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

    private final List<ButtonData> O(eo0.t directoryType, er.a<i0> forwardAction, er.a<i0> replyAction) {
        int i15 = b.f151538a[directoryType.ordinal()];
        if (i15 == 1) {
            return v.q(u(this, replyAction, L(), k30.d.a.f107773a, null, 8, null), u(this, forwardAction, F(), new k30.d.Secondary(null, 1, null), null, 8, null));
        }
        if (i15 != 2) {
            return v.n();
        }
        return v.e(u(this, forwardAction, F(), k30.d.a.f107773a, null, 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Label P(h hVar) {
        return hVar.labelProvider.c(e02.a.O2);
    }

    private final String l(OffsetDateTime date) {
        return this.dateFormatter.d(new fz.b.OffsetDateTime(date), fz.c.FULL_MONTH_DATE_TIME_COMMA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Label m(h hVar) {
        return hVar.labelProvider.c(e02.a.N2);
    }

    private final CardListData q(DeliveryMessageDetails messageDetails, final p<? super y, ? super String, i0> downloadAttachment) {
        List<DeliveryMessageDetailsAttachment> listD = messageDetails.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        int i15 = 0;
        for (Object obj : listD) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final DeliveryMessageDetailsAttachment deliveryMessageDetailsAttachment = (DeliveryMessageDetailsAttachment) obj;
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(deliveryMessageDetailsAttachment.getFileName(), "fileName_" + i15), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.fileSizeFormatter.a(deliveryMessageDetailsAttachment.getFileSize()), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(e02.a.f46604s), mx.b.b(this.labelProvider.c(e02.a.f46604s).getText() + ' ' + deliveryMessageDetailsAttachment.getFileName(), "fileName_download" + i15)), k30.d.a.f107773a, null, new er.a() { // from class: p12.f
                @Override // er.a
                public final Object a() {
                    return h.r(downloadAttachment, deliveryMessageDetailsAttachment);
                }
            }, 35, null)), null, 2815, null));
            i15 = i16;
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(p pVar, DeliveryMessageDetailsAttachment deliveryMessageDetailsAttachment) {
        pVar.B(y.a(deliveryMessageDetailsAttachment.getAttachmentId()), deliveryMessageDetailsAttachment.getFileName());
        return i0.f148189a;
    }

    private final ButtonData s(er.a<i0> action, Label label, k30.d buttonVariant, k30.b buttonState) {
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(label, null, 2, null), buttonVariant, buttonState, action, 3, null);
    }

    static /* synthetic */ ButtonData u(h hVar, er.a aVar, Label label, k30.d dVar, k30.b bVar, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            bVar = k30.b.c.f107768a;
        }
        return hVar.s(aVar, label, dVar, bVar);
    }

    private final r<Label, Label> v(DeliveryMessageDetails response) {
        OffsetDateTime submissionDate;
        if (response.getDeliveryMessage().t()) {
            OffsetDateTime receiptDate = response.getDeliveryMessage().getReceiptDate();
            if (receiptDate != null) {
                return oq.y.a(this.labelProvider.c(e02.a.U2), Label.INSTANCE.d().o(mx.b.b(l(receiptDate), "date")));
            }
            return null;
        }
        if (!response.getDeliveryMessage().u() || (submissionDate = response.getDeliveryMessage().getSubmissionDate()) == null) {
            return null;
        }
        return oq.y.a(this.labelProvider.c(e02.a.W2), Label.INSTANCE.d().o(mx.b.b(l(submissionDate), "date")));
    }

    private final r<Label, Label> x(DeliveryMessageDetails response) {
        DeliveryMessageAddress from;
        String name;
        if (response.getDeliveryMessage().u() || (from = response.getDeliveryMessage().getFrom()) == null || (name = from.getName()) == null) {
            return null;
        }
        return oq.y.a(this.labelProvider.c(e02.a.N), mx.b.b(name, "fromName"));
    }

    private final r<Label, Label> z(DeliveryMessageDetails response) {
        List<DeliveryMessageAddress> listP;
        if (response.getDeliveryMessage().t() || (listP = response.getDeliveryMessage().p()) == null) {
            return null;
        }
        return oq.y.a(this.labelProvider.c(e02.a.f46647z0), mx.b.b(v.v0(listP, ", ", null, null, 0, null, new er.l() { // from class: p12.c
            @Override // er.l
            public final Object b(Object obj) {
                return h.E((DeliveryMessageAddress) obj);
            }
        }, 30, null), "toName"));
    }

    @Override // er.l
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public o12.f.a b(Params params) {
        o12.e state = params.getState();
        if (state instanceof o12.d) {
            return o12.f.a.c.f140329a;
        }
        if (state instanceof Error) {
            return new o12.f.a.Error(((Error) params.getState()).getErrorVMS());
        }
        if (state instanceof o12.e.a.Error) {
            return new o12.f.a.Error(((o12.e.a.Error) params.getState()).getErrorVMS());
        }
        if (!(state instanceof o12.e.a)) {
            throw new oq.p();
        }
        return new o12.f.a.Initialized(G(params, (o12.e.a) params.getState(), ((o12.e.a) params.getState()).getData().getDirectoryType()), K(params.e()), this.labelProvider.c(e02.a.f46520e), q(((o12.e.a) params.getState()).getData().getMessageDetails(), params.b()));
    }
}
