package y11;

import ez.e;
import fr.t;
import h30.ButtonData;
import k30.d;
import l60.KeyValueData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import s11.CertificateRevokeConfirmationData;
import th0.q;
import v11.ConfirmationScreenModel;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ly11/c;", "Lxw/f;", "Ly11/c$a;", "Lv11/a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lth0/q;", "reason", "Lmx/a;", "c", "(Lth0/q;)Lmx/a;", "params", "e", "(Ly11/c$a;)Lv11/a;", "a", "Lmx/c;", "b", "Lez/e;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, ConfirmationScreenModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: y11.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Ly11/c$a;", "", "Ls11/c;", "data", "Lkotlin/Function0;", "Loq/i0;", "primaryButtonClick", "closeButtonClick", "<init>", "(Ls11/c;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls11/c;", "b", "()Ls11/c;", "Ler/a;", "c", "()Ler/a;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertificateRevokeConfirmationData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> primaryButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeButtonClick;

        public Params(CertificateRevokeConfirmationData certificateRevokeConfirmationData, er.a<i0> aVar, er.a<i0> aVar2) {
            this.data = certificateRevokeConfirmationData;
            this.primaryButtonClick = aVar;
            this.closeButtonClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.closeButtonClick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CertificateRevokeConfirmationData getData() {
            return this.data;
        }

        public final er.a<i0> c() {
            return this.primaryButtonClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.data, params.data) && t.c(this.primaryButtonClick, params.primaryButtonClick) && t.c(this.closeButtonClick, params.closeButtonClick);
        }

        public int hashCode() {
            return (((this.data.hashCode() * 31) + this.primaryButtonClick.hashCode()) * 31) + this.closeButtonClick.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ", primaryButtonClick=" + this.primaryButtonClick + ", closeButtonClick=" + this.closeButtonClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223161a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.USER_REVOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.ADMIN_REVOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.CALL_CENTER_REVOCATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q.CERTIFICATE_EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q.CERTIFICATES_LIMIT_REACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q.ID_CARD_INVALIDATED_REFRESH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q.ID_CARD_INVALIDATED_SUBSCRIPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q.STUDENT_USER_REVOCATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[q.USER_SUBSCRIPTION_CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[q.USER_DEATH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[q.USER_UKR_STATUS_LOSS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[q.USER_PESEL_CHANGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[q.USER_PERSONAL_DATA_CHANGE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[q.VALID_PERIOD_EXCEEDED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[q.MANUALLY_UPDATE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[q.MOBILE_APP_UNINSTALLED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[q.CERTIFICATE_ACTIVATION_ERROR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[q.UNKNOWN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f223161a = iArr;
        }
    }

    public c(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label c(q reason) {
        switch (b.f223161a[reason.ordinal()]) {
            case 1:
                return this.labelProvider.c(m11.b.f122457a0);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return this.labelProvider.c(m11.b.W);
            default:
                throw new p();
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ConfirmationScreenModel b(Params params) {
        return new ConfirmationScreenModel(this.labelProvider.e(m11.b.f122472i, params.getData().getDocumentTypeName()), new KeyValueData(this.labelProvider.c(m11.b.f122498x), mx.b.d(this.dateFormatter.d(new fz.b.OffsetDateTime(params.getData().getRevokeDate()), fz.c.DOTTED_PLUS_HOUR), "revokeDate"), false, 4, null), new KeyValueData(this.labelProvider.c(m11.b.f122495u), c(params.getData().getRevokeReason()), false, 4, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(m11.b.f122460c), null, 2, null), d.a.f107773a, null, params.c(), 35, null), params.a());
    }
}
