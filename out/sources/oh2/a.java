package oh2;

import java.util.Locale;
import jx.f;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Loh2/a;", "Lkh2/a;", "Lnh2/a;", "dataSource", "<init>", "(Lnh2/a;)V", "Lgz/b$a$a;", "params", "Ljx/e;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lnh2/a;", "langswitch_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements kh2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nh2.a dataSource;

    /* JADX INFO: renamed from: oh2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3622a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f145888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f145889e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f145891g;

        C3622a(e<? super C3622a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145889e = obj;
            this.f145891g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(nh2.a aVar) {
        this.dataSource = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, e<? super jx.e> eVar) throws Throwable {
        C3622a c3622a;
        if (eVar instanceof C3622a) {
            c3622a = (C3622a) eVar;
            int i15 = c3622a.f145891g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3622a.f145891g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3622a = new C3622a(eVar);
            }
        } else {
            c3622a = new C3622a(eVar);
        }
        Object objA = c3622a.f145889e;
        Object objE = uq.b.e();
        int i16 = c3622a.f145891g;
        if (i16 == 0) {
            u.b(objA);
            nh2.a aVar = this.dataSource;
            c3622a.f145888d = j.a(c1792a);
            c3622a.f145891g = 1;
            objA = aVar.a(c3622a);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        String language = (String) objA;
        if (language == null) {
            language = Locale.getDefault().getLanguage();
        }
        return f.a(language);
    }
}
