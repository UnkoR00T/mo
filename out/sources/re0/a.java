package re0;

import dx.i;
import fr.t;
import fu.r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k80.QrCodeData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Lre0/a;", "", "Lre0/a$b;", "Lk80/d;", "Lmx/c;", "labelProvider", "Lez/a;", "currentTimeProvider", "<init>", "(Lmx/c;Lez/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lre0/a$b;Ltq/e;)Ljava/lang/Object;", "a", "Lez/a;", "Ldx/b$c;", "b", "Ldx/b$c;", "incorrectQrCodeError", "c", "qrCodeExpiredError", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f173359e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business incorrectQrCodeError;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business qrCodeExpiredError;

    /* JADX INFO: renamed from: re0.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lre0/a$b;", "Lgz/b$a;", "", "qrCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String qrCode;

        public Params(String str) {
            this.qrCode = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getQrCode() {
            return this.qrCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.qrCode, ((Params) other).qrCode);
        }

        public int hashCode() {
            return this.qrCode.hashCode();
        }

        public String toString() {
            return "Params(qrCode=" + this.qrCode + ')';
        }
    }

    public a(mx.c cVar, ez.a aVar) {
        this.currentTimeProvider = aVar;
        this.incorrectQrCodeError = new dx.b.Business(qe0.a.WRONG_QR_CODE, null, cVar.c(oe0.a.f145023d), cVar.c(oe0.a.f145033n), null, cVar.c(oe0.a.f145020a), null, 82, null);
        this.qrCodeExpiredError = new dx.b.Business(qe0.a.EXPIRED_QR, null, cVar.c(oe0.a.f145022c), cVar.c(oe0.a.f145032m), null, cVar.c(oe0.a.f145026g), cVar.c(oe0.a.f145020a), 18, null);
    }

    public Object d(Params params, tq.e<? super i<? extends dx.b, QrCodeData>> eVar) {
        k80.f fVar;
        List listV0 = r.V0(params.getQrCode(), new String[]{";"}, false, 0, 6, null);
        if (listV0.isEmpty() || listV0.size() != 15 || !t.c(listV0.get(0), "25")) {
            return new i.Left(this.incorrectQrCodeError);
        }
        String str = (String) listV0.get(1);
        if (t.c(str, ip.a.f96137b)) {
            fVar = k80.f.STATIC;
        } else {
            if (!t.c(str, ip.a.f96138c)) {
                return new i.Left(this.incorrectQrCodeError);
            }
            fVar = k80.f.DYNAMIC;
        }
        k80.f fVar2 = fVar;
        String strValueOf = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.currentTimeProvider.a()));
        return (strValueOf.compareTo((String) listV0.get(8)) < 0 || strValueOf.compareTo((String) listV0.get(9)) > 0) ? new i.Left(this.qrCodeExpiredError) : new i.Right(new QrCodeData(Integer.parseInt((String) listV0.get(0)), fVar2, (String) listV0.get(2), (String) listV0.get(3), (String) listV0.get(4), (String) listV0.get(5), (String) listV0.get(6), (String) listV0.get(7), (String) listV0.get(8), (String) listV0.get(9), (String) listV0.get(10), (String) listV0.get(11), (String) listV0.get(12), (String) listV0.get(13), (String) listV0.get(14)));
    }
}
