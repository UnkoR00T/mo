package kx3;

import fr.k;
import go0.y;
import k54.h;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkx3/b;", "", "Lgz/b$a$a;", "Li54/a;", "Lkx3/d;", "getCentralAccessTokenUC", "Lgo0/y;", "getOwnerAddressUC", "Lk54/h;", "saveElectronicDeliveryOwnerDataUC", "<init>", "(Lkx3/d;Lgo0/y;Lk54/h;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lkx3/d;", "b", "Lgo0/y;", "c", "Lk54/h;", "d", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f113047d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f113048e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final dx.b.Business f113049f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d getCentralAccessTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y getOwnerAddressUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h saveElectronicDeliveryOwnerDataUC;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkx3/b$a;", "", "<init>", "()V", "", "EDELIVERY_SERVICE_UNAUTHORIZED", "Ljava/lang/String;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: kx3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2739b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f113053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f113054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f113055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f113056g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f113057h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f113058j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f113060l;

        C2739b(tq.e<? super C2739b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f113058j = obj;
            this.f113060l |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    static {
        jx3.a aVar = jx3.a.REFRESH_TOKEN_EXPIRED;
        Label.Companion companion = Label.INSTANCE;
        f113049f = new dx.b.Business(aVar, null, companion.c(), null, null, companion.c(), null, 90, null);
    }

    public b(d dVar, y yVar, h hVar) {
        this.getCentralAccessTokenUC = dVar;
        this.getOwnerAddressUC = yVar;
        this.saveElectronicDeliveryOwnerDataUC = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r9 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r8, tq.e<? super dx.i<? extends dx.b, ? extends i54.a>> r9) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kx3.b.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
