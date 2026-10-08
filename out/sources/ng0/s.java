package ng0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lng0/s;", "Leg0/p;", "Lmg0/a;", "repository", "<init>", "(Lmg0/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lmg0/a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements eg0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mg0.a repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f136095a;

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
            f136095a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f136096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f136097e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f136099g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f136097e = obj;
            this.f136099g |= PKIFailureInfo.systemUnavail;
            return s.this.c(null, this);
        }
    }

    public s(mg0.a aVar) {
        this.repository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f136099g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f136099g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objD = bVar.f136097e;
        Object objE = uq.b.e();
        int i16 = bVar.f136099g;
        boolean z15 = true;
        if (i16 == 0) {
            oq.u.b(objD);
            mg0.a aVar = this.repository;
            bVar.f136096d = vq.j.a(c1792a);
            bVar.f136099g = 1;
            objD = aVar.d(bVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objD);
        }
        dx.i iVar = (dx.i) objD;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        int i17 = a.f136095a[((wf0.a) ((dx.i.Right) iVar).b()).ordinal()];
        if (i17 != 1) {
            z15 = false;
            if (i17 != 2 && i17 != 3) {
                throw new oq.p();
            }
        }
        return new dx.i.Right(vq.b.a(z15));
    }
}
