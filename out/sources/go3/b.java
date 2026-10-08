package go3;

import android.text.TextUtils;
import co3.QrCodeData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0013\r\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lgo3/b;", "", "Lgo3/b$c;", "Lco3/u;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lgo3/b$c;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "Ldx/b$c;", "b", "Ldx/b$c;", "error", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f75216d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business error;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lgo3/b$a;", "Ldx/b$c$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a implements dx.b.Business.a {
        WRONG_QR_CODE;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ wq.a f75221c = wq.b.a(b());
    }

    /* JADX INFO: renamed from: go3.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/b$c;", "Lgz/b$a;", "Lco3/e;", "qrCodeData", "<init>", "(Lco3/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/e;", "()Lco3/e;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        public Params(QrCodeData qrCodeData) {
            this.qrCodeData = qrCodeData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.qrCodeData, ((Params) other).qrCodeData);
        }

        public int hashCode() {
            return this.qrCodeData.hashCode();
        }

        public String toString() {
            return "Params(qrCodeData=" + this.qrCodeData + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75223a;

        static {
            int[] iArr = new int[co3.f.values().length];
            try {
                iArr[co3.f.DYNAMIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[co3.f.STATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f75223a = iArr;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
        this.error = new dx.b.Business(a.WRONG_QR_CODE, null, cVar.c(un3.b.f199478r1), cVar.c(un3.b.f199473q1), null, cVar.c(un3.b.f199476r), cVar.c(un3.b.f199406d), 18, null);
    }

    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, ? extends co3.u>> eVar) {
        int serviceType = params.getQrCodeData().getServiceType();
        if (serviceType == 8) {
            return (TextUtils.isDigitsOnly(params.getQrCodeData().getAttribute1()) && TextUtils.isDigitsOnly(params.getQrCodeData().getStakeholderID())) ? new dx.i.Right(co3.u.a.f28655a) : new dx.i.Left(this.error);
        }
        if (serviceType == 25) {
            int i15 = d.f75223a[params.getQrCodeData().getQrType().ordinal()];
            if (i15 == 1) {
                return new dx.i.Right(co3.u.b.f28656a);
            }
            if (i15 == 2) {
                return new dx.i.Left(this.error);
            }
            throw new oq.p();
        }
        if (serviceType != 26) {
            return new dx.i.Left(this.error);
        }
        int i16 = d.f75223a[params.getQrCodeData().getQrType().ordinal()];
        if (i16 == 1) {
            return new dx.i.Right(co3.u.c.f28657a);
        }
        if (i16 == 2) {
            return new dx.i.Left(this.error);
        }
        throw new oq.p();
    }
}
