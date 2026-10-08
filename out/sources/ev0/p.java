package ev0;

import cv0.BECountry;
import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lev0/p;", "Lev0/o;", "Ldv0/c;", "repository", "<init>", "(Ldv0/c;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "Lcv0/d;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ldv0/c;", "b", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f53797b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dv0.c repository;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lev0/p$a;", "", "<init>", "()V", "", "POLISH_LANGUAGE_TAG", "Ljava/lang/String;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f53799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f53800e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f53802g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f53800e = obj;
            this.f53802g |= PKIFailureInfo.systemUnavail;
            return p.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f53803a;

        public c(Comparator comparator) {
            this.f53803a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return this.f53803a.compare(((BECountry) t15).getName(), ((BECountry) t16).getName());
        }
    }

    public p(dv0.c cVar) {
        this.repository = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends List<BECountry>>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f53802g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f53802g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objA = bVar.f53800e;
        Object objE = uq.b.e();
        int i16 = bVar.f53802g;
        if (i16 == 0) {
            u.b(objA);
            dv0.c cVar = this.repository;
            bVar.f53799d = vq.j.a(c1792a);
            bVar.f53802g = 1;
            objA = cVar.a(bVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        dx.i iVar = (dx.i) objA;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(v.U0((List) ((dx.i.Right) iVar).b(), new c(Collator.getInstance(Locale.forLanguageTag("pl-PL")))));
    }
}
