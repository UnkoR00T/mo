package xo3;

import android.graphics.Bitmap;
import iy.b0;
import java.security.KeyPair;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lxo3/y;", "", "a", "b", "Lxo3/y$a;", "Lxo3/y$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface y {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxo3/y$a;", "Lxo3/y;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f220394a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 2066774984;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: xo3.y$b, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jv\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b*\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b0\u00104¨\u00065"}, d2 = {"Lxo3/y$b;", "Lxo3/y;", "", "qrCode", "sessionUuid", "Liy/b0;", "secret", "Ljava/security/KeyPair;", "keyPair", "Lgu/b;", "timeLeft", "startTime", "maxTime", "code", "Landroid/graphics/Bitmap;", "qrCodeBitmap", "", "shouldPollingRun", "<init>", "(Ljava/lang/String;Ljava/lang/String;Liy/b0;Ljava/security/KeyPair;JJJLjava/lang/String;Landroid/graphics/Bitmap;ZLfr/k;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Liy/b0;Ljava/security/KeyPair;JJJLjava/lang/String;Landroid/graphics/Bitmap;Z)Lxo3/y$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQrCode", "b", "h", "c", "Liy/b0;", "g", "()Liy/b0;", "d", "Ljava/security/KeyPair;", "()Ljava/security/KeyPair;", "e", "J", "k", "()J", "f", "j", "i", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "Z", "()Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String qrCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionUuid;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 secret;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final KeyPair keyPair;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timeLeft;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final long startTime;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final long maxTime;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String code;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap qrCodeBitmap;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldPollingRun;

        public /* synthetic */ Initialized(String str, String str2, b0 b0Var, KeyPair keyPair, long j15, long j16, long j17, String str3, Bitmap bitmap, boolean z15, fr.k kVar) {
            this(str, str2, b0Var, keyPair, j15, j16, j17, str3, bitmap, z15);
        }

        public static /* synthetic */ Initialized b(Initialized initialized, String str, String str2, b0 b0Var, KeyPair keyPair, long j15, long j16, long j17, String str3, Bitmap bitmap, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = initialized.qrCode;
            }
            return initialized.a(str, (i15 & 2) != 0 ? initialized.sessionUuid : str2, (i15 & 4) != 0 ? initialized.secret : b0Var, (i15 & 8) != 0 ? initialized.keyPair : keyPair, (i15 & 16) != 0 ? initialized.timeLeft : j15, (i15 & 32) != 0 ? initialized.startTime : j16, (i15 & 64) != 0 ? initialized.maxTime : j17, (i15 & 128) != 0 ? initialized.code : str3, (i15 & 256) != 0 ? initialized.qrCodeBitmap : bitmap, (i15 & 512) != 0 ? initialized.shouldPollingRun : z15);
        }

        public final Initialized a(String qrCode, String sessionUuid, b0 secret, KeyPair keyPair, long timeLeft, long startTime, long maxTime, String code, Bitmap qrCodeBitmap, boolean shouldPollingRun) {
            return new Initialized(qrCode, sessionUuid, secret, keyPair, timeLeft, startTime, maxTime, code, qrCodeBitmap, shouldPollingRun, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final KeyPair getKeyPair() {
            return this.keyPair;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getMaxTime() {
            return this.maxTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.qrCode, initialized.qrCode) && fr.t.c(this.sessionUuid, initialized.sessionUuid) && fr.t.c(this.secret, initialized.secret) && fr.t.c(this.keyPair, initialized.keyPair) && gu.b.v(this.timeLeft, initialized.timeLeft) && gu.b.v(this.startTime, initialized.startTime) && gu.b.v(this.maxTime, initialized.maxTime) && fr.t.c(this.code, initialized.code) && fr.t.c(this.qrCodeBitmap, initialized.qrCodeBitmap) && this.shouldPollingRun == initialized.shouldPollingRun;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Bitmap getQrCodeBitmap() {
            return this.qrCodeBitmap;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final b0 getSecret() {
            return this.secret;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSessionUuid() {
            return this.sessionUuid;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.qrCode.hashCode() * 31) + this.sessionUuid.hashCode()) * 31) + this.secret.hashCode()) * 31) + this.keyPair.hashCode()) * 31) + gu.b.N(this.timeLeft)) * 31) + gu.b.N(this.startTime)) * 31) + gu.b.N(this.maxTime)) * 31;
            String str = this.code;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.qrCodeBitmap.hashCode()) * 31) + Boolean.hashCode(this.shouldPollingRun);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getShouldPollingRun() {
            return this.shouldPollingRun;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final long getTimeLeft() {
            return this.timeLeft;
        }

        public String toString() {
            return "Initialized(qrCode=" + this.qrCode + ", sessionUuid=" + this.sessionUuid + ", secret=" + this.secret + ", keyPair=" + this.keyPair + ", timeLeft=" + ((Object) gu.b.d0(this.timeLeft)) + ", startTime=" + ((Object) gu.b.d0(this.startTime)) + ", maxTime=" + ((Object) gu.b.d0(this.maxTime)) + ", code=" + this.code + ", qrCodeBitmap=" + this.qrCodeBitmap + ", shouldPollingRun=" + this.shouldPollingRun + ')';
        }

        private Initialized(String str, String str2, b0 b0Var, KeyPair keyPair, long j15, long j16, long j17, String str3, Bitmap bitmap, boolean z15) {
            this.qrCode = str;
            this.sessionUuid = str2;
            this.secret = b0Var;
            this.keyPair = keyPair;
            this.timeLeft = j15;
            this.startTime = j16;
            this.maxTime = j17;
            this.code = str3;
            this.qrCodeBitmap = bitmap;
            this.shouldPollingRun = z15;
        }
    }
}
