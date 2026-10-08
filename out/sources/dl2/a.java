package dl2;

import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Ldl2/a;", "Lgz/b;", "Lgz/b$a$a;", "Loq/i0;", "Lcl2/a;", "myIkpPrefsRepository", "<init>", "(Lcl2/a;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lcl2/a;", "myikp_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<gz.b.a.C1792a, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cl2.a myIkpPrefsRepository;

    /* JADX INFO: renamed from: dl2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0966a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f43385e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f43387g;

        C0966a(e<? super C0966a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43385e = obj;
            this.f43387g |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    public a(cl2.a aVar) {
        this.myIkpPrefsRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, e<? super i0> eVar) throws Throwable {
        C0966a c0966a;
        if (eVar instanceof C0966a) {
            c0966a = (C0966a) eVar;
            int i15 = c0966a.f43387g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c0966a.f43387g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c0966a = new C0966a(eVar);
            }
        } else {
            c0966a = new C0966a(eVar);
        }
        Object obj = c0966a.f43385e;
        Object objE = uq.b.e();
        int i16 = c0966a.f43387g;
        if (i16 == 0) {
            u.b(obj);
            cl2.a aVar = this.myIkpPrefsRepository;
            c0966a.f43384d = j.a(c1792a);
            c0966a.f43387g = 1;
            if (aVar.a(c0966a) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return i0.f148189a;
    }
}
