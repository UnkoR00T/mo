package p14;

import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lp14/a;", "Lb14/a;", "Ln14/a;", "dataSource", "<init>", "(Ln14/a;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ln14/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b14.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n14.a dataSource;

    /* JADX INFO: renamed from: p14.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3731a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f151655e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f151657g;

        C3731a(e<? super C3731a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151655e = obj;
            this.f151657g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(n14.a aVar) {
        this.dataSource = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, e<? super i0> eVar) throws Throwable {
        C3731a c3731a;
        if (eVar instanceof C3731a) {
            c3731a = (C3731a) eVar;
            int i15 = c3731a.f151657g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3731a.f151657g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3731a = new C3731a(eVar);
            }
        } else {
            c3731a = new C3731a(eVar);
        }
        Object obj = c3731a.f151655e;
        Object objE = uq.b.e();
        int i16 = c3731a.f151657g;
        if (i16 == 0) {
            u.b(obj);
            n14.a aVar = this.dataSource;
            c3731a.f151654d = j.a(c1792a);
            c3731a.f151657g = 1;
            if (aVar.c(c3731a) == objE) {
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
