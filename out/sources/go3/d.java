package go3;

import android.text.TextUtils;
import co3.QrCodeData;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0012\u000e\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lgo3/d;", "", "Lgo3/d$c;", "Lco3/e;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lgo3/d$c;Ltq/e;)Ljava/lang/Object;", "Ldx/b$c;", "a", "Ldx/b$c;", "error", "b", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f75331c = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business error;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lgo3/d$a;", "Ldx/b$c$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a implements dx.b.Business.a {
        WRONG_QR_CODE;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ wq.a f75335c = wq.b.a(b());
    }

    /* JADX INFO: renamed from: go3.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lgo3/d$c;", "Lgz/b$a;", "", "qrCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            return (other instanceof Params) && fr.t.c(this.qrCode, ((Params) other).qrCode);
        }

        public int hashCode() {
            return this.qrCode.hashCode();
        }

        public String toString() {
            return "Params(qrCode=" + this.qrCode + ')';
        }
    }

    public d(mx.c cVar) {
        this.error = new dx.b.Business(a.WRONG_QR_CODE, null, cVar.c(un3.b.f199478r1), cVar.c(un3.b.f199473q1), null, cVar.c(un3.b.f199476r), cVar.c(un3.b.f199406d), 18, null);
    }

    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, QrCodeData>> eVar) {
        co3.f fVar;
        List listV0 = fu.r.V0(params.getQrCode(), new String[]{";"}, false, 0, 6, null);
        if (listV0.isEmpty() || listV0.size() != 15 || !TextUtils.isDigitsOnly((CharSequence) listV0.get(0))) {
            return new dx.i.Left(this.error);
        }
        String str = (String) listV0.get(1);
        if (fr.t.c(str, ip.a.f96137b)) {
            fVar = co3.f.STATIC;
        } else {
            if (!fr.t.c(str, ip.a.f96138c)) {
                return new dx.i.Left(this.error);
            }
            fVar = co3.f.DYNAMIC;
        }
        return new dx.i.Right(new QrCodeData(Integer.parseInt((String) listV0.get(0)), fVar, (String) listV0.get(2), (String) listV0.get(3), (String) listV0.get(4), (String) listV0.get(5), (String) listV0.get(6), (String) listV0.get(7), (String) listV0.get(8), (String) listV0.get(9), (String) listV0.get(10), (String) listV0.get(11), (String) listV0.get(12), (String) listV0.get(13), (String) listV0.get(14)));
    }
}
