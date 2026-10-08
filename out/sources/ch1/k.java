package ch1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lch1/k;", "", "Lgz/b$a$a;", "", "Lah1/a;", "Lch1/f0;", "isContactDetailsRegistryFeatureFlagActive", "Lc21/a;", "isChatBotFeatureFlagActive", "Lip3/a;", "isVoteIdeaFeatureFlagActive", "Lf01/a;", "isAppRatingFeatureFlagActive", "Lyg1/b;", "dashboardMobileInteractor", "Lq34/p1;", "loadCachedAddedDocumentsInfoUC", "Lch1/r;", "getDocumentCertificateExpiredUseCase", "Lyg1/a;", "dashboardContainersInteractor", "<init>", "(Lch1/f0;Lc21/a;Lip3/a;Lf01/a;Lyg1/b;Lq34/p1;Lch1/r;Lyg1/a;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lch1/f0;", "b", "Lc21/a;", "c", "Lip3/a;", "d", "Lf01/a;", "e", "Lyg1/b;", "f", "Lq34/p1;", "g", "Lch1/r;", "h", "Lyg1/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f0 isContactDetailsRegistryFeatureFlagActive;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c21.a isChatBotFeatureFlagActive;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ip3.a isVoteIdeaFeatureFlagActive;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f01.a isAppRatingFeatureFlagActive;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yg1.b dashboardMobileInteractor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p1 loadCachedAddedDocumentsInfoUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final r getDocumentCertificateExpiredUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final yg1.a dashboardContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26881a;

        static {
            int[] iArr = new int[ah1.a.b.values().length];
            try {
                iArr[ah1.a.b.HISTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ah1.a.b.CONTACT_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ah1.a.b.CHAT_BOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ah1.a.b.VOTE_IDEA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ah1.a.b.APP_RATING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ah1.a.b.REGISTERED_ADDRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ah1.a.b.NOTIFICATIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ah1.a.b.CERTIFICATES_ISSUED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ah1.a.b.PASSPORT_DETAILS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f26881a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f26882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f26883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f26884f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f26885g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f26886h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f26887j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f26888k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f26889l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f26890m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f26891n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f26892p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f26893q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f26894r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f26895s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f26896t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f26897v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f26898w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f26900y;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f26898w = obj;
            this.f26900y |= PKIFailureInfo.systemUnavail;
            return k.this.a(null, this);
        }
    }

    public k(f0 f0Var, c21.a aVar, ip3.a aVar2, f01.a aVar3, yg1.b bVar, p1 p1Var, r rVar, yg1.a aVar4) {
        this.isContactDetailsRegistryFeatureFlagActive = f0Var;
        this.isChatBotFeatureFlagActive = aVar;
        this.isVoteIdeaFeatureFlagActive = aVar2;
        this.isAppRatingFeatureFlagActive = aVar3;
        this.dashboardMobileInteractor = bVar;
        this.loadCachedAddedDocumentsInfoUC = p1Var;
        this.getDocumentCertificateExpiredUseCase = rVar;
        this.dashboardContainersInteractor = aVar4;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:103:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:111:0x0300  */
    /* JADX WARN: Code duplicated, block: B:115:0x0320 A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, TryCatch #7 {Exception -> 0x0054, blocks: (B:14:0x004f, B:62:0x022d, B:64:0x0233, B:68:0x024c, B:69:0x025f, B:71:0x0265, B:72:0x0275, B:113:0x0303, B:75:0x027c, B:76:0x028c, B:78:0x0292, B:79:0x02a0, B:82:0x02a9, B:90:0x02bc, B:91:0x02cc, B:93:0x02d2, B:94:0x02e0, B:114:0x0308, B:65:0x0242, B:67:0x0246, B:115:0x0320, B:116:0x0325, B:123:0x032f, B:126:0x033d, B:48:0x018d, B:44:0x010d), top: B:141:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0346  */
    /* JADX WARN: Code duplicated, block: B:132:0x0357  */
    /* JADX WARN: Code duplicated, block: B:133:0x0365  */
    /* JADX WARN: Code duplicated, block: B:135:0x0369  */
    /* JADX WARN: Code duplicated, block: B:138:0x0376  */
    /* JADX WARN: Code duplicated, block: B:149:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x01df  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0227  */
    /* JADX WARN: Code duplicated, block: B:64:0x0233 A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, TryCatch #7 {Exception -> 0x0054, blocks: (B:14:0x004f, B:62:0x022d, B:64:0x0233, B:68:0x024c, B:69:0x025f, B:71:0x0265, B:72:0x0275, B:113:0x0303, B:75:0x027c, B:76:0x028c, B:78:0x0292, B:79:0x02a0, B:82:0x02a9, B:90:0x02bc, B:91:0x02cc, B:93:0x02d2, B:94:0x02e0, B:114:0x0308, B:65:0x0242, B:67:0x0246, B:115:0x0320, B:116:0x0325, B:123:0x032f, B:126:0x033d, B:48:0x018d, B:44:0x010d), top: B:141:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0242 A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, TryCatch #7 {Exception -> 0x0054, blocks: (B:14:0x004f, B:62:0x022d, B:64:0x0233, B:68:0x024c, B:69:0x025f, B:71:0x0265, B:72:0x0275, B:113:0x0303, B:75:0x027c, B:76:0x028c, B:78:0x0292, B:79:0x02a0, B:82:0x02a9, B:90:0x02bc, B:91:0x02cc, B:93:0x02d2, B:94:0x02e0, B:114:0x0308, B:65:0x0242, B:67:0x0246, B:115:0x0320, B:116:0x0325, B:123:0x032f, B:126:0x033d, B:48:0x018d, B:44:0x010d), top: B:141:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0246 A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, TryCatch #7 {Exception -> 0x0054, blocks: (B:14:0x004f, B:62:0x022d, B:64:0x0233, B:68:0x024c, B:69:0x025f, B:71:0x0265, B:72:0x0275, B:113:0x0303, B:75:0x027c, B:76:0x028c, B:78:0x0292, B:79:0x02a0, B:82:0x02a9, B:90:0x02bc, B:91:0x02cc, B:93:0x02d2, B:94:0x02e0, B:114:0x0308, B:65:0x0242, B:67:0x0246, B:115:0x0320, B:116:0x0325, B:123:0x032f, B:126:0x033d, B:48:0x018d, B:44:0x010d), top: B:141:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0265 A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, TryCatch #7 {Exception -> 0x0054, blocks: (B:14:0x004f, B:62:0x022d, B:64:0x0233, B:68:0x024c, B:69:0x025f, B:71:0x0265, B:72:0x0275, B:113:0x0303, B:75:0x027c, B:76:0x028c, B:78:0x0292, B:79:0x02a0, B:82:0x02a9, B:90:0x02bc, B:91:0x02cc, B:93:0x02d2, B:94:0x02e0, B:114:0x0308, B:65:0x0242, B:67:0x0246, B:115:0x0320, B:116:0x0325, B:123:0x032f, B:126:0x033d, B:48:0x018d, B:44:0x010d), top: B:141:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0278 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:74:0x027a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x027c A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, TryCatch #7 {Exception -> 0x0054, blocks: (B:14:0x004f, B:62:0x022d, B:64:0x0233, B:68:0x024c, B:69:0x025f, B:71:0x0265, B:72:0x0275, B:113:0x0303, B:75:0x027c, B:76:0x028c, B:78:0x0292, B:79:0x02a0, B:82:0x02a9, B:90:0x02bc, B:91:0x02cc, B:93:0x02d2, B:94:0x02e0, B:114:0x0308, B:65:0x0242, B:67:0x0246, B:115:0x0320, B:116:0x0325, B:123:0x032f, B:126:0x033d, B:48:0x018d, B:44:0x010d), top: B:141:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0292 A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, LOOP:1: B:76:0x028c->B:78:0x0292, LOOP_END, TryCatch #7 {Exception -> 0x0054, blocks: (B:14:0x004f, B:62:0x022d, B:64:0x0233, B:68:0x024c, B:69:0x025f, B:71:0x0265, B:72:0x0275, B:113:0x0303, B:75:0x027c, B:76:0x028c, B:78:0x0292, B:79:0x02a0, B:82:0x02a9, B:90:0x02bc, B:91:0x02cc, B:93:0x02d2, B:94:0x02e0, B:114:0x0308, B:65:0x0242, B:67:0x0246, B:115:0x0320, B:116:0x0325, B:123:0x032f, B:126:0x033d, B:48:0x018d, B:44:0x010d), top: B:141:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a9 A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, TryCatch #7 {Exception -> 0x0054, blocks: (B:14:0x004f, B:62:0x022d, B:64:0x0233, B:68:0x024c, B:69:0x025f, B:71:0x0265, B:72:0x0275, B:113:0x0303, B:75:0x027c, B:76:0x028c, B:78:0x0292, B:79:0x02a0, B:82:0x02a9, B:90:0x02bc, B:91:0x02cc, B:93:0x02d2, B:94:0x02e0, B:114:0x0308, B:65:0x0242, B:67:0x0246, B:115:0x0320, B:116:0x0325, B:123:0x032f, B:126:0x033d, B:48:0x018d, B:44:0x010d), top: B:141:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x02b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e9  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends ah1.a>>> eVar) throws Throwable {
        b bVar;
        dx.j<dx.b> jVar;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j<dx.b> jVarA;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zB;
        boolean z15;
        boolean z16;
        ex.b bVar2;
        ex.b bVar3;
        Object obj;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z17;
        ex.b bVar4;
        gz.b.a.C1792a c1792a2;
        Object obj2;
        boolean z18;
        boolean z19;
        boolean z25;
        int i25;
        dx.j<dx.b> jVar2;
        List list;
        ex.b bVar5;
        int i26;
        int i27;
        boolean z26;
        boolean z27;
        boolean z28;
        List list2;
        dx.i iVar;
        Object objB2;
        boolean zBooleanValue3;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i28 = bVar.f26900y;
            if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f26900y = i28 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objD = bVar.f26898w;
        Object objE = uq.b.e();
        int i29 = bVar.f26900y;
        try {
            try {
                try {
                    if (i29 == 0) {
                        oq.u.b(objD);
                        jVarA = xw.c.f221622a.a();
                        ex.a aVar = new ex.a();
                        f0 f0Var = this.isContactDetailsRegistryFeatureFlagActive;
                        gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                        zBooleanValue = f0Var.b(c1792a3).booleanValue();
                        zBooleanValue2 = this.isChatBotFeatureFlagActive.a(c1792a3).booleanValue();
                        boolean zBooleanValue4 = this.isVoteIdeaFeatureFlagActive.a(c1792a3).booleanValue();
                        boolean zBooleanValue5 = this.isAppRatingFeatureFlagActive.a(c1792a3).booleanValue();
                        zB = this.dashboardMobileInteractor.b();
                        p1 p1Var = this.loadCachedAddedDocumentsInfoUC;
                        bVar.f26882d = vq.j.a(c1792a);
                        bVar.f26883e = jVarA;
                        bVar.f26884f = vq.j.a(aVar);
                        bVar.f26885g = vq.j.a(aVar);
                        bVar.f26887j = 0;
                        bVar.f26888k = 0;
                        bVar.f26889l = 0;
                        bVar.f26890m = 0;
                        bVar.f26891n = 0;
                        bVar.f26893q = zBooleanValue;
                        bVar.f26894r = zBooleanValue2;
                        bVar.f26895s = zBooleanValue4;
                        bVar.f26896t = zBooleanValue5;
                        bVar.f26897v = zB;
                        bVar.f26900y = 1;
                        Object objC = p1Var.c(c1792a3, bVar);
                        if (objC != objE) {
                            z15 = zBooleanValue4;
                            z16 = zBooleanValue5;
                            bVar2 = aVar;
                            bVar3 = bVar2;
                            obj = objC;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                        }
                        return objE;
                    }
                    if (i29 != 1) {
                        if (i29 == 2) {
                            z19 = bVar.f26897v;
                            z18 = bVar.f26896t;
                            z25 = bVar.f26895s;
                            boolean z29 = bVar.f26894r;
                            boolean z35 = bVar.f26893q;
                            int i35 = bVar.f26891n;
                            int i36 = bVar.f26890m;
                            int i37 = bVar.f26889l;
                            int i38 = bVar.f26888k;
                            i16 = bVar.f26887j;
                            List list3 = (List) bVar.f26886h;
                            bVar5 = (ex.b) bVar.f26885g;
                            ex.b bVar6 = (ex.b) bVar.f26884f;
                            dx.j<dx.b> jVar3 = (dx.j) bVar.f26883e;
                            gz.b.a.C1792a c1792a4 = (gz.b.a.C1792a) bVar.f26882d;
                            try {
                                oq.u.b(objD);
                                bVar4 = bVar6;
                                obj2 = objD;
                                list = list3;
                                zBooleanValue2 = z29;
                                z17 = z35;
                                c1792a2 = c1792a4;
                                i15 = i38;
                                i25 = i37;
                                i19 = i36;
                                i18 = i35;
                                jVar2 = jVar3;
                                if (obj2 != null) {
                                    i26 = 1;
                                } else {
                                    i26 = 0;
                                }
                                Object obj3 = objE;
                                ex.b bVar7 = bVar5;
                                try {
                                    yg1.a aVar2 = this.dashboardContainersInteractor;
                                    bVar.f26882d = vq.j.a(c1792a2);
                                    bVar.f26883e = jVar2;
                                    bVar.f26884f = vq.j.a(bVar4);
                                    bVar.f26885g = vq.j.a(bVar7);
                                    bVar.f26886h = list;
                                    bVar.f26887j = i16;
                                    bVar.f26888k = i15;
                                    bVar.f26889l = i25;
                                    bVar.f26890m = i19;
                                    bVar.f26891n = i18;
                                    bVar.f26893q = z17;
                                    bVar.f26894r = zBooleanValue2;
                                    bVar.f26895s = z25;
                                    bVar.f26896t = z18;
                                    bVar.f26897v = z19;
                                    bVar.f26892p = i26;
                                    bVar.f26900y = 3;
                                    objD = aVar2.d(bVar);
                                    objE = obj3;
                                    if (objD != objE) {
                                        i27 = i26;
                                        z26 = z18;
                                        z27 = z25;
                                        z28 = z17;
                                        list2 = list;
                                    }
                                    return objE;
                                } catch (ex.c e15) {
                                    e = e15;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    throw e16;
                                } catch (Exception e17) {
                                    e = e17;
                                    jVar = jVar2;
                                    px.f fVar = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar.d(message, e, px.c.a(jVar));
                                    iVarA = jVar.a(e);
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
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                jVar = jVar3;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(jVar));
                                iVarA = jVar.a(e);
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
                        }
                        if (i29 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i27 = bVar.f26892p;
                        z19 = bVar.f26897v;
                        z26 = bVar.f26896t;
                        z27 = bVar.f26895s;
                        zBooleanValue2 = bVar.f26894r;
                        z28 = bVar.f26893q;
                        list2 = (List) bVar.f26886h;
                        oq.u.b(objD);
                        iVar = (dx.i) objD;
                        if (iVar instanceof dx.i.Left) {
                            objB2 = vq.b.a(false);
                        } else {
                            if (iVar instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB2 = ((dx.i.Right) iVar).b();
                        }
                        zBooleanValue3 = ((Boolean) objB2).booleanValue();
                        wq.a<ah1.a.b> aVarE = ah1.a.b.e();
                        arrayList = new ArrayList();
                        for (ah1.a.b bVar8 : aVarE) {
                            switch (a.f26881a[bVar8.ordinal()]) {
                                case 1:
                                    if (zBooleanValue3) {
                                        bVar8 = null;
                                    }
                                    break;
                                case 2:
                                    if (z28) {
                                        bVar8 = null;
                                    }
                                    break;
                                case 3:
                                    if (zBooleanValue3 || !zBooleanValue2 || i27 != 0) {
                                        bVar8 = null;
                                    }
                                    break;
                                case 4:
                                    if (zBooleanValue3 || !z27) {
                                        bVar8 = null;
                                    }
                                    break;
                                case 5:
                                    if (zBooleanValue3 || !z26) {
                                        bVar8 = null;
                                    }
                                    break;
                                case 6:
                                    if (z19 || !zBooleanValue3) {
                                        bVar8 = null;
                                    } else {
                                        List list4 = list2;
                                        ArrayList arrayList3 = new ArrayList(pq.v.y(list4, 10));
                                        Iterator it4 = list4.iterator();
                                        while (it4.hasNext()) {
                                            arrayList3.add(((k34.g) it4.next()).getType());
                                        }
                                        if (!arrayList3.contains(rq0.b.d.ID_CARD)) {
                                            bVar8 = null;
                                        }
                                    }
                                    break;
                                case 7:
                                    if (zBooleanValue3) {
                                        bVar8 = null;
                                    }
                                    break;
                                case 8:
                                    if (!list2.isEmpty() || !zBooleanValue3) {
                                        bVar8 = null;
                                    }
                                    break;
                                case 9:
                                    if (zBooleanValue3) {
                                        List list5 = list2;
                                        arrayList2 = new ArrayList(pq.v.y(list5, 10));
                                        it = list5.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(((k34.g) it.next()).getType());
                                        }
                                        if (arrayList2.contains(rq0.b.d.ID_CARD)) {
                                            bVar8 = null;
                                        }
                                    } else {
                                        bVar8 = null;
                                    }
                                    break;
                            }
                            if (bVar8 != null) {
                                arrayList.add(bVar8);
                            }
                        }
                        return new dx.i.Right(pq.v.L0(pq.v.L0(arrayList, ah1.a.EnumC0131a.e()), ah1.a.c.e()));
                    }
                    obj = objD;
                    boolean z36 = bVar.f26897v;
                    z16 = bVar.f26896t;
                    boolean z37 = bVar.f26895s;
                    zBooleanValue2 = bVar.f26894r;
                    zBooleanValue = bVar.f26893q;
                    int i39 = bVar.f26891n;
                    int i45 = bVar.f26890m;
                    int i46 = bVar.f26889l;
                    int i47 = bVar.f26888k;
                    int i48 = bVar.f26887j;
                    ex.b bVar9 = (ex.b) bVar.f26885g;
                    bVar2 = (ex.b) bVar.f26884f;
                    dx.j<dx.b> jVar4 = (dx.j) bVar.f26883e;
                    gz.b.a.C1792a c1792a5 = (gz.b.a.C1792a) bVar.f26882d;
                    try {
                        oq.u.b(obj);
                        zB = z36;
                        c1792a = c1792a5;
                        i15 = i47;
                        i17 = i46;
                        jVarA = jVar4;
                        z15 = z37;
                        i16 = i48;
                        i18 = i39;
                        bVar3 = bVar9;
                        i19 = i45;
                    } catch (ex.c e26) {
                        e = e26;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e27) {
                        throw e27;
                    } catch (Exception e28) {
                        e = e28;
                        jVar = jVar4;
                        px.f fVar3 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar3.d(message, e, px.c.a(jVar));
                        iVarA = jVar.a(e);
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
                    z17 = zBooleanValue;
                    List list6 = (List) obj;
                    bVar4 = bVar2;
                    r rVar = this.getDocumentCertificateExpiredUseCase;
                    gz.b.a.C1792a c1792a6 = gz.b.a.C1792a.f78542a;
                    bVar.f26882d = vq.j.a(c1792a);
                    bVar.f26883e = jVarA;
                    bVar.f26884f = vq.j.a(bVar4);
                    bVar.f26885g = vq.j.a(bVar3);
                    bVar.f26886h = list6;
                    bVar.f26887j = i16;
                    bVar.f26888k = i15;
                    bVar.f26889l = i17;
                    bVar.f26890m = i19;
                    bVar.f26891n = i18;
                    bVar.f26893q = z17;
                    bVar.f26894r = zBooleanValue2;
                    bVar.f26895s = z15;
                    bVar.f26896t = z16;
                    bVar.f26897v = zB;
                    bVar.f26900y = 2;
                    Object objA = rVar.a(c1792a6, bVar);
                    objE = objE;
                    if (objA != objE) {
                        c1792a2 = c1792a;
                        obj2 = objA;
                        boolean z38 = z15;
                        z18 = z16;
                        z19 = zB;
                        z25 = z38;
                        i25 = i17;
                        jVar2 = jVarA;
                        list = list6;
                        bVar5 = bVar3;
                        if (obj2 != null) {
                            i26 = 1;
                        } else {
                            i26 = 0;
                        }
                        Object obj4 = objE;
                        ex.b bVar10 = bVar5;
                        yg1.a aVar3 = this.dashboardContainersInteractor;
                        bVar.f26882d = vq.j.a(c1792a2);
                        bVar.f26883e = jVar2;
                        bVar.f26884f = vq.j.a(bVar4);
                        bVar.f26885g = vq.j.a(bVar10);
                        bVar.f26886h = list;
                        bVar.f26887j = i16;
                        bVar.f26888k = i15;
                        bVar.f26889l = i25;
                        bVar.f26890m = i19;
                        bVar.f26891n = i18;
                        bVar.f26893q = z17;
                        bVar.f26894r = zBooleanValue2;
                        bVar.f26895s = z25;
                        bVar.f26896t = z18;
                        bVar.f26897v = z19;
                        bVar.f26892p = i26;
                        bVar.f26900y = 3;
                        objD = aVar3.d(bVar);
                        objE = obj4;
                        if (objD != objE) {
                            i27 = i26;
                            z26 = z18;
                            z27 = z25;
                            z28 = z17;
                            list2 = list;
                            iVar = (dx.i) objD;
                            if (iVar instanceof dx.i.Left) {
                                objB2 = vq.b.a(false);
                            } else {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB2 = ((dx.i.Right) iVar).b();
                            }
                            zBooleanValue3 = ((Boolean) objB2).booleanValue();
                            wq.a<ah1.a.b> aVarE2 = ah1.a.b.e();
                            arrayList = new ArrayList();
                            while (r1.hasNext()) {
                                switch (a.f26881a[bVar8.ordinal()]) {
                                    case 1:
                                        if (zBooleanValue3) {
                                            bVar8 = null;
                                        }
                                        break;
                                    case 2:
                                        if (z28) {
                                            bVar8 = null;
                                        }
                                        break;
                                    case 3:
                                        if (zBooleanValue3) {
                                            bVar8 = null;
                                        } else {
                                            bVar8 = null;
                                        }
                                        break;
                                    case 4:
                                        if (zBooleanValue3) {
                                            bVar8 = null;
                                        } else {
                                            bVar8 = null;
                                        }
                                        break;
                                    case 5:
                                        if (zBooleanValue3) {
                                            bVar8 = null;
                                        } else {
                                            bVar8 = null;
                                        }
                                        break;
                                    case 6:
                                        if (z19) {
                                            bVar8 = null;
                                        } else {
                                            bVar8 = null;
                                        }
                                        break;
                                    case 7:
                                        if (zBooleanValue3) {
                                            bVar8 = null;
                                        }
                                        break;
                                    case 8:
                                        if (!list2.isEmpty()) {
                                            bVar8 = null;
                                        } else {
                                            bVar8 = null;
                                        }
                                        break;
                                    case 9:
                                        if (zBooleanValue3) {
                                            List list7 = list2;
                                            arrayList2 = new ArrayList(pq.v.y(list7, 10));
                                            it = list7.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(((k34.g) it.next()).getType());
                                            }
                                            if (arrayList2.contains(rq0.b.d.ID_CARD)) {
                                                bVar8 = null;
                                            }
                                        } else {
                                            bVar8 = null;
                                        }
                                        break;
                                }
                                if (bVar8 != null) {
                                    arrayList.add(bVar8);
                                }
                            }
                            return new dx.i.Right(pq.v.L0(pq.v.L0(arrayList, ah1.a.EnumC0131a.e()), ah1.a.c.e()));
                        }
                    }
                    return objE;
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (ex.c e36) {
            e = e36;
        } catch (CancellationException e37) {
            throw e37;
        }
    }
}
