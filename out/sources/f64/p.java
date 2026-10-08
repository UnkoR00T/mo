package f64;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf64/p;", "Ls54/n;", "Le64/b;", "localNotificationsRepository", "<init>", "(Le64/b;)V", "Ls54/n$a;", "params", "Loq/i0;", "d", "(Ls54/n$a;Ltq/e;)Ljava/lang/Object;", "a", "Le64/b;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements s54.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e64.b localNotificationsRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59660a;

        static {
            int[] iArr = new int[r54.f.values().length];
            try {
                iArr[r54.f.CAR_INSURANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r54.f.TECHNICAL_EXAMINATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f59660a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f59661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f59662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f59663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f59664g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f59665h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f59666j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f59667k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f59668l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f59669m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f59670n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f59671p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f59673r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f59671p = obj;
            this.f59673r |= PKIFailureInfo.systemUnavail;
            return p.this.c(null, this);
        }
    }

    public p(e64.b bVar) {
        this.localNotificationsRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x0227  */
    /* JADX WARN: Code duplicated, block: B:64:0x023b  */
    /* JADX WARN: Code duplicated, block: B:69:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:0: B:62:0x0235->B:72:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        if (r1 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0221, code lost:
    
        if (r15.b(r5, r2) == r3) goto L66;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0221 -> B:60:0x0224). Please report as a decompilation issue!!! */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(s54.n.Params r25, tq.e<? super oq.i0> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f64.p.c(s54.n$a, tq.e):java.lang.Object");
    }
}
