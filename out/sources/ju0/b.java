package ju0;

import du0.Article;
import du0.ArticleSummary;
import dx.i;
import er.l;
import ge4.x;
import iu0.ArticleDto;
import iu0.ArticleSummaryDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lju0/b;", "Llu0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "articleId", "Ldx/i;", "Ldx/b;", "Ldu0/a;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "pageNumber", "", "Ldu0/e;", "b", "(ILtq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lgu0/a;", "Loq/k;", "f", "()Lgu0/a;", "client", "securityincidentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements lu0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f105803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f105804e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f105806g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f105804e = obj;
            this.f105806g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: ju0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Liu0/a;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C2506b extends vq.k implements l<tq.e<? super x<ArticleDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105807e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f105809g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2506b(String str, tq.e<? super C2506b> eVar) {
            super(1, eVar);
            this.f105809g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105807e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            gu0.a aVarF = b.this.f();
            String str = this.f105809g;
            this.f105807e = 1;
            Object objA = aVarF.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C2506b(this.f105809g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ArticleDto>> eVar) {
            return ((C2506b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f105810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f105811e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f105813g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f105811e = obj;
            this.f105813g |= PKIFailureInfo.systemUnavail;
            return b.this.b(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Liu0/e;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<tq.e<? super x<List<? extends ArticleSummaryDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105814e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f105816g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i15, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f105816g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105814e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            gu0.a aVarF = b.this.f();
            Integer numE = vq.b.e(this.f105816g);
            this.f105814e = 1;
            Object objB = aVarF.b(numE, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new d(this.f105816g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<List<ArticleSummaryDto>>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: ju0.a
            @Override // er.a
            public final Object a() {
                return b.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gu0.a e(w wVar) {
        return (gu0.a) w.b(wVar, null, gu0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gu0.a f() {
        return (gu0.a) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lu0.a
    public Object a(String str, tq.e<? super i<? extends dx.b, Article>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f105806g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f105806g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f105804e;
        Object objE = uq.b.e();
        int i16 = aVar.f105806g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C2506b c2506b = new C2506b(str, null);
            aVar.f105803d = j.a(str);
            aVar.f105806g = 1;
            objB = g0Var.b(c2506b, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return new i.Left((dx.b) ((i.Left) iVar).b());
        }
        if (iVar instanceof i.Right) {
            return new i.Right(hu0.a.a((ArticleDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lu0.a
    public Object b(int i15, tq.e<? super i<? extends dx.b, ? extends List<ArticleSummary>>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i16 = cVar.f105813g;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f105813g = i16 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f105811e;
        Object objE = uq.b.e();
        int i17 = cVar.f105813g;
        if (i17 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(i15, null);
            cVar.f105810d = i15;
            cVar.f105813g = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return new i.Left((dx.b) ((i.Left) iVar).b());
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List list = (List) ((i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(hu0.a.e((ArticleSummaryDto) it.next()));
        }
        return new i.Right(arrayList);
    }
}
