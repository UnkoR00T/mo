package iy;

import java.math.BigInteger;
import java.security.KeyPair;
import java.time.LocalDate;
import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0001\u0018¨\u0006\u0019"}, d2 = {"Liy/f;", "", "<init>", "()V", "Ljava/security/KeyPair;", "b", "()Ljava/security/KeyPair;", "keyPair", "Ljava/math/BigInteger;", "e", "()Ljava/math/BigInteger;", "serialNumber", "", "a", "()Ljava/lang/String;", "dirName", "d", "principalName", "f", "signatureAlgorithm", "Ljava/util/Date;", "c", "()Ljava/util/Date;", "notAfter", "Liy/f$a;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class f {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\n\u0010!R\u001a\u0010$\u001a\u00020\u001e8\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u0016\u0010!R\u001a\u0010&\u001a\u00020\u001e8\u0016X\u0096D¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u001f\u0010!R\u001a\u0010,\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b\u0012\u0010+¨\u0006/"}, d2 = {"Liy/f$a;", "Liy/f;", "Lez/a;", "currentTimeProvider", "Lez/c;", "dateConverter", "Ljava/security/KeyPair;", "keyPair", "<init>", "(Lez/a;Lez/c;Ljava/security/KeyPair;)V", "a", "Lez/a;", "getCurrentTimeProvider", "()Lez/a;", "b", "Lez/c;", "getDateConverter", "()Lez/c;", "c", "Ljava/security/KeyPair;", "()Ljava/security/KeyPair;", "Ljava/time/LocalDate;", "d", "Ljava/time/LocalDate;", "currentDate", "Ljava/math/BigInteger;", "e", "Ljava/math/BigInteger;", "()Ljava/math/BigInteger;", "serialNumber", "", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "dirName", "g", "principalName", "h", "signatureAlgorithm", "Ljava/util/Date;", "i", "Ljava/util/Date;", "getNotBefore", "()Ljava/util/Date;", "notBefore", "j", "notAfter", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ez.a currentTimeProvider;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ez.c dateConverter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final KeyPair keyPair;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final LocalDate currentDate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final BigInteger serialNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String dirName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String principalName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final String signatureAlgorithm;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final Date notBefore;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final Date notAfter;

        public a(ez.a aVar, ez.c cVar, KeyPair keyPair) {
            super(null);
            this.currentTimeProvider = aVar;
            this.dateConverter = cVar;
            this.keyPair = keyPair;
            LocalDate localDateC = aVar.c();
            this.currentDate = localDateC;
            this.serialNumber = BigInteger.ONE;
            this.dirName = "DC=";
            this.principalName = "CN=";
            this.signatureAlgorithm = "SHA256WithRSAEncryption";
            this.notBefore = cVar.f(localDateC.minusDays(1L));
            this.notAfter = cVar.f(localDateC.plusYears(100L));
        }

        @Override // iy.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getDirName() {
            return this.dirName;
        }

        @Override // iy.f
        /* JADX INFO: renamed from: b, reason: from getter */
        public KeyPair getKeyPair() {
            return this.keyPair;
        }

        @Override // iy.f
        /* JADX INFO: renamed from: c, reason: from getter */
        public Date getNotAfter() {
            return this.notAfter;
        }

        @Override // iy.f
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getPrincipalName() {
            return this.principalName;
        }

        @Override // iy.f
        /* JADX INFO: renamed from: e, reason: from getter */
        public BigInteger getSerialNumber() {
            return this.serialNumber;
        }

        @Override // iy.f
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getSignatureAlgorithm() {
            return this.signatureAlgorithm;
        }
    }

    public /* synthetic */ f(fr.k kVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getDirName();

    /* JADX INFO: renamed from: b */
    public abstract KeyPair getKeyPair();

    /* JADX INFO: renamed from: c */
    public abstract Date getNotAfter();

    /* JADX INFO: renamed from: d */
    public abstract String getPrincipalName();

    /* JADX INFO: renamed from: e */
    public abstract BigInteger getSerialNumber();

    /* JADX INFO: renamed from: f */
    public abstract String getSignatureAlgorithm();

    private f() {
    }
}
