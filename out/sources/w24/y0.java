package w24;

import i24.MIdCardData;
import i24.RefugeeCardData;
import i24.StudentCardContainerData;
import i24.StudentCardData;
import java.util.concurrent.CancellationException;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import u24.UserDocumentData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lw24/y0;", "Lw24/x0;", "Lv24/b;", "documentsContainerRepository", "Lk24/g;", "getMainCertificateTypeUC", "<init>", "(Lv24/b;Lk24/g;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Lu24/c;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lv24/b;", "b", "Lk24/g;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k24.g getMainCertificateTypeUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f210041a;

        static {
            int[] iArr = new int[f24.c.values().length];
            try {
                iArr[f24.c.CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f24.c.REFUGEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f24.c.UNIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f210041a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f210042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f210043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f210044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f210045g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f210046h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f210047j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f210048k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f210049l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f210050m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f210051n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f210052p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f210053q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f210055s;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f210053q = obj;
            this.f210055s |= PKIFailureInfo.systemUnavail;
            return y0.this.c(null, this);
        }
    }

    public y0(v24.b bVar, k24.g gVar) {
        this.documentsContainerRepository = bVar;
        this.getMainCertificateTypeUC = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02a5 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02c7 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02dc A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x031a  */
    /* JADX WARN: Code duplicated, block: B:123:0x031c A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0320 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0359 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x037f A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x03a5 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x03cb A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x03ea A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0169  */
    /* JADX WARN: Code duplicated, block: B:57:0x016b A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x016f A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0185 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x018b A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d2 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0218  */
    /* JADX WARN: Code duplicated, block: B:76:0x021a A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x021e A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x023f A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0261 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0283 A[Catch: Exception -> 0x004f, c -> 0x0052, CancellationException -> 0x0055, TryCatch #1 {Exception -> 0x004f, blocks: (B:15:0x004a, B:54:0x0163, B:154:0x03de, B:57:0x016b, B:59:0x016f, B:61:0x0185, B:63:0x018b, B:64:0x0195, B:65:0x01d2, B:66:0x01d7, B:157:0x03f0, B:160:0x03fe, B:26:0x0078, B:73:0x0212, B:76:0x021a, B:78:0x021e, B:80:0x0236, B:85:0x024a, B:87:0x0258, B:92:0x026c, B:94:0x027a, B:99:0x028e, B:101:0x029c, B:106:0x02b0, B:108:0x02be, B:113:0x02d2, B:112:0x02c7, B:105:0x02a5, B:98:0x0283, B:91:0x0261, B:84:0x023f, B:114:0x02dc, B:115:0x02e1, B:29:0x0095, B:120:0x0314, B:123:0x031c, B:125:0x0320, B:127:0x0350, B:132:0x0364, B:134:0x0376, B:139:0x038a, B:141:0x039c, B:146:0x03b0, B:148:0x03c2, B:153:0x03d6, B:152:0x03cb, B:145:0x03a5, B:138:0x037f, B:131:0x0359, B:155:0x03ea, B:156:0x03ef, B:45:0x0118, B:50:0x012f, B:67:0x01d8, B:68:0x01dd, B:69:0x01de, B:116:0x02e2, B:41:0x00dc), top: B:175:0x0028 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, UserDocumentData>> eVar) throws Throwable {
        b bVar;
        Object objB;
        int i15;
        int i16;
        int i17;
        ex.b bVar2;
        gz.b.a.C1792a c1792a2;
        int i18;
        dx.j<dx.b> jVarA;
        int i19;
        ex.b bVar3;
        ex.b aVar;
        ex.b bVar4;
        Object right;
        iy.b0 name;
        String text;
        iy.b0 secondName;
        String text2;
        iy.b0 surname;
        String text3;
        iy.b0 pesel;
        String text4;
        iy.b0 picture;
        String text5;
        iy.b0 firstName;
        String text6;
        iy.b0 secondName2;
        String text7;
        iy.b0 surname2;
        String text8;
        iy.b0 pesel2;
        String text9;
        StudentCardContainerData data;
        String pictureWithWatermark;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f210055s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f210055s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objU = bVar.f210053q;
        Object objE = uq.b.e();
        ?? r15 = bVar.f210055s;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objU);
                    jVarA = xw.c.f221622a.a();
                    aVar = new ex.a();
                    k24.g gVar = this.getMainCertificateTypeUC;
                    i18 = 0;
                    k24.g.Params params = new k24.g.Params(false, 1, null);
                    bVar.f210042d = vq.j.a(c1792a);
                    bVar.f210043e = jVarA;
                    bVar.f210044f = vq.j.a(aVar);
                    bVar.f210045g = aVar;
                    bVar.f210046h = aVar;
                    bVar.f210048k = 0;
                    bVar.f210049l = 0;
                    bVar.f210050m = 0;
                    bVar.f210051n = 0;
                    bVar.f210052p = 0;
                    bVar.f210055s = 1;
                    objU = gVar.c(params, bVar);
                    if (objU != objE) {
                        c1792a2 = c1792a;
                        i19 = 0;
                        i15 = 0;
                        i16 = 0;
                        i17 = 0;
                        bVar3 = aVar;
                        bVar2 = bVar3;
                    }
                    return objE;
                }
                try {
                    if (r15 != 1) {
                        if (r15 == 2) {
                            bVar4 = (ex.b) bVar.f210046h;
                            oq.u.b(objU);
                            right = (dx.i) objU;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                MIdCardData mIdCardData = (MIdCardData) ((dx.i.Right) right).b();
                                String strE = iy.c0.e(mIdCardData.getScope().getData().getPersonalIdCard().getPicture());
                                name = mIdCardData.getScope().getData().getPersonalData().getName();
                                if (name != null || (text = iy.c0.e(name)) == null) {
                                    text = Label.INSTANCE.b().getText();
                                }
                                String str = text;
                                secondName = mIdCardData.getScope().getData().getPersonalData().getSecondName();
                                if (secondName != null || (text2 = iy.c0.e(secondName)) == null) {
                                    text2 = Label.INSTANCE.c().getText();
                                }
                                String str2 = text2;
                                surname = mIdCardData.getScope().getData().getPersonalData().getSurname();
                                if (surname != null || (text3 = iy.c0.e(surname)) == null) {
                                    text3 = Label.INSTANCE.b().getText();
                                }
                                String str3 = text3;
                                pesel = mIdCardData.getScope().getData().getPersonalData().getPesel();
                                if (pesel != null || (text4 = iy.c0.e(pesel)) == null) {
                                    text4 = Label.INSTANCE.b().getText();
                                }
                                right = new dx.i.Right(new UserDocumentData(strE, str, str2, str3, text4));
                            }
                            return new dx.i.Right((UserDocumentData) bVar4.a(right));
                        }
                        if (r15 != 3) {
                            if (r15 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar4 = (ex.b) bVar.f210046h;
                            oq.u.b(objU);
                            right = (dx.i) objU;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                StudentCardData studentCardData = (StudentCardData) ((dx.i.Right) right).b();
                                data = studentCardData.getScope().getData();
                                pictureWithWatermark = data.getPictureWithWatermark();
                                if (pictureWithWatermark == null) {
                                    pictureWithWatermark = data.getPicture();
                                }
                                if (pictureWithWatermark == null) {
                                    pictureWithWatermark = Label.INSTANCE.c().getText();
                                }
                                right = new dx.i.Right(new UserDocumentData(pictureWithWatermark, studentCardData.getScope().getData().getName(), studentCardData.getScope().getData().getSecondName(), studentCardData.getScope().getData().getSurname(), studentCardData.getScope().getData().getPesel()));
                            }
                            return new dx.i.Right((UserDocumentData) bVar4.a(right));
                        }
                        bVar4 = (ex.b) bVar.f210046h;
                        oq.u.b(objU);
                        right = (dx.i) objU;
                        if (!(right instanceof dx.i.Left)) {
                            if (right instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            RefugeeCardData refugeeCardData = (RefugeeCardData) ((dx.i.Right) right).b();
                            picture = refugeeCardData.getScope().getData().getPicture();
                            if (picture != null || (text5 = iy.c0.e(picture)) == null) {
                                text5 = Label.INSTANCE.c().getText();
                            }
                            String str4 = text5;
                            firstName = refugeeCardData.getScope().getData().getFirstName();
                            if (firstName != null || (text6 = iy.c0.e(firstName)) == null) {
                                text6 = Label.INSTANCE.b().getText();
                            }
                            String str5 = text6;
                            secondName2 = refugeeCardData.getScope().getData().getSecondName();
                            if (secondName2 != null || (text7 = iy.c0.e(secondName2)) == null) {
                                text7 = Label.INSTANCE.c().getText();
                            }
                            String str6 = text7;
                            surname2 = refugeeCardData.getScope().getData().getSurname();
                            if (surname2 != null || (text8 = iy.c0.e(surname2)) == null) {
                                text8 = Label.INSTANCE.b().getText();
                            }
                            String str7 = text8;
                            pesel2 = refugeeCardData.getScope().getData().getPesel();
                            if (pesel2 != null || (text9 = iy.c0.e(pesel2)) == null) {
                                text9 = Label.INSTANCE.b().getText();
                            }
                            right = new dx.i.Right(new UserDocumentData(str4, str5, str6, str7, text9));
                        }
                        return new dx.i.Right((UserDocumentData) bVar4.a(right));
                    }
                    int i26 = bVar.f210052p;
                    int i27 = bVar.f210051n;
                    i15 = bVar.f210050m;
                    i16 = bVar.f210049l;
                    i17 = bVar.f210048k;
                    ex.b bVar5 = (ex.b) bVar.f210046h;
                    ex.b bVar6 = (ex.b) bVar.f210045g;
                    bVar2 = (ex.b) bVar.f210044f;
                    dx.j<dx.b> jVar = (dx.j) bVar.f210043e;
                    c1792a2 = (gz.b.a.C1792a) bVar.f210042d;
                    try {
                        oq.u.b(objU);
                        i18 = i26;
                        jVarA = jVar;
                        i19 = i27;
                        bVar3 = bVar5;
                        aVar = bVar6;
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        r15 = jVar;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(r15));
                        dx.i iVarA = r15.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (CancellationException e18) {
                    throw e18;
                }
                f24.c cVar = (f24.c) bVar3.a((dx.i) objU);
                int i28 = a.f210041a[cVar.ordinal()];
                if (i28 == 1) {
                    v24.b bVar7 = this.documentsContainerRepository;
                    bVar.f210042d = vq.j.a(c1792a2);
                    bVar.f210043e = jVarA;
                    bVar.f210044f = vq.j.a(bVar2);
                    bVar.f210045g = vq.j.a(aVar);
                    bVar.f210046h = aVar;
                    bVar.f210047j = vq.j.a(cVar);
                    bVar.f210048k = i17;
                    bVar.f210049l = i16;
                    bVar.f210050m = i15;
                    bVar.f210051n = i19;
                    bVar.f210052p = i18;
                    bVar.f210055s = 2;
                    objU = bVar7.u(bVar);
                    if (objU != objE) {
                        bVar4 = aVar;
                        right = (dx.i) objU;
                        if (!(right instanceof dx.i.Left)) {
                            if (right instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            MIdCardData mIdCardData2 = (MIdCardData) ((dx.i.Right) right).b();
                            String strE2 = iy.c0.e(mIdCardData2.getScope().getData().getPersonalIdCard().getPicture());
                            name = mIdCardData2.getScope().getData().getPersonalData().getName();
                            if (name != null) {
                                text = Label.INSTANCE.b().getText();
                            } else {
                                text = Label.INSTANCE.b().getText();
                            }
                            String str8 = text;
                            secondName = mIdCardData2.getScope().getData().getPersonalData().getSecondName();
                            if (secondName != null) {
                                text2 = Label.INSTANCE.c().getText();
                            } else {
                                text2 = Label.INSTANCE.c().getText();
                            }
                            String str9 = text2;
                            surname = mIdCardData2.getScope().getData().getPersonalData().getSurname();
                            if (surname != null) {
                                text3 = Label.INSTANCE.b().getText();
                            } else {
                                text3 = Label.INSTANCE.b().getText();
                            }
                            String str10 = text3;
                            pesel = mIdCardData2.getScope().getData().getPersonalData().getPesel();
                            if (pesel != null) {
                                text4 = Label.INSTANCE.b().getText();
                            } else {
                                text4 = Label.INSTANCE.b().getText();
                            }
                            right = new dx.i.Right(new UserDocumentData(strE2, str8, str9, str10, text4));
                        }
                        return new dx.i.Right((UserDocumentData) bVar4.a(right));
                    }
                } else if (i28 == 2) {
                    v24.b bVar8 = this.documentsContainerRepository;
                    bVar.f210042d = vq.j.a(c1792a2);
                    bVar.f210043e = jVarA;
                    bVar.f210044f = vq.j.a(bVar2);
                    bVar.f210045g = vq.j.a(aVar);
                    bVar.f210046h = aVar;
                    bVar.f210047j = vq.j.a(cVar);
                    bVar.f210048k = i17;
                    bVar.f210049l = i16;
                    bVar.f210050m = i15;
                    bVar.f210051n = i19;
                    bVar.f210052p = i18;
                    bVar.f210055s = 3;
                    objU = bVar8.E(bVar);
                    if (objU != objE) {
                        bVar4 = aVar;
                        right = (dx.i) objU;
                        if (!(right instanceof dx.i.Left)) {
                            if (right instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            RefugeeCardData refugeeCardData2 = (RefugeeCardData) ((dx.i.Right) right).b();
                            picture = refugeeCardData2.getScope().getData().getPicture();
                            if (picture != null) {
                                text5 = Label.INSTANCE.c().getText();
                            } else {
                                text5 = Label.INSTANCE.c().getText();
                            }
                            String str11 = text5;
                            firstName = refugeeCardData2.getScope().getData().getFirstName();
                            if (firstName != null) {
                                text6 = Label.INSTANCE.b().getText();
                            } else {
                                text6 = Label.INSTANCE.b().getText();
                            }
                            String str12 = text6;
                            secondName2 = refugeeCardData2.getScope().getData().getSecondName();
                            if (secondName2 != null) {
                                text7 = Label.INSTANCE.c().getText();
                            } else {
                                text7 = Label.INSTANCE.c().getText();
                            }
                            String str13 = text7;
                            surname2 = refugeeCardData2.getScope().getData().getSurname();
                            if (surname2 != null) {
                                text8 = Label.INSTANCE.b().getText();
                            } else {
                                text8 = Label.INSTANCE.b().getText();
                            }
                            String str14 = text8;
                            pesel2 = refugeeCardData2.getScope().getData().getPesel();
                            if (pesel2 != null) {
                                text9 = Label.INSTANCE.b().getText();
                            } else {
                                text9 = Label.INSTANCE.b().getText();
                            }
                            right = new dx.i.Right(new UserDocumentData(str11, str12, str13, str14, text9));
                        }
                        return new dx.i.Right((UserDocumentData) bVar4.a(right));
                    }
                } else {
                    if (i28 != 3) {
                        throw new oq.p();
                    }
                    v24.b bVar9 = this.documentsContainerRepository;
                    bVar.f210042d = vq.j.a(c1792a2);
                    bVar.f210043e = jVarA;
                    bVar.f210044f = vq.j.a(bVar2);
                    bVar.f210045g = vq.j.a(aVar);
                    bVar.f210046h = aVar;
                    bVar.f210047j = vq.j.a(cVar);
                    bVar.f210048k = i17;
                    bVar.f210049l = i16;
                    bVar.f210050m = i15;
                    bVar.f210051n = i19;
                    bVar.f210052p = i18;
                    bVar.f210055s = 4;
                    objU = bVar9.s(bVar);
                    if (objU != objE) {
                        bVar4 = aVar;
                        right = (dx.i) objU;
                        if (!(right instanceof dx.i.Left)) {
                            if (right instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            StudentCardData studentCardData2 = (StudentCardData) ((dx.i.Right) right).b();
                            data = studentCardData2.getScope().getData();
                            pictureWithWatermark = data.getPictureWithWatermark();
                            if (pictureWithWatermark == null) {
                                pictureWithWatermark = data.getPicture();
                            }
                            if (pictureWithWatermark == null) {
                                pictureWithWatermark = Label.INSTANCE.c().getText();
                            }
                            right = new dx.i.Right(new UserDocumentData(pictureWithWatermark, studentCardData2.getScope().getData().getName(), studentCardData2.getScope().getData().getSecondName(), studentCardData2.getScope().getData().getSurname(), studentCardData2.getScope().getData().getPesel()));
                        }
                        return new dx.i.Right((UserDocumentData) bVar4.a(right));
                    }
                }
                return objE;
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
