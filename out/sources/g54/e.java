package g54;

import oq.k;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001d"}, d2 = {"Lg54/e;", "Lc54/b;", "Ly04/a;", "buildConfigRepository", "Lf54/b;", "featureFlagRepository", "Lh64/e;", "getFeatureFlagListUseCase", "<init>", "(Ly04/a;Lf54/b;Lh64/e;)V", "Lb54/c;", "params", "", "e", "(Lb54/c;)Ljava/lang/Boolean;", "a", "Lf54/b;", "b", "Lh64/e;", "c", "Loq/k;", "f", "()Z", "isAutomaticTest", "d", "j", "isSecurityAudit", "h", "isInstitution", "flags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements c54.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f54.b featureFlagRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h64.e getFeatureFlagListUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k isAutomaticTest;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k isSecurityAudit;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k isInstitution;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70823a;

        static {
            int[] iArr = new int[b54.c.values().length];
            try {
                iArr[b54.c.SECURE_WINDOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b54.c.SECURE_DIRECTORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b54.c.THREAT_DETECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b54.c.CERTIFICATE_TRANSPARENCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b54.c.HTTP_CLIENT_SSL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b54.c.WEB_VIEW_SSL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b54.c.WEB_VIEW_DEBUGGING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b54.c.NURSE_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f70823a = iArr;
        }
    }

    public e(final y04.a aVar, f54.b bVar, h64.e eVar) {
        this.featureFlagRepository = bVar;
        this.getFeatureFlagListUseCase = eVar;
        this.isAutomaticTest = l.a(new er.a() { // from class: g54.b
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(e.g(aVar));
            }
        });
        this.isSecurityAudit = l.a(new er.a() { // from class: g54.c
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(e.k(aVar));
            }
        });
        this.isInstitution = l.a(new er.a() { // from class: g54.d
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(e.i(aVar));
            }
        });
    }

    private final boolean f() {
        return ((Boolean) this.isAutomaticTest.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(y04.a aVar) {
        return aVar.getIsAutomaticTest();
    }

    private final boolean h() {
        return ((Boolean) this.isInstitution.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(y04.a aVar) {
        return aVar.getIsInstitution();
    }

    private final boolean j() {
        return ((Boolean) this.isSecurityAudit.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(y04.a aVar) {
        return aVar.getIsSecurityAudit();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v15 java.lang.Object, still in use, count: 2, list:
          (r1v15 java.lang.Object) from 0x0049: PHI (r1 I:??) = (r1v10 java.lang.Object), (r1v15 java.lang.Object) binds: [B:14:0x0048, B:69:0x0049] A[DONT_GENERATE, DONT_INLINE]
          (r1v15 java.lang.Object) from 0x003d: CHECK_CAST (iq0.u) (r1v15 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // gz.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean a(b54.c r6) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g54.e.a(b54.c):java.lang.Boolean");
    }
}
