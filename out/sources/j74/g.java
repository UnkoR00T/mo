package j74;

import dx.i;
import er.p;
import iy.c0;
import iy.l;
import iy.o;
import ju.p0;
import my.JWSHeaderData;
import my.JWSPayloadData;
import my.JWSTokenStructure;
import oq.i0;
import oq.u;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lj74/g;", "Ld74/e;", "Liy/l;", CMSAttributeTableGenerator.DIGEST, "Lxw/d;", "dispatcherProvider", "Lly/b;", "Lmy/a;", "jwsHeaderFactory", "Lmy/c;", "jwsPayloadFactory", "<init>", "(Liy/l;Lxw/d;Lly/b;Lly/b;)V", "Ld74/e$a;", "params", "Ldx/i;", "Ldx/b;", "Lmy/f;", "g", "(Ld74/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/l;", "b", "Lxw/d;", "c", "Lly/b;", "d", "wk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements d74.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l digest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ly.b<JWSHeaderData> jwsHeaderFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ly.b<JWSPayloadData> jwsPayloadFactory;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lmy/f;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, tq.e<? super i<? extends dx.b, ? extends JWSTokenStructure>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f100001f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d74.e.Params f100003h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d74.e.Params params, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f100003h = params;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0081 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0082  */
        /* JADX WARN: Code duplicated, block: B:22:0x0086  */
        /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String str;
            String str2;
            i<dx.b, byte[]> iVarB;
            Object objE = uq.b.e();
            int i15 = this.f100001f;
            if (i15 == 0) {
                u.b(obj);
                ly.b bVar = g.this.jwsHeaderFactory;
                JWSHeaderData jwsHeaderData = this.f100003h.getJwsHeaderData();
                this.f100001f = 1;
                obj = bVar.a(jwsHeaderData, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f100000e;
                u.b(obj);
            }
            str2 = str + '.' + ((String) obj);
            iVarB = g.this.digest.b(str2.getBytes(fu.d.UTF_8), o.SHA_384);
            if (iVarB instanceof i.Left) {
                return iVarB;
            }
            if (iVarB instanceof i.Right) {
                throw new oq.p();
            }
            return new i.Right(new JWSTokenStructure(c0.g(str2), JWSTokenStructure.a.b(c0.g(fu.f.j((byte[]) ((i.Right) iVarB).b(), null, 1, null))), null));
            String str3 = (String) obj;
            ly.b bVar2 = g.this.jwsPayloadFactory;
            JWSPayloadData jwsPayloadData = this.f100003h.getJwsPayloadData();
            this.f100000e = str3;
            this.f100001f = 2;
            Object objA = bVar2.a(jwsPayloadData, this);
            if (objA != objE) {
                str = str3;
                obj = objA;
                str2 = str + '.' + ((String) obj);
                iVarB = g.this.digest.b(str2.getBytes(fu.d.UTF_8), o.SHA_384);
                if (iVarB instanceof i.Left) {
                    return iVarB;
                }
                if (iVarB instanceof i.Right) {
                    throw new oq.p();
                }
                return new i.Right(new JWSTokenStructure(c0.g(str2), JWSTokenStructure.a.b(c0.g(fu.f.j((byte[]) ((i.Right) iVarB).b(), null, 1, null))), null));
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i<? extends dx.b, JWSTokenStructure>> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return g.this.new a(this.f100003h, eVar);
        }
    }

    public g(l lVar, xw.d dVar, ly.b<JWSHeaderData> bVar, ly.b<JWSPayloadData> bVar2) {
        this.digest = lVar;
        this.dispatcherProvider = dVar;
        this.jwsHeaderFactory = bVar;
        this.jwsPayloadFactory = bVar2;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(d74.e.Params params, tq.e<? super i<? extends dx.b, JWSTokenStructure>> eVar) {
        return this.dispatcherProvider.d(new a(params, null), eVar);
    }
}
