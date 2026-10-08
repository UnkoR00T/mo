package ng0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lng0/a;", "Leg0/a;", "Lmg0/a;", "certRepository", "Lmg0/b;", "docRepository", "Lkg0/a;", "notificationsInteractor", "<init>", "(Lmg0/a;Lmg0/b;Lkg0/a;)V", "Leg0/a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Leg0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmg0/a;", "b", "Lmg0/b;", "c", "Lkg0/a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements eg0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mg0.a certRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mg0.b docRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kg0.a notificationsInteractor;

    /* JADX INFO: renamed from: ng0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3354a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135938a;

        static {
            int[] iArr = new int[wf0.a.values().length];
            try {
                iArr[wf0.a.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wf0.a.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wf0.a.NOT_ACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f135938a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f135941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f135942g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f135943h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f135944j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f135946l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f135944j = obj;
            this.f135946l |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(mg0.a aVar, mg0.b bVar, kg0.a aVar2) {
        this.certRepository = aVar;
        this.docRepository = bVar;
        this.notificationsInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
    
        if (r9 == r1) goto L50;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(eg0.a.Params r8, tq.e<? super dx.i<? extends dx.b, oq.i0>> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ng0.a.c(eg0.a$a, tq.e):java.lang.Object");
    }
}
