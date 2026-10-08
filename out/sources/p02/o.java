package p02;

import eo0.CountryDictionary;
import eo0.OwTokens;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lp02/o;", "", "Lgz/b$a$a;", "", "Leo0/l;", "Ls02/b;", "getOwAccessTokenUseCase", "Lgo0/o;", "getCountriesDictionaryUC", "Lp02/f0;", "handleElectronicDeliveryErrorUC", "<init>", "(Ls02/b;Lgo0/o;Lp02/f0;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ls02/b;", "b", "Lgo0/o;", "c", "Lp02/f0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final go0.o getCountriesDictionaryUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0 handleElectronicDeliveryErrorUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151263g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151264h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f151265j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151266k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151267l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151268m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f151269n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f151271q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151269n = obj;
            this.f151271q |= PKIFailureInfo.systemUnavail;
            return o.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Leo0/i0$a;", "token", "Ldx/i;", "Ldx/b;", "", "Leo0/l;", "<anonymous>", "(Leo0/i0$a;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends CountryDictionary>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f151272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f151273f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OwTokens.Access access = (OwTokens.Access) this.f151273f;
            Object objE = uq.b.e();
            int i15 = this.f151272e;
            if (i15 == 0) {
                oq.u.b(obj);
                go0.o oVar = o.this.getCountriesDictionaryUC;
                go0.o.Params params = new go0.o.Params(access);
                this.f151273f = vq.j.a(access);
                this.f151272e = 1;
                obj = oVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right((List) ((dx.i.Right) iVar).b());
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, ? extends List<CountryDictionary>>> eVar) {
            return ((b) v(access, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = o.this.new b(eVar);
            bVar.f151273f = obj;
            return bVar;
        }
    }

    public o(s02.b bVar, go0.o oVar, f0 f0Var) {
        this.getOwAccessTokenUseCase = bVar;
        this.getCountriesDictionaryUC = oVar;
        this.handleElectronicDeliveryErrorUC = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0112  */
    /* JADX WARN: Code duplicated, block: B:41:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0108, code lost:
    
        if (r15 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r14, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<eo0.CountryDictionary>>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.o.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
