package u34;

import oq.i0;
import oq.k;
import oq.l;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lu34/g;", "Lp34/b;", "Lcz/c;", "storageFactory", "<init>", "(Lcz/c;)V", "", "tag", "", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "lastUpdate", "Loq/i0;", "a", "(JLjava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lcz/b;", "Loq/k;", "d", "()Lcz/b;", "storage", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements p34.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k storage;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f195178e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195180g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195178e = obj;
            this.f195180g |= PKIFailureInfo.systemUnavail;
            return g.this.b(null, this);
        }
    }

    public g(final cz.c cVar) {
        this.storage = l.a(new er.a() { // from class: u34.f
            @Override // er.a
            public final Object a() {
                return g.e(cVar);
            }
        });
    }

    private final cz.b d() {
        return (cz.b) this.storage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b e(cz.c cVar) {
        return cVar.a("shared_prefs_update_document_with_timer", cz.d.PLAIN);
    }

    @Override // p34.b
    public Object a(long j15, String str, tq.e<? super i0> eVar) {
        Object objM = d().m(cz.b.a.b("SHARED_PREFERENCES_LAST_UPDATE_" + str), j15, eVar);
        return objM == uq.b.e() ? objM : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p34.b
    public Object b(String str, tq.e<? super Long> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f195180g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f195180g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objF = bVar.f195178e;
        Object objE = uq.b.e();
        int i16 = bVar.f195180g;
        if (i16 == 0) {
            u.b(objF);
            cz.b bVarD = d();
            String strB = cz.b.a.b("SHARED_PREFERENCES_LAST_UPDATE_" + str);
            bVar.f195177d = j.a(str);
            bVar.f195180g = 1;
            objF = bVarD.f(strB, -1L, bVar);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objF);
        }
        return vq.b.f(((Number) objF).longValue());
    }
}
